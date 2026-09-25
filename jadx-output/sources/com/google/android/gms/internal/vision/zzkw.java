package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkw implements com.google.android.gms.internal.vision.zzku {
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagh;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagi;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagj;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagk;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagl;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagm;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagn;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzago;
    private static final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zzagp;

    @Override // com.google.android.gms.internal.vision.zzku
    public final boolean zzjp() {
        return zzagi.get().booleanValue();
    }

    @Override // com.google.android.gms.internal.vision.zzku
    public final boolean zzjq() {
        return zzagm.get().booleanValue();
    }

    static {
        com.google.android.gms.internal.vision.zzbk zzbkVarZzf = new com.google.android.gms.internal.vision.zzbk(com.google.android.gms.internal.vision.zzbb.getContentProviderUri("com.google.android.gms.vision.sdk")).zzf("vision.sdk:");
        zzagh = zzbkVarZzf.zza("OptionalModule__enable_barcode_optional_module", false);
        zzagi = zzbkVarZzf.zza("OptionalModule__enable_barcode_optional_module_v25", false);
        zzagj = zzbkVarZzf.zza("OptionalModule__enable_face_optional_module", false);
        zzagk = zzbkVarZzf.zza("OptionalModule__enable_face_optional_module_v25", true);
        zzagl = zzbkVarZzf.zza("OptionalModule__enable_ica_optional_module", false);
        zzagm = zzbkVarZzf.zza("OptionalModule__enable_ica_optional_module_v25", false);
        zzagn = zzbkVarZzf.zza("OptionalModule__enable_ocr_optional_module", false);
        zzago = zzbkVarZzf.zza("OptionalModule__enable_ocr_optional_module_v25", false);
        zzagp = zzbkVarZzf.zza("OptionalModule__enable_old_download_path", true);
    }
}
