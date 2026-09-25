package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: NetworkInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "isEnabled", "", "()Z", "networkStatusChange", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;", "getNetworkStatusChange", "()Lio/reactivex/Observable;", "networkSubject", "Lio/reactivex/subjects/BehaviorSubject;", "currentState", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NetworkInfoProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider {
    private final android.net.ConnectivityManager connectivityManager;
    private final android.content.Context context;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus> networkSubject;

    public NetworkInfoProviderImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(currentState());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(currentState())");
        this.networkSubject = behaviorSubjectCreateDefault;
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        this.connectivityManager = connectivityManager;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            context.registerReceiver(new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProviderImpl$networkBroadcast$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context2, android.content.Intent intent) {
                    this.this$0.networkSubject.onNext(this.this$0.currentState());
                }
            }, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else if (connectivityManager != null) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            behaviorSubjectCreateDefault.onNext(kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (networkCapabilities != null ? java.lang.Boolean.valueOf(networkCapabilities.hasCapability(12)) : null), (java.lang.Object) true) ? powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected.INSTANCE);
            connectivityManager.registerDefaultNetworkCallback(new android.net.ConnectivityManager.NetworkCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProviderImpl.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities2, "networkCapabilities");
                    super.onCapabilitiesChanged(network, networkCapabilities2);
                    powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProviderImpl.this.networkSubject.onNext(networkCapabilities2.hasCapability(12) ? powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected.INSTANCE);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(android.net.Network network) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProviderImpl.this.networkSubject.onNext(powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected.INSTANCE);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus currentState() {
        android.net.ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE;
        }
        return powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected.INSTANCE;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus> getNetworkStatusChange() {
        return this.networkSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider
    public boolean isEnabled() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkSubject.getValue(), powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected.INSTANCE);
    }
}
