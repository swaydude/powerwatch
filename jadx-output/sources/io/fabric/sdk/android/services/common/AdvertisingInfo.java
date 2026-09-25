package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
class AdvertisingInfo {
    public final java.lang.String advertisingId;
    public final boolean limitAdTrackingEnabled;

    AdvertisingInfo(java.lang.String str, boolean z) {
        this.advertisingId = str;
        this.limitAdTrackingEnabled = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo = (io.fabric.sdk.android.services.common.AdvertisingInfo) obj;
        if (this.limitAdTrackingEnabled != advertisingInfo.limitAdTrackingEnabled) {
            return false;
        }
        java.lang.String str = this.advertisingId;
        java.lang.String str2 = advertisingInfo.advertisingId;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        java.lang.String str = this.advertisingId;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.limitAdTrackingEnabled ? 1 : 0);
    }
}
