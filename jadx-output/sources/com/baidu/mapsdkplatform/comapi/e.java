package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
public class e extends android.content.BroadcastReceiver {
    public static final java.lang.String a = "e";

    public void a(android.content.Context context) {
        java.lang.String currentNetMode = com.baidu.mapapi.NetworkUtil.getCurrentNetMode(context);
        java.lang.String strE = com.baidu.mapsdkplatform.comapi.util.h.e();
        if (strE == null || strE.equals(currentNetMode)) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.util.h.a(currentNetMode);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a(context);
        com.baidu.mapapi.NetworkUtil.updateNetworkProxy(context);
    }
}
