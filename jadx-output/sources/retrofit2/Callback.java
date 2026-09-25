package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
public interface Callback<T> {
    void onFailure(retrofit2.Call<T> call, java.lang.Throwable th);

    void onResponse(retrofit2.Call<T> call, retrofit2.Response<T> response);
}
