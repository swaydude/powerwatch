package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: Gen2AlertsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsSubtitleCommand;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsContentCommand;", "subTitle", "", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AlertsSubtitleCommand extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsContentCommand {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2AlertsSubtitleCommand(java.lang.String subTitle) {
        super(subTitle, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2AlertsSubtitleCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
    }
}
