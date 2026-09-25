package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLogCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "rtlData", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;", "(Ljava/util/List;)V", "timestampData", "", "", "", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "parseSingleLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;", "sendFinalProgress", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2BackgroundLogCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final java.util.Map<java.lang.Integer, java.lang.Long> timestampData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2BackgroundLogCommand(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> rtlData) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2BackgroundLogCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtlData, "rtlData");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> list = rtlData;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add((java.lang.Long) linkedHashMap.put(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData) obj).getTimestamp())));
            i = i2;
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.timestampData = linkedHashMap;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand
    protected void sendFinalProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        getSyncChannel().onProgress(getCommandId(), 100.0f / (((int) dataInfo.getGen2LogsCount().getBackgroundLogs()) + 1));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) throws powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        if (byteBufferWrap.array().length % 16 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Wrong background data size", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch.INSTANCE, null, 4, null);
            throw powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch.INSTANCE;
        }
        byte[] bArr = new byte[16];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBufferWrap.limit() - byteBufferWrap.position() >= 16) {
            byteBufferWrap.get(bArr);
            arrayList.add(parseSingleLog(bArr));
            dataInfo.getGen2LogsCount().getBackgroundLogs();
            sendFinalProgress(dataInfo);
        }
        long jRoundMillisToSeconds = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.roundMillisToSeconds(java.lang.System.currentTimeMillis());
        dataInfo.getDataInfo().setParsingFinished(true);
        dataInfo.getDataInfo().setParsingStarted(false);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommand gen2BackgroundLogCommand = this;
        java.lang.Long l = null;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2BackgroundLogCommand, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing background log, size: ", java.lang.Integer.valueOf(arrayList.size())), null, 2, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog) it.next());
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2BackgroundLogCommand, kotlin.jvm.internal.Intrinsics.stringPlus("Background logs: \n", sb), null, 2, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList2) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog) obj).getLogTimeIndex());
            java.lang.Object obj2 = linkedHashMap.get(numValueOf);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(numValueOf, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            java.lang.Long l2 = this.timestampData.get(java.lang.Integer.valueOf(iIntValue));
            java.lang.Long lValueOf = l2 == null ? l : java.lang.Long.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.roundMillisToSeconds(l2.longValue()));
            if (lValueOf == null) {
                throw powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex.INSTANCE;
            }
            long jLongValue = lValueOf.longValue();
            int i2 = 0;
            for (java.lang.Object obj3 : (java.lang.Iterable) entry.getValue()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog gen2BackgroundLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog) obj3;
                boolean z = kotlin.jvm.internal.Intrinsics.areEqual(gen2BackgroundLog.getLogType(), powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(gen2BackgroundLog.getLogType(), powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(gen2BackgroundLog.getLogType(), powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless.INSTANCE);
                powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType logType = gen2BackgroundLog.getLogType();
                if (kotlin.jvm.internal.Intrinsics.areEqual(logType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep.INSTANCE)) {
                    i = 5;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(logType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight.INSTANCE)) {
                    i = 3;
                } else {
                    i = kotlin.jvm.internal.Intrinsics.areEqual(logType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless.INSTANCE) ? 1 : 0;
                }
                dataInfo.getDataInfo().getActivityLogs().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry(z, jLongValue, i, gen2BackgroundLog.getBattery(), gen2BackgroundLog.getActiveCalories(), gen2BackgroundLog.getBmrCalories(), gen2BackgroundLog.getHrv(), gen2BackgroundLog.getHeartRate(), gen2BackgroundLog.getWalkStepDelta(), gen2BackgroundLog.getRunningStepDelta(), gen2BackgroundLog.getDistanceDelta(), gen2BackgroundLog.getPowerLog()));
                jLongValue += 60000;
                i2 = i3;
            }
            this.timestampData.put(java.lang.Integer.valueOf(iIntValue), java.lang.Long.valueOf(jLongValue));
            l = null;
        }
        dataInfo.getDataInfo().getActivitySummary().setLastLogTime(jRoundMillisToSeconds);
        dataInfo.getDataInfo().setActivityLogInterval(60000L);
        return dataInfo;
    }

    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog parseSingleLog(byte[] payloadData) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.StateUnknown stateUnknown;
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        int i2 = byteBufferWrap.getInt();
        int i3 = byteBufferWrap.getInt();
        int i4 = byteBufferWrap.getInt();
        int iExtractNumber$default = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 0, 6, false, 4, null);
        int i5 = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommandKt.getGenerationArray()[powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 7, 12, false, 4, null)];
        int iExtractNumber$default2 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 13, 21, false, 4, null);
        if (iExtractNumber$default2 > 255) {
            iExtractNumber$default2 -= 512;
        }
        int i6 = iExtractNumber$default2;
        int iExtractNumber$default3 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i4, 22, 25, false, 4, null);
        if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.DevOffWrist.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.DevOffWrist.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeStill.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeStill.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeWalking.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeWalking.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeRunning.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeRunning.INSTANCE;
        } else if (iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeBike.INSTANCE.getEnumValue()) {
            stateUnknown = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeBike.INSTANCE;
        } else {
            stateUnknown = iExtractNumber$default3 == powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeVehicle.INSTANCE.getEnumValue() ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeVehicle.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.StateUnknown.INSTANCE;
        }
        int iExtractNumber$default4 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 0, 8, false, 4, null);
        int i7 = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommandKt.getConsumptionArray()[powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 9, 16, false, 4, null)];
        int iExtractNumber$default5 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 17, 24, false, 4, null);
        int iExtractNumber$default6 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i3, 25, 31, false, 4, null);
        int iExtractNumber$default7 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 0, 14, false, 4, null);
        int iExtractNumber$default8 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 15, 25, false, 4, null);
        int i8 = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommandKt.getGenerationArray()[powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i2, 26, 31, false, 4, null)];
        int iExtractNumber$default9 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 0, 6, false, 4, null);
        int iExtractNumber$default10 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 7, 14, false, 4, null);
        int iExtractNumber$default11 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 15, 22, false, 4, null);
        int iExtractNumber$default12 = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.extractNumber$default(i, 23, 31, false, 4, null);
        android.util.Log.d("gen2_pair", kotlin.jvm.internal.Intrinsics.stringPlus("RTL index: ", java.lang.Integer.valueOf(iExtractNumber$default9)));
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog(stateUnknown, iExtractNumber$default9, 0L, iExtractNumber$default10, iExtractNumber$default11, iExtractNumber$default12, iExtractNumber$default, iExtractNumber$default7, iExtractNumber$default8, iExtractNumber$default5, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(iExtractNumber$default4, i6, i8, i5, i7), iExtractNumber$default6);
    }
}
