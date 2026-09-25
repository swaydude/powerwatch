package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class ViewModelStore {
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModel> mMap = new java.util.HashMap<>();

    final void put(java.lang.String str, androidx.lifecycle.ViewModel viewModel) {
        androidx.lifecycle.ViewModel viewModelPut = this.mMap.put(str, viewModel);
        if (viewModelPut != null) {
            viewModelPut.onCleared();
        }
    }

    final androidx.lifecycle.ViewModel get(java.lang.String str) {
        return this.mMap.get(str);
    }

    java.util.Set<java.lang.String> keys() {
        return new java.util.HashSet(this.mMap.keySet());
    }

    public final void clear() {
        java.util.Iterator<androidx.lifecycle.ViewModel> it = this.mMap.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.mMap.clear();
    }
}
