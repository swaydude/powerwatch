package powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct;

/* JADX INFO: compiled from: ChooseProductViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0003J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "btRequestCallback", "Lkotlin/Function0;", "", "getBtRequestCallback", "()Lkotlin/jvm/functions/Function0;", "setBtRequestCallback", "(Lkotlin/jvm/functions/Function0;)V", "fragmentManagerWeakReference", "onBackClicked", "onDestroyView", "context", "Landroid/content/Context;", "onPW1Chosen", "onPW2Chosen", "onProductChosen", "chosen", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "requestBTPermission", "Lio/reactivex/Observable;", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseProductViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.class).getSimpleName();
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private kotlin.jvm.functions.Function0<kotlin.Unit> btRequestCallback;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBackClicked$lambda-7, reason: not valid java name */
    public static final void m2029onBackClicked$lambda7(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseProductViewModel(androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, androidx.fragment.app.Fragment fragment, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.loginCloudService = loginCloudService;
        this.locationInfoProvider = locationInfoProvider;
        this.rxPermissions = rxPermissions;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.btRequestCallback = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel$btRequestCallback$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public /* synthetic */ ChooseProductViewModel(androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, androidx.fragment.app.Fragment fragment, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, activity, fragment, loginCloudService, locationInfoProvider, (i & 32) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions(fragment) : rxPermissions);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getBtRequestCallback() {
        return this.btRequestCallback;
    }

    public final void setBtRequestCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.btRequestCallback = function0;
    }

    private final void onPW2Chosen() {
        this.rxPermissions.request("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$VeUI2Aq5Dui0cyE6vfmUZnZDddM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2030onPW2Chosen$lambda1(this.f$0, (java.lang.Boolean) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$LZzFlsMX61cjU7XV-dP4arggxgU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2032onPW2Chosen$lambda2(this.f$0, (java.lang.Boolean) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$DNgA5D2q13mKkUqO8Mv1kDKbHD4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2033onPW2Chosen$lambda3(this.f$0, (java.lang.Boolean) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$0y4FHCUNoLlXAGiecYcCevnDceE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2034onPW2Chosen$lambda4(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$qjSU8RYhR14f43cwmfxVh2HpGz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2035onPW2Chosen$lambda5((java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2030onPW2Chosen$lambda1(final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0, java.lang.Boolean approved) {
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approved, "approved");
        if (approved.booleanValue()) {
            observableJust = this$0.locationInfoProvider.isProviderEnabled().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$wj5UVN5aZDnqvoQUo7YHQtFAKDk
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2031onPW2Chosen$lambda1$lambda0(this.f$0, (java.lang.Boolean) obj);
                }
            });
        } else {
            observableJust = io.reactivex.Observable.just(approved);
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-1$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2031onPW2Chosen$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0, java.lang.Boolean enabled) {
        io.reactivex.Observable observableEmpty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        if (enabled.booleanValue()) {
            observableEmpty = this$0.locationInfoProvider.updateLocationInternal().toSingleDefault(enabled).toObservable();
        } else {
            powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider = this$0.locationInfoProvider;
            android.app.Activity activity = this$0.activityWeakReference.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
            locationInfoProvider.showDialog(activity);
            observableEmpty = io.reactivex.Observable.empty();
        }
        return observableEmpty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2032onPW2Chosen$lambda2(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.rxPermissions.request("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2033onPW2Chosen$lambda3(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.requestBTPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-4, reason: not valid java name */
    public static final void m2034onPW2Chosen$lambda4(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0, java.lang.Boolean approved) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(approved, "approved");
        if (approved.booleanValue()) {
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
            return;
        }
        this$0.getBtRequestCallback().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPW2Chosen$lambda-5, reason: not valid java name */
    public static final void m2035onPW2Chosen$lambda5(java.lang.Throwable th) {
        android.util.Log.e(TAG, "Error in resolving permissions...");
        th.printStackTrace();
    }

    private final io.reactivex.Observable<java.lang.Boolean> requestBTPermission() {
        android.app.Activity activity = this.activityWeakReference.get();
        java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
        if (!powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.isBluetoothPermissionGranted(activity)) {
            io.reactivex.Observable<java.lang.Boolean> observableRequest = this.rxPermissions.request("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableRequest, "{\n            rxPermissions.request(Manifest.permission.BLUETOOTH_CONNECT, Manifest.permission.BLUETOOTH_SCAN)\n        }");
            return observableRequest;
        }
        io.reactivex.Observable<java.lang.Boolean> observableJust = io.reactivex.Observable.just(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(true)");
        return observableJust;
    }

    public final void onPW1Chosen() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
    }

    public final void onBackClicked() {
        getCompositeDisposable().add(this.loginCloudService.logout().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$1a2QYvIZf8X9cDs63Gu-JqvpfR4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2028onBackClicked$lambda6(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductViewModel$YBLfShVFfxg78SwQXYBXjrA7DVU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.m2029onBackClicked$lambda7((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBackClicked$lambda-6, reason: not valid java name */
    public static final void m2028onBackClicked$lambda6(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.app.Activity activity = this$0.activityWeakReference.get();
        if (activity != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToSetupActivity(activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.WelcomeScreen.INSTANCE);
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        getCompositeDisposable().dispose();
    }

    public final void onProductChosen(powerwatch.matrix.com.pwgen2android.shared.WatchProduct chosen) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chosen, "chosen");
        if (kotlin.jvm.internal.Intrinsics.areEqual(chosen, powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatch2.INSTANCE)) {
            onPW2Chosen();
        } else {
            onPW1Chosen();
        }
    }
}
