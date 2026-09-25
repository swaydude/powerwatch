package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends androidx.fragment.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static java.util.WeakHashMap<androidx.fragment.app.FragmentActivity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzc>> zzbe = new java.util.WeakHashMap<>();
    private java.util.Map<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> zzbf = new androidx.collection.ArrayMap();
    private int zzbg = 0;
    private android.os.Bundle zzbh;

    public static com.google.android.gms.common.api.internal.zzc zza(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.google.android.gms.common.api.internal.zzc zzcVar;
        java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzc> weakReference = zzbe.get(fragmentActivity);
        if (weakReference != null && (zzcVar = weakReference.get()) != null) {
            return zzcVar;
        }
        try {
            com.google.android.gms.common.api.internal.zzc zzcVar2 = (com.google.android.gms.common.api.internal.zzc) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzcVar2 == null || zzcVar2.isRemoving()) {
                zzcVar2 = new com.google.android.gms.common.api.internal.zzc();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(zzcVar2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            zzbe.put(fragmentActivity, new java.lang.ref.WeakReference<>(zzcVar2));
            return zzcVar2;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
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
                new com.google.android.gms.internal.common.zze(android.os.Looper.getMainLooper()).post(new com.google.android.gms.common.api.internal.zzd(this, lifecycleCallback, str));
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zzbg = 1;
        this.zzbh = bundle;
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.api.internal.LifecycleCallback> entry : this.zzbf.entrySet()) {
            entry.getValue().onCreate(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzbg = 2;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzbg = 3;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzbg = 4;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzbg = 5;
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator<com.google.android.gms.common.api.internal.LifecycleCallback> it = this.zzbf.values().iterator();
        while (it.hasNext()) {
            it.next().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ android.app.Activity getLifecycleActivity() {
        return getActivity();
    }
}
