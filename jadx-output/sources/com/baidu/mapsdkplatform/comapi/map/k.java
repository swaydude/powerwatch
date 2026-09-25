package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class k {
    private static int a;
    private static android.content.Context b = com.baidu.mapapi.BMapManager.getContext();

    static {
        if (!com.baidu.mapapi.VersionInfo.getApiVersion().equals(com.baidu.mapsdkplatform.comapi.map.VersionInfo.getApiVersion())) {
            throw new com.baidu.mapapi.common.BaiduMapSDKException("the version of map is not match with base");
        }
        com.baidu.mapsdkplatform.comapi.NativeLoader.getInstance().loadLibrary(com.baidu.mapsdkplatform.comapi.map.VersionInfo.getKitName());
        com.baidu.mapsdkvi.VMsg.InitClass(com.baidu.mapsdkvi.VMsg.getInstance());
        com.baidu.mapsdkplatform.comjni.engine.AppEngine.InitClass();
        a(com.baidu.mapapi.BMapManager.getContext());
        com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.getInstance().addObserver(new com.baidu.mapsdkplatform.comapi.commonutils.SysUpdateUtil());
        com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.getInstance().init();
    }

    public static void a() {
        if (a == 0) {
            if (b == null) {
                throw new java.lang.IllegalStateException("BDMapSDKException: you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
            }
            com.baidu.mapsdkvi.VMsg.init();
            com.baidu.mapsdkplatform.comjni.engine.AppEngine.InitEngine(b);
            com.baidu.mapsdkplatform.comjni.engine.AppEngine.StartSocketProc();
            com.baidu.mapapi.NetworkUtil.updateNetworkProxy(b);
        }
        a++;
    }

    private static void a(android.content.Context context) throws java.lang.Throwable {
        if (context == null) {
            return;
        }
        try {
            java.io.File file = new java.io.File(com.baidu.mapapi.common.SysOSUtil.getModuleFileName());
            if (!file.exists()) {
                file.mkdirs();
            }
            context.getAssets();
            java.lang.String[] strArr = {"cfg/a/mode_1/map.sdkrs", "cfg/a/mode_1/reduct.sdkrs", "cfg/a/mode_1/traffic.sdkrs", "cfg/a/mode_1/map.sty", "cfg/a/mode_1/reduct.sty", "cfg/a/mode_1/traffic.sty", "cfg/idrres/ResPackIndoorMap.sdkrs", "cfg/idrres/DVIndoor.cfg", "cfg/idrres/baseindoormap.sty", "cfg/a/DVDirectory.cfg", "cfg/a/DVHotcity.cfg", "cfg/a/DVHotMap.cfg", "cfg/a/DVSDirectory.cfg", "cfg/a/DVVersion.cfg"};
            new java.lang.String[]{"cfg/a/CustomIndex"};
            java.lang.String[] strArr2 = {"cfg/a/mode_1/map.rs", "cfg/a/mode_1/reduct.rs", "cfg/a/mode_1/traffic.rs", "cfg/a/mode_1/map.sty", "cfg/a/mode_1/reduct.sty", "cfg/a/mode_1/traffic.sty", "cfg/idrres/ResPackIndoorMap.rs", "cfg/idrres/DVIndoor.cfg", "cfg/idrres/baseindoormap.sty", "cfg/a/DVDirectory.cfg", "cfg/a/DVHotcity.cfg", "cfg/a/DVHotMap.cfg", "cfg/a/DVSDirectory.cfg", "cfg/a/DVVersion.cfg"};
            new java.lang.String[]{"cfg/a/CustomIndex"};
            try {
                java.io.File file2 = new java.io.File(com.baidu.mapapi.common.SysOSUtil.getModuleFileName() + "/ver.dat");
                boolean z = true;
                byte[] bArr = {6, 0, 0, 0, 0, 0};
                if (file2.exists()) {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                    byte[] bArr2 = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr2);
                    fileInputStream.close();
                    if (java.util.Arrays.equals(bArr2, bArr)) {
                        java.io.File file3 = new java.io.File(com.baidu.mapapi.common.SysOSUtil.getModuleFileName() + "/cfg/a/mode_1/map.sty");
                        if (file3.exists() && file3.length() > 0) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    java.io.File file4 = new java.io.File(com.baidu.mapapi.common.SysOSUtil.getModuleFileName() + "/cfg/a/mode_1");
                    if (!file4.exists()) {
                        file4.mkdirs();
                    }
                    java.io.File file5 = new java.io.File(com.baidu.mapapi.common.SysOSUtil.getModuleFileName() + "/cfg/idrres");
                    if (!file5.exists()) {
                        file5.mkdirs();
                    }
                }
                if (z) {
                    for (int i = 0; i < 14; i++) {
                        com.baidu.mapsdkplatform.comapi.commonutils.a.a(strArr[i], strArr2[i], context);
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e.m(z);
    }

    public static void b() {
        int i = a - 1;
        a = i;
        if (i == 0) {
            com.baidu.mapsdkplatform.comjni.engine.AppEngine.UnInitEngine();
            com.baidu.mapsdkvi.VMsg.destroy();
        }
    }
}
