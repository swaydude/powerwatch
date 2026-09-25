package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class CoordTrans {
    public static com.baidu.mapapi.model.LatLng baiduToGcj(com.baidu.mapapi.model.LatLng latLng) {
        double[] dArrBaiduToGcj;
        if (latLng == null || (dArrBaiduToGcj = com.baidu.mapsdkplatform.comjni.tools.JNITools.baiduToGcj(latLng.latitude, latLng.longitude)) == null) {
            return null;
        }
        return new com.baidu.mapapi.model.LatLng(dArrBaiduToGcj[0], dArrBaiduToGcj[1]);
    }

    public static com.baidu.mapapi.model.LatLng gcjToBaidu(com.baidu.mapapi.model.LatLng latLng) {
        double[] dArrGcjToBaidu;
        if (latLng == null || (dArrGcjToBaidu = com.baidu.mapsdkplatform.comjni.tools.JNITools.gcjToBaidu(latLng.latitude, latLng.longitude)) == null) {
            return null;
        }
        return new com.baidu.mapapi.model.LatLng(dArrGcjToBaidu[0], dArrGcjToBaidu[1]);
    }

    public static com.baidu.mapapi.model.LatLng wgsToBaidu(com.baidu.mapapi.model.LatLng latLng) {
        double[] dArrWgsToBaidu;
        if (latLng == null || (dArrWgsToBaidu = com.baidu.mapsdkplatform.comjni.tools.JNITools.wgsToBaidu(latLng.latitude, latLng.longitude)) == null) {
            return null;
        }
        return new com.baidu.mapapi.model.LatLng(dArrWgsToBaidu[0], dArrWgsToBaidu[1]);
    }
}
