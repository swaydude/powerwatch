package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzch extends com.google.android.gms.internal.clearcut.zzav<java.lang.Integer> implements com.google.android.gms.internal.clearcut.zzcn<java.lang.Integer>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzch zzkr;
    private int size;
    private int[] zzks;

    static {
        com.google.android.gms.internal.clearcut.zzch zzchVar = new com.google.android.gms.internal.clearcut.zzch();
        zzkr = zzchVar;
        zzchVar.zzv();
    }

    zzch() {
        this(new int[10], 0);
    }

    private zzch(int[] iArr, int i) {
        this.zzks = iArr;
        this.size = i;
    }

    public static com.google.android.gms.internal.clearcut.zzch zzbk() {
        return zzkr;
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

    private final void zzo(int i, int i2) {
        int i3;
        zzw();
        if (i < 0 || i > (i3 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        int[] iArr = this.zzks;
        if (i3 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzks, i, iArr2, i + 1, this.size - i);
            this.zzks = iArr2;
        }
        this.zzks[i] = i2;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzo(i, ((java.lang.Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        zzw();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.clearcut.zzch)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) collection;
        int i = zzchVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzks;
        if (i3 > iArr.length) {
            this.zzks = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzchVar.zzks, 0, this.zzks, this.size, zzchVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzch)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) obj;
        if (this.size != zzchVar.size) {
            return false;
        }
        int[] iArr = zzchVar.zzks;
        for (int i = 0; i < this.size; i++) {
            if (this.zzks[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        zzg(i);
        return this.zzks[i];
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzks[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        zzg(i);
        int[] iArr = this.zzks;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.size--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.zzks[i]))) {
                int[] iArr = this.zzks;
                java.lang.System.arraycopy(iArr, i + 1, iArr, i, this.size - i);
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
        int[] iArr = this.zzks;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzw();
        zzg(i);
        int[] iArr = this.zzks;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzac(int i) {
        zzo(this.size, i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn<java.lang.Integer> zzi(int i) {
        if (i >= this.size) {
            return new com.google.android.gms.internal.clearcut.zzch(java.util.Arrays.copyOf(this.zzks, i), this.size);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
