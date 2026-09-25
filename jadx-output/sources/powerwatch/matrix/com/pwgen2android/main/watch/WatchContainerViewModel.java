package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: WatchContainerViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/WatchContainerViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchContainerViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchContainerViewModel(androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> weakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.fragmentManagerWeakReference = weakReference;
        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment pWWatchFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager2 = weakReference.get();
        if (fragmentManager2 == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager2, pWWatchFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, true, null, 8, null);
    }
}
