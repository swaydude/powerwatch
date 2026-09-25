package com.google.android.play.core.listener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<StateT> {
    protected final com.google.android.play.core.splitcompat.a a;
    private final android.content.IntentFilter b;
    private final android.content.Context c;
    private final java.util.Set<com.google.android.play.core.listener.StateUpdatedListener<StateT>> d = new java.util.HashSet();
    private com.google.android.play.core.listener.b e = null;
    private volatile boolean f = false;

    protected a(com.google.android.play.core.splitcompat.a aVar, android.content.IntentFilter intentFilter, android.content.Context context) {
        this.a = aVar;
        this.b = intentFilter;
        this.c = com.google.android.play.core.internal.ag.a(context);
    }

    private final void a() {
        com.google.android.play.core.listener.b bVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            com.google.android.play.core.listener.b bVar2 = new com.google.android.play.core.listener.b(this, (byte) 0);
            this.e = bVar2;
            this.c.registerReceiver(bVar2, this.b);
        }
        if (this.f || !this.d.isEmpty() || (bVar = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(bVar);
        this.e = null;
    }

    protected abstract void a(android.content.Context context, android.content.Intent intent);

    public final synchronized void a(com.google.android.play.core.listener.StateUpdatedListener<StateT> stateUpdatedListener) {
        this.a.a("registerListener", new java.lang.Object[0]);
        this.d.add(stateUpdatedListener);
        a();
    }

    public final synchronized void a(StateT statet) {
        java.util.Iterator it = new java.util.HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((com.google.android.play.core.listener.StateUpdatedListener) it.next()).onStateUpdate(statet);
        }
    }

    public final synchronized void a(boolean z) {
        this.f = true;
        a();
    }

    public final synchronized void b(com.google.android.play.core.listener.StateUpdatedListener<StateT> stateUpdatedListener) {
        this.a.a("unregisterListener", new java.lang.Object[0]);
        this.d.remove(stateUpdatedListener);
        a();
    }
}
