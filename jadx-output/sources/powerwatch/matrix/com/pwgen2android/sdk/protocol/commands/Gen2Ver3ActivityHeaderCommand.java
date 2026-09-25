package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Ver3ActivityHeaderCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.UnusedCommandResult
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Ver3ActivityHeaderCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "getParsingError", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;", "parseSingleLog", "", "infoToFillUp", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;", "sendFinalProgress", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2Ver3ActivityHeaderCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command {
    public Gen2Ver3ActivityHeaderCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2ActivityHeaderLogCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AccumulatedGen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch getParsingError() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch.INSTANCE;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand
    protected void sendFinalProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        getSyncChannel().onProgress(getCommandId(), 100.0f / (((int) dataInfo.getGen2LogsCount().getActivityStartLogs()) + 1));
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
            parseSingleLog(bArr, dataInfo.getTempActivityLog());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
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

    public final void parseSingleLog(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo infoToFillUp) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoToFillUp, "infoToFillUp");
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
        int iExtractNumber$default = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 0, 5, false, 4, null);
        int iExtractNumber$default2 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 6, 13, false, 4, null);
        int iExtractNumber$default3 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 14, 31, false, 4, null);
        float valueToFloat = java.lang.Float.isNaN(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i4)) ? 0.0f : powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i4);
        float valueToFloat2 = java.lang.Float.isNaN(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i5)) ? 0.0f : powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.parseValueToFloat(i5);
        int iExtractNumber$default4 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i6, 0, 15, false, 4, null);
        int iExtractNumber$default5 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i7, 0, 23, false, 4, null);
        int iExtractNumber$default6 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i7, 24, 31, false, 4, null);
        int iExtractNumber$default7 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i8, 0, 8, false, 4, null);
        int iExtractNumber$default8 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i8, 9, 17, false, 4, null);
        int iExtractNumber$default9 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i8, 18, 25, false, 4, null);
        int iExtractNumber$default10 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i9, 0, 18, false, 4, null);
        if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING.INSTANCE;
        } else if (iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING.INSTANCE.getType()) {
            unknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING.INSTANCE;
        } else {
            unknown = iExtractNumber$default9 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT.INSTANCE.getType() ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.UNKNOWN.INSTANCE;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType = unknown;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(iExtractNumber$default8, iExtractNumber$default7, i10, i11, i12);
        if (iExtractNumber$default == 0) {
            infoToFillUp.getTempStartLogs().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog(activityType, iExtractNumber$default2, i3, i2, valueToFloat, valueToFloat2, iExtractNumber$default4, iExtractNumber$default10, iExtractNumber$default3, 0, iExtractNumber$default5, 0, iExtractNumber$default6, 0, 0, watchPowerLog));
        } else {
            if (iExtractNumber$default != 1) {
                return;
            }
            infoToFillUp.getTempEndLogs().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog(iExtractNumber$default2, i3, i2, iExtractNumber$default10, iExtractNumber$default3, 0, iExtractNumber$default5, 0, iExtractNumber$default6, 0, i10, i11, i12, iExtractNumber$default7, iExtractNumber$default8, valueToFloat, valueToFloat2, iExtractNumber$default4, 0, 0));
        }
    }
}
