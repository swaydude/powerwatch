package com.baidu.mapsdkplatform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
class k implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.a.j a;

    k(com.baidu.mapsdkplatform.comapi.a.j jVar) {
        this.a = jVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        if (this.a.d != null) {
            this.a.d.onAnimationCancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.a.d != null) {
            this.a.d.onAnimationEnd();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        if (this.a.d != null) {
            this.a.d.onAnimationRepeat();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        if (this.a.d != null) {
            this.a.d.onAnimationStart();
        }
    }
}
