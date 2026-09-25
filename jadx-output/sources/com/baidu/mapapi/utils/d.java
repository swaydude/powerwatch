package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.content.ServiceConnection {
    d() {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (com.baidu.mapapi.utils.b.v != null) {
            com.baidu.mapapi.utils.b.v.interrupt();
        }
        android.util.Log.d(com.baidu.mapapi.utils.b.c, "onServiceConnected " + componentName);
        try {
            if (com.baidu.mapapi.utils.b.d != null) {
                com.baidu.mapframework.open.aidl.a unused = com.baidu.mapapi.utils.b.d = null;
            }
            com.baidu.mapframework.open.aidl.a unused2 = com.baidu.mapapi.utils.b.d = com.baidu.mapframework.open.aidl.a.AbstractBinderC0007a.a(iBinder);
            com.baidu.mapapi.utils.b.d.a(new com.baidu.mapapi.utils.e(this));
        } catch (android.os.RemoteException e) {
            android.util.Log.d(com.baidu.mapapi.utils.b.c, "getComOpenClient ", e);
            if (com.baidu.mapapi.utils.b.d != null) {
                com.baidu.mapframework.open.aidl.a unused3 = com.baidu.mapapi.utils.b.d = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        android.util.Log.d(com.baidu.mapapi.utils.b.c, "onServiceDisconnected " + componentName);
        if (com.baidu.mapapi.utils.b.d != null) {
            com.baidu.mapframework.open.aidl.a unused = com.baidu.mapapi.utils.b.d = null;
            boolean unused2 = com.baidu.mapapi.utils.b.u = false;
        }
    }
}
