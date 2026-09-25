package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzia implements java.lang.Runnable {
    private final /* synthetic */ android.os.Bundle zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzia(com.google.android.gms.measurement.internal.zzhp zzhpVar, android.os.Bundle bundle) {
        this.zzb = zzhpVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
