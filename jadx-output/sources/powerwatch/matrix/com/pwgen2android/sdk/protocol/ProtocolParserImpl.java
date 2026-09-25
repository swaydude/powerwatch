package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: ProtocolParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;", "()V", "parseMessage", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "parseResponse", "data", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ProtocolParserImpl implements powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser {
    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser
    public byte[] parseMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return message.getPayload().getData();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolParser
    public powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage parseResponse(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(data), null, null, 6, null);
    }
}
