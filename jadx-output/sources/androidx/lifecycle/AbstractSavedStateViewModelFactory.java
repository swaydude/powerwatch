package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.KeyedFactory {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final android.os.Bundle mDefaultArgs;
    private final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    protected abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String str, java.lang.Class<T> cls, androidx.lifecycle.SavedStateHandle savedStateHandle);

    public AbstractSavedStateViewModelFactory(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle) {
        this.mSavedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.mLifecycle = savedStateRegistryOwner.getLifecycle();
        this.mDefaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String str, java.lang.Class<T> cls) {
        androidx.lifecycle.SavedStateHandleController savedStateHandleControllerCreate = androidx.lifecycle.SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        T t = (T) create(str, cls, savedStateHandleControllerCreate.getHandle());
        t.setTagIfAbsent(TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(androidx.lifecycle.ViewModel viewModel) {
        androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}
