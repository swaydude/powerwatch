package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
class Platform {
    private static final retrofit2.Platform PLATFORM = findPlatform();

    int defaultCallAdapterFactoriesSize() {
        return 1;
    }

    @javax.annotation.Nullable
    java.util.concurrent.Executor defaultCallbackExecutor() {
        return null;
    }

    int defaultConverterFactoriesSize() {
        return 0;
    }

    boolean isDefaultMethod(java.lang.reflect.Method method) {
        return false;
    }

    Platform() {
    }

    static retrofit2.Platform get() {
        return PLATFORM;
    }

    private static retrofit2.Platform findPlatform() {
        try {
            java.lang.Class.forName("android.os.Build");
            if (android.os.Build.VERSION.SDK_INT != 0) {
                return new retrofit2.Platform.Android();
            }
        } catch (java.lang.ClassNotFoundException unused) {
        }
        try {
            java.lang.Class.forName("java.util.Optional");
            return new retrofit2.Platform.Java8();
        } catch (java.lang.ClassNotFoundException unused2) {
            return new retrofit2.Platform();
        }
    }

    java.util.List<? extends retrofit2.CallAdapter.Factory> defaultCallAdapterFactories(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
        if (executor != null) {
            return java.util.Collections.singletonList(new retrofit2.ExecutorCallAdapterFactory(executor));
        }
        return java.util.Collections.singletonList(retrofit2.DefaultCallAdapterFactory.INSTANCE);
    }

    java.util.List<? extends retrofit2.Converter.Factory> defaultConverterFactories() {
        return java.util.Collections.emptyList();
    }

    @javax.annotation.Nullable
    java.lang.Object invokeDefaultMethod(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object... objArr) throws java.lang.Throwable {
        throw new java.lang.UnsupportedOperationException();
    }

    static class Java8 extends retrofit2.Platform {
        @Override // retrofit2.Platform
        int defaultCallAdapterFactoriesSize() {
            return 2;
        }

        @Override // retrofit2.Platform
        int defaultConverterFactoriesSize() {
            return 1;
        }

        Java8() {
        }

        @Override // retrofit2.Platform
        boolean isDefaultMethod(java.lang.reflect.Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.Platform
        java.lang.Object invokeDefaultMethod(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object... objArr) throws java.lang.Throwable {
            java.lang.reflect.Constructor declaredConstructor = java.lang.invoke.MethodHandles.Lookup.class.getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((java.lang.invoke.MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // retrofit2.Platform
        java.util.List<? extends retrofit2.CallAdapter.Factory> defaultCallAdapterFactories(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(retrofit2.CompletableFutureCallAdapterFactory.INSTANCE);
            if (executor != null) {
                arrayList.add(new retrofit2.ExecutorCallAdapterFactory(executor));
            } else {
                arrayList.add(retrofit2.DefaultCallAdapterFactory.INSTANCE);
            }
            return java.util.Collections.unmodifiableList(arrayList);
        }

        @Override // retrofit2.Platform
        java.util.List<? extends retrofit2.Converter.Factory> defaultConverterFactories() {
            return java.util.Collections.singletonList(retrofit2.OptionalConverterFactory.INSTANCE);
        }
    }

    static class Android extends retrofit2.Platform {
        Android() {
        }

        @Override // retrofit2.Platform
        boolean isDefaultMethod(java.lang.reflect.Method method) {
            if (android.os.Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }

        @Override // retrofit2.Platform
        public java.util.concurrent.Executor defaultCallbackExecutor() {
            return new retrofit2.Platform.Android.MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        java.util.List<? extends retrofit2.CallAdapter.Factory> defaultCallAdapterFactories(@javax.annotation.Nullable java.util.concurrent.Executor executor) {
            if (executor == null) {
                throw new java.lang.AssertionError();
            }
            retrofit2.ExecutorCallAdapterFactory executorCallAdapterFactory = new retrofit2.ExecutorCallAdapterFactory(executor);
            return android.os.Build.VERSION.SDK_INT >= 24 ? java.util.Arrays.asList(retrofit2.CompletableFutureCallAdapterFactory.INSTANCE, executorCallAdapterFactory) : java.util.Collections.singletonList(executorCallAdapterFactory);
        }

        @Override // retrofit2.Platform
        int defaultCallAdapterFactoriesSize() {
            return android.os.Build.VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        @Override // retrofit2.Platform
        java.util.List<? extends retrofit2.Converter.Factory> defaultConverterFactories() {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return java.util.Collections.singletonList(retrofit2.OptionalConverterFactory.INSTANCE);
            }
            return java.util.Collections.emptyList();
        }

        @Override // retrofit2.Platform
        int defaultConverterFactoriesSize() {
            return android.os.Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        static class MainThreadExecutor implements java.util.concurrent.Executor {
            private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());

            MainThreadExecutor() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                this.handler.post(runnable);
            }
        }
    }
}
