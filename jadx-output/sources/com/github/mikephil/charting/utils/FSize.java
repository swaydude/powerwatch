package com.github.mikephil.charting.utils;

/* JADX INFO: loaded from: classes.dex */
public final class FSize extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> pool;
    public float height;
    public float width;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.FSize> objectPoolCreate = com.github.mikephil.charting.utils.ObjectPool.create(256, new com.github.mikephil.charting.utils.FSize(0.0f, 0.0f));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.utils.FSize(0.0f, 0.0f);
    }

    public static com.github.mikephil.charting.utils.FSize getInstance(float f, float f2) {
        com.github.mikephil.charting.utils.FSize fSize = (com.github.mikephil.charting.utils.FSize) pool.get();
        fSize.width = f;
        fSize.height = f2;
        return fSize;
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.FSize fSize) {
        pool.recycle(fSize);
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.FSize> list) {
        pool.recycle(list);
    }

    public FSize() {
    }

    public FSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.github.mikephil.charting.utils.FSize)) {
            return false;
        }
        com.github.mikephil.charting.utils.FSize fSize = (com.github.mikephil.charting.utils.FSize) obj;
        return this.width == fSize.width && this.height == fSize.height;
    }

    public java.lang.String toString() {
        return this.width + "x" + this.height;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.width) ^ java.lang.Float.floatToIntBits(this.height);
    }
}
