package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MapCustomStyleOptions {
    private java.lang.String a;
    private java.lang.String b;

    public com.baidu.mapapi.map.MapCustomStyleOptions customStyleId(java.lang.String str) {
        this.b = str;
        return this;
    }

    public java.lang.String getCustomMapStyleId() {
        return this.b;
    }

    public java.lang.String getLocalCustomStyleFilePath() {
        return this.a;
    }

    public com.baidu.mapapi.map.MapCustomStyleOptions localCustomStylePath(java.lang.String str) {
        this.a = str;
        return this;
    }
}
