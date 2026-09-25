package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanPreconditionsVerifierApi18 implements com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier {
    final com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus;
    final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;

    @bleshadow.javax.inject.Inject
    public ScanPreconditionsVerifierApi18(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus) {
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
        this.locationServicesStatus = locationServicesStatus;
    }

    @Override // com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier
    public void verify(boolean z) {
        if (!this.rxBleAdapterWrapper.hasBluetoothAdapter()) {
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(2);
        }
        if (!this.rxBleAdapterWrapper.isBluetoothEnabled()) {
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(1);
        }
        if (!this.locationServicesStatus.isLocationPermissionOk()) {
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(3);
        }
        if (z && !this.locationServicesStatus.isLocationProviderOk()) {
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(4);
        }
    }
}
