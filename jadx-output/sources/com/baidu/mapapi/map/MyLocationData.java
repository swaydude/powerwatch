package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MyLocationData {
    public final float accuracy;
    public final float direction;
    public final double latitude;
    public final double longitude;
    public final int satellitesNum;
    public final float speed;

    public static class Builder {
        private double a;
        private double b;
        private float c;
        private float d;
        private float e;
        private int f;

        public com.baidu.mapapi.map.MyLocationData.Builder accuracy(float f) {
            this.e = f;
            return this;
        }

        public com.baidu.mapapi.map.MyLocationData build() {
            return new com.baidu.mapapi.map.MyLocationData(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public com.baidu.mapapi.map.MyLocationData.Builder direction(float f) {
            this.d = f;
            return this;
        }

        public com.baidu.mapapi.map.MyLocationData.Builder latitude(double d) {
            this.a = d;
            return this;
        }

        public com.baidu.mapapi.map.MyLocationData.Builder longitude(double d) {
            this.b = d;
            return this;
        }

        public com.baidu.mapapi.map.MyLocationData.Builder satellitesNum(int i) {
            this.f = i;
            return this;
        }

        public com.baidu.mapapi.map.MyLocationData.Builder speed(float f) {
            this.c = f;
            return this;
        }
    }

    MyLocationData(double d, double d2, float f, float f2, float f3, int i) {
        this.latitude = d;
        this.longitude = d2;
        this.speed = f;
        this.direction = f2;
        this.accuracy = f3;
        this.satellitesNum = i;
    }
}
