package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
final class c extends com.baidu.mapframework.open.aidl.b.a {
    final /* synthetic */ int a;

    c(int i) {
        this.a = i;
    }

    @Override // com.baidu.mapframework.open.aidl.b
    public void a(android.os.IBinder iBinder) throws android.os.RemoteException {
        android.util.Log.d(com.baidu.mapapi.utils.b.c, "onClientReady");
        if (com.baidu.mapapi.utils.b.e != null) {
            com.baidu.mapframework.open.aidl.IComOpenClient unused = com.baidu.mapapi.utils.b.e = null;
        }
        com.baidu.mapframework.open.aidl.IComOpenClient unused2 = com.baidu.mapapi.utils.b.e = com.baidu.mapframework.open.aidl.IComOpenClient.a.a(iBinder);
        com.baidu.mapapi.utils.b.a(this.a);
        boolean unused3 = com.baidu.mapapi.utils.b.t = true;
    }
}
