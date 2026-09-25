package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V", "createPayload", "", "packGoals", "Ljava/nio/ByteBuffer;", "goalsInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "dataBuffer", "packLanguageInfo", "locale", "Ljava/util/Locale;", "packUserPrefs", "userInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;", "packWatchData", "unitsInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendUserPrefsAndGoalsCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendUserPrefsAndGoalsCommand(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        this.pairingConfig = pairingConfig;
    }

    private final java.nio.ByteBuffer packWatchData(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfo, java.nio.ByteBuffer dataBuffer) {
        boolean z = !unitsInfo.getTwelveHourFormat();
        boolean metricsFormat = unitsInfo.getMetricsFormat();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.nio.ByteBuffer byteBufferPutShort = dataBuffer.put(z ? (byte) 1 : (byte) 0).put(metricsFormat ? (byte) 1 : (byte) 0).putInt((int) (jCurrentTimeMillis / ((long) 1000))).putShort((short) (java.util.Calendar.getInstance().getTimeZone().getOffset(jCurrentTimeMillis) / 60000));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferPutShort, "dataBuffer\n                .put(twelveHour)\n                .put(metrics)\n                .putInt(currentTimeSec.toInt())\n                .putShort(zoneOffset.toShort())");
        return byteBufferPutShort;
    }

    private final java.nio.ByteBuffer packUserPrefs(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfo, java.nio.ByteBuffer dataBuffer) {
        boolean z = !userInfo.getGenderMale();
        java.nio.ByteBuffer byteBufferPutShort = dataBuffer.put(z ? (byte) 1 : (byte) 0).put((byte) userInfo.getAge()).putShort((short) userInfo.getWeight()).putShort((short) (((short) userInfo.getHeight()) * 10));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferPutShort, "dataBuffer.put(maleVal)\n                .put(age)\n                .putShort(weight)\n                .putShort(height.toShort())");
        return byteBufferPutShort;
    }

    private final java.nio.ByteBuffer packGoals(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalsInfo, java.nio.ByteBuffer dataBuffer) {
        java.nio.ByteBuffer byteBufferPutInt = dataBuffer.order(java.nio.ByteOrder.BIG_ENDIAN).putInt(goalsInfo.getStepsGoal()).putInt((int) goalsInfo.getDistanceGoal()).putInt(goalsInfo.getCaloriesGoal()).putInt(goalsInfo.getSleepGoal());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferPutInt, "dataBuffer.order(ByteOrder.BIG_ENDIAN)\n                .putInt(goalsInfo.stepsGoal)\n                .putInt(goalsInfo.distanceGoal.toInt())\n                .putInt(goalsInfo.caloriesGoal)\n                .putInt(goalsInfo.sleepGoal)");
        return byteBufferPutInt;
    }

    private final java.nio.ByteBuffer packLanguageInfo(java.util.Locale locale, java.nio.ByteBuffer dataBuffer) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English english;
        if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.French.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.French.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.German.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.German.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Japanese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Japanese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Korean.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Korean.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.SimplifiedChinese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.TraditionalChinese.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Italian.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Italian.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Spanish.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Spanish.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Portugal.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Portugal.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Russian.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Russian.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Czech.INSTANCE.getLocale())) {
            english = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Czech.INSTANCE;
        } else {
            english = kotlin.jvm.internal.Intrinsics.areEqual(locale, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Polish.INSTANCE.getLocale()) ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.Polish.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LocaleCommandValue.English.INSTANCE;
        }
        java.nio.ByteBuffer byteBufferPut = dataBuffer.put((byte) english.getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBufferPut, "dataBuffer\n                .put(languageCommandValue.value.toByte())");
        return byteBufferPut;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        java.nio.ByteBuffer dataBuffer = java.nio.ByteBuffer.allocate(31).order(java.nio.ByteOrder.BIG_ENDIAN);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData = this.pairingConfig.getUnitsInfoData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataBuffer, "dataBuffer");
        packWatchData(unitsInfoData, dataBuffer);
        packUserPrefs(this.pairingConfig.getUserInfoData(), dataBuffer);
        packGoals(this.pairingConfig.getGoalInfoData(), dataBuffer);
        packLanguageInfo(this.pairingConfig.getLanguageInfoData().getLocale(), dataBuffer);
        byte[] bArrArray = dataBuffer.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
