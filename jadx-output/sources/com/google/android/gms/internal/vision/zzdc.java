package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdc<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] zzll = new java.lang.Object[0];

    zzdc() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzby, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.vision.zzdr<E> iterator();

    java.lang.Object[] zzbz() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(zzll);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.google.android.gms.internal.vision.zzct.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            java.lang.Object[] objArrZzbz = zzbz();
            if (objArrZzbz != null) {
                return (T[]) java.util.Arrays.copyOfRange(objArrZzbz, zzca(), zzcb(), tArr.getClass());
            }
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    int zzca() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzcb() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.android.gms.internal.vision.zzdf<E> zzcc() {
        return isEmpty() ? com.google.android.gms.internal.vision.zzdf.zzcd() : com.google.android.gms.internal.vision.zzdf.zza(toArray());
    }

    int zza(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.vision.zzdr zzdrVar = (com.google.android.gms.internal.vision.zzdr) iterator();
        while (zzdrVar.hasNext()) {
            objArr[i] = zzdrVar.next();
            i++;
        }
        return i;
    }
}
