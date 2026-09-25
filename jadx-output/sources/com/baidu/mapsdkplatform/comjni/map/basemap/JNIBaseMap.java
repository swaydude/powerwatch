package com.baidu.mapsdkplatform.comjni.map.basemap;

/* JADX INFO: loaded from: classes.dex */
public class JNIBaseMap {
    public long a;

    public static native int MapProc(long j, int i, int i2, int i3);

    public static native void SetMapCustomEnable(long j, boolean z);

    public native long AddLayer(long j, int i, int i2, java.lang.String str);

    public native boolean CleanCache(long j, int i);

    public native void ClearLayer(long j, long j2);

    public native long Create();

    public native long CreateDuplicate(long j);

    public native java.lang.String GeoPtToScrPoint(long j, int i, int i2);

    public native boolean GetBaiduHotMapCityInfo(long j);

    public native android.os.Bundle GetMapStatus(long j);

    public native java.lang.String GetNearlyObjID(long j, long j2, int i, int i2, int i3);

    public native int[] GetScreenBuf(long j, int[] iArr, int i, int i2);

    public native float GetZoomToBound(long j, android.os.Bundle bundle);

    public native boolean Init(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.String str8, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public native boolean IsBaseIndoorMapMode(long j);

    public native boolean LayersIsShow(long j, long j2);

    public native void OnBackground(long j);

    public native void OnForeground(long j);

    public native java.lang.String OnHotcityGet(long j);

    public native void OnPause(long j);

    public native boolean OnRecordAdd(long j, int i);

    public native java.lang.String OnRecordGetAll(long j);

    public native java.lang.String OnRecordGetAt(long j, int i);

    public native boolean OnRecordImport(long j, boolean z, boolean z2);

    public native boolean OnRecordReload(long j, int i, boolean z);

    public native boolean OnRecordRemove(long j, int i, boolean z);

    public native boolean OnRecordStart(long j, int i, boolean z, int i2);

    public native boolean OnRecordSuspend(long j, int i, boolean z, int i2);

    public native void OnResume(long j);

    public native java.lang.String OnSchcityGet(long j, java.lang.String str);

    public native void PostStatInfo(long j);

    public native int Release(long j);

    public native void ResetImageRes(long j);

    public native void SaveScreenToLocal(long j, java.lang.String str, android.os.Bundle bundle);

    public native java.lang.String ScrPtToGeoPoint(long j, int i, int i2);

    public native int SetCallback(long j, com.baidu.mapsdkplatform.comjni.map.basemap.BaseMapCallback baseMapCallback);

    public native void SetLayersClickable(long j, long j2, boolean z);

    public native int SetMapControlMode(long j, int i);

    public native void SetMapStatus(long j, android.os.Bundle bundle, boolean z);

    public native void ShowBaseIndoorMap(long j, boolean z);

    public native void ShowHotMap(long j, boolean z);

    public native void ShowLayers(long j, long j2, boolean z);

    public native void ShowSatelliteMap(long j, boolean z);

    public native void ShowTrafficMap(long j, boolean z);

    public native boolean SwitchBaseIndoorMapFloor(long j, java.lang.String str, java.lang.String str2);

    public native boolean SwitchLayer(long j, long j2, long j3);

    public native void UpdateLayers(long j, long j2);

    public native void addOneOverlayItem(long j, android.os.Bundle bundle);

    public native void addOverlayItems(long j, android.os.Bundle[] bundleArr, int i);

    public native boolean addtileOverlay(long j, android.os.Bundle bundle);

    public native boolean cleanSDKTileDataCache(long j, long j2);

    public native void clearHeatMapLayerCache(long j);

    public native void enableDrawHouseHeight(long j, boolean z);

    public native java.lang.String getCompassPosition(long j, long j2);

    public native android.os.Bundle getDrawingMapStatus(long j);

    public native android.os.Bundle getMapStatusLimits(long j);

    public native void getProjectionMatrix(long j, float[] fArr, int i);

    public native void getViewMatrix(long j, float[] fArr, int i);

    public native java.lang.String getfocusedBaseIndoorMapInfo(long j);

    public native boolean isDrawHouseHeightEnable(long j);

    public native void removeOneOverlayItem(long j, android.os.Bundle bundle);

    public native void resetBackgroundTransparent(long j);

    public native void setBackgroundTransparent(long j);

    public native void setCustomMapStyleParam(long j, java.lang.String str, int i);

    public native void setCustomTrafficColor(long j, long j2, long j3, long j4, long j5, boolean z);

    public native void setMapCustomEnableDynamic(long j, boolean z);

    public native void setMapStatusLimits(long j, android.os.Bundle bundle);

    public native void updateOneOverlayItem(long j, android.os.Bundle bundle);

    public native boolean updateSDKTile(long j, android.os.Bundle bundle);
}
