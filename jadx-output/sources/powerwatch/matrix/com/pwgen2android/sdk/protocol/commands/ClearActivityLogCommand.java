package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ClearActivityLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "()V", "getSendingData", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ClearActivityLogCommand implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.extractProgress(this, dataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getCommandType(this);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.parseReceivedData(this, bArr, dataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public java.lang.String printCommandId() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.printCommandId(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public byte[] getSendingData() {
        return new byte[]{-124, 32, 2};
    }
}
