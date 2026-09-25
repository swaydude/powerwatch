package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;", "commandId", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V", "getCommandId", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "syncChannel", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;", "getSyncChannel", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;", "syncChannel$delegate", "Lkotlin/Lazy;", "getCoreCommand", "", "onSuccess", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "printCommandId", "", "sendFinalProgress", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Gen2AbstractCommand implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs commandId;

    /* JADX INFO: renamed from: syncChannel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy syncChannel;

    public Gen2AbstractCommand(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs commandId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.commandId = commandId;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = getKoin().getRootScope();
        this.syncChannel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AbstractCommand$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel.class), qualifier, function0);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] createPayload() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.createPayload(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public boolean extractAndCompareCRC(byte[] bArr) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractAndCompareCRC(this, bArr);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public kotlin.Pair<java.lang.Boolean, byte[]> extractPayload(byte[] bArr) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractPayload(this, bArr);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public float extractProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractProgress(this, dataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo extractResponse(byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractResponse(this, bArr, dataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo extractResponse(byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractResponse(this, bArr, gen2DataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError extractResponseType(kotlin.Pair<java.lang.Boolean, byte[]> pair) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.extractResponseType(this, pair);
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs getCommandId() {
        return this.commandId;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType getCommandType() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.getCommandType(this);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public byte[] getSendingData() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.getSendingData(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo parseReceivedData(byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.parseReceivedData(this, bArr, dataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo parseReceivedData(byte[] bArr, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.parseReceivedData(this, bArr, gen2DataInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public byte[] getCoreCommand() {
        return this.commandId.getId();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command
    public java.lang.String printCommandId() {
        return this.commandId.getCommandId();
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel getSyncChannel() {
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel) this.syncChannel.getValue();
    }

    protected void sendFinalProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        getSyncChannel().onProgress(this.commandId, 100.0f);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command
    public powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData onSuccess(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        sendFinalProgress(dataInfo);
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command.DefaultImpls.onSuccess(this, dataInfo);
    }
}
