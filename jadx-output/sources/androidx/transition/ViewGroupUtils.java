package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtils {
    static androidx.transition.ViewGroupOverlayImpl getOverlay(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return new androidx.transition.ViewGroupOverlayApi18(viewGroup);
        }
        return androidx.transition.ViewGroupOverlayApi14.createFrom(viewGroup);
    }

    static void suppressLayout(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            androidx.transition.ViewGroupUtilsApi18.suppressLayout(viewGroup, z);
        } else {
            androidx.transition.ViewGroupUtilsApi14.suppressLayout(viewGroup, z);
        }
    }

    private ViewGroupUtils() {
    }
}
