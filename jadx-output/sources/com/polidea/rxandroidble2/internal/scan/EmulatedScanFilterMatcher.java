package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class EmulatedScanFilterMatcher {
    private final boolean isEmpty;
    private final com.polidea.rxandroidble2.internal.scan.ScanFilterInterface[] scanFilters;

    public EmulatedScanFilterMatcher(com.polidea.rxandroidble2.internal.scan.ScanFilterInterface... scanFilterInterfaceArr) {
        this.scanFilters = scanFilterInterfaceArr;
        boolean z = false;
        if (scanFilterInterfaceArr == null || scanFilterInterfaceArr.length == 0) {
            z = true;
        } else {
            for (com.polidea.rxandroidble2.internal.scan.ScanFilterInterface scanFilterInterface : scanFilterInterfaceArr) {
                if (scanFilterInterface.isAllFieldsEmpty()) {
                }
            }
            z = true;
        }
        this.isEmpty = z;
    }

    public boolean matches(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
        com.polidea.rxandroidble2.internal.scan.ScanFilterInterface[] scanFilterInterfaceArr = this.scanFilters;
        if (scanFilterInterfaceArr == null || scanFilterInterfaceArr.length == 0) {
            return true;
        }
        for (com.polidea.rxandroidble2.internal.scan.ScanFilterInterface scanFilterInterface : scanFilterInterfaceArr) {
            if (scanFilterInterface.matches(rxBleInternalScanResult)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public java.lang.String toString() {
        return "emulatedFilters=" + java.util.Arrays.toString(this.scanFilters);
    }
}
