package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class SysUpdateObservable {
    private static volatile com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable a;
    private java.util.List<com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver> b;

    private SysUpdateObservable() {
        this.b = null;
        this.b = new java.util.ArrayList();
    }

    public static com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable getInstance() {
        if (a == null) {
            synchronized (com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.class) {
                if (a == null) {
                    a = new com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable();
                }
            }
        }
        return a;
    }

    public void addObserver(com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver sysUpdateObserver) {
        this.b.add(sysUpdateObserver);
    }

    public void init() {
        for (com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.init();
            }
        }
    }

    public void updateNetworkInfo(android.content.Context context) {
        for (com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateNetworkInfo(context);
            }
        }
    }

    public void updateNetworkProxy(android.content.Context context) {
        for (com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateNetworkProxy(context);
            }
        }
    }

    public void updatePhoneInfo() {
        for (com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updatePhoneInfo();
            }
        }
    }
}
