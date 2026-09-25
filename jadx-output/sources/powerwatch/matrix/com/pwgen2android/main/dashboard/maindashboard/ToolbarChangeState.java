package powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard;

/* JADX INFO: compiled from: MainDashboardViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "", "()V", "AutoPauseState", "ConnectivityOff", "ConnectivityOn", "ConnectivitySearch", "None", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$None;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$AutoPauseState;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ToolbarChangeState {
    public /* synthetic */ ToolbarChangeState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ConnectivityOn extends powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState {
        public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOn INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOn();

        private ConnectivityOn() {
            super(null);
        }
    }

    private ToolbarChangeState() {
    }

    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ConnectivityOff extends powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState {
        public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOff INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivityOff();

        private ConnectivityOff() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ConnectivitySearch extends powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState {
        public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivitySearch INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.ConnectivitySearch();

        private ConnectivitySearch() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$None;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class None extends powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState {
        public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.None INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.None();

        private None() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: MainDashboardViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$AutoPauseState;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AutoPauseState extends powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState {
        public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.AutoPauseState INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.ToolbarChangeState.AutoPauseState();

        private AutoPauseState() {
            super(null);
        }
    }
}
