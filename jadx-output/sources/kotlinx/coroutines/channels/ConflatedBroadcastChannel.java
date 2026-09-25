package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004?@ABB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J=\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d\u0018\u00010\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002J\"\u0010'\u001a\u00020&2\u0018\u0010(\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020&0)j\u0002`*H\u0016J\u0012\u0010+\u001a\u00020&2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0015\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u0017\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00101J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0016JV\u00104\u001a\u00020&\"\u0004\b\u0001\u001052\f\u00106\u001a\b\u0012\u0004\u0012\u0002H5072\u0006\u0010-\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50:\u0012\u0006\u0012\u0004\u0018\u00010\b09H\u0002ø\u0001\u0000¢\u0006\u0002\u0010;J=\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d\u0018\u00010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0002\u0010 J\u0019\u0010=\u001a\u00020&2\u0006\u0010-\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010>R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "value", "(Ljava/lang/Object;)V", "()V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_updating", "Lkotlinx/atomicfu/AtomicInt;", "isClosedForSend", "", "()Z", "isFull", "onCloseHandler", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "value$annotations", "getValue", "()Ljava/lang/Object;", "valueOrNull", "valueOrNull$annotations", "getValueOrNull", "addSubscriber", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "list", "subscriber", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "cancel", "cause", "", "close", "closeSubscriber", "", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "invokeOnCloseHandler", "offer", "element", "(Ljava/lang/Object;)Z", "offerInternal", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "registerSelectSend", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeSubscriber", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Closed", "Companion", "State", "Subscriber", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ConflatedBroadcastChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<java.lang.Object> INITIAL_STATE;
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _updating$FU;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU;
    private volatile java.lang.Object _state;
    private volatile int _updating;
    private volatile java.lang.Object onCloseHandler;
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion Companion = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion(null);
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed CLOSED = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed(null);

    public static /* synthetic */ void value$annotations() {
    }

    public static /* synthetic */ void valueOrNull$annotations() {
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isFull() {
        return false;
    }

    public ConflatedBroadcastChannel() {
        this._state = INITIAL_STATE;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public ConflatedBroadcastChannel(E e) {
        this();
        _state$FU.lazySet(this, new kotlinx.coroutines.channels.ConflatedBroadcastChannel.State(e, null));
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Companion;", "", "()V", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "CLOSED$annotations", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED$annotations", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Companion {
        private static /* synthetic */ void CLOSED$annotations() {
        }

        private static /* synthetic */ void UNDEFINED$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlinx.coroutines.internal.Symbol symbol = new kotlinx.coroutines.internal.Symbol("UNDEFINED");
        UNDEFINED = symbol;
        INITIAL_STATE = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<>(symbol, null);
        _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.ConflatedBroadcastChannel.class, java.lang.Object.class, "_state");
        _updating$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.channels.ConflatedBroadcastChannel.class, "_updating");
        onCloseHandler$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.ConflatedBroadcastChannel.class, java.lang.Object.class, "onCloseHandler");
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "E", "", "value", "subscribers", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class State<E> {
        public final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscribers;
        public final java.lang.Object value;

        public State(java.lang.Object obj, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr) {
            this.value = obj;
            this.subscribers = subscriberArr;
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "", "closeCause", "", "(Ljava/lang/Throwable;)V", "sendException", "getSendException", "()Ljava/lang/Throwable;", "valueException", "getValueException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Closed {
        public final java.lang.Throwable closeCause;

        public Closed(java.lang.Throwable th) {
            this.closeCause = th;
        }

        public final java.lang.Throwable getSendException() {
            java.lang.Throwable th = this.closeCause;
            return th != null ? th : new kotlinx.coroutines.channels.ClosedSendChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }

        public final java.lang.Throwable getValueException() {
            java.lang.Throwable th = this.closeCause;
            return th != null ? th : new java.lang.IllegalStateException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
    }

    public final E getValueOrNull() {
        java.lang.Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) {
            return null;
        }
        if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.State state = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj;
            if (state.value == UNDEFINED) {
                return null;
            }
            return (E) state.value;
        }
        throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._state instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        java.lang.Object obj;
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.State state;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber subscriber = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber(this);
        do {
            obj = this._state;
            if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) {
                subscriber.close(((kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) obj).closeCause);
                return subscriber;
            }
            if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) {
                state = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj;
                if (state.value != UNDEFINED) {
                    subscriber.offerInternal(state.value);
                }
                obj2 = state.value;
                if (obj != null) {
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } else {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!_state$FU.compareAndSet(this, obj, new kotlinx.coroutines.channels.ConflatedBroadcastChannel.State(obj2, addSubscriber(state.subscribers, subscriber))));
        return subscriber;
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] addSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] list, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> subscriber) {
        if (list != null) {
            return (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[]) kotlin.collections.ArraysKt.plus(list, subscriber);
        }
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[1];
        for (int i = 0; i < 1; i++) {
            subscriberArr[i] = subscriber;
        }
        return subscriberArr;
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] removeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] list, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> subscriber) {
        int length = list.length;
        int iIndexOf = kotlin.collections.ArraysKt.indexOf(list, subscriber);
        if (!(iIndexOf >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (length == 1) {
            return null;
        }
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[length - 1];
        kotlinx.coroutines.internal.ArrayCopyKt.arraycopy(list, 0, subscriberArr, 0, iIndexOf);
        kotlinx.coroutines.internal.ArrayCopyKt.arraycopy(list, iIndexOf + 1, subscriberArr, iIndexOf, (length - iIndexOf) - 1);
        return subscriberArr;
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
        java.lang.Object obj2 = this._state;
        if ((obj2 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) && atomicReferenceFieldUpdater.compareAndSet(this, handler, kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED)) {
            handler.invoke(((kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) obj2).closeCause);
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public boolean cancel(java.lang.Throwable cause) {
        return close(cause);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed closedOfferInternal = offerInternal(e);
        if (closedOfferInternal != null) {
            throw closedOfferInternal.getSendException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(E element) throws java.lang.Throwable {
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed closedOfferInternal = offerInternal(element);
        if (closedOfferInternal == null) {
            return true;
        }
        throw closedOfferInternal.getSendException();
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed offerInternal(E element) {
        java.lang.Object obj;
        if (!_updating$FU.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (!(obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed)) {
                    if (!(obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State)) {
                        throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
                    }
                    if (obj == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                    }
                } else {
                    kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed closed = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) obj;
                    this._updating = 0;
                    return closed;
                }
            } catch (java.lang.Throwable th) {
                this._updating = 0;
                throw th;
            }
        } while (!_state$FU.compareAndSet(this, obj, new kotlinx.coroutines.channels.ConflatedBroadcastChannel.State(element, ((kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj).subscribers)));
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr = ((kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj).subscribers;
        if (subscriberArr != null) {
            for (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> subscriber : subscriberArr) {
                subscriber.offerInternal(element);
            }
        }
        this._updating = 0;
        return null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
        return new kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<? super E>>() { // from class: kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1
            @Override // kotlinx.coroutines.selects.SelectClause2
            public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> select, E param, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
                this.this$0.registerSelectSend(select, param, block);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> select, E element, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        if (select.trySelect(null)) {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed closedOfferInternal = offerInternal(element);
            if (closedOfferInternal != null) {
                select.resumeSelectCancellableWithException(closedOfferInternal.getSendException());
            } else {
                kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, this, select.getCompletion());
            }
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;)V", "cancel", "", "cause", "", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.ConflatedChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> broadcastChannel;

        public Subscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> broadcastChannel) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(broadcastChannel, "broadcastChannel");
            this.broadcastChannel = broadcastChannel;
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
        public boolean cancel(java.lang.Throwable cause) {
            boolean zClose = close(cause);
            if (zClose) {
                this.broadcastChannel.closeSubscriber(this);
            }
            return zClose;
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractSendChannel
        public java.lang.Object offerInternal(E element) {
            return super.offerInternal(element);
        }
    }

    public final E getValue() throws java.lang.Throwable {
        java.lang.Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) {
            throw ((kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) obj).getValueException();
        }
        if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.State state = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj;
            if (state.value == UNDEFINED) {
                throw new java.lang.IllegalStateException("No value");
            }
            return (E) state.value;
        }
        throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> subscriber) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr;
        do {
            obj = this._state;
            if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) {
                return;
            }
            if (!(obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.State state = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj;
            obj2 = state.value;
            if (obj != null) {
                subscriberArr = state.subscribers;
                if (subscriberArr == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
            }
        } while (!_state$FU.compareAndSet(this, obj, new kotlinx.coroutines.channels.ConflatedBroadcastChannel.State(obj2, removeSubscriber(subscriberArr, subscriber))));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        java.lang.Object obj;
        int i;
        do {
            obj = this._state;
            if (obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) {
                return false;
            }
            if (!(obj instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State)) {
                throw new java.lang.IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!_state$FU.compareAndSet(this, obj, cause == null ? CLOSED : new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed(cause)));
        if (obj != null) {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscriberArr = ((kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) obj).subscribers;
            if (subscriberArr != null) {
                for (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> subscriber : subscriberArr) {
                    subscriber.close(cause);
                }
            }
            invokeOnCloseHandler(cause);
            return true;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
    }
}
