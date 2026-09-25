package powerwatch.matrix.com.pwgen2android.dialog;

/* JADX INFO: compiled from: BadPlacementDialogVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u00020\u0006*\u00020\fR*\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;", "Landroidx/lifecycle/ViewModel;", "()V", "dialogClose", "Lkotlin/Function1;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;", "", "getDialogClose", "()Lkotlin/jvm/functions/Function1;", "setDialogClose", "(Lkotlin/jvm/functions/Function1;)V", "onCancelClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BadPlacementDialogVM extends androidx.lifecycle.ViewModel {
    private kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> dialogClose;

    public final kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> getDialogClose() {
        return this.dialogClose;
    }

    public final void setDialogClose(kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> function1) {
        this.dialogClose = function1;
    }

    public final void onCancelClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        kotlin.jvm.functions.Function1<? super powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit> function1 = this.dialogClose;
        if (function1 == null) {
            return;
        }
        function1.invoke(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction.None.INSTANCE);
    }
}
