package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzaz extends com.google.android.gms.internal.clearcut.zzav<java.lang.Boolean> implements com.google.android.gms.internal.clearcut.zzcn<java.lang.Boolean>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzaz zzfg;
    private int size;
    private boolean[] zzfh;

    static {
        com.google.android.gms.internal.clearcut.zzaz zzazVar = new com.google.android.gms.internal.clearcut.zzaz();
        zzfg = zzazVar;
        zzazVar.zzv();
    }

    zzaz() {
        this(new boolean[10], 0);
    }

    private zzaz(boolean[] zArr, int i) {
        this.zzfh = zArr;
        this.size = i;
    }

    private final void zza(int i, boolean z) {
        int i2;
        zzw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        boolean[] zArr = this.zzfh;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzfh, i, zArr2, i + 1, this.size - i);
            this.zzfh = zArr2;
        }
        this.zzfh[i] = z;
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
        zza(i, ((java.lang.Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Boolean> collection) {
        zzw();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.clearcut.zzaz)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.clearcut.zzaz zzazVar = (com.google.android.gms.internal.clearcut.zzaz) collection;
        int i = zzazVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzfh;
        if (i3 > zArr.length) {
            this.zzfh = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzazVar.zzfh, 0, this.zzfh, this.size, zzazVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    public final void addBoolean(boolean z) {
        zza(this.size, z);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzaz)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzaz zzazVar = (com.google.android.gms.internal.clearcut.zzaz) obj;
        if (this.size != zzazVar.size) {
            return false;
        }
        boolean[] zArr = zzazVar.zzfh;
        for (int i = 0; i < this.size; i++) {
            if (this.zzfh[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzg(i);
        return java.lang.Boolean.valueOf(this.zzfh[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.size; i++) {
            iZzc = (iZzc * 31) + com.google.android.gms.internal.clearcut.zzci.zzc(this.zzfh[i]);
        }
        return iZzc;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        zzg(i);
        boolean[] zArr = this.zzfh;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.zzfh[i]))) {
                boolean[] zArr = this.zzfh;
                java.lang.System.arraycopy(zArr, i + 1, zArr, i, this.size - i);
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
        boolean[] zArr = this.zzfh;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzw();
        zzg(i);
        boolean[] zArr = this.zzfh;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn<java.lang.Boolean> zzi(int i) {
        if (i >= this.size) {
            return new com.google.android.gms.internal.clearcut.zzaz(java.util.Arrays.copyOf(this.zzfh, i), this.size);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
