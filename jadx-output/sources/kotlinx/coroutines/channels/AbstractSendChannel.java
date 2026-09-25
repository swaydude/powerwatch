package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0006VWXYZ[B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0004J\b\u0010(\u001a\u00020)H\u0002J!\u0010*\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010.J!\u0010/\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010.J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0002\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u00162\u0006\u00104\u001a\u000205H\u0002J\u0014\u00106\u001a\u00020%2\n\u00107\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\"\u00108\u001a\u00020%2\u0018\u00109\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020%0:j\u0002`;H\u0016J\u0012\u0010<\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0013\u0010=\u001a\u00020\u000f2\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0002\u0010>J\u0015\u0010?\u001a\u00020\u00162\u0006\u0010-\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010@J!\u0010A\u001a\u00020\u00162\u0006\u0010-\u001a\u00028\u00002\n\u0010B\u001a\u0006\u0012\u0002\b\u00030CH\u0014¢\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020%2\u0006\u00107\u001a\u00020'H\u0014JV\u0010F\u001a\u00020%\"\u0004\b\u0001\u0010G2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HG0C2\u0006\u0010-\u001a\u00028\u00002(\u0010H\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0J\u0012\u0006\u0012\u0004\u0018\u00010\u00160IH\u0002ø\u0001\u0000¢\u0006\u0002\u0010KJ\u0019\u00104\u001a\u00020%2\u0006\u0010-\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010LJ\u001b\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010N2\u0006\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010OJ\u001b\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010N2\u0006\u0010-\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010OJ\u0019\u0010Q\u001a\u00020%2\u0006\u0010-\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010LJ\u0010\u0010R\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010NH\u0014J\n\u0010S\u001a\u0004\u0018\u00010TH\u0004J\b\u0010U\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "()V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "closedForReceive", "Lkotlinx/coroutines/channels/Closed;", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForSend", "getClosedForSend", "isBufferAlwaysFull", "", "()Z", "isBufferFull", "isClosedForSend", "isFull", "onCloseHandler", "Lkotlinx/atomicfu/AtomicRef;", "", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queueDebugStateString", "getQueueDebugStateString", "close", "cause", "", "conflatePreviousSendBuffered", "", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "countQueueSize", "", "describeSendBuffered", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "element", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeSendConflated", "describeTryOffer", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "enqueueSend", "send", "Lkotlinx/coroutines/channels/SendElement;", "helpClose", "closed", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "invokeOnCloseHandler", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onClosedIdempotent", "registerSelectSend", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBuffered", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendConflated", "sendSuspend", "takeFirstReceiveOrPeekClosed", "takeFirstSendOrPeekClosed", "Lkotlinx/coroutines/channels/Send;", "toString", "SendBuffered", "SendBufferedDesc", "SendConflatedDesc", "SendSelect", "TryEnqueueSendDesc", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class AbstractSendChannel<E> implements kotlinx.coroutines.channels.SendChannel<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.AbstractSendChannel.class, java.lang.Object.class, "onCloseHandler");
    private final kotlinx.coroutines.internal.LockFreeLinkedListHead queue = new kotlinx.coroutines.internal.LockFreeLinkedListHead();
    private volatile java.lang.Object onCloseHandler = null;

    protected java.lang.String getBufferDebugString() {
        return "";
    }

    protected abstract boolean isBufferAlwaysFull();

    protected abstract boolean isBufferFull();

    protected void onClosedIdempotent(kotlinx.coroutines.internal.LockFreeLinkedListNode closed) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListHead getQueue() {
        return this.queue;
    }

    protected java.lang.Object offerInternal(E element) {
        kotlinx.coroutines.channels.ReceiveOrClosed<E> receiveOrClosedTakeFirstReceiveOrPeekClosed;
        java.lang.Object objTryResumeReceive;
        do {
            receiveOrClosedTakeFirstReceiveOrPeekClosed = takeFirstReceiveOrPeekClosed();
            if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
            }
            objTryResumeReceive = receiveOrClosedTakeFirstReceiveOrPeekClosed.tryResumeReceive(element, null);
        } while (objTryResumeReceive == null);
        receiveOrClosedTakeFirstReceiveOrPeekClosed.completeResumeReceive(objTryResumeReceive);
        return receiveOrClosedTakeFirstReceiveOrPeekClosed.getOfferResult();
    }

    protected java.lang.Object offerSelectInternal(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> tryOfferDescDescribeTryOffer = describeTryOffer(element);
        java.lang.Object objPerformAtomicTrySelect = select.performAtomicTrySelect(tryOfferDescDescribeTryOffer);
        if (objPerformAtomicTrySelect != null) {
            return objPerformAtomicTrySelect;
        }
        kotlinx.coroutines.channels.ReceiveOrClosed<? super E> result = tryOfferDescDescribeTryOffer.getResult();
        java.lang.Object obj = tryOfferDescDescribeTryOffer.resumeToken;
        if (obj == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        result.completeResumeReceive(obj);
        return result.getOfferResult();
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForSend() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode = this.queue.getPrevNode();
        if (!(prevNode instanceof kotlinx.coroutines.channels.Closed)) {
            prevNode = null;
        }
        kotlinx.coroutines.channels.Closed<?> closed = (kotlinx.coroutines.channels.Closed) prevNode;
        if (closed == null) {
            return null;
        }
        helpClose(closed);
        return closed;
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForReceive() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = this.queue.getNextNode();
        if (!(nextNode instanceof kotlinx.coroutines.channels.Closed)) {
            nextNode = null;
        }
        kotlinx.coroutines.channels.Closed<?> closed = (kotlinx.coroutines.channels.Closed) nextNode;
        if (closed == null) {
            return null;
        }
        helpClose(closed);
        return closed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    protected final kotlinx.coroutines.channels.Send takeFirstSendOrPeekClosed() {
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        while (true) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            if (next == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            ?? r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            if (r1 == lockFreeLinkedListHead || !(r1 instanceof kotlinx.coroutines.channels.Send)) {
                r1 = 0;
            } else if (!(((kotlinx.coroutines.channels.Send) r1) instanceof kotlinx.coroutines.channels.Closed) && !r1.remove()) {
                r1.helpDelete();
            }
            return (kotlinx.coroutines.channels.Send) r1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final kotlinx.coroutines.channels.ReceiveOrClosed<?> sendBuffered(E element) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered sendBuffered = new kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered(element);
        do {
            java.lang.Object prev = lockFreeLinkedListHead.getPrev();
            if (prev != null) {
                lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.channels.ReceiveOrClosed) {
                    return (kotlinx.coroutines.channels.ReceiveOrClosed) lockFreeLinkedListNode;
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!lockFreeLinkedListNode.addNext(sendBuffered, lockFreeLinkedListHead));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final kotlinx.coroutines.channels.ReceiveOrClosed<?> sendConflated(E element) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered sendBuffered = new kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered(element);
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        do {
            java.lang.Object prev = lockFreeLinkedListHead.getPrev();
            if (prev != null) {
                lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.channels.ReceiveOrClosed) {
                    return (kotlinx.coroutines.channels.ReceiveOrClosed) lockFreeLinkedListNode;
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!lockFreeLinkedListNode.addNext(sendBuffered, lockFreeLinkedListHead));
        conflatePreviousSendBuffered(sendBuffered);
        return null;
    }

    protected final void conflatePreviousSendBuffered(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode = node.getPrevNode(); prevNode instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered; prevNode = prevNode.getPrevNode()) {
            if (!prevNode.remove()) {
                prevNode.helpRemove();
            }
        }
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<?> describeSendBuffered(E element) {
        return new kotlinx.coroutines.channels.AbstractSendChannel.SendBufferedDesc(this.queue, element);
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0014¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "element", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static class SendBufferedDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered<? extends E>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendBufferedDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead queue, E e) {
            super(queue, new kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered(e));
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (affected instanceof kotlinx.coroutines.channels.ReceiveOrClosed) {
                return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
            }
            return null;
        }
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<?> describeSendConflated(E element) {
        return new kotlinx.coroutines.channels.AbstractSendChannel.SendConflatedDesc(this.queue, element);
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendConflatedDesc;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "element", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "finishOnSuccess", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class SendConflatedDesc<E> extends kotlinx.coroutines.channels.AbstractSendChannel.SendBufferedDesc<E> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendConflatedDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead queue, E e) {
            super(queue, e);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            super.finishOnSuccess(affected, next);
            if (!(affected instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered)) {
                affected = null;
            }
            kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered sendBuffered = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) affected;
            if (sendBuffered != null) {
                sendBuffered.remove();
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return getClosedForSend() != null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isFull() {
        return !(this.queue.getNextNode() instanceof kotlinx.coroutines.channels.ReceiveOrClosed) && isBufferFull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return offer(e) ? kotlin.Unit.INSTANCE : sendSuspend(e, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(E element) throws java.lang.Throwable {
        java.lang.Throwable sendException;
        java.lang.Throwable thRecoverStackTrace;
        java.lang.Object objOfferInternal = offerInternal(element);
        if (objOfferInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS) {
            return true;
        }
        if (objOfferInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED) {
            kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
            if (closedForSend == null || (sendException = closedForSend.getSendException()) == null || (thRecoverStackTrace = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(sendException)) == null) {
                return false;
            }
            throw thRecoverStackTrace;
        }
        if (objOfferInternal instanceof kotlinx.coroutines.channels.Closed) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) objOfferInternal).getSendException());
        }
        throw new java.lang.IllegalStateException(("offerInternal returned " + objOfferInternal).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[ORIG_RETURN, RETURN] */
    public final java.lang.Object enqueueSend(kotlinx.coroutines.channels.SendElement send) {
        int iTryCondAddNext;
        boolean z;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        if (isBufferAlwaysFull()) {
            kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
            do {
                java.lang.Object prev = lockFreeLinkedListHead.getPrev();
                if (prev != null) {
                    lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
                    if (lockFreeLinkedListNode instanceof kotlinx.coroutines.channels.ReceiveOrClosed) {
                        return lockFreeLinkedListNode;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            } while (!lockFreeLinkedListNode.addNext(send, lockFreeLinkedListHead));
            return null;
        }
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead2 = this.queue;
        final kotlinx.coroutines.channels.SendElement sendElement = send;
        kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(sendElement) { // from class: kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                if (this.isBufferFull()) {
                    return null;
                }
                return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            java.lang.Object prev2 = lockFreeLinkedListHead2.getPrev();
            if (prev2 != null) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev2;
                if (lockFreeLinkedListNode2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed) {
                    return lockFreeLinkedListNode2;
                }
                iTryCondAddNext = lockFreeLinkedListNode2.tryCondAddNext(sendElement, lockFreeLinkedListHead2, condAddOp);
                z = true;
                if (iTryCondAddNext != 1) {
                }
                if (z) {
                    return null;
                }
                return kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED;
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        } while (iTryCondAddNext != 2);
        z = false;
        if (z) {
            return kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED;
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        boolean z;
        kotlinx.coroutines.channels.Closed<?> closed = new kotlinx.coroutines.channels.Closed<>(cause);
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        while (true) {
            java.lang.Object prev = lockFreeLinkedListHead.getPrev();
            if (prev != null) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
                if (!(!(lockFreeLinkedListNode instanceof kotlinx.coroutines.channels.Closed))) {
                    z = false;
                    break;
                }
                if (lockFreeLinkedListNode.addNext(closed, lockFreeLinkedListHead)) {
                    z = true;
                    break;
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        if (!z) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode = this.queue.getPrevNode();
            if (prevNode == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            }
            helpClose((kotlinx.coroutines.channels.Closed) prevNode);
            return false;
        }
        helpClose(closed);
        invokeOnCloseHandler(cause);
        return true;
    }

    private final void invokeOnCloseHandler(java.lang.Throwable cause) {
        java.lang.Object obj = this.onCloseHandler;
        if (obj == null || obj == kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED || !onCloseHandler$FU.compareAndSet(this, obj, kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED)) {
            return;
        }
        ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(cause);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handler, "handler");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onCloseHandler$FU;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, handler)) {
            java.lang.Object obj = this.onCloseHandler;
            if (obj == kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED) {
                throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new java.lang.IllegalStateException("Another handler was already registered: " + obj);
        }
        kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
        if (closedForSend == null || !atomicReferenceFieldUpdater.compareAndSet(this, handler, kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED)) {
            return;
        }
        handler.invoke(closedForSend.closeCause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void helpClose(kotlinx.coroutines.channels.Closed<?> closed) {
        while (true) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode = closed.getPrevNode();
            if ((prevNode instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead) || !(prevNode instanceof kotlinx.coroutines.channels.Receive)) {
                break;
            } else if (!prevNode.remove()) {
                prevNode.helpRemove();
            } else {
                ((kotlinx.coroutines.channels.Receive) prevNode).resumeReceiveClosed(closed);
            }
        }
        onClosedIdempotent(closed);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        while (true) {
            java.lang.Object next = lockFreeLinkedListHead.getNext();
            if (next == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            ?? r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            if (r1 == lockFreeLinkedListHead || !(r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed)) {
                r1 = 0;
            } else if (!(((kotlinx.coroutines.channels.ReceiveOrClosed) r1) instanceof kotlinx.coroutines.channels.Closed) && !r1.remove()) {
                r1.helpDelete();
            }
            return (kotlinx.coroutines.channels.ReceiveOrClosed) r1;
        }
    }

    protected final kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> describeTryOffer(E element) {
        return new kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<>(element, this.queue);
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0014R\u0012\u0010\u0005\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "element", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "Ljava/lang/Object;", "resumeToken", "", "failure", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "validatePrepared", "", "node", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    protected static final class TryOfferDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.ReceiveOrClosed<? super E>> {
        public final E element;
        public java.lang.Object resumeToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryOfferDesc(E e, kotlinx.coroutines.internal.LockFreeLinkedListHead queue) {
            super(queue);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
            this.element = e;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (!(affected instanceof kotlinx.coroutines.channels.ReceiveOrClosed)) {
                return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
            }
            if (affected instanceof kotlinx.coroutines.channels.Closed) {
                return affected;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc
        public boolean validatePrepared(kotlinx.coroutines.channels.ReceiveOrClosed<? super E> node) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
            java.lang.Object objTryResumeReceive = node.tryResumeReceive(this.element, this);
            if (objTryResumeReceive == null) {
                return false;
            }
            this.resumeToken = objTryResumeReceive;
            return true;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004BH\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryEnqueueSendDesc;", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "Lkotlinx/coroutines/internal/AddLastDesc;", "element", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/AbstractSendChannel;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "failure", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "finishOnSuccess", "", "onPrepare", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private final class TryEnqueueSendDesc<R> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractSendChannel.SendSelect<E, R>> {
        final /* synthetic */ kotlinx.coroutines.channels.AbstractSendChannel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryEnqueueSendDesc(kotlinx.coroutines.channels.AbstractSendChannel abstractSendChannel, E e, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
            super(abstractSendChannel.getQueue(), new kotlinx.coroutines.channels.AbstractSendChannel.SendSelect(e, abstractSendChannel, select, block));
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.this$0 = abstractSendChannel;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (!(affected instanceof kotlinx.coroutines.channels.ReceiveOrClosed)) {
                return null;
            }
            if (!(affected instanceof kotlinx.coroutines.channels.Closed)) {
                affected = null;
            }
            kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) affected;
            return closed != null ? closed : kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return !this.this$0.isBufferFull() ? kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED : super.onPrepare(affected, next);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            super.finishOnSuccess(affected, next);
            ((kotlinx.coroutines.channels.AbstractSendChannel.SendSelect) this.node).disposeOnSelect();
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
        return new kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<? super E>>() { // from class: kotlinx.coroutines.channels.AbstractSendChannel$onSend$1
            @Override // kotlinx.coroutines.selects.SelectClause2
            public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> select, E param, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
                this.this$0.registerSelectSend(select, param, block);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> select, E element, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) throws java.lang.Throwable {
        while (!select.isSelected()) {
            if (isFull()) {
                java.lang.Object objPerformAtomicIfNotSelected = select.performAtomicIfNotSelected(new kotlinx.coroutines.channels.AbstractSendChannel.TryEnqueueSendDesc(this, element, select, block));
                if (objPerformAtomicIfNotSelected == null || objPerformAtomicIfNotSelected == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objPerformAtomicIfNotSelected != kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED) {
                    if (objPerformAtomicIfNotSelected instanceof kotlinx.coroutines.channels.Closed) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) objPerformAtomicIfNotSelected).getSendException());
                    }
                    throw new java.lang.IllegalStateException(("performAtomicIfNotSelected(TryEnqueueSendDesc) returned " + objPerformAtomicIfNotSelected).toString());
                }
            } else {
                java.lang.Object objOfferSelectInternal = offerSelectInternal(element, select);
                if (objOfferSelectInternal == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                    return;
                }
                if (objOfferSelectInternal != kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED) {
                    if (objOfferSelectInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS) {
                        kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, this, select.getCompletion());
                        return;
                    } else {
                        if (objOfferSelectInternal instanceof kotlinx.coroutines.channels.Closed) {
                            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(((kotlinx.coroutines.channels.Closed) objOfferSelectInternal).getSendException());
                        }
                        throw new java.lang.IllegalStateException(("offerSelectInternal returned " + objOfferSelectInternal).toString());
                    }
                }
            }
        }
    }

    public java.lang.String toString() {
        return kotlinx.coroutines.DebugKt.getClassSimpleName(this) + '@' + kotlinx.coroutines.DebugKt.getHexAddress(this) + '{' + getQueueDebugStateString() + '}' + getBufferDebugString();
    }

    private final java.lang.String getQueueDebugStateString() {
        java.lang.String string;
        kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = this.queue.getNextNode();
        if (nextNode == this.queue) {
            return "EmptyQueue";
        }
        if (nextNode instanceof kotlinx.coroutines.channels.Closed) {
            string = nextNode.toString();
        } else if (nextNode instanceof kotlinx.coroutines.channels.Receive) {
            string = "ReceiveQueued";
        } else if (nextNode instanceof kotlinx.coroutines.channels.Send) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + nextNode;
        }
        kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode = this.queue.getPrevNode();
        if (prevNode == nextNode) {
            return string;
        }
        java.lang.String str = string + ",queueSize=" + countQueueSize();
        if (!(prevNode instanceof kotlinx.coroutines.channels.Closed)) {
            return str;
        }
        return str + ",closedForSend=" + prevNode;
    }

    private final int countQueueSize() {
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead = this.queue;
        java.lang.Object next = lockFreeLinkedListHead.getNext();
        if (next == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        int i = 0;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, lockFreeLinkedListHead); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u00042\u00020\u0005BX\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u0014\u0010\u0018\u001a\u00020\u00142\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0016R7\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "E", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "pollResult", "", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/SendChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "token", "dispose", "disposeOnSelect", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "idempotent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class SendSelect<E, R> extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.channels.Send, kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.channels.SendChannel<E> channel;
        private final java.lang.Object pollResult;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object getPollResult() {
            return this.pollResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendSelect(java.lang.Object obj, kotlinx.coroutines.channels.SendChannel<? super E> channel, kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(channel, "channel");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            this.pollResult = obj;
            this.channel = channel;
            this.select = select;
            this.block = block;
        }

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object tryResumeSend(java.lang.Object idempotent) {
            if (this.select.trySelect(idempotent)) {
                return kotlinx.coroutines.channels.AbstractChannelKt.SELECT_STARTED;
            }
            return null;
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            if (!(token == kotlinx.coroutines.channels.AbstractChannelKt.SELECT_STARTED)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            kotlin.coroutines.ContinuationKt.startCoroutine(this.block, this.channel, this.select.getCompletion());
        }

        public final void disposeOnSelect() {
            this.select.disposeOnSelect(this);
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            remove();
        }

        @Override // kotlinx.coroutines.channels.Send
        /* JADX INFO: renamed from: resumeSendClosed */
        public void mo1404resumeSendClosed(kotlinx.coroutines.channels.Closed<?> closed) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
            if (this.select.trySelect(null)) {
                this.select.resumeSelectCancellableWithException(closed.getSendException());
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "SendSelect(" + getPollResult() + ")[" + this.channel + ", " + this.select + ']';
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0014\u0010\u000e\u001a\u00020\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016R\u0012\u0010\u0004\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "token", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "tryResumeSend", "idempotent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class SendBuffered<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.channels.Send {
        public final E element;

        @Override // kotlinx.coroutines.channels.Send
        /* JADX INFO: renamed from: resumeSendClosed */
        public void mo1404resumeSendClosed(kotlinx.coroutines.channels.Closed<?> closed) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
        }

        public SendBuffered(E e) {
            this.element = e;
        }

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object getPollResult() {
            return this.element;
        }

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object tryResumeSend(java.lang.Object idempotent) {
            return kotlinx.coroutines.channels.AbstractChannelKt.SEND_RESUMED;
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend(java.lang.Object token) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
            if (!(token == kotlinx.coroutines.channels.AbstractChannelKt.SEND_RESUMED)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
        }
    }

    final /* synthetic */ java.lang.Object sendSuspend(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 0);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.channels.SendElement sendElement = new kotlinx.coroutines.channels.SendElement(e, cancellableContinuationImpl2);
        while (true) {
            java.lang.Object objEnqueueSend = enqueueSend(sendElement);
            if (objEnqueueSend == null) {
                kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(cancellableContinuationImpl2, sendElement);
                break;
            }
            if (objEnqueueSend instanceof kotlinx.coroutines.channels.Closed) {
                kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) objEnqueueSend;
                helpClose(closed);
                java.lang.Throwable sendException = closed.getSendException();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(sendException)));
                break;
            }
            java.lang.Object objOfferInternal = offerInternal(e);
            if (objOfferInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(unit));
                break;
            }
            if (objOfferInternal != kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED) {
                if (objOfferInternal instanceof kotlinx.coroutines.channels.Closed) {
                    kotlinx.coroutines.channels.Closed closed2 = (kotlinx.coroutines.channels.Closed) objOfferInternal;
                    helpClose(closed2);
                    java.lang.Throwable sendException2 = closed2.getSendException();
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(sendException2)));
                    break;
                }
                throw new java.lang.IllegalStateException(("offerInternal returned " + objOfferInternal).toString());
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
