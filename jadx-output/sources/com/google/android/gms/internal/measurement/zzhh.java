package com.google.android.gms.internal.measurement;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhh<FieldDescriptorType> extends com.google.android.gms.internal.measurement.zzhi<FieldDescriptorType, java.lang.Object> {
    zzhh(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entryZzb = zzb(i);
                if (((com.google.android.gms.internal.measurement.zzey) entryZzb.getKey()).zzd()) {
                    entryZzb.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzb.getValue()));
                }
            }
            for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : zzd()) {
                if (((com.google.android.gms.internal.measurement.zzey) entry.getKey()).zzd()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
