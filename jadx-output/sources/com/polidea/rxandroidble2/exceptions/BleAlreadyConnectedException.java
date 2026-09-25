package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleAlreadyConnectedException extends com.polidea.rxandroidble2.exceptions.BleException {
    public BleAlreadyConnectedException(java.lang.String str) {
        super("Already connected to device with MAC address " + str);
    }
}
