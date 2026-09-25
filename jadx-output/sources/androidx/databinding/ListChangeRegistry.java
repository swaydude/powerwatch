package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public class ListChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.ObservableList.OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry.ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final androidx.core.util.Pools.SynchronizedPool<androidx.databinding.ListChangeRegistry.ListChanges> sListChanges = new androidx.core.util.Pools.SynchronizedPool<>(10);
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableList.OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry.ListChanges> NOTIFIER_CALLBACK = new androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableList.OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry.ListChanges>() { // from class: androidx.databinding.ListChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(androidx.databinding.ObservableList.OnListChangedCallback onListChangedCallback, androidx.databinding.ObservableList observableList, int i, androidx.databinding.ListChangeRegistry.ListChanges listChanges) {
            if (i == 1) {
                onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i == 2) {
                onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i == 3) {
                onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.to, listChanges.count);
            } else if (i == 4) {
                onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count);
            } else {
                onListChangedCallback.onChanged(observableList);
            }
        }
    };

    public void notifyChanged(androidx.databinding.ObservableList observableList) {
        notifyCallbacks(observableList, 0, (androidx.databinding.ListChangeRegistry.ListChanges) null);
    }

    public void notifyChanged(androidx.databinding.ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 1, acquire(i, 0, i2));
    }

    public void notifyInserted(androidx.databinding.ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 2, acquire(i, 0, i2));
    }

    public void notifyMoved(androidx.databinding.ObservableList observableList, int i, int i2, int i3) {
        notifyCallbacks(observableList, 3, acquire(i, i2, i3));
    }

    public void notifyRemoved(androidx.databinding.ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 4, acquire(i, 0, i2));
    }

    private static androidx.databinding.ListChangeRegistry.ListChanges acquire(int i, int i2, int i3) {
        androidx.databinding.ListChangeRegistry.ListChanges listChangesAcquire = sListChanges.acquire();
        if (listChangesAcquire == null) {
            listChangesAcquire = new androidx.databinding.ListChangeRegistry.ListChanges();
        }
        listChangesAcquire.start = i;
        listChangesAcquire.to = i2;
        listChangesAcquire.count = i3;
        return listChangesAcquire;
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(androidx.databinding.ObservableList observableList, int i, androidx.databinding.ListChangeRegistry.ListChanges listChanges) {
        super.notifyCallbacks(observableList, i, listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    static class ListChanges {
        public int count;
        public int start;
        public int to;

        ListChanges() {
        }
    }
}
