package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V", "ACTIVITY_PROCESS_TAG", "", "extractProgress", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "getSendingData", "", "isActivitySyncEnd", "", "data", "isLogCountResponse", "dataToParse", "isMemoryWriteCommand", "isRunningSyncEnd", "isStartSyncOrEndCommand", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "isSyncEndCommand", "parseReceivedData", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityLogCommand implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
    private final java.lang.String ACTIVITY_PROCESS_TAG;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;

    public ActivityLogCommand(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        this.ACTIVITY_PROCESS_TAG = simpleName;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getCommandType(this);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public java.lang.String printCommandId() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.printCommandId(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public byte[] getSendingData() {
        return new byte[]{-127, 15, 0, -127, 16};
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        if (dataInfo.getActivityLogs().isEmpty()) {
            return 1.0f;
        }
        if (dataInfo.getParsingFinished()) {
            return 0.0f;
        }
        return 1.0f / dataInfo.getDataToProcess();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        java.util.List listSplit$default;
        int iIndexOf;
        int i;
        int iIntValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Processing log: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(dataToParse, false, 1, null)), this.ACTIVITY_PROCESS_TAG);
        if (isActivitySyncEnd(dataToParse)) {
            this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Detected activity sync end, data count: ", java.lang.Integer.valueOf(dataInfo.getActivityLogs().size())), this.ACTIVITY_PROCESS_TAG);
            this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Accumulated data :", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.CommandsKt.logLogs(dataInfo)), this.ACTIVITY_PROCESS_TAG);
            return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : true, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 300000L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
        }
        if (isLogCountResponse(dataToParse) && (iIndexOf = (listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)).indexOf("#QT:T")) != -1 && (i = iIndexOf + 3) < listSplit$default.size() && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) listSplit$default.get(i), (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull((java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(i), new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null).get(0));
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue() / 8;
                dataInfo.setDataToProcess(iIntValue);
            } else {
                iIntValue = 0;
            }
            this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Expected sum: ", java.lang.Integer.valueOf(iIntValue)), this.ACTIVITY_PROCESS_TAG);
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
        }
        boolean zIsMemoryWriteCommand = isMemoryWriteCommand(dataToParse);
        boolean z = !isStartSyncOrEndCommand(dataToParse);
        if (zIsMemoryWriteCommand && z) {
            int i2 = dataToParse[4];
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(dataToParse, 5, bArr, 0, i2);
            for (int i3 = 0; i3 < i2; i3 += 8) {
                byte b = (byte) ((bArr[i3] & kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE) >> 7);
                int i4 = (bArr[i3] >> 4) & 7;
                this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Parsing activity log, log type is: ", java.lang.Byte.valueOf(b)), this.ACTIVITY_PROCESS_TAG);
                if (b == 1) {
                    byte[] bArr2 = new byte[8];
                    java.lang.System.arraycopy(bArr, i3, bArr2, 0, 8);
                    java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
                    byteBufferAllocate.put(bArr2);
                    byteBufferAllocate.flip();
                    long j = byteBufferAllocate.getLong();
                    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry(false, 0L, i4, (int) (j & 255), (int) ((j >> 8) & 255), 0, 0, (int) ((j >> 16) & 4095), (j >> 51) & 1023, (j >> 40) & 2047, (j >> 28) & 4095, null, 2114, null);
                    this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Parsing activity log : ", watchLogEntry), this.ACTIVITY_PROCESS_TAG);
                    dataInfo.getActivityLogs().add(watchLogEntry);
                } else {
                    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry2 = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry(true, 0L, i4, (byte) (bArr[i3 + 2] & (-1)), (byte) (bArr[i3 + 3] & (-1)), 0, 0, (byte) (bArr[i3 + 1] & (-1)), 0L, 0L, 0L, null, 3906, null);
                    this.logger.debug(kotlin.jvm.internal.Intrinsics.stringPlus("Parsing sleep log : ", watchLogEntry2), this.ACTIVITY_PROCESS_TAG);
                    dataInfo.getActivityLogs().add(watchLogEntry2);
                }
            }
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
            dataInfo.setActivityLogInterval(300000L);
            return dataInfo;
        }
        return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 300000L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
    }

    private final boolean isLogCountResponse(byte[] dataToParse) {
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8), (java.lang.CharSequence) "upload log", true);
    }

    private final boolean isMemoryWriteCommand(byte[] dataToParse) {
        return ((dataToParse.length == 0) ^ true) && ((byte) (dataToParse[0] & (-1))) == -112;
    }

    private final boolean isStartSyncOrEndCommand(byte[] content) {
        if (content.length < 3) {
            return false;
        }
        return ((content[3] | (content[2] << 8)) & 255) == 248;
    }

    private final boolean isSyncEndCommand(byte[] data) {
        if (data.length >= 10 && isMemoryWriteCommand(data) && isStartSyncOrEndCommand(data) && ((byte) (data[4] & (-1))) == 8) {
            return (data[5] | (data[6] << 8)) == 1;
        }
        return false;
    }

    private final boolean isActivitySyncEnd(byte[] data) {
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) new java.lang.String(data, kotlin.text.Charsets.UTF_8), (java.lang.CharSequence) "upload end", false, 2, (java.lang.Object) null);
    }

    public final boolean isRunningSyncEnd(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (isSyncEndCommand(data)) {
            if (((data[9] & kotlin.UByte.MAX_VALUE) | (data[10] << 8)) == 128) {
                return true;
            }
        }
        return false;
    }
}
