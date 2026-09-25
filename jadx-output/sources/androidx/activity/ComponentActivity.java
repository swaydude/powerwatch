package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner {
    private int mContentLayoutId;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    static final class NonConfigurationInstances {
        java.lang.Object custom;
        androidx.lifecycle.ViewModelStore viewModelStore;

        NonConfigurationInstances() {
        }
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mSavedStateRegistryController = androidx.savedstate.SavedStateRegistryController.create(this);
        this.mOnBackPressedDispatcher = new androidx.activity.OnBackPressedDispatcher(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.activity.ComponentActivity.super.onBackPressed();
            }
        });
        if (getLifecycle() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            getLifecycle().addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
                        android.view.Window window = androidx.activity.ComponentActivity.this.getWindow();
                        android.view.View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        getLifecycle().addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event != androidx.lifecycle.Lifecycle.Event.ON_DESTROY || androidx.activity.ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                androidx.activity.ComponentActivity.this.getViewModelStore().clear();
            }
        });
        if (19 > android.os.Build.VERSION.SDK_INT || android.os.Build.VERSION.SDK_INT > 23) {
            return;
        }
        getLifecycle().addObserver(new androidx.activity.ImmLeaksCleaner(this));
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.performRestore(bundle);
        androidx.lifecycle.ReportFragment.injectIfNeededIn(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        androidx.lifecycle.Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.LifecycleRegistry) {
            ((androidx.lifecycle.LifecycleRegistry) lifecycle).setCurrentState(androidx.lifecycle.Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances;
        java.lang.Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.viewModelStore;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances2 = new androidx.activity.ComponentActivity.NonConfigurationInstances();
        nonConfigurationInstances2.custom = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.viewModelStore = viewModelStore;
        return nonConfigurationInstances2;
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
        androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.custom;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mViewModelStore == null) {
            androidx.activity.ComponentActivity.NonConfigurationInstances nonConfigurationInstances = (androidx.activity.ComponentActivity.NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this.mViewModelStore = nonConfigurationInstances.viewModelStore;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new androidx.lifecycle.ViewModelStore();
            }
        }
        return this.mViewModelStore;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new androidx.lifecycle.SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.onBackPressed();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }
}
