package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V", "innerCommand", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendUserPrefsAndGoalsCommandVer3 extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommand innerCommand;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendUserPrefsAndGoalsCommandVer3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserPrefsAndGoalsVer3CommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        this.pairingConfig = pairingConfig;
        this.innerCommand = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommand(pairingConfig);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(32).order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put(this.innerCommand.createPayload());
        byteBufferOrder.put((byte) this.pairingConfig.getUserInfoData().getSleepTimeSelection());
        byte[] bArrArray = byteBufferOrder.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
