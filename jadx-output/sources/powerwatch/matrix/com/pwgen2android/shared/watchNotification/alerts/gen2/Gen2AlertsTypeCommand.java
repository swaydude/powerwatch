package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: Gen2AlertsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsTypeCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "gen2AlertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AlertsTypeCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2AlertsTypeCommand(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2AlertsTypeCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        this.gen2AlertsData = gen2AlertsData;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        byte bOrdinal = (byte) this.gen2AlertsData.getCategoryId().ordinal();
        java.lang.String title = this.gen2AlertsData.getTitle();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(title, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = title.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        java.lang.String subTitle = this.gen2AlertsData.getSubTitle();
        java.nio.charset.Charset charset2 = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(subTitle, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = subTitle.getBytes(charset2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        int length2 = bytes2.length;
        java.lang.String message = this.gen2AlertsData.getMessage();
        java.nio.charset.Charset charset3 = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(message, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes3 = message.getBytes(charset3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
        int length3 = bytes3.length;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(9);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN).put(bOrdinal).putShort(this.gen2AlertsData.getUid()).put((byte) this.gen2AlertsData.getEventId().ordinal()).put((byte) this.gen2AlertsData.getEventFlags().getValue()).put(this.gen2AlertsData.getCategoryCount()).put((byte) length).put((byte) length2).put((byte) length3);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
