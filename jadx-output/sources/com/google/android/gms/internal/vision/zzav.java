package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzav implements com.google.android.gms.internal.vision.zzau {
    private static com.google.android.gms.internal.vision.zzav zzfr;

    @javax.annotation.Nullable
    private final android.content.Context zze;

    @javax.annotation.Nullable
    private final android.database.ContentObserver zzfl;

    static com.google.android.gms.internal.vision.zzav zze(android.content.Context context) {
        com.google.android.gms.internal.vision.zzav zzavVar;
        synchronized (com.google.android.gms.internal.vision.zzav.class) {
            if (zzfr == null) {
                zzfr = androidx.core.content.PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.vision.zzav(context) : new com.google.android.gms.internal.vision.zzav();
            }
            zzavVar = zzfr;
        }
        return zzavVar;
    }

    private zzav(android.content.Context context) {
        this.zze = context;
        com.google.android.gms.internal.vision.zzax zzaxVar = new com.google.android.gms.internal.vision.zzax(this, null);
        this.zzfl = zzaxVar;
        context.getContentResolver().registerContentObserver(com.google.android.gms.internal.vision.zzal.CONTENT_URI, true, zzaxVar);
    }

    private zzav() {
        this.zze = null;
        this.zzfl = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.vision.zzau
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzb(final java.lang.String str) {
        if (this.zze == null) {
            return null;
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.vision.zzat.zza(new com.google.android.gms.internal.vision.zzaw(this, str) { // from class: com.google.android.gms.internal.vision.zzay
                private final com.google.android.gms.internal.vision.zzav zzfs;
                private final java.lang.String zzft;

                {
                    this.zzfs = this;
                    this.zzft = str;
                }

                @Override // com.google.android.gms.internal.vision.zzaw
                public final java.lang.Object zzt() {
                    return this.zzfs.zzd(this.zzft);
                }
            });
        } catch (java.lang.IllegalStateException | java.lang.SecurityException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new java.lang.String("Unable to read GServices for: "), e);
            return null;
        }
    }

    static synchronized void zzaa() {
        android.content.Context context;
        com.google.android.gms.internal.vision.zzav zzavVar = zzfr;
        if (zzavVar != null && (context = zzavVar.zze) != null && zzavVar.zzfl != null) {
            context.getContentResolver().unregisterContentObserver(zzfr.zzfl);
        }
        zzfr = null;
    }

    final /* synthetic */ java.lang.String zzd(java.lang.String str) {
        return com.google.android.gms.internal.vision.zzal.zza(this.zze.getContentResolver(), str, (java.lang.String) null);
    }
}
