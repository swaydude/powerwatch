package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ReadUserInfoData;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "()V", "getSendingData", "", "parseReceivedData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "dataToParse", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReadUserInfoData implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
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
    public java.lang.String printCommandId() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command.DefaultImpls.printCommandId(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public byte[] getSendingData() {
        return new byte[]{-124, 18};
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        dataInfo.setParsingStarted(true);
        dataInfo.setParsingFinished(false);
        if (kotlin.text.StringsKt.startsWith(new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8), "#QT:Q,2", true)) {
            return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : true, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 0L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
        }
        return dataInfo;
    }
}
