package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzcg implements com.google.android.gms.internal.measurement.zzcb {
    private static com.google.android.gms.internal.measurement.zzcg zza;

    @javax.annotation.Nullable
    private final android.content.Context zzb;

    @javax.annotation.Nullable
    private final android.database.ContentObserver zzc;

    static com.google.android.gms.internal.measurement.zzcg zza(android.content.Context context) {
        com.google.android.gms.internal.measurement.zzcg zzcgVar;
        synchronized (com.google.android.gms.internal.measurement.zzcg.class) {
            if (zza == null) {
                zza = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.measurement.zzcg(context) : new com.google.android.gms.internal.measurement.zzcg();
            }
            zzcgVar = zza;
        }
        return zzcgVar;
    }

    private zzcg(android.content.Context context) {
        this.zzb = context;
        com.google.android.gms.internal.measurement.zzci zzciVar = new com.google.android.gms.internal.measurement.zzci(this, null);
        this.zzc = zzciVar;
        context.getContentResolver().registerContentObserver(com.google.android.gms.internal.measurement.zzbw.zza, true, zzciVar);
    }

    private zzcg() {
        this.zzb = null;
        this.zzc = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcb
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zza(final java.lang.String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.measurement.zzce.zza(new com.google.android.gms.internal.measurement.zzcd(this, str) { // from class: com.google.android.gms.internal.measurement.zzcf
                private final com.google.android.gms.internal.measurement.zzcg zza;
                private final java.lang.String zzb;

                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcd
                public final java.lang.Object zza() {
                    return this.zza.zzb(this.zzb);
                }
            });
        } catch (java.lang.IllegalStateException | java.lang.SecurityException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new java.lang.String("Unable to read GServices for: "), e);
            return null;
        }
    }

    static synchronized void zza() {
        android.content.Context context;
        com.google.android.gms.internal.measurement.zzcg zzcgVar = zza;
        if (zzcgVar != null && (context = zzcgVar.zzb) != null && zzcgVar.zzc != null) {
            context.getContentResolver().unregisterContentObserver(zza.zzc);
        }
        zza = null;
    }

    final /* synthetic */ java.lang.String zzb(java.lang.String str) {
        return com.google.android.gms.internal.measurement.zzbw.zza(this.zzb.getContentResolver(), str, (java.lang.String) null);
    }
}
