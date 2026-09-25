package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: RTLStatusCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.UnusedCommandResult
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLStatusCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RTLStatusCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    public RTLStatusCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLStatusCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(payloadData);
        while (byteBufferWrap.hasRemaining()) {
            byte bM31constructorimpl = kotlin.UByte.m31constructorimpl(byteBufferWrap.get());
            arrayList.add(java.lang.Byte.valueOf(bM31constructorimpl));
            android.util.Log.d("gen2_pair", kotlin.jvm.internal.Intrinsics.stringPlus("Parse RTL status success: ", kotlin.UByte.m74toStringimpl(bM31constructorimpl)));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Number) it.next()).byteValue();
            dataInfo.getRtlData().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData(0L));
        }
        return dataInfo;
    }
}
