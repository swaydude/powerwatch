package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class q extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.baidu.mapapi.map.SwipeDismissTouchListener a;

    q(com.baidu.mapapi.map.SwipeDismissTouchListener swipeDismissTouchListener) {
        this.a = swipeDismissTouchListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.a.a();
    }
}
