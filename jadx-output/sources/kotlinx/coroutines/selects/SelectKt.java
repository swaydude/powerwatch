package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"ALREADY_SELECTED", "", "ALREADY_SELECTED$annotations", "()V", "getALREADY_SELECTED", "()Ljava/lang/Object;", "RESUMED", "RESUMED$annotations", "UNDECIDED", "UNDECIDED$annotations", "select", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class SelectKt {
    private static final java.lang.Object ALREADY_SELECTED = new kotlinx.coroutines.internal.Symbol("ALREADY_SELECTED");
    private static final java.lang.Object UNDECIDED = new kotlinx.coroutines.internal.Symbol("UNDECIDED");
    private static final java.lang.Object RESUMED = new kotlinx.coroutines.internal.Symbol("RESUMED");

    public static /* synthetic */ void ALREADY_SELECTED$annotations() {
    }

    private static /* synthetic */ void RESUMED$annotations() {
    }

    private static /* synthetic */ void UNDECIDED$annotations() {
    }

    private static final <R> java.lang.Object select(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.selects.SelectBuilderImpl selectBuilderImpl = new kotlinx.coroutines.selects.SelectBuilderImpl(continuation);
        try {
            function1.invoke(selectBuilderImpl);
        } catch (java.lang.Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        java.lang.Object result = selectBuilderImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        kotlin.jvm.internal.InlineMarker.mark(1);
        return result;
    }

    public static final java.lang.Object getALREADY_SELECTED() {
        return ALREADY_SELECTED;
    }
}
