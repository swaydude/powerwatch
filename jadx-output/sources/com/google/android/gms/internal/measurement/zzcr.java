package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcr {
    final java.lang.String zza;
    final android.net.Uri zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;

    @javax.annotation.Nullable
    final com.google.android.gms.internal.measurement.zzcv<android.content.Context, java.lang.Boolean> zzi;

    public zzcr(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzcr(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, @javax.annotation.Nullable com.google.android.gms.internal.measurement.zzcv<android.content.Context, java.lang.Boolean> zzcvVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = false;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final com.google.android.gms.internal.measurement.zzcl<java.lang.Long> zza(java.lang.String str, long j) {
        return com.google.android.gms.internal.measurement.zzcl.zzb(this, str, j);
    }

    public final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza(java.lang.String str, boolean z) {
        return com.google.android.gms.internal.measurement.zzcl.zzb(this, str, z);
    }

    public final com.google.android.gms.internal.measurement.zzcl<java.lang.Double> zza(java.lang.String str, double d) {
        return com.google.android.gms.internal.measurement.zzcl.zzb(this, str, -3.0d);
    }

    public final com.google.android.gms.internal.measurement.zzcl<java.lang.String> zza(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.internal.measurement.zzcl.zzb(this, str, str2);
    }
}
