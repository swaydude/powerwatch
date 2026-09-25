package powerwatch.matrix.com.pwgen2android.ota;

/* JADX INFO: loaded from: classes2.dex */
public class AmOtaService {
    public static final java.lang.String CMD_RESPONSE_TIMEOUT = "command_response_timeout";
    public static final java.lang.String RESET_CMD_FAILED = "reset_command_failed";
    public static final java.lang.String SEND_HEADER_FAILED = "send_header_failed";
    public static final java.lang.String SEND_PKT_FAILED = "command_send_failed";
    private static final java.lang.String TAG = "AmOtaService";
    private static boolean mPauseOta = false;
    private java.lang.String deviceId;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private powerwatch.matrix.com.pwgen2android.ota.AmotaCallback mAmotaCallback;
    private int mFileOffset;
    private int mFileSize;
    private powerwatch.matrix.com.pwgen2android.ota.OTACommunicator otaCommunicator;
    private java.util.concurrent.Semaphore cmdResponseSemaphore = null;
    private int AMOTA_FW_PACKET_SIZE = 512;
    private final int MAXIMUM_APP_PAYLOAD = 20;
    private final int AMOTA_LENGTH_SIZE_IN_PKT = 2;
    private final int AMOTA_CMD_SIZE_IN_PKT = 1;
    private final int AMOTA_CRC_SIZE_IN_PKT = 4;
    private final int AMOTA_HEADER_SIZE_IN_PKT = 3;
    private boolean mStopOta = false;

    public java.lang.String formatHex2String(byte[] data) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(data.length);
        for (byte b : data) {
            sb.append(java.lang.String.format("%02X ", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private boolean waitCmdResponse(long timeoutMs) {
        try {
            return this.cmdResponseSemaphore.tryAcquire(timeoutMs, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void cmdResponseArrived() {
        this.cmdResponseSemaphore.release();
    }

    /* JADX INFO: renamed from: powerwatch.matrix.com.pwgen2android.ota.AmOtaService$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.values().length];
            $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand = iArr;
            try {
                iArr[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_HEADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_DATA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_VERIFY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_RESET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private byte amOtaCmd2Byte(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand cmd) {
        int i = powerwatch.matrix.com.pwgen2android.ota.AmOtaService.AnonymousClass4.$SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[cmd.ordinal()];
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i != 4) {
            return i != 5 ? (byte) 0 : (byte) 4;
        }
        return (byte) 3;
    }

    private powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand amOtaByte2Cmd(int cmd) {
        int i = cmd & 255;
        if (i == 1) {
            return powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_HEADER;
        }
        if (i == 2) {
            return powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_DATA;
        }
        if (i == 3) {
            return powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_VERIFY;
        }
        if (i == 4) {
            return powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_RESET;
        }
        return powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_UNKNOWN;
    }

    private boolean sendOneFrame(byte[] data) throws java.lang.InterruptedException {
        if (this.mStopOta) {
            android.util.Log.i(TAG, "OTA stopped due to application control");
        }
        this.otaCommunicator.sendMessage(this.deviceId, data);
        return true;
    }

    private boolean sendFwHeader(java.io.InputStream mFsInput) throws java.io.IOException {
        byte[] bArr = new byte[48];
        if (mFsInput.read(bArr) < 48) {
            android.util.Log.w(TAG, "invalid packed firmware length");
            return false;
        }
        this.mFileSize = ((bArr[11] & kotlin.UByte.MAX_VALUE) << 24) + ((bArr[10] & kotlin.UByte.MAX_VALUE) << 16) + ((bArr[9] & kotlin.UByte.MAX_VALUE) << 8) + (bArr[8] & kotlin.UByte.MAX_VALUE);
        java.lang.String str = TAG;
        android.util.Log.i(str, "mFileSize = " + this.mFileSize);
        android.util.Log.i(str, "send fw header " + formatHex2String(bArr));
        return sendOtaCmd(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_HEADER, bArr, 48) && waitCmdResponse(16000L);
    }

    private int sentFwDataPacket(java.io.InputStream mFsInput) throws java.io.IOException {
        int i = this.AMOTA_FW_PACKET_SIZE;
        byte[] bArr = new byte[i];
        int i2 = mFsInput.read(bArr);
        if (i2 <= 0) {
            android.util.Log.w(TAG, "no data read from mFsInput");
            return -1;
        }
        if (i2 < this.AMOTA_FW_PACKET_SIZE) {
            i = i2;
        }
        if (sendOtaCmd(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_DATA, bArr, i)) {
            return i2;
        }
        android.util.Log.e(TAG, "send fw data error");
        return -1;
    }

    public void pauseOta() {
        mPauseOta = true;
    }

    public void resumeOta(powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback) {
        this.mAmotaCallback = amotaCallback;
        mPauseOta = false;
    }

    private boolean sendFwData(java.io.InputStream mFsInput) {
        int i = this.mFileSize;
        int i2 = this.mFileOffset;
        android.util.Log.d(TAG, "file size = " + this.mFileSize);
        int iSentFwDataPacket = -1;
        while (i2 < i) {
            try {
                iSentFwDataPacket = sentFwDataPacket(mFsInput);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (iSentFwDataPacket < 0) {
                android.util.Log.e(TAG, "sentFwDataPacket failed");
                return false;
            }
            if (!waitCmdResponse(8000L)) {
                android.util.Log.e(TAG, "waitCmdResponse timeout");
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback = this.mAmotaCallback;
                if (amotaCallback != null) {
                    amotaCallback.otaFailed(CMD_RESPONSE_TIMEOUT);
                }
                return false;
            }
            i2 += iSentFwDataPacket;
            powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback2 = this.mAmotaCallback;
            if (amotaCallback2 != null) {
                amotaCallback2.progressUpdate((i2 * 100) / i);
            }
            while (mPauseOta && !this.mStopOta) {
            }
            if (this.mStopOta) {
                return false;
            }
        }
        android.util.Log.i(TAG, "send firmware data complete");
        return true;
    }

    private boolean sendVerifyCmd() {
        android.util.Log.i(TAG, "send fw verify cmd");
        if (sendOtaCmd(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_VERIFY, null, 0)) {
            return waitCmdResponse(5000L);
        }
        return false;
    }

    private boolean sendResetCmd() {
        android.util.Log.i(TAG, "send fw reset cmd");
        if (sendOtaCmd(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_FW_RESET, null, 0)) {
            return waitCmdResponse(14000L);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOtaUpdate(java.io.InputStream mFsInput) {
        try {
            int iAvailable = mFsInput.available();
            this.mFileSize = iAvailable;
            if (iAvailable == 0) {
                mFsInput.close();
                android.util.Log.w(TAG, "open file error, file size = " + this.mFileSize);
                return;
            }
            if (!sendFwHeader(mFsInput)) {
                android.util.Log.e(TAG, "send FW header failed");
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback = this.mAmotaCallback;
                if (amotaCallback != null) {
                    amotaCallback.otaFailed(SEND_HEADER_FAILED);
                }
                mFsInput.close();
                return;
            }
            if (this.mFileOffset > 0) {
                android.util.Log.i(TAG, "set file offset " + this.mFileOffset);
                mFsInput.skip((long) this.mFileOffset);
            }
            if (!sendFwData(mFsInput)) {
                android.util.Log.e(TAG, "send FW Data failed");
                mFsInput.close();
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback2 = this.mAmotaCallback;
                if (amotaCallback2 != null) {
                    amotaCallback2.sendFwDataState(false);
                    return;
                }
                return;
            }
            powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback3 = this.mAmotaCallback;
            if (amotaCallback3 != null) {
                amotaCallback3.sendFwDataState(true);
            }
            if (!sendVerifyCmd()) {
                android.util.Log.e(TAG, "send FW verify cmd failed");
                mFsInput.close();
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback4 = this.mAmotaCallback;
                if (amotaCallback4 != null) {
                    amotaCallback4.sendVerifyState(false);
                    return;
                }
                return;
            }
            powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback5 = this.mAmotaCallback;
            if (amotaCallback5 != null) {
                amotaCallback5.sendVerifyState(true);
            }
            if (sendResetCmd()) {
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback6 = this.mAmotaCallback;
                if (amotaCallback6 != null) {
                    amotaCallback6.otaSuccess();
                }
            } else {
                powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback7 = this.mAmotaCallback;
                if (amotaCallback7 != null) {
                    amotaCallback7.otaFailed(RESET_CMD_FAILED);
                }
            }
            mFsInput.close();
            android.util.Log.i(TAG, "exit startOtaUpdate");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private java.lang.String getStatusString(byte[] response) {
        if (response.length < 3) {
            return "";
        }
        int i = java.lang.Integer.parseInt(java.lang.String.valueOf((int) response[3]));
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_SUCCESS.ordinal()) {
            return "AMOTA_STATUS_SUCCESS";
        }
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_CRC_ERROR.ordinal()) {
            return "AMOTA_STATUS_CRC_ERROR";
        }
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_INVALID_HEADER_INFO.ordinal()) {
            return "AMOTA_STATUS_INVALID_HEADER_INFO";
        }
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_INVALID_PKT_LENGTH.ordinal()) {
            return "AMOTA_STATUS_INVALID_PKT_LENGTH";
        }
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_INSUFFICIENT_BUFFER.ordinal()) {
            return "AMOTA_STATUS_INSUFFICIENT_BUFFER";
        }
        if (i == powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_UNKNOWN_ERROR.ordinal()) {
        }
        return "AMOTA_STATUS_UNKNOWN_ERROR";
    }

    public void otaCmdResponse(byte[] response) {
        powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand eamotacommandAmOtaByte2Cmd = amOtaByte2Cmd(response[2] & kotlin.UByte.MAX_VALUE);
        if (eamotacommandAmOtaByte2Cmd == powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand.AMOTA_CMD_UNKNOWN) {
            android.util.Log.e(TAG, "got unknown response" + formatHex2String(response));
            return;
        }
        if ((response[3] & kotlin.UByte.MAX_VALUE) != 0) {
            java.lang.String str = TAG;
            android.util.Log.e(str, "error occurred, response = " + formatHex2String(response));
            android.util.Log.e(str, "status : " + getStatusString(response));
            return;
        }
        int i = powerwatch.matrix.com.pwgen2android.ota.AmOtaService.AnonymousClass4.$SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand[eamotacommandAmOtaByte2Cmd.ordinal()];
        if (i == 2) {
            this.mFileOffset = (response[4] & kotlin.UByte.MAX_VALUE) + ((response[5] & kotlin.UByte.MAX_VALUE) << 8) + ((response[6] & kotlin.UByte.MAX_VALUE) << 16) + ((response[7] & kotlin.UByte.MAX_VALUE) << 24);
            android.util.Log.i(TAG, "get AMOTA_CMD_FW_HEADER response, mFileOffset = " + this.mFileOffset);
            cmdResponseArrived();
            return;
        }
        if (i == 3) {
            android.util.Log.i(TAG, "get AMOTA_CMD_FW_DATA response");
            cmdResponseArrived();
        } else if (i == 4) {
            android.util.Log.i(TAG, "get AMOTA_CMD_FW_VERIFY response");
            cmdResponseArrived();
        } else if (i == 5) {
            android.util.Log.i(TAG, "get AMOTA_CMD_FW_RESET response");
            cmdResponseArrived();
        } else {
            android.util.Log.i(TAG, "get response from unknown command");
        }
    }

    public powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus amOtaStart(final java.io.InputStream inputStream, powerwatch.matrix.com.pwgen2android.ota.OTACommunicator otaCommunicator, powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback, java.lang.String deviceId) {
        this.deviceId = deviceId;
        this.otaCommunicator = otaCommunicator;
        this.mStopOta = false;
        mPauseOta = false;
        this.mAmotaCallback = amotaCallback;
        this.cmdResponseSemaphore = new java.util.concurrent.Semaphore(0);
        this.mFileOffset = 0;
        new java.lang.Thread(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.ota.AmOtaService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.Thread.sleep(2000L);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
                powerwatch.matrix.com.pwgen2android.ota.AmOtaService.this.startOtaUpdate(inputStream);
            }
        }).start();
        return powerwatch.matrix.com.pwgen2android.ota.eAmotaStatus.AMOTA_STATUS_SUCCESS;
    }

    private io.reactivex.disposables.CompositeDisposable getDisposable() {
        if (this.disposable == null) {
            this.disposable = new io.reactivex.disposables.CompositeDisposable();
        }
        return this.disposable;
    }

    public void dispose() {
        getDisposable().clear();
    }

    public void registerToOTA(powerwatch.matrix.com.pwgen2android.ota.OTACommunicator otaCommunicator) {
        getDisposable().add(otaCommunicator.receivedData().subscribe(new io.reactivex.functions.Consumer<byte[]>() { // from class: powerwatch.matrix.com.pwgen2android.ota.AmOtaService.2
            @Override // io.reactivex.functions.Consumer
            public void accept(byte[] bytes) throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.ota.AmOtaService.this.otaCmdResponse(bytes);
            }
        }, new io.reactivex.functions.Consumer<java.lang.Throwable>() { // from class: powerwatch.matrix.com.pwgen2android.ota.AmOtaService.3
            @Override // io.reactivex.functions.Consumer
            public void accept(java.lang.Throwable throwable) throws java.lang.Exception {
                throwable.printStackTrace();
            }
        }));
    }

    public void amOtaStop() {
        this.mStopOta = true;
        this.mAmotaCallback = null;
        this.cmdResponseSemaphore.tryAcquire();
        this.cmdResponseSemaphore.release();
    }

    private boolean sendPacket(byte[] data, int len) {
        int i = 0;
        while (i < len) {
            int i2 = len - i;
            if (i2 > 20) {
                i2 = 20;
            }
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(data, i, bArr, 0, i2);
            try {
                if (!sendOneFrame(bArr)) {
                    return false;
                }
                i += i2;
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    private boolean sendOtaCmd(powerwatch.matrix.com.pwgen2android.ota.eAmotaCommand cmd, byte[] data, int len) {
        int iCalcCrc32;
        byte bAmOtaCmd2Byte = amOtaCmd2Byte(cmd);
        int i = len + 3;
        int i2 = i + 4;
        byte[] bArr = new byte[i2];
        int i3 = len + 4;
        bArr[0] = (byte) i3;
        bArr[1] = (byte) (i3 >> 8);
        bArr[2] = bAmOtaCmd2Byte;
        if (len != 0) {
            iCalcCrc32 = powerwatch.matrix.com.pwgen2android.ota.CrcCalculator.calcCrc32(len, data);
            java.lang.System.arraycopy(data, 0, bArr, 3, len);
        } else {
            iCalcCrc32 = 0;
        }
        bArr[i] = (byte) iCalcCrc32;
        bArr[i + 1] = (byte) (iCalcCrc32 >> 8);
        bArr[i + 2] = (byte) (iCalcCrc32 >> 16);
        bArr[i + 3] = (byte) (iCalcCrc32 >> 24);
        if (sendPacket(bArr, i2)) {
            return true;
        }
        android.util.Log.e(TAG, "sendPacket failed");
        powerwatch.matrix.com.pwgen2android.ota.AmotaCallback amotaCallback = this.mAmotaCallback;
        if (amotaCallback != null) {
            amotaCallback.otaFailed(SEND_PKT_FAILED);
        }
        return false;
    }
}
