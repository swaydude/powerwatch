package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: Gen2AlertsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsTitleCommand;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsContentCommand;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AlertsTitleCommand extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsContentCommand {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2AlertsTitleCommand(java.lang.String title) {
        super(title, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2AlertsTitleCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
    }
}
