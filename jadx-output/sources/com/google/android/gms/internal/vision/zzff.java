package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzff extends com.google.android.gms.internal.vision.zzex<java.lang.Boolean> implements com.google.android.gms.internal.vision.zzgz<java.lang.Boolean>, com.google.android.gms.internal.vision.zzio, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzff zzrs;
    private int size;
    private boolean[] zzrt;

    zzff() {
        this(new boolean[10], 0);
    }

    private zzff(boolean[] zArr, int i) {
        this.zzrt = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzrt;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzff)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) obj;
        if (this.size != zzffVar.size) {
            return false;
        }
        boolean[] zArr = zzffVar.zzrt;
        for (int i = 0; i < this.size; i++) {
            if (this.zzrt[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzm = 1;
        for (int i = 0; i < this.size; i++) {
            iZzm = (iZzm * 31) + com.google.android.gms.internal.vision.zzgt.zzm(this.zzrt[i]);
        }
        return iZzm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zzdq();
        int i = this.size;
        boolean[] zArr = this.zzrt;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzrt = zArr2;
        }
        boolean[] zArr3 = this.zzrt;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        zzdq();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.vision.zzff)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) collection;
        int i = zzffVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzrt;
        if (i3 > zArr.length) {
            this.zzrt = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzffVar.zzrt, 0, this.zzrt, this.size, zzffVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzdq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.zzrt[i]))) {
                boolean[] zArr = this.zzrt;
                java.lang.System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdq();
        zzae(i);
        boolean[] zArr = this.zzrt;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        zzae(i);
        boolean[] zArr = this.zzrt;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        boolean[] zArr = this.zzrt;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzrt, i, zArr2, i + 1, this.size - i);
            this.zzrt = zArr2;
        }
        this.zzrt[i] = zBooleanValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        addBoolean(((java.lang.Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz<java.lang.Boolean> zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zzff(java.util.Arrays.copyOf(this.zzrt, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzae(i);
        return java.lang.Boolean.valueOf(this.zzrt[i]);
    }

    static {
        com.google.android.gms.internal.vision.zzff zzffVar = new com.google.android.gms.internal.vision.zzff(new boolean[0], 0);
        zzrs = zzffVar;
        zzffVar.zzdp();
    }
}
