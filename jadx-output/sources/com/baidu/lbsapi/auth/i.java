package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class i extends android.os.Handler {
    final /* synthetic */ com.baidu.lbsapi.auth.LBSAuthManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.baidu.lbsapi.auth.LBSAuthManager lBSAuthManager, android.os.Looper looper) {
        super(looper);
        this.a = lBSAuthManager;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.baidu.lbsapi.auth.a.a("handleMessage !!");
        com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener = (com.baidu.lbsapi.auth.LBSAuthManagerListener) com.baidu.lbsapi.auth.LBSAuthManager.f.get(message.getData().getString("listenerKey"));
        com.baidu.lbsapi.auth.a.a("handleMessage listener = " + lBSAuthManagerListener);
        if (lBSAuthManagerListener != null) {
            lBSAuthManagerListener.onAuthResult(message.what, message.obj.toString());
        }
    }
}
