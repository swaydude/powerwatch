package com.baidu.mapapi.model.inner;

/* JADX INFO: loaded from: classes.dex */
public class MapBound implements java.io.Serializable {
    public com.baidu.mapapi.model.inner.Point ptLB;
    public com.baidu.mapapi.model.inner.Point ptRT;

    public MapBound() {
        if (this.ptLB == null) {
            this.ptLB = new com.baidu.mapapi.model.inner.Point();
        }
        if (this.ptRT == null) {
            this.ptRT = new com.baidu.mapapi.model.inner.Point();
        }
    }

    public com.baidu.mapapi.model.inner.Point getPtLB() {
        return this.ptLB;
    }

    public com.baidu.mapapi.model.inner.Point getPtRT() {
        return this.ptRT;
    }

    public void setPtLB(com.baidu.mapapi.model.inner.Point point) {
        this.ptLB = point;
    }

    public void setPtRT(com.baidu.mapapi.model.inner.Point point) {
        this.ptRT = point;
    }
}
