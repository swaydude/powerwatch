package powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs;

/* JADX INFO: compiled from: BaseDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH%J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;", "DATA", "Landroidx/fragment/app/DialogFragment;", "()V", "dialogClose", "Lkotlin/Function1;", "", "getDialogClose", "()Lkotlin/jvm/functions/Function1;", "setDialogClose", "(Lkotlin/jvm/functions/Function1;)V", "layoutRes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseDialog<DATA> extends androidx.fragment.app.DialogFragment {
    private kotlin.jvm.functions.Function1<? super DATA, kotlin.Unit> dialogClose;

    public void _$_clearFindViewByIdCache() {
    }

    protected abstract int layoutRes();

    public final kotlin.jvm.functions.Function1<DATA, kotlin.Unit> getDialogClose() {
        return this.dialogClose;
    }

    public final void setDialogClose(kotlin.jvm.functions.Function1<? super DATA, kotlin.Unit> function1) {
        this.dialogClose = function1;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(layoutRes(), container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
    }
}
