package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2HeartRateExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;", "", "()V", "parse", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2HeartRateParser {
    public final long parse(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        long jM291constructorimpl;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        byte[] data = message.getProtocolMessage().getPayload().getData();
        if (data.length < 2) {
            return 0L;
        }
        byte b = (byte) (data[0] & 1);
        if (b == 0) {
            jM291constructorimpl = kotlin.UByte.m31constructorimpl(data[1]);
            j = 255;
        } else {
            if (b != 1 || data.length < 3) {
                return 0L;
            }
            jM291constructorimpl = kotlin.UShort.m291constructorimpl(java.nio.ByteBuffer.wrap(new byte[]{data[1], data[2]}).getShort());
            j = 65535;
        }
        return jM291constructorimpl & j;
    }
}
