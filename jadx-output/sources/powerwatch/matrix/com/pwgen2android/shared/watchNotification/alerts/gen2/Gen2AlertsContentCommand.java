package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: Gen2AlertsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsContentCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "", "commandId", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V", "getContent", "()Ljava/lang/String;", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Gen2AlertsContentCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final java.lang.String content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2AlertsContentCommand(java.lang.String content, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs commandId) {
        super(commandId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.content = content;
    }

    protected final java.lang.String getContent() {
        return this.content;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        java.lang.String str = this.content;
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        int iMin = java.lang.Math.min(bytes.length, 10);
        java.lang.String str2 = this.content;
        java.nio.charset.Charset charset2 = kotlin.text.Charsets.UTF_8;
        java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = str2.getBytes(charset2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
        return kotlin.collections.CollectionsKt.toByteArray(kotlin.collections.ArraysKt.slice(bytes2, kotlin.ranges.RangesKt.until(0, iMin)));
    }
}
