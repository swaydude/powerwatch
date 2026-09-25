package com.baidu.mapsdkplatform.comapi.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.baidu.mapsdkplatform.comapi.a.c {
    private android.animation.Animator a = null;
    private long b = 0;
    private android.view.animation.Interpolator c = null;
    private com.baidu.mapapi.animation.Animation.AnimationListener d = null;
    private int e = 1;
    private int f = 0;
    private float[] g;

    public f(float... fArr) {
        this.g = fArr;
    }

    android.animation.ObjectAnimator a(com.baidu.mapapi.map.Marker marker) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(marker, "rotate", this.g);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(this.f);
            objectAnimatorOfFloat.setRepeatMode(c());
            objectAnimatorOfFloat.setDuration(this.b);
            android.view.animation.Interpolator interpolator = this.c;
            if (interpolator != null) {
                objectAnimatorOfFloat.setInterpolator(interpolator);
            }
        }
        return objectAnimatorOfFloat;
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
        this.e = i;
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
        animator.addListener(new com.baidu.mapsdkplatform.comapi.a.g(this));
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(android.view.animation.Interpolator interpolator) {
        this.c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.animation.Animation.AnimationListener animationListener) {
        this.d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void a(com.baidu.mapapi.map.Marker marker, com.baidu.mapapi.animation.Animation animation) {
        android.animation.ObjectAnimator objectAnimatorA = a(marker);
        this.a = objectAnimatorA;
        a(objectAnimatorA);
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
        if (i > 0 || i == -1) {
            this.f = i;
        }
    }

    public int c() {
        return this.e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.a.c
    public void c(int i) {
    }
}
