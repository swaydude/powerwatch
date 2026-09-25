package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    private static com.google.android.gms.common.api.internal.LifecycleFragment getChimeraLifecycleFragmentImpl(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        throw new java.lang.IllegalStateException("Method not available in SDK.");
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public void onActivityResult(int i, int i2, android.content.Intent intent) {
    }

    public void onCreate(android.os.Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    protected static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.isSupport()) {
            return com.google.android.gms.common.api.internal.zzc.zza(lifecycleActivity.asFragmentActivity());
        }
        if (lifecycleActivity.zzh()) {
            return com.google.android.gms.common.api.internal.zza.zza(lifecycleActivity.asActivity());
        }
        throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity activity) {
        return getFragment(new com.google.android.gms.common.api.internal.LifecycleActivity(activity));
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    public android.app.Activity getActivity() {
        return this.mLifecycleFragment.getLifecycleActivity();
    }
}
