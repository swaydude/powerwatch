package okhttp3.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface CacheRequest {
    void abort();

    okio.Sink body() throws java.io.IOException;
}
