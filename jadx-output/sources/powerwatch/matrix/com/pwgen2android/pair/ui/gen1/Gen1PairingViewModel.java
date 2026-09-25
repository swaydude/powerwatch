package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: Gen1PairingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\n\u0010$\u001a\u00020\u001b*\u00020%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u000e*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\t0\t0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "bluetoothWarnDisplayed", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getBluetoothWarnDisplayed", "()Landroidx/databinding/ObservableField;", "foundDevices", "", "", "getFoundDevices", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "scanningDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "scanningInProgress", "onBackClicked", "", "onDestroyView", "context", "Landroid/content/Context;", "onDeviceChosen", "position", "", "startScan", "stopScan", "onBluetoothEnableClicked", "Landroid/view/View;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1PairingViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.class).getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager;
    private final androidx.databinding.ObservableField<java.lang.Boolean> bluetoothWarnDisplayed;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final androidx.databinding.ObservableField<java.util.List<java.lang.String>> foundDevices;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final io.reactivex.disposables.CompositeDisposable scanningDisposable;
    private boolean scanningInProgress;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startScan$lambda-3, reason: not valid java name */
    public static final void m2047startScan$lambda3(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen1PairingViewModel(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.communicator = communicator;
        this.bluetoothManager = bluetoothManager;
        this.scanningDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.foundDevices = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
        this.bluetoothWarnDisplayed = new androidx.databinding.ObservableField<>(false);
        getCompositeDisposable().add(bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingViewModel$QD-O9oGI4rwgl-vm4CWWPe-ITgw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.m2044_init_$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }));
    }

    public final androidx.databinding.ObservableField<java.util.List<java.lang.String>> getFoundDevices() {
        return this.foundDevices;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getBluetoothWarnDisplayed() {
        return this.bluetoothWarnDisplayed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2044_init_$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE);
        this$0.getBluetoothWarnDisplayed().set(java.lang.Boolean.valueOf(!zAreEqual));
        if (zAreEqual) {
            this$0.startScan();
        } else {
            this$0.stopScan();
        }
    }

    private final void startScan() {
        if (this.scanningInProgress) {
            return;
        }
        this.scanningInProgress = true;
        this.scanningDisposable.add(this.communicator.foundDevicesChange().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingViewModel$L8souVxAxvRIyWvgvuH1KRD5W_M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.m2046startScan$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.-$$Lambda$Gen1PairingViewModel$GbfvpoZWG9dgRb_kGGhNg6HSeDo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel.m2047startScan$lambda3((java.lang.Throwable) obj);
            }
        }));
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator.DefaultImpls.startScanning$default(this.communicator, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startScan$lambda-2, reason: not valid java name */
    public static final void m2046startScan$lambda2(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.Gen1PairingViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d("WatchModel", "Received device " + deviceInfo.getDeviceName() + ".. Connected: " + deviceInfo.isConnected());
        androidx.databinding.ObservableField<java.util.List<java.lang.String>> foundDevices = this$0.getFoundDevices();
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> listFoundDevices = this$0.communicator.foundDevices();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listFoundDevices, 10));
        java.util.Iterator<T> it = listFoundDevices.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.next()).getDeviceName());
        }
        foundDevices.set(arrayList);
    }

    private final void stopScan() {
        if (this.scanningInProgress) {
            this.scanningInProgress = false;
            this.communicator.stopScanning();
            this.scanningDisposable.clear();
        }
    }

    public final void onDeviceChosen(int position) {
        if (this.communicator.foundDevices().size() > position) {
            this.communicator.stopScanning();
            this.scanningInProgress = false;
            powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = this.communicator.foundDevices().get(position);
            this.communicator.releaseScanningResources();
            androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment.INSTANCE.newInstance(deviceInfo), powerwatch.matrix.com.pwgen2android.R.id.pairing_fragment_container, false, null, 12, null);
            return;
        }
        android.util.Log.d(TAG, "Error, chosen device doesn't exist..");
        throw new java.lang.IllegalStateException("Device does not exist after choosing from scanning list!");
    }

    public final void onBluetoothEnableClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.bluetoothManager.enable();
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        stopScan();
    }
}
