package powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager;

/* JADX INFO: compiled from: DialogManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH&J*\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H&¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;", "", "openAlertDialog", "Lio/reactivex/Single;", "", "context", "Landroid/content/Context;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "positiveButtonText", "negativeButtonText", "openCustomDialog", "DATA", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dialogFragment", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DialogManager {
    io.reactivex.Single<java.lang.Boolean> openAlertDialog(android.content.Context context, int title, int message, int positiveButtonText, int negativeButtonText);

    <DATA> io.reactivex.Single<DATA> openCustomDialog(androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog<DATA> dialogFragment);

    /* JADX INFO: compiled from: DialogManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Single openAlertDialog$default(powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.DialogManager dialogManager, android.content.Context context, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if (obj == null) {
                return dialogManager.openAlertDialog(context, i, i2, (i5 & 8) != 0 ? powerwatch.matrix.com.pwgen2android.R.string.button_ok : i3, (i5 & 16) != 0 ? powerwatch.matrix.com.pwgen2android.R.string.button_cancel : i4);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAlertDialog");
        }
    }
}
