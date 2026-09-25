package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2ActivityDeltaLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.UnusedCommandResult
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "getParsingError", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;", "parseSingleLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;", "sendFinalProgress", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2ActivityDeltaLogCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command {
    public Gen2ActivityDeltaLogCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityDeltaLogCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch getParsingError() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch.INSTANCE;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand
    protected void sendFinalProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        getSyncChannel().onProgress(getCommandId(), 100.0f / (((int) dataInfo.getGen2LogsCount().getActivityDeltaLogs()) + 1));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer payloadBuffer = java.nio.ByteBuffer.wrap(kotlin.collections.ArraysKt.plus(getData(), payloadData));
        clearAcc();
        byte[] bArr = new byte[12];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (payloadBuffer.limit() - payloadBuffer.position() >= 12) {
            payloadBuffer.get(bArr);
            arrayList.add(parseSingleLog(bArr));
            sendFinalProgress(dataInfo);
        }
        if (payloadBuffer.hasRemaining()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payloadBuffer, "payloadBuffer");
            appendData(powerwatch.matrix.com.pwgen2android.shared.extensions.ByteArrayExtensionsKt.copyRemainingData(payloadBuffer));
        }
        dataInfo.getTempActivityLog().getTempDeltaLogs().addAll(arrayList);
        dataInfo.getDataInfo().setParsingFinished(true);
        dataInfo.getDataInfo().setParsingStarted(false);
        return dataInfo;
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog parseSingleLog(byte[] payloadData) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN unknown;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        int i2 = byteBufferWrap.getInt();
        int i3 = byteBufferWrap.getInt();
        int iExtractNumber$default = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 0, 4, false, 4, null);
        int iExtractNumber$default2 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 5, 7, false, 4, null);
        int iExtractNumber$default3 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 8, 13, false, 4, null);
        int iExtractNumber$default4 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 14, 15, false, 4, null);
        int iExtractNumber$default5 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 16, 17, false, 4, null);
        int iExtractNumber$default6 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 26, 29, false, 4, null);
        int iExtractNumber$default7 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 0, 3, false, 4, null);
        int iExtractNumber$default8 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 4, 11, false, 4, null);
        int iExtractNumber$default9 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 12, 18, false, 4, null);
        int iExtractNumber$default10 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 19, 21, false, 4, null);
        int iExtractNumber$default11 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 22, 24, false, 4, null);
        int iExtractNumber$default12 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 25, 27, false, 4, null);
        int iExtractNumber$default13 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 0, 14, false, 4, null);
        powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 15, 22, false, 4, null);
        powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 23, 30, false, 4, null);
        byte bExtractNumber$default = (byte) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 15, 22, false, 4, null);
        byte bExtractNumber$default2 = (byte) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 23, 30, false, 4, null);
        if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING.INSTANCE;
        } else if (iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING.INSTANCE;
        } else {
            unknown = iExtractNumber$default == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT.INSTANCE.getType() ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN.INSTANCE;
        }
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog(unknown, iExtractNumber$default12, iExtractNumber$default2, iExtractNumber$default3, iExtractNumber$default4, iExtractNumber$default5, bExtractNumber$default, bExtractNumber$default2, iExtractNumber$default6, iExtractNumber$default7, iExtractNumber$default8, iExtractNumber$default9, iExtractNumber$default10, iExtractNumber$default11, iExtractNumber$default13, 0, 32768, null);
    }
}
