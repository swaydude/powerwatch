package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u009c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"broadcast", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class BroadcastKt {
    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlinx.coroutines.CoroutineStart coroutineStart, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i, coroutineStart);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$1, reason: invalid class name */
    /* JADX INFO: compiled from: Broadcast.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$1", f = "Broadcast.kt", i = {2}, l = {29, 29, 30}, m = "invokeSuspend", n = {com.baidu.mapsdkplatform.comapi.e.a}, s = {"L$1"})
    static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel $this_broadcast;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        private kotlinx.coroutines.channels.ProducerScope p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$this_broadcast = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> completion) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
            kotlinx.coroutines.channels.BroadcastKt.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.channels.BroadcastKt.AnonymousClass1(this.$this_broadcast, completion);
            anonymousClass1.p$ = (kotlinx.coroutines.channels.ProducerScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.BroadcastKt.AnonymousClass1) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0071 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0072  */
        /* JADX WARN: Code duplicated, block: B:34:0x0080  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x009b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x009c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009c -> B:28:0x0065). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L57
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L23
                java.lang.Object r1 = r8.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                boolean r6 = r9 instanceof kotlin.Result.Failure
                if (r6 != 0) goto L1e
                goto L64
            L1e:
                kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
                java.lang.Throwable r9 = r9.exception
                throw r9
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                boolean r6 = r9 instanceof kotlin.Result.Failure
                if (r6 != 0) goto L3c
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r8
                goto L8d
            L3c:
                kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
                java.lang.Throwable r9 = r9.exception
                throw r9
            L41:
                java.lang.Object r1 = r8.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                boolean r6 = r9 instanceof kotlin.Result.Failure
                if (r6 != 0) goto L52
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r8
                goto L78
            L52:
                kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
                java.lang.Throwable r9 = r9.exception
                throw r9
            L57:
                boolean r1 = r9 instanceof kotlin.Result.Failure
                if (r1 != 0) goto La4
                kotlinx.coroutines.channels.ProducerScope r9 = r8.p$
                kotlinx.coroutines.channels.ReceiveChannel r1 = r8.$this_broadcast
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = r9
            L64:
                r9 = r8
            L65:
                r9.L$0 = r5
                r9.L$1 = r1
                r9.label = r4
                java.lang.Object r6 = r1.hasNext(r9)
                if (r6 != r0) goto L72
                return r0
            L72:
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r5
                r5 = r1
                r1 = r7
            L78:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La1
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r9 = r5.next(r0)
                if (r9 != r1) goto L8d
                return r1
            L8d:
                r0.L$0 = r6
                r0.L$1 = r9
                r0.L$2 = r5
                r0.label = r2
                java.lang.Object r9 = r6.send(r9, r0)
                if (r9 != r1) goto L9c
                return r1
            L9c:
                r9 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L65
            La1:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            La4:
                kotlin.Result$Failure r9 = (kotlin.Result.Failure) r9
                java.lang.Throwable r9 = r9.exception
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiver$0, int i, kotlinx.coroutines.CoroutineStart start) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(start, "start");
        return broadcast(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getUnconfined(), i, start, kotlinx.coroutines.channels.ChannelsKt.consumes(receiver$0), new kotlinx.coroutines.channels.BroadcastKt.AnonymousClass1(receiver$0, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        kotlin.coroutines.CoroutineContext coroutineContext2 = coroutineContext;
        int i3 = (i2 & 2) != 0 ? 1 : i;
        if ((i2 & 4) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.LAZY;
        }
        kotlinx.coroutines.CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            function1 = (kotlin.jvm.functions.Function1) null;
        }
        return broadcast(coroutineScope, coroutineContext2, i3, coroutineStart2, function1, function2);
    }

    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.CoroutineScope receiver$0, kotlin.coroutines.CoroutineContext context, int i, kotlinx.coroutines.CoroutineStart start, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlinx.coroutines.channels.LazyBroadcastCoroutine broadcastCoroutine;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(start, "start");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        kotlin.coroutines.CoroutineContext coroutineContextNewCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(receiver$0, context);
        kotlinx.coroutines.channels.BroadcastChannel BroadcastChannel = kotlinx.coroutines.channels.BroadcastChannelKt.BroadcastChannel(i);
        if (start.isLazy()) {
            broadcastCoroutine = new kotlinx.coroutines.channels.LazyBroadcastCoroutine(coroutineContextNewCoroutineContext, BroadcastChannel, block);
        } else {
            broadcastCoroutine = new kotlinx.coroutines.channels.BroadcastCoroutine(coroutineContextNewCoroutineContext, BroadcastChannel, true);
        }
        if (function1 != null) {
            broadcastCoroutine.invokeOnCompletion(function1);
        }
        broadcastCoroutine.start(start, broadcastCoroutine, block);
        return broadcastCoroutine;
    }
}
