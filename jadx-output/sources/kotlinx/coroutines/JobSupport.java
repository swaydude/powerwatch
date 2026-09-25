package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006¥\u0001¦\u0001§\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u0002002\n\u00101\u001a\u0006\u0012\u0002\b\u000302H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0002J\u0015\u00105\u001a\u0004\u0018\u00010\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u00107J\b\u00109\u001a\u00020:H\u0016J\u0012\u00109\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010=\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020'H\u0002J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020'H\u0016J*\u0010@\u001a\u00020:2\u0006\u0010#\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0002J\"\u0010E\u001a\u00020:2\u0006\u0010#\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010J\u001a\u00020'2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010K\u001a\u00020LH\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010#\u001a\u00020+H\u0002J\n\u0010N\u001a\u00060Oj\u0002`PJ\b\u0010Q\u001a\u00020'H\u0016J\u000f\u0010R\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\bSJ\n\u0010T\u001a\u0004\u0018\u00010'H\u0004J\b\u0010U\u001a\u0004\u0018\u00010'J \u0010V\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020F2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020'0XH\u0002J\u0012\u0010Y\u001a\u0004\u0018\u0001002\u0006\u0010#\u001a\u00020+H\u0002J\u0010\u0010Z\u001a\u00020:2\u0006\u0010[\u001a\u00020'H\u0014J\u0015\u0010\\\u001a\u00020:2\u0006\u0010[\u001a\u00020'H\u0010¢\u0006\u0002\b]J\u0017\u0010^\u001a\u00020:2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b`J?\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00062'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ/\u0010a\u001a\u00020b2'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ\u0011\u0010j\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0002\u00107J\b\u0010k\u001a\u00020\u0006H\u0002J\u0011\u0010l\u001a\u00020:H\u0082@ø\u0001\u0000¢\u0006\u0002\u00107J\u001f\u0010m\u001a\u00020n2\u0014\u0010o\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020:0fH\u0082\bJ\u0012\u0010p\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0017\u0010q\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\brJ\u001f\u0010s\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0000¢\u0006\u0002\btJ=\u0010u\u001a\u0006\u0012\u0002\b\u0003022'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`i2\u0006\u0010c\u001a\u00020\u0006H\u0002J\r\u0010v\u001a\u00020wH\u0010¢\u0006\u0002\bxJ\u0018\u0010y\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010;\u001a\u00020'H\u0002J+\u0010z\u001a\u00020:\"\u000e\b\u0000\u0010{\u0018\u0001*\u0006\u0012\u0002\b\u0003022\u0006\u0010/\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010'H\u0082\bJ\u0012\u0010|\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010'H\u0014J'\u0010}\u001a\u00020:2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0010¢\u0006\u0002\b~J\u000e\u0010\u007f\u001a\u00020:H\u0010¢\u0006\u0003\b\u0080\u0001J\u0010\u0010\u0081\u0001\u001a\u00020:2\u0007\u0010\u0082\u0001\u001a\u00020\u0003J\u0012\u0010\u0083\u0001\u001a\u00020:2\u0007\u0010#\u001a\u00030\u0084\u0001H\u0002J\u0015\u0010\u0085\u0001\u001a\u00020:2\n\u0010#\u001a\u0006\u0012\u0002\b\u000302H\u0002JH\u0010\u0086\u0001\u001a\u00020:\"\u0005\b\u0000\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012\u001e\u0010o\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0fø\u0001\u0000¢\u0006\u0003\u0010\u008b\u0001JZ\u0010\u008c\u0001\u001a\u00020:\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012%\u0010o\u001a!\b\u0001\u0012\u0004\u0012\u0002H{\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u008d\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020:2\n\u00101\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0003\b\u0091\u0001JZ\u0010\u0092\u0001\u001a\u00020:\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012%\u0010o\u001a!\b\u0001\u0012\u0004\u0012\u0002H{\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u008d\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u008f\u0001J\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0013\u0010\u0095\u0001\u001a\u00020C2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002J\u0013\u0010\u0096\u0001\u001a\u00020w2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002J \u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0098\u0001\u001a\u00020'2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020'0XH\u0002J\t\u0010\u0099\u0001\u001a\u00020wH\u0007J\t\u0010\u009a\u0001\u001a\u00020wH\u0016J#\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J#\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010\u009d\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\u0007\u0010\u0098\u0001\u001a\u00020'H\u0002J%\u0010\u009e\u0001\u001a\u00020C2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J$\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\u0006\u00104\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\nH\u0082\u0010J\u0010\u0010 \u0001\u001a\u0004\u0018\u00010H*\u00030¡\u0001H\u0002J\u0017\u0010¢\u0001\u001a\u00020:*\u0002002\b\u0010;\u001a\u0004\u0018\u00010'H\u0002J\u001a\u0010£\u0001\u001a\u00060Oj\u0002`P*\u00020'2\u0007\u0010¤\u0001\u001a\u00020wH\u0002R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0015\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020\u0006*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¨\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "(Z)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "cancelsParent", "getCancelsParent", "()Z", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "handlesException", "getHandlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parentHandle", "Lkotlinx/coroutines/ChildHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "attachChild", "child", "awaitInternal", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "", "cause", "cancelImpl", "cancelMakeCompleting", "cancelParent", "childCancelled", "completeStateFinalization", "update", "mode", "", "suppressed", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "createJobCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "firstChild", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionCause", "getCompletionExceptionOrNull", "getFinalRootCause", "exceptions", "", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJobInternal", "parent", "initParentJobInternal$kotlinx_coroutines_core", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlinx/coroutines/CompletionHandler;", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onCancellation", "onCompletionInternal", "onCompletionInternal$kotlinx_coroutines_core", "onStartInternal", "onStartInternal$kotlinx_coroutines_core", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectClause0", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "registerSelectClause1Internal", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "removeNode", "removeNode$kotlinx_coroutines_core", "selectAwaitCompletion", "selectAwaitCompletion$kotlinx_coroutines_core", "start", "startInternal", "stateString", "suppressExceptions", "rootCause", "toDebugString", "toString", "tryFinalizeFinishingState", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob, kotlinx.coroutines.selects.SelectClause0 {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.JobSupport.class, java.lang.Object.class, "_state");
    private volatile java.lang.Object _state;
    private volatile kotlinx.coroutines.ChildHandle parentHandle;

    protected boolean getCancelsParent() {
        return false;
    }

    protected boolean getHandlesException() {
        return true;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    protected void handleJobException(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
    }

    protected void onCancellation(java.lang.Throwable cause) {
    }

    public void onCompletionInternal$kotlinx_coroutines_core(java.lang.Object state, int mode, boolean suppressed) {
    }

    public void onStartInternal$kotlinx_coroutines_core() {
    }

    public JobSupport(boolean z) {
        this._state = z ? kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE : kotlinx.coroutines.JobSupportKt.EMPTY_NEW;
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left here for binary compatibility")
    /* JADX INFO: renamed from: cancel */
    public /* synthetic */ boolean mo1400cancel() {
        return cancel(null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
        return (R) kotlinx.coroutines.Job.DefaultImpls.fold(this, r, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (E) kotlinx.coroutines.Job.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return kotlinx.coroutines.Job.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        return kotlinx.coroutines.Job.DefaultImpls.plus(this, context);
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        return kotlinx.coroutines.Job.DefaultImpls.plus((kotlinx.coroutines.Job) this, other);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return kotlinx.coroutines.Job.INSTANCE;
    }

    public final void initParentJobInternal$kotlinx_coroutines_core(kotlinx.coroutines.Job parent) {
        if (!(this.parentHandle == null)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (parent == null) {
            this.parentHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
            return;
        }
        parent.start();
        kotlinx.coroutines.ChildHandle childHandleAttachChild = parent.attachChild(this);
        this.parentHandle = childHandleAttachChild;
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            this.parentHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
        }
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> block) {
        while (true) {
            block.invoke(getState$kotlinx_coroutines_core());
        }
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getIsActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) || ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling());
    }

    private final boolean tryFinalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing state, java.lang.Object proposedUpdate, int mode) throws java.lang.Throwable {
        java.lang.Throwable finalRootCause;
        boolean z = false;
        if (!(getState$kotlinx_coroutines_core() == state)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!state.isSealed())) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!state.completing) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) (!(proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally) ? null : proposedUpdate);
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        synchronized (state) {
            java.util.List<java.lang.Throwable> listSealLocked = state.sealLocked(th);
            finalRootCause = getFinalRootCause(state, listSealLocked);
            if (finalRootCause != null && (suppressExceptions(finalRootCause, listSealLocked) || finalRootCause != state.rootCause)) {
                z = true;
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            proposedUpdate = new kotlinx.coroutines.CompletedExceptionally(finalRootCause);
        }
        if (finalRootCause != null && !cancelParent(finalRootCause)) {
            handleJobException(finalRootCause);
        }
        if (!_state$FU.compareAndSet(this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(proposedUpdate))) {
            throw new java.lang.IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + state + ", update: " + proposedUpdate).toString());
        }
        completeStateFinalization(state, proposedUpdate, mode, z);
        return true;
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing state, java.util.List<? extends java.lang.Throwable> exceptions) {
        java.lang.Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.isCancelling()) {
                return createJobCancellationException();
            }
            return null;
        }
        for (java.lang.Object obj2 : exceptions) {
            if (!(((java.lang.Throwable) obj2) instanceof java.util.concurrent.CancellationException)) {
                obj = obj2;
                break;
            }
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        return th != null ? th : exceptions.get(0);
    }

    private final boolean suppressExceptions(java.lang.Throwable rootCause, java.util.List<? extends java.lang.Throwable> exceptions) {
        boolean z = false;
        if (exceptions.size() <= 1) {
            return false;
        }
        java.util.Set setIdentitySet = kotlinx.coroutines.internal.ConcurrentKt.identitySet(exceptions.size());
        java.util.Iterator<? extends java.lang.Throwable> it = exceptions.iterator();
        while (it.hasNext()) {
            java.lang.Throwable thUnwrap = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrap(it.next());
            if (thUnwrap != rootCause && !(thUnwrap instanceof java.util.concurrent.CancellationException) && setIdentitySet.add(thUnwrap)) {
                kotlin.ExceptionsKt.addSuppressed(rootCause, thUnwrap);
                z = true;
            }
        }
        return z;
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete state, java.lang.Object update, int mode) throws java.lang.Throwable {
        if (!((state instanceof kotlinx.coroutines.Empty) || (state instanceof kotlinx.coroutines.JobNode))) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!(update instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (!_state$FU.compareAndSet(this, state, kotlinx.coroutines.JobSupportKt.boxIncomplete(update))) {
                return false;
            }
            completeStateFinalization(state, update, mode, false);
            return true;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete state, java.lang.Object update, int mode, boolean suppressed) throws java.lang.Throwable {
        kotlinx.coroutines.ChildHandle childHandle = this.parentHandle;
        if (childHandle != null) {
            childHandle.dispose();
            this.parentHandle = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) (!(update instanceof kotlinx.coroutines.CompletedExceptionally) ? null : update);
        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
        if (!isCancelling(state)) {
            onCancellation(th);
        }
        if (state instanceof kotlinx.coroutines.JobNode) {
            try {
                ((kotlinx.coroutines.JobNode) state).invoke(th);
            } catch (java.lang.Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + state + " for " + this, th2));
            }
        } else {
            kotlinx.coroutines.NodeList list = state.getList();
            if (list != null) {
                notifyCompletion(list, th);
            }
        }
        onCompletionInternal$kotlinx_coroutines_core(update, mode, suppressed);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x002d, please report this as an issue */
    private final void notifyCancelling(kotlinx.coroutines.NodeList list, java.lang.Throwable cause) throws java.lang.Throwable {
        onCancellation(cause);
        java.lang.Throwable th = (java.lang.Throwable) null;
        java.lang.Object next = list.getNext();
        if (next == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, list); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.JobCancellingNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(cause);
                } catch (java.lang.Throwable th2) {
                    if (th != null) {
                        kotlin.ExceptionsKt.addSuppressed(th, th2);
                        if (th == null) {
                            kotlinx.coroutines.CompletionHandlerException completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            th = completionHandlerException;
                        }
                    } else {
                        kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        th = completionHandlerException2;
                    }
                }
            }
        }
        if (th != null) {
            handleOnCompletionException$kotlinx_coroutines_core(th);
        }
        cancelParent(cause);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0030, please report this as an issue */
    private final <T extends kotlinx.coroutines.JobNode<?>> void notifyHandlers(kotlinx.coroutines.NodeList list, java.lang.Throwable cause) throws java.lang.Throwable {
        java.lang.Throwable th = (java.lang.Throwable) null;
        java.lang.Object next = list.getNext();
        if (next == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, list); nextNode = nextNode.getNextNode()) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (nextNode instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(cause);
                } catch (java.lang.Throwable th2) {
                    if (th == null) {
                        kotlinx.coroutines.CompletionHandlerException completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        th = completionHandlerException;
                    } else {
                        kotlin.ExceptionsKt.addSuppressed(th, th2);
                        if (th == null) {
                            kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            th = completionHandlerException2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            handleOnCompletionException$kotlinx_coroutines_core(th);
        }
    }

    private final int startInternal(java.lang.Object state) {
        if (state instanceof kotlinx.coroutines.Empty) {
            if (((kotlinx.coroutines.Empty) state).getIsActive()) {
                return 0;
            }
            if (!_state$FU.compareAndSet(this, state, kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE)) {
                return -1;
            }
            onStartInternal$kotlinx_coroutines_core();
            return 1;
        }
        if (!(state instanceof kotlinx.coroutines.InactiveNodeList)) {
            return 0;
        }
        if (!_state$FU.compareAndSet(this, state, ((kotlinx.coroutines.InactiveNodeList) state).getList())) {
            return -1;
        }
        onStartInternal$kotlinx_coroutines_core();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final java.util.concurrent.CancellationException getCancellationException() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? toCancellationException(((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause, "Job was cancelled") : new kotlinx.coroutines.JobCancellationException("Job has completed normally", null, this);
            }
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.Throwable th = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause;
        if (th != null && (cancellationException = toCancellationException(th, "Job is cancelling")) != null) {
            return cancellationException;
        }
        throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
    }

    private final java.util.concurrent.CancellationException toCancellationException(java.lang.Throwable th, java.lang.String str) {
        java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) (!(th instanceof java.util.concurrent.CancellationException) ? null : th);
        return cancellationException != null ? cancellationException : new kotlinx.coroutines.JobCancellationException(str, th, this);
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handler, "handler");
        return invokeOnCompletion(false, true, handler);
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handler, "handler");
        kotlinx.coroutines.JobNode<?> jobNodeMakeNode = (kotlinx.coroutines.JobNode) null;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Empty) {
                kotlinx.coroutines.Empty empty = (kotlinx.coroutines.Empty) state$kotlinx_coroutines_core;
                if (empty.getIsActive()) {
                    if (jobNodeMakeNode == null) {
                        jobNodeMakeNode = makeNode(handler, onCancelling);
                    }
                    if (_state$FU.compareAndSet(this, state$kotlinx_coroutines_core, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                } else {
                    promoteEmptyToNodeList(empty);
                }
            } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                kotlinx.coroutines.NodeList list = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList();
                if (list != null) {
                    java.lang.Throwable th = (java.lang.Throwable) null;
                    kotlinx.coroutines.JobNode<?> jobNode = kotlinx.coroutines.NonDisposableHandle.INSTANCE;
                    if (onCancelling && (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                        synchronized (state$kotlinx_coroutines_core) {
                            th = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause;
                            if (th == null || ((handler instanceof kotlinx.coroutines.ChildHandleNode) && !((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).completing)) {
                                if (jobNodeMakeNode == null) {
                                    jobNodeMakeNode = makeNode(handler, onCancelling);
                                }
                                if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                                    if (th == null) {
                                        return jobNodeMakeNode;
                                    }
                                    jobNode = jobNodeMakeNode;
                                }
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    }
                    if (th != null) {
                        if (invokeImmediately) {
                            handler.invoke(th);
                        }
                        return jobNode;
                    }
                    if (jobNodeMakeNode == null) {
                        jobNodeMakeNode = makeNode(handler, onCancelling);
                    }
                    if (addLastAtomic(state$kotlinx_coroutines_core, list, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                    }
                    promoteSingleToNodeList((kotlinx.coroutines.JobNode) state$kotlinx_coroutines_core);
                }
            } else {
                if (invokeImmediately) {
                    if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
                        state$kotlinx_coroutines_core = null;
                    }
                    kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core;
                    handler.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                }
                return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
            }
        }
    }

    private final kotlinx.coroutines.JobNode<?> makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler, boolean onCancelling) {
        if (onCancelling) {
            kotlinx.coroutines.JobCancellingNode jobCancellingNode = (kotlinx.coroutines.JobCancellingNode) (handler instanceof kotlinx.coroutines.JobCancellingNode ? handler : null);
            if (jobCancellingNode != null) {
                if (!(jobCancellingNode.job == this)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                if (jobCancellingNode != null) {
                    return jobCancellingNode;
                }
            }
            return new kotlinx.coroutines.InvokeOnCancelling(this, handler);
        }
        kotlinx.coroutines.JobNode<?> jobNode = (kotlinx.coroutines.JobNode) (handler instanceof kotlinx.coroutines.JobNode ? handler : null);
        if (jobNode != null) {
            if (!(jobNode.job == this && !(jobNode instanceof kotlinx.coroutines.JobCancellingNode))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (jobNode != null) {
                return jobNode;
            }
        }
        return new kotlinx.coroutines.InvokeOnCompletion(this, handler);
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty state) {
        kotlinx.coroutines.NodeList nodeList = new kotlinx.coroutines.NodeList();
        _state$FU.compareAndSet(this, state, state.getIsActive() ? nodeList : new kotlinx.coroutines.InactiveNodeList(nodeList));
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode<?> state) {
        state.addOneIfEmpty(new kotlinx.coroutines.NodeList());
        _state$FU.compareAndSet(this, state, state.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!joinInternal()) {
            kotlinx.coroutines.YieldKt.checkCompletion(continuation.getContext());
            return kotlin.Unit.INSTANCE;
        }
        return joinSuspend(continuation);
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
        return this;
    }

    @Override // kotlinx.coroutines.Job
    public void cancel() {
        cancel(null);
    }

    @Override // kotlinx.coroutines.Job
    public boolean cancel(java.lang.Throwable cause) {
        return cancelImpl(cause) && getHandlesException();
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(kotlinx.coroutines.ParentJob parentJob) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parentJob, "parentJob");
        cancelImpl(parentJob);
    }

    public boolean childCancelled(java.lang.Throwable cause) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
        return cancelImpl(cause) && getHandlesException();
    }

    private final boolean cancelImpl(java.lang.Object cause) {
        if (getOnCancelComplete$kotlinx_coroutines_core() && cancelMakeCompleting(cause)) {
            return true;
        }
        return makeCancelling(cause);
    }

    private final kotlinx.coroutines.JobCancellationException createJobCancellationException() {
        return new kotlinx.coroutines.JobCancellationException("Job was cancelled", null, this);
    }

    @Override // kotlinx.coroutines.ParentJob
    public java.lang.Throwable getChildJobCancellationCause() {
        java.lang.Throwable th;
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            th = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause;
        } else {
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            th = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause : null;
        }
        if (th != null && (!getHandlesException() || (th instanceof java.util.concurrent.CancellationException))) {
            return th;
        }
        return new kotlinx.coroutines.JobCancellationException("Parent job is " + stateString(state$kotlinx_coroutines_core), th, this);
    }

    private final java.lang.Throwable createCauseException(java.lang.Object cause) {
        if (cause != null ? cause instanceof java.lang.Throwable : true) {
            if (cause == null) {
                cause = createJobCancellationException();
            }
            return (java.lang.Throwable) cause;
        }
        if (cause != null) {
            return ((kotlinx.coroutines.ParentJob) cause).getChildJobCancellationCause();
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    private final boolean makeCancelling(java.lang.Object cause) throws java.lang.Throwable {
        java.lang.Throwable thCreateCauseException = (java.lang.Throwable) null;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                    return false;
                }
                if (thCreateCauseException == null) {
                    thCreateCauseException = createCauseException(cause);
                }
                kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.getIsActive()) {
                    if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                        return true;
                    }
                } else {
                    int iTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(thCreateCauseException), 0);
                    if (iTryMakeCompleting == 0) {
                        throw new java.lang.IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                    }
                    if (iTryMakeCompleting == 1 || iTryMakeCompleting == 2) {
                        return true;
                    }
                    if (iTryMakeCompleting != 3) {
                        throw new java.lang.IllegalStateException("unexpected result".toString());
                    }
                }
            } else {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isSealed()) {
                        return false;
                    }
                    boolean zIsCancelling = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).isCancelling();
                    if (cause != null || !zIsCancelling) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(cause);
                        }
                        ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).addExceptionLocked(thCreateCauseException);
                    }
                    java.lang.Throwable th = zIsCancelling ^ true ? ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause : null;
                    if (th != null) {
                        notifyCancelling(((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).getList(), th);
                    }
                    return true;
                }
            }
        }
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete state) {
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof kotlinx.coroutines.Empty) {
            return new kotlinx.coroutines.NodeList();
        }
        if (state instanceof kotlinx.coroutines.JobNode) {
            promoteSingleToNodeList((kotlinx.coroutines.JobNode) state);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + state).toString());
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete state, java.lang.Throwable rootCause) throws java.lang.Throwable {
        if (!(!(state instanceof kotlinx.coroutines.JobSupport.Finishing))) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!state.getIsActive()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!_state$FU.compareAndSet(this, state, new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, rootCause))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, rootCause);
        return true;
    }

    private final int tryMakeCompleting(java.lang.Object state, java.lang.Object proposedUpdate, int mode) throws java.lang.Throwable {
        if (!(state instanceof kotlinx.coroutines.Incomplete)) {
            return 0;
        }
        if (((state instanceof kotlinx.coroutines.Empty) || (state instanceof kotlinx.coroutines.JobNode)) && !(state instanceof kotlinx.coroutines.ChildHandleNode) && !(proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally)) {
            return !tryFinalizeSimpleState((kotlinx.coroutines.Incomplete) state, proposedUpdate, mode) ? 3 : 1;
        }
        kotlinx.coroutines.Incomplete incomplete = (kotlinx.coroutines.Incomplete) state;
        kotlinx.coroutines.NodeList orPromoteCancellingList = getOrPromoteCancellingList(incomplete);
        if (orPromoteCancellingList == null) {
            return 3;
        }
        kotlinx.coroutines.JobSupport.Finishing finishing = (kotlinx.coroutines.JobSupport.Finishing) (!(state instanceof kotlinx.coroutines.JobSupport.Finishing) ? null : state);
        if (finishing == null) {
            finishing = new kotlinx.coroutines.JobSupport.Finishing(orPromoteCancellingList, false, null);
        }
        synchronized (finishing) {
            if (finishing.completing) {
                return 0;
            }
            finishing.completing = true;
            if (finishing != state && !_state$FU.compareAndSet(this, state, finishing)) {
                return 3;
            }
            if (!(!finishing.isSealed())) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            boolean zIsCancelling = finishing.isCancelling();
            kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) (!(proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally) ? null : proposedUpdate);
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            java.lang.Throwable th = zIsCancelling ^ true ? finishing.rootCause : null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (th != null) {
                notifyCancelling(orPromoteCancellingList, th);
            }
            kotlinx.coroutines.ChildHandleNode childHandleNodeFirstChild = firstChild(incomplete);
            if (childHandleNodeFirstChild == null || !tryWaitForChild(finishing, childHandleNodeFirstChild, proposedUpdate)) {
                return tryFinalizeFinishingState(finishing, proposedUpdate, mode) ? 1 : 3;
            }
            return 2;
        }
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.coroutines.CompletedExceptionally)) {
            obj = null;
        }
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) obj;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete state) {
        kotlinx.coroutines.ChildHandleNode childHandleNode = (kotlinx.coroutines.ChildHandleNode) (!(state instanceof kotlinx.coroutines.ChildHandleNode) ? null : state);
        if (childHandleNode != null) {
            return childHandleNode;
        }
        kotlinx.coroutines.NodeList list = state.getList();
        if (list != null) {
            return nextChild(list);
        }
        return null;
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode child, java.lang.Object proposedUpdate) {
        while (kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(child.childJob, false, false, new kotlinx.coroutines.JobSupport.ChildCompletion(this, state, child, proposedUpdate), 1, null) == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            child = nextChild(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode lastChild, java.lang.Object proposedUpdate) {
        if (!(getState$kotlinx_coroutines_core() == state)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        kotlinx.coroutines.ChildHandleNode childHandleNodeNextChild = nextChild(lastChild);
        if ((childHandleNodeNextChild == null || !tryWaitForChild(state, childHandleNodeNextChild, proposedUpdate)) && tryFinalizeFinishingState(state, proposedUpdate, 0)) {
        }
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.ChildHandleNode) {
                    return (kotlinx.coroutines.ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.NodeList) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
        return kotlin.sequences.SequencesKt.sequence(new kotlinx.coroutines.JobSupport$children$1(this, null));
    }

    @Override // kotlinx.coroutines.Job
    public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(child, "child");
        kotlinx.coroutines.DisposableHandle disposableHandleInvokeOnCompletion$default = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(this, true, false, new kotlinx.coroutines.ChildHandleNode(this, child), 2, null);
        if (disposableHandleInvokeOnCompletion$default != null) {
            return (kotlinx.coroutines.ChildHandle) disposableHandleInvokeOnCompletion$default;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable exception) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        throw exception;
    }

    private final boolean cancelParent(java.lang.Throwable cause) {
        kotlinx.coroutines.ChildHandle childHandle;
        if (cause instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return getCancelsParent() && (childHandle = this.parentHandle) != null && childHandle.childCancelled(cause);
    }

    public java.lang.String toString() {
        return toDebugString() + '@' + kotlinx.coroutines.DebugKt.getHexAddress(this);
    }

    public final java.lang.String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public java.lang.String nameString$kotlinx_coroutines_core() {
        return kotlinx.coroutines.DebugKt.getClassSimpleName(this);
    }

    private final java.lang.String stateString(java.lang.Object state) {
        if (state instanceof kotlinx.coroutines.JobSupport.Finishing) {
            kotlinx.coroutines.JobSupport.Finishing finishing = (kotlinx.coroutines.JobSupport.Finishing) state;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            return finishing.completing ? "Completing" : "Active";
        }
        if (state instanceof kotlinx.coroutines.Incomplete) {
            return ((kotlinx.coroutines.Incomplete) state).getIsActive() ? "Active" : "New";
        }
        return state instanceof kotlinx.coroutines.CompletedExceptionally ? "Cancelled" : "Completed";
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0016j\b\u0012\u0004\u0012\u00020\t`\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "isActive", "()Z", "isCancelling", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class Finishing implements kotlinx.coroutines.Incomplete {

        /* JADX INFO: renamed from: _exceptionsHolder, reason: from kotlin metadata and from toString */
        private volatile java.lang.Object exceptions;

        /* JADX INFO: renamed from: isCompleting, reason: from kotlin metadata and from toString */
        public volatile boolean completing;
        private final kotlinx.coroutines.NodeList list;
        public volatile java.lang.Throwable rootCause;

        @Override // kotlinx.coroutines.Incomplete
        public kotlinx.coroutines.NodeList getList() {
            return this.list;
        }

        public Finishing(kotlinx.coroutines.NodeList list, boolean z, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(list, "list");
            this.list = list;
            this.completing = z;
            this.rootCause = th;
        }

        public final boolean isSealed() {
            return this.exceptions == kotlinx.coroutines.JobSupportKt.SEALED;
        }

        public final boolean isCancelling() {
            return this.rootCause != null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: isActive */
        public boolean getIsActive() {
            return this.rootCause == null;
        }

        public final java.util.List<java.lang.Throwable> sealLocked(java.lang.Throwable proposedException) {
            java.util.ArrayList arrayListAllocateList;
            java.lang.Object obj = this.exceptions;
            if (obj == null) {
                arrayListAllocateList = allocateList();
            } else if (obj instanceof java.lang.Throwable) {
                java.util.ArrayList arrayListAllocateList2 = allocateList();
                arrayListAllocateList2.add(obj);
                arrayListAllocateList = arrayListAllocateList2;
            } else {
                if (!(obj instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException(("State is " + obj).toString());
                }
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
                arrayListAllocateList = (java.util.ArrayList) obj;
            }
            java.lang.Throwable th = this.rootCause;
            if (th != null) {
                arrayListAllocateList.add(0, th);
            }
            if (proposedException != null && (!kotlin.jvm.internal.Intrinsics.areEqual(proposedException, th))) {
                arrayListAllocateList.add(proposedException);
            }
            this.exceptions = kotlinx.coroutines.JobSupportKt.SEALED;
            return arrayListAllocateList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void addExceptionLocked(java.lang.Throwable exception) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
            java.lang.Throwable th = this.rootCause;
            if (th == null) {
                this.rootCause = exception;
                return;
            }
            if (exception == th) {
                return;
            }
            java.lang.Object obj = this.exceptions;
            if (obj == null) {
                this.exceptions = exception;
                return;
            }
            if (obj instanceof java.lang.Throwable) {
                if (exception == obj) {
                    return;
                }
                java.util.ArrayList<java.lang.Throwable> arrayListAllocateList = allocateList();
                arrayListAllocateList.add(obj);
                arrayListAllocateList.add(exception);
                this.exceptions = arrayListAllocateList;
                return;
            }
            if (obj instanceof java.util.ArrayList) {
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
                ((java.util.ArrayList) obj).add(exception);
            } else {
                throw new java.lang.IllegalStateException(("State is " + obj).toString());
            }
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
            return new java.util.ArrayList<>(4);
        }

        public java.lang.String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + this.completing + ", rootCause=" + this.rootCause + ", exceptions=" + this.exceptions + ", list=" + getList() + ']';
        }
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete incomplete) {
        return (incomplete instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) incomplete).isCancelling();
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class ChildCompletion extends kotlinx.coroutines.JobNode<kotlinx.coroutines.Job> {
        private final kotlinx.coroutines.ChildHandleNode child;
        private final kotlinx.coroutines.JobSupport parent;
        private final java.lang.Object proposedUpdate;
        private final kotlinx.coroutines.JobSupport.Finishing state;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChildCompletion(kotlinx.coroutines.JobSupport parent, kotlinx.coroutines.JobSupport.Finishing state, kotlinx.coroutines.ChildHandleNode child, java.lang.Object obj) {
            super(child.childJob);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parent, "parent");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(state, "state");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(child, "child");
            this.parent = parent;
            this.state = state;
            this.child = child;
            this.proposedUpdate = obj;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable cause) {
            this.parent.continueCompleting(this.state, this.child, this.proposedUpdate);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
            return "ChildCompletion[" + this.child + ", " + this.proposedUpdate + ']';
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    private static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {
        private final kotlinx.coroutines.JobSupport job;

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        protected java.lang.String nameString() {
            return "AwaitContinuation";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AwaitContinuation(kotlin.coroutines.Continuation<? super T> delegate, kotlinx.coroutines.JobSupport job) {
            super(delegate, 1);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(job, "job");
            this.job = job;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
            java.lang.Throwable th;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parent, "parent");
            java.lang.Object state$kotlinx_coroutines_core = this.job.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) || (th = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause) == null) {
                return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally ? ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause : parent.getCancellationException();
            }
            return th;
        }
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CompletedExceptionally;
    }

    public final java.lang.Throwable getCompletionExceptionOrNull() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() throws java.lang.Throwable {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            throw ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
    }

    public final java.lang.Object awaitInternal$kotlinx_coroutines_core(kotlin.coroutines.Continuation<java.lang.Object> continuation) throws java.lang.Throwable {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                    java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
                    if (kotlinx.coroutines.internal.StackTraceRecoveryKt.recoveryDisabled(th)) {
                        throw th;
                    }
                    kotlin.jvm.internal.InlineMarker.mark(0);
                    if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    final /* synthetic */ java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        kotlinx.coroutines.JobSupport.AwaitContinuation awaitContinuation = new kotlinx.coroutines.JobSupport.AwaitContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), this);
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(awaitContinuation, invokeOnCompletion(new kotlinx.coroutines.ResumeAwaitOnCompletion(this, awaitContinuation)));
        java.lang.Object result = awaitContinuation.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final <T, R> void selectAwaitCompletion$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            select.resumeSelectCancellableWithException(((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause);
        } else {
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(block, kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core), select.getCompletion());
        }
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        while (true) {
            java.lang.Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x002a, please report this as an issue */
    private final void notifyCompletion(kotlinx.coroutines.NodeList nodeList, java.lang.Throwable th) throws java.lang.Throwable {
        java.lang.Throwable th2 = (java.lang.Throwable) null;
        java.lang.Object next = nodeList.getNext();
        if (next == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode nextNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(nextNode, nodeList); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof kotlinx.coroutines.JobNode) {
                kotlinx.coroutines.JobNode jobNode = (kotlinx.coroutines.JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (java.lang.Throwable th3) {
                    if (th2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(th2, th3);
                        if (th2 == null) {
                            kotlinx.coroutines.CompletionHandlerException completionHandlerException = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            th2 = completionHandlerException;
                        }
                    } else {
                        kotlinx.coroutines.CompletionHandlerException completionHandlerException2 = new kotlinx.coroutines.CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        th2 = completionHandlerException2;
                    }
                }
            }
        }
        if (th2 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(th2);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    protected final java.lang.Throwable getCompletionCause() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) {
            java.lang.Throwable th = ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).rootCause;
            if (th != null) {
                return th;
            }
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            return ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        return null;
    }

    private final boolean addLastAtomic(final java.lang.Object expect, kotlinx.coroutines.NodeList list, kotlinx.coroutines.JobNode<?> node) {
        int iTryCondAddNext;
        final kotlinx.coroutines.JobNode<?> jobNode = node;
        kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAddOp = new kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            public java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode affected) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(affected, "affected");
                if (this.getState$kotlinx_coroutines_core() == expect) {
                    return null;
                }
                return kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            java.lang.Object prev = list.getPrev();
            if (prev == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            iTryCondAddNext = ((kotlinx.coroutines.internal.LockFreeLinkedListNode) prev).tryCondAddNext(jobNode, list, condAddOp);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    private final boolean joinInternal() {
        java.lang.Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    final /* synthetic */ java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, invokeOnCompletion(new kotlinx.coroutines.ResumeOnCompletion(this, cancellableContinuationImpl2)));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlinx.coroutines.selects.SelectClause0
    public final <R> void registerSelectClause0(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        java.lang.Object state$kotlinx_coroutines_core;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (select.isSelected()) {
                return;
            }
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (select.trySelect(null)) {
                    kotlinx.coroutines.YieldKt.checkCompletion(select.getCompletion().getContext());
                    kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, select.getCompletion());
                    return;
                }
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) != 0);
        select.disposeOnSelect(invokeOnCompletion(new kotlinx.coroutines.SelectJoinOnCompletion(this, select, block)));
    }

    public final void removeNode$kotlinx_coroutines_core(kotlinx.coroutines.JobNode<?> node) {
        java.lang.Object state$kotlinx_coroutines_core;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(node, "node");
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList() == null) {
                    return;
                }
                node.remove();
                return;
            }
            if (state$kotlinx_coroutines_core != node) {
                return;
            }
        } while (!_state$FU.compareAndSet(this, state$kotlinx_coroutines_core, kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE));
    }

    private final boolean cancelMakeCompleting(java.lang.Object cause) {
        int iTryMakeCompleting;
        do {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) || (((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.JobSupport.Finishing) && ((kotlinx.coroutines.JobSupport.Finishing) state$kotlinx_coroutines_core).completing) || (iTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new kotlinx.coroutines.CompletedExceptionally(createCauseException(cause)), 0)) == 0)) {
                return false;
            }
            if (iTryMakeCompleting == 1 || iTryMakeCompleting == 2) {
                return true;
            }
        } while (iTryMakeCompleting == 3);
        throw new java.lang.IllegalStateException("unexpected result".toString());
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(java.lang.Object proposedUpdate) throws java.lang.Throwable {
        int iTryMakeCompleting;
        do {
            boolean z = false;
            iTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate, 0);
            if (iTryMakeCompleting != 0) {
                z = true;
                if (iTryMakeCompleting == 1 || iTryMakeCompleting == 2) {
                }
            }
            return z;
        } while (iTryMakeCompleting == 3);
        throw new java.lang.IllegalStateException("unexpected result".toString());
    }

    public final boolean makeCompletingOnce$kotlinx_coroutines_core(java.lang.Object proposedUpdate, int mode) throws java.lang.Throwable {
        int iTryMakeCompleting;
        do {
            iTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate, mode);
            if (iTryMakeCompleting == 0) {
                throw new java.lang.IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, getExceptionOrNull(proposedUpdate));
            }
            if (iTryMakeCompleting == 1) {
                return true;
            }
            if (iTryMakeCompleting == 2) {
                return false;
            }
        } while (iTryMakeCompleting == 3);
        throw new java.lang.IllegalStateException("unexpected result".toString());
    }

    public final <T, R> void registerSelectClause1Internal$kotlinx_coroutines_core(kotlinx.coroutines.selects.SelectInstance<? super R> select, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block) {
        java.lang.Object state$kotlinx_coroutines_core;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (select.isSelected()) {
                return;
            }
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
                if (select.trySelect(null)) {
                    if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                        select.resumeSelectCancellableWithException(((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause);
                        return;
                    } else {
                        kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(block, kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core), select.getCompletion());
                        return;
                    }
                }
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) != 0);
        select.disposeOnSelect(invokeOnCompletion(new kotlinx.coroutines.SelectAwaitOnCompletion(this, select, block)));
    }
}
