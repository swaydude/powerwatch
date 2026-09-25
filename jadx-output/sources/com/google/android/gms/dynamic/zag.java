package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zag implements com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa {
    private final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zart;

    zag(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zart = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zart.zaru.onStart();
    }
}
