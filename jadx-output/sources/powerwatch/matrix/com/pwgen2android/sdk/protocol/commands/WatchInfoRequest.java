package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "()V", "dataFormatter", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;", "getSendingData", "", "parseReceivedData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "dataToParse", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchInfoRequest implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen1DataFormatter dataFormatter = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen1DataFormatter();

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
        return new byte[]{-124, 16};
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.lang.String str = new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchInfoRequest watchInfoRequest = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(watchInfoRequest, kotlin.jvm.internal.Intrinsics.stringPlus("Running: ", str), null, 2, null);
        if (kotlin.text.StringsKt.startsWith(str, "#QT:Q,0", true)) {
            java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() >= 6) {
                java.lang.String str2 = (java.lang.String) listSplit$default.get(2);
                java.lang.String str3 = (java.lang.String) listSplit$default.get(3);
                java.lang.String str4 = (java.lang.String) listSplit$default.get(5);
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(watchInfoRequest, "Returning true", null, 2, null);
                powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo data = dataInfo.getData();
                powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen1DataFormatter gen1DataFormatter = this.dataFormatter;
                java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
                java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str2.getBytes(charset);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, true, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo.copy$default(data, null, gen1DataFormatter.formatFwVersion(bytes), str3, str4, 0, null, 49, null), 0.0f, null, null, null, 0L, null, com.baidu.mapapi.UIMsg.d_ResultType.LOC_INFO_UPLOAD, null);
            }
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(watchInfoRequest, "Returning false", null, 2, null);
        return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 0L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
    }
}
