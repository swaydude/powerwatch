package okhttp3.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
public interface PushObserver {
    public static final okhttp3.internal.http2.PushObserver CANCEL = new okhttp3.internal.http2.PushObserver() { // from class: okhttp3.internal.http2.PushObserver.1
        @Override // okhttp3.internal.http2.PushObserver
        public boolean onHeaders(int i, java.util.List<okhttp3.internal.http2.Header> list, boolean z) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onRequest(int i, java.util.List<okhttp3.internal.http2.Header> list) {
            return true;
        }

        @Override // okhttp3.internal.http2.PushObserver
        public void onReset(int i, okhttp3.internal.http2.ErrorCode errorCode) {
        }

        @Override // okhttp3.internal.http2.PushObserver
        public boolean onData(int i, okio.BufferedSource bufferedSource, int i2, boolean z) throws java.io.IOException {
            bufferedSource.skip(i2);
            return true;
        }
    };

    boolean onData(int i, okio.BufferedSource bufferedSource, int i2, boolean z) throws java.io.IOException;

    boolean onHeaders(int i, java.util.List<okhttp3.internal.http2.Header> list, boolean z);

    boolean onRequest(int i, java.util.List<okhttp3.internal.http2.Header> list);

    void onReset(int i, okhttp3.internal.http2.ErrorCode errorCode);
}
