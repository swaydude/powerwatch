package com.baidu.mapapi;

/* JADX INFO: loaded from: classes.dex */
public class JNIInitializer {
    private static android.content.Context a;

    public static android.content.Context getCachedContext() {
        return a;
    }

    public static void setContext(android.app.Application application) {
        if (application == null) {
            throw new java.lang.RuntimeException();
        }
        if (a == null) {
            a = application;
        }
    }
}
