package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "unitsInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;)V", "createPayload", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2SendUserInformationCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2SendUserInformationCommand(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfo) {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2SendUserInformationCommandId.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitsInfo, "unitsInfo");
        this.unitsInfo = unitsInfo;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        boolean z = !this.unitsInfo.getTwelveHourFormat();
        boolean metricsFormat = this.unitsInfo.getMetricsFormat();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = jCurrentTimeMillis / ((long) 1000);
        int offset = java.util.Calendar.getInstance().getTimeZone().getOffset(jCurrentTimeMillis) / 60000;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN).put(z ? (byte) 1 : (byte) 0).put(metricsFormat ? (byte) 1 : (byte) 0).putInt((int) j).putShort((short) offset);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrArray, "dataBuffer.array()");
        return bArrArray;
    }
}
