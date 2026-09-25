package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzce extends com.google.android.gms.internal.clearcut.zzav<java.lang.Float> implements com.google.android.gms.internal.clearcut.zzcn<java.lang.Float>, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzce zzjm;
    private int size;
    private float[] zzjn;

    static {
        com.google.android.gms.internal.clearcut.zzce zzceVar = new com.google.android.gms.internal.clearcut.zzce();
        zzjm = zzceVar;
        zzceVar.zzv();
    }

    zzce() {
        this(new float[10], 0);
    }

    private zzce(float[] fArr, int i) {
        this.zzjn = fArr;
        this.size = i;
    }

    private final void zzc(int i, float f) {
        int i2;
        zzw();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzh(i));
        }
        float[] fArr = this.zzjn;
        if (i2 < fArr.length) {
            java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzjn, i, fArr2, i + 1, this.size - i);
            this.zzjn = fArr2;
        }
        this.zzjn[i] = f;
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
        zzc(i, ((java.lang.Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        zzw();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.clearcut.zzce)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.clearcut.zzce zzceVar = (com.google.android.gms.internal.clearcut.zzce) collection;
        int i = zzceVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzjn;
        if (i3 > fArr.length) {
            this.zzjn = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzceVar.zzjn, 0, this.zzjn, this.size, zzceVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzce)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzce zzceVar = (com.google.android.gms.internal.clearcut.zzce) obj;
        if (this.size != zzceVar.size) {
            return false;
        }
        float[] fArr = zzceVar.zzjn;
        for (int i = 0; i < this.size; i++) {
            if (this.zzjn[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzg(i);
        return java.lang.Float.valueOf(this.zzjn[i]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.zzjn[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        zzg(i);
        float[] fArr = this.zzjn;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzw();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Float.valueOf(this.zzjn[i]))) {
                float[] fArr = this.zzjn;
                java.lang.System.arraycopy(fArr, i + 1, fArr, i, this.size - i);
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
        float[] fArr = this.zzjn;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzw();
        zzg(i);
        float[] fArr = this.zzjn;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(float f) {
        zzc(this.size, f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn<java.lang.Float> zzi(int i) {
        if (i >= this.size) {
            return new com.google.android.gms.internal.clearcut.zzce(java.util.Arrays.copyOf(this.zzjn, i), this.size);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
