package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ListenerHolders {
    private final java.util.Set<com.google.android.gms.common.api.internal.ListenerHolder<?>> zajr = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public final <L> com.google.android.gms.common.api.internal.ListenerHolder<L> zaa(L l, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderCreateListenerHolder = createListenerHolder(l, looper, str);
        this.zajr.add(listenerHolderCreateListenerHolder);
        return listenerHolderCreateListenerHolder;
    }

    public final void release() {
        java.util.Iterator<com.google.android.gms.common.api.internal.ListenerHolder<?>> it = this.zajr.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.zajr.clear();
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(looper, l, str);
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(L l, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, str);
    }
}
