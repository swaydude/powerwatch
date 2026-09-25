package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzeo extends com.google.android.gms.internal.measurement.zzdo<java.lang.Double> implements com.google.android.gms.internal.measurement.zzfl<java.lang.Double>, com.google.android.gms.internal.measurement.zzha, java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzeo zza;
    private double[] zzb;
    private int zzc;

    zzeo() {
        this(new double[10], 0);
    }

    private zzeo(double[] dArr, int i) {
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzeo)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzeo zzeoVar = (com.google.android.gms.internal.measurement.zzeo) obj;
        if (this.zzc != zzeoVar.zzc) {
            return false;
        }
        double[] dArr = zzeoVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzb[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + com.google.android.gms.internal.measurement.zzff.zza(java.lang.Double.doubleToLongBits(this.zzb[i]));
        }
        return iZza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zza(double d) {
        zzc();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> collection) {
        zzc();
        com.google.android.gms.internal.measurement.zzff.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzeo)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzeo zzeoVar = (com.google.android.gms.internal.measurement.zzeo) collection;
        int i = zzeoVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzb;
        if (i3 > dArr.length) {
            this.zzb = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzeoVar.zzb, 0, this.zzb, this.zzc, zzeoVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(java.lang.Double.valueOf(this.zzb[i]))) {
                double[] dArr = this.zzb;
                java.lang.System.arraycopy(dArr, i + 1, dArr, i, (this.zzc - i) - 1);
                this.zzc--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzc();
        zzb(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zzb(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzc(i));
        }
        double[] dArr = this.zzb;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = dDoubleValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zza(((java.lang.Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzfl<java.lang.Double> zza(int i) {
        if (i < this.zzc) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.measurement.zzeo(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzb(i);
        return java.lang.Double.valueOf(this.zzb[i]);
    }

    static {
        com.google.android.gms.internal.measurement.zzeo zzeoVar = new com.google.android.gms.internal.measurement.zzeo(new double[0], 0);
        zza = zzeoVar;
        zzeoVar.h_();
    }
}
