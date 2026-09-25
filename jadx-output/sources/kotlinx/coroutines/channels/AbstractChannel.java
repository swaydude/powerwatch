package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b<=>?@ABCB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0004J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0014J\b\u0010 \u001a\u00020\u0014H\u0014J\r\u0010!\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\"J\n\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010$2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'H\u0014J\u0011\u0010\u001b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u0004\u0018\u00018\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00018\u00002\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0017\u0010.\u001a\u00028\u00002\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010,J\u0011\u0010/\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(JH\u00100\u001a\u00020\u0014\"\u0004\b\u0001\u001012\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H10'2\"\u00102\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H104\u0012\u0006\u0012\u0004\u0018\u00010$03H\u0002ø\u0001\u0000¢\u0006\u0002\u00105JJ\u00106\u001a\u00020\u0014\"\u0004\b\u0001\u001012\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H10'2$\u00102\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H104\u0012\u0006\u0012\u0004\u0018\u00010$03H\u0002ø\u0001\u0000¢\u0006\u0002\u00105J \u00107\u001a\u00020\u00142\n\u00108\u001a\u0006\u0012\u0002\b\u0003092\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002J\u0010\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "()V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrNull", "getOnReceiveOrNull", "cancel", "", "cause", "", "cleanupSendQueueOnCancel", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onReceiveDequeued", "onReceiveEnqueued", "poll", "()Ljava/lang/Object;", "pollInternal", "", "pollSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrNull", "receiveOrNullResult", "result", "(Ljava/lang/Object;)Ljava/lang/Object;", "receiveOrNullSuspend", "receiveResult", "receiveSuspend", "registerSelectReceive", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectReceiveOrNull", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "IdempotentTokenValue", "Itr", "ReceiveElement", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryEnqueueReceiveDesc", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.Channel<E> {
    protected abstract boolean isBufferAlwaysEmpty();

    protected abstract boolean isBufferEmpty();

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left here for binary compatibility")
    /* JADX INFO: renamed from: cancel, reason: collision with other method in class */
    public /* synthetic */ boolean mo1403cancel() {
        return cancel(null);
    }

    protected java.lang.Object pollInternal() {
        kotlinx.coroutines.channels.Send sendTakeFirstSendOrPeekClosed;
        java.lang.Object objTryResumeSend;
        do {
            sendTakeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
            if (sendTakeFirstSendOrPeekClosed == null) {
                return kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
            }
            objTryResumeSend = sendTakeFirstSendOrPeekClosed.tryResumeSend(null);
        } while (objTryResumeSend == null);
        sendTakeFirstSendOrPeekClosed.completeResumeSend(objTryResumeSend);
        return sendTakeFirstSendOrPeekClosed.getPollResult();
    }

    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<E> tryPollDescDescribeTryPoll = describeTryPoll();
        java.lang.Object objPerformAtomicTrySelect = select.performAtomicTrySelect(tryPollDescDescribeTryPoll);
        if (objPerformAtomicTrySelect != null) {
            return objPerformAtomicTrySelect;
        }
        kotlinx.coroutines.channels.Send result = tryPollDescDescribeTryPoll.getResult();
        java.lang.Object obj = tryPollDescDescribeTryPoll.resumeToken;
        if (obj == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        result.completeResumeSend(obj);
        return tryPollDescDescribeTryPoll.pollResult;
    }

    protected final boolean getHasReceiveOrClosed() {
        return getQueue().getNextNode() instanceof kotlinx.coroutines.channels.ReceiveOrClosed;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isClosedForReceive() {
        return getClosedForReceive() != null && isBufferEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isEmpty() {
        return !(getQueue().getNextNode() instanceof kotlinx.coroutines.channels.Send) && isBufferEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation) {
        java.lang.Object objPollInternal = pollInternal();
        return objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED ? receiveResult(objPollInternal) : receiveSuspend(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final E receiveResult(java.lang.Object result) throws java.lang.Throwable {
        if (result instanceof kotlinx.coroutines.channels.Closed) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) result).getReceiveException());
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean enqueueReceive(kotlinx.coroutines.channels.Receive<? super E> receive) {
        int iTryCondAddNext;
        boolean z = false;
        if (isBufferAlwaysEmpty()) {
            kotlinx.coroutines.internal.LockFreeLinkedListHead queue = getQueue();
            while (true) {
                java.lang.Object prev = queue.getPrev();
                if (prev != null) {
                    kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
                    if (!(!(lockFreeLinkedListNode instanceof kotlinx.coroutines.channels.Send))) {
                        break;
                    }
                    if (lockFreeLinkedListNode.addNext(receive, queue)) {
                        z = true;
                        break;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        } else {
            kotlinx.coroutines.internal.LockFreeLinkedListHead queue2 = getQueue();
            final kotlinx.coroutines.channels.Receive<? super E> receive2 = receive;
            kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(receive2) { // from class: kotlinx.coroutines.channels.AbstractChannel$enqueueReceive$$inlined$addLastIfPrevAndIf$1
                @Override // kotlinx.coroutines.internal.AtomicOp
                public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                    if (this.isBufferEmpty()) {
                        return null;
                    }
                    return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
                }
            };
            do {
                java.lang.Object prev2 = queue2.getPrev();
                if (prev2 != null) {
                    kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev2;
                    if (!(!(lockFreeLinkedListNode2 instanceof kotlinx.coroutines.channels.Send))) {
                        break;
                    }
                    iTryCondAddNext = lockFreeLinkedListNode2.tryCondAddNext(receive2, queue2, condAddOp);
                    if (iTryCondAddNext == 1) {
                        z = true;
                        break;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            } while (iTryCondAddNext != 2);
        }
        if (z) {
            onReceiveEnqueued();
        }
        return z;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> continuation) {
        java.lang.Object objPollInternal = pollInternal();
        return objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED ? receiveOrNullResult(objPollInternal) : receiveOrNullSuspend(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final E receiveOrNullResult(java.lang.Object result) throws java.lang.Throwable {
        if (!(result instanceof kotlinx.coroutines.channels.Closed)) {
            return result;
        }
        kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) result;
        if (closed.closeCause == null) {
            return null;
        }
        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closed.closeCause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final E poll() {
        java.lang.Object objPollInternal = pollInternal();
        if (objPollInternal == kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
            return null;
        }
        return receiveOrNullResult(objPollInternal);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public void cancel() {
        cancel(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean cancel(java.lang.Throwable cause) {
        boolean zClose = close(cause);
        cleanupSendQueueOnCancel();
        return zClose;
    }

    protected void cleanupSendQueueOnCancel() {
        kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
        if (closedForSend == null) {
            throw new java.lang.IllegalStateException("Cannot happen".toString());
        }
        while (true) {
            kotlinx.coroutines.channels.Send sendTakeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
            if (sendTakeFirstSendOrPeekClosed == null) {
                throw new java.lang.IllegalStateException("Cannot happen".toString());
            }
            if (sendTakeFirstSendOrPeekClosed instanceof kotlinx.coroutines.channels.Closed) {
                if (!(sendTakeFirstSendOrPeekClosed == closedForSend)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                return;
            }
            sendTakeFirstSendOrPeekClosed.mo1404resumeSendClosed(closedForSend);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
        return new kotlinx.coroutines.channels.AbstractChannel.Itr(this);
    }

    protected final kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<E> describeTryPoll() {
        return new kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<>(getQueue());
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "pollResult", "Ljava/lang/Object;", "resumeToken", "", "failure", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "validatePrepared", "", "node", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    protected static final class TryPollDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.Send> {
        public E pollResult;
        public java.lang.Object resumeToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryPollDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead queue) {
            super(queue);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (affected instanceof kotlinx.coroutines.channels.Closed) {
                return affected;
            }
            if (affected instanceof kotlinx.coroutines.channels.Send) {
                return null;
            }
            return kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc
        public boolean validatePrepared(kotlinx.coroutines.channels.Send node) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
            java.lang.Object objTryResumeSend = node.tryResumeSend(this);
            if (objTryResumeSend == null) {
                return false;
            }
            this.resumeToken = objTryResumeSend;
            this.pollResult = (E) node.getPollResult();
            return true;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022>\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003j\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00000\u0005`\u0006BD\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0014J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryEnqueueReceiveDesc;", "E", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/internal/AddLastDesc;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "nullOnClose", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;Z)V", "failure", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "finishOnSuccess", "", "onPrepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class TryEnqueueReceiveDesc<E, R> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractChannel<E>.ReceiveSelect<R, ? super E>> {
        final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryEnqueueReceiveDesc(kotlinx.coroutines.channels.AbstractChannel abstractChannel, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block, boolean z) {
            super(abstractChannel.getQueue(), new kotlinx.coroutines.channels.AbstractChannel.ReceiveSelect(abstractChannel, select, block, z));
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.this$0 = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (affected instanceof kotlinx.coroutines.channels.Send) {
                return kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return !this.this$0.isBufferEmpty() ? kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED : super.onPrepare(affected, next);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            super.finishOnSuccess(affected, next);
            this.this$0.onReceiveEnqueued();
            ((kotlinx.coroutines.channels.AbstractChannel.ReceiveSelect) this.node).removeOnSelectCompletion();
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
        return new kotlinx.coroutines.selects.SelectClause1<E>() { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceive$1
            @Override // kotlinx.coroutines.selects.SelectClause1
            public <R> void registerSelectClause1(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
                this.this$0.registerSelectReceive(select, block);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void registerSelectReceive(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
        while (!select.isSelected()) {
            if (!isEmpty()) {
                java.lang.Object objPollSelectInternal = pollSelectInternal(select);
                if (objPollSelectInternal == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objPollSelectInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    if (objPollSelectInternal instanceof kotlinx.coroutines.channels.Closed) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) objPollSelectInternal).getReceiveException());
                    }
                    kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, objPollSelectInternal, select.getCompletion());
                    return;
                }
            } else {
                if (block == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type suspend (E?) -> R");
                }
                java.lang.Object objPerformAtomicIfNotSelected = select.performAtomicIfNotSelected(new kotlinx.coroutines.channels.AbstractChannel.TryEnqueueReceiveDesc(this, select, block, false));
                if (objPerformAtomicIfNotSelected == null || objPerformAtomicIfNotSelected == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objPerformAtomicIfNotSelected != kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED) {
                    throw new java.lang.IllegalStateException(("performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned " + objPerformAtomicIfNotSelected).toString());
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
        return new kotlinx.coroutines.selects.SelectClause1<E>() { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceiveOrNull$1
            @Override // kotlinx.coroutines.selects.SelectClause1
            public <R> void registerSelectClause1(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
                this.this$0.registerSelectReceiveOrNull(select, block);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void registerSelectReceiveOrNull(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
        while (!select.isSelected()) {
            if (isEmpty()) {
                java.lang.Object objPerformAtomicIfNotSelected = select.performAtomicIfNotSelected(new kotlinx.coroutines.channels.AbstractChannel.TryEnqueueReceiveDesc(this, select, block, true));
                if (objPerformAtomicIfNotSelected == null || objPerformAtomicIfNotSelected == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objPerformAtomicIfNotSelected != kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED) {
                    throw new java.lang.IllegalStateException(("performAtomicIfNotSelected(TryEnqueueReceiveDesc) returned " + objPerformAtomicIfNotSelected).toString());
                }
            } else {
                java.lang.Object objPollSelectInternal = pollSelectInternal(select);
                if (objPollSelectInternal == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objPollSelectInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    if (objPollSelectInternal instanceof kotlinx.coroutines.channels.Closed) {
                        kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) objPollSelectInternal;
                        if (closed.closeCause == null) {
                            if (select.trySelect(null)) {
                                kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, null, select.getCompletion());
                                return;
                            }
                            return;
                        }
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closed.closeCause);
                    }
                    kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, objPollSelectInternal, select.getCompletion());
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
        kotlinx.coroutines.channels.ReceiveOrClosed<E> receiveOrClosedTakeFirstReceiveOrPeekClosed = super.takeFirstReceiveOrPeekClosed();
        if (receiveOrClosedTakeFirstReceiveOrPeekClosed != null && !(receiveOrClosedTakeFirstReceiveOrPeekClosed instanceof kotlinx.coroutines.channels.Closed)) {
            onReceiveDequeued();
        }
        return receiveOrClosedTakeFirstReceiveOrPeekClosed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeReceiveOnCancel(kotlinx.coroutines.CancellableContinuation<?> cont, kotlinx.coroutines.channels.Receive<?> receive) {
        cont.invokeOnCancellation(new kotlinx.coroutines.channels.AbstractChannel.RemoveReceiveOnCancel(this, receive));
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class RemoveReceiveOnCancel extends kotlinx.coroutines.CancelHandler {
        private final kotlinx.coroutines.channels.Receive<?> receive;
        final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel this$0;

        public RemoveReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel abstractChannel, kotlinx.coroutines.channels.Receive<?> receive) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receive, "receive");
            this.this$0 = abstractChannel;
            this.receive = receive;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            if (this.receive.remove()) {
                this.this$0.onReceiveDequeued();
            }
        }

        public java.lang.String toString() {
            return "RemoveReceiveOnCancel[" + this.receive + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0011\u0010\u0012\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0013\u001a\u00028\u0001H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/AbstractChannel;", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Itr<E> implements kotlinx.coroutines.channels.ChannelIterator<E> {
        private final kotlinx.coroutines.channels.AbstractChannel<E> channel;
        private java.lang.Object result;

        public Itr(kotlinx.coroutines.channels.AbstractChannel<E> channel) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(channel, "channel");
            this.channel = channel;
            this.result = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
        }

        public final kotlinx.coroutines.channels.AbstractChannel<E> getChannel() {
            return this.channel;
        }

        public final java.lang.Object getResult() {
            return this.result;
        }

        public final void setResult(java.lang.Object obj) {
            this.result = obj;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            if (this.result != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(hasNextResult(this.result));
            }
            java.lang.Object objPollInternal = this.channel.pollInternal();
            this.result = objPollInternal;
            return objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(hasNextResult(this.result)) : hasNextSuspend(continuation);
        }

        private final boolean hasNextResult(java.lang.Object result) throws java.lang.Throwable {
            if (!(result instanceof kotlinx.coroutines.channels.Closed)) {
                return true;
            }
            kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) result;
            if (closed.closeCause == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closed.getReceiveException());
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object next(kotlin.coroutines.Continuation<? super E> continuation) throws java.lang.Throwable {
            java.lang.Object obj = this.result;
            if (obj instanceof kotlinx.coroutines.channels.Closed) {
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) obj).getReceiveException());
            }
            if (obj != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                this.result = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
                return obj;
            }
            return this.channel.receive(continuation);
        }

        final /* synthetic */ java.lang.Object hasNextSuspend(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 0);
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            kotlinx.coroutines.channels.AbstractChannel.ReceiveHasNext receiveHasNext = new kotlinx.coroutines.channels.AbstractChannel.ReceiveHasNext(this, cancellableContinuationImpl2);
            while (true) {
                kotlinx.coroutines.channels.AbstractChannel.ReceiveHasNext receiveHasNext2 = receiveHasNext;
                if (getChannel().enqueueReceive(receiveHasNext2)) {
                    getChannel().removeReceiveOnCancel(cancellableContinuationImpl2, receiveHasNext2);
                    break;
                }
                java.lang.Object objPollInternal = getChannel().pollInternal();
                setResult(objPollInternal);
                if (objPollInternal instanceof kotlinx.coroutines.channels.Closed) {
                    kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) objPollInternal;
                    if (closed.closeCause == null) {
                        java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(boolBoxBoolean));
                        break;
                    }
                    java.lang.Throwable receiveException = closed.getReceiveException();
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(receiveException)));
                    break;
                }
                if (objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    java.lang.Boolean boolBoxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(boolBoxBoolean2));
                    break;
                }
            }
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J!\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "nullOnClose", "", "(Lkotlinx/coroutines/CancellableContinuation;Z)V", "completeResumeReceive", "", "token", "", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class ReceiveElement<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<E> cont;
        public final boolean nullOnClose;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveElement(kotlinx.coroutines.CancellableContinuation<? super E> cont, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cont, "cont");
            this.cont = cont;
            this.nullOnClose = z;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public java.lang.Object tryResumeReceive(E value, java.lang.Object idempotent) {
            return this.cont.tryResume(value, idempotent);
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            this.cont.completeResume(token);
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> closed) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
            if (closed.closeCause == null && this.nullOnClose) {
                kotlinx.coroutines.CancellableContinuation<E> cancellableContinuation = this.cont;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m13constructorimpl(null));
            } else {
                kotlinx.coroutines.CancellableContinuation<E> cancellableContinuation2 = this.cont;
                java.lang.Throwable receiveException = closed.getReceiveException();
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuation2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(receiveException)));
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "ReceiveElement[" + this.cont + ",nullOnClose=" + this.nullOnClose + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0015R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "token", "", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class ReceiveHasNext<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;
        public final kotlinx.coroutines.channels.AbstractChannel.Itr<E> iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveHasNext(kotlinx.coroutines.channels.AbstractChannel.Itr<E> iterator, kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> cont) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(iterator, "iterator");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cont, "cont");
            this.iterator = iterator;
            this.cont = cont;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public java.lang.Object tryResumeReceive(E value, java.lang.Object idempotent) {
            java.lang.Object objTryResume = this.cont.tryResume(true, idempotent);
            if (objTryResume != null) {
                if (idempotent != null) {
                    return new kotlinx.coroutines.channels.AbstractChannel.IdempotentTokenValue(objTryResume, value);
                }
                this.iterator.setResult(value);
            }
            return objTryResume;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            if (token instanceof kotlinx.coroutines.channels.AbstractChannel.IdempotentTokenValue) {
                kotlinx.coroutines.channels.AbstractChannel.IdempotentTokenValue idempotentTokenValue = (kotlinx.coroutines.channels.AbstractChannel.IdempotentTokenValue) token;
                this.iterator.setResult(idempotentTokenValue.value);
                this.cont.completeResume(idempotentTokenValue.token);
                return;
            }
            this.cont.completeResume(token);
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> closed) {
            java.lang.Object objTryResumeWithException;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
            if (closed.closeCause == null) {
                objTryResumeWithException = kotlinx.coroutines.CancellableContinuation.DefaultImpls.tryResume$default(this.cont, false, null, 2, null);
            } else {
                objTryResumeWithException = this.cont.tryResumeWithException(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closed.getReceiveException(), this.cont));
            }
            if (objTryResumeWithException != null) {
                this.iterator.setResult(closed);
                this.cont.completeResume(objTryResumeWithException);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "ReceiveHasNext[" + this.cont + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0006\b\u0002\u0010\u0002 \u00002\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BD\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012$\u0010\u0007\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010J\u0014\u0010\u0014\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00028\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u001cR3\u0010\u0007\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "nullOnClose", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;Z)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "token", "dispose", "removeOnSelectCompletion", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class ReceiveSelect<R, E> extends kotlinx.coroutines.channels.Receive<E> implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final boolean nullOnClose;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;
        final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveSelect(kotlinx.coroutines.channels.AbstractChannel abstractChannel, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.this$0 = abstractChannel;
            this.select = select;
            this.block = block;
            this.nullOnClose = z;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public java.lang.Object tryResumeReceive(E value, java.lang.Object idempotent) {
            if (this.select.trySelect(idempotent)) {
                return value != null ? value : kotlinx.coroutines.channels.AbstractChannelKt.NULL_VALUE;
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            if (token == kotlinx.coroutines.channels.AbstractChannelKt.NULL_VALUE) {
                token = null;
            }
            kotlin.coroutines.ContinuationKt.startCoroutine(this.block, token, this.select.getCompletion());
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> closed) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
            if (this.select.trySelect(null)) {
                if (closed.closeCause == null && this.nullOnClose) {
                    kotlin.coroutines.ContinuationKt.startCoroutine(this.block, null, this.select.getCompletion());
                } else {
                    this.select.resumeSelectCancellableWithException(closed.getReceiveException());
                }
            }
        }

        public final void removeOnSelectCompletion() {
            this.select.disposeOnSelect(this);
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            if (remove()) {
                this.this$0.onReceiveDequeued();
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "ReceiveSelect[" + this.select + ",nullOnClose=" + this.nullOnClose + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$IdempotentTokenValue;", "E", "", "token", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class IdempotentTokenValue<E> {
        public final java.lang.Object token;
        public final E value;

        public IdempotentTokenValue(java.lang.Object token, E e) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            this.token = token;
            this.value = e;
        }
    }

    final /* synthetic */ java.lang.Object receiveSuspend(kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 0);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.channels.AbstractChannel.ReceiveElement receiveElement = new kotlinx.coroutines.channels.AbstractChannel.ReceiveElement(cancellableContinuationImpl2, false);
        while (true) {
            kotlinx.coroutines.channels.AbstractChannel.ReceiveElement receiveElement2 = receiveElement;
            if (enqueueReceive(receiveElement2)) {
                removeReceiveOnCancel(cancellableContinuationImpl2, receiveElement2);
                break;
            }
            java.lang.Object objPollInternal = pollInternal();
            if (objPollInternal instanceof kotlinx.coroutines.channels.Closed) {
                java.lang.Throwable receiveException = ((kotlinx.coroutines.channels.Closed) objPollInternal).getReceiveException();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(receiveException)));
                break;
            }
            if (objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(objPollInternal));
                break;
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    final /* synthetic */ java.lang.Object receiveOrNullSuspend(kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 0);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.channels.AbstractChannel.ReceiveElement receiveElement = new kotlinx.coroutines.channels.AbstractChannel.ReceiveElement(cancellableContinuationImpl2, true);
        while (true) {
            kotlinx.coroutines.channels.AbstractChannel.ReceiveElement receiveElement2 = receiveElement;
            if (enqueueReceive(receiveElement2)) {
                removeReceiveOnCancel(cancellableContinuationImpl2, receiveElement2);
                break;
            }
            java.lang.Object objPollInternal = pollInternal();
            if (objPollInternal instanceof kotlinx.coroutines.channels.Closed) {
                kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) objPollInternal;
                if (closed.closeCause == null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(null));
                    break;
                }
                java.lang.Throwable th = closed.closeCause;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
                break;
            }
            if (objPollInternal != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(objPollInternal));
                break;
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
