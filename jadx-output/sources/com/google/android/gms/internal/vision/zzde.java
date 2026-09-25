package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzde<E> extends com.google.android.gms.internal.vision.zzdb<E> {
    private final com.google.android.gms.internal.vision.zzdf<E> zzlm;

    zzde(com.google.android.gms.internal.vision.zzdf<E> zzdfVar, int i) {
        super(zzdfVar.size(), i);
        this.zzlm = zzdfVar;
    }

    @Override // com.google.android.gms.internal.vision.zzdb
    protected final E get(int i) {
        return this.zzlm.get(i);
    }
}
