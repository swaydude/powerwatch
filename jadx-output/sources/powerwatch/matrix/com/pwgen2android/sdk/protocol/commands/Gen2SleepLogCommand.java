package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2SleepLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "parseSingleLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SleepLogCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    public Gen2SleepLogCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SleepLogCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        byte[] bArr = new byte[16];
        new java.util.ArrayList();
        while (byteBufferWrap.limit() - byteBufferWrap.position() >= 16) {
            byteBufferWrap.get(bArr);
            dataInfo.getSleepLogData().add(parseSingleLog(bArr));
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.roundMillisToSeconds(java.lang.System.currentTimeMillis());
        dataInfo.getDataInfo().setParsingFinished(true);
        dataInfo.getDataInfo().setParsingStarted(false);
        dataInfo.getDataInfo().setActivityLogInterval(60000L);
        return dataInfo;
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog parseSingleLog(byte[] payloadData) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        int i2 = byteBufferWrap.getInt();
        int i3 = byteBufferWrap.getInt();
        int i4 = byteBufferWrap.getInt();
        int iExtractNumber$default = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 0, 7, false, 4, null);
        int iExtractNumber$default2 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 8, 15, false, 4, null);
        int iExtractNumber$default3 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 16, 23, false, 4, null);
        int iExtractNumber$default4 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 24, 31, false, 4, null);
        int iExtractNumber$default5 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 0, 7, false, 4, null);
        int iExtractNumber$default6 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 8, 15, false, 4, null);
        powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 16, 23, false, 4, null);
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog(i, i2, iExtractNumber$default, iExtractNumber$default2, iExtractNumber$default3, iExtractNumber$default4, iExtractNumber$default5, iExtractNumber$default6);
    }
}
