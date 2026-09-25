package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhq extends com.google.android.gms.internal.vision.zzex<java.lang.Long> implements com.google.android.gms.internal.vision.zzgz<java.lang.Long>, com.google.android.gms.internal.vision.zzio, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzhq zzyj;
    private int size;
    private long[] zzyk;

    zzhq() {
        this(new long[10], 0);
    }

    private zzhq(long[] jArr, int i) {
        this.zzyk = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzyk;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzhq)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) obj;
        if (this.size != zzhqVar.size) {
            return false;
        }
        long[] jArr = zzhqVar.zzyk;
        for (int i = 0; i < this.size; i++) {
            if (this.zzyk[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzab = 1;
        for (int i = 0; i < this.size; i++) {
            iZzab = (iZzab * 31) + com.google.android.gms.internal.vision.zzgt.zzab(this.zzyk[i]);
        }
        return iZzab;
    }

    public final long getLong(int i) {
        zzae(i);
        return this.zzyk[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzac(long j) {
        zzdq();
        int i = this.size;
        long[] jArr = this.zzyk;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzyk = jArr2;
        }
        long[] jArr3 = this.zzyk;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        zzdq();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.vision.zzhq)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) collection;
        int i = zzhqVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzyk;
        if (i3 > jArr.length) {
            this.zzyk = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzhqVar.zzyk, 0, this.zzyk, this.size, zzhqVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzdq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.zzyk[i]))) {
                long[] jArr = this.zzyk;
                java.lang.System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
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
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzdq();
        zzae(i);
        long[] jArr = this.zzyk;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        zzae(i);
        long[] jArr = this.zzyk;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        long[] jArr = this.zzyk;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzyk, i, jArr2, i + 1, this.size - i);
            this.zzyk = jArr2;
        }
        this.zzyk[i] = jLongValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzac(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz<java.lang.Long> zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zzhq(java.util.Arrays.copyOf(this.zzyk, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    static {
        com.google.android.gms.internal.vision.zzhq zzhqVar = new com.google.android.gms.internal.vision.zzhq(new long[0], 0);
        zzyj = zzhqVar;
        zzhqVar.zzdp();
    }
}
