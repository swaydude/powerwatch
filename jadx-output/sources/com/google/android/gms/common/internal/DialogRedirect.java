package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogRedirect implements android.content.DialogInterface.OnClickListener {
    protected abstract void redirect();

    public static com.google.android.gms.common.internal.DialogRedirect getInstance(android.app.Activity activity, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zad(intent, activity, i);
    }

    public static com.google.android.gms.common.internal.DialogRedirect getInstance(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zac(intent, fragment, i);
    }

    public static com.google.android.gms.common.internal.DialogRedirect getInstance(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, android.content.Intent intent, int i) {
        return new com.google.android.gms.common.internal.zae(intent, lifecycleFragment, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        try {
            redirect();
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
