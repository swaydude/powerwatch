package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: ReportIssueViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\u0012\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.H\u0002J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001f00H\u0002J\u0006\u00101\u001a\u00020)J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\tH\u0016J\u0010\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\tH\u0016J\u0006\u00105\u001a\u00020)J&\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<H\u0002J\u0014\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001f07H\u0002J\b\u0010>\u001a\u00020#H\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020807H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\t0\t0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000b0\u000b0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006@"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "reportInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;", "appBridge", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;", "gson", "Lcom/google/gson/Gson;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "logCollectorExtension", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "webBridgeLoggerExtension", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;", "logUploadService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;", "fragment", "Landroidx/fragment/app/Fragment;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;Lcom/google/gson/Gson;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;Landroidx/fragment/app/Fragment;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragmentManagerWeakReference", "logsObservableField", "Landroidx/databinding/ObservableField;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;", "screenshotsData", "", "", "webPageLoaded", "", "getWebPageLoaded", "()Landroidx/databinding/ObservableField;", "attachToBridge", "", "attachToLogger", "createFile", "Ljava/io/File;", "path", "", "loadImages", "Lio/reactivex/Maybe;", "onBackClicked", "onCreateView", "context", "onDestroyView", "onPageLoaded", "uploadFile", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;", "data", "filename", powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.key, "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;", "uploadScreenshots", "zipLogs", "zipLogsAndSendToService", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReportIssueViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge appBridge;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private final androidx.fragment.app.Fragment fragment;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final com.google.gson.Gson gson;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension logCollectorExtension;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService logUploadService;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView>> logsObservableField;
    private final powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider reportInfoProvider;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private final java.util.List<byte[]> screenshotsData;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension webBridgeLoggerExtension;
    private final androidx.databinding.ObservableField<java.lang.Boolean> webPageLoaded;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-23, reason: not valid java name */
    public static final void m2119attachToBridge$lambda23() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-24, reason: not valid java name */
    public static final void m2120attachToBridge$lambda24(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2138onCreateView$lambda2() {
    }

    public final androidx.fragment.app.Fragment getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportIssueViewModel(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider reportInfoProvider, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge appBridge, com.google.gson.Gson gson, android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension logCollectorExtension, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension webBridgeLoggerExtension, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService logUploadService, androidx.fragment.app.Fragment fragment, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportInfoProvider, "reportInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBridge, "appBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "gson");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logCollectorExtension, "logCollectorExtension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webBridgeLoggerExtension, "webBridgeLoggerExtension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logUploadService, "logUploadService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.reportInfoProvider = reportInfoProvider;
        this.appBridge = appBridge;
        this.gson = gson;
        this.logCollectorExtension = logCollectorExtension;
        this.webBridgeLoggerExtension = webBridgeLoggerExtension;
        this.logUploadService = logUploadService;
        this.fragment = fragment;
        this.rxPermissions = rxPermissions;
        this.logsObservableField = new androidx.databinding.ObservableField<>(new java.util.ArrayList());
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activityContext);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.screenshotsData = new java.util.ArrayList();
        this.webPageLoaded = new androidx.databinding.ObservableField<>(false);
    }

    public /* synthetic */ ReportIssueViewModel(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider reportInfoProvider, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge appBridge, com.google.gson.Gson gson, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension pWLogCollectorExtension, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension pWLoggerWebBridgeLoggerExtension, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService logUploadService, androidx.fragment.app.Fragment fragment, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(reportInfoProvider, appBridge, gson, context, fragmentManager, pWLogCollectorExtension, pWLoggerWebBridgeLoggerExtension, logUploadService, fragment, (i & 512) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions(fragment) : rxPermissions);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getWebPageLoaded() {
        return this.webPageLoaded;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.webBridgeLoggerExtension.init();
        android.content.Context context2 = this.contextWeakReference.get();
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = context2 instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) context2 : null;
        if (mainActivity != null) {
            mainActivity.showTab(false);
        }
        getCompositeDisposable().add(this.reportInfoProvider.provideUserEnvironment().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$mSfrkVjzmExEQ2KlmmemXqPNCSw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2136onCreateView$lambda0((powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$0oTnl3UCJf7IVkbrKVqioSrNAq0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2137onCreateView$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$xt9XvKLQGIUWxOwlvF9Z7_I1Wwk
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2138onCreateView$lambda2();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$kdQc-NwQ_Nvsqa5mG4A6jn2l0x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        attachToLogger();
        attachToBridge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope m2136onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope(powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendUserEnvResponse.INSTANCE.getType(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2137onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge appBridge = this$0.appBridge;
        java.lang.String json = this$0.gson.toJson(it);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(it)");
        return appBridge.sendMessage(json);
    }

    static /* synthetic */ java.io.File createFile$default(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel reportIssueViewModel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "screenshot.jpg";
        }
        return reportIssueViewModel.createFile(str);
    }

    private final java.io.File createFile(java.lang.String path) throws java.io.FileNotFoundException {
        android.content.Context context = this.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        context.openFileOutput(path, 32768);
        android.content.Context context2 = this.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        java.io.File fileStreamPath = context2.getFileStreamPath(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileStreamPath, "contextWeakReference.get()!!.getFileStreamPath(path)");
        return fileStreamPath;
    }

    private final io.reactivex.Maybe<java.util.List<byte[]>> loadImages() {
        io.reactivex.Maybe<java.util.List<byte[]>> maybeFirstElement = this.rxPermissions.request("android.permission.READ_EXTERNAL_STORAGE").flatMapMaybe(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$s6CLo9UvdeX6HPveP_HCloiJd_Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2132loadImages$lambda8(this.f$0, (java.lang.Boolean) obj);
            }
        }).firstElement();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "rxPermissions.request(Manifest.permission.READ_EXTERNAL_STORAGE)\n                .flatMapMaybe { approved ->\n                    if (approved) {\n                        RxImagePicker.with(fragmentManagerWeakReference.get()!!)\n                                .requestMultipleImages()\n                                .map { uriList ->\n                                    uriList.map { uri ->\n                                        RxImageConverters.uriToBitmap(contextWeakReference.get()!!, uri)\n                                                .map {\n                                                    val out = ByteArrayOutputStream()\n                                                    it.compress(Bitmap.CompressFormat.JPEG, 50, out)\n                                                    out.toByteArray()\n                                                }\n                                    }\n                                }\n                                .firstElement()\n                                .flatMap {\n                                    Observable.merge(it)\n                                            .toList().toMaybe()\n\n                                }\n                    } else Maybe.empty<List<ByteArray>>()\n                }\n                .firstElement()");
        return maybeFirstElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImages$lambda-8, reason: not valid java name */
    public static final io.reactivex.MaybeSource m2132loadImages$lambda8(final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.lang.Boolean approved) {
        io.reactivex.Maybe maybeEmpty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approved, "approved");
        if (approved.booleanValue()) {
            com.mlsdev.rximagepicker.RxImagePicker.Companion companion = com.mlsdev.rximagepicker.RxImagePicker.INSTANCE;
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
            maybeEmpty = companion.with(fragmentManager).requestMultipleImages().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$FE91Bo4K_smiAHP8P5u0a8yjCb8
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2133loadImages$lambda8$lambda6(this.f$0, (java.util.List) obj);
                }
            }).firstElement().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$9C2PYc-8LVhFkEh15DWlMRbgBLY
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2135loadImages$lambda8$lambda7((java.util.List) obj);
                }
            });
        } else {
            maybeEmpty = io.reactivex.Maybe.empty();
        }
        return maybeEmpty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImages$lambda-8$lambda-6, reason: not valid java name */
    public static final java.util.List m2133loadImages$lambda8$lambda6(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.util.List uriList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uriList, "uriList");
        java.util.List<android.net.Uri> list = uriList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (android.net.Uri uri : list) {
            com.mlsdev.rximagepicker.RxImageConverters rxImageConverters = com.mlsdev.rximagepicker.RxImageConverters.INSTANCE;
            android.content.Context context = this$0.contextWeakReference.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            arrayList.add(rxImageConverters.uriToBitmap(context, uri).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$ic3Qsf7EAwJaG3jmLkgQDfNz6x4
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2134loadImages$lambda8$lambda6$lambda5$lambda4((android.graphics.Bitmap) obj);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImages$lambda-8$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final byte[] m2134loadImages$lambda8$lambda6$lambda5$lambda4(android.graphics.Bitmap it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        it.compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImages$lambda-8$lambda-7, reason: not valid java name */
    public static final io.reactivex.MaybeSource m2135loadImages$lambda8$lambda7(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.merge(it).toList().toMaybe();
    }

    private final io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse>> uploadScreenshots() {
        java.util.List<byte[]> list = this.screenshotsData;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new kotlin.Pair(java.lang.Integer.valueOf(i), (byte[]) obj));
            i = i2;
        }
        io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse>> list2 = io.reactivex.rxkotlin.ObservableKt.toObservable(arrayList).flatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$hNd7JsLtAs5rwtcQwZ4kGYeqlV0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2140uploadScreenshots$lambda10(this.f$0, (kotlin.Pair) obj2);
            }
        }).toList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "this.screenshotsData.mapIndexed { index, bytes ->\n            Pair(index, bytes)\n        }.toObservable().flatMapSingle { filePair ->\n            uploadFile(filePair.second, \"android_screenshot_${filePair.first}.jpg\", AttachmentType.SCREENSHOT)\n        }.toList()");
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadScreenshots$lambda-10, reason: not valid java name */
    public static final io.reactivex.SingleSource m2140uploadScreenshots$lambda10(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, kotlin.Pair filePair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePair, "filePair");
        return this$0.uploadFile((byte[]) filePair.getSecond(), "android_screenshot_" + ((java.lang.Number) filePair.getFirst()).intValue() + ".jpg", powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.SCREENSHOT.INSTANCE);
    }

    private final void attachToBridge() {
        getCompositeDisposable().add(this.appBridge.messageOutput().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$3jbOP9TOe366gqj_iroEVDWuNYY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2107attachToBridge$lambda11(this.f$0, (java.lang.String) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$22TNq9po2cI6Dj_jJ8u75Jyu7RA
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2108attachToBridge$lambda12((powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).subscribeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).flatMapMaybe(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$p5-G-9QStr5QphbmDE83e-eObeg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2109attachToBridge$lambda13(this.f$0, (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$njUBmcsUlq2l23xoRoihjEyXE8s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2110attachToBridge$lambda14(this.f$0, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$2AIVlcjs_xJLcnydEBG8BSx_55Y
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(this.appBridge.messageOutput().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$Z6qGTnlU8V8EGr-33jnY42C5PaE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2112attachToBridge$lambda16(this.f$0, (java.lang.String) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$E9i8UwOTsN3Wa21U258OZFJTX2E
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2113attachToBridge$lambda17((powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).flatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$xLQguGG5zrKi4Z9VdgUPoGx8lkI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2114attachToBridge$lambda19(this.f$0, (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).flatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$5ujJ3S83GUymuYml1yFYCEsdrJA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2116attachToBridge$lambda21(this.f$0, (java.util.List) obj);
            }
        }).retry().repeat().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$rl8E493cjyqkkUhalo2968knT2E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2118attachToBridge$lambda22(this.f$0, (java.util.List) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$Vc9HF9JA-rxvrdKqU4zwGrwy_Sg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2119attachToBridge$lambda23();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$FLBHFxhUaufUoVmDmFPUrXrXdY4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2120attachToBridge$lambda24((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope m2107attachToBridge$lambda11(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) this$0.gson.fromJson(it, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-12, reason: not valid java name */
    public static final boolean m2108attachToBridge$lambda12(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it.getEnvelopeType(), powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.ScreenshotsRequest.INSTANCE.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-13, reason: not valid java name */
    public static final io.reactivex.MaybeSource m2109attachToBridge$lambda13(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.loadImages();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-14, reason: not valid java name */
    public static final void m2110attachToBridge$lambda14(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.screenshotsData.clear();
        java.util.List<byte[]> list = this$0.screenshotsData;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        list.addAll(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-16, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope m2112attachToBridge$lambda16(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) this$0.gson.fromJson(it, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-17, reason: not valid java name */
    public static final boolean m2113attachToBridge$lambda17(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it.getEnvelopeType(), powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsRequest.INSTANCE.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-19, reason: not valid java name */
    public static final io.reactivex.SingleSource m2114attachToBridge$lambda19(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        io.reactivex.SingleSource singleSourceJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.Object payload = it.getPayload();
        java.util.Objects.requireNonNull(payload, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) payload).get("uploadLogs"), (java.lang.Object) true)) {
            singleSourceJust = this$0.zipLogsAndSendToService().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2115attachToBridge$lambda19$lambda18((powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse) obj);
                }
            });
        } else {
            singleSourceJust = io.reactivex.Single.just(kotlin.collections.CollectionsKt.emptyList());
        }
        return singleSourceJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-19$lambda-18, reason: not valid java name */
    public static final java.util.List m2115attachToBridge$lambda19$lambda18(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.listOf(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-21, reason: not valid java name */
    public static final io.reactivex.SingleSource m2116attachToBridge$lambda21(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, final java.util.List uploadURLs) {
        io.reactivex.SingleSource singleSourceJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadURLs, "uploadURLs");
        if (!this$0.screenshotsData.isEmpty()) {
            singleSourceJust = this$0.uploadScreenshots().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$KdM0RPZdtn02G9bfDmAsk_-EZQc
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2117attachToBridge$lambda21$lambda20(uploadURLs, (java.util.List) obj);
                }
            });
        } else {
            singleSourceJust = io.reactivex.Single.just(uploadURLs);
        }
        return singleSourceJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-21$lambda-20, reason: not valid java name */
    public static final java.util.List m2117attachToBridge$lambda21$lambda20(java.util.List uploadURLs, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadURLs, "$uploadURLs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) uploadURLs, (java.lang.Iterable) it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToBridge$lambda-22, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2118attachToBridge$lambda22(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge appBridge = this$0.appBridge;
        java.lang.String json = this$0.gson.toJson(new powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope(powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsResponse.INSTANCE.getType(), it));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(Envelope(\n                                            envelopeType = EnvelopeTypes.SendLogsResponse.type,\n                                            payload = it\n                                    ))");
        return appBridge.sendMessage(json);
    }

    public final void onPageLoaded() {
        this.webPageLoaded.set(true);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.webBridgeLoggerExtension.destroy();
        getCompositeDisposable().clear();
    }

    private final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> zipLogsAndSendToService() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> singleFlatMap = io.reactivex.Single.fromCallable(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$10GJc2UOjvvwAw4Ot8fdy6ozExY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2141zipLogsAndSendToService$lambda25(this.f$0);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$EPf7eAfNj6FL9Hy-JNjsDRQdjpA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2142zipLogsAndSendToService$lambda26(this.f$0, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "fromCallable { zipLogs() }\n                .flatMap {\n                    uploadFile(it, \"android_logs.zip\", AttachmentType.LOGS)\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zipLogsAndSendToService$lambda-25, reason: not valid java name */
    public static final byte[] m2141zipLogsAndSendToService$lambda25(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.zipLogs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zipLogsAndSendToService$lambda-26, reason: not valid java name */
    public static final io.reactivex.SingleSource m2142zipLogsAndSendToService$lambda26(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.uploadFile(it, "android_logs.zip", powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.LOGS.INSTANCE);
    }

    private final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> uploadFile(byte[] data, java.lang.String filename, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType attachmentType) {
        return this.logUploadService.uploadFile(data, filename, kotlin.collections.MapsKt.mapOf(new kotlin.Pair(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.key, attachmentType.getType())));
    }

    private final void attachToLogger() {
        getCompositeDisposable().add(this.logCollectorExtension.collectedLogs(null, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$SDdM2RiLC_VaFBhvr9FoHr8F9Zg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2121attachToLogger$lambda28((java.util.List) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$mMSTq3cbfJUPtESPBJitjlgzFnY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.m2122attachToLogger$lambda29(this.f$0, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueViewModel$UBIaw4qE4m6Z0XG-8v-4k45MTqw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-28, reason: not valid java name */
    public static final java.util.List m2121attachToLogger$lambda28(java.util.List logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog : list) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView(pWLog.getTag(), pWLog.getMessage(), pWLog.getLogLevel(), pWLog.getTimestamp()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-29, reason: not valid java name */
    public static final void m2122attachToLogger$lambda29(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logsObservableField.set(list);
    }

    private final byte[] zipLogs() {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView> list = this.logsObservableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView pWLogView : list) {
            sb.append('[' + pWLogView.getTitle() + "] [" + pWLogView.getLogLevel().getLevelTag() + "] [" + pWLogView.getTime() + "] " + pWLogView.getContent() + '\n');
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        byte[] bytes = string.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.ZipExtensionsKt.toZip(bytes);
    }
}
