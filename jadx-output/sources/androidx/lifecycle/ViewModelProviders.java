package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class ViewModelProviders {
    @java.lang.Deprecated
    public ViewModelProviders() {
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(androidx.fragment.app.Fragment fragment) {
        return new androidx.lifecycle.ViewModelProvider(fragment);
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return new androidx.lifecycle.ViewModelProvider(fragmentActivity);
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(androidx.fragment.app.Fragment fragment, androidx.lifecycle.ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragment.getDefaultViewModelProviderFactory();
        }
        return new androidx.lifecycle.ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    @java.lang.Deprecated
    public static androidx.lifecycle.ViewModelProvider of(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.lifecycle.ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new androidx.lifecycle.ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }

    @java.lang.Deprecated
    public static class DefaultFactory extends androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory {
        @java.lang.Deprecated
        public DefaultFactory(android.app.Application application) {
            super(application);
        }
    }
}
