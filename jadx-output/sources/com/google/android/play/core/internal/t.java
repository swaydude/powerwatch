package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class t<T extends android.os.IInterface> {
    private static final java.util.Map<java.lang.String, android.os.Handler> a = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final android.content.Context b;
    private final com.google.android.play.core.splitcompat.a c;
    private final java.lang.String d;
    private final java.util.List<com.google.android.play.core.internal.r> e;
    private boolean f;
    private final android.content.Intent g;
    private final com.google.android.play.core.internal.w<T> h;
    private final java.lang.ref.WeakReference<com.google.android.play.core.internal.x> i;
    private final android.os.IBinder.DeathRecipient j;
    private android.content.ServiceConnection k;
    private T l;

    public t(android.content.Context context, com.google.android.play.core.splitcompat.a aVar, java.lang.String str, android.content.Intent intent, com.google.android.play.core.internal.w<T> wVar) {
        this(context, aVar, str, intent, wVar, null);
    }

    private t(android.content.Context context, com.google.android.play.core.splitcompat.a aVar, java.lang.String str, android.content.Intent intent, com.google.android.play.core.internal.w<T> wVar, com.google.android.play.core.internal.x xVar) {
        this.e = new java.util.ArrayList();
        this.j = new android.os.IBinder.DeathRecipient(this) { // from class: com.google.android.play.core.internal.s
            private final com.google.android.play.core.internal.t a;

            {
                this.a = this;
            }

            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                this.a.c();
            }
        };
        this.b = context;
        this.c = aVar;
        this.d = str;
        this.g = intent;
        this.h = wVar;
        this.i = new java.lang.ref.WeakReference<>(null);
    }

    static /* synthetic */ android.content.ServiceConnection a(com.google.android.play.core.internal.t tVar, android.content.ServiceConnection serviceConnection) {
        tVar.k = null;
        return null;
    }

    static /* synthetic */ boolean a(com.google.android.play.core.internal.t tVar, boolean z) {
        tVar.f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(com.google.android.play.core.internal.r rVar) {
        byte b = 0;
        if (this.l != null || this.f) {
            if (!this.f) {
                rVar.run();
                return;
            } else {
                this.c.a("Waiting to bind to the service.", new java.lang.Object[0]);
                this.e.add(rVar);
                return;
            }
        }
        this.c.a("Initiate binding to the service.", new java.lang.Object[0]);
        this.e.add(rVar);
        com.google.android.play.core.internal.z zVar = new com.google.android.play.core.internal.z(this, b);
        this.k = zVar;
        this.f = true;
        if (this.b.bindService(this.g, zVar, 1)) {
            return;
        }
        this.c.a("Failed to bind to the service.", new java.lang.Object[0]);
        this.f = false;
        java.util.Iterator<com.google.android.play.core.internal.r> it = this.e.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.tasks.h<?> hVarB = it.next().b();
            if (hVarB != null) {
                hVarB.a((java.lang.Exception) new com.google.android.play.core.internal.aa());
            }
        }
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(com.google.android.play.core.internal.r rVar) {
        d().post(rVar);
    }

    private final android.os.Handler d() {
        android.os.Handler handler;
        java.util.Map<java.lang.String, android.os.Handler> map = a;
        synchronized (map) {
            if (!map.containsKey(this.d)) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.d, 10);
                handlerThread.start();
                map.put(this.d, new android.os.Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.d);
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        this.c.a("linkToDeath", new java.lang.Object[0]);
        try {
            this.l.asBinder().linkToDeath(this.j, 0);
        } catch (android.os.RemoteException e) {
            this.c.a(e, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.c.a("unlinkToDeath", new java.lang.Object[0]);
        this.l.asBinder().unlinkToDeath(this.j, 0);
    }

    public final void a() {
        c(new com.google.android.play.core.internal.u(this));
    }

    public final void a(com.google.android.play.core.internal.r rVar) {
        c(new com.google.android.play.core.internal.v(this, rVar.b(), rVar));
    }

    public final T b() {
        return this.l;
    }

    final /* synthetic */ void c() {
        this.c.a("reportBinderDeath", new java.lang.Object[0]);
        com.google.android.play.core.internal.x xVar = this.i.get();
        if (xVar != null) {
            this.c.a("calling onBinderDied", new java.lang.Object[0]);
            xVar.a();
            return;
        }
        this.c.a("%s : Binder has died.", this.d);
        java.util.Iterator<com.google.android.play.core.internal.r> it = this.e.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.tasks.h<?> hVarB = it.next().b();
            if (hVarB != null) {
                hVarB.a((java.lang.Exception) (android.os.Build.VERSION.SDK_INT < 15 ? new android.os.RemoteException() : new android.os.RemoteException(java.lang.String.valueOf(this.d).concat(" : Binder has died."))));
            }
        }
        this.e.clear();
    }
}
