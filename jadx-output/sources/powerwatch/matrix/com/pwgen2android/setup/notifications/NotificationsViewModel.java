package powerwatch.matrix.com.pwgen2android.setup.notifications;

/* JADX INFO: compiled from: NotificationsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0002\u0010\u0017J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0006\u0010/\u001a\u00020+J\u0010\u00100\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00060\u00060\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010#0#0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00061"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "appContext", "alertsStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;", "dialogManager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "appsResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;", "whiteListResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "appStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "notificationTypeController", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "savePreferencesViewModel", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lcom/tbruyelle/rxpermissions2/RxPermissions;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "getAppStorage", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "getAppsResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getNotificationTypeController", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "refreshView", "Landroidx/databinding/ObservableField;", "", "getRefreshView", "()Landroidx/databinding/ObservableField;", "showSaveProgress", "getShowSaveProgress", "getWhiteListResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "onBackClicked", "", "onCreateView", "context", "onDestroyView", "onSaveClicked", "onStart", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationsViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage alertsStorage;
    private final android.content.Context appContext;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage appStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver appsResolver;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController;
    private final androidx.databinding.ObservableField<java.lang.Boolean> refreshView;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver;

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver getAppsResolver() {
        return this.appsResolver;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver getWhiteListResolver() {
        return this.whiteListResolver;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage getAppStorage() {
        return this.appStorage;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController getNotificationTypeController() {
        return this.notificationTypeController;
    }

    public /* synthetic */ NotificationsViewModel(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage alertsStorage, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver otherAppsResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, context2, alertsStorage, dialogManager, otherAppsResolver, whiteListResolver, thirdPartyAppStorage, notificationTypeController, (i & 512) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions((androidx.fragment.app.FragmentActivity) context) : rxPermissions, (i & 1024) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsViewModel(android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage alertsStorage, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver appsResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage appStorage, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsStorage, "alertsStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogManager, "dialogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appsResolver, "appsResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whiteListResolver, "whiteListResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "appStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTypeController, "notificationTypeController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.appContext = appContext;
        this.alertsStorage = alertsStorage;
        this.dialogManager = dialogManager;
        this.appsResolver = appsResolver;
        this.whiteListResolver = whiteListResolver;
        this.appStorage = appStorage;
        this.notificationTypeController = notificationTypeController;
        this.rxPermissions = rxPermissions;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.refreshView = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getRefreshView() {
        return this.refreshView;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.appsResolver.update();
        if (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE.isNotificationServiceEnabled(context)) {
            return;
        }
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.DefaultImpls.openAlertDialog$default(this.dialogManager, context, powerwatch.matrix.com.pwgen2android.R.string.notification_dialog_title, powerwatch.matrix.com.pwgen2android.R.string.notification_dialog_message, powerwatch.matrix.com.pwgen2android.R.string.button_continue, 0, 16, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.-$$Lambda$NotificationsViewModel$9BUFQVSO1YuFWDOTzm98jm4-GgM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.m2910onCreateView$lambda0(context, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2910onCreateView$lambda0(android.content.Context context, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            context.startActivity(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.ACTION_NOTIFICATION_LISTENER_SETTINGS));
        } else {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE.userDeclinedGlobalService(context);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onStart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onStart(context);
        boolean zIsGranted = this.rxPermissions.isGranted("android.permission.READ_PHONE_STATE");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver = this.whiteListResolver;
        whiteListResolver.isAppEnabled(whiteListResolver.getMainDialerPackage());
        if (!zIsGranted) {
            this.whiteListResolver.enableCallsApp(false, true);
        }
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.refreshView;
        java.lang.Boolean bool = observableField.get();
        observableField.set(bool == null ? null : java.lang.Boolean.valueOf(true ^ bool.booleanValue()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.whiteListResolver.clearLocalMemory();
        this.appsResolver.clearLocalMemory();
        this.notificationTypeController.clearMemory();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onSaveClicked() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.-$$Lambda$NotificationsViewModel$eYZberYgCjwZ_oT3nVECPWVyfQs
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.m2911onSaveClicked$lambda1(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            whiteListResolver.flushMemory()\n            appsResolver.flushMemory()\n        }");
        getShowSaveProgress().set(true);
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage alertsStorage = this.alertsStorage;
        compositeDisposable.add(completableFromAction.andThen(alertsStorage.setNotificationTypesEnabled(alertsStorage.getAreCallsEnabled(), this.alertsStorage.getAreMessagesEnabled(), false, false, this.appContext)).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.-$$Lambda$NotificationsViewModel$YSWJKFx_Nji_LAgpYGpZUzLpBqE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.m2912onSaveClicked$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.-$$Lambda$NotificationsViewModel$VTgucUQ-oOJaHJ9bOe4JV-TGhfM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.m2913onSaveClicked$lambda3(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.notifications.-$$Lambda$NotificationsViewModel$7EiF-C4YZ5TAPp9Awin7JFuWRao
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel.m2914onSaveClicked$lambda4(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-1, reason: not valid java name */
    public static final void m2911onSaveClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getWhiteListResolver().flushMemory();
        this$0.getAppsResolver().flushMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-2, reason: not valid java name */
    public static final void m2912onSaveClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-3, reason: not valid java name */
    public static final void m2913onSaveClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final void m2914onSaveClicked$lambda4(powerwatch.matrix.com.pwgen2android.setup.notifications.NotificationsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }
}
