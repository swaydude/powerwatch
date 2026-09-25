package powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger;

/* JADX INFO: compiled from: InternalLoggerViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\u0014\u0010,\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\"\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\n\u00100\u001a\u00020\"*\u000201J\n\u00102\u001a\u00020\"*\u000201J\n\u00103\u001a\u00020\"*\u000201R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00070\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u000b*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u000b*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cX\u0082\u000e¢\u0006\u0002\n\u0000RO\u0010\u001d\u001a@\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f \u000b*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f\u0018\u00010\u001e0\u001e0\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "loggerCollectorExtension", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Landroidx/fragment/app/FragmentManager;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getFragmentManagerWeakReference", "()Ljava/lang/ref/WeakReference;", "logLevelFilterList", "Landroidx/databinding/ObservableField;", "", "", "getLogLevelFilterList", "()Landroidx/databinding/ObservableField;", "logLevels", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "[Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "logsObservableField", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/PWLogView;", "getLogsObservableField", "tagsBlackList", "", "tagsList", "Lkotlin/Pair;", "", "getTagsList", "attachToLogger", "", "levelFilters", "tagsFilters", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "logsString", "onCreateView", "onDestroyView", "onLogLevelFilterChanged", "selectedLevels", "onTagsFilterChanged", "selectedTags", "onBackClicked", "Landroid/view/View;", "onRemoveClicked", "onSharedClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class InternalLoggerViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.util.List<java.lang.String>> logLevelFilterList;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[] logLevels;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension loggerCollectorExtension;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView>> logsObservableField;
    private java.util.Set<java.lang.String> tagsBlackList;
    private final androidx.databinding.ObservableField<kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> tagsList;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-5, reason: not valid java name */
    public static final void m3479attachToLogger$lambda5(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalLoggerViewModel(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension loggerCollectorExtension, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerCollectorExtension, "loggerCollectorExtension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.loggerCollectorExtension = loggerCollectorExtension;
        this.logger = logger;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.tagsList = new androidx.databinding.ObservableField<>(new kotlin.Pair(new java.util.LinkedHashSet(), new java.util.LinkedHashSet()));
        this.tagsBlackList = kotlin.collections.SetsKt.emptySet();
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[] logLevelArr = {powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE};
        this.logLevels = logLevelArr;
        this.logsObservableField = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
        java.util.ArrayList arrayList = new java.util.ArrayList(logLevelArr.length);
        for (powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel : logLevelArr) {
            arrayList.add(logLevel.getLevelTag());
        }
        this.logLevelFilterList = new androidx.databinding.ObservableField<>(arrayList);
    }

    public final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getFragmentManagerWeakReference() {
        return this.fragmentManagerWeakReference;
    }

    public final androidx.databinding.ObservableField<kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> getTagsList() {
        return this.tagsList;
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView>> getLogsObservableField() {
        return this.logsObservableField;
    }

    public final androidx.databinding.ObservableField<java.util.List<java.lang.String>> getLogLevelFilterList() {
        return this.logLevelFilterList;
    }

    private final void attachToLogger(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel> levelFilters, java.util.List<java.lang.String> tagsFilters) {
        getCompositeDisposable().clear();
        getCompositeDisposable().add(this.loggerCollectorExtension.collectedLogs(levelFilters, tagsFilters).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.-$$Lambda$InternalLoggerViewModel$hjifCTVQNSDkaydEysDWab0L0Mo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel.m3477attachToLogger$lambda2((java.util.List) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.-$$Lambda$InternalLoggerViewModel$-yUVIwc39bPimCJGc1HjI1_pMN8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel.m3478attachToLogger$lambda4(this.f$0, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.-$$Lambda$InternalLoggerViewModel$S4EUg9I2Cv7OzNxahNwmyKiY_a4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel.m3479attachToLogger$lambda5((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-2, reason: not valid java name */
    public static final java.util.List m3477attachToLogger$lambda2(java.util.List logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog : list) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView(pWLog.getTag(), pWLog.getMessage(), pWLog.getLogLevel(), pWLog.getTimestamp()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-4, reason: not valid java name */
    public static final void m3478attachToLogger$lambda4(powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerViewModel this$0, java.util.List pwLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair = this$0.getTagsList().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
        java.util.Set<java.lang.String> first = pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pwLogs, "pwLogs");
        java.util.List list = pwLogs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView) it.next()).getTitle());
        }
        first.addAll(arrayList);
        this$0.getTagsList().set(new kotlin.Pair<>(first, kotlin.collections.CollectionsKt.toMutableSet(kotlin.collections.CollectionsKt.subtract(first, this$0.tagsBlackList))));
        this$0.getLogsObservableField().set(pwLogs);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        attachToLogger(kotlin.collections.ArraysKt.toList(this.logLevels), null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().clear();
    }

    public final void onLogLevelFilterChanged(java.util.List<java.lang.String> selectedLevels) {
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedLevels, "selectedLevels");
        java.util.List<java.lang.String> list = selectedLevels;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.String str : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE;
            } else {
                logLevel = kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE.getLevelTag()) ? powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE;
            }
            arrayList.add(logLevel);
        }
        kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair = this.tagsList.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
        attachToLogger(arrayList, kotlin.collections.CollectionsKt.toList(pair.getSecond()));
    }

    public final void onTagsFilterChanged(java.util.List<java.lang.String> selectedTags, java.util.List<java.lang.String> selectedLevels) {
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTags, "selectedTags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedLevels, "selectedLevels");
        kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>> pair = this.tagsList.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(pair);
        this.tagsBlackList = kotlin.collections.CollectionsKt.subtract(pair.getFirst(), selectedTags);
        java.util.List<java.lang.String> list = selectedLevels;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.lang.String str : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE.getLevelTag())) {
                logLevel = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE;
            } else {
                logLevel = kotlin.jvm.internal.Intrinsics.areEqual(str, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE.getLevelTag()) ? powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE;
            }
            arrayList.add(logLevel);
        }
        attachToLogger(arrayList, selectedTags);
    }

    public final void onBackClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onSharedClicked(android.view.View view) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView> list = this.logsObservableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.PWLogView pWLogView : list) {
            sb.append('[' + pWLogView.getTitle() + "] [" + pWLogView.getLogLevel().getLevelTag() + "] [" + pWLogView.getTime() + "] " + pWLogView.getContent() + '\n');
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        java.io.File fileCreateFile = createFile(context, string);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", "Android logs");
        intent.setType("*/txt");
        intent.putExtra("android.intent.extra.STREAM", androidx.core.content.FileProvider.getUriForFile(view.getContext(), view.getContext().getApplicationContext().getPackageName(), fileCreateFile));
        view.getContext().startActivity(android.content.Intent.createChooser(intent, "Share collected logs"));
    }

    public final void onRemoveClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.loggerCollectorExtension.clear();
    }

    private final java.io.File createFile(android.content.Context context, java.lang.String logsString) throws java.lang.Throwable {
        java.io.File file = java.io.File.createTempFile("PWLogs", ".txt", context.getCacheDir());
        java.io.BufferedWriter bufferedWriter = null;
        try {
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.FileWriter(file));
            try {
                bufferedWriter2.write(logsString);
                bufferedWriter2.close();
                bufferedWriter2.close();
            } catch (java.io.IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
        return file;
    }
}
