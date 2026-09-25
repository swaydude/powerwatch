package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdc extends com.google.android.gms.internal.clearcut.zzav<java.lang.Long> implements com.google.android.gms.internal.clearcut.zzcn<java.lang.Long>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzdc zzlw;
    private int size;
    private long[] zzlx;

    static {
        com.google.android.gms.internal.clearcut.zzdc zzdcVar = new com.google.android.gms.internal.clearcut.zzdc();
        zzlw = zzdcVar;
        zzdcVar.zzv();
    }

    zzdc() {
        this(new long[10], 0);
    }

    private zzdc(long[] jArr, int i) {
        this.zzlx = jArr;
        this.size = i;
    }

    public static com.google.android.gms.internal.clearcut.zzdc zzbx() {
        return zzlw;
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

    private final void zzk(int i, long j) {
        int i2;
        zzw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        long[] jArr = this.zzlx;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzlx, i, jArr2, i + 1, this.size - i);
            this.zzlx = jArr2;
        }
        this.zzlx[i] = j;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzk(i, ((java.lang.Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Long> collection) {
        zzw();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.clearcut.zzdc)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.clearcut.zzdc zzdcVar = (com.google.android.gms.internal.clearcut.zzdc) collection;
        int i = zzdcVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzlx;
        if (i3 > jArr.length) {
            this.zzlx = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzdcVar.zzlx, 0, this.zzlx, this.size, zzdcVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzdc)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzdc zzdcVar = (com.google.android.gms.internal.clearcut.zzdc) obj;
        if (this.size != zzdcVar.size) {
            return false;
        }
        long[] jArr = zzdcVar.zzlx;
        for (int i = 0; i < this.size; i++) {
            if (this.zzlx[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        zzg(i);
        return this.zzlx[i];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzl = 1;
        for (int i = 0; i < this.size; i++) {
            iZzl = (iZzl * 31) + com.google.android.gms.internal.clearcut.zzci.zzl(this.zzlx[i]);
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.zzlx[i]))) {
                long[] jArr = this.zzlx;
                java.lang.System.arraycopy(jArr, i + 1, jArr, i, this.size - i);
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
        long[] jArr = this.zzlx;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        zzw();
        zzg(i);
        long[] jArr = this.zzlx;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn<java.lang.Long> zzi(int i) {
        if (i >= this.size) {
            return new com.google.android.gms.internal.clearcut.zzdc(java.util.Arrays.copyOf(this.zzlx, i), this.size);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void zzm(long j) {
        zzk(this.size, j);
    }
}
