package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: GoalsCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "goals", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V", "getGoals", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendStepsDistanceGoal extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goals;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendStepsDistanceGoal(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goals) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendStepsDistanceGoalId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
        this.goals = goals;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData getGoals() {
        return this.goals;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        byte[] bArrArray = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.BIG_ENDIAN).putInt(this.goals.getStepsGoal()).putInt((int) this.goals.getDistanceGoal()).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.order(ByteOrder.BIG_ENDIAN)\n                .putInt(goals.stepsGoal)\n                .putInt(goals.distanceGoal.toInt())\n                .array()");
        return bArrArray;
    }
}
