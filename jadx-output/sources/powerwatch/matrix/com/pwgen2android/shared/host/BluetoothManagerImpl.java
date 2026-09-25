package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: BluetoothManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0016¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "context", "Landroid/content/Context;", "(Landroid/bluetooth/BluetoothAdapter;Landroid/content/Context;)V", "bluetoothReceiver", "Landroid/content/BroadcastReceiver;", "bluetoothStateChangeSubject", "Lio/reactivex/subjects/ReplaySubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;", "kotlin.jvm.PlatformType", "isEnabled", "", "()Z", "enable", "", "getChangeState", "Lio/reactivex/Observable;", "states", "", "([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BluetoothManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private final android.content.BroadcastReceiver bluetoothReceiver;
    private final io.reactivex.subjects.ReplaySubject<powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState> bluetoothStateChangeSubject;

    public BluetoothManagerImpl(android.bluetooth.BluetoothAdapter bluetoothAdapter, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "bluetoothAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.bluetoothAdapter = bluetoothAdapter;
        io.reactivex.subjects.ReplaySubject<powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState> replaySubjectCreateWithSize = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize, "createWithSize<BluetoothState>(1)");
        this.bluetoothStateChangeSubject = replaySubjectCreateWithSize;
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManagerImpl$bluetoothReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                if (kotlin.jvm.internal.Intrinsics.areEqual("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra == 10) {
                        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.warn$default(this.this$0, "Bluetooth is disabled, pushing info to application modules", null, 2, null);
                        obj = (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE;
                    } else if (intExtra == 12) {
                        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this.this$0, "Bluetooth is enabled, pushing info to application modules", null, 2, null);
                        obj = (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE;
                    } else {
                        obj = (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Unknown.INSTANCE;
                    }
                    this.this$0.bluetoothStateChangeSubject.onNext(obj);
                }
            }
        };
        this.bluetoothReceiver = broadcastReceiver;
        replaySubjectCreateWithSize.onNext(isEnabled() ? powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager
    public boolean isEnabled() {
        return this.bluetoothAdapter.isEnabled();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState> getChangeState(final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState... states) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "states");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState> observableFilter = this.bluetoothStateChangeSubject.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$BluetoothManagerImpl$R22tSg5u5iM5wqC3rLrHaFwFKLE
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManagerImpl.m3283getChangeState$lambda0((powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$BluetoothManagerImpl$kk90q7HrsyrdMW4Dud4nAJty4FQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManagerImpl.m3284getChangeState$lambda1(states, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "bluetoothStateChangeSubject\n                .filter { it != BluetoothState.Unknown }\n                .filter { newState ->\n                    for (wantedState in states) {\n                        if (wantedState == newState) {\n                            return@filter true\n                        }\n                    }\n                    false\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getChangeState$lambda-0, reason: not valid java name */
    public static final boolean m3283getChangeState$lambda0(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Unknown.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getChangeState$lambda-1, reason: not valid java name */
    public static final boolean m3284getChangeState$lambda1(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState[] states, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState newState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(states, "$states");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "newState");
        int length = states.length;
        int i = 0;
        while (i < length) {
            powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState = states[i];
            i++;
            if (kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, newState)) {
                return true;
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager
    public void enable() {
        this.bluetoothAdapter.enable();
    }
}
