package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0004BCDEB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0019\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0086\bJ-\u0010\u001c\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001eH\u0086\bJ=\u0010\u001f\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001e2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0086\bJ \u0010 \u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010!\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ&\u0010\"\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J'\u0010%\u001a\b\u0012\u0004\u0012\u0002H'0&\"\f\b\u0000\u0010'*\u00060\u0000j\u0002`\u000f2\u0006\u0010\u0018\u001a\u0002H'¢\u0006\u0002\u0010(J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000f0,J\f\u0010-\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010.\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010/\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00100\u001a\u00020\u0017H\u0001J\u0006\u00101\u001a\u00020\u0017J%\u00102\u001a\u0002032\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0081\bJ\f\u00104\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\rJ,\u00107\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u00020\t0\u001eH\u0086\b¢\u0006\u0002\u00108J\u000e\u00109\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fJ\b\u0010:\u001a\u00020\u0007H\u0002J\b\u0010;\u001a\u00020<H\u0016J(\u0010=\u001a\u00020>2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010?\u001a\u000203H\u0001J%\u0010@\u001a\u00020\u00172\n\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\bAR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006F"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prev", "getPrev", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addLastIfPrev", "predicate", "Lkotlin/Function1;", "addLastIfPrevAndIf", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "describeAddLast", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "T", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeRemove", "Lkotlinx/coroutines/internal/AtomicDesc;", "describeRemoveFirst", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", "remove", "removeFirstIfIsInstanceOf", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "validateNode$kotlinx_coroutines_core", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class LockFreeLinkedListNode {
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_next");
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_prev");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_removedRef");
    volatile java.lang.Object _next = this;
    volatile java.lang.Object _prev = this;
    private volatile java.lang.Object _removedRef = null;

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.internal.Removed removed() {
        kotlinx.coroutines.internal.Removed removed = (kotlinx.coroutines.internal.Removed) this._removedRef;
        if (removed != null) {
            return removed;
        }
        kotlinx.coroutines.internal.Removed removed2 = new kotlinx.coroutines.internal.Removed(this);
        _removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode newNode) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object failure) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            boolean z = failure == null;
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null && kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(affected, this, lockFreeLinkedListNode) && z) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                if (lockFreeLinkedListNode3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class C02621 extends kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp {
        final /* synthetic */ kotlin.jvm.functions.Function0 $condition;
        final /* synthetic */ kotlinx.coroutines.internal.LockFreeLinkedListNode $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02621(kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode, kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2) {
            super(lockFreeLinkedListNode2);
            this.$condition = function0;
            this.$node = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            if (((java.lang.Boolean) this.$condition.invoke()).booleanValue()) {
                return null;
            }
            return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(condition, "condition");
        return new kotlinx.coroutines.internal.LockFreeLinkedListNode.C02621(condition, node, node);
    }

    public final boolean isRemoved() {
        return getNext() instanceof kotlinx.coroutines.internal.Removed;
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
        return kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(getNext());
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
        return kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(getPrev());
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            if (_next$FU.compareAndSet(this, this, node)) {
                node.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void addLast(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        java.lang.Object prev;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        do {
            prev = getPrev();
            if (prev == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!((kotlinx.coroutines.internal.LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final <T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<T> describeAddLast(T node) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        return new kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<>(this, node);
    }

    public final boolean addLastIfPrev(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> predicate) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        do {
            java.lang.Object prev = getPrev();
            if (prev == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addNext(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
            return false;
        }
        node.finishAdd(next);
        return true;
    }

    public final int tryCondAddNext(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlinx.coroutines.internal.LockFreeLinkedListNode next, kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAdd) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
            return condAdd.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean remove() {
        java.lang.Object next;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if ((next instanceof kotlinx.coroutines.internal.Removed) || next == this) {
                return false;
            }
            if (next != null) {
                lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!_next$FU.compareAndSet(this, next, lockFreeLinkedListNode.removed()));
        finishRemove(lockFreeLinkedListNode);
        return true;
    }

    public final void helpRemove() {
        java.lang.Object next = getNext();
        if (!(next instanceof kotlinx.coroutines.internal.Removed)) {
            next = null;
        }
        kotlinx.coroutines.internal.Removed removed = (kotlinx.coroutines.internal.Removed) next;
        if (removed == null) {
            throw new java.lang.IllegalStateException("Must be invoked on a removed node".toString());
        }
        finishRemove(removed.ref);
    }

    /* JADX INFO: renamed from: describeRemove */
    public kotlinx.coroutines.internal.AtomicDesc mo1405describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc() { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.describeRemove.1
            private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.AnonymousClass1.class, java.lang.Object.class, "_originalNext");
            private volatile java.lang.Object _originalNext = null;

            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* JADX INFO: renamed from: getAffectedNode, reason: from getter */
            protected kotlinx.coroutines.internal.LockFreeLinkedListNode getThis$0() {
                return kotlinx.coroutines.internal.LockFreeLinkedListNode.this;
            }

            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* JADX INFO: renamed from: getOriginalNext */
            protected kotlinx.coroutines.internal.LockFreeLinkedListNode getQueue() {
                return (kotlinx.coroutines.internal.LockFreeLinkedListNode) this._originalNext;
            }

            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
                if (next instanceof kotlinx.coroutines.internal.Removed) {
                    return kotlinx.coroutines.internal.LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
                _originalNext$FU.compareAndSet(this, null, next);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public kotlinx.coroutines.internal.Removed updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
                return next.removed();
            }

            @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
                kotlinx.coroutines.internal.LockFreeLinkedListNode.this.finishRemove(next);
            }
        };
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            java.lang.Object next = getNext();
            if (next == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.internal.LockFreeLinkedListNode> describeRemoveFirst() {
        return new kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<>(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    private final <T> T removeFirstIfIsInstanceOf() {
        while (true) {
            java.lang.Object next = getNext();
            if (next == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            ?? r0 = (T) ((kotlinx.coroutines.internal.LockFreeLinkedListNode) next);
            if (r0 == this) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (!(r0 instanceof java.lang.Object)) {
                return null;
            }
            if (r0.remove()) {
                return r0;
            }
            r0.helpDelete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    private final <T> T removeFirstIfIsInstanceOfOrPeekIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        while (true) {
            java.lang.Object next = getNext();
            if (next == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (!(lockFreeLinkedListNode instanceof java.lang.Object)) {
                return null;
            }
            if (predicate.invoke(lockFreeLinkedListNode).booleanValue() || lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0019\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u0015H\u0014J\u0014\u0010\u0018\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J \u0010\u001b\u001a\u00020\u00152\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "_affectedNode", "Lkotlinx/atomicfu/AtomicRef;", "affectedNode", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "finishOnSuccess", "", "affected", "next", "onPrepare", "", "retry", "", "takeAffectedNode", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static class AddLastDesc<T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc.class, java.lang.Object.class, "_affectedNode");
        private volatile java.lang.Object _affectedNode;
        public final T node;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        public AddLastDesc(kotlinx.coroutines.internal.LockFreeLinkedListNode queue, T node) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
            this.queue = queue;
            this.node = node;
            if (!(node._next == node && node._prev == node)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            this._affectedNode = null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            while (true) {
                java.lang.Object obj = this.queue._prev;
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                java.lang.Object obj2 = lockFreeLinkedListNode._next;
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 == lockFreeLinkedListNode2 || obj2 == op) {
                    return lockFreeLinkedListNode;
                }
                if (!(obj2 instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                    kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, op);
                    if (lockFreeLinkedListNodeCorrectPrev != null) {
                        return lockFreeLinkedListNodeCorrectPrev;
                    }
                } else {
                    ((kotlinx.coroutines.internal.OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                }
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getAffectedNode */
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getThis$0() {
            return (kotlinx.coroutines.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getOriginalNext, reason: from getter */
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return next != this.queue;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            _affectedNode$FU.compareAndSet(this, null, affected);
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU.compareAndSet(this.node, this.node, affected);
            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(this.node, this.node, this.queue);
            return this.node;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            this.node.finishAdd(this.queue);
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0014J \u0010\u0018\u001a\u00020\u00192\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0004J\u0014\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J \u0010 \u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010#R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "_affectedNode", "Lkotlinx/atomicfu/AtomicRef;", "_originalNext", "affectedNode", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "result", "result$annotations", "()V", "getResult", "()Ljava/lang/Object;", "failure", "", "affected", "next", "finishOnSuccess", "", "onPrepare", "retry", "", "takeAffectedNode", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "validatePrepared", "node", "(Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static class RemoveFirstDesc<T> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_affectedNode");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_originalNext");
        private volatile java.lang.Object _affectedNode;
        private volatile java.lang.Object _originalNext;
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode queue;

        public static /* synthetic */ void result$annotations() {
        }

        protected boolean validatePrepared(T node) {
            return true;
        }

        public RemoveFirstDesc(kotlinx.coroutines.internal.LockFreeLinkedListNode queue) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public final T getResult() {
            java.lang.Object this$0 = getThis$0();
            if (this$0 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return (T) this$0;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            java.lang.Object next = this.queue.getNext();
            if (next != null) {
                return (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getAffectedNode */
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getThis$0() {
            return (kotlinx.coroutines.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getOriginalNext */
        protected final kotlinx.coroutines.internal.LockFreeLinkedListNode getQueue() {
            return (kotlinx.coroutines.internal.LockFreeLinkedListNode) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (affected == this.queue) {
                return kotlinx.coroutines.internal.LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (!(next instanceof kotlinx.coroutines.internal.Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            if (!(!(affected instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead))) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!validatePrepared(affected)) {
                return kotlinx.coroutines.internal.LockFreeLinkedListKt.REMOVE_PREPARED;
            }
            _affectedNode$FU.compareAndSet(this, null, affected);
            _originalNext$FU.compareAndSet(this, null, next);
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return next.removed();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            affected.finishRemove(next);
        }
    }

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J \u0010\u0012\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J\u0014\u0010\u0017\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0018H\u0014J \u0010\u0019\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "()V", "affectedNode", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "getAffectedNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "failure", "", "affected", "next", "finishOnSuccess", "onPrepare", "prepare", "retry", "", "takeAffectedNode", "Lkotlinx/coroutines/internal/OpDescriptor;", "updatedNext", "PrepareOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static abstract class AbstractAtomicDesc extends kotlinx.coroutines.internal.AtomicDesc {
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return null;
        }

        protected abstract void finishOnSuccess(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next);

        /* JADX INFO: renamed from: getAffectedNode */
        protected abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getThis$0();

        /* JADX INFO: renamed from: getOriginalNext */
        protected abstract kotlinx.coroutines.internal.LockFreeLinkedListNode getQueue();

        protected abstract java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next);

        protected boolean retry(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
            return false;
        }

        protected abstract java.lang.Object updatedNext(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, kotlinx.coroutines.internal.LockFreeLinkedListNode next);

        protected kotlinx.coroutines.internal.LockFreeLinkedListNode takeAffectedNode(kotlinx.coroutines.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            kotlinx.coroutines.internal.LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return this$0;
        }

        /* JADX INFO: compiled from: LockFreeLinkedList.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "next", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "op", "Lkotlinx/coroutines/internal/AtomicOp;", "desc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/AtomicOp;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "perform", "", "affected", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
        private static final class PrepareOp extends kotlinx.coroutines.internal.OpDescriptor {
            public final kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc;
            public final kotlinx.coroutines.internal.LockFreeLinkedListNode next;
            public final kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(kotlinx.coroutines.internal.LockFreeLinkedListNode next, kotlinx.coroutines.internal.AtomicOp<? super kotlinx.coroutines.internal.LockFreeLinkedListNode> op, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
                this.next = next;
                this.op = op;
                this.desc = desc;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object affected) {
                if (affected != null) {
                    kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) affected;
                    java.lang.Object objOnPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                    if (objOnPrepare != null) {
                        if (objOnPrepare == kotlinx.coroutines.internal.LockFreeLinkedListKt.REMOVE_PREPARED) {
                            if (kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(lockFreeLinkedListNode, this, this.next.removed())) {
                                lockFreeLinkedListNode.helpDelete();
                            }
                        } else {
                            this.op.tryDecide(objOnPrepare);
                            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(lockFreeLinkedListNode, this, this.next);
                        }
                        return objOnPrepare;
                    }
                    kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(lockFreeLinkedListNode, this, this.op.isDecided() ? this.next : this.op);
                    return null;
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public final java.lang.Object prepare(kotlinx.coroutines.internal.AtomicOp<?> op) {
            java.lang.Object objPerform;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            while (true) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNodeTakeAffectedNode = takeAffectedNode(op);
                java.lang.Object obj = lockFreeLinkedListNodeTakeAffectedNode._next;
                if (obj == op || op.isDecided()) {
                    return null;
                }
                if (obj instanceof kotlinx.coroutines.internal.OpDescriptor) {
                    ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(lockFreeLinkedListNodeTakeAffectedNode);
                } else {
                    java.lang.Object objFailure = failure(lockFreeLinkedListNodeTakeAffectedNode, obj);
                    if (objFailure != null) {
                        return objFailure;
                    }
                    if (retry(lockFreeLinkedListNodeTakeAffectedNode, obj)) {
                        continue;
                    } else if (obj != null) {
                        kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp prepareOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp((kotlinx.coroutines.internal.LockFreeLinkedListNode) obj, op, this);
                        if (kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(lockFreeLinkedListNodeTakeAffectedNode, obj, prepareOp) && (objPerform = prepareOp.perform(lockFreeLinkedListNodeTakeAffectedNode)) != kotlinx.coroutines.internal.LockFreeLinkedListKt.REMOVE_PREPARED) {
                            return objPerform;
                        }
                    } else {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public final void complete(kotlinx.coroutines.internal.AtomicOp<?> op, java.lang.Object failure) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(op, "op");
            boolean z = failure == null;
            kotlinx.coroutines.internal.LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (!(!z)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                return;
            }
            kotlinx.coroutines.internal.LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (!(!z)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
            } else {
                if (kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU.compareAndSet(this$0, op, z ? updatedNext(this$0, queue) : queue) && z) {
                    finishOnSuccess(this$0, queue);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemove(kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        helpDelete();
        next.correctPrev(kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findHead() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = this;
        kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = lockFreeLinkedListNode;
        while (!(nextNode instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead)) {
            nextNode = nextNode.getNextNode();
            if (!(nextNode != lockFreeLinkedListNode)) {
                throw new java.lang.IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return nextNode;
    }

    public final void helpDelete() {
        java.lang.Object next;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) null;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNodeMarkPrev = markPrev();
        java.lang.Object obj = this._next;
        if (obj == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = ((kotlinx.coroutines.internal.Removed) obj).ref;
        while (true) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
            while (true) {
                java.lang.Object next2 = lockFreeLinkedListNode2.getNext();
                if (next2 instanceof kotlinx.coroutines.internal.Removed) {
                    lockFreeLinkedListNode2.markPrev();
                    lockFreeLinkedListNode2 = ((kotlinx.coroutines.internal.Removed) next2).ref;
                } else {
                    next = lockFreeLinkedListNodeMarkPrev.getNext();
                    if (next instanceof kotlinx.coroutines.internal.Removed) {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        } else {
                            lockFreeLinkedListNodeMarkPrev = kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(lockFreeLinkedListNodeMarkPrev._prev);
                        }
                    } else if (next != this) {
                        if (next == null) {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
                        if (lockFreeLinkedListNode4 == lockFreeLinkedListNode2) {
                            return;
                        }
                        lockFreeLinkedListNode3 = lockFreeLinkedListNodeMarkPrev;
                        lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode4;
                    } else if (_next$FU.compareAndSet(lockFreeLinkedListNodeMarkPrev, this, lockFreeLinkedListNode2)) {
                        return;
                    }
                }
            }
            lockFreeLinkedListNodeMarkPrev.markPrev();
            _next$FU.compareAndSet(lockFreeLinkedListNode3, lockFreeLinkedListNodeMarkPrev, ((kotlinx.coroutines.internal.Removed) next).ref);
            lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.LockFreeLinkedListNode _prev, kotlinx.coroutines.internal.OpDescriptor op) {
        java.lang.Object obj;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) null;
        while (true) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                obj = _prev._next;
                if (obj == op) {
                    return _prev;
                }
                if (obj instanceof kotlinx.coroutines.internal.OpDescriptor) {
                    ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(_prev);
                } else if (!(obj instanceof kotlinx.coroutines.internal.Removed)) {
                    java.lang.Object obj2 = this._prev;
                    if (obj2 instanceof kotlinx.coroutines.internal.Removed) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj == null) {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                        lockFreeLinkedListNode2 = _prev;
                        _prev = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        if (_prev$FU.compareAndSet(this, obj2, _prev) && !(_prev._prev instanceof kotlinx.coroutines.internal.Removed)) {
                            return null;
                        }
                    }
                } else {
                    if (lockFreeLinkedListNode2 != null) {
                        break;
                    }
                    _prev = kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(_prev._prev);
                }
            }
            _prev.markPrev();
            _next$FU.compareAndSet(lockFreeLinkedListNode2, _prev, ((kotlinx.coroutines.internal.Removed) obj).ref);
            _prev = lockFreeLinkedListNode2;
        }
    }

    public final void validateNode$kotlinx_coroutines_core(kotlinx.coroutines.internal.LockFreeLinkedListNode prev, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(prev, "prev");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(next, "next");
        if (!(prev == this._prev)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!(next == this._next)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
    }

    public final java.lang.Object getNext() {
        while (true) {
            java.lang.Object obj = this._next;
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }

    public final java.lang.Object getPrev() {
        while (true) {
            java.lang.Object obj = this._prev;
            if (obj instanceof kotlinx.coroutines.internal.Removed) {
                return obj;
            }
            if (obj != null) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                if (lockFreeLinkedListNode.getNext() == this) {
                    return obj;
                }
                correctPrev(lockFreeLinkedListNode, null);
            } else {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public final boolean addLastIf(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        int iTryCondAddNext;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(condition, "condition");
        kotlinx.coroutines.internal.LockFreeLinkedListNode.C02621 c02621 = new kotlinx.coroutines.internal.LockFreeLinkedListNode.C02621(condition, node, node);
        do {
            java.lang.Object prev = getPrev();
            if (prev == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            iTryCondAddNext = ((kotlinx.coroutines.internal.LockFreeLinkedListNode) prev).tryCondAddNext(node, this, c02621);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrevAndIf(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, java.lang.Boolean> predicate, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        int iTryCondAddNext;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(condition, "condition");
        kotlinx.coroutines.internal.LockFreeLinkedListNode.C02621 c02621 = new kotlinx.coroutines.internal.LockFreeLinkedListNode.C02621(condition, node, node);
        do {
            java.lang.Object prev = getPrev();
            if (prev == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
            iTryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, c02621);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        java.lang.Object obj;
        do {
            obj = next._prev;
            if ((obj instanceof kotlinx.coroutines.internal.Removed) || getNext() != next) {
                return;
            }
        } while (!_prev$FU.compareAndSet(next, obj, this));
        if (getNext() instanceof kotlinx.coroutines.internal.Removed) {
            if (obj == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            next.correctPrev((kotlinx.coroutines.internal.LockFreeLinkedListNode) obj, null);
        }
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode markPrev() {
        java.lang.Object obj;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNodeFindHead;
        do {
            obj = this._prev;
            if (obj instanceof kotlinx.coroutines.internal.Removed) {
                return ((kotlinx.coroutines.internal.Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNodeFindHead = findHead();
            } else {
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
                lockFreeLinkedListNodeFindHead = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
            }
        } while (!_prev$FU.compareAndSet(this, obj, lockFreeLinkedListNodeFindHead.removed()));
        return (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
    }
}
