package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgb extends com.google.android.gms.internal.vision.zzex<java.lang.Double> implements com.google.android.gms.internal.vision.zzgz<java.lang.Double>, com.google.android.gms.internal.vision.zzio, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzgb zzst;
    private int size;
    private double[] zzsu;

    zzgb() {
        this(new double[10], 0);
    }

    private zzgb(double[] dArr, int i) {
        this.zzsu = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzsu;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzgb)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) obj;
        if (this.size != zzgbVar.size) {
            return false;
        }
        double[] dArr = zzgbVar.zzsu;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzsu[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzab = 1;
        for (int i = 0; i < this.size; i++) {
            iZzab = (iZzab * 31) + com.google.android.gms.internal.vision.zzgt.zzab(java.lang.Double.doubleToLongBits(this.zzsu[i]));
        }
        return iZzab;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(double d) {
        zzdq();
        int i = this.size;
        double[] dArr = this.zzsu;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzsu = dArr2;
        }
        double[] dArr3 = this.zzsu;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        zzdq();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.vision.zzgb)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) collection;
        int i = zzgbVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzsu;
        if (i3 > dArr.length) {
            this.zzsu = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzgbVar.zzsu, 0, this.zzsu, this.size, zzgbVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzdq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Double.valueOf(this.zzsu[i]))) {
                double[] dArr = this.zzsu;
                java.lang.System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzdq();
        zzae(i);
        double[] dArr = this.zzsu;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        zzae(i);
        double[] dArr = this.zzsu;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        double[] dArr = this.zzsu;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzsu, i, dArr2, i + 1, this.size - i);
            this.zzsu = dArr2;
        }
        this.zzsu[i] = dDoubleValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzc(((java.lang.Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz<java.lang.Double> zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zzgb(java.util.Arrays.copyOf(this.zzsu, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzae(i);
        return java.lang.Double.valueOf(this.zzsu[i]);
    }

    static {
        com.google.android.gms.internal.vision.zzgb zzgbVar = new com.google.android.gms.internal.vision.zzgb(new double[0], 0);
        zzst = zzgbVar;
        zzgbVar.zzdp();
    }
}
