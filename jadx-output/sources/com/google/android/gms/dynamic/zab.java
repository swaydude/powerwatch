package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zab implements com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa {
    private final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zart;
    private final /* synthetic */ android.os.Bundle zary;

    zab(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.os.Bundle bundle) {
        this.zart = deferredLifecycleHelper;
        this.zary = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zart.zaru.onCreate(this.zary);
    }
}
