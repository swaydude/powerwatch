package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public interface ScanFilterInterface {
    boolean isAllFieldsEmpty();

    boolean matches(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult);
}
