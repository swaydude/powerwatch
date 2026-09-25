package com.baidu.mapsdkplatform.comjni.map.commonmemcache;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private long a = 0;
    private com.baidu.mapsdkplatform.comjni.map.commonmemcache.JNICommonMemCache b;

    public a() {
        this.b = null;
        this.b = new com.baidu.mapsdkplatform.comjni.map.commonmemcache.JNICommonMemCache();
    }

    public long a() {
        if (this.a == 0) {
            this.a = this.b.Create();
        }
        return this.a;
    }

    public void b() {
        long j = this.a;
        if (j != 0) {
            this.b.Init(j);
        }
    }
}
