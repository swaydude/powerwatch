package powerwatch.matrix.com.pwgen2android.sdk.core;

/* JADX INFO: compiled from: BleScanner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;", "", "scanMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;", "scanFilters", "", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "scanTimeout", "", "(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)V", "getScanFilters", "()Ljava/util/List;", "getScanMode", "()Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;", "getScanTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class BleScannerConfiguration {
    private final java.util.List<com.polidea.rxandroidble2.scan.ScanFilter> scanFilters;
    private final powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode scanMode;
    private final java.lang.Long scanTimeout;

    public BleScannerConfiguration() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration copy$default(powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration, powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode scanMode, java.util.List list, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            scanMode = bleScannerConfiguration.scanMode;
        }
        if ((i & 2) != 0) {
            list = bleScannerConfiguration.scanFilters;
        }
        if ((i & 4) != 0) {
            l = bleScannerConfiguration.scanTimeout;
        }
        return bleScannerConfiguration.copy(scanMode, list, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode getScanMode() {
        return this.scanMode;
    }

    public final java.util.List<com.polidea.rxandroidble2.scan.ScanFilter> component2() {
        return this.scanFilters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.Long getScanTimeout() {
        return this.scanTimeout;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration copy(powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode scanMode, java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter> scanFilters, java.lang.Long scanTimeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanFilters, "scanFilters");
        return new powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration(scanMode, scanFilters, scanTimeout);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration = (powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration) other;
        return this.scanMode == bleScannerConfiguration.scanMode && kotlin.jvm.internal.Intrinsics.areEqual(this.scanFilters, bleScannerConfiguration.scanFilters) && kotlin.jvm.internal.Intrinsics.areEqual(this.scanTimeout, bleScannerConfiguration.scanTimeout);
    }

    public int hashCode() {
        int iHashCode = ((this.scanMode.hashCode() * 31) + this.scanFilters.hashCode()) * 31;
        java.lang.Long l = this.scanTimeout;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public java.lang.String toString() {
        return "BleScannerConfiguration(scanMode=" + this.scanMode + ", scanFilters=" + this.scanFilters + ", scanTimeout=" + this.scanTimeout + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleScannerConfiguration(powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode scanMode, java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter> scanFilters, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanFilters, "scanFilters");
        this.scanMode = scanMode;
        this.scanFilters = scanFilters;
        this.scanTimeout = l;
    }

    public /* synthetic */ BleScannerConfiguration(powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode scanMode, java.util.List list, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode.SCAN_MODE_LOW_LATENCY : scanMode, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : l);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.core.ScanMode getScanMode() {
        return this.scanMode;
    }

    public final java.util.List<com.polidea.rxandroidble2.scan.ScanFilter> getScanFilters() {
        return this.scanFilters;
    }

    public final java.lang.Long getScanTimeout() {
        return this.scanTimeout;
    }
}
