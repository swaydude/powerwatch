package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static java.util.Map<java.lang.Class<?>, java.lang.Integer> sCallbackCache = new java.util.HashMap();
    private static java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> sClassToAdapters = new java.util.HashMap();

    @java.lang.Deprecated
    static androidx.lifecycle.GenericLifecycleObserver getCallback(java.lang.Object obj) {
        final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = lifecycleEventObserver(obj);
        return new androidx.lifecycle.GenericLifecycleObserver() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            }
        };
    }

    static androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object obj) {
        boolean z = obj instanceof androidx.lifecycle.LifecycleEventObserver;
        boolean z2 = obj instanceof androidx.lifecycle.FullLifecycleObserver;
        if (z && z2) {
            return new androidx.lifecycle.FullLifecycleObserverAdapter((androidx.lifecycle.FullLifecycleObserver) obj, (androidx.lifecycle.LifecycleEventObserver) obj);
        }
        if (z2) {
            return new androidx.lifecycle.FullLifecycleObserverAdapter((androidx.lifecycle.FullLifecycleObserver) obj, null);
        }
        if (z) {
            return (androidx.lifecycle.LifecycleEventObserver) obj;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (getObserverConstructorType(cls) == 2) {
            java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>> list = sClassToAdapters.get(cls);
            if (list.size() == 1) {
                return new androidx.lifecycle.SingleGeneratedAdapterObserver(createGeneratedAdapter(list.get(0), obj));
            }
            androidx.lifecycle.GeneratedAdapter[] generatedAdapterArr = new androidx.lifecycle.GeneratedAdapter[list.size()];
            for (int i = 0; i < list.size(); i++) {
                generatedAdapterArr[i] = createGeneratedAdapter(list.get(i), obj);
            }
            return new androidx.lifecycle.CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new androidx.lifecycle.ReflectiveGenericLifecycleObserver(obj);
    }

    private static androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> constructor, java.lang.Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> cls) {
        try {
            java.lang.Package r0 = cls.getPackage();
            java.lang.String canonicalName = cls.getCanonicalName();
            java.lang.String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            java.lang.String adapterName = getAdapterName(canonicalName);
            if (!name.isEmpty()) {
                adapterName = name + "." + adapterName;
            }
            java.lang.reflect.Constructor declaredConstructor = java.lang.Class.forName(adapterName).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static int getObserverConstructorType(java.lang.Class<?> cls) {
        java.lang.Integer num = sCallbackCache.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(cls);
        sCallbackCache.put(cls, java.lang.Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private static int resolveObserverCallbackType(java.lang.Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(cls);
        if (constructorGeneratedConstructor != null) {
            sClassToAdapters.put(cls, java.util.Collections.singletonList(constructorGeneratedConstructor));
            return 2;
        }
        if (androidx.lifecycle.ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
        java.util.ArrayList arrayList = null;
        if (isLifecycleParent(superclass)) {
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            arrayList = new java.util.ArrayList(sClassToAdapters.get(superclass));
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            if (isLifecycleParent(cls2)) {
                if (getObserverConstructorType(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.addAll(sClassToAdapters.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        sClassToAdapters.put(cls, arrayList);
        return 2;
    }

    private static boolean isLifecycleParent(java.lang.Class<?> cls) {
        return cls != null && androidx.lifecycle.LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static java.lang.String getAdapterName(java.lang.String str) {
        return str.replace(".", io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR) + "_LifecycleAdapter";
    }

    private Lifecycling() {
    }
}
