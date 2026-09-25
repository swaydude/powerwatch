package com.baidu.mapsdkvi;

/* JADX INFO: loaded from: classes.dex */
public class VMsg {
    private static final java.lang.String a = "VMsg";
    private static android.os.Handler b;
    private static android.os.HandlerThread c;
    private static com.baidu.mapsdkvi.VMsg d = new com.baidu.mapsdkvi.VMsg();

    static class a extends android.os.Handler {
        public a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.baidu.mapsdkvi.VMsg.OnUserCommand1(message.what, message.arg1, message.arg2, message.obj == null ? 0L : ((java.lang.Long) message.obj).longValue());
        }
    }

    public static native void InitClass(java.lang.Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void OnUserCommand1(int i, int i2, int i3, long j);

    public static void destroy() {
        c.quit();
        c = null;
        b.removeCallbacksAndMessages(null);
        b = null;
    }

    public static com.baidu.mapsdkvi.VMsg getInstance() {
        return d;
    }

    public static void init() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("VIMsgThread");
        c = handlerThread;
        handlerThread.start();
        b = new com.baidu.mapsdkvi.VMsg.a(c.getLooper());
    }

    private static void postMessage(int i, int i2, int i3, long j) {
        android.os.Handler handler = b;
        if (handler == null) {
            return;
        }
        android.os.Message.obtain(handler, i, i2, i3, j == 0 ? null : java.lang.Long.valueOf(j)).sendToTarget();
    }
}
