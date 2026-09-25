package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0014\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/channels/Send;", "pollResult", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "token", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "idempotent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class SendElement extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.channels.Send {
    public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
    private final java.lang.Object pollResult;

    @Override // kotlinx.coroutines.channels.Send
    public java.lang.Object getPollResult() {
        return this.pollResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendElement(java.lang.Object obj, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cont) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cont, "cont");
        this.pollResult = obj;
        this.cont = cont;
    }

    @Override // kotlinx.coroutines.channels.Send
    public java.lang.Object tryResumeSend(java.lang.Object idempotent) {
        return this.cont.tryResume(kotlin.Unit.INSTANCE, idempotent);
    }

    @Override // kotlinx.coroutines.channels.Send
    public void completeResumeSend(java.lang.Object token) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(token, "token");
        this.cont.completeResume(token);
    }

    @Override // kotlinx.coroutines.channels.Send
    /* JADX INFO: renamed from: resumeSendClosed */
    public void mo1404resumeSendClosed(kotlinx.coroutines.channels.Closed<?> closed) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(closed, "closed");
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = this.cont;
        java.lang.Throwable sendException = closed.getSendException();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(sendException)));
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
        return "SendElement(" + getPollResult() + ")[" + this.cont + ']';
    }
}
