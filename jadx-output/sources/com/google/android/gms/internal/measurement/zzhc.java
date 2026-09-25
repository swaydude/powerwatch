package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhc<E> extends com.google.android.gms.internal.measurement.zzdo<E> implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzhc<java.lang.Object> zza;
    private E[] zzb;
    private int zzc;

    public static <E> com.google.android.gms.internal.measurement.zzhc<E> zzd() {
        return (com.google.android.gms.internal.measurement.zzhc<E>) zza;
    }

    zzhc() {
        this(new java.lang.Object[10], 0);
    }

    private zzhc(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzc();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) java.util.Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzc(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            java.lang.System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new java.lang.Object[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(eArr, 0, eArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzb(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzc();
        zzb(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzc();
        zzb(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    private final void zzb(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzc(i));
        }
    }

    private final java.lang.String zzc(int i) {
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzfl zza(int i) {
        if (i < this.zzc) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.measurement.zzhc(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
    }

    static {
        com.google.android.gms.internal.measurement.zzhc<java.lang.Object> zzhcVar = new com.google.android.gms.internal.measurement.zzhc<>(new java.lang.Object[0], 0);
        zza = zzhcVar;
        zzhcVar.h_();
    }
}
