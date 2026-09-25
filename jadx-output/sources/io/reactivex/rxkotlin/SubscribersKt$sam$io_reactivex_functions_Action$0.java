package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 11})
final class SubscribersKt$sam$io_reactivex_functions_Action$0 implements io.reactivex.functions.Action {
    private final /* synthetic */ kotlin.jvm.functions.Function0 function;

    SubscribersKt$sam$io_reactivex_functions_Action$0(kotlin.jvm.functions.Function0 function0) {
        this.function = function0;
    }

    @Override // io.reactivex.functions.Action
    public final /* synthetic */ void run() {
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(), "invoke(...)");
    }
}
