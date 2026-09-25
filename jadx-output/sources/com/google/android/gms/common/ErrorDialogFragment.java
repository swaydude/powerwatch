package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ErrorDialogFragment extends android.app.DialogFragment {
    private android.app.Dialog mDialog = null;
    private android.content.DialogInterface.OnCancelListener zaaq = null;

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        return this.mDialog;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.zaaq;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog dialog) {
        return newInstance(dialog, null);
    }

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.google.android.gms.common.ErrorDialogFragment errorDialogFragment = new com.google.android.gms.common.ErrorDialogFragment();
        android.app.Dialog dialog2 = (android.app.Dialog) com.google.android.gms.common.internal.Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.mDialog = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.zaaq = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment
    public void show(android.app.FragmentManager fragmentManager, java.lang.String str) {
        super.show(fragmentManager, str);
    }
}
