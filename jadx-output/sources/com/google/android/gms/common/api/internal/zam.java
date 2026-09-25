package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zam {
    private final int zadm;
    private final com.google.android.gms.common.ConnectionResult zadn;

    zam(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionResult);
        this.zadn = connectionResult;
        this.zadm = i;
    }

    final int zap() {
        return this.zadm;
    }

    final com.google.android.gms.common.ConnectionResult getConnectionResult() {
        return this.zadn;
    }
}
