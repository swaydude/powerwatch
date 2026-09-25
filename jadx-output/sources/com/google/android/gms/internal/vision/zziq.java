package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zziq<E> extends com.google.android.gms.internal.vision.zzex<E> implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zziq<java.lang.Object> zzzq;
    private int size;
    private E[] zzlu;

    public static <E> com.google.android.gms.internal.vision.zziq<E> zzhr() {
        return (com.google.android.gms.internal.vision.zziq<E>) zzzq;
    }

    zziq() {
        this(new java.lang.Object[10], 0);
    }

    private zziq(E[] eArr, int i) {
        this.zzlu = eArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzdq();
        int i = this.size;
        E[] eArr = this.zzlu;
        if (i == eArr.length) {
            this.zzlu = (E[]) java.util.Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzlu;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        E[] eArr = this.zzlu;
        if (i2 < eArr.length) {
            java.lang.System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new java.lang.Object[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(eArr, 0, eArr2, 0, i);
            java.lang.System.arraycopy(this.zzlu, i, eArr2, i + 1, this.size - i);
            this.zzlu = eArr2;
        }
        this.zzlu[i] = e;
        this.size++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzae(i);
        return this.zzlu[i];
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzdq();
        zzae(i);
        E[] eArr = this.zzlu;
        E e = eArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzdq();
        zzae(i);
        E[] eArr = this.zzlu;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    private final void zzae(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
    }

    private final java.lang.String zzaf(int i) {
        int i2 = this.size;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zziq(java.util.Arrays.copyOf(this.zzlu, i), this.size);
    }

    static {
        com.google.android.gms.internal.vision.zziq<java.lang.Object> zziqVar = new com.google.android.gms.internal.vision.zziq<>(new java.lang.Object[0], 0);
        zzzq = zziqVar;
        zziqVar.zzdp();
    }
}
