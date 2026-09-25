package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: SyncProgressChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013J\u0006\u0010\u0014\u001a\u00020\u000fR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;", "", "()V", "progressSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "tempPowersConfig", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;", "getTempPowersConfig", "()Lkotlin/jvm/functions/Function1;", "setTempPowersConfig", "(Lkotlin/jvm/functions/Function1;)V", "onProgress", "", "commandId", "value", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "Lio/reactivex/Observable;", "reset", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SyncProgressChannel {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Float> progressSubject;
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> tempPowersConfig;

    public SyncProgressChannel() {
        io.reactivex.subjects.BehaviorSubject<java.lang.Float> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<Float>()");
        this.progressSubject = behaviorSubjectCreate;
        this.tempPowersConfig = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getSyncConfigPowersV2();
    }

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> getTempPowersConfig() {
        return this.tempPowersConfig;
    }

    public final void setTempPowersConfig(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs, java.lang.Float> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.tempPowersConfig = function1;
    }

    public final void onProgress(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CommandIDs commandId, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commandId, "commandId");
        float fFloatValue = this.tempPowersConfig.invoke(commandId).floatValue();
        java.lang.Float value2 = this.progressSubject.getValue();
        if (value2 == null) {
            value2 = java.lang.Float.valueOf(0.0f);
        }
        float fFloatValue2 = value2.floatValue();
        float f = (value * fFloatValue) + fFloatValue2;
        java.lang.System.out.println((java.lang.Object) ("Progress - cur: " + fFloatValue2 + ", received: " + value + ", total: " + f + ", power: " + fFloatValue));
        this.progressSubject.onNext(java.lang.Float.valueOf(f));
    }

    public final io.reactivex.Observable<java.lang.Float> progress() {
        return this.progressSubject;
    }

    public final void reset() {
        this.progressSubject.onNext(java.lang.Float.valueOf(0.0f));
    }
}
