package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Overlay {
    int A;
    boolean B;
    android.os.Bundle C;
    protected com.baidu.mapapi.map.Overlay.a listener;
    public com.baidu.mapsdkplatform.comapi.map.j type;
    java.lang.String z = java.lang.System.currentTimeMillis() + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + hashCode();

    interface a {
        void a(com.baidu.mapapi.map.Overlay overlay);

        void b(com.baidu.mapapi.map.Overlay overlay);

        boolean c(com.baidu.mapapi.map.Overlay overlay);
    }

    protected Overlay() {
    }

    static void a(int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putFloat("red", ((i >> 16) & 255) / 255.0f);
        bundle2.putFloat("green", ((i >> 8) & 255) / 255.0f);
        bundle2.putFloat("blue", (i & 255) / 255.0f);
        bundle2.putFloat("alpha", (i >>> 24) / 255.0f);
        bundle.putBundle("color", bundle2);
    }

    static void a(java.util.List<com.baidu.mapapi.model.LatLng> list, android.os.Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i = 0; i < size; i++) {
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(list.get(i));
            dArr[i] = geoPointLl2mc.getLongitudeE6();
            dArr2[i] = geoPointLl2mc.getLatitudeE6();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
    }

    static boolean b(java.util.List<com.baidu.mapapi.map.HoleOptions> list, android.os.Bundle bundle) {
        boolean zC;
        boolean zD;
        if (list == null || list.size() == 0) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.baidu.mapapi.map.HoleOptions holeOptions : list) {
            if (holeOptions instanceof com.baidu.mapapi.map.CircleHoleOptions) {
                arrayList.add((com.baidu.mapapi.map.CircleHoleOptions) holeOptions);
            } else if (holeOptions instanceof com.baidu.mapapi.map.PolygonHoleOptions) {
                arrayList2.add((com.baidu.mapapi.map.PolygonHoleOptions) holeOptions);
            }
        }
        if (arrayList.size() != 0) {
            zC = c(arrayList, bundle);
            bundle.putInt("has_circle_hole", zC ? 1 : 0);
        } else {
            bundle.putInt("has_circle_hole", 0);
            zC = false;
        }
        if (arrayList2.size() != 0) {
            zD = d(arrayList2, bundle);
            bundle.putInt("has_polygon_hole", zD ? 1 : 0);
        } else {
            bundle.putInt("has_polygon_hole", 0);
            zD = false;
        }
        return zC || zD;
    }

    private static boolean c(java.util.List<com.baidu.mapapi.map.CircleHoleOptions> list, android.os.Bundle bundle) {
        int size = list.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            com.baidu.mapapi.model.LatLng holeCenter = list.get(i).getHoleCenter();
            int holeRadius = list.get(i).getHoleRadius();
            if (holeCenter == null || holeRadius <= 0) {
                return false;
            }
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(holeCenter);
            dArr[i] = geoPointLl2mc.getLongitudeE6();
            dArr2[i] = geoPointLl2mc.getLatitudeE6();
            iArr[i] = holeRadius;
        }
        bundle.putDoubleArray("circle_hole_x_array", dArr);
        bundle.putDoubleArray("circle_hole_y_array", dArr2);
        bundle.putIntArray("circle_hole_radius_array", iArr);
        return true;
    }

    private static boolean d(java.util.List<com.baidu.mapapi.map.PolygonHoleOptions> list, android.os.Bundle bundle) {
        int size = list.size();
        int[] iArr = new int[size];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            java.util.List<com.baidu.mapapi.model.LatLng> holePoints = list.get(i).getHolePoints();
            if (holePoints == null) {
                return false;
            }
            arrayList.addAll(holePoints);
            iArr[i] = holePoints.size();
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return false;
        }
        bundle.putIntArray("polygon_hole_count_array", iArr);
        double[] dArr = new double[size2];
        double[] dArr2 = new double[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc((com.baidu.mapapi.model.LatLng) arrayList.get(i2));
            dArr[i2] = geoPointLl2mc.getLongitudeE6();
            dArr2[i2] = geoPointLl2mc.getLatitudeE6();
        }
        bundle.putDoubleArray("polygon_hole_x_array", dArr);
        bundle.putDoubleArray("polygon_hole_y_array", dArr2);
        return true;
    }

    android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("id", this.z);
        bundle.putInt("type", this.type.ordinal());
        return bundle;
    }

    android.os.Bundle a(android.os.Bundle bundle) {
        bundle.putString("id", this.z);
        bundle.putInt("type", this.type.ordinal());
        bundle.putInt("visibility", this.B ? 1 : 0);
        bundle.putInt("z_index", this.A);
        return bundle;
    }

    public android.os.Bundle getExtraInfo() {
        return this.C;
    }

    public int getZIndex() {
        return this.A;
    }

    public boolean isRemoved() {
        return this.listener.c(this);
    }

    public boolean isVisible() {
        return this.B;
    }

    public void remove() {
        this.listener.a(this);
    }

    public void setExtraInfo(android.os.Bundle bundle) {
        this.C = bundle;
    }

    public void setVisible(boolean z) {
        this.B = z;
        this.listener.b(this);
    }

    public void setZIndex(int i) {
        this.A = i;
        this.listener.b(this);
    }
}
