package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: WatchGettingStartedViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchGettingStartedViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "onLeftButtonClicked", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchGettingStartedViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchGettingStartedViewModel(androidx.fragment.app.FragmentManager parentFragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(parentFragmentManager);
    }

    public final void onLeftButtonClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        android.util.Log.d("fragment_tag", kotlin.jvm.internal.Intrinsics.stringPlus("TAG GettingStarted: ", fragmentManager == null ? null : java.lang.Integer.valueOf(fragmentManager.hashCode())));
        androidx.fragment.app.FragmentManager fragmentManager2 = this.fragmentManagerWeakReference.get();
        if (fragmentManager2 == null) {
            return;
        }
        fragmentManager2.popBackStack();
    }
}
