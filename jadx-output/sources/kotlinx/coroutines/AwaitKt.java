package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$awaitAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u0007H\u0086@ø\u0001\u0000"}, d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {24}, m = "awaitAll", n = {"deferreds"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.AwaitKt.awaitAll((kotlinx.coroutines.Deferred[]) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$awaitAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00070\u0006H\u0086@ø\u0001\u0000"}, d2 = {"awaitAll", "", "T", "", "Lkotlinx/coroutines/Deferred;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {39}, m = "awaitAll", n = {"$receiver"}, s = {"L$0"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass2(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.AwaitKt.awaitAll((java.util.Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000"}, d2 = {"joinAll", "", "jobs", "", "Lkotlinx/coroutines/Job;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0, 0, 0, 0}, l = {48}, m = "joinAll", n = {"jobs", "$receiver$iv", "element$iv", "it"}, s = {"L$0", "L$1", "L$3", "L$4"})
    static final class C01721 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        C01721(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.AwaitKt.joinAll((kotlinx.coroutines.Job[]) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3, reason: invalid class name */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000"}, d2 = {"joinAll", "", "", "Lkotlinx/coroutines/Job;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0, 0, 0, 0}, l = {57}, m = "joinAll", n = {"$receiver", "$receiver$iv", "element$iv", "it"}, s = {"L$0", "L$1", "L$3", "L$4"})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.AwaitKt.joinAll((java.util.Collection<? extends kotlinx.coroutines.Job>) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object awaitAll(kotlinx.coroutines.Deferred<? extends T>[] deferredArr, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.AwaitKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.AwaitKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.AwaitKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.AwaitKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.AwaitKt.AnonymousClass1(continuation);
        }
        java.lang.Object objAwait = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (objAwait instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwait).exception;
            }
        } else {
            if (objAwait instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwait).exception;
            }
            if (deferredArr.length == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            kotlinx.coroutines.AwaitAll awaitAll = new kotlinx.coroutines.AwaitAll(deferredArr);
            anonymousClass1.L$0 = deferredArr;
            anonymousClass1.label = 1;
            objAwait = awaitAll.await(anonymousClass1);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return (java.util.List) objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object awaitAll(java.util.Collection<? extends kotlinx.coroutines.Deferred<? extends T>> collection, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.AwaitKt.AnonymousClass2 anonymousClass2;
        if (continuation instanceof kotlinx.coroutines.AwaitKt.AnonymousClass2) {
            anonymousClass2 = (kotlinx.coroutines.AwaitKt.AnonymousClass2) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new kotlinx.coroutines.AwaitKt.AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new kotlinx.coroutines.AwaitKt.AnonymousClass2(continuation);
        }
        java.lang.Object objAwait = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (objAwait instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwait).exception;
            }
        } else {
            if (objAwait instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) objAwait).exception;
            }
            if (collection.isEmpty()) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            if (collection == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
            java.lang.Object[] array = collection.toArray(new kotlinx.coroutines.Deferred[0]);
            if (array != null) {
                kotlinx.coroutines.AwaitAll awaitAll = new kotlinx.coroutines.AwaitAll((kotlinx.coroutines.Deferred[]) array);
                anonymousClass2.L$0 = collection;
                anonymousClass2.label = 1;
                objAwait = awaitAll.await(anonymousClass2);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return (java.util.List) objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:25:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.AwaitKt.C01721
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt.C01721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            java.lang.Object r8 = r0.L$4
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            int r8 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.Job[] r4 = (kotlinx.coroutines.Job[]) r4
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.Job[] r5 = (kotlinx.coroutines.Job[]) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.Job[] r6 = (kotlinx.coroutines.Job[]) r6
            boolean r7 = r9 instanceof kotlin.Result.Failure
            if (r7 != 0) goto L49
            r9 = r4
            r4 = r1
            r1 = r5
            r5 = r2
            r2 = r0
            r0 = r6
            goto L7e
        L49:
            kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
            java.lang.Throwable r8 = r9.exception
            throw r8
        L4e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L56:
            boolean r2 = r9 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L83
            int r9 = r8.length
            r2 = 0
            r5 = r9
            r2 = r0
            r4 = r1
            r9 = r8
            r0 = r9
            r1 = r0
            r8 = 0
        L63:
            if (r8 >= r5) goto L80
            r6 = r9[r8]
            r2.L$0 = r0
            r2.L$1 = r1
            r2.L$2 = r9
            r2.I$0 = r5
            r2.I$1 = r8
            r2.L$3 = r6
            r2.L$4 = r6
            r2.label = r3
            java.lang.Object r6 = r6.join(r2)
            if (r6 != r4) goto L7e
            return r4
        L7e:
            int r8 = r8 + r3
            goto L63
        L80:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L83:
            kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
            java.lang.Throwable r8 = r9.exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.joinAll(kotlinx.coroutines.Job[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final java.lang.Object joinAll(java.util.Collection<? extends kotlinx.coroutines.Job> collection, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.AwaitKt.AnonymousClass3 anonymousClass3;
        java.util.Collection<? extends kotlinx.coroutines.Job> collection2;
        java.util.Iterator it;
        java.lang.Iterable iterable;
        if (continuation instanceof kotlinx.coroutines.AwaitKt.AnonymousClass3) {
            anonymousClass3 = (kotlinx.coroutines.AwaitKt.AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new kotlinx.coroutines.AwaitKt.AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new kotlinx.coroutines.AwaitKt.AnonymousClass3(continuation);
        }
        java.lang.Object obj = anonymousClass3.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass3.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = anonymousClass3.L$3;
            it = (java.util.Iterator) anonymousClass3.L$2;
            iterable = (java.lang.Iterable) anonymousClass3.L$1;
            java.util.Collection<? extends kotlinx.coroutines.Job> collection3 = (java.util.Collection) anonymousClass3.L$0;
            if (obj instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) obj).exception;
            }
            collection2 = collection3;
        } else {
            if (obj instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) obj).exception;
            }
            java.util.Collection<? extends kotlinx.coroutines.Job> collection4 = collection;
            java.util.Iterator it2 = collection4.iterator();
            collection2 = collection;
            it = it2;
            iterable = collection4;
        }
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) next;
            anonymousClass3.L$0 = collection2;
            anonymousClass3.L$1 = iterable;
            anonymousClass3.L$2 = it;
            anonymousClass3.L$3 = next;
            anonymousClass3.L$4 = job;
            anonymousClass3.label = 1;
            if (job.join(anonymousClass3) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
