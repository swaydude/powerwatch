package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: MainDeepBaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "activityContext", "Landroid/content/Context;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "getActivityContext", "()Landroid/content/Context;", "onBackClicked", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class MainDeepBaseViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final android.content.Context activityContext;

    public MainDeepBaseViewModel(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        super(context, rxBus);
        this.activityContext = context;
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = context instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) context : null;
        if (mainActivity == null) {
            return;
        }
        mainActivity.showTab(false);
    }

    public /* synthetic */ MainDeepBaseViewModel(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : rxBus);
    }

    protected final android.content.Context getActivityContext() {
        return this.activityContext;
    }

    public void onBackClicked() {
        android.content.Context context = this.activityContext;
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = context instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) context : null;
        if (mainActivity == null) {
            return;
        }
        mainActivity.showTab(true);
    }
}
