package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.baidu.mapsdkplatform.comapi.util.PermissionCheck.c {
    private static final java.lang.String a = "a";
    private static com.baidu.mapsdkplatform.comapi.a g = null;
    private static int h = -100;
    private android.content.Context b;
    private android.os.Handler c;
    private com.baidu.mapsdkplatform.comapi.e d;
    private java.lang.String e;
    private int f;

    static {
        com.baidu.mapsdkplatform.comapi.NativeLoader.getInstance().loadLibrary(com.baidu.mapapi.VersionInfo.getKitName());
        com.baidu.mapsdkplatform.comjni.tools.a.b();
    }

    private a() {
    }

    public static com.baidu.mapsdkplatform.comapi.a a() {
        if (g == null) {
            g = new com.baidu.mapsdkplatform.comapi.a();
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.os.Message message) {
        android.content.Intent intent;
        if (message.what != 2012) {
            if (message.arg2 == 3) {
                this.b.sendBroadcast(new android.content.Intent(com.baidu.mapapi.SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR));
            }
            if (message.arg2 != 2 && message.arg2 != 404 && message.arg2 != 5 && message.arg2 != 8) {
                return;
            } else {
                intent = new android.content.Intent(com.baidu.mapapi.SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);
            }
        } else if (message.arg1 == 0) {
            intent = new android.content.Intent(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_OK);
        } else {
            android.content.Intent intent2 = new android.content.Intent(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR);
            intent2.putExtra(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, message.arg1);
            intent2.putExtra(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_MESSAGE, (java.lang.String) message.obj);
            intent = intent2;
        }
        this.b.sendBroadcast(intent);
    }

    private void f() {
        com.baidu.mapsdkplatform.comapi.e eVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        android.content.Context context = this.b;
        if (context == null || (eVar = this.d) == null) {
            return;
        }
        context.registerReceiver(eVar, intentFilter);
    }

    private void g() {
        android.content.Context context;
        com.baidu.mapsdkplatform.comapi.e eVar = this.d;
        if (eVar == null || (context = this.b) == null) {
            return;
        }
        context.unregisterReceiver(eVar);
    }

    public void a(android.content.Context context) {
        this.b = context;
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.PermissionCheck.c
    public void a(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.b bVar) {
        if (bVar == null) {
            return;
        }
        if (bVar.a == 0) {
            com.baidu.mapsdkplatform.comapi.util.h.d = bVar.e;
            com.baidu.mapsdkplatform.comapi.util.h.a(bVar.b, bVar.c);
        } else {
            android.util.Log.e("baidumapsdk", "Authentication Error\n" + bVar.toString());
        }
        if (bVar.a != com.baidu.mapsdkplatform.comapi.util.PermissionCheck.b && bVar.a != com.baidu.mapsdkplatform.comapi.util.PermissionCheck.a && bVar.a != com.baidu.mapsdkplatform.comapi.util.PermissionCheck.c) {
            com.baidu.mapsdkplatform.comapi.util.c.a().a(bVar.f);
        }
        if (this.c == null || bVar.a == h) {
            return;
        }
        h = bVar.a;
        android.os.Message messageObtainMessage = this.c.obtainMessage();
        messageObtainMessage.what = 2012;
        messageObtainMessage.arg1 = bVar.a;
        messageObtainMessage.obj = bVar.d;
        this.c.sendMessage(messageObtainMessage);
    }

    public void a(java.lang.String str) {
        this.e = str;
    }

    public void b() {
        if (this.f == 0) {
            if (this.b == null) {
                throw new java.lang.IllegalStateException("BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
            }
            this.d = new com.baidu.mapsdkplatform.comapi.e();
            f();
            com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.getInstance().updateNetworkInfo(this.b);
        }
        this.f++;
    }

    public boolean c() {
        if (this.b == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
        }
        this.c = new com.baidu.mapsdkplatform.comapi.b(this);
        com.baidu.mapsdkplatform.comapi.util.h.b(this.b);
        com.baidu.mapsdkplatform.comapi.util.c.a().a(this.b);
        com.baidu.mapsdkplatform.comapi.util.h.f();
        com.baidu.mapsdkplatform.comapi.util.PermissionCheck.init(this.b);
        com.baidu.mapsdkplatform.comapi.util.PermissionCheck.setPermissionCheckResultListener(this);
        com.baidu.mapsdkplatform.comapi.util.PermissionCheck.permissionCheck();
        return true;
    }

    public void d() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            g();
            com.baidu.mapsdkplatform.comapi.util.h.a();
        }
    }

    public android.content.Context e() {
        android.content.Context context = this.b;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
    }
}
