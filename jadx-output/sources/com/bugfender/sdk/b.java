package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String g = "UI";
    public final com.bugfender.sdk.k1 a;
    private final com.bugfender.sdk.m1 b;
    private final boolean c;
    private final boolean d;
    private final java.util.Map<java.lang.String, java.util.List<com.bugfender.sdk.f3>> e = new java.util.HashMap();
    private com.bugfender.sdk.x1 f = new com.bugfender.sdk.x1();

    class a implements com.bugfender.sdk.x1.a {
        final /* synthetic */ android.app.Activity a;

        /* JADX INFO: renamed from: com.bugfender.sdk.b$a$a, reason: collision with other inner class name */
        class RunnableC0015a implements java.lang.Runnable {
            final /* synthetic */ java.util.List a;

            RunnableC0015a(java.util.List list) {
                this.a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (android.view.View view : this.a) {
                        com.bugfender.sdk.b bVar = com.bugfender.sdk.b.this;
                        com.bugfender.sdk.f3 f3VarA = com.bugfender.sdk.g3.a(view, bVar.a, bVar.c, com.bugfender.sdk.b.this.d);
                        if (f3VarA != null) {
                            f3VarA.a(view);
                            arrayList.add(f3VarA);
                        }
                    }
                    java.util.Map map = com.bugfender.sdk.b.this.e;
                    com.bugfender.sdk.b.a aVar = com.bugfender.sdk.b.a.this;
                    map.put(com.bugfender.sdk.b.this.b(aVar.a), arrayList);
                }
            }
        }

        a(android.app.Activity activity) {
            this.a = activity;
        }

        @Override // com.bugfender.sdk.x1.a
        public void a(java.util.List<android.view.View> list) {
            com.bugfender.sdk.b.this.b.a(new com.bugfender.sdk.b.a.RunnableC0015a(list));
        }
    }

    public b(com.bugfender.sdk.k1 k1Var, com.bugfender.sdk.m1 m1Var, boolean z, boolean z2) {
        this.a = k1Var;
        this.b = m1Var;
        this.c = z;
        this.d = z2;
    }

    private void a(android.app.Activity activity) {
        android.view.View childAt = ((android.view.ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
        if (childAt instanceof android.view.ViewGroup) {
            this.f.a((android.view.ViewGroup) childAt, new com.bugfender.sdk.b.a(activity));
        }
    }

    private void a(java.lang.String str) {
        java.util.List<com.bugfender.sdk.f3> list = this.e.get(str);
        if (list != null) {
            java.util.Iterator<com.bugfender.sdk.f3> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            list.clear();
        }
        this.e.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String b(android.app.Activity activity) {
        return activity.getClass().getCanonicalName() + "@" + java.lang.System.identityHashCode(activity);
    }

    private void b(java.lang.String str) {
        if (this.c) {
            com.bugfender.sdk.d1.a(g, str);
        }
    }

    private java.lang.String c(android.app.Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private void c(java.lang.String str) {
        d(str);
        b(str);
    }

    private void d(java.lang.String str) {
        if (this.d) {
            this.a.a(g, str);
        }
    }

    private boolean d(android.app.Activity activity) {
        return this.e.containsKey(b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        c("Activity created: " + c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        c("Activity destroyed: " + c(activity));
        a(b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        c("Activity paused: " + c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        c("Activity resumed: " + c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        c("Activity save instance state: " + c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        c("Activity started: " + c(activity));
        if (d(activity)) {
            return;
        }
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        c("Activity stopped: " + c(activity));
    }
}
