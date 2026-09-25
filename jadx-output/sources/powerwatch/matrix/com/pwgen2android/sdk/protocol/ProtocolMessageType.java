package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;", "", "(Ljava/lang/String;I)V", "SETTING", "RESPONSE", "COMMAND", "ACK_MESSAGE", "COMMAND_SUCCESS", "UNKNOWN", "GEN2_FIRMWARE_REQUEST", "GEN2_SERIAL_REQUEST", "GEN2_SETTINGS_REQUEST", "GEN2_FIRMWARE_RESPONSE", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum ProtocolMessageType {
    SETTING,
    RESPONSE,
    COMMAND,
    ACK_MESSAGE,
    COMMAND_SUCCESS,
    UNKNOWN,
    GEN2_FIRMWARE_REQUEST,
    GEN2_SERIAL_REQUEST,
    GEN2_SETTINGS_REQUEST,
    GEN2_FIRMWARE_RESPONSE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType[] valuesCustom() {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType[] protocolMessageTypeArrValuesCustom = values();
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType[]) java.util.Arrays.copyOf(protocolMessageTypeArrValuesCustom, protocolMessageTypeArrValuesCustom.length);
    }
}
