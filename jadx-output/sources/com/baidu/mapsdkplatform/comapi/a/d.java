package com.baidu.mapsdkplatform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.mapsdkplatform.comapi.a.c {
    private android.animation.Animator a = null;
    private long b = 0;
    private android.view.animation.Interpolator c = null;
    private com.baidu.mapapi.animation.Animation.AnimationListener d = null;
    private int e = 0;
    private java.util.ArrayList<com.baidu.mapapi.animation.Animation> f = new java.util.ArrayList<>();

    private android.animation.ObjectAnimator b(com.baidu.mapapi.map.Marker marker, com.baidu.mapapi.animation.Animation animation) {
        if (animation instanceof com.baidu.mapapi.animation.AlphaAnimation) {
            return ((com.baidu.mapsdkplatform.comapi.a.a) animation.bdAnimation).a(marker);
        }
        if (animation instanceof com.baidu.mapapi.animation.RotateAnimation) {
            return ((com.baidu.mapsdkplatform.comapi.a.f) animation.bdAnimation).a(marker);
        }
        if (animation instanceof com.baidu.mapapi.animation.Transformation) {
            return ((com.baidu.mapsdkplatform.comapi.a.l) animation.bdAnimation).a(marker);
        }
        if (animation instanceof com.baidu.mapapi.animation.ScaleAnimation) {
            return ((com.baidu.mapsdkplatform.comapi.a.h) animation.bdAnimation).a(marker);
        }
        if (animation instanceof com.baidu.mapapi.animation.SingleScaleAnimation) {
            return ((com.baidu.mapsdkplatform.comapi.a.j) animation.bdAnimation).a(marker);
        }
        return null;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a() {
        android.animation.Animator animator = this.a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(int i) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.b = j;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    protected void a(android.animation.Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new com.baidu.mapsdkplatform.comapi.a.e(this));
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(android.view.animation.Interpolator interpolator) {
        this.c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.animation.Animation.AnimationListener animationListener) {
        this.d = animationListener;
    }

    public void a(com.baidu.mapapi.animation.Animation animation) {
        if (this.f.contains(animation)) {
            return;
        }
        this.f.add(animation);
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.map.Marker marker, com.baidu.mapapi.animation.Animation animation) {
        android.animation.ObjectAnimator objectAnimatorB;
        this.a = new android.animation.AnimatorSet();
        java.util.ArrayList<com.baidu.mapapi.animation.Animation> arrayList = this.f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            com.baidu.mapapi.animation.Animation animation2 = arrayList.get(i);
            if (animation2 != null && (objectAnimatorB = b(marker, animation2)) != null) {
                arrayList2.add(objectAnimatorB);
            }
        }
        long j = this.b;
        if (j != 0) {
            this.a.setDuration(j);
        }
        android.view.animation.Interpolator interpolator = this.c;
        if (interpolator != null) {
            this.a.setInterpolator(interpolator);
        }
        if (arrayList2.size() != 0) {
            int i2 = this.e;
            if (i2 == 0) {
                ((android.animation.AnimatorSet) this.a).playTogether(arrayList2);
            } else if (i2 == 1) {
                ((android.animation.AnimatorSet) this.a).playSequentially(arrayList2);
            }
        }
        a(this.a);
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void b() {
        android.animation.Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
            this.a = null;
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void b(int i) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void c(int i) {
        this.e = i;
    }
}
