package com.baidu.mapsdkplatform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
class i implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.a.h a;

    i(com.baidu.mapsdkplatform.comapi.a.h hVar) {
        this.a = hVar;
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
