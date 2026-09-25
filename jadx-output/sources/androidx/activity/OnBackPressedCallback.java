package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> mCancellables = new java.util.concurrent.CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public abstract void handleOnBackPressed();

    public OnBackPressedCallback(boolean z) {
        this.mEnabled = z;
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        java.util.Iterator<androidx.activity.Cancellable> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void addCancellable(androidx.activity.Cancellable cancellable) {
        this.mCancellables.add(cancellable);
    }

    void removeCancellable(androidx.activity.Cancellable cancellable) {
        this.mCancellables.remove(cancellable);
    }
}
