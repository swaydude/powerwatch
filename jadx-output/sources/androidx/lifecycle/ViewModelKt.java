package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"JOB_KEY", "", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/ViewModel;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 1, 13})
public final class ViewModelKt {
    private static final java.lang.String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final kotlinx.coroutines.CoroutineScope getViewModelScope(androidx.lifecycle.ViewModel receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) receiver$0.getTag(JOB_KEY);
        if (coroutineScope != null) {
            return coroutineScope;
        }
        java.lang.Object tagIfAbsent = receiver$0.setTagIfAbsent(JOB_KEY, new androidx.lifecycle.CloseableCoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default(null, 1, null).plus(kotlinx.coroutines.Dispatchers.getMain())));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(tagIfAbsent, "setTagIfAbsent(JOB_KEY,\n…ob() + Dispatchers.Main))");
        return (kotlinx.coroutines.CoroutineScope) tagIfAbsent;
    }
}
