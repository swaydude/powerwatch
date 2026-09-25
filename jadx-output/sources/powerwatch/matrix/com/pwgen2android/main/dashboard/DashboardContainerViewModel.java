package powerwatch.matrix.com.pwgen2android.main.dashboard;

/* JADX INFO: compiled from: DasboardContainerViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "selectDate", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;)V", "onDestroy", "", "context", "Landroid/content/Context;", "onResume", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DashboardContainerViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardContainerViewModel(android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.SelectDate selectDate) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        this.selectDate = selectDate;
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroy(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroy(context);
        new android.os.Handler().post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.-$$Lambda$DashboardContainerViewModel$VL2BUgsoCkPoufvgs6ZpZKF43mI
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel.m1654onDestroy$lambda0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onDestroy$lambda-0, reason: not valid java name */
    public static final void m1654onDestroy$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectDate.reset();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onResume(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onResume(context);
        this.selectDate.update();
    }
}
