package com.google.android.gms.internal.fitness;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzig<FieldDescriptorType> extends com.google.android.gms.internal.fitness.zzid<FieldDescriptorType, java.lang.Object> {
    zzig(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.fitness.zzid
    public final void zzal() {
        if (!isImmutable()) {
            for (int i = 0; i < zzcq(); i++) {
                java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entryZzaj = zzaj(i);
                if (((com.google.android.gms.internal.fitness.zzgd) entryZzaj.getKey()).zzbi()) {
                    entryZzaj.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzaj.getValue()));
                }
            }
            for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : zzcr()) {
                if (((com.google.android.gms.internal.fitness.zzgd) entry.getKey()).zzbi()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zzal();
    }
}
