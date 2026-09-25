package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zziv<FieldDescriptorType> extends com.google.android.gms.internal.vision.zziw<FieldDescriptorType, java.lang.Object> {
    zziv(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.vision.zziw
    public final void zzdp() {
        if (!isImmutable()) {
            for (int i = 0; i < zzhx(); i++) {
                java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entryZzbu = zzbu(i);
                if (((com.google.android.gms.internal.vision.zzgk) entryZzbu.getKey()).zzfu()) {
                    entryZzbu.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzbu.getValue()));
                }
            }
            for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : zzhy()) {
                if (((com.google.android.gms.internal.vision.zzgk) entry.getKey()).zzfu()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zzdp();
    }
}
