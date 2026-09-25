package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class ViewModelProvider {
    private static final java.lang.String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
    private final androidx.lifecycle.ViewModelProvider.Factory mFactory;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    public interface Factory {
        <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls);
    }

    static class OnRequeryFactory {
        void onRequery(androidx.lifecycle.ViewModel viewModel) {
        }

        OnRequeryFactory() {
        }
    }

    static abstract class KeyedFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        public abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String str, java.lang.Class<T> cls);

        KeyedFactory() {
        }

        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
            throw new java.lang.UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner) {
        androidx.lifecycle.ViewModelProvider.Factory newInstanceFactory;
        androidx.lifecycle.ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory) {
            newInstanceFactory = ((androidx.lifecycle.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
        } else {
            newInstanceFactory = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getInstance();
        }
        this(viewModelStore, newInstanceFactory);
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory);
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this.mFactory = factory;
        this.mViewModelStore = viewModelStore;
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.Class<T> cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.String str, java.lang.Class<T> cls) {
        T t;
        T t2 = (T) this.mViewModelStore.get(str);
        if (cls.isInstance(t2)) {
            java.lang.Object obj = this.mFactory;
            if (obj instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory) {
                ((androidx.lifecycle.ViewModelProvider.OnRequeryFactory) obj).onRequery(t2);
            }
            return t2;
        }
        androidx.lifecycle.ViewModelProvider.Factory factory = this.mFactory;
        if (factory instanceof androidx.lifecycle.ViewModelProvider.KeyedFactory) {
            t = (T) ((androidx.lifecycle.ViewModelProvider.KeyedFactory) factory).create(str, cls);
        } else {
            t = (T) factory.create(cls);
        }
        this.mViewModelStore.put(str, t);
        return t;
    }

    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        static androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
            if (sInstance == null) {
                sInstance = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory();
            }
            return sInstance;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e);
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;
        private android.app.Application mApplication;

        public static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application application) {
            if (sInstance == null) {
                sInstance = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory(application);
            }
            return sInstance;
        }

        public AndroidViewModelFactory(android.app.Application application) {
            this.mApplication = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
            if (androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(android.app.Application.class).newInstance(this.mApplication);
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e);
                } catch (java.lang.InstantiationException e2) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (java.lang.NoSuchMethodException e3) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (java.lang.reflect.InvocationTargetException e4) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }
    }
}
