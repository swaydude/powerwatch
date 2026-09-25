package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public interface Callback {
    void onFailure(okhttp3.Call call, java.io.IOException iOException);

    void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException;
}
