package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2ActivityEndLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.UnusedCommandResult
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "getParsingError", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;", "parseSingleLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "sendFinalProgress", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2ActivityEndLogCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command {
    public Gen2ActivityEndLogCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityEndLogCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch getParsingError() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch.INSTANCE;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand
    protected void sendFinalProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        getSyncChannel().onProgress(getCommandId(), 100.0f / (((int) dataInfo.getGen2LogsCount().getActivityEndLog()) + 1));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer payloadBuffer = java.nio.ByteBuffer.wrap(kotlin.collections.ArraysKt.plus(getData(), payloadData));
        clearAcc();
        byte[] bArr = new byte[48];
        while (payloadBuffer.limit() - payloadBuffer.position() >= 48) {
            payloadBuffer.get(bArr);
            dataInfo.getTempActivityLog().getTempEndLogs().add(parseSingleLog(bArr));
            sendFinalProgress(dataInfo);
        }
        if (payloadBuffer.hasRemaining()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payloadBuffer, "payloadBuffer");
            appendData(powerwatch.matrix.com.pwgen2android.shared.extensions.ByteArrayExtensionsKt.copyRemainingData(payloadBuffer));
        }
        dataInfo.getDataInfo().setParsingFinished(true);
        dataInfo.getDataInfo().setParsingStarted(false);
        dataInfo.getDataInfo().setActivityLogInterval(60000L);
        return dataInfo;
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog parseSingleLog(byte[] payloadData) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        int i2 = byteBufferWrap.getInt();
        int i3 = byteBufferWrap.getInt();
        int i4 = byteBufferWrap.getInt();
        int i5 = byteBufferWrap.getInt();
        int i6 = byteBufferWrap.getInt();
        int i7 = byteBufferWrap.getInt();
        int i8 = byteBufferWrap.getInt();
        int i9 = byteBufferWrap.getInt();
        int i10 = byteBufferWrap.getInt();
        int i11 = byteBufferWrap.getInt();
        int i12 = byteBufferWrap.getInt();
        float valueToFloat = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i2);
        float valueToFloat2 = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i3);
        int iExtractNumber$default = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 0, 17, false, 4, null);
        int iExtractNumber$default2 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 18, 25, false, 4, null);
        int iExtractNumber$default3 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i5, 0, 17, false, 4, null);
        int iExtractNumber$default4 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i5, 18, 25, false, 4, null);
        long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i6, 0, 18, false, 4, null))) & 4294967295L;
        int iExtractNumber$default5 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i7, 0, 23, false, 4, null);
        int iExtractNumber$default6 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i7, 24, 30, false, 4, null);
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog(0, i, i12, jM107constructorimpl, iExtractNumber$default3, iExtractNumber$default, iExtractNumber$default5, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i8, 0, 23, false, 4, null), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i8, 24, 30, false, 4, null), iExtractNumber$default6, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i9, 0, 17, false, 4, null), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i10, 0, 17, false, 4, null), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i11, 0, 29, false, 4, null), iExtractNumber$default2, iExtractNumber$default4, valueToFloat, valueToFloat2, 0, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i9, 18, 25, false, 4, null), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i10, 18, 25, false, 4, null));
    }
}
