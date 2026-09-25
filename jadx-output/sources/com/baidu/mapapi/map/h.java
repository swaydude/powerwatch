package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class h {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public h(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public boolean a(double d, double d2) {
        return this.a <= d && d <= this.c && this.b <= d2 && d2 <= this.d;
    }

    public boolean a(double d, double d2, double d3, double d4) {
        return d < this.c && this.a < d2 && d3 < this.d && this.b < d4;
    }

    public boolean a(android.graphics.Point point) {
        return a(point.x, point.y);
    }

    public boolean a(com.baidu.mapapi.map.h hVar) {
        return a(hVar.a, hVar.c, hVar.b, hVar.d);
    }

    public boolean b(com.baidu.mapapi.map.h hVar) {
        return hVar.a >= this.a && hVar.c <= this.c && hVar.b >= this.b && hVar.d <= this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("minX: " + this.a);
        sb.append(" minY: " + this.b);
        sb.append(" maxX: " + this.c);
        sb.append(" maxY: " + this.d);
        sb.append(" midX: " + this.e);
        sb.append(" midY: " + this.f);
        return sb.toString();
    }
}
