package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class HashAccumulator {
    private static int zaam = 31;
    private int zaan = 1;

    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(java.lang.Object obj) {
        this.zaan = (zaam * this.zaan) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean z) {
        this.zaan = (zaam * this.zaan) + (z ? 1 : 0);
        return this;
    }

    public int hash() {
        return this.zaan;
    }
}
