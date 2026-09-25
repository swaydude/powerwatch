package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MessageCenter {
    public static void registMessage(int i, android.os.Handler handler) {
        com.baidu.mapsdkplatform.comjni.engine.a.a(i, handler);
    }

    public static void unregistMessage(int i, android.os.Handler handler) {
        com.baidu.mapsdkplatform.comjni.engine.a.b(i, handler);
    }
}
