package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends android.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zza>> zzbe = new java.util.WeakHashMap<>();
    private java.util.Map<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> zzbf = new androidx.collection.ArrayMap();
    private int zzbg = 0;
    private android.os.Bundle zzbh;

    public static com.google.android.gms.common.api.internal.zza zza(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.zza zzaVar;
        java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zza> weakReference = zzbe.get(activity);
        if (weakReference != null && (zzaVar = weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            com.google.android.gms.common.api.internal.zza zzaVar2 = (com.google.android.gms.common.api.internal.zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new com.google.android.gms.common.api.internal.zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            zzbe.put(activity, new java.lang.ref.WeakReference<>(zzaVar2));
            return zzaVar2;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls) {
        return cls.cast(this.zzbf.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (!this.zzbf.containsKey(str)) {
            this.zzbf.put(str, lifecycleCallback);
            if (this.zzbg > 0) {
                new com.google.android.gms.internal.common.zze(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzb(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzbg > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzbg >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final android.app.Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzbg = 1;
        this.zzbh = bundle;
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> entry : this.zzbf.entrySet()) {
            entry.getValue().onCreate(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzbg = 2;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzbg = 3;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> entry : this.zzbf.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            entry.getValue().onSaveInstanceState(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzbg = 4;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzbg = 5;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
