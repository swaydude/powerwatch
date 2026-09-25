package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgi extends com.google.android.gms.internal.fitness.zzfa<java.lang.Integer> implements com.google.android.gms.internal.fitness.zzgl<java.lang.Integer>, com.google.android.gms.internal.fitness.zzhx, java.util.RandomAccess {
    private static final com.google.android.gms.internal.fitness.zzgi zzvj;
    private int size;
    private int[] zzvk;

    zzgi() {
        this(new int[10], 0);
    }

    private zzgi(int[] iArr, int i) {
        this.zzvk = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzam();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzvk;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzgi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.fitness.zzgi zzgiVar = (com.google.android.gms.internal.fitness.zzgi) obj;
        if (this.size != zzgiVar.size) {
            return false;
        }
        int[] iArr = zzgiVar.zzvk;
        for (int i = 0; i < this.size; i++) {
            if (this.zzvk[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzvk[i2];
        }
        return i;
    }

    public final int getInt(int i) {
        zzaa(i);
        return this.zzvk[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        zzam();
        com.google.android.gms.internal.fitness.zzgk.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.fitness.zzgi)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.fitness.zzgi zzgiVar = (com.google.android.gms.internal.fitness.zzgi) collection;
        int i = zzgiVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzvk;
        if (i3 > iArr.length) {
            this.zzvk = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzgiVar.zzvk, 0, this.zzvk, this.size, zzgiVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzam();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.zzvk[i]))) {
                int[] iArr = this.zzvk;
                java.lang.System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzam();
        zzaa(i);
        int[] iArr = this.zzvk;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzam();
        zzaa(i);
        int[] iArr = this.zzvk;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzam();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzab(i));
        }
        int[] iArr = this.zzvk;
        if (i2 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzvk, i, iArr2, i + 1, this.size - i);
            this.zzvk = iArr2;
        }
        this.zzvk[i] = iIntValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.zzfa, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzam();
        int i = this.size;
        int[] iArr = this.zzvk;
        if (i == iArr.length) {
            int[] iArr2 = new int[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            this.zzvk = iArr2;
        }
        int[] iArr3 = this.zzvk;
        int i2 = this.size;
        this.size = i2 + 1;
        iArr3[i2] = iIntValue;
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.zzgl
    public final /* synthetic */ com.google.android.gms.internal.fitness.zzgl<java.lang.Integer> zzac(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.fitness.zzgi(java.util.Arrays.copyOf(this.zzvk, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(getInt(i));
    }

    static {
        com.google.android.gms.internal.fitness.zzgi zzgiVar = new com.google.android.gms.internal.fitness.zzgi(new int[0], 0);
        zzvj = zzgiVar;
        zzgiVar.zzal();
    }
}
