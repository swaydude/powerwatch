package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppBridgeImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, ""}, k = 3, mv = {1, 5, 1}, xi = 48)
final class AppBridgeImpl$messageSender$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Completable> {
    final /* synthetic */ powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBridgeImpl$messageSender$1(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl appBridgeImpl) {
        super(1);
        this.this$0 = appBridgeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m2099invoke$lambda0(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl this$0, java.lang.String message, io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.waitingMessageQueue.put(emitter, message);
    }

    @Override // kotlin.jvm.functions.Function1
    public final io.reactivex.Completable invoke(final java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl appBridgeImpl = this.this$0;
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$AppBridgeImpl$messageSender$1$n-RZ2gQjzAHgu_u6FqTlc2HE6JU
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl$messageSender$1.m2099invoke$lambda0(appBridgeImpl, message, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter -> waitingMessageQueue[emitter] = message }");
        return completableCreate;
    }
}
