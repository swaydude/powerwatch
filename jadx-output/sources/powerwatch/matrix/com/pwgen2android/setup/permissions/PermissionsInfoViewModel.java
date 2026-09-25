package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionsInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0007J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\n\u0010&\u001a\u00020\u001d*\u00020'J\n\u0010(\u001a\u00020\u001d*\u00020'R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00070\u00070\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "dialogManager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "doneEnabled", "Landroidx/databinding/ObservableField;", "", "getDoneEnabled", "()Landroidx/databinding/ObservableField;", "fragmentManagerWeakReference", "permissionsList", "", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;", "getPermissionsList", "goToNextScreen", "", "onCreateView", "context", "Landroid/content/Context;", "onPermissionChecked", "permission", "resolvedAction", "Lkotlin/Function0;", "onStart", "onDoneClicked", "Landroid/view/View;", "onSkipClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PermissionsInfoViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> doneEnabled;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo>> permissionsList;
    private final com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsInfoViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.app.Activity activity, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogManager, "dialogManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.dialogManager = dialogManager;
        this.deviceRepository = deviceRepository;
        this.rxPermissions = rxPermissions;
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        java.lang.String string = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.location_permission_desc);
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Location location = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Location.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.location_permission_desc)");
        java.lang.String string2 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.camera_permission_desc);
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Camera camera = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Camera.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.camera_permission_desc)");
        java.lang.String string3 = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.notifications_permission_info);
        powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService notificationService = powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.notifications_permission_info)");
        this.permissionsList = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo[]{new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(location, io.fabric.sdk.android.services.network.HttpRequest.HEADER_LOCATION, string, false, true, powerwatch.matrix.com.pwgen2android.R.mipmap.location_icon), new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(camera, "Camera", string2, false, true, powerwatch.matrix.com.pwgen2android.R.mipmap.camera_icon), new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(notificationService, "Notifications", string3, false, true, powerwatch.matrix.com.pwgen2android.R.mipmap.notifications_icon)}));
        this.doneEnabled = new androidx.databinding.ObservableField<>(false);
    }

    public /* synthetic */ PermissionsInfoViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.app.Activity activity, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, com.tbruyelle.rxpermissions2.RxPermissions rxPermissions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dialogManager, deviceRepository, activity, fragment, fragmentManager, (i & 32) != 0 ? new com.tbruyelle.rxpermissions2.RxPermissions(fragment) : rxPermissions);
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo>> getPermissionsList() {
        return this.permissionsList;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getDoneEnabled() {
        return this.doneEnabled;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.setPermissionsShownFlag(context, true);
    }

    public final void onPermissionChecked(final android.content.Context context, final powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo permission, final kotlin.jvm.functions.Function0<kotlin.Unit> resolvedAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "permission");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedAction, "resolvedAction");
        java.lang.String manifestPermission = permission.getPermissionType().getManifestPermission();
        if (kotlin.jvm.internal.Intrinsics.areEqual(permission.getPermissionType(), powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService.INSTANCE)) {
            powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager.DefaultImpls.openAlertDialog$default(this.dialogManager, context, powerwatch.matrix.com.pwgen2android.R.string.notification_dialog_title, powerwatch.matrix.com.pwgen2android.R.string.notification_dialog_message, powerwatch.matrix.com.pwgen2android.R.string.button_continue, 0, 16, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.-$$Lambda$PermissionsInfoViewModel$d3KPdKNWwhDFY0ae6Tn5F13e9-s
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel.m2925onPermissionChecked$lambda0(context, resolvedAction, (java.lang.Boolean) obj);
                }
            });
        } else {
            this.rxPermissions.request(manifestPermission).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.-$$Lambda$PermissionsInfoViewModel$vs4UCHzhwzsFNkBNVTIb0Qlom0Q
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel.m2926onPermissionChecked$lambda1(permission, this, resolvedAction, (java.lang.Boolean) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.permissions.-$$Lambda$PermissionsInfoViewModel$UGzfz2BrN6GIFc8eJNJmssB1UQc
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel.m2927onPermissionChecked$lambda2(resolvedAction, (java.lang.Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPermissionChecked$lambda-0, reason: not valid java name */
    public static final void m2925onPermissionChecked$lambda0(android.content.Context context, kotlin.jvm.functions.Function0 resolvedAction, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedAction, "$resolvedAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            context.startActivity(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.ACTION_NOTIFICATION_LISTENER_SETTINGS));
        } else {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE.userDeclinedGlobalService(context);
            resolvedAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPermissionChecked$lambda-1, reason: not valid java name */
    public static final void m2926onPermissionChecked$lambda1(powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo permission, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionsInfoViewModel this$0, kotlin.jvm.functions.Function0 resolvedAction, java.lang.Boolean approved) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "$permission");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedAction, "$resolvedAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(approved, "approved");
        permission.setChecked(approved.booleanValue());
        if (approved.booleanValue()) {
            permission.setClickable(false);
            this$0.getDoneEnabled().set(true);
        }
        resolvedAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPermissionChecked$lambda-2, reason: not valid java name */
    public static final void m2927onPermissionChecked$lambda2(kotlin.jvm.functions.Function0 resolvedAction, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedAction, "$resolvedAction");
        th.printStackTrace();
        resolvedAction.invoke();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onStart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onResume(context);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list = this.permissionsList.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.List<powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo> list2 = list;
        for (powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo : list2) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(uIPermissionInfo.getPermissionType(), powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService.INSTANCE)) {
                uIPermissionInfo.setChecked(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE.isNotificationServiceEnabled(context));
            } else {
                uIPermissionInfo.setChecked(this.rxPermissions.isGranted(uIPermissionInfo.getPermissionType().getManifestPermission()));
            }
            uIPermissionInfo.setClickable(!uIPermissionInfo.getChecked());
            if (uIPermissionInfo.getChecked()) {
                getDoneEnabled().set(true);
            }
        }
        this.permissionsList.set(kotlin.collections.CollectionsKt.take(list2, list.size()));
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
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }
}
