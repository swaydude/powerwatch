package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zac implements com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa {
    private final /* synthetic */ android.app.Activity val$activity;
    private final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zart;
    private final /* synthetic */ android.os.Bundle zary;
    private final /* synthetic */ android.os.Bundle zarz;

    zac(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.zart = deferredLifecycleHelper;
        this.val$activity = activity;
        this.zarz = bundle;
        this.zary = bundle2;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zart.zaru.onInflate(this.val$activity, this.zarz, this.zary);
    }
}
