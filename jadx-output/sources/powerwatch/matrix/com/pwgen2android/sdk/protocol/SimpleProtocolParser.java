package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: ProtocolParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/SimpleProtocolParser;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "()V", "header", "", "getHeader", "()[B", "createMessageFromPayload", "stringPayload", "", "encodePayloadBase64", "payload", "parseMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "parseResponse", "data", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SimpleProtocolParser implements powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser {
    private final byte[] header = {20, 0, 1, 0, 0, 100, 0, 0, 0, -54, -58, -120, -103, 0, 0, 0, -1, -1, -1, -1, -87, 76, -89, 33};

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser
    public powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage parseResponse(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (data.length > 20) {
            data = kotlin.collections.ArraysKt.copyOfRange(data, 20, data.length);
        }
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(data), null, null, 6, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser
    public byte[] parseMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return createMessageFromPayload(encodePayloadBase64(message.getPayload().getData()));
    }

    protected final byte[] getHeader() {
        return this.header;
    }

    private final java.lang.String encodePayloadBase64(byte[] payload) {
        byte[] encodedCommand = android.util.Base64.encode(payload, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodedCommand, "encodedCommand");
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
        return new java.lang.String(encodedCommand, charsetForName);
    }

    public final byte[] createMessageFromPayload(java.lang.String stringPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringPayload, "stringPayload");
        java.lang.String str = '!' + stringPayload + "\n";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().append('!').append(stringPayload).append(\"\\n\").toString()");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bArrPlus = kotlin.collections.ArraysKt.plus(this.header, (byte) bytes.length);
        byte[] bytes2 = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        return kotlin.collections.ArraysKt.plus(bArrPlus, bytes2);
    }
}
