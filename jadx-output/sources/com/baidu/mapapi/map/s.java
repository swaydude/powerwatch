package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class s implements android.animation.ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ android.view.ViewGroup.LayoutParams a;
    final /* synthetic */ com.baidu.mapapi.map.SwipeDismissTouchListener b;

    s(com.baidu.mapapi.map.SwipeDismissTouchListener swipeDismissTouchListener, android.view.ViewGroup.LayoutParams layoutParams) {
        this.b = swipeDismissTouchListener;
        this.a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.a.height = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.b.e.setLayoutParams(this.a);
    }
}
