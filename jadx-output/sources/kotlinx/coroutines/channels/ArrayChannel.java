package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00028\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0014¢\u0006\u0002\u0010#J\n\u0010$\u001a\u0004\u0018\u00010\bH\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0014R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0012\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "getCapacity", "()I", "head", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "size", "cleanupSendQueueOnCancel", "", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "pollInternal", "pollSelectInternal", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class ArrayChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    private final java.lang.Object[] buffer;
    private final int capacity;
    private int head;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private volatile int size;

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferAlwaysFull() {
        return false;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public ArrayChannel(int i) {
        this.capacity = i;
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
        }
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.buffer = new java.lang.Object[i];
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferEmpty() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
        return this.size == this.capacity;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.size;
            kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            if (i < this.capacity) {
                this.size = i + 1;
                if (i == 0) {
                    while (true) {
                        kotlinx.coroutines.channels.ReceiveOrClosed<E> receiveOrClosedTakeFirstReceiveOrPeekClosed = takeFirstReceiveOrPeekClosed();
                        if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                            break;
                        }
                        if (receiveOrClosedTakeFirstReceiveOrPeekClosed instanceof kotlinx.coroutines.channels.Closed) {
                            this.size = i;
                            if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            reentrantLock.unlock();
                            return receiveOrClosedTakeFirstReceiveOrPeekClosed;
                        }
                        if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        java.lang.Object objTryResumeReceive = receiveOrClosedTakeFirstReceiveOrPeekClosed.tryResumeReceive(element, null);
                        if (objTryResumeReceive != null) {
                            this.size = i;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            reentrantLock.unlock();
                            if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            receiveOrClosedTakeFirstReceiveOrPeekClosed.completeResumeReceive(objTryResumeReceive);
                            if (receiveOrClosedTakeFirstReceiveOrPeekClosed == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            return receiveOrClosedTakeFirstReceiveOrPeekClosed.getOfferResult();
                        }
                    }
                }
                this.buffer[(this.head + i) % this.capacity] = element;
                java.lang.Object obj = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
                reentrantLock.unlock();
                return obj;
            }
            java.lang.Object obj2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
            reentrantLock.unlock();
            return obj2;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.size;
            kotlinx.coroutines.channels.Closed<?> closedForSend = getClosedForSend();
            if (closedForSend != null) {
                reentrantLock.unlock();
                return closedForSend;
            }
            if (i < this.capacity) {
                this.size = i + 1;
                if (i == 0) {
                    kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> tryOfferDescDescribeTryOffer = describeTryOffer(element);
                    java.lang.Object objPerformAtomicTrySelect = select.performAtomicTrySelect(tryOfferDescDescribeTryOffer);
                    if (objPerformAtomicTrySelect == null) {
                        this.size = i;
                        kotlinx.coroutines.channels.ReceiveOrClosed<? super E> result = tryOfferDescDescribeTryOffer.getResult();
                        java.lang.Object obj = tryOfferDescDescribeTryOffer.resumeToken;
                        if (!(obj != null)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        reentrantLock.unlock();
                        if (result == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        if (obj == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        result.completeResumeReceive(obj);
                        if (result == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        return result.getOfferResult();
                    }
                    if (objPerformAtomicTrySelect != kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED) {
                        if (objPerformAtomicTrySelect != kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED() && !(objPerformAtomicTrySelect instanceof kotlinx.coroutines.channels.Closed)) {
                            throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objPerformAtomicTrySelect).toString());
                        }
                        this.size = i;
                        reentrantLock.unlock();
                        return objPerformAtomicTrySelect;
                    }
                }
                if (!select.trySelect(null)) {
                    this.size = i;
                    java.lang.Object already_selected = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
                    reentrantLock.unlock();
                    return already_selected;
                }
                this.buffer[(this.head + i) % this.capacity] = element;
                java.lang.Object obj2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
                reentrantLock.unlock();
                return obj2;
            }
            java.lang.Object obj3 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED;
            reentrantLock.unlock();
            return obj3;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollInternal() {
        java.lang.Object obj = null;
        kotlinx.coroutines.channels.Send send = (kotlinx.coroutines.channels.Send) null;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                java.lang.Object closedForSend = getClosedForSend();
                if (closedForSend == null) {
                    closedForSend = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
                }
                return closedForSend;
            }
            java.lang.Object[] objArr = this.buffer;
            int i2 = this.head;
            java.lang.Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            java.lang.Object pollResult = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
            if (i == this.capacity) {
                java.lang.Object objTryResumeSend = null;
                while (true) {
                    kotlinx.coroutines.channels.Send sendTakeFirstSendOrPeekClosed = takeFirstSendOrPeekClosed();
                    if (sendTakeFirstSendOrPeekClosed == null) {
                        obj = objTryResumeSend;
                        break;
                    }
                    if (sendTakeFirstSendOrPeekClosed == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    objTryResumeSend = sendTakeFirstSendOrPeekClosed.tryResumeSend(null);
                    if (objTryResumeSend != null) {
                        if (sendTakeFirstSendOrPeekClosed == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        pollResult = sendTakeFirstSendOrPeekClosed.getPollResult();
                        obj = objTryResumeSend;
                        send = sendTakeFirstSendOrPeekClosed;
                        break;
                    }
                    send = sendTakeFirstSendOrPeekClosed;
                }
            }
            if (pollResult != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED && !(pollResult instanceof kotlinx.coroutines.channels.Closed)) {
                this.size = i;
                this.buffer[(this.head + i) % this.capacity] = pollResult;
            }
            this.head = (this.head + 1) % this.capacity;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (obj != null) {
                if (send == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                send.completeResumeSend(obj);
            }
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> select) {
        java.lang.Object objTryResumeSend;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlinx.coroutines.channels.Send result = (kotlinx.coroutines.channels.Send) null;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                java.lang.Object closedForSend = getClosedForSend();
                if (closedForSend == null) {
                    closedForSend = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
                }
                reentrantLock.unlock();
                return closedForSend;
            }
            java.lang.Object[] objArr = this.buffer;
            int i2 = this.head;
            java.lang.Object obj = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            java.lang.Object pollResult = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED;
            if (i == this.capacity) {
                kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<E> tryPollDescDescribeTryPoll = describeTryPoll();
                java.lang.Object objPerformAtomicTrySelect = select.performAtomicTrySelect(tryPollDescDescribeTryPoll);
                if (objPerformAtomicTrySelect == null) {
                    result = tryPollDescDescribeTryPoll.getResult();
                    java.lang.Object obj2 = tryPollDescDescribeTryPoll.resumeToken;
                    if (!(obj2 != null)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    if (result == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    objTryResumeSend = obj2;
                    pollResult = result.getPollResult();
                } else if (objPerformAtomicTrySelect == kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED) {
                    objTryResumeSend = null;
                } else {
                    if (objPerformAtomicTrySelect == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                        this.size = i;
                        this.buffer[this.head] = obj;
                        reentrantLock.unlock();
                        return objPerformAtomicTrySelect;
                    }
                    if (objPerformAtomicTrySelect instanceof kotlinx.coroutines.channels.Closed) {
                        result = (kotlinx.coroutines.channels.Send) objPerformAtomicTrySelect;
                        objTryResumeSend = ((kotlinx.coroutines.channels.Closed) objPerformAtomicTrySelect).tryResumeSend(null);
                        pollResult = objPerformAtomicTrySelect;
                    } else {
                        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objPerformAtomicTrySelect).toString());
                    }
                }
            } else {
                objTryResumeSend = null;
            }
            if (pollResult != kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED && !(pollResult instanceof kotlinx.coroutines.channels.Closed)) {
                this.size = i;
                this.buffer[(this.head + i) % this.capacity] = pollResult;
            } else if (!select.trySelect(null)) {
                this.size = i;
                this.buffer[this.head] = obj;
                java.lang.Object already_selected = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
                reentrantLock.unlock();
                return already_selected;
            }
            this.head = (this.head + 1) % this.capacity;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            if (objTryResumeSend != null) {
                if (result == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                result.completeResumeSend(objTryResumeSend);
            }
            return obj;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void cleanupSendQueueOnCancel() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int i = this.size;
            for (int i2 = 0; i2 < i; i2++) {
                this.buffer[this.head] = 0;
                this.head = (this.head + 1) % this.capacity;
            }
            this.size = 0;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            super.cleanupSendQueueOnCancel();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
        return "(buffer:capacity=" + this.buffer.length + ",size=" + this.size + ')';
    }
}
