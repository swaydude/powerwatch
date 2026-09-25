package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2SendCaloriesSleepGoal.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "sleepCaloriesGoal", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendCaloriesSleepGoal extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData sleepCaloriesGoal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendCaloriesSleepGoal(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData sleepCaloriesGoal) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendCaloriesSleepGoalId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepCaloriesGoal, "sleepCaloriesGoal");
        this.sleepCaloriesGoal = sleepCaloriesGoal;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        byte[] bArrArray = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.BIG_ENDIAN).putInt(this.sleepCaloriesGoal.getCaloriesGoal()).putInt(this.sleepCaloriesGoal.getSleepGoal()).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.order(ByteOrder.BIG_ENDIAN)\n                .putInt(sleepCaloriesGoal.caloriesGoal)\n                .putInt(sleepCaloriesGoal.sleepGoal)\n                .array()");
        return bArrArray;
    }
}
