package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleDisconnectedException extends com.polidea.rxandroidble2.exceptions.BleException {
    public static final int UNKNOWN_STATUS = -1;
    public final java.lang.String bluetoothDeviceAddress;
    public final int state;

    public static com.polidea.rxandroidble2.exceptions.BleDisconnectedException adapterDisabled(java.lang.String str) {
        return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(new com.polidea.rxandroidble2.exceptions.BleAdapterDisabledException(), str, -1);
    }

    @java.lang.Deprecated
    public BleDisconnectedException() {
        this("", -1);
    }

    @java.lang.Deprecated
    public BleDisconnectedException(java.lang.Throwable th, java.lang.String str) {
        this(th, str, -1);
    }

    @java.lang.Deprecated
    public BleDisconnectedException(java.lang.String str) {
        this(str, -1);
    }

    public BleDisconnectedException(java.lang.Throwable th, java.lang.String str, int i) {
        super(createMessage(str, i), th);
        this.bluetoothDeviceAddress = str;
        this.state = i;
    }

    public BleDisconnectedException(java.lang.String str, int i) {
        super(createMessage(str, i));
        this.bluetoothDeviceAddress = str;
        this.state = i;
    }

    private static java.lang.String createMessage(java.lang.String str, int i) {
        return "Disconnected from " + com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(str) + " with status " + i + " (" + com.polidea.rxandroidble2.utils.GattStatusParser.getGattCallbackStatusDescription(i) + ")";
    }
}
