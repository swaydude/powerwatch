package powerwatch.matrix.com.pwgen2android.secret;

/* JADX INFO: compiled from: SecretScreenViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 82\u00020\u0001:\u00018B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\"\u001a\u00020!J(\u0010#\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\n\u0010)\u001a\u00020!*\u00020*J\n\u0010+\u001a\u00020!*\u00020*J\n\u0010,\u001a\u00020!*\u00020*J\n\u0010-\u001a\u00020!*\u00020*J\n\u0010.\u001a\u00020!*\u00020*J\n\u0010/\u001a\u00020!*\u00020*J\n\u00100\u001a\u00020!*\u00020*J\f\u00101\u001a\u00020!*\u00020*H\u0007J\n\u00102\u001a\u00020!*\u00020*J\n\u00103\u001a\u00020!*\u00020*J\n\u00104\u001a\u00020!*\u00020*J\n\u00105\u001a\u00020!*\u00020*J\n\u00106\u001a\u00020!*\u00020*J\f\u00107\u001a\u00020!*\u00020*H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\t0\t0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "dbManager", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "context", "Landroid/content/Context;", "traceLogger", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "mockDataExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;)V", "deleteAllDataChecked", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "deleteDevicesChecked", "deleteGoalsChecked", "deleteLogsChecked", "isDebugBuild", "()Landroidx/databinding/ObservableField;", "mockLogDataEnabled", "getMockLogDataEnabled", "parentFragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "prodEnabled", "getProdEnabled", "deleteLogFiles", "", "onBackClicked", "shareFiles", "logDataType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "sharingTitle", "", "fileTitle", "deleteLogs", "Landroid/view/View;", "exportAccelLog", "onDeleteAllDataClicked", "onDeleteDevicesClicked", "onDeleteGoalsClicked", "onDeleteLogsClicked", "onDevRadioClicked", "onMockDataChecked", "onOpenDBDebugClicked", "onOpenInternalLoggerClicked", "onOpenNotificationLoggerClicked", "onOpenNotificationServiceSettings", "onProdRadioClicked", "onSaveClicked", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SecretScreenViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private static final java.lang.String DB_DEBUG_URL = "http://localhost:8080";
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> deleteAllDataChecked;
    private final androidx.databinding.ObservableField<java.lang.Boolean> deleteDevicesChecked;
    private final androidx.databinding.ObservableField<java.lang.Boolean> deleteGoalsChecked;
    private final androidx.databinding.ObservableField<java.lang.Boolean> deleteLogsChecked;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isDebugBuild;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2MockDataExecutor mockDataExecutor;
    private final androidx.databinding.ObservableField<java.lang.Boolean> mockLogDataEnabled;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> parentFragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> prodEnabled;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger traceLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecretScreenViewModel(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dbManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, androidx.fragment.app.FragmentManager parentFragmentManager, android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger traceLogger, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2MockDataExecutor mockDataExecutor) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbManager, "dbManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockDataExecutor, "mockDataExecutor");
        this.dbManager = dbManager;
        this.deviceManager = deviceManager;
        this.traceLogger = traceLogger;
        this.mockDataExecutor = mockDataExecutor;
        this.parentFragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
        this.prodEnabled = new androidx.databinding.ObservableField<>(java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.getProdEnabledFlag(context)));
        this.deleteLogsChecked = new androidx.databinding.ObservableField<>(false);
        this.deleteDevicesChecked = new androidx.databinding.ObservableField<>(false);
        this.deleteGoalsChecked = new androidx.databinding.ObservableField<>(false);
        this.deleteAllDataChecked = new androidx.databinding.ObservableField<>(false);
        this.mockLogDataEnabled = new androidx.databinding.ObservableField<>(java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.getMockDataEnabled(context)));
        this.isDebugBuild = new androidx.databinding.ObservableField<>(false);
    }

    public /* synthetic */ SecretScreenViewModel(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager dBManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger traceLogger, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2MockDataExecutor gen2MockDataExecutor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dBManager, communicator, deviceManager, fragmentManager, context, traceLogger, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2MockDataExecutor(communicator) : gen2MockDataExecutor);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getProdEnabled() {
        return this.prodEnabled;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getMockLogDataEnabled() {
        return this.mockLogDataEnabled;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isDebugBuild() {
        return this.isDebugBuild;
    }

    public final void onOpenDBDebugClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment dBDebugFragmentNewInstance = powerwatch.matrix.com.pwgen2android.secret.debugdb.DBDebugFragment.INSTANCE.newInstance(DB_DEBUG_URL);
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, dBDebugFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, null, 8, null);
    }

    public final void onOpenInternalLoggerClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment internalLoggerFragmentNewInstance = powerwatch.matrix.com.pwgen2android.shared.ui.internalLogger.InternalLoggerFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, internalLoggerFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, null, 8, null);
    }

    public final void onOpenNotificationLoggerClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment notificationLoggerFragmentNewInstance = powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLoggerFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, notificationLoggerFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, null, 8, null);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.parentFragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onProdRadioClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.prodEnabled.set(true);
    }

    public final void onMockDataChecked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this.deviceManager, false, 1, null).firstOrError().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2782onMockDataChecked$lambda2(this.f$0, view, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$v1hgl4kzTva3Uy8ozNRZe-f52tQ
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2785onMockDataChecked$lambda3(view);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$T-TgKOiGKLcNMbqyjZl46WQhy-c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2786onMockDataChecked$lambda4(this.f$0, view, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMockDataChecked$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2782onMockDataChecked$lambda2(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel this$0, final android.view.View this_onMockDataChecked, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onMockDataChecked, "$this_onMockDataChecked");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.Boolean bool = this$0.getMockLogDataEnabled().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        boolean z = !bool.booleanValue();
        if (!it.isConnected()) {
            return io.reactivex.Completable.error(new java.lang.Throwable("Watch is not connected"));
        }
        if (z) {
            return this$0.mockDataExecutor.enableMock(it.getUid()).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$l2X5XhIBUylgsBH_bJyYburen-o
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2783onMockDataChecked$lambda2$lambda0(this_onMockDataChecked);
                }
            });
        }
        return this$0.mockDataExecutor.disableMock(it.getUid()).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$WoJJbiVCSHFVm2n4doC7wGsvZW4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2784onMockDataChecked$lambda2$lambda1(this_onMockDataChecked);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMockDataChecked$lambda-2$lambda-0, reason: not valid java name */
    public static final void m2783onMockDataChecked$lambda2$lambda0(android.view.View this_onMockDataChecked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onMockDataChecked, "$this_onMockDataChecked");
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
        android.content.Context context = this_onMockDataChecked.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        companion.setMockDataEnabled(true, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMockDataChecked$lambda-2$lambda-1, reason: not valid java name */
    public static final void m2784onMockDataChecked$lambda2$lambda1(android.view.View this_onMockDataChecked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onMockDataChecked, "$this_onMockDataChecked");
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
        android.content.Context context = this_onMockDataChecked.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        companion.setMockDataEnabled(false, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMockDataChecked$lambda-3, reason: not valid java name */
    public static final void m2785onMockDataChecked$lambda3(android.view.View this_onMockDataChecked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onMockDataChecked, "$this_onMockDataChecked");
        android.widget.Toast.makeText(this_onMockDataChecked.getContext(), "Mock data successfully enabled.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onMockDataChecked$lambda-4, reason: not valid java name */
    public static final void m2786onMockDataChecked$lambda4(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel this$0, android.view.View this_onMockDataChecked, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onMockDataChecked, "$this_onMockDataChecked");
        androidx.databinding.ObservableField<java.lang.Boolean> mockLogDataEnabled = this$0.getMockLogDataEnabled();
        java.lang.Boolean bool = this$0.getMockLogDataEnabled().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        mockLogDataEnabled.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
        androidx.databinding.ObservableField<java.lang.Boolean> mockLogDataEnabled2 = this$0.getMockLogDataEnabled();
        java.lang.Boolean bool2 = this$0.getMockLogDataEnabled().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
        mockLogDataEnabled2.set(java.lang.Boolean.valueOf(!bool2.booleanValue()));
        android.widget.Toast.makeText(this_onMockDataChecked.getContext(), "Watch is not connected.", 0).show();
    }

    public final void onDevRadioClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.prodEnabled.set(false);
    }

    public final void onDeleteLogsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.deleteLogsChecked;
        java.lang.Boolean bool = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        observableField.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
    }

    public final void onDeleteDevicesClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.deleteDevicesChecked;
        java.lang.Boolean bool = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        observableField.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
    }

    public final void onDeleteGoalsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.deleteGoalsChecked;
        java.lang.Boolean bool = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        observableField.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
    }

    public final void onDeleteAllDataClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.databinding.ObservableField<java.lang.Boolean> observableField = this.deleteAllDataChecked;
        java.lang.Boolean bool = observableField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        observableField.set(java.lang.Boolean.valueOf(!bool.booleanValue()));
    }

    public final void onOpenNotificationServiceSettings(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.getContext().startActivity(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.ACTION_NOTIFICATION_LISTENER_SETTINGS));
    }

    public final void exportAccelLog(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        shareFiles(context, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE, "Share accelerometer logs", "Accelerometer logs");
    }

    public final void deleteLogs(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        deleteLogFiles(context);
    }

    private final void shareFiles(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType logDataType, java.lang.String sharingTitle, java.lang.String fileTitle) {
        java.lang.String[] strArrFileList = context.fileList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArrFileList, "context.fileList()");
        for (java.lang.String str : strArrFileList) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("file internal: ", str));
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND_MULTIPLE");
        intent.putExtra("android.intent.extra.SUBJECT", fileTitle);
        intent.setType("*/txt");
        android.net.Uri accelFileURI = androidx.core.content.FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName(), this.traceLogger.getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE));
        android.net.Uri hrFileURI = androidx.core.content.FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName(), this.traceLogger.getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate.INSTANCE));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accelFileURI, "accelFileURI");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hrFileURI, "hrFileURI");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", kotlin.collections.CollectionsKt.arrayListOf(accelFileURI, hrFileURI));
        context.startActivity(android.content.Intent.createChooser(intent, sharingTitle));
    }

    private final void deleteLogFiles(android.content.Context context) {
        java.lang.String[] strArrFileList = context.fileList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArrFileList, "context.fileList()");
        for (java.lang.String str : strArrFileList) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("file internal: ", str));
        }
        java.io.File storedLogs = this.traceLogger.getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
        java.io.File storedLogs2 = this.traceLogger.getStoredLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate.INSTANCE);
        storedLogs.delete();
        storedLogs2.delete();
        java.lang.String[] strArrFileList2 = context.fileList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArrFileList2, "context.fileList()");
        for (java.lang.String str2 : strArrFileList2) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("file internal after delete: ", str2));
        }
    }

    public final void onSaveClicked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.Boolean bool = this.prodEnabled.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        final boolean zBooleanValue = bool.booleanValue();
        io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$Qe8WgN0OvSmn5vl0f1vpFM1TNOc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2787onSaveClicked$lambda8(view, zBooleanValue, this);
            }
        }).delay(2000L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenViewModel$Z889AxdMSxwW_aCGTjz5GQydx6k
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.m2788onSaveClicked$lambda9();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-8, reason: not valid java name */
    public static final void m2787onSaveClicked$lambda8(android.view.View this_onSaveClicked, boolean z, powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onSaveClicked, "$this_onSaveClicked");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
        android.content.Context context = this_onSaveClicked.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        if (companion.getProdEnabledFlag(context) != z) {
            powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion2 = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
            android.content.Context context2 = this_onSaveClicked.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "context");
            companion2.setProdEnabledFlag(z, context2);
            this$0.dbManager.clearAllData();
        } else {
            java.lang.Boolean bool = this$0.deleteLogsChecked.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                this$0.dbManager.clearBackgroundAndActivityLogs();
            }
            java.lang.Boolean bool2 = this$0.deleteGoalsChecked.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                this$0.dbManager.clearGoalConfigurations();
            }
            java.lang.Boolean bool3 = this$0.deleteDevicesChecked.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bool3);
            if (bool3.booleanValue()) {
                this$0.dbManager.clearDevices();
            }
            java.lang.Boolean bool4 = this$0.deleteAllDataChecked.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bool4);
            if (bool4.booleanValue()) {
                this$0.dbManager.clearAllData();
            }
        }
        android.widget.Toast.makeText(this_onSaveClicked.getContext(), "New configuration saved, app will be closed, open it again.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-9, reason: not valid java name */
    public static final void m2788onSaveClicked$lambda9() {
        java.lang.System.exit(0);
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
