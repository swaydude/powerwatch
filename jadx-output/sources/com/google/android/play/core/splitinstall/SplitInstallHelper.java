package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitcompat.a a = new com.google.android.play.core.splitcompat.a("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(android.content.Context context, java.lang.String str) throws java.lang.UnsatisfiedLinkError {
        try {
            java.lang.System.loadLibrary(str);
        } catch (java.lang.UnsatisfiedLinkError e) {
            boolean z = false;
            try {
                java.lang.String str2 = context.getApplicationInfo().nativeLibraryDir;
                java.lang.String strMapLibraryName = java.lang.System.mapLibraryName(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(strMapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(strMapLibraryName);
                java.lang.String string = sb.toString();
                if (new java.io.File(string).exists()) {
                    java.lang.System.load(string);
                    z = true;
                }
                if (!z) {
                    throw e;
                }
            } catch (java.lang.UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
    }

    public static void updateAppInfo(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT <= 25 || android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        com.google.android.play.core.splitcompat.a aVar = a;
        aVar.a("Calling dispatchPackageBroadcast", new java.lang.Object[0]);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Method method = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object objInvoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(objInvoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", java.lang.Integer.TYPE, java.lang.String[].class).invoke(obj, 3, new java.lang.String[]{context.getPackageName()});
            aVar.a("Called dispatchPackageBroadcast", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            a.a(e, "Update app info with dispatchPackageBroadcast failed!", new java.lang.Object[0]);
        }
    }
}
