package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstuctor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00052\u0006\u0010\t\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"0\u0010\u0002\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionConstructors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ExceptionsConstuctorKt {
    private static final java.util.concurrent.locks.ReentrantReadWriteLock cacheLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> exceptionConstructors = new java.util.WeakHashMap<>();

    public static final <E extends java.lang.Throwable> E tryCopyException(E exception) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = cacheLock.readLock();
        lock.lock();
        try {
            kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function1 = exceptionConstructors.get(exception.getClass());
            lock.unlock();
            if (function1 != null) {
                return (E) function1.invoke(exception);
            }
            kotlin.jvm.functions.Function1 function2 = (kotlin.jvm.functions.Function1) null;
            java.lang.reflect.Constructor<?>[] constructors = exception.getClass().getConstructors();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructors, "exception.javaClass.constructors");
            java.util.Iterator it = kotlin.collections.ArraysKt.sortedWith(constructors, new java.util.Comparator<T>() { // from class: kotlinx.coroutines.internal.ExceptionsConstuctorKt$tryCopyException$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    java.lang.reflect.Constructor it2 = (java.lang.reflect.Constructor) t2;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(it2.getParameterTypes().length);
                    java.lang.reflect.Constructor it3 = (java.lang.reflect.Constructor) t;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                    return kotlin.comparisons.ComparisonsKt.compareValues(numValueOf, java.lang.Integer.valueOf(it3.getParameterTypes().length));
                }
            }).iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                final java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) it.next();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructor, "constructor");
                java.lang.Class<?>[] parameters = constructor.getParameterTypes();
                boolean z = true;
                if (parameters.length == 2 && kotlin.jvm.internal.Intrinsics.areEqual(parameters[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameters[1], java.lang.Throwable.class)) {
                    function2 = new kotlin.jvm.functions.Function1<java.lang.Throwable, E>() { // from class: kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Throwable;)TE; */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable e) {
                            java.lang.Object objM13constructorimpl;
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                java.lang.Object objNewInstance = constructor.newInstance(e.getMessage(), e);
                                if (objNewInstance == null) {
                                    throw new kotlin.TypeCastException("null cannot be cast to non-null type E");
                                }
                                objM13constructorimpl = kotlin.Result.m13constructorimpl((java.lang.Throwable) objNewInstance);
                                if (kotlin.Result.m19isFailureimpl(objM13constructorimpl)) {
                                    objM13constructorimpl = null;
                                }
                                return (java.lang.Throwable) objM13constructorimpl;
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                objM13constructorimpl = kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                        }
                    };
                    break;
                }
                if (parameters.length == 1 && kotlin.jvm.internal.Intrinsics.areEqual(parameters[0], java.lang.Throwable.class)) {
                    function2 = new kotlin.jvm.functions.Function1<java.lang.Throwable, E>() { // from class: kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Throwable;)TE; */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable e) {
                            java.lang.Object objM13constructorimpl;
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                java.lang.Object objNewInstance = constructor.newInstance(e);
                                if (objNewInstance == null) {
                                    throw new kotlin.TypeCastException("null cannot be cast to non-null type E");
                                }
                                objM13constructorimpl = kotlin.Result.m13constructorimpl((java.lang.Throwable) objNewInstance);
                                if (kotlin.Result.m19isFailureimpl(objM13constructorimpl)) {
                                    objM13constructorimpl = null;
                                }
                                return (java.lang.Throwable) objM13constructorimpl;
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                objM13constructorimpl = kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                        }
                    };
                    break;
                }
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "parameters");
                if (parameters.length != 0) {
                    z = false;
                }
                if (z) {
                    function2 = new kotlin.jvm.functions.Function1<java.lang.Throwable, E>() { // from class: kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Throwable;)TE; */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable e) {
                            java.lang.Object objM13constructorimpl;
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                java.lang.Object objNewInstance = constructor.newInstance(new java.lang.Object[0]);
                                if (objNewInstance == null) {
                                    throw new kotlin.TypeCastException("null cannot be cast to non-null type E");
                                }
                                objM13constructorimpl = kotlin.Result.m13constructorimpl((java.lang.Throwable) objNewInstance);
                                if (kotlin.Result.m19isFailureimpl(objM13constructorimpl)) {
                                    objM13constructorimpl = null;
                                }
                                java.lang.Throwable th = (java.lang.Throwable) objM13constructorimpl;
                                if (th == null) {
                                    return null;
                                }
                                th.initCause(e);
                                return th;
                            } catch (java.lang.Throwable th2) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                objM13constructorimpl = kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th2));
                            }
                        }
                    };
                    break;
                }
            }
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                exceptionConstructors.put(exception.getClass(), function2 != null ? function2 : new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstuctorKt$tryCopyException$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Void invoke(java.lang.Throwable it2) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it2, "it");
                        return null;
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                if (function2 != null) {
                    return (E) function2.invoke(exception);
                }
                return null;
            } catch (java.lang.Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
