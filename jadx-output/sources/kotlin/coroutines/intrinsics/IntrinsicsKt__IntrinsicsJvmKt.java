package kotlin.coroutines.intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0083\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001an\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0015¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0006\u0010\u0016\u001a\u0002H\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class IntrinsicsKt__IntrinsicsJvmKt {
    private static final <T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        java.util.Objects.requireNonNull(function1, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(continuation);
    }

    private static final <R, T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        java.util.Objects.requireNonNull(function2, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, continuation);
    }

    private static final <R, P, T> java.lang.Object startCoroutineUninterceptedOrReturn(kotlin.jvm.functions.Function3<? super R, ? super P, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, R r, P p, kotlin.coroutines.Continuation<? super T> continuation) {
        java.util.Objects.requireNonNull(function3, "null cannot be cast to non-null type (R, P, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(r, p, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineUnintercepted(final kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> createCoroutineUnintercepted, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCoroutineUnintercepted, "$this$createCoroutineUnintercepted");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
        final kotlin.coroutines.Continuation<?> continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        if (createCoroutineUnintercepted instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) {
            return ((kotlin.coroutines.jvm.internal.BaseContinuationImpl) createCoroutineUnintercepted).create(continuationProbeCoroutineCreated);
        }
        final kotlin.coroutines.CoroutineContext context = continuationProbeCoroutineCreated.getContext();
        if (context == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
            java.util.Objects.requireNonNull(continuationProbeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new kotlin.coroutines.jvm.internal.RestrictedContinuationImpl(continuationProbeCoroutineCreated) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                private int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            this.label = 2;
                            kotlin.ResultKt.throwOnFailure(result);
                            return result;
                        }
                        throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.label = 1;
                    kotlin.ResultKt.throwOnFailure(result);
                    kotlin.jvm.functions.Function1 function1 = createCoroutineUnintercepted;
                    java.util.Objects.requireNonNull(function1, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    return ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(this);
                }
            };
        }
        java.util.Objects.requireNonNull(continuationProbeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new kotlin.coroutines.jvm.internal.ContinuationImpl(continuationProbeCoroutineCreated, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        this.label = 2;
                        kotlin.ResultKt.throwOnFailure(result);
                        return result;
                    }
                    throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 1;
                kotlin.ResultKt.throwOnFailure(result);
                kotlin.jvm.functions.Function1 function1 = createCoroutineUnintercepted;
                java.util.Objects.requireNonNull(function1, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineUnintercepted(final kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> createCoroutineUnintercepted, final R r, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCoroutineUnintercepted, "$this$createCoroutineUnintercepted");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
        final kotlin.coroutines.Continuation<?> continuationProbeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(completion);
        if (createCoroutineUnintercepted instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) {
            return ((kotlin.coroutines.jvm.internal.BaseContinuationImpl) createCoroutineUnintercepted).create(r, continuationProbeCoroutineCreated);
        }
        final kotlin.coroutines.CoroutineContext context = continuationProbeCoroutineCreated.getContext();
        if (context == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
            java.util.Objects.requireNonNull(continuationProbeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new kotlin.coroutines.jvm.internal.RestrictedContinuationImpl(continuationProbeCoroutineCreated) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                private int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            this.label = 2;
                            kotlin.ResultKt.throwOnFailure(result);
                            return result;
                        }
                        throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.label = 1;
                    kotlin.ResultKt.throwOnFailure(result);
                    kotlin.jvm.functions.Function2 function2 = createCoroutineUnintercepted;
                    java.util.Objects.requireNonNull(function2, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    return ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, this);
                }
            };
        }
        java.util.Objects.requireNonNull(continuationProbeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new kotlin.coroutines.jvm.internal.ContinuationImpl(continuationProbeCoroutineCreated, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        this.label = 2;
                        kotlin.ResultKt.throwOnFailure(result);
                        return result;
                    }
                    throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 1;
                kotlin.ResultKt.throwOnFailure(result);
                kotlin.jvm.functions.Function2 function2 = createCoroutineUnintercepted;
                java.util.Objects.requireNonNull(function2, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.coroutines.Continuation<T> intercepted(kotlin.coroutines.Continuation<? super T> intercepted) {
        kotlin.coroutines.Continuation<T> continuation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intercepted, "$this$intercepted");
        kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl = (kotlin.coroutines.jvm.internal.ContinuationImpl) (!(intercepted instanceof kotlin.coroutines.jvm.internal.ContinuationImpl) ? null : intercepted);
        return (continuationImpl == null || (continuation = (kotlin.coroutines.Continuation<T>) continuationImpl.intercepted()) == null) ? intercepted : continuation;
    }

    private static final <T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final kotlin.coroutines.Continuation<? super T> continuation, final kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
        final kotlin.coroutines.CoroutineContext context = continuation.getContext();
        if (context == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
            java.util.Objects.requireNonNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new kotlin.coroutines.jvm.internal.RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
                private int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        kotlin.ResultKt.throwOnFailure(result);
                        return function1.invoke(this);
                    }
                    if (i == 1) {
                        this.label = 2;
                        kotlin.ResultKt.throwOnFailure(result);
                        return result;
                    }
                    throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
                }
            };
        }
        java.util.Objects.requireNonNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected java.lang.Object invokeSuspend(java.lang.Object result) throws java.lang.Throwable {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    kotlin.ResultKt.throwOnFailure(result);
                    return function1.invoke(this);
                }
                if (i == 1) {
                    this.label = 2;
                    kotlin.ResultKt.throwOnFailure(result);
                    return result;
                }
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
        };
    }
}
