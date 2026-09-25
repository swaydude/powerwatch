package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V", "sendSettingCommand", "Lio/reactivex/Completable;", "deviceID", "", "commands", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;", "(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsExecutor extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
    }

    public final io.reactivex.Completable sendSettingCommand(final java.lang.String deviceID, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command... commands) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commands, "commands");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.highlevel.-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor.m2287sendSettingCommand$lambda1(commands, this, deviceID);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n        val operationObs = Observable.concat(commands.map { sendSingleCommandWithAck(it, deviceID, Gen2DataInfo(), power = 1F) })\n        val operation = DeviceCommunicationOperation(operationObs)\n        deviceCommunicationQueuer.queue(operation).ignoreElements()\n    }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSettingCommand$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2287sendSettingCommand$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command[] commands, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsExecutor this$0, java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commands, "$commands");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "$deviceID");
        java.util.ArrayList arrayList = new java.util.ArrayList(commands.length);
        for (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command : commands) {
            arrayList.add(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, gen2Command, deviceID, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, null, null, null, 63, null), null, 1.0f, 0L, null, 104, null));
        }
        io.reactivex.Observable observableConcat = io.reactivex.Observable.concat(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(commands.map { sendSingleCommandWithAck(it, deviceID, Gen2DataInfo(), power = 1F) })");
        return this$0.deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observableConcat, null, null, 6, null)).ignoreElements();
    }
}
