package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.KeyedFactory {
    private static final java.lang.Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = {android.app.Application.class, androidx.lifecycle.SavedStateHandle.class};
    private static final java.lang.Class<?>[] VIEWMODEL_SIGNATURE = {androidx.lifecycle.SavedStateHandle.class};
    private final android.app.Application mApplication;
    private final android.os.Bundle mDefaultArgs;
    private final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory mFactory;
    private final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner) {
        this(application, savedStateRegistryOwner, null);
    }

    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle) {
        this.mSavedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.mLifecycle = savedStateRegistryOwner.getLifecycle();
        this.mDefaultArgs = bundle;
        this.mApplication = application;
        this.mFactory = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getInstance(application);
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.String str, java.lang.Class<T> cls) {
        java.lang.reflect.Constructor constructorFindMatchingConstructor;
        boolean zIsAssignableFrom = androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(cls);
        if (zIsAssignableFrom) {
            constructorFindMatchingConstructor = findMatchingConstructor(cls, ANDROID_VIEWMODEL_SIGNATURE);
        } else {
            constructorFindMatchingConstructor = findMatchingConstructor(cls, VIEWMODEL_SIGNATURE);
        }
        if (constructorFindMatchingConstructor == null) {
            return (T) this.mFactory.create(cls);
        }
        androidx.lifecycle.SavedStateHandleController savedStateHandleControllerCreate = androidx.lifecycle.SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        try {
            T t = zIsAssignableFrom ? (T) constructorFindMatchingConstructor.newInstance(this.mApplication, savedStateHandleControllerCreate.getHandle()) : (T) constructorFindMatchingConstructor.newInstance(savedStateHandleControllerCreate.getHandle());
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
            return t;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Failed to access " + cls, e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, cls);
    }

    private static <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> cls, java.lang.Class<?>[] clsArr) {
        for (java.lang.Object obj : cls.getConstructors()) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            if (java.util.Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(androidx.lifecycle.ViewModel viewModel) {
        androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}
