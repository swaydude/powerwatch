package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2GetLogCountCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2GetLogCountCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2GetLogCountCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    public Gen2GetLogCountCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.Gen2GetLogCountCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        if (byteBufferWrap.remaining() == 28) {
            dataInfo.setGen2LogsCount(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount(((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, 0L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L, ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L));
        }
        return dataInfo;
    }
}
