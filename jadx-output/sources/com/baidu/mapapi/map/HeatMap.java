package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class HeatMap {
    public static final com.baidu.mapapi.map.Gradient DEFAULT_GRADIENT;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final java.lang.String b = "HeatMap";
    private static final android.util.SparseIntArray c;
    private static final int[] d;
    private static final float[] e;
    private static int r;
    com.baidu.mapapi.map.BaiduMap a;
    private com.baidu.mapapi.map.p<com.baidu.mapapi.map.WeightedLatLng> f;
    private java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> g;
    private int h;
    private com.baidu.mapapi.map.Gradient i;
    private double j;
    private com.baidu.mapapi.map.h k;
    private int[] l;
    private double[] m;
    private double[] n;
    private java.util.HashMap<java.lang.String, com.baidu.mapapi.map.Tile> o;
    private java.util.concurrent.ExecutorService p;
    private java.util.HashSet<java.lang.String> q;

    public static class Builder {
        private java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> a;
        private int b = 12;
        private com.baidu.mapapi.map.Gradient c = com.baidu.mapapi.map.HeatMap.DEFAULT_GRADIENT;
        private double d = 0.6d;

        public com.baidu.mapapi.map.HeatMap build() {
            if (this.a != null) {
                return new com.baidu.mapapi.map.HeatMap(this, null);
            }
            throw new java.lang.IllegalStateException("BDMapSDKException: No input data: you must use either .data or .weightedData before building");
        }

        public com.baidu.mapapi.map.HeatMap.Builder data(java.util.Collection<com.baidu.mapapi.model.LatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            return weightedData(com.baidu.mapapi.map.HeatMap.c(collection));
        }

        public com.baidu.mapapi.map.HeatMap.Builder gradient(com.baidu.mapapi.map.Gradient gradient) {
            if (gradient == null) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: gradient can not be null");
            }
            this.c = gradient;
            return this;
        }

        public com.baidu.mapapi.map.HeatMap.Builder opacity(double d) {
            this.d = d;
            if (d < 0.0d || d > 1.0d) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: Opacity must be in range [0, 1]");
            }
            return this;
        }

        public com.baidu.mapapi.map.HeatMap.Builder radius(int i) {
            this.b = i;
            if (i < 10 || i > 50) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: Radius not within bounds.");
            }
            return this;
        }

        public com.baidu.mapapi.map.HeatMap.Builder weightedData(java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new java.lang.IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.baidu.mapapi.map.WeightedLatLng weightedLatLng : collection) {
                com.baidu.mapapi.model.LatLng latLng = weightedLatLng.latLng;
                if (latLng.latitude < 0.37532d || latLng.latitude > 54.562495d || latLng.longitude < 72.508319d || latLng.longitude > 135.942198d) {
                    arrayList.add(weightedLatLng);
                }
            }
            collection.removeAll(arrayList);
            this.a = collection;
            return this;
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(3, 8388608);
        sparseIntArray.put(4, 4194304);
        sparseIntArray.put(5, 2097152);
        sparseIntArray.put(6, 1048576);
        sparseIntArray.put(7, 524288);
        sparseIntArray.put(8, 262144);
        sparseIntArray.put(9, 131072);
        sparseIntArray.put(10, 65536);
        sparseIntArray.put(11, 32768);
        sparseIntArray.put(12, 16384);
        sparseIntArray.put(13, 8192);
        sparseIntArray.put(14, 4096);
        sparseIntArray.put(15, 2048);
        sparseIntArray.put(16, 1024);
        sparseIntArray.put(17, 512);
        sparseIntArray.put(18, 256);
        sparseIntArray.put(19, 128);
        sparseIntArray.put(20, 64);
        int[] iArr = {android.graphics.Color.rgb(0, 0, 200), android.graphics.Color.rgb(0, 225, 0), android.graphics.Color.rgb(255, 0, 0)};
        d = iArr;
        float[] fArr = {0.08f, 0.4f, 1.0f};
        e = fArr;
        DEFAULT_GRADIENT = new com.baidu.mapapi.map.Gradient(iArr, fArr);
        r = 0;
    }

    private HeatMap(com.baidu.mapapi.map.HeatMap.Builder builder) {
        this.o = new java.util.HashMap<>();
        this.p = java.util.concurrent.Executors.newFixedThreadPool(1);
        this.q = new java.util.HashSet<>();
        this.g = builder.a;
        this.h = builder.b;
        this.i = builder.c;
        this.j = builder.d;
        int i = this.h;
        this.m = a(i, ((double) i) / 3.0d);
        a(this.i);
        b(this.g);
    }

    /* synthetic */ HeatMap(com.baidu.mapapi.map.HeatMap.Builder builder, com.baidu.mapapi.map.j jVar) {
        this(builder);
    }

    private static double a(java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> collection, com.baidu.mapapi.map.h hVar, int i, int i2) {
        double d2 = hVar.a;
        double d3 = hVar.c;
        double d4 = hVar.b;
        double d5 = d3 - d2;
        double d6 = hVar.d - d4;
        if (d5 <= d6) {
            d5 = d6;
        }
        double d7 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d5;
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray();
        double dDoubleValue = 0.0d;
        for (com.baidu.mapapi.map.WeightedLatLng weightedLatLng : collection) {
            double d8 = weightedLatLng.a().x;
            int i3 = (int) ((((double) weightedLatLng.a().y) - d4) * d7);
            long j = (int) ((d8 - d2) * d7);
            androidx.collection.LongSparseArray longSparseArray2 = (androidx.collection.LongSparseArray) longSparseArray.get(j);
            if (longSparseArray2 == null) {
                longSparseArray2 = new androidx.collection.LongSparseArray();
                longSparseArray.put(j, longSparseArray2);
            }
            long j2 = i3;
            java.lang.Double dValueOf = (java.lang.Double) longSparseArray2.get(j2);
            if (dValueOf == null) {
                dValueOf = java.lang.Double.valueOf(0.0d);
            }
            androidx.collection.LongSparseArray longSparseArray3 = longSparseArray;
            double d9 = d2;
            java.lang.Double dValueOf2 = java.lang.Double.valueOf(dValueOf.doubleValue() + weightedLatLng.intensity);
            longSparseArray2.put(j2, dValueOf2);
            if (dValueOf2.doubleValue() > dDoubleValue) {
                dDoubleValue = dValueOf2.doubleValue();
            }
            longSparseArray = longSparseArray3;
            d2 = d9;
        }
        return dDoubleValue;
    }

    private static android.graphics.Bitmap a(double[][] dArr, int[] iArr, double d2) {
        int i = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d3 = dArr[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d3 * length);
                if (d3 == 0.0d) {
                    iArr2[i4] = 0;
                } else if (i5 < iArr.length) {
                    iArr2[i4] = iArr[i5];
                } else {
                    iArr2[i4] = i;
                }
            }
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(length2, length2, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static com.baidu.mapapi.map.Tile a(android.graphics.Bitmap bitmap) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return new com.baidu.mapapi.map.Tile(256, 256, byteBufferAllocate.array());
    }

    private void a(com.baidu.mapapi.map.Gradient gradient) {
        this.i = gradient;
        this.l = gradient.a(this.j);
    }

    private synchronized void a(java.lang.String str, com.baidu.mapapi.map.Tile tile) {
        this.o.put(str, tile);
    }

    private synchronized boolean a(java.lang.String str) {
        return this.q.contains(str);
    }

    private double[] a(int i) {
        int i2;
        double[] dArr = new double[20];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = a(this.g, this.k, i, (int) (java.lang.Math.pow(2.0d, i3 - 3) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 20; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static double[] a(int i, double d2) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = java.lang.Math.exp(((double) ((-i2) * i2)) / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
        int iFloor = (int) java.lang.Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i = length - (iFloor * 2);
        int i2 = 1;
        int i3 = (iFloor + i) - 1;
        double[][] dArr3 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, length, length);
        int i4 = 0;
        while (true) {
            double d2 = 0.0d;
            if (i4 >= length) {
                break;
            }
            int i5 = 0;
            while (i5 < length) {
                double d3 = dArr[i4][i5];
                if (d3 != d2) {
                    int i6 = i4 + iFloor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - iFloor;
                    for (int i9 = iFloor > i8 ? iFloor : i8; i9 < i7; i9++) {
                        double[] dArr4 = dArr3[i9];
                        dArr4[i5] = dArr4[i5] + (dArr2[i9 - i8] * d3);
                    }
                }
                i5++;
                d2 = 0.0d;
            }
            i4++;
        }
        double[][] dArr5 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, i, i);
        int i10 = iFloor;
        while (i10 < i3 + 1) {
            int i11 = 0;
            while (i11 < length) {
                double d4 = dArr3[i10][i11];
                if (d4 != 0.0d) {
                    int i12 = i11 + iFloor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + i2;
                    int i14 = i11 - iFloor;
                    for (int i15 = iFloor > i14 ? iFloor : i14; i15 < i13; i15++) {
                        double[] dArr6 = dArr5[i10 - iFloor];
                        int i16 = i15 - iFloor;
                        dArr6[i16] = dArr6[i16] + (dArr2[i15 - i14] * d4);
                    }
                }
                i11++;
                i2 = 1;
            }
            i10++;
            i2 = 1;
        }
        return dArr5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, int i3) {
        double d2 = c.get(i3);
        int i4 = this.h;
        double d3 = (((double) i4) * d2) / 256.0d;
        double d4 = ((2.0d * d3) + d2) / ((double) ((i4 * 2) + 256));
        if (i < 0 || i2 < 0) {
            return;
        }
        double d5 = (((double) i) * d2) - d3;
        double d6 = (((double) (i + 1)) * d2) + d3;
        double d7 = (((double) i2) * d2) - d3;
        double d8 = (((double) (i2 + 1)) * d2) + d3;
        com.baidu.mapapi.map.h hVar = new com.baidu.mapapi.map.h(d5, d6, d7, d8);
        if (hVar.a(new com.baidu.mapapi.map.h(this.k.a - d3, this.k.c + d3, this.k.b - d3, this.k.d + d3))) {
            java.util.Collection<T> collectionA = this.f.a(hVar);
            if (collectionA.isEmpty()) {
                return;
            }
            int i5 = this.h;
            double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, (i5 * 2) + 256, (i5 * 2) + 256);
            for (T t : collectionA) {
                android.graphics.Point pointA = t.a();
                int i6 = (int) ((((double) pointA.x) - d5) / d4);
                int i7 = (int) ((d8 - ((double) pointA.y)) / d4);
                int i8 = this.h;
                if (i6 >= (i8 * 2) + 256) {
                    i6 = ((i8 * 2) + 256) - 1;
                }
                if (i7 >= (i8 * 2) + 256) {
                    i7 = ((i8 * 2) + 256) - 1;
                }
                double[] dArr2 = dArr[i6];
                dArr2[i7] = dArr2[i7] + t.intensity;
                d8 = d8;
            }
            android.graphics.Bitmap bitmapA = a(a(dArr, this.m), this.l, this.n[i3 - 1]);
            com.baidu.mapapi.map.Tile tileA = a(bitmapA);
            bitmapA.recycle();
            a(i + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i3, tileA);
            if (this.o.size() > r) {
                a();
            }
            com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
            if (baiduMap != null) {
                baiduMap.a();
            }
        }
    }

    private synchronized void b(java.lang.String str) {
        this.q.add(str);
    }

    private void b(java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> collection) {
        this.g = collection;
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: No input points.");
        }
        com.baidu.mapapi.map.h hVarD = d(this.g);
        this.k = hVarD;
        this.f = new com.baidu.mapapi.map.p<>(hVarD);
        java.util.Iterator<com.baidu.mapapi.map.WeightedLatLng> it = this.g.iterator();
        while (it.hasNext()) {
            this.f.a(it.next());
        }
        this.n = a(this.h);
    }

    private synchronized com.baidu.mapapi.map.Tile c(java.lang.String str) {
        if (!this.o.containsKey(str)) {
            return null;
        }
        com.baidu.mapapi.map.Tile tile = this.o.get(str);
        this.o.remove(str);
        return tile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> c(java.util.Collection<com.baidu.mapapi.model.LatLng> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.baidu.mapapi.model.LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.baidu.mapapi.map.WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    private static com.baidu.mapapi.map.h d(java.util.Collection<com.baidu.mapapi.map.WeightedLatLng> collection) {
        java.util.Iterator<com.baidu.mapapi.map.WeightedLatLng> it = collection.iterator();
        com.baidu.mapapi.map.WeightedLatLng next = it.next();
        double d2 = next.a().x;
        double d3 = d2;
        double d4 = next.a().x;
        double d5 = next.a().y;
        double d6 = next.a().y;
        while (it.hasNext()) {
            com.baidu.mapapi.map.WeightedLatLng next2 = it.next();
            double d7 = next2.a().x;
            double d8 = next2.a().y;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new com.baidu.mapapi.map.h(d3, d4, d5, d6);
    }

    private synchronized void d() {
        this.o.clear();
    }

    com.baidu.mapapi.map.Tile a(int i, int i2, int i3) {
        java.lang.String str = i + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i2 + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + i3;
        com.baidu.mapapi.map.Tile tileC = c(str);
        if (tileC != null) {
            return tileC;
        }
        if (a(str)) {
            return null;
        }
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        if (baiduMap != null && r == 0) {
            com.baidu.mapapi.map.MapStatus mapStatus = baiduMap.getMapStatus();
            r = (((mapStatus.a.j.right - mapStatus.a.j.left) / 256) + 2) * (((mapStatus.a.j.bottom - mapStatus.a.j.top) / 256) + 2) * 4;
        }
        if (this.o.size() > r) {
            a();
        }
        if (this.p.isShutdown()) {
            return null;
        }
        try {
            this.p.execute(new com.baidu.mapapi.map.j(this, i, i2, i3));
            b(str);
            return null;
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    synchronized void a() {
        this.q.clear();
        this.o.clear();
    }

    void b() {
        d();
    }

    void c() {
        this.p.shutdownNow();
    }

    public void removeHeatMap() {
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        if (baiduMap != null) {
            baiduMap.a(this);
        }
    }
}
