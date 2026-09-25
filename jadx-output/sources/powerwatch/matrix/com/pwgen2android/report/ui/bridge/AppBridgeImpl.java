package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppBridgeImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012$\b\u0002\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b`\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0007J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;", "appWebView", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;", "appWebViewClient", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;", "context", "Landroid/content/Context;", "receivingSubject", "Lio/reactivex/subjects/PublishSubject;", "", "waitingMessageQueue", "Ljava/util/HashMap;", "Lio/reactivex/CompletableEmitter;", "Lkotlin/collections/HashMap;", "(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;)V", "isAppLoaded", "", "messageSender", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "Lio/reactivex/Completable;", "config", "", "configMessage", "configureBridge", "destroy", "messageOutput", "Lio/reactivex/Observable;", "onPageFinished", "url", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "postMessage", "sendMessage", "data", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppBridgeImpl implements powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener {
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.class.getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView appWebView;
    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient appWebViewClient;
    private boolean isAppLoaded;
    private kotlin.jvm.functions.Function1<? super java.lang.String, ? extends io.reactivex.Completable> messageSender;
    private final io.reactivex.subjects.PublishSubject<java.lang.String> receivingSubject;
    private final java.util.HashMap<io.reactivex.CompletableEmitter, java.lang.String> waitingMessageQueue;

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener
    public void onReceivedError(android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    }

    public AppBridgeImpl(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView appWebView, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient appWebViewClient, android.content.Context context, io.reactivex.subjects.PublishSubject<java.lang.String> receivingSubject, java.util.HashMap<io.reactivex.CompletableEmitter, java.lang.String> waitingMessageQueue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appWebView, "appWebView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appWebViewClient, "appWebViewClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receivingSubject, "receivingSubject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waitingMessageQueue, "waitingMessageQueue");
        this.appWebView = appWebView;
        this.appWebViewClient = appWebViewClient;
        this.receivingSubject = receivingSubject;
        this.waitingMessageQueue = waitingMessageQueue;
        this.messageSender = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl$messageSender$1(this);
        appWebView.setJavaScriptEnabled(true);
        appWebView.addJavascriptInterface(this, "android");
        appWebViewClient.setWebViewLifecycleListener(this);
        appWebView.setWebViewClient(appWebViewClient);
        appWebView.loadUrl("https://report.powerwatch.com");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppBridgeImpl(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView appWebView, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient appWebViewClient, android.content.Context context, io.reactivex.subjects.PublishSubject publishSubject, java.util.HashMap map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            publishSubject = io.reactivex.subjects.PublishSubject.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubject, "create<String>()");
        }
        this(appWebView, appWebViewClient, context, publishSubject, (i & 16) != 0 ? new java.util.HashMap() : map);
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge
    public io.reactivex.Completable sendMessage(java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.messageSender.invoke(data);
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge
    public io.reactivex.Observable<java.lang.String> messageOutput() {
        return this.receivingSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge
    public void destroy() {
        this.appWebViewClient.setWebViewLifecycleListener(null);
        this.appWebView.destroy();
    }

    private final void configureBridge(java.lang.String configMessage) {
        this.appWebView.evaluateJavascript("var androidWrapper = {\npostMessage(message) {\n\nandroid.postMessage(message)},\nconfig(message) {\nandroid.config(message)}\n}", null);
        this.appWebView.evaluateJavascript(configMessage, null);
    }

    @android.webkit.JavascriptInterface
    public final void config(java.lang.String configMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configMessage, "configMessage");
        this.isAppLoaded = true;
        try {
            final java.lang.String string = new org.json.JSONObject(configMessage).getString("acceptPath");
            this.messageSender = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl.AnonymousClass1(string);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$AppBridgeImpl$4I4xQcxokltrG-Wf0CEMEnD6uTs
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl.m2096config$lambda0(this.f$0, string);
                }
            });
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl$config$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppBridgeImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "message1", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, io.reactivex.Completable> {
        final /* synthetic */ java.lang.String $sendingPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.lang.String str) {
            super(1);
            this.$sendingPath = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final io.reactivex.Completable invoke(final java.lang.String message1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message1, "message1");
            final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl appBridgeImpl = powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl.this;
            final java.lang.String str = this.$sendingPath;
            io.reactivex.Completable completableSubscribeOn = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$AppBridgeImpl$config$1$LIZuwc5gP4Skk338x43vCtM1xvc
                @Override // io.reactivex.CompletableOnSubscribe
                public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                    powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl.AnonymousClass1.m2098invoke$lambda0(appBridgeImpl, str, message1, completableEmitter);
                }
            }).subscribeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "create { emitter ->\n                    appWebView.evaluateJavascript(\"$sendingPath('$message1')\", null)\n                    emitter.onComplete()\n                }\n                        .subscribeOn(AndroidSchedulers.mainThread())");
            return completableSubscribeOn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m2098invoke$lambda0(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl this$0, java.lang.String str, java.lang.String message1, io.reactivex.CompletableEmitter emitter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message1, "$message1");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
            this$0.appWebView.evaluateJavascript(((java.lang.Object) str) + "('" + message1 + "')", null);
            emitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: config$lambda-0, reason: not valid java name */
    public static final void m2096config$lambda0(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridgeImpl this$0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (io.reactivex.CompletableEmitter completableEmitter : this$0.waitingMessageQueue.keySet()) {
            java.lang.String str2 = this$0.waitingMessageQueue.get(completableEmitter);
            this$0.appWebView.evaluateJavascript(((java.lang.Object) str) + "('" + ((java.lang.Object) str2) + "')", null);
            completableEmitter.onComplete();
        }
        this$0.waitingMessageQueue.clear();
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.receivingSubject.onNext(message);
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener
    public void onPageFinished(java.lang.String url) {
        configureBridge("bridge.configure(androidWrapper)");
    }
}
