package powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair;

/* JADX INFO: compiled from: UnpairDialogVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u00020\u0015*\u00020!J\n\u0010\"\u001a\u00020\u0015*\u00020!J\n\u0010#\u001a\u00020\u0015*\u00020!R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;", "Landroidx/lifecycle/ViewModel;", "watchSettingsExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "updateInfoRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "context", "Landroid/app/Activity;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroid/app/Activity;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "dialogClose", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;", "", "getDialogClose", "()Lkotlin/jvm/functions/Function1;", "setDialogClose", "(Lkotlin/jvm/functions/Function1;)V", "pairedDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "onCreateView", "onDestroyView", "unPairDevice", "Lio/reactivex/Completable;", "onCancelClicked", "Landroid/view/View;", "onUnpairAndResetClicked", "onUnpairClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UnpairDialogVM extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> dialogClose;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.Device pairedDevice;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2004onCreateView$lambda1(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUnpairAndResetClicked$lambda-6, reason: not valid java name */
    public static final void m2006onUnpairAndResetClicked$lambda6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUnpairClicked$lambda-3, reason: not valid java name */
    public static final void m2009onUnpairClicked$lambda3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUnpairClicked$lambda-4, reason: not valid java name */
    public static final void m2010onUnpairClicked$lambda4(java.lang.Throwable th) {
    }

    public UnpairDialogVM(powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSettingsExecutor watchSettingsExecutor, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoRepository updateInfoRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, android.app.Activity context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSettingsExecutor, "watchSettingsExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoRepository, "updateInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.watchSettingsExecutor = watchSettingsExecutor;
        this.deviceRepository = deviceRepository;
        this.updateInfoRepository = updateInfoRepository;
        this.deviceManager = deviceManager;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> getDialogClose() {
        return this.dialogClose;
    }

    public final void setDialogClose(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> function1) {
        this.dialogClose = function1;
    }

    public final void onCreateView() {
        this.compositeDisposable.add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.deviceRepository, false, false, 3, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$IJPcS0_OGAwW1_h_GHG7c6DiQuc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2003onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$UqC6cBX8OfLrA04qg24Hvo0b8RI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2004onCreateView$lambda1((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2003onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pairedDevice = device;
    }

    public final void onDestroyView() {
        this.compositeDisposable.clear();
    }

    private final io.reactivex.Completable unPairDevice() {
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository = this.deviceRepository;
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = this.pairedDevice;
        kotlin.jvm.internal.Intrinsics.checkNotNull(device);
        io.reactivex.Completable completableAndThen = deviceRepository.delete(device).andThen(this.updateInfoRepository.delete());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "deviceRepository.delete(pairedDevice!!)\n                .andThen(updateInfoRepository.delete())");
        return completableAndThen;
    }

    public final void onUnpairClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.compositeDisposable.add(unPairDevice().doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$w7a4aoOtV9irhR2YFK3wF8WPITw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2008onUnpairClicked$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$Uf2siSp7RdifcYZOJPlv0gC6eXM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2009onUnpairClicked$lambda3();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$NFRn3AbCxMRz86lgKHTc0z-XS6Y
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2010onUnpairClicked$lambda4((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUnpairClicked$lambda-2, reason: not valid java name */
    public static final void m2008onUnpairClicked$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceManager.destroy();
        android.app.Activity activity = this$0.contextWeakReference.get();
        if (activity != null) {
            activity.finish();
        }
        if (activity == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity$default(activity, null, 1, null);
    }

    public final void onUnpairAndResetClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.compositeDisposable.add(this.watchSettingsExecutor.resetWatch(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.ResetMode.FactoryReset.INSTANCE).onErrorComplete().andThen(unPairDevice()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$zTdyumK73b1RjiOXWMGPemtTmss
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2005onUnpairAndResetClicked$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$CXUS7qlmfOpx4VnELYGbSuH-9mo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.m2006onUnpairAndResetClicked$lambda6();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.-$$Lambda$UnpairDialogVM$RoCeK_GStMcFlF8j0oAZco3Oka8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUnpairAndResetClicked$lambda-5, reason: not valid java name */
    public static final void m2005onUnpairAndResetClicked$lambda5(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceManager.destroy();
        android.app.Activity activity = this$0.contextWeakReference.get();
        if (activity != null) {
            activity.finish();
        }
        if (activity == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity$default(activity, null, 1, null);
    }

    public final void onCancelClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> function1 = this.dialogClose;
        if (function1 == null) {
            return;
        }
        function1.invoke(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction.None.INSTANCE);
    }
}
