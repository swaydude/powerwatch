package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: TimezoneAdvertizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;", "", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "context", "Landroid/content/Context;", "bluetoothManager", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "timeZoneListener", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;", "pwBleServer", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "notifyRegisteredDevices", "", "timestamp", "", "adjustReason", "", "onCreate", "startServer", "stopServer", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CurrentTimeService {
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final android.content.Context context;
    private final powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer pwBleServer;
    private final powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener timeZoneListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m2774onCreate$lambda1(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-3, reason: not valid java name */
    public static final void m2776onCreate$lambda3(java.lang.Throwable th) {
    }

    public CurrentTimeService(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener timeZoneListener, powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer pwBleServer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZoneListener, "timeZoneListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwBleServer, "pwBleServer");
        this.context = context;
        this.bluetoothManager = bluetoothManager;
        this.timeZoneListener = timeZoneListener;
        this.pwBleServer = pwBleServer;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    public /* synthetic */ CurrentTimeService(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothManager, powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener timeZoneListener, powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer pWBleServer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, context, bluetoothManager, timeZoneListener, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer(context, communicator) : pWBleServer);
    }

    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void onCreate() {
        this.compositeDisposable.add(this.bluetoothManager.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.-$$Lambda$CurrentTimeService$fznLOD8d_ulwfqQcZRcaYre2aQo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.m2773onCreate$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.-$$Lambda$CurrentTimeService$0rKya4vvPoE-YewrLT3ZI6q5hP4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.m2774onCreate$lambda1((java.lang.Throwable) obj);
            }
        }));
        this.compositeDisposable.add(this.timeZoneListener.timeZoneChanged().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.-$$Lambda$CurrentTimeService$uPPVVFuALWGiSA0skweWgcjSpzc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.m2775onCreate$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.-$$Lambda$CurrentTimeService$fsVSBps40FDJvq2Qp904pAOQbLk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.m2776onCreate$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m2773onCreate$lambda0(powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE)) {
            this$0.startServer(this$0.context);
        } else {
            this$0.stopServer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m2775onCreate$lambda2(powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService this$0, powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason changeReason) {
        byte b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (kotlin.jvm.internal.Intrinsics.areEqual(changeReason, powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeZoneChange.INSTANCE)) {
            b = 4;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(changeReason, powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeChange.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            b = 1;
        }
        if (this$0.bluetoothManager.isEnabled()) {
            this$0.notifyRegisteredDevices(jCurrentTimeMillis, b);
        }
    }

    private final void startServer(android.content.Context context) {
        this.pwBleServer.startServer(context);
    }

    private final void stopServer() {
        this.pwBleServer.stopServer();
    }

    private final void notifyRegisteredDevices(long timestamp, byte adjustReason) {
        this.pwBleServer.notifyRegisteredDevices(timestamp, adjustReason);
    }
}
