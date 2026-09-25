package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: BaseContainerFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "VM", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "()V", "onBackPressed", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseContainerFragment<T extends androidx.databinding.ViewDataBinding, VM extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel> extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<T, VM> {
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    public final boolean onBackPressed() {
        if (getChildFragmentManager().getBackStackEntryCount() <= 1) {
            return false;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(childFragmentManager);
        return true;
    }
}
