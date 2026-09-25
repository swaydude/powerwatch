package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2PopupDurationCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "popupDuration", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2PopupDurationCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration popupDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2PopupDurationCommand(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration popupDuration) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.PopupDurationCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popupDuration, "popupDuration");
        this.popupDuration = popupDuration;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        return new byte[]{this.popupDuration.getMode()};
    }
}
