package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: RTLTimeCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.UnusedCommandResult
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLTimeCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "extractResponse", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "payloadData", "", "dataInfo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RTLTimeCommand extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    public RTLTimeCommand() {
        super(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs.RTLTimeCommandId.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] payloadData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadData, "payloadData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(kotlin.collections.ArraysKt.reversedArray(payloadData));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBufferWrap.limit() - byteBufferWrap.position() >= 4) {
            long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(byteBufferWrap.getInt())) & 4294967295L;
            arrayList.add(java.lang.Long.valueOf(jM107constructorimpl));
            android.util.Log.d("gen2_pair", kotlin.jvm.internal.Intrinsics.stringPlus("Parse RTL entry success: ", java.lang.Long.valueOf(jM107constructorimpl)));
        }
        java.util.List listReversed = kotlin.collections.CollectionsKt.reversed(arrayList);
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> rtlData = dataInfo.getRtlData();
        java.util.Iterator<T> it = rtlData.iterator();
        java.util.List list = listReversed;
        java.util.Iterator it2 = list.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(rtlData, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData rTLData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData) it.next();
            rTLData.setTimestamp(((java.lang.Number) it2.next()).longValue() * ((long) 1000));
            arrayList2.add(rTLData);
        }
        dataInfo.setRtlData(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2));
        java.util.Iterator<T> it3 = dataInfo.getRtlData().iterator();
        java.lang.String str = "";
        while (it3.hasNext()) {
            str = str + "\nTime: " + ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData) it3.next());
        }
        java.lang.String strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(str, "\n");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLTimeCommand rTLTimeCommand = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(rTLTimeCommand, "*** Print Time Log Decoded", null, 2, null);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(rTLTimeCommand, strStringPlus, null, 2, null);
        return dataInfo;
    }
}
