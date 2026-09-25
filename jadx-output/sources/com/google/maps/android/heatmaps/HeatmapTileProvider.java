package com.google.maps.android.heatmaps;

/* JADX INFO: loaded from: classes2.dex */
public class HeatmapTileProvider implements com.google.android.gms.maps.model.TileProvider {
    public static final com.google.maps.android.heatmaps.Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private com.google.maps.android.geometry.Bounds mBounds;
    private int[] mColorMap;
    private java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> mData;
    private com.google.maps.android.heatmaps.Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private com.google.maps.android.quadtree.PointQuadTree<com.google.maps.android.heatmaps.WeightedLatLng> mTree;

    static {
        int[] iArr = {android.graphics.Color.rgb(102, 225, 0), android.graphics.Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new com.google.maps.android.heatmaps.Gradient(iArr, fArr);
    }

    public static class Builder {
        private java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> data;
        private int radius = 20;
        private com.google.maps.android.heatmaps.Gradient gradient = com.google.maps.android.heatmaps.HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;

        public com.google.maps.android.heatmaps.HeatmapTileProvider.Builder data(java.util.Collection<com.google.android.gms.maps.model.LatLng> collection) {
            return weightedData(com.google.maps.android.heatmaps.HeatmapTileProvider.wrapData(collection));
        }

        public com.google.maps.android.heatmaps.HeatmapTileProvider.Builder weightedData(java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> collection) {
            this.data = collection;
            if (collection.isEmpty()) {
                throw new java.lang.IllegalArgumentException("No input points.");
            }
            return this;
        }

        public com.google.maps.android.heatmaps.HeatmapTileProvider.Builder radius(int i) {
            this.radius = i;
            if (i < 10 || i > 50) {
                throw new java.lang.IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public com.google.maps.android.heatmaps.HeatmapTileProvider.Builder gradient(com.google.maps.android.heatmaps.Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public com.google.maps.android.heatmaps.HeatmapTileProvider.Builder opacity(double d) {
            this.opacity = d;
            if (d < 0.0d || d > 1.0d) {
                throw new java.lang.IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public com.google.maps.android.heatmaps.HeatmapTileProvider build() {
            if (this.data == null) {
                throw new java.lang.IllegalStateException("No input data: you must use either .data or .weightedData before building");
            }
            return new com.google.maps.android.heatmaps.HeatmapTileProvider(this);
        }
    }

    private HeatmapTileProvider(com.google.maps.android.heatmaps.HeatmapTileProvider.Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        int i = this.mRadius;
        this.mKernel = generateKernel(i, ((double) i) / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }

    public void setWeightedData(java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException("No input points.");
        }
        com.google.maps.android.geometry.Bounds bounds = getBounds(this.mData);
        this.mBounds = bounds;
        this.mTree = new com.google.maps.android.quadtree.PointQuadTree<>(bounds);
        java.util.Iterator<com.google.maps.android.heatmaps.WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setData(java.util.Collection<com.google.android.gms.maps.model.LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> wrapData(java.util.Collection<com.google.android.gms.maps.model.LatLng> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.maps.android.heatmaps.WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e7 A[LOOP:0: B:19:0x00e1->B:21:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0112 A[LOOP:1: B:23:0x010c->B:25:0x0112, LOOP_END] */
    @Override // com.google.android.gms.maps.model.TileProvider
    public com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        double d;
        double d2;
        com.google.maps.android.geometry.Bounds bounds;
        java.util.Collection<T> collectionSearch;
        double[][] dArr;
        double dPow = 1.0d / java.lang.Math.pow(2.0d, i3);
        int i4 = this.mRadius;
        double d3 = (((double) i4) * dPow) / 512.0d;
        double d4 = ((2.0d * d3) + dPow) / ((double) ((i4 * 2) + 512));
        double d5 = (((double) i) * dPow) - d3;
        double d6 = (((double) (i + 1)) * dPow) + d3;
        double d7 = (((double) i2) * dPow) - d3;
        double d8 = (((double) (i2 + 1)) * dPow) + d3;
        java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> arrayList = new java.util.ArrayList();
        if (d5 < 0.0d) {
            d = -1.0d;
            arrayList = this.mTree.search(new com.google.maps.android.geometry.Bounds(d5 + 1.0d, 1.0d, d7, d8));
        } else {
            d = 1.0d;
            if (d6 > 1.0d) {
                arrayList = this.mTree.search(new com.google.maps.android.geometry.Bounds(0.0d, d6 - 1.0d, d7, d8));
            } else {
                d2 = 0.0d;
            }
            bounds = new com.google.maps.android.geometry.Bounds(d5, d6, d7, d8);
            if (!bounds.intersects(new com.google.maps.android.geometry.Bounds(this.mBounds.minX - d3, this.mBounds.maxX + d3, this.mBounds.minY - d3, this.mBounds.maxY + d3))) {
                return com.google.android.gms.maps.model.TileProvider.NO_TILE;
            }
            collectionSearch = this.mTree.search(bounds);
            if (collectionSearch.isEmpty()) {
                return com.google.android.gms.maps.model.TileProvider.NO_TILE;
            }
            int i5 = this.mRadius;
            dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, (i5 * 2) + 512, (i5 * 2) + 512);
            for (T t : collectionSearch) {
                com.google.maps.android.geometry.Point point = t.getPoint();
                int i6 = (int) ((point.x - d5) / d4);
                int i7 = (int) ((point.y - d7) / d4);
                double[] dArr2 = dArr[i6];
                dArr2[i7] = dArr2[i7] + t.getIntensity();
            }
            for (com.google.maps.android.heatmaps.WeightedLatLng weightedLatLng : arrayList) {
                com.google.maps.android.geometry.Point point2 = weightedLatLng.getPoint();
                int i8 = (int) (((point2.x + d2) - d5) / d4);
                int i9 = (int) ((point2.y - d7) / d4);
                double[] dArr3 = dArr[i8];
                dArr3[i9] = dArr3[i9] + weightedLatLng.getIntensity();
            }
            return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]));
        }
        d2 = d;
        bounds = new com.google.maps.android.geometry.Bounds(d5, d6, d7, d8);
        if (!bounds.intersects(new com.google.maps.android.geometry.Bounds(this.mBounds.minX - d3, this.mBounds.maxX + d3, this.mBounds.minY - d3, this.mBounds.maxY + d3))) {
            return com.google.android.gms.maps.model.TileProvider.NO_TILE;
        }
        collectionSearch = this.mTree.search(bounds);
        if (collectionSearch.isEmpty()) {
            return com.google.android.gms.maps.model.TileProvider.NO_TILE;
        }
        int i10 = this.mRadius;
        dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, (i10 * 2) + 512, (i10 * 2) + 512);
        while (r1.hasNext()) {
            com.google.maps.android.geometry.Point point3 = t.getPoint();
            int i11 = (int) ((point3.x - d5) / d4);
            int i12 = (int) ((point3.y - d7) / d4);
            double[] dArr4 = dArr[i11];
            dArr4[i12] = dArr4[i12] + t.getIntensity();
        }
        while (r1.hasNext()) {
            com.google.maps.android.geometry.Point point4 = weightedLatLng.getPoint();
            int i13 = (int) (((point4.x + d2) - d5) / d4);
            int i14 = (int) ((point4.y - d7) / d4);
            double[] dArr5 = dArr[i13];
            dArr5[i14] = dArr5[i14] + weightedLatLng.getIntensity();
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]));
    }

    public void setGradient(com.google.maps.android.heatmaps.Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setRadius(int i) {
        this.mRadius = i;
        this.mKernel = generateKernel(i, ((double) i) / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setOpacity(double d) {
        this.mOpacity = d;
        setGradient(this.mGradient);
    }

    private double[] getMaxIntensities(int i) {
        int i2;
        double[] dArr = new double[22];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = getMaxValue(this.mData, this.mBounds, i, (int) (java.lang.Math.pow(2.0d, i3 - 3) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static com.google.android.gms.maps.model.Tile convertBitmap(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new com.google.android.gms.maps.model.Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static com.google.maps.android.geometry.Bounds getBounds(java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> collection) {
        java.util.Iterator<com.google.maps.android.heatmaps.WeightedLatLng> it = collection.iterator();
        com.google.maps.android.heatmaps.WeightedLatLng next = it.next();
        double d = next.getPoint().x;
        double d2 = next.getPoint().x;
        double d3 = d;
        double d4 = d2;
        double d5 = next.getPoint().y;
        double d6 = next.getPoint().y;
        while (it.hasNext()) {
            com.google.maps.android.heatmaps.WeightedLatLng next2 = it.next();
            double d7 = next2.getPoint().x;
            double d8 = next2.getPoint().y;
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
        return new com.google.maps.android.geometry.Bounds(d3, d4, d5, d6);
    }

    static double[] generateKernel(int i, double d) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = java.lang.Math.exp(((double) ((-i2) * i2)) / ((2.0d * d) * d));
        }
        return dArr;
    }

    static double[][] convolve(double[][] dArr, double[] dArr2) {
        int iFloor = (int) java.lang.Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i = length - (iFloor * 2);
        int i2 = 1;
        int i3 = (iFloor + i) - 1;
        double[][] dArr3 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, length, length);
        int i4 = 0;
        while (true) {
            double d = 0.0d;
            if (i4 >= length) {
                break;
            }
            int i5 = 0;
            while (i5 < length) {
                double d2 = dArr[i4][i5];
                if (d2 != d) {
                    int i6 = i4 + iFloor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - iFloor;
                    for (int i9 = iFloor > i8 ? iFloor : i8; i9 < i7; i9++) {
                        double[] dArr4 = dArr3[i9];
                        dArr4[i5] = dArr4[i5] + (dArr2[i9 - i8] * d2);
                    }
                }
                i5++;
                d = 0.0d;
            }
            i4++;
        }
        double[][] dArr5 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, i, i);
        int i10 = iFloor;
        while (i10 < i3 + 1) {
            int i11 = 0;
            while (i11 < length) {
                double d3 = dArr3[i10][i11];
                if (d3 != 0.0d) {
                    int i12 = i11 + iFloor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + i2;
                    int i14 = i11 - iFloor;
                    for (int i15 = iFloor > i14 ? iFloor : i14; i15 < i13; i15++) {
                        double[] dArr6 = dArr5[i10 - iFloor];
                        int i16 = i15 - iFloor;
                        dArr6[i16] = dArr6[i16] + (dArr2[i15 - i14] * d3);
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

    static android.graphics.Bitmap colorize(double[][] dArr, int[] iArr, double d) {
        int i = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d2 = dArr[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d2 * length);
                if (d2 != 0.0d) {
                    if (i5 < iArr.length) {
                        iArr2[i4] = iArr[i5];
                    } else {
                        iArr2[i4] = i;
                    }
                } else {
                    iArr2[i4] = 0;
                }
            }
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(length2, length2, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    static double getMaxValue(java.util.Collection<com.google.maps.android.heatmaps.WeightedLatLng> collection, com.google.maps.android.geometry.Bounds bounds, int i, int i2) {
        double d = bounds.minX;
        double d2 = bounds.maxX;
        double d3 = bounds.minY;
        double d4 = d2 - d;
        double d5 = bounds.maxY - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d4;
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray();
        double dDoubleValue = 0.0d;
        for (com.google.maps.android.heatmaps.WeightedLatLng weightedLatLng : collection) {
            double d7 = weightedLatLng.getPoint().x;
            int i3 = (int) ((weightedLatLng.getPoint().y - d3) * d6);
            long j = (int) ((d7 - d) * d6);
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
            java.lang.Double dValueOf2 = java.lang.Double.valueOf(dValueOf.doubleValue() + weightedLatLng.getIntensity());
            longSparseArray2.put(j2, dValueOf2);
            if (dValueOf2.doubleValue() > dDoubleValue) {
                dDoubleValue = dValueOf2.doubleValue();
            }
        }
        return dDoubleValue;
    }
}
