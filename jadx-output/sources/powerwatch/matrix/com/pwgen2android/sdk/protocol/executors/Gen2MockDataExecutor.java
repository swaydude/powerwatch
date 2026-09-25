package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "disableMock", "Lio/reactivex/Completable;", "uid", "", "enableMock", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2MockDataExecutor extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2MockDataExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
    }

    public final io.reactivex.Completable enableMock(java.lang.String uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        io.reactivex.Completable completableIgnoreElements = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this, new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.EnableMockCommand(true), uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null), 0.0f, null, null, null, 0L, null, 507, null), null, null, 55, null), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP, 1.0f, 0L, null, 96, null).ignoreElements();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "sendSingleCommandWithAck(EnableMockCommand(true), uid, Gen2DataInfo(dataInfo = DataInfo(data = WatchDataInfo())), ProtocolType.GEN2_DTP, 1f)\n                .ignoreElements()");
        return completableIgnoreElements;
    }

    public final io.reactivex.Completable disableMock(java.lang.String uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        io.reactivex.Completable completableIgnoreElements = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this, new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.EnableMockCommand(false), uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null), 0.0f, null, null, null, 0L, null, 507, null), null, null, 55, null), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP, 1.0f, 0L, null, 96, null).ignoreElements();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "sendSingleCommandWithAck(EnableMockCommand(false), uid, Gen2DataInfo(dataInfo = DataInfo(data = WatchDataInfo())), ProtocolType.GEN2_DTP, 1f)\n                .ignoreElements()");
        return completableIgnoreElements;
    }
}
