package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState;", "", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "StateOff", "StateOn", "StateUndefined", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateUndefined;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AppState {
    private final java.lang.String state;

    public /* synthetic */ AppState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOn;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StateOn extends powerwatch.matrix.com.pwgen2android.shared.host.AppState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOn INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOn();

        private StateOn() {
            super("ON", null);
        }
    }

    private AppState(java.lang.String str) {
        this.state = str;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateOff;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StateOff extends powerwatch.matrix.com.pwgen2android.shared.host.AppState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOff INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOff();

        private StateOff() {
            super("OFF", null);
        }
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState$StateUndefined;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StateUndefined extends powerwatch.matrix.com.pwgen2android.shared.host.AppState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateUndefined INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateUndefined();

        private StateUndefined() {
            super("UNDEFINED", null);
        }
    }
}
