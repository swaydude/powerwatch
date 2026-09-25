package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001a0\u001a0#X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020( $*\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010'0'0&¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "loginService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "cloudErrorHandler", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "dbManager", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "activityPeriodCacheClear", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;", "pushMessagingFactory", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "whiteListResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "firebaseField", "Landroidx/databinding/ObservableField;", "Lkotlin/Pair;", "", "getFirebaseField", "()Landroidx/databinding/ObservableField;", "onResume", "", "onTabReselected", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainActivityViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseActivityViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.String>> firebaseField;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginService;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-10, reason: not valid java name */
    public static final void m1584_init_$lambda10(java.lang.Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-5, reason: not valid java name */
    public static final void m1587_init_$lambda5() {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginService, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, final powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager, final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory pushMessagingFactory, final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, final android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) {
        super(languageController, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginService, "loginService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudErrorHandler, "cloudErrorHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPeriodCacheClear, "activityPeriodCacheClear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushMessagingFactory, "pushMessagingFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whiteListResolver, "whiteListResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.loginService = loginService;
        this.cloudSynchronizer = cloudSynchronizer;
        this.rxBus = rxBus;
        this.cloudErrorHandler = cloudErrorHandler;
        this.whiteListResolver = whiteListResolver;
        this.rxPermissions = rxPermissions;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.firebaseField = new androidx.databinding.ObservableField<>(new kotlin.Pair("", ""));
        final boolean zIsLoggedIn = loginService.isLoggedIn();
        getCompositeDisposable().add(io.reactivex.Single.timer(800L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1583_init_$lambda0(zIsLoggedIn, activity, (java.lang.Long) obj);
            }
        }));
        getCompositeDisposable().add(cloudErrorHandler.getAuthRequiredError().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1586_init_$lambda4(this.f$0, userAccountRepository, dbManager, activityPeriodCacheClear, deviceManager, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$FQ8Dj1Srvx2-F6ESRYlkcaqcXAU
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1587_init_$lambda5();
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory.getMessage$default(pushMessagingFactory, null, 1, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1588_init_$lambda6(this.f$0, (com.google.firebase.messaging.RemoteMessage) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$1_Cwpy7lzI5H51Y0eXq0u-FY6VM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        getCompositeDisposable().add(locationInfoProvider.isProviderEnabled().distinctUntilChanged().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$HmSrRtX_oIM8bFA1IJOKZPtDEU8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1590_init_$lambda8(this.f$0, (java.lang.Boolean) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1591_init_$lambda9(this.f$0, locationInfoProvider, (java.lang.Boolean) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$-BwdVwODR-WyFZ56HNwKeaRqiiQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1584_init_$lambda10((java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$o_4mdD-vNPsLh1BwZolyowXpF1k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    public /* synthetic */ MainActivityViewModel(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dBManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory pushMessagingFactory, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(loginCloudService, languageController, cloudSynchronizer, rxBus, cloudErrorHandler, userAccountRepository, dBManager, deviceManager, activityPeriodCacheClear, pushMessagingFactory, locationInfoProvider, activity, fragmentManager, whiteListResolver, (i & 16384) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions((androidx.fragment.app.FragmentActivity) activity) : rxPermissions);
    }

    public final androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.String>> getFirebaseField() {
        return this.firebaseField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m1583_init_$lambda0(boolean z, android.app.Activity activity, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "$activity");
        if (z) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToSetupActivity$default(activity, null, 1, null);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1586_init_$lambda4(final powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel this$0, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ActivityPeriodCacheClear activityPeriodCacheClear, final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "$userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbManager, "$dbManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPeriodCacheClear, "$activityPeriodCacheClear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "$deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.loginService.logout().andThen(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(userAccountRepository, true, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1599lambda4$lambda1(userAccountRepository, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).andThen(dbManager.clearDevicesCompletable()).andThen(activityPeriodCacheClear.clear()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$W0UkwSzdbpjmwmK-YGeLWLqMF9A
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1600lambda4$lambda2(deviceManager, (java.lang.Throwable) obj);
            }
        }).onErrorComplete()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$MainActivityViewModel$HQjOsUpsz_ijS35xk7mp8CYsqdU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel.m1601lambda4$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-4$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1599lambda4$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "$userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return userAccountRepository.delete(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-4$lambda-2, reason: not valid java name */
    public static final void m1600lambda4$lambda2(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "$deviceManager");
        deviceManager.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-4$lambda-3, reason: not valid java name */
    public static final void m1601lambda4$lambda3(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.app.Activity activity = this$0.contextWeakReference.get();
        if (activity != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToSetupActivity(activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.LoginScreen.INSTANCE);
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-6, reason: not valid java name */
    public static final void m1588_init_$lambda6(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel this$0, com.google.firebase.messaging.RemoteMessage remoteMessage) {
        java.lang.String title;
        java.lang.String body;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.databinding.ObservableField<kotlin.Pair<java.lang.String, java.lang.String>> firebaseField = this$0.getFirebaseField();
        com.google.firebase.messaging.RemoteMessage.Notification notification = remoteMessage.getNotification();
        java.lang.String str = "";
        if (notification == null || (title = notification.getTitle()) == null) {
            title = "";
        }
        com.google.firebase.messaging.RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        if (notification2 != null && (body = notification2.getBody()) != null) {
            str = body;
        }
        firebaseField.set(new kotlin.Pair<>(title, str));
        com.google.firebase.messaging.RemoteMessage.Notification notification3 = remoteMessage.getNotification();
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("FCM_RECEIVED ", notification3 == null ? null : notification3.getBody()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-8, reason: not valid java name */
    public static final void m1590_init_$lambda8(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel this$0, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Main activity received location change", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1591_init_$lambda9(powerwatch.matrix.com.pwgen2android.main.MainActivityViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, java.lang.Boolean enabled) {
        io.reactivex.Observable observable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "$locationInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        if (enabled.booleanValue() && this$0.rxPermissions.isGranted("android.permission.ACCESS_COARSE_LOCATION") && this$0.rxPermissions.isGranted("android.permission.ACCESS_FINE_LOCATION")) {
            observable = locationInfoProvider.updateLocationInternal().toSingleDefault(enabled).toObservable();
        } else {
            observable = io.reactivex.Completable.complete().toObservable();
        }
        return observable;
    }

    public final void onResume() {
        this.cloudSynchronizer.syncData();
    }

    public final void onTabReselected() {
        this.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.MainTabReselected.INSTANCE);
    }
}
