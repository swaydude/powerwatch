package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdf<E> extends com.google.android.gms.internal.vision.zzdc<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzdq<java.lang.Object> zzln = new com.google.android.gms.internal.vision.zzde(com.google.android.gms.internal.vision.zzdi.zzlt, 0);

    public static <E> com.google.android.gms.internal.vision.zzdf<E> zzcd() {
        return (com.google.android.gms.internal.vision.zzdf<E>) com.google.android.gms.internal.vision.zzdi.zzlt;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    public final com.google.android.gms.internal.vision.zzdf<E> zzcc() {
        return this;
    }

    static <E> com.google.android.gms.internal.vision.zzdf<E> zza(java.lang.Object[] objArr) {
        int length = objArr.length;
        return length == 0 ? (com.google.android.gms.internal.vision.zzdf<E>) com.google.android.gms.internal.vision.zzdi.zzlt : new com.google.android.gms.internal.vision.zzdi(objArr, length);
    }

    zzdf() {
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    /* JADX INFO: renamed from: zzby */
    public final com.google.android.gms.internal.vision.zzdr<E> iterator() {
        return (com.google.android.gms.internal.vision.zzdq) listIterator();
    }

    @Override // java.util.List
    public int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof java.util.RandomAccess) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        java.util.ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (com.google.android.gms.internal.vision.zzco.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof java.util.RandomAccess)) {
            java.util.ListIterator<E> listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (com.google.android.gms.internal.vision.zzco.equal(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.vision.zzdf<E> subList(int i, int i2) {
        com.google.android.gms.internal.vision.zzct.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (com.google.android.gms.internal.vision.zzdf<E>) com.google.android.gms.internal.vision.zzdi.zzlt;
        }
        return new com.google.android.gms.internal.vision.zzdh(this, i, i3);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (obj == com.google.android.gms.internal.vision.zzct.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if ((this instanceof java.util.RandomAccess) && (list instanceof java.util.RandomAccess)) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.vision.zzco.equal(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                com.google.android.gms.internal.vision.zzdf<E> zzdfVar = this;
                int size2 = zzdfVar.size();
                java.util.Iterator<E> it = list.iterator();
                int i2 = 0;
                while (i2 < size2) {
                    if (it.hasNext()) {
                        E e = zzdfVar.get(i2);
                        i2++;
                        if (com.google.android.gms.internal.vision.zzco.equal(e, it.next())) {
                        }
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ java.util.ListIterator listIterator(int i) {
        com.google.android.gms.internal.vision.zzct.zzd(i, size());
        if (isEmpty()) {
            return zzln;
        }
        return new com.google.android.gms.internal.vision.zzde(this, i);
    }

    @Override // java.util.List
    public /* synthetic */ java.util.ListIterator listIterator() {
        return (com.google.android.gms.internal.vision.zzdq) listIterator(0);
    }
}
