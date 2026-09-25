package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes2.dex */
public class LockBasedStorageManager implements kotlin.reflect.jvm.internal.impl.storage.StorageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.lang.String debugText;
    private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy;
    protected final java.util.concurrent.locks.Lock lock;
    private static final java.lang.String PACKAGE_NAME = kotlin.text.StringsKt.substringBeforeLast(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final kotlin.reflect.jvm.internal.impl.storage.StorageManager NO_LOCKS = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("NO_LOCKS", kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.THROW, kotlin.reflect.jvm.internal.impl.storage.NoLock.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        protected <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedDefault() {
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultFallThrough = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.fallThrough();
            if (recursionDetectedResultFallThrough == null) {
                $$$reportNull$$$0(0);
            }
            return recursionDetectedResultFallThrough;
        }
    };

    public interface ExceptionHandlingStrategy {
        public static final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy THROW = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public java.lang.RuntimeException handleException(java.lang.Throwable th) {
                if (th == null) {
                    $$$reportNull$$$0(0);
                }
                throw kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.rethrow(th);
            }
        };

        java.lang.RuntimeException handleException(java.lang.Throwable th);
    }

    private enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 6 || i == 10 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 6 || i == 10 || i == 24) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 2:
            default:
                objArr[0] = "debugText";
                break;
            case 4:
                objArr[0] = "lock";
                break;
            case 5:
            case 7:
            case 9:
            case 11:
                objArr[0] = "compute";
                break;
            case 6:
            case 10:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case 8:
            case 12:
                objArr[0] = "map";
                break;
            case 13:
            case 14:
            case 16:
            case 18:
            case 19:
            case 20:
            case 22:
                objArr[0] = "computable";
                break;
            case 15:
                objArr[0] = "onRecursiveCall";
                break;
            case 17:
            case 21:
                objArr[0] = "postCompute";
                break;
            case 23:
                objArr[0] = "throwable";
                break;
        }
        if (i == 6) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 10) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 7:
            case 8:
                objArr[2] = "createMemoizedFunction";
                break;
            case 6:
            case 10:
            case 24:
                break;
            case 9:
            case 11:
            case 12:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 13:
                objArr[2] = "createLazyValue";
                break;
            case 14:
            case 15:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 16:
            case 17:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 18:
                objArr[2] = "createNullableLazyValue";
                break;
            case 19:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 20:
            case 21:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 22:
                objArr[2] = "compute";
                break;
            case 23:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 6 && i != 10 && i != 24) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private LockBasedStorageManager(java.lang.String str, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy exceptionHandlingStrategy, java.util.concurrent.locks.Lock lock) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        if (exceptionHandlingStrategy == null) {
            $$$reportNull$$$0(3);
        }
        if (lock == null) {
            $$$reportNull$$$0(4);
        }
        this.lock = lock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    public LockBasedStorageManager(java.lang.String str) {
        this(str, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.THROW, new java.util.concurrent.locks.ReentrantLock());
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + " (" + this.debugText + ")";
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction(kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(5);
        }
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, createConcurrentHashMap());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            $$$reportNull$$$0(6);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> createMemoizedFunction(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(7);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(8);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(9);
        }
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, createConcurrentHashMap());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            $$$reportNull$$$0(10);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    public <K, V> kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(11);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(12);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValue(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(13);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createRecursionTolerantLazyValue(kotlin.jvm.functions.Function0<? extends T> function0, final T t) {
        if (function0 == null) {
            $$$reportNull$$$0(14);
        }
        if (t == null) {
            $$$reportNull$$$0(15);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.2
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$2", "recursionDetected"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            protected kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetected(boolean z) {
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultValue = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.value(t);
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(0);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> createLazyValueWithPostCompute(kotlin.jvm.functions.Function0<? extends T> function0, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends T> function1, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function2) {
        if (function0 == null) {
            $$$reportNull$$$0(16);
        }
        if (function2 == null) {
            $$$reportNull$$$0(17);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.3
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 2 : 3];
                if (i != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
                } else {
                    objArr[0] = "value";
                }
                if (i != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
                }
                if (i == 2) {
                    objArr[2] = "postCompute";
                }
                java.lang.String str2 = java.lang.String.format(str, objArr);
                if (i == 2) {
                    throw new java.lang.IllegalArgumentException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            protected kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetected(boolean z) {
                kotlin.jvm.functions.Function1 function3 = function1;
                if (function3 == null) {
                    kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultRecursionDetected = super.recursionDetected(z);
                    if (recursionDetectedResultRecursionDetected == null) {
                        $$$reportNull$$$0(0);
                    }
                    return recursionDetectedResultRecursionDetected;
                }
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultValue = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult.value(function3.invoke(java.lang.Boolean.valueOf(z)));
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(1);
                }
                return recursionDetectedResultValue;
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            protected void postCompute(T t) {
                if (t == null) {
                    $$$reportNull$$$0(2);
                }
                function2.invoke(t);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<T> createNullableLazyValue(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(18);
        }
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(kotlin.jvm.functions.Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(22);
        }
        this.lock.lock();
        try {
            T tInvoke = function0.invoke();
            this.lock.unlock();
            return tInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw this.exceptionHandlingStrategy.handleException(th);
            } catch (java.lang.Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
    }

    private static <K> java.util.concurrent.ConcurrentMap<K, java.lang.Object> createConcurrentHashMap() {
        return new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2);
    }

    protected <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedDefault() {
        throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException("Recursive call in a lazy value under " + this)));
    }

    private static class RecursionDetectedResult<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fallThrough;
        private final T value;

        public static <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> value(T t) {
            return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<>(t, false);
        }

        public static <T> kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> fallThrough() {
            return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<>(null, true);
        }

        private RecursionDetectedResult(T t, boolean z) {
            this.value = t;
            this.fallThrough = z;
        }

        public T getValue() {
            return this.value;
        }

        public boolean isFallThrough() {
            return this.fallThrough;
        }

        public java.lang.String toString() {
            return isFallThrough() ? "FALL_THROUGH" : java.lang.String.valueOf(this.value);
        }
    }

    private static class LockBasedLazyValue<T> implements kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<T> {
        private final kotlin.jvm.functions.Function0<? extends T> computable;
        private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager storageManager;
        private volatile java.lang.Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        protected void postCompute(T t) {
        }

        public LockBasedLazyValue(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED;
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        public boolean isComputed() {
            return (this.value == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED || this.value == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x0061, B:28:0x0067, B:30:0x006d, B:31:0x0073, B:32:0x007d, B:33:0x007e, B:34:0x0084, B:23:0x0054), top: B:40:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x0061, B:28:0x0067, B:30:0x006d, B:31:0x0073, B:32:0x007d, B:33:0x007e, B:34:0x0084, B:23:0x0054), top: B:40:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x004b A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x0061, B:28:0x0067, B:30:0x006d, B:31:0x0073, B:32:0x007d, B:33:0x007e, B:34:0x0084, B:23:0x0054), top: B:40:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0024, B:14:0x0028, B:16:0x0037, B:17:0x003c, B:19:0x0040, B:21:0x004b, B:22:0x0050, B:26:0x0061, B:28:0x0067, B:30:0x006d, B:31:0x0073, B:32:0x007d, B:33:0x007e, B:34:0x0084, B:23:0x0054), top: B:40:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultRecursionDetected;
            java.lang.Object obj = this.value;
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue)) {
                return (T) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(obj);
            }
            this.storageManager.lock.lock();
            try {
                java.lang.Object obj2 = this.value;
                if (!(obj2 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue)) {
                    tInvoke = (T) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(obj2);
                } else if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                    this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED;
                    kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultRecursionDetected2 = recursionDetected(true);
                    if (!recursionDetectedResultRecursionDetected2.isFallThrough()) {
                        tInvoke = recursionDetectedResultRecursionDetected2.getValue();
                    } else if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED) {
                        recursionDetectedResultRecursionDetected = recursionDetected(false);
                        if (!recursionDetectedResultRecursionDetected.isFallThrough()) {
                            tInvoke = recursionDetectedResultRecursionDetected.getValue();
                        } else {
                            this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING;
                            try {
                                tInvoke = this.computable.invoke();
                                this.value = tInvoke;
                                postCompute(tInvoke);
                            } catch (java.lang.Throwable th) {
                                if (kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                                    this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED;
                                    throw th;
                                }
                                if (this.value == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                                    this.value = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(th);
                                }
                                throw this.storageManager.exceptionHandlingStrategy.handleException(th);
                            }
                        }
                    } else {
                        this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING;
                        tInvoke = this.computable.invoke();
                        this.value = tInvoke;
                        postCompute(tInvoke);
                    }
                } else if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED) {
                    recursionDetectedResultRecursionDetected = recursionDetected(false);
                    if (!recursionDetectedResultRecursionDetected.isFallThrough()) {
                        tInvoke = recursionDetectedResultRecursionDetected.getValue();
                    } else {
                        this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING;
                        tInvoke = this.computable.invoke();
                        this.value = tInvoke;
                        postCompute(tInvoke);
                    }
                } else {
                    this.value = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING;
                    tInvoke = this.computable.invoke();
                    this.value = tInvoke;
                    postCompute(tInvoke);
                }
                this.storageManager.lock.unlock();
                return tInvoke;
            } catch (java.lang.Throwable th2) {
                this.storageManager.lock.unlock();
                throw th2;
            }
        }

        protected kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetected(boolean z) {
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.RecursionDetectedResult<T> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault();
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(2);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }
    }

    private static class LockBasedNotNullLazyValue<T> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue<T> implements kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i == 2) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, kotlin.jvm.functions.Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                $$$reportNull$$$0(2);
            }
            return t;
        }
    }

    private static class MapBasedMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<K, V> {
        private final java.util.concurrent.ConcurrentMap<K, java.lang.Object> cache;
        private final kotlin.jvm.functions.Function1<? super K, ? extends V> compute;
        private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager storageManager;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public MapBasedMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k) {
            java.lang.Object obj = this.cache.get(k);
            if (obj != null && obj != kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                return (V) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(obj);
            }
            this.storageManager.lock.lock();
            try {
                java.lang.Object obj2 = this.cache.get(k);
                if (obj2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                    throw recursionDetected(k);
                }
                if (obj2 != null) {
                    V v = (V) kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(obj2);
                    this.storageManager.lock.unlock();
                    return v;
                }
                java.lang.AssertionError assertionErrorRaceCondition = null;
                try {
                    this.cache.put(k, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING);
                    V vInvoke = this.compute.invoke(k);
                    java.lang.Object objPut = this.cache.put(k, kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeNull(vInvoke));
                    if (objPut != kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                        assertionErrorRaceCondition = raceCondition(k, objPut);
                        throw assertionErrorRaceCondition;
                    }
                    this.storageManager.lock.unlock();
                    return vInvoke;
                } catch (java.lang.Throwable th) {
                    if (kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                        this.cache.remove(k);
                        throw th;
                    }
                    if (th == assertionErrorRaceCondition) {
                        throw this.storageManager.exceptionHandlingStrategy.handleException(th);
                    }
                    java.lang.Object objPut2 = this.cache.put(k, kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(th));
                    if (objPut2 == kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING) {
                        throw this.storageManager.exceptionHandlingStrategy.handleException(th);
                    }
                    throw raceCondition(k, objPut2);
                }
            } catch (java.lang.Throwable th2) {
                this.storageManager.lock.unlock();
                throw th2;
            }
        }

        private java.lang.AssertionError recursionDetected(K k) {
            java.lang.AssertionError assertionError = (java.lang.AssertionError) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.sanitizeStackTrace(new java.lang.AssertionError("Recursion detected on input: " + k + " under " + this.storageManager));
            if (assertionError == null) {
                $$$reportNull$$$0(3);
            }
            return assertionError;
        }

        private java.lang.AssertionError raceCondition(K k, java.lang.Object obj) {
            java.lang.AssertionError assertionError = (java.lang.AssertionError) kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.sanitizeStackTrace(new java.lang.AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.storageManager));
            if (assertionError == null) {
                $$$reportNull$$$0(4);
            }
            return assertionError;
        }

        protected kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager getStorageManager() {
            return this.storageManager;
        }
    }

    private static class MapBasedMemoizedFunctionToNotNull<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i == 3) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapBasedMemoizedFunctionToNotNull(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<K, java.lang.Object> concurrentMap, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v == null) {
                $$$reportNull$$$0(3);
            }
            return v;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends java.lang.Throwable> T sanitizeStackTrace(T t) {
        if (t == null) {
            $$$reportNull$$$0(23);
        }
        java.lang.StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (!stackTrace[i2].getClassName().startsWith(PACKAGE_NAME)) {
                i = i2;
                break;
            }
        }
        java.util.List listSubList = java.util.Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((java.lang.StackTraceElement[]) listSubList.toArray(new java.lang.StackTraceElement[listSubList.size()]));
        if (t == null) {
            $$$reportNull$$$0(24);
        }
        return t;
    }

    private static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, V> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNullableValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, java.lang.Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, V>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // kotlin.jvm.functions.Function1
                public V invoke(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V> keyWithComputation) {
                    return (V) ((kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation) keyWithComputation).computation.invoke();
                }
            });
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        public V computeIfAbsent(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            return invoke(new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation(k, function0));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNotNullValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    private static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION;
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i == 3) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNotNullValuesBasedOnMemoizedFunction(kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager, java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation<K, V>, java.lang.Object> concurrentMap) {
            super(concurrentMap);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public V computeIfAbsent(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            V v = (V) super.computeIfAbsent(k, function0);
            if (v == null) {
                $$$reportNull$$$0(3);
            }
            return v;
        }
    }

    private static class KeyWithComputation<K, V> {
        private final kotlin.jvm.functions.Function0<? extends V> computation;
        private final K key;

        public KeyWithComputation(K k, kotlin.jvm.functions.Function0<? extends V> function0) {
            this.key = k;
            this.computation = function0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.key.equals(((kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.KeyWithComputation) obj).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }
    }
}
