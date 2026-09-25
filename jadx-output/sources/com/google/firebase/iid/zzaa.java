package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa implements com.google.firebase.iid.InstanceIdResult {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    zzaa(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final java.lang.String getId() {
        return this.zza;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public final java.lang.String getToken() {
        return this.zzb;
    }
}
