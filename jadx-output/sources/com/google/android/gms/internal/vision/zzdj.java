package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdj<E> extends com.google.android.gms.internal.vision.zzdc<E> implements java.util.Set<E> {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient com.google.android.gms.internal.vision.zzdf<E> zzlv;

    zzdj() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.internal.vision.zzdo.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.android.gms.internal.vision.zzdo.zza(this);
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    public com.google.android.gms.internal.vision.zzdf<E> zzcc() {
        com.google.android.gms.internal.vision.zzdf<E> zzdfVar = this.zzlv;
        if (zzdfVar != null) {
            return zzdfVar;
        }
        com.google.android.gms.internal.vision.zzdf<E> zzdfVarZzch = zzch();
        this.zzlv = zzdfVarZzch;
        return zzdfVarZzch;
    }

    com.google.android.gms.internal.vision.zzdf<E> zzch() {
        return com.google.android.gms.internal.vision.zzdf.zza(toArray());
    }

    @Override // com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
