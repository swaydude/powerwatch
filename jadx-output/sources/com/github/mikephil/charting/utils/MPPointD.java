package com.github.mikephil.charting.utils;

/* JADX INFO: loaded from: classes.dex */
public class MPPointD extends com.github.mikephil.charting.utils.ObjectPool.Poolable {
    private static com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> pool;
    public double x;
    public double y;

    static {
        com.github.mikephil.charting.utils.ObjectPool<com.github.mikephil.charting.utils.MPPointD> objectPoolCreate = com.github.mikephil.charting.utils.ObjectPool.create(64, new com.github.mikephil.charting.utils.MPPointD(0.0d, 0.0d));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public static com.github.mikephil.charting.utils.MPPointD getInstance(double d, double d2) {
        com.github.mikephil.charting.utils.MPPointD mPPointD = (com.github.mikephil.charting.utils.MPPointD) pool.get();
        mPPointD.x = d;
        mPPointD.y = d2;
        return mPPointD;
    }

    public static void recycleInstance(com.github.mikephil.charting.utils.MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(java.util.List<com.github.mikephil.charting.utils.MPPointD> list) {
        pool.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    protected com.github.mikephil.charting.utils.ObjectPool.Poolable instantiate() {
        return new com.github.mikephil.charting.utils.MPPointD(0.0d, 0.0d);
    }

    private MPPointD(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public java.lang.String toString() {
        return "MPPointD, x: " + this.x + ", y: " + this.y;
    }
}
