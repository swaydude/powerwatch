package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class SafeToast extends android.widget.Toast {
    public SafeToast(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.Toast
    public void show() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            super.show();
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new io.fabric.sdk.android.services.concurrency.PriorityRunnable() { // from class: io.fabric.sdk.android.services.common.SafeToast.1
                @Override // java.lang.Runnable
                public void run() {
                    io.fabric.sdk.android.services.common.SafeToast.super.show();
                }
            });
        }
    }

    public static android.widget.Toast makeText(android.content.Context context, java.lang.CharSequence charSequence, int i) {
        android.widget.Toast toastMakeText = android.widget.Toast.makeText(context, charSequence, i);
        io.fabric.sdk.android.services.common.SafeToast safeToast = new io.fabric.sdk.android.services.common.SafeToast(context);
        safeToast.setView(toastMakeText.getView());
        safeToast.setDuration(toastMakeText.getDuration());
        return safeToast;
    }

    public static android.widget.Toast makeText(android.content.Context context, int i, int i2) throws android.content.res.Resources.NotFoundException {
        return makeText(context, context.getResources().getText(i), i2);
    }
}
