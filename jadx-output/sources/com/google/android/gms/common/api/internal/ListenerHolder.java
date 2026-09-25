package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerHolder<L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.zaa zajm;
    private volatile L zajn;
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> zajo;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    ListenerHolder(android.os.Looper looper, L l, java.lang.String str) {
        this.zajm = new com.google.android.gms.common.api.internal.ListenerHolder.zaa(looper);
        this.zajn = (L) com.google.android.gms.common.internal.Preconditions.checkNotNull(l, "Listener must not be null");
        this.zajo = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str));
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zaa extends com.google.android.gms.internal.base.zar {
        public zaa(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(message.what == 1);
            com.google.android.gms.common.api.internal.ListenerHolder.this.notifyListenerInternal((com.google.android.gms.common.api.internal.ListenerHolder.Notifier) message.obj);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class ListenerKey<L> {
        private final L zajn;
        private final java.lang.String zajp;

        ListenerKey(L l, java.lang.String str) {
            this.zajn = l;
            this.zajp = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey)) {
                return false;
            }
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) obj;
            return this.zajn == listenerKey.zajn && this.zajp.equals(listenerKey.zajp);
        }

        public final int hashCode() {
            return (java.lang.System.identityHashCode(this.zajn) * 31) + this.zajp.hashCode();
        }
    }

    public final void notifyListener(com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> notifier) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zajm.sendMessage(this.zajm.obtainMessage(1, notifier));
    }

    public final boolean hasListener() {
        return this.zajn != null;
    }

    public final void clear() {
        this.zajn = null;
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajo;
    }

    final void notifyListenerInternal(com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> notifier) {
        L l = this.zajn;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (java.lang.RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }
}
