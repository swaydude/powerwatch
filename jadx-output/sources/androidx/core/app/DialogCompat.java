package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class DialogCompat {
    private DialogCompat() {
    }

    public static android.view.View requireViewById(android.app.Dialog dialog, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(i);
        }
        android.view.View viewFindViewById = dialog.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new java.lang.IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
