package com.baidu.mapsdkplatform.comjni.engine;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final java.lang.String a = "a";
    private static android.util.SparseArray<java.util.List<android.os.Handler>> b = new android.util.SparseArray<>();

    public static void a(int i, int i2, int i3, long j) {
        synchronized (b) {
            java.util.List<android.os.Handler> list = b.get(i);
            if (list != null && !list.isEmpty()) {
                java.util.Iterator<android.os.Handler> it = list.iterator();
                while (it.hasNext()) {
                    android.os.Message.obtain(it.next(), i, i2, i3, java.lang.Long.valueOf(j)).sendToTarget();
                }
            }
        }
    }

    public static void a(int i, android.os.Handler handler) {
        synchronized (b) {
            try {
                if (handler == null) {
                    return;
                }
                java.util.List<android.os.Handler> list = b.get(i);
                if (list == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(handler);
                    b.put(i, arrayList);
                } else if (!list.contains(handler)) {
                    list.add(handler);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void b(int i, android.os.Handler handler) {
        synchronized (b) {
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                java.util.List<android.os.Handler> list = b.get(i);
                if (list != null) {
                    list.remove(handler);
                }
            }
        }
    }
}
