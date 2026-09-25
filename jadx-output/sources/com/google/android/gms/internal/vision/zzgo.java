package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgo extends com.google.android.gms.internal.vision.zzex<java.lang.Float> implements com.google.android.gms.internal.vision.zzgz<java.lang.Float>, com.google.android.gms.internal.vision.zzio, java.util.RandomAccess {
    private static final com.google.android.gms.internal.vision.zzgo zzvq;
    private int size;
    private float[] zzvr;

    zzgo() {
        this(new float[10], 0);
    }

    private zzgo(float[] fArr, int i) {
        this.zzvr = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdq();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzvr;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzgo)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) obj;
        if (this.size != zzgoVar.size) {
            return false;
        }
        float[] fArr = zzgoVar.zzvr;
        for (int i = 0; i < this.size; i++) {
            if (java.lang.Float.floatToIntBits(this.zzvr[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.size; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.zzvr[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzu(float f) {
        zzdq();
        int i = this.size;
        float[] fArr = this.zzvr;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzvr = fArr2;
        }
        float[] fArr3 = this.zzvr;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        zzdq();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(collection);
        if (!(collection instanceof com.google.android.gms.internal.vision.zzgo)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) collection;
        int i = zzgoVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzvr;
        if (i3 > fArr.length) {
            this.zzvr = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzgoVar.zzvr, 0, this.zzvr, this.size, zzgoVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzdq();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(java.lang.Float.valueOf(this.zzvr[i]))) {
                float[] fArr = this.zzvr;
                java.lang.System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
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
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzdq();
        zzae(i);
        float[] fArr = this.zzvr;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzdq();
        zzae(i);
        float[] fArr = this.zzvr;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        zzdq();
        if (i < 0 || i > (i2 = this.size)) {
            throw new java.lang.IndexOutOfBoundsException(zzaf(i));
        }
        float[] fArr = this.zzvr;
        if (i2 < fArr.length) {
            java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzvr, i, fArr2, i + 1, this.size - i);
            this.zzvr = fArr2;
        }
        this.zzvr[i] = fFloatValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzex, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzu(((java.lang.Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzgz
    public final /* synthetic */ com.google.android.gms.internal.vision.zzgz<java.lang.Float> zzag(int i) {
        if (i < this.size) {
            throw new java.lang.IllegalArgumentException();
        }
        return new com.google.android.gms.internal.vision.zzgo(java.util.Arrays.copyOf(this.zzvr, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzae(i);
        return java.lang.Float.valueOf(this.zzvr[i]);
    }

    static {
        com.google.android.gms.internal.vision.zzgo zzgoVar = new com.google.android.gms.internal.vision.zzgo(new float[0], 0);
        zzvq = zzgoVar;
        zzgoVar.zzdp();
    }
}
