package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zae implements com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa {
    private final /* synthetic */ android.view.ViewGroup val$container;
    private final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zart;
    private final /* synthetic */ android.os.Bundle zary;
    private final /* synthetic */ android.widget.FrameLayout zasb;
    private final /* synthetic */ android.view.LayoutInflater zasc;

    zae(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.widget.FrameLayout frameLayout, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.zart = deferredLifecycleHelper;
        this.zasb = frameLayout;
        this.zasc = layoutInflater;
        this.val$container = viewGroup;
        this.zary = bundle;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        this.zasb.removeAllViews();
        this.zasb.addView(this.zart.zaru.onCreateView(this.zasc, this.val$container, this.zary));
    }
}
