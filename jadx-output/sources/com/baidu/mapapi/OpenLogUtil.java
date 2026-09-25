package com.baidu.mapapi;

/* JADX INFO: loaded from: classes.dex */
public class OpenLogUtil {
    private static com.baidu.mapapi.ModuleName a;

    public static void setModuleLogEnable(com.baidu.mapapi.ModuleName moduleName, boolean z) {
        a = moduleName;
        com.baidu.mapsdkplatform.comjni.tools.a.a(z, moduleName.ordinal());
    }
}
