package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public interface ExternalScanSettingsExtension {

    public interface Builder<T extends com.polidea.rxandroidble2.internal.scan.ExternalScanSettingsExtension.Builder<T>> {
        T setShouldCheckLocationServicesState(boolean z);
    }

    boolean shouldCheckLocationProviderState();
}
