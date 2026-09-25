package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzds extends com.google.android.gms.internal.measurement.zzdo<java.lang.Boolean> implements com.google.android.gms.internal.measurement.zzfl<java.lang.Boolean>, com.google.android.gms.internal.measurement.zzha, java.util.RandomAccess {
    private static final com.google.android.gms.internal.measurement.zzds zza;
    private boolean[] zzb;
    private int zzc;

    zzds() {
        this(new boolean[10], 0);
    }

    private zzds(boolean[] zArr, int i) {
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzc();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzds)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzds zzdsVar = (com.google.android.gms.internal.measurement.zzds) obj;
        if (this.zzc != zzdsVar.zzc) {
            return false;
        }
        boolean[] zArr = zzdsVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzc; i++) {
            iZza = (iZza * 31) + com.google.android.gms.internal.measurement.zzff.zza(this.zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zza(boolean z) {
        zzc();
        int i = this.zzc;
        boolean[] zArr = this.zzb;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        zzc();
        com.google.android.gms.internal.measurement.zzff.zza(collection);
        if (!(collection instanceof com.google.android.gms.internal.measurement.zzds)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.measurement.zzds zzdsVar = (com.google.android.gms.internal.measurement.zzds) collection;
        int i = zzdsVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzb;
        if (i3 > zArr.length) {
            this.zzb = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzdsVar.zzb, 0, this.zzb, this.zzc, zzdsVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzc();
        for (int i = 0; i < this.zzc; i++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.zzb[i]))) {
                boolean[] zArr = this.zzb;
                java.lang.System.arraycopy(zArr, i + 1, zArr, i, (this.zzc - i) - 1);
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
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzc();
        zzb(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzc();
        zzb(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzc();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzc(i));
        }
        boolean[] zArr = this.zzb;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, zArr2, i + 1, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = zBooleanValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zza(((java.lang.Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzfl<java.lang.Boolean> zza(int i) {
        if (i < this.zzc) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.measurement.zzds(java.util.Arrays.copyOf(this.zzb, i), this.zzc);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzb(i);
        return java.lang.Boolean.valueOf(this.zzb[i]);
    }

    static {
        com.google.android.gms.internal.measurement.zzds zzdsVar = new com.google.android.gms.internal.measurement.zzds(new boolean[0], 0);
        zza = zzdsVar;
        zzdsVar.h_();
    }
}
