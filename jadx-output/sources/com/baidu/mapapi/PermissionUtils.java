package com.baidu.mapapi;

/* JADX INFO: loaded from: classes.dex */
public class PermissionUtils {

    private static class a {
        private static final com.baidu.mapapi.PermissionUtils a = new com.baidu.mapapi.PermissionUtils();
    }

    private PermissionUtils() {
    }

    public static com.baidu.mapapi.PermissionUtils getInstance() {
        return com.baidu.mapapi.PermissionUtils.a.a;
    }

    public boolean isIndoorNaviAuthorized() {
        return com.baidu.mapsdkplatform.comapi.util.c.a().b();
    }
}
