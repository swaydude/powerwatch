package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgu extends com.google.android.gms.internal.vision.zzex<java.lang.Integer> implements com.google.android.gms.internal.vision.zzgz<java.lang.Integer>, com.google.android.gms.internal.vision.zzio, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzgu zzxf;
    private int size;
    private int[] zzxg;

    public static com.google.android.gms.internal.vision.zzgu zzgl() {
        return zzxf;
    }

    zzgu() {
        this(new int[10], 0);
    }

    private zzgu(int[] iArr, int i) {
        this.zzxg = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzxg;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzgu)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) obj;
        if (this.size != zzguVar.size) {
            return false;
        }
        int[] iArr = zzguVar.zzxg;
        for (int i = 0; i < this.size; i++) {
            if (this.zzxg[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzxg[i2];
        }
        return i;
    }

    public final int getInt(int i) {
        zzae(i);
        return this.zzxg[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzbl(int i) {
        zzdq();
        int i2 = this.size;
        int[] iArr = this.zzxg;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzxg = iArr2;
        }
        int[] iArr3 = this.zzxg;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Integer> collection) {
        zzdq();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.vision.zzgu)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) collection;
        int i = zzguVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzxg;
        if (i3 > iArr.length) {
            this.zzxg = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzguVar.zzxg, 0, this.zzxg, this.size, zzguVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzdq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.zzxg[i]))) {
                int[] iArr = this.zzxg;
                java.lang.System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzdq();
        zzae(i);
        int[] iArr = this.zzxg;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        zzae(i);
        int[] iArr = this.zzxg;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int iIntValue = ((java.lang.Integer) obj).intValue();
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        int[] iArr = this.zzxg;
        if (i2 < iArr.length) {
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzxg, i, iArr2, i + 1, this.size - i);
            this.zzxg = iArr2;
        }
        this.zzxg[i] = iIntValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzbl(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz<java.lang.Integer> zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zzgu(java.util.Arrays.copyOf(this.zzxg, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(getInt(i));
    }

    static {
        com.google.android.gms.internal.vision.zzgu zzguVar = new com.google.android.gms.internal.vision.zzgu(new int[0], 0);
        zzxf = zzguVar;
        zzguVar.zzdp();
    }
}
