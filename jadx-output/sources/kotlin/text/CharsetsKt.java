package kotlin.text;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {io.fabric.sdk.android.services.network.HttpRequest.PARAM_CHARSET, "Ljava/nio/charset/Charset;", "charsetName", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class CharsetsKt {
    private static final java.nio.charset.Charset charset(java.lang.String str) {
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charsetName)");
        return charsetForName;
    }
}
