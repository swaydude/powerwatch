package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class ad extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.baidu.mapapi.map.WearMapView b;

    ad(com.baidu.mapapi.map.WearMapView wearMapView, android.view.View view) {
        this.b = wearMapView;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.a.setVisibility(4);
        super.onAnimationEnd(animator);
    }
}
