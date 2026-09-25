package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapBaseIndoorMapInfo {
    private static final java.lang.String d = "MapBaseIndoorMapInfo";
    java.lang.String a;
    java.lang.String b;
    java.util.ArrayList<java.lang.String> c;

    public enum SwitchFloorError {
        SWITCH_OK,
        FLOOR_INFO_ERROR,
        FLOOR_OVERLFLOW,
        FOCUSED_ID_ERROR,
        SWITCH_ERROR
    }

    public MapBaseIndoorMapInfo() {
    }

    public MapBaseIndoorMapInfo(com.baidu.mapapi.map.MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        this.a = mapBaseIndoorMapInfo.a;
        this.b = mapBaseIndoorMapInfo.b;
        this.c = mapBaseIndoorMapInfo.c;
    }

    public MapBaseIndoorMapInfo(java.lang.String str, java.lang.String str2, java.util.ArrayList<java.lang.String> arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public java.lang.String getCurFloor() {
        return this.b;
    }

    public java.util.ArrayList<java.lang.String> getFloors() {
        return this.c;
    }

    public java.lang.String getID() {
        return this.a;
    }
}
