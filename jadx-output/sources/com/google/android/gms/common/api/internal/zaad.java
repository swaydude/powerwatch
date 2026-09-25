package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class zaad extends com.google.android.gms.common.api.internal.zak {
    private com.google.android.gms.common.api.internal.GoogleApiManager zabo;
    private final androidx.collection.ArraySet<com.google.android.gms.common.api.internal.ApiKey<?>> zafs;

    public static void zaa(android.app.Activity activity, com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.common.api.internal.zaad zaadVar = (com.google.android.gms.common.api.internal.zaad) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.zaad.class);
        if (zaadVar == null) {
            zaadVar = new com.google.android.gms.common.api.internal.zaad(fragment);
        }
        zaadVar.zabo = googleApiManager;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaadVar.zafs.add(apiKey);
        googleApiManager.zaa(zaadVar);
    }

    private zaad(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zafs = new androidx.collection.ArraySet<>();
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.zak, com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        zaai();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onResume() {
        super.onResume();
        zaai();
    }

    @Override // com.google.android.gms.common.api.internal.zak, com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zabo.zab(this);
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.zabo.zaa(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zam() {
        this.zabo.zam();
    }

    final androidx.collection.ArraySet<com.google.android.gms.common.api.internal.ApiKey<?>> zaah() {
        return this.zafs;
    }

    private final void zaai() {
        if (this.zafs.isEmpty()) {
            return;
        }
        this.zabo.zaa(this);
    }
}
