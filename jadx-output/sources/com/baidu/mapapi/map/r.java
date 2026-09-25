package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class r extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.ViewGroup.LayoutParams a;
    final /* synthetic */ int b;
    final /* synthetic */ com.baidu.mapapi.map.SwipeDismissTouchListener c;

    r(com.baidu.mapapi.map.SwipeDismissTouchListener swipeDismissTouchListener, android.view.ViewGroup.LayoutParams layoutParams, int i) {
        this.c = swipeDismissTouchListener;
        this.a = layoutParams;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.c.f.onDismiss(this.c.e, this.c.l);
        this.c.e.setTranslationX(0.0f);
        this.a.height = this.b;
        this.c.e.setLayoutParams(this.a);
    }
}
