package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class ListenerUtil {
    private static final android.util.SparseArray<java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>>> sListeners = new android.util.SparseArray<>();

    public static <T> T trackListener(android.view.View view, T t, int i) {
        java.lang.ref.WeakReference<?> weakReferencePut;
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            T t2 = (T) view.getTag(i);
            view.setTag(i, t);
            return t2;
        }
        android.util.SparseArray<java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>>> sparseArray = sListeners;
        synchronized (sparseArray) {
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>> weakHashMap = sparseArray.get(i);
            if (weakHashMap == null) {
                weakHashMap = new java.util.WeakHashMap<>();
                sparseArray.put(i, weakHashMap);
            }
            if (t == null) {
                weakReferencePut = weakHashMap.remove(view);
            } else {
                weakReferencePut = weakHashMap.put(view, new java.lang.ref.WeakReference<>(t));
            }
            if (weakReferencePut == null) {
                return null;
            }
            return (T) weakReferencePut.get();
        }
    }

    public static <T> T getListener(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            return (T) view.getTag(i);
        }
        android.util.SparseArray<java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>>> sparseArray = sListeners;
        synchronized (sparseArray) {
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<?>> weakHashMap = sparseArray.get(i);
            if (weakHashMap == null) {
                return null;
            }
            java.lang.ref.WeakReference<?> weakReference = weakHashMap.get(view);
            if (weakReference == null) {
                return null;
            }
            return (T) weakReference.get();
        }
    }
}
