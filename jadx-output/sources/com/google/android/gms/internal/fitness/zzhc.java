package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhc extends com.google.android.gms.internal.fitness.zzfa<java.lang.Long> implements com.google.android.gms.internal.fitness.zzgl<java.lang.Long>, com.google.android.gms.internal.fitness.zzhx, java.util.RandomAccess {
    private static final com.google.android.gms.internal.fitness.zzhc zzxe;
    private int size;
    private long[] zzxf;

    zzhc() {
        this(new long[10], 0);
    }

    private zzhc(long[] jArr, int i) {
        this.zzxf = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzam();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzxf;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzhc)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.fitness.zzhc zzhcVar = (com.google.android.gms.internal.fitness.zzhc) obj;
        if (this.size != zzhcVar.size) {
            return false;
        }
        long[] jArr = zzhcVar.zzxf;
        for (int i = 0; i < this.size; i++) {
            if (this.zzxf[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzj = 1;
        for (int i = 0; i < this.size; i++) {
            iZzj = (iZzj * 31) + com.google.android.gms.internal.fitness.zzgk.zzj(this.zzxf[i]);
        }
        return iZzj;
    }

    public final long getLong(int i) {
        zzaa(i);
        return this.zzxf[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        zzam();
        com.google.android.gms.internal.fitness.zzgk.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.fitness.zzhc)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.fitness.zzhc zzhcVar = (com.google.android.gms.internal.fitness.zzhc) collection;
        int i = zzhcVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzxf;
        if (i3 > jArr.length) {
            this.zzxf = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzhcVar.zzxf, 0, this.zzxf, this.size, zzhcVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzam();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.zzxf[i]))) {
                long[] jArr = this.zzxf;
                java.lang.System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzaa(int i) {
        if (i < 0 || i >= this.size) {
            throw new java.lang.IndexOutOfBoundsException(zzab(i));
        }
    }

    private final java.lang.String zzab(int i) {
        int i2 = this.size;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzam();
        zzaa(i);
        long[] jArr = this.zzxf;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzam();
        zzaa(i);
        long[] jArr = this.zzxf;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzam();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzab(i));
        }
        long[] jArr = this.zzxf;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzxf, i, jArr2, i + 1, this.size - i);
            this.zzxf = jArr2;
        }
        this.zzxf[i] = jLongValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzam();
        int i = this.size;
        long[] jArr = this.zzxf;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzxf = jArr2;
        }
        long[] jArr3 = this.zzxf;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = jLongValue;
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzgl
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzgl<java.lang.Long> zzac(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.fitness.zzhc(java.util.Arrays.copyOf(this.zzxf, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    static {
        com.google.android.gms.internal.fitness.zzhc zzhcVar = new com.google.android.gms.internal.fitness.zzhc(new long[0], 0);
        zzxe = zzhcVar;
        zzhcVar.zzal();
    }
}
