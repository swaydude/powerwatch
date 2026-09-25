package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
class b extends android.os.Handler {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.a a;

    b(com.baidu.mapsdkplatform.comapi.a aVar) {
        this.a = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.a.a(message);
    }
}
