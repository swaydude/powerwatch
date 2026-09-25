package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: Gen2AlertsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2FullAlertsTypeCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "gen2AlertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V", "createPayload", "", "takeLimitedSize", "", "data", "limit", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2FullAlertsTypeCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2FullAlertsTypeCommand(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2FullAlertsTypeCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        this.gen2AlertsData = gen2AlertsData;
    }

    static /* synthetic */ java.lang.String takeLimitedSize$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2FullAlertsTypeCommand gen2FullAlertsTypeCommand, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 254;
        }
        return gen2FullAlertsTypeCommand.takeLimitedSize(str, i);
    }

    private final java.lang.String takeLimitedSize(java.lang.String data, int limit) {
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(data, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = data.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        if (limit >= bytes.length) {
            return data;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bytes, limit);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return new java.lang.String(bArrCopyOf, kotlin.text.Charsets.UTF_8);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        byte bOrdinal = (byte) this.gen2AlertsData.getCategoryId().ordinal();
        java.lang.String strTakeLimitedSize$default = takeLimitedSize$default(this, this.gen2AlertsData.getTitle(), 0, 2, null);
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(strTakeLimitedSize$default, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strTakeLimitedSize$default.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        java.lang.String strTakeLimitedSize$default2 = takeLimitedSize$default(this, this.gen2AlertsData.getSubTitle(), 0, 2, null);
        java.nio.charset.Charset charset2 = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(strTakeLimitedSize$default2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strTakeLimitedSize$default2.getBytes(charset2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        java.lang.String strTakeLimitedSize$default3 = takeLimitedSize$default(this, this.gen2AlertsData.getMessage(), 0, 2, null);
        java.nio.charset.Charset charset3 = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(strTakeLimitedSize$default3, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes3 = strTakeLimitedSize$default3.getBytes(charset3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        int length2 = bytes2.length;
        int length3 = bytes3.length;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length + 13 + length2 + length3);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN).put(bOrdinal).putShort(this.gen2AlertsData.getUid()).put((byte) this.gen2AlertsData.getEventId().ordinal()).put((byte) this.gen2AlertsData.getEventFlags().getValue()).put(this.gen2AlertsData.getCategoryCount()).putInt((int) (this.gen2AlertsData.getPostTime() / ((long) 1000))).put((byte) length).put((byte) length2).put((byte) length3).put(bytes).put(bytes2).put(bytes3);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
