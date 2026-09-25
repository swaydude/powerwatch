package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: NavigationExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "", "className", "", "(Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "CalendarScreen", "ChooseProductScreen", "GetStartedScreen", "LoginScreen", "MainDashboardScreen", "None", "WelcomeScreen", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$GetStartedScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$LoginScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$MainDashboardScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$ChooseProductScreen;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class NavigationFragment {
    private final java.lang.String className;

    public /* synthetic */ NavigationFragment(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class None extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None();

        private None() {
            super("", null);
        }
    }

    private NavigationFragment(java.lang.String str) {
        this.className = str;
    }

    public final java.lang.String getClassName() {
        return this.className;
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$GetStartedScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GetStartedScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.GetStartedScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.GetStartedScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private GetStartedScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$LoginScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LoginScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.LoginScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.LoginScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private LoginScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WelcomeScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.WelcomeScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.WelcomeScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private WelcomeScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$CalendarScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CalendarScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.CalendarScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.CalendarScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private CalendarScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$MainDashboardScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MainDashboardScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.MainDashboardScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.MainDashboardScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private MainDashboardScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }

    /* JADX INFO: compiled from: NavigationExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$ChooseProductScreen;", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ChooseProductScreen extends powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment {
        public static final powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.ChooseProductScreen INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.ChooseProductScreen();

        /* JADX WARN: Illegal instructions before constructor call */
        private ChooseProductScreen() {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.class).getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNull(simpleName);
            super(simpleName, null);
        }
    }
}
