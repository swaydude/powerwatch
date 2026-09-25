package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0000\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\"\u0010\n\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b¨\u0006\f"}, d2 = {"acceptTypeJSON", "Lkotlin/Pair;", "", "getAcceptTypeJSON", "()Lkotlin/Pair;", "contentTypeJSON", "getContentTypeJSON", "mimeType", "getMimeType", "Header", "Headers", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class HttpClientKt {
    private static final kotlin.Pair<java.lang.String, java.lang.String> contentTypeJSON = new kotlin.Pair<>(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, "application/json");
    private static final kotlin.Pair<java.lang.String, java.lang.String> acceptTypeJSON = new kotlin.Pair<>("Accept", "application/json;charset=UTF-8");
    private static final kotlin.Pair<java.lang.String, java.lang.String> mimeType = new kotlin.Pair<>("mimeType", "application/octet-stream");

    public static final kotlin.Pair<java.lang.String, java.lang.String> getContentTypeJSON() {
        return contentTypeJSON;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> getAcceptTypeJSON() {
        return acceptTypeJSON;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> getMimeType() {
        return mimeType;
    }
}
