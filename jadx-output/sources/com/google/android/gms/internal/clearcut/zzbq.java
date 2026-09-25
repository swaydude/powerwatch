package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbq extends com.google.android.gms.internal.clearcut.zzav<java.lang.Double> implements com.google.android.gms.internal.clearcut.zzcn<java.lang.Double>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzbq zzgj;
    private int size;
    private double[] zzgk;

    static {
        com.google.android.gms.internal.clearcut.zzbq zzbqVar = new com.google.android.gms.internal.clearcut.zzbq();
        zzgj = zzbqVar;
        zzbqVar.zzv();
    }

    zzbq() {
        this(new double[10], 0);
    }

    private zzbq(double[] dArr, int i) {
        this.zzgk = dArr;
        this.size = i;
    }

    private final void zzc(int i, double d) {
        int i2;
        zzw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        double[] dArr = this.zzgk;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzgk, i, dArr2, i + 1, this.size - i);
            this.zzgk = dArr2;
        }
        this.zzgk[i] = d;
        this.size++;
        this.modCount++;
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
    }

    private final java.lang.String zzh(int i) {
        int i2 = this.size;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzc(i, ((java.lang.Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        zzw();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.clearcut.zzbq)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.clearcut.zzbq zzbqVar = (com.google.android.gms.internal.clearcut.zzbq) collection;
        int i = zzbqVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzgk;
        if (i3 > dArr.length) {
            this.zzgk = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzbqVar.zzgk, 0, this.zzgk, this.size, zzbqVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbq)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzbq zzbqVar = (com.google.android.gms.internal.clearcut.zzbq) obj;
        if (this.size != zzbqVar.size) {
            return false;
        }
        double[] dArr = zzbqVar.zzgk;
        for (int i = 0; i < this.size; i++) {
            if (this.zzgk[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzg(i);
        return java.lang.Double.valueOf(this.zzgk[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzl = 1;
        for (int i = 0; i < this.size; i++) {
            iZzl = (iZzl * 31) + com.google.android.gms.internal.clearcut.zzci.zzl(java.lang.Double.doubleToLongBits(this.zzgk[i]));
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        zzg(i);
        double[] dArr = this.zzgk;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Double.valueOf(this.zzgk[i]))) {
                double[] dArr = this.zzgk;
                java.lang.System.arraycopy(dArr, i + 1, dArr, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzw();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzgk;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzw();
        zzg(i);
        double[] dArr = this.zzgk;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(double d) {
        zzc(this.size, d);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn<java.lang.Double> zzi(int i) {
        if (i >= this.size) {
            return new com.google.android.gms.internal.clearcut.zzbq(java.util.Arrays.copyOf(this.zzgk, i), this.size);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
