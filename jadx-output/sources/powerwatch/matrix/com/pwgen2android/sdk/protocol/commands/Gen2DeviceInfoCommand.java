package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DeviceInfoCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "()V", "dataFormatter", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataFormatter;", "getCommandType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;", "getSendingData", "", "parseReceivedData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "dataToParse", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2DeviceInfoCommand implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataFormatter dataFormatter = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataFormatter(null, 1, null);

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public byte[] getSendingData() {
        return new byte[0];
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.extractProgress(this, dataInfo);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public java.lang.String printCommandId() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.printCommandId(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.GEN2_FIRMWARE_REQUEST;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing firmware info data: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(dataToParse, true)), null, 2, null);
        kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion> pairExtractFirmwareInfo = this.dataFormatter.extractFirmwareInfo(dataToParse);
        dataInfo.getData().setFirmwareVersion(pairExtractFirmwareInfo.getFirst());
        dataInfo.getData().setDisTableVersion(pairExtractFirmwareInfo.getSecond());
        dataInfo.getData().setPid(4);
        dataInfo.setParsingFinished(true);
        dataInfo.setParsingStarted(false);
        return dataInfo;
    }
}
