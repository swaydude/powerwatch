package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public interface InitializationCallback<T> {
    public static final io.fabric.sdk.android.InitializationCallback EMPTY = new io.fabric.sdk.android.InitializationCallback.Empty();

    void failure(java.lang.Exception exc);

    void success(T t);

    public static class Empty implements io.fabric.sdk.android.InitializationCallback<java.lang.Object> {
        @Override // io.fabric.sdk.android.InitializationCallback
        public void failure(java.lang.Exception exc) {
        }

        @Override // io.fabric.sdk.android.InitializationCallback
        public void success(java.lang.Object obj) {
        }

        private Empty() {
        }
    }
}
