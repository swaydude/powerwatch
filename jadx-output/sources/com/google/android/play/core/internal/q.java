package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class q<StateT> {
    private final java.util.Set<com.google.android.play.core.listener.StateUpdatedListener<StateT>> a = new java.util.HashSet();

    public final synchronized void a(com.google.android.play.core.listener.StateUpdatedListener<StateT> stateUpdatedListener) {
        this.a.add(stateUpdatedListener);
    }

    public final synchronized void a(StateT statet) {
        java.util.Iterator<com.google.android.play.core.listener.StateUpdatedListener<StateT>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onStateUpdate(statet);
        }
    }

    public final synchronized void b(com.google.android.play.core.listener.StateUpdatedListener<StateT> stateUpdatedListener) {
        this.a.remove(stateUpdatedListener);
    }
}
