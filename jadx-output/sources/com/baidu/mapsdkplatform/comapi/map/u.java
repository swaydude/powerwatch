package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
class u extends android.os.Handler {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.map.t a;

    u(com.baidu.mapsdkplatform.comapi.map.t tVar) {
        this.a = tVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        if (com.baidu.mapsdkplatform.comapi.map.t.c != null) {
            this.a.d.a(message);
        }
    }
}
