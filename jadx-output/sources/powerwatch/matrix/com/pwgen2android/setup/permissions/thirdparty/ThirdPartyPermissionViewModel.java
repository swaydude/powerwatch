package powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty;

/* JADX INFO: compiled from: ThirdPartyPermissionViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u001eH\u0007J\u0010\u0010)\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010-\u001a\u00020\u0019H\u0002J\n\u0010.\u001a\u00020!*\u00020/J\n\u00100\u001a\u00020!*\u00020/R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00070\u00070\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "fragmentWeakReference", "listChanged", "Landroidx/databinding/ObservableField;", "Lkotlin/Pair;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "", "getListChanged", "()Landroidx/databinding/ObservableField;", "permissionsList", "", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;", "getPermissionsList", "authorizationSuccess", "", "goToNextScreen", "onCreateView", "context", "Landroid/content/Context;", "onDestroyView", "onPermissionChecked", "permission", "onResume", "onStart", "updateListItem", "permissionType", "status", "onDoneClicked", "Landroid/view/View;", "onSkipClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThirdPartyPermissionViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final java.lang.ref.WeakReference<androidx.fragment.app.Fragment> fragmentWeakReference;
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;
    private final androidx.databinding.ObservableField<kotlin.Pair<powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission, java.lang.Boolean>> listChanged;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo>> permissionsList;
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyPermissionViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.app.Activity activity, androidx.fragment.app.Fragment fragment, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        this.deviceRepository = deviceRepository;
        this.googleFitController = googleFitController;
        this.stravaController = stravaController;
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.fragmentWeakReference = new java.lang.ref.WeakReference<>(fragment);
        java.lang.String string = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.google_fit);
        java.lang.String string2 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.google_fit_description);
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration googleFitIntegration = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.google_fit)");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.google_fit_description)");
        java.lang.String string3 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.strava_service);
        java.lang.String string4 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.strava_description);
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration stravaIntegration = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.strava_service)");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.strava_description)");
        this.permissionsList = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo[]{new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(googleFitIntegration, string, string2, false, true, powerwatch.matrix.com.pwgen2android.R.drawable.google_fit_icon), new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(stravaIntegration, string3, string4, false, true, powerwatch.matrix.com.pwgen2android.R.drawable.strava_logo)}));
        this.disposable = new io.reactivex.disposables.CompositeDisposable();
        this.listChanged = new androidx.databinding.ObservableField<>();
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo>> getPermissionsList() {
        return this.permissionsList;
    }

    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return this.disposable;
    }

    public final androidx.databinding.ObservableField<kotlin.Pair<powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission, java.lang.Boolean>> getListChanged() {
        return this.listChanged;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.disposable.add(this.googleFitController.getSubscription().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.-$$Lambda$ThirdPartyPermissionViewModel$3Rnb0qRIKtmSZBILFmXXPyOTrfo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel.m2928onCreateView$lambda0(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.-$$Lambda$ThirdPartyPermissionViewModel$9oP2bvCY19Vgmo1BHsUSzgm1f0s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        this.disposable.add(this.stravaController.subscribeToAuthorize().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.-$$Lambda$ThirdPartyPermissionViewModel$D7ImZHEv9U_An0uCG3OHVrDO1OY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel.m2930onCreateView$lambda2(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.-$$Lambda$ThirdPartyPermissionViewModel$gWemw3RiULxwGsxxSKYDfkUknZA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2928onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel this$0, java.lang.Boolean authSuccess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration googleFitIntegration = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authSuccess, "authSuccess");
        this$0.updateListItem(googleFitIntegration, authSuccess.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2930onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionViewModel this$0, java.lang.Boolean hasAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration stravaIntegration = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hasAuth, "hasAuth");
        this$0.updateListItem(stravaIntegration, hasAuth.booleanValue());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onResume(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onResume(context);
        updateListItem(powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration.INSTANCE, this.stravaController.hasAuthorize());
    }

    private final void updateListItem(powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission permissionType, boolean status) {
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list = this.permissionsList.get();
        powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo = null;
        java.lang.Object obj = null;
        if (list != null) {
            for (java.lang.Object obj2 : list) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo) obj2).getPermissionType(), permissionType)) {
                    obj = obj2;
                    break;
                }
            }
            uIPermissionInfo = (powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo) obj;
        }
        if (uIPermissionInfo != null) {
            uIPermissionInfo.setChecked(status);
        }
        androidx.databinding.ObservableField<kotlin.Pair<powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission, java.lang.Boolean>> observableField = this.listChanged;
        kotlin.jvm.internal.Intrinsics.checkNotNull(uIPermissionInfo);
        observableField.set(new kotlin.Pair<>(uIPermissionInfo.getPermissionType(), java.lang.Boolean.valueOf(status)));
    }

    public final void onPermissionChecked(powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "permission");
        if (kotlin.jvm.internal.Intrinsics.areEqual(permission.getPermissionType(), powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration.INSTANCE)) {
            if (permission.getChecked()) {
                this.googleFitController.disable();
                return;
            } else {
                this.googleFitController.authorize(this.fragmentWeakReference.get());
                return;
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(permission.getPermissionType(), powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration.INSTANCE) || this.activityWeakReference.get() == null) {
            return;
        }
        android.app.Activity activity = this.activityWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
        if (permission.getChecked()) {
            this.stravaController.revoke();
        } else {
            this.stravaController.authorize(activity);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onStart(android.content.Context context) {
        boolean zHasAuthorize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onResume(context);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list = this.permissionsList.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = list;
        for (powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo : list2) {
            powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission permissionType = uIPermissionInfo.getPermissionType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(permissionType, powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration.INSTANCE)) {
                zHasAuthorize = this.googleFitController.hasPermissions();
            } else {
                zHasAuthorize = kotlin.jvm.internal.Intrinsics.areEqual(permissionType, powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration.INSTANCE) ? this.stravaController.hasAuthorize() : false;
            }
            uIPermissionInfo.setChecked(zHasAuthorize);
        }
        this.permissionsList.set(kotlin.collections.CollectionsKt.take(list2, list.size()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.disposable.clear();
    }

    public final void onDoneClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        goToNextScreen();
    }

    public final void onSkipClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        goToNextScreen();
    }

    private final void goToNextScreen() {
        if (!this.deviceRepository.isEmpty()) {
            android.app.Activity activity = this.activityWeakReference.get();
            if (activity != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToMainActivity$default(activity, null, false, 3, null);
            }
        } else {
            android.app.Activity activity2 = this.activityWeakReference.get();
            if (activity2 != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity$default(activity2, null, 1, null);
            }
        }
        android.app.Activity activity3 = this.activityWeakReference.get();
        if (activity3 == null) {
            return;
        }
        activity3.finish();
    }

    public final void authorizationSuccess() {
        this.googleFitController.authorizationSuccess();
    }
}
