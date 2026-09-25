package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020\u0015H\u0002J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010)J\u0015\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010,J!\u0010-\u001a\u00020\t2\u0006\u0010+\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030/H\u0014¢\u0006\u0002\u00100J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0016J-\u00103\u001a\u00020$2\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0082\u0010R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u001b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001cj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d`\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "getCapacity", "()I", "head", "", "isBufferAlwaysFull", "", "()Z", "isBufferFull", "size", "subscribers", "", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "Lkotlinx/coroutines/internal/SubscribersList;", "tail", "cancel", "cause", "", "checkSubOffers", "", "close", "computeMinHead", "elementAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(J)Ljava/lang/Object;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "updateHead", "addSub", "removeSub", "Subscriber", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ArrayBroadcastChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final java.lang.Object[] buffer;
    private final java.util.concurrent.locks.ReentrantLock bufferLock;
    private final int capacity;
    private volatile long head;
    private volatile int size;
    private final java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> subscribers;
    private volatile long tail;

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferAlwaysFull() {
        return false;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public ArrayBroadcastChannel(int i) {
        this.capacity = i;
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i + " was specified").toString());
        }
        this.bufferLock = new java.util.concurrent.locks.ReentrantLock();
        this.buffer = new java.lang.Object[i];
        this.subscribers = kotlinx.coroutines.internal.ConcurrentKt.subscriberList();
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferFull() {
        return this.size >= this.capacity;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber subscriber = new kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber(this);
        updateHead$default(this, subscriber, null, 2, null);
        return subscriber;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        if (!super.close(cause)) {
            return false;
        }
        checkSubOffers();
        return true;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public boolean cancel(java.lang.Throwable cause) {
        boolean zClose = close(cause);
        java.util.Iterator<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> it = this.subscribers.iterator();
        while (it.hasNext()) {
            it.next().cancel(cause);
        }
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            int i = this.size;
            if (i >= this.capacity) {
                java.lang.Object obj = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
                reentrantLock.unlock();
                return obj;
            }
            long j = this.tail;
            this.buffer[(int) (j % ((long) this.capacity))] = element;
            this.size = i + 1;
            this.tail = j + 1;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            checkSubOffers();
            return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.bufferLock;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            int i = this.size;
            if (i >= this.capacity) {
                java.lang.Object obj = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
                reentrantLock.unlock();
                return obj;
            }
            if (!select.trySelect(null)) {
                java.lang.Object already_selected = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
                reentrantLock.unlock();
                return already_selected;
            }
            long j = this.tail;
            this.buffer[(int) (j % ((long) this.capacity))] = element;
            this.size = i + 1;
            this.tail = j + 1;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            checkSubOffers();
            return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void checkSubOffers() {
        java.util.Iterator<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> it = this.subscribers.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (it.next().checkOffer()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            updateHead$default(this, null, null, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateHead$default(kotlinx.coroutines.channels.ArrayBroadcastChannel arrayBroadcastChannel, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber subscriber, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber subscriber2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subscriber = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) null;
        }
        if ((i & 2) != 0) {
            subscriber2 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) null;
        }
        arrayBroadcastChannel.updateHead(subscriber, subscriber2);
    }

    private final void updateHead(kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> addSub, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> removeSub) {
        kotlinx.coroutines.channels.Send sendTakeFirstSendOrPeekClosed;
        java.lang.Object objTryResumeSend;
        while (true) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.bufferLock;
            reentrantLock.lock();
            if (addSub != null) {
                try {
                    addSub.subHead = this.tail;
                    boolean zIsEmpty = this.subscribers.isEmpty();
                    this.subscribers.add(addSub);
                    if (!zIsEmpty) {
                        reentrantLock.unlock();
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (removeSub != null) {
                this.subscribers.remove(removeSub);
                if (this.head != removeSub.subHead) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long jComputeMinHead = computeMinHead();
            long j = this.tail;
            long j2 = this.head;
            long jCoerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(jComputeMinHead, j);
            if (jCoerceAtMost <= j2) {
                reentrantLock.unlock();
                return;
            }
            int i = this.size;
            while (true) {
                if (j2 < jCoerceAtMost) {
                    java.lang.Object[] objArr = this.buffer;
                    int i2 = this.capacity;
                    objArr[(int) (j2 % ((long) i2))] = null;
                    boolean z = i >= i2;
                    j2++;
                    this.head = j2;
                    i--;
                    this.size = i;
                    if (z) {
                        while (true) {
                            sendTakeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
                            if (sendTakeFirstSendOrPeekClosed != null && !(sendTakeFirstSendOrPeekClosed instanceof kotlinx.coroutines.channels.Closed)) {
                                if (sendTakeFirstSendOrPeekClosed == null) {
                                    kotlin.jvm.internal.Intrinsics.throwNpe();
                                }
                                objTryResumeSend = sendTakeFirstSendOrPeekClosed.tryResumeSend(null);
                                if (objTryResumeSend != null) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    reentrantLock.unlock();
                    return;
                }
            }
            java.lang.Object[] objArr2 = this.buffer;
            int i3 = (int) (j % ((long) this.capacity));
            if (sendTakeFirstSendOrPeekClosed == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
            }
            objArr2[i3] = sendTakeFirstSendOrPeekClosed.getPollResult();
            this.size = i + 1;
            this.tail = j + 1;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            if (sendTakeFirstSendOrPeekClosed == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            sendTakeFirstSendOrPeekClosed.completeResumeSend(objTryResumeSend);
            checkSubOffers();
            addSub = null;
            removeSub = null;
        }
    }

    private final long computeMinHead() {
        java.util.Iterator<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> it = this.subscribers.iterator();
        long jCoerceAtMost = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        while (it.hasNext()) {
            jCoerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(jCoerceAtMost, it.next().subHead);
        }
        return jCoerceAtMost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E elementAt(long index) {
        return (E) this.buffer[(int) (index % ((long) this.capacity))];
    }

    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "subHead", "", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "cancel", "cause", "", "checkOffer", "clearBuffer", "", "needsToCheckOfferWithoutLock", "peekUnderLock", "", "pollInternal", "pollSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.AbstractChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private final kotlinx.coroutines.channels.ArrayBroadcastChannel<E> broadcastChannel;
        public volatile long subHead;
        private final java.util.concurrent.locks.ReentrantLock subLock;

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferAlwaysEmpty() {
            return false;
        }

        public Subscriber(kotlinx.coroutines.channels.ArrayBroadcastChannel<E> broadcastChannel) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(broadcastChannel, "broadcastChannel");
            this.broadcastChannel = broadcastChannel;
            this.subLock = new java.util.concurrent.locks.ReentrantLock();
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferEmpty() {
            return this.subHead >= ((kotlinx.coroutines.channels.ArrayBroadcastChannel) this.broadcastChannel).tail;
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferAlwaysFull() {
            throw new java.lang.IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferFull() {
            throw new java.lang.IllegalStateException("Should not be used".toString());
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
        public boolean cancel(java.lang.Throwable cause) {
            boolean zClose = close(cause);
            if (zClose) {
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, this, 1, null);
            }
            clearBuffer();
            return zClose;
        }

        private final void clearBuffer() {
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                this.subHead = ((kotlinx.coroutines.channels.ArrayBroadcastChannel) this.broadcastChannel).tail;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean checkOffer() {
            kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) null;
            boolean z = false;
            while (needsToCheckOfferWithoutLock() && this.subLock.tryLock()) {
                try {
                    java.lang.Object objPeekUnderLock = peekUnderLock();
                    if (objPeekUnderLock != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                        if (objPeekUnderLock instanceof kotlinx.coroutines.channels.Closed) {
                            closed = (kotlinx.coroutines.channels.Closed) objPeekUnderLock;
                        } else {
                            kotlinx.coroutines.channels.ReceiveOrClosed<E> receiveOrClosedTakeFirstReceiveOrPeekClosed = takeFirstReceiveOrPeekClosed();
                            if (receiveOrClosedTakeFirstReceiveOrPeekClosed != 0 && !(receiveOrClosedTakeFirstReceiveOrPeekClosed instanceof kotlinx.coroutines.channels.Closed)) {
                                java.lang.Object objTryResumeReceive = receiveOrClosedTakeFirstReceiveOrPeekClosed.tryResumeReceive(objPeekUnderLock, null);
                                if (objTryResumeReceive != null) {
                                    this.subHead++;
                                    z = true;
                                    this.subLock.unlock();
                                    if (receiveOrClosedTakeFirstReceiveOrPeekClosed == 0) {
                                        kotlin.jvm.internal.Intrinsics.throwNpe();
                                    }
                                    receiveOrClosedTakeFirstReceiveOrPeekClosed.completeResumeReceive(objTryResumeReceive);
                                }
                            }
                        }
                        this.subLock.unlock();
                        break;
                    }
                    this.subLock.unlock();
                } catch (java.lang.Throwable th) {
                    this.subLock.unlock();
                    throw th;
                }
            }
            if (closed != null) {
                close(closed.closeCause);
            }
            return z;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollInternal() {
            boolean z;
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                java.lang.Object objPeekUnderLock = peekUnderLock();
                if ((objPeekUnderLock instanceof kotlinx.coroutines.channels.Closed) || objPeekUnderLock == kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    z = false;
                } else {
                    this.subHead++;
                    z = true;
                }
                reentrantLock.unlock();
                kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) (!(objPeekUnderLock instanceof kotlinx.coroutines.channels.Closed) ? null : objPeekUnderLock);
                if (closed != null) {
                    close(closed.closeCause);
                }
                if (checkOffer() ? true : z) {
                    kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, null, 3, null);
                }
                return objPeekUnderLock;
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> select) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.subLock;
            reentrantLock.lock();
            try {
                java.lang.Object objPeekUnderLock = peekUnderLock();
                boolean z = false;
                if (!(objPeekUnderLock instanceof kotlinx.coroutines.channels.Closed) && objPeekUnderLock != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    if (!select.trySelect(null)) {
                        objPeekUnderLock = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
                    } else {
                        this.subHead++;
                        z = true;
                    }
                }
                reentrantLock.unlock();
                kotlinx.coroutines.channels.Closed closed = (kotlinx.coroutines.channels.Closed) (!(objPeekUnderLock instanceof kotlinx.coroutines.channels.Closed) ? null : objPeekUnderLock);
                if (closed != null) {
                    close(closed.closeCause);
                }
                if (checkOffer() ? true : z) {
                    kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(this.broadcastChannel, null, null, 3, null);
                }
                return objPeekUnderLock;
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        private final boolean needsToCheckOfferWithoutLock() {
            if (getClosedForReceive() != null) {
                return false;
            }
            return (isBufferEmpty() && this.broadcastChannel.getClosedForReceive() == null) ? false : true;
        }

        private final java.lang.Object peekUnderLock() {
            long j = this.subHead;
            kotlinx.coroutines.channels.Closed<?> closedForReceive = this.broadcastChannel.getClosedForReceive();
            if (j >= ((kotlinx.coroutines.channels.ArrayBroadcastChannel) this.broadcastChannel).tail) {
                if (closedForReceive == null) {
                    closedForReceive = getClosedForReceive();
                }
                return closedForReceive != null ? closedForReceive : kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
            }
            java.lang.Object objElementAt = this.broadcastChannel.elementAt(j);
            kotlinx.coroutines.channels.Closed<?> closedForReceive2 = getClosedForReceive();
            return closedForReceive2 != null ? closedForReceive2 : objElementAt;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
        return "(buffer:capacity=" + this.buffer.length + ",size=" + this.size + ')';
    }
}
