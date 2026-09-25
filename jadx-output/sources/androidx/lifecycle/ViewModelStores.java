package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class ViewModelStores {
    private ViewModelStores() {
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelStore of(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelStore of(androidx.fragment.app.Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
