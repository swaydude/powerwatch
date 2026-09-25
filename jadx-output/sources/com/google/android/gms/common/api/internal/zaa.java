package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaa.C0019zaa> zaco;

    public zaa(android.app.Activity activity) {
        this(com.google.android.gms.common.api.internal.zaa.C0019zaa.zaa(activity));
    }

    private zaa(com.google.android.gms.common.api.internal.zaa.C0019zaa c0019zaa) {
        this.zaco = new java.lang.ref.WeakReference<>(c0019zaa);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable) {
        com.google.android.gms.common.api.internal.zaa.C0019zaa c0019zaa = this.zaco.get();
        if (c0019zaa == null) {
            throw new java.lang.IllegalStateException("The target activity has already been GC'd");
        }
        c0019zaa.zaa(runnable);
        return this;
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.zaa$zaa, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    static class C0019zaa extends com.google.android.gms.common.api.internal.LifecycleCallback {
        private java.util.List<java.lang.Runnable> zacn;

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.gms.common.api.internal.zaa.C0019zaa zaa(android.app.Activity activity) {
            com.google.android.gms.common.api.internal.zaa.C0019zaa c0019zaa;
            synchronized (activity) {
                com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
                c0019zaa = (com.google.android.gms.common.api.internal.zaa.C0019zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", com.google.android.gms.common.api.internal.zaa.C0019zaa.class);
                if (c0019zaa == null) {
                    c0019zaa = new com.google.android.gms.common.api.internal.zaa.C0019zaa(fragment);
                }
            }
            return c0019zaa;
        }

        private C0019zaa(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zacn = new java.util.ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void zaa(java.lang.Runnable runnable) {
            this.zacn.add(runnable);
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            java.util.List<java.lang.Runnable> list;
            synchronized (this) {
                list = this.zacn;
                this.zacn = new java.util.ArrayList();
            }
            java.util.Iterator<java.lang.Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }
}
