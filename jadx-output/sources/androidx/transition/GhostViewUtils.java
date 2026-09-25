package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class GhostViewUtils {
    static androidx.transition.GhostViewImpl addGhost(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return androidx.transition.GhostViewApi21.addGhost(view, viewGroup, matrix);
        }
        return androidx.transition.GhostViewApi14.addGhost(view, viewGroup);
    }

    static void removeGhost(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            androidx.transition.GhostViewApi21.removeGhost(view);
        } else {
            androidx.transition.GhostViewApi14.removeGhost(view);
        }
    }

    private GhostViewUtils() {
    }
}
