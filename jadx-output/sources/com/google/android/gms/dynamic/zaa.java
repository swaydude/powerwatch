package com.google.android.gms.dynamic;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaa<T> implements com.google.android.gms.dynamic.OnDelegateCreatedListener<T> {
    private final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zart;

    zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zart = deferredLifecycleHelper;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zart.zaru = lifecycleDelegate;
        java.util.Iterator it = this.zart.zarw.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa) it.next()).zaa(this.zart.zaru);
        }
        this.zart.zarw.clear();
        com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(this.zart, (android.os.Bundle) null);
    }
}
