package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends androidx.fragment.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    android.app.Dialog mDialog;
    boolean mDismissed;
    private android.os.Handler mHandler;
    boolean mShownByMe;
    boolean mViewDestroyed;
    private java.lang.Runnable mDismissRunnable = new java.lang.Runnable() { // from class: androidx.fragment.app.DialogFragment.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.DialogFragment.this.mOnDismissListener.onDismiss(androidx.fragment.app.DialogFragment.this.mDialog);
        }
    };
    android.content.DialogInterface.OnCancelListener mOnCancelListener = new android.content.DialogInterface.OnCancelListener() { // from class: androidx.fragment.app.DialogFragment.2
        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface dialogInterface) {
            if (androidx.fragment.app.DialogFragment.this.mDialog != null) {
                androidx.fragment.app.DialogFragment dialogFragment = androidx.fragment.app.DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    };
    android.content.DialogInterface.OnDismissListener mOnDismissListener = new android.content.DialogInterface.OnDismissListener() { // from class: androidx.fragment.app.DialogFragment.3
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            if (androidx.fragment.app.DialogFragment.this.mDialog != null) {
                androidx.fragment.app.DialogFragment dialogFragment = androidx.fragment.app.DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    };
    int mStyle = 0;
    int mTheme = 0;
    boolean mCancelable = true;
    boolean mShowsDialog = true;
    int mBackStackId = -1;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    public void setStyle(int i, int i2) {
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void show(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commit();
    }

    public int show(androidx.fragment.app.FragmentTransaction fragmentTransaction, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentTransaction.add(this, str);
        this.mViewDestroyed = false;
        int iCommit = fragmentTransaction.commit();
        this.mBackStackId = iCommit;
        return iCommit;
    }

    public void showNow(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitNow();
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    void dismissInternal(boolean z, boolean z2) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (android.os.Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().popBackStack(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(this);
        if (z) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public android.app.Dialog getDialog() {
        return this.mDialog;
    }

    public final android.app.Dialog requireDialog() {
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public int getTheme() {
        return this.mTheme;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.mShownByMe || this.mDismissed) {
            return;
        }
        this.mDismissed = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new android.os.Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        android.app.Dialog dialogOnCreateDialog = onCreateDialog(bundle);
        this.mDialog = dialogOnCreateDialog;
        if (dialogOnCreateDialog != null) {
            setupDialog(dialogOnCreateDialog, this.mStyle);
            return (android.view.LayoutInflater) this.mDialog.getContext().getSystemService("layout_inflater");
        }
        return (android.view.LayoutInflater) this.mHost.getContext().getSystemService("layout_inflater");
    }

    public void setupDialog(android.app.Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new android.app.Dialog(requireContext(), getTheme());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        dismissInternal(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.mShowsDialog) {
            android.view.View view = getView();
            if (view != null) {
                if (view.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.mDialog.setContentView(view);
            }
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity != null) {
                this.mDialog.setOwnerActivity(activity);
            }
            this.mDialog.setCancelable(this.mCancelable);
            this.mDialog.setOnCancelListener(this.mOnCancelListener);
            this.mDialog.setOnDismissListener(this.mOnDismissListener);
            if (bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
                return;
            }
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        android.os.Bundle bundleOnSaveInstanceState;
        super.onSaveInstanceState(bundle);
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null && (bundleOnSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
        }
    }
}
