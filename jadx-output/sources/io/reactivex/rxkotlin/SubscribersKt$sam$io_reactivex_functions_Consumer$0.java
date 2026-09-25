package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 11})
final class SubscribersKt$sam$io_reactivex_functions_Consumer$0 implements io.reactivex.functions.Consumer {
    private final /* synthetic */ kotlin.jvm.functions.Function1 function;

    SubscribersKt$sam$io_reactivex_functions_Consumer$0(kotlin.jvm.functions.Function1 function1) {
        this.function = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(T t) {
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(t), "invoke(...)");
    }
}
