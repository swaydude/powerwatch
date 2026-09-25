package com.baidu.mapapi.model.inner;

/* JADX INFO: loaded from: classes.dex */
public class Point implements java.io.Serializable {
    public int x;
    public int y;

    public Point() {
    }

    public Point(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.baidu.mapapi.model.inner.Point point = (com.baidu.mapapi.model.inner.Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    public int getmPtx() {
        return this.x;
    }

    public int getmPty() {
        return this.y;
    }

    public int hashCode() {
        return ((this.x + 31) * 31) + this.y;
    }

    public void setmPtx(int i) {
        this.x = i;
    }

    public void setmPty(int i) {
        this.y = i;
    }

    public java.lang.String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }
}
