package powerwatch.matrix.com.pwgen2android.shared.ui.notifications;

/* JADX INFO: compiled from: NotificationLoggerViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\n\u0010$\u001a\u00020\u0019*\u00020%J\n\u0010&\u001a\u00020\u0019*\u00020%J\n\u0010'\u001a\u00020\u0019*\u00020%R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00070\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \u000b*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "loggerCollectorExtension", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Landroidx/fragment/app/FragmentManager;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getFragmentManagerWeakReference", "()Ljava/lang/ref/WeakReference;", "logLevels", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "[Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "logsObservableField", "Landroidx/databinding/ObservableField;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLogView;", "getLogsObservableField", "()Landroidx/databinding/ObservableField;", "attachToLogger", "", "levelFilters", "tagsFilters", "", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "logsString", "onCreateView", "onDestroyView", "onBackClicked", "Landroid/view/View;", "onRemoveClicked", "onSharedClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationLoggerViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[] logLevels;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension loggerCollectorExtension;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView>> logsObservableField;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-3, reason: not valid java name */
    public static final void m3515attachToLogger$lambda3(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLoggerViewModel(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension loggerCollectorExtension, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput logger, androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerCollectorExtension, "loggerCollectorExtension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.loggerCollectorExtension = loggerCollectorExtension;
        this.logger = logger;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.logLevels = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[]{powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE};
        this.logsObservableField = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
    }

    public final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> getFragmentManagerWeakReference() {
        return this.fragmentManagerWeakReference;
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView>> getLogsObservableField() {
        return this.logsObservableField;
    }

    private final void attachToLogger(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel> levelFilters, java.util.List<java.lang.String> tagsFilters) {
        getCompositeDisposable().clear();
        getCompositeDisposable().add(this.loggerCollectorExtension.collectedLogs(levelFilters, tagsFilters).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.-$$Lambda$NotificationLoggerViewModel$mDuDdLfJFleSKZB6kFuhQxNvsxw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel.m3513attachToLogger$lambda1((java.util.List) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.-$$Lambda$NotificationLoggerViewModel$rx3tFZOoj0mWlG0hK4LL4DXSPfE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel.m3514attachToLogger$lambda2(this.f$0, (java.util.List) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.notifications.-$$Lambda$NotificationLoggerViewModel$AKZ0fGuSx1Xz9uXJqx6_4SgFQ_A
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel.m3515attachToLogger$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-1, reason: not valid java name */
    public static final java.util.List m3513attachToLogger$lambda1(java.util.List logs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog : list) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView(pWLog.getTag(), pWLog.getMessage(), pWLog.getLogLevel(), pWLog.getTimestamp()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: attachToLogger$lambda-2, reason: not valid java name */
    public static final void m3514attachToLogger$lambda2(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerViewModel this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getLogsObservableField().set(list);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        attachToLogger(kotlin.collections.ArraysKt.toList(this.logLevels), kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.getINTERNAL_TAG()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().clear();
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
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView> list = this.logsObservableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView notificationLogView : list) {
            sb.append('[' + notificationLogView.getTitle() + "] [" + notificationLogView.getLogLevel().getLevelTag() + "] [" + notificationLogView.getTime() + "] " + notificationLogView.getContent() + '\n');
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
        java.io.File file = java.io.File.createTempFile("PWNotificationLogs", ".txt", context.getCacheDir());
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
