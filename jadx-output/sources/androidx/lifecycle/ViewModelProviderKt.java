package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 1, 13})
public final class ViewModelProviderKt {
    private static final <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider viewModelProvider) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        VM vm = (VM) viewModelProvider.get(androidx.lifecycle.ViewModel.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(vm, "get(VM::class.java)");
        return vm;
    }
}
