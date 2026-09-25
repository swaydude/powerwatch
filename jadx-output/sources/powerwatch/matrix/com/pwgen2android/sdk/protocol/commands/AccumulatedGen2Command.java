package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0016H&J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AccumulatedGen2Command;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "commandId", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V", "accumulatedData", "", "", "getAccumulatedData", "()Ljava/util/List;", "setAccumulatedData", "(Ljava/util/List;)V", "accumulatedCount", "", "appendData", "", "data", "", "clearAcc", "", "getData", "getParsingError", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "isAccEmpty", "onSuccess", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AccumulatedGen2Command extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand {
    private java.util.List<java.lang.Byte> accumulatedData;

    public abstract powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError getParsingError();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccumulatedGen2Command(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs commandId) {
        super(commandId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.accumulatedData = new java.util.ArrayList();
    }

    public final java.util.List<java.lang.Byte> getAccumulatedData() {
        return this.accumulatedData;
    }

    public final void setAccumulatedData(java.util.List<java.lang.Byte> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.accumulatedData = list;
    }

    public final byte[] getData() {
        return kotlin.collections.CollectionsKt.toByteArray(this.accumulatedData);
    }

    public final void clearAcc() {
        this.accumulatedData.clear();
    }

    public final boolean appendData(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.accumulatedData.addAll(kotlin.collections.ArraysKt.toList(data));
    }

    public final boolean isAccEmpty() {
        return this.accumulatedData.isEmpty();
    }

    public final int accumulatedCount() {
        return this.accumulatedData.size();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData onSuccess(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        int length = getData().length;
        clearAcc();
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckDataOnSuccess = super.onSuccess(dataInfo);
        if (length > 0) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Log size doesn't match!!! Throwing error", getParsingError(), null, 4, null);
            gen2AckDataOnSuccess.setError(getParsingError());
        }
        return gen2AckDataOnSuccess;
    }
}
