package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final androidx.lifecycle.SavedStateHandle mHandle;
    private boolean mIsAttached = false;
    private final java.lang.String mKey;

    SavedStateHandleController(java.lang.String str, androidx.lifecycle.SavedStateHandle savedStateHandle) {
        this.mKey = str;
        this.mHandle = savedStateHandle;
    }

    boolean isAttached() {
        return this.mIsAttached;
    }

    void attachToLifecycle(androidx.savedstate.SavedStateRegistry savedStateRegistry, androidx.lifecycle.Lifecycle lifecycle) {
        if (this.mIsAttached) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
        }
        this.mIsAttached = true;
        lifecycle.addObserver(this);
        savedStateRegistry.registerSavedStateProvider(this.mKey, this.mHandle.savedStateProvider());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            this.mIsAttached = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    androidx.lifecycle.SavedStateHandle getHandle() {
        return this.mHandle;
    }

    static androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry savedStateRegistry, androidx.lifecycle.Lifecycle lifecycle, java.lang.String str, android.os.Bundle bundle) {
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = new androidx.lifecycle.SavedStateHandleController(str, androidx.lifecycle.SavedStateHandle.createHandle(savedStateRegistry.consumeRestoredStateForKey(str), bundle));
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        tryToAddRecreator(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        OnRecreation() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
            if (!(savedStateRegistryOwner instanceof androidx.lifecycle.ViewModelStoreOwner)) {
                throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            androidx.lifecycle.ViewModelStore viewModelStore = ((androidx.lifecycle.ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            androidx.savedstate.SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            java.util.Iterator<java.lang.String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(viewModelStore.get(it.next()), savedStateRegistry, savedStateRegistryOwner.getLifecycle());
            }
            if (viewModelStore.keys().isEmpty()) {
                return;
            }
            savedStateRegistry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
        }
    }

    static void attachHandleIfNeeded(androidx.lifecycle.ViewModel viewModel, androidx.savedstate.SavedStateRegistry savedStateRegistry, androidx.lifecycle.Lifecycle lifecycle) {
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) viewModel.getTag(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController == null || savedStateHandleController.isAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        tryToAddRecreator(savedStateRegistry, lifecycle);
    }

    private static void tryToAddRecreator(final androidx.savedstate.SavedStateRegistry savedStateRegistry, final androidx.lifecycle.Lifecycle lifecycle) {
        androidx.lifecycle.Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == androidx.lifecycle.Lifecycle.State.INITIALIZED || currentState.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            savedStateRegistry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
        } else {
            lifecycle.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        savedStateRegistry.runOnNextRecreation(androidx.lifecycle.SavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }
}
