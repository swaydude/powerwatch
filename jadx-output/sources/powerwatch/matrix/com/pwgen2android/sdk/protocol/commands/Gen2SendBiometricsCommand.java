package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "userInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendBiometricsCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendBiometricsCommand(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfo) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendBiometricsCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.userInfo = userInfo;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        boolean z = !this.userInfo.getGenderMale();
        byte age = (byte) this.userInfo.getAge();
        short weight = (short) this.userInfo.getWeight();
        int height = ((short) this.userInfo.getHeight()) * 10;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(6);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN).put(z ? (byte) 1 : (byte) 0).put(age).putShort(weight).putShort((short) height);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
