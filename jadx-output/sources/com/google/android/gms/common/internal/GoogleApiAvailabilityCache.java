package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityCache {
    private final android.util.SparseIntArray zapd;
    private com.google.android.gms.common.GoogleApiAvailabilityLight zape;

    public GoogleApiAvailabilityCache() {
        this(com.google.android.gms.common.GoogleApiAvailability.getInstance());
    }

    public GoogleApiAvailabilityCache(com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zapd = new android.util.SparseIntArray();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zape = googleApiAvailabilityLight;
    }

    public int getClientAvailability(android.content.Context context, com.google.android.gms.common.api.Api.Client client) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(client);
        int iIsGooglePlayServicesAvailable = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i = this.zapd.get(minApkVersion, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.zapd.size()) {
                iIsGooglePlayServicesAvailable = i;
                break;
            }
            int iKeyAt = this.zapd.keyAt(i2);
            if (iKeyAt > minApkVersion && this.zapd.get(iKeyAt) == 0) {
                break;
            }
            i2++;
        }
        if (iIsGooglePlayServicesAvailable == -1) {
            iIsGooglePlayServicesAvailable = this.zape.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zapd.put(minApkVersion, iIsGooglePlayServicesAvailable);
        return iIsGooglePlayServicesAvailable;
    }

    public void flush() {
        this.zapd.clear();
    }
}
