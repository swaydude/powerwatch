package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "()V", "TAG", "", "extractProgress", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "getSendingData", "", "isMemoryWriteCommand", "", "dataToParse", "isRunningCount", "isRunningSyncEnd", "data", "isStartSyncOrEndCommand", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "isSyncEndCommand", "parseReceivedData", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RunningLogCommand implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command {
    private final java.lang.String TAG = getClass().getSimpleName();

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
        return new byte[]{-127, 15, 0, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE, 16};
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        if (dataInfo.getParsingFinished()) {
            return 0.0f;
        }
        return 1.0f / dataInfo.getDataToProcess();
    }

    private final boolean isRunningCount(byte[] dataToParse) {
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8), (java.lang.CharSequence) "upload start", true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] dataToParse, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataToParse, "dataToParse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        if (isRunningSyncEnd(dataToParse)) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Detected running sync end, data count: ", java.lang.Integer.valueOf(dataInfo.getActivityLogs().size())), null, 2, null);
            return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : true, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 0L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
        }
        if (isRunningCount(dataToParse)) {
            java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) new java.lang.String(dataToParse, kotlin.text.Charsets.UTF_8), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
            int iIndexOf = listSplit$default.indexOf("start");
            if (iIndexOf != -1 && (i = iIndexOf + 2) < listSplit$default.size() && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) listSplit$default.get(i), (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
                java.lang.String str = (java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(i), new java.lang.String[]{"\n"}, false, 0, 6, (java.lang.Object) null).get(0);
                java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
                if (intOrNull != null) {
                    dataInfo.setDataToProcess(intOrNull.intValue());
                }
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Expected running sum: ", str), null, 2, null);
            }
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
        }
        boolean zIsMemoryWriteCommand = isMemoryWriteCommand(dataToParse);
        boolean z = !isStartSyncOrEndCommand(dataToParse);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RunningLogCommand runningLogCommand = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Started running processing: isWriteCommand : ");
        sb.append(zIsMemoryWriteCommand);
        sb.append(", isStartOrEnd : ");
        sb.append(!z);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(runningLogCommand, sb.toString(), null, 2, null);
        if (zIsMemoryWriteCommand && z) {
            int i2 = dataToParse[4];
            byte[] bArr = new byte[i2];
            java.lang.System.arraycopy(dataToParse, 5, bArr, 0, i2);
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
            byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L;
            long jM107constructorimpl2 = ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L;
            long jM107constructorimpl3 = ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L;
            long jM107constructorimpl4 = ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L;
            int i3 = byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            long j = 1000;
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry watchRunningLogEntry = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry(null, jM107constructorimpl * j, jM107constructorimpl2 * j, jM107constructorimpl4, jM107constructorimpl3, i3, byteBufferWrap.getInt(), null, 129, null);
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(runningLogCommand, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing running log : ", watchRunningLogEntry), null, 2, null);
            dataInfo.getRunningLogs().add(watchRunningLogEntry);
            dataInfo.setParsingStarted(true);
            dataInfo.setParsingFinished(false);
            return dataInfo;
        }
        return dataInfo.copy((com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 1) != 0 ? dataInfo.parsingStarted : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 2) != 0 ? dataInfo.parsingFinished : false, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 4) != 0 ? dataInfo.data : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 8) != 0 ? dataInfo.dataToProcess : 0.0f, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 16) != 0 ? dataInfo.activityLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 32) != 0 ? dataInfo.runningLogs : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 64) != 0 ? dataInfo.activitySummary : null, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 128) != 0 ? dataInfo.activityLogInterval : 0L, (com.baidu.mapapi.UIMsg.d_ResultType.LONG_URL & 256) != 0 ? dataInfo.alertsData : null);
    }

    private final boolean isMemoryWriteCommand(byte[] dataToParse) {
        return ((dataToParse.length == 0) ^ true) && ((byte) (dataToParse[0] & (-1))) == -112;
    }

    private final boolean isStartSyncOrEndCommand(byte[] content) {
        if (content.length < 3) {
            return false;
        }
        return ((content[3] | (content[2] << 8)) & 255) == 248;
    }

    private final boolean isSyncEndCommand(byte[] data) {
        if (data.length >= 10 && isMemoryWriteCommand(data) && isStartSyncOrEndCommand(data) && ((byte) (data[4] & (-1))) == 8) {
            return (data[5] | (data[6] << 8)) == 1;
        }
        return false;
    }

    private final boolean isRunningSyncEnd(byte[] data) {
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) new java.lang.String(data, kotlin.text.Charsets.UTF_8), (java.lang.CharSequence) "upload end", false, 2, (java.lang.Object) null);
    }
}
