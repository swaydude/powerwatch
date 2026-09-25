package com.baidu.mapsdkplatform.comapi.commonutils;

/* JADX INFO: loaded from: classes.dex */
public class SysUpdateUtil implements com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver {
    static com.baidu.mapsdkplatform.comjni.map.commonmemcache.a a = new com.baidu.mapsdkplatform.comjni.map.commonmemcache.a();
    public static boolean b = false;
    public static java.lang.String c = "";
    public static int d = 0;

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void init() {
        com.baidu.mapsdkplatform.comjni.map.commonmemcache.a aVar = a;
        if (aVar != null) {
            aVar.a();
            a.b();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkInfo(android.content.Context context) {
        com.baidu.mapapi.NetworkUtil.updateNetworkProxy(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if ("10.0.0.200".equals(r9.trim()) != false) goto L50;
     */
    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateNetworkProxy(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapsdkplatform.comapi.commonutils.SysUpdateUtil.updateNetworkProxy(android.content.Context):void");
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updatePhoneInfo() {
        com.baidu.mapsdkplatform.comjni.map.commonmemcache.a aVar = a;
        if (aVar != null) {
            aVar.b();
        }
    }
}
