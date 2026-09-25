package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "()V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class LinkedListChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferAlwaysFull() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferEmpty() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E element) {
        kotlinx.coroutines.channels.ReceiveOrClosed<?> receiveOrClosedSendBuffered;
        do {
            java.lang.Object objOfferInternal = super.offerInternal(element);
            if (objOfferInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS) {
                return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
            }
            if (objOfferInternal == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED) {
                receiveOrClosedSendBuffered = sendBuffered(element);
                if (receiveOrClosedSendBuffered == null) {
                    return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
                }
            } else {
                if (objOfferInternal instanceof kotlinx.coroutines.channels.Closed) {
                    return objOfferInternal;
                }
                throw new java.lang.IllegalStateException(("Invalid offerInternal result " + objOfferInternal).toString());
            }
        } while (!(receiveOrClosedSendBuffered instanceof kotlinx.coroutines.channels.Closed));
        return receiveOrClosedSendBuffered;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        java.lang.Object objPerformAtomicTrySelect;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        do {
            if (getHasReceiveOrClosed()) {
                objPerformAtomicTrySelect = super.offerSelectInternal(element, select);
            } else {
                objPerformAtomicTrySelect = select.performAtomicTrySelect(describeSendBuffered(element));
                if (objPerformAtomicTrySelect == null) {
                    objPerformAtomicTrySelect = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
                }
            }
            if (objPerformAtomicTrySelect == kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()) {
                return kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED();
            }
            if (objPerformAtomicTrySelect == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS) {
                return kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS;
            }
        } while (objPerformAtomicTrySelect == kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED);
        if (objPerformAtomicTrySelect instanceof kotlinx.coroutines.channels.Closed) {
            return objPerformAtomicTrySelect;
        }
        throw new java.lang.IllegalStateException(("Invalid result " + objPerformAtomicTrySelect).toString());
    }
}
