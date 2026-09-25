package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* JADX INFO: loaded from: classes.dex */
final class zzej<FieldDescriptorType> extends com.google.android.gms.internal.clearcut.zzei<FieldDescriptorType, java.lang.Object> {
    zzej(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzei
    public final void zzv() {
        if (!isImmutable()) {
            for (int i = 0; i < zzdr(); i++) {
                java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entryZzak = zzak(i);
                if (((com.google.android.gms.internal.clearcut.zzca) entryZzak.getKey()).zzaw()) {
                    entryZzak.setValue(java.util.Collections.unmodifiableList((java.util.List) entryZzak.getValue()));
                }
            }
            for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : zzds()) {
                if (((com.google.android.gms.internal.clearcut.zzca) entry.getKey()).zzaw()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zzv();
    }
}
