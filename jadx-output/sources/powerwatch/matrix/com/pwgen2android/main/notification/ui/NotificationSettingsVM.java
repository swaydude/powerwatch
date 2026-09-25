package powerwatch.matrix.com.pwgen2android.main.notification.ui;

/* JADX INFO: compiled from: NotificationSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0006\u0010#\u001a\u00020\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u00040\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "activityContext", "Landroid/content/Context;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "batteryNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;", "goalsNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;", "connectionNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;", "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;)V", "batteryNotificationStatus", "Landroidx/databinding/ObservableField;", "", "getBatteryNotificationStatus", "()Landroidx/databinding/ObservableField;", "connectionNotificationStatus", "getConnectionNotificationStatus", "deviceId", "", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "goalsNotificationStatus", "getGoalsNotificationStatus", "onBackClicked", "", "onCreate", "onDestroy", "context", "onSaveClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationSettingsVM extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence;
    private final androidx.databinding.ObservableField<java.lang.Boolean> batteryNotificationStatus;
    private final powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence;
    private final androidx.databinding.ObservableField<java.lang.Boolean> connectionNotificationStatus;
    private java.lang.String deviceId;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence;
    private final androidx.databinding.ObservableField<java.lang.Boolean> goalsNotificationStatus;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettingsVM(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context activityContext, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence) {
        super(activityContext, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotificationPersistence, "batteryNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsNotificationPersistence, "goalsNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionNotificationPersistence, "connectionNotificationPersistence");
        this.deviceRepository = deviceRepository;
        this.batteryNotificationPersistence = batteryNotificationPersistence;
        this.goalsNotificationPersistence = goalsNotificationPersistence;
        this.connectionNotificationPersistence = connectionNotificationPersistence;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.connectionNotificationStatus = new androidx.databinding.ObservableField<>(false);
        this.batteryNotificationStatus = new androidx.databinding.ObservableField<>(false);
        this.goalsNotificationStatus = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getConnectionNotificationStatus() {
        return this.connectionNotificationStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getBatteryNotificationStatus() {
        return this.batteryNotificationStatus;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getGoalsNotificationStatus() {
        return this.goalsNotificationStatus;
    }

    public final void onCreate(java.lang.String deviceId) {
        this.deviceId = deviceId;
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.connectionNotificationStatus;
        powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence = this.connectionNotificationPersistence;
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceId);
        observableField.set(java.lang.Boolean.valueOf(connectionNotificationPersistence.isWatchConnectionNotificationEnabled(deviceId)));
        androidx.databinding.ObservableField<java.lang.Boolean> observableField2 = this.batteryNotificationStatus;
        powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence = this.batteryNotificationPersistence;
        java.lang.String str = this.deviceId;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        observableField2.set(java.lang.Boolean.valueOf(batteryNotificationPersistence.isBatteryNotificationEnabled(str)));
        this.goalsNotificationStatus.set(java.lang.Boolean.valueOf(this.goalsNotificationPersistence.isGoalsNotificationsEnabled()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroy(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroy(context);
        getCompositeDisposable().clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager);
    }

    public final void onSaveClicked() {
        java.lang.Boolean bool = this.connectionNotificationStatus.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        java.lang.String str = this.deviceId;
        if (str != null) {
            powerwatch.matrix.com.pwgen2android.main.notification.ConnectionNotificationPersistence connectionNotificationPersistence = this.connectionNotificationPersistence;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            connectionNotificationPersistence.enableWatchConnectionNotification(zBooleanValue, str);
        }
        java.lang.Boolean bool2 = this.batteryNotificationStatus.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        java.lang.String str2 = this.deviceId;
        if (str2 != null) {
            powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence = this.batteryNotificationPersistence;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            batteryNotificationPersistence.enableBatteryNotification(zBooleanValue2, str2);
        }
        java.lang.Boolean bool3 = this.goalsNotificationStatus.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool3);
        this.goalsNotificationPersistence.enableUserGoalsNotification(bool3.booleanValue());
        onBackClicked();
    }
}
