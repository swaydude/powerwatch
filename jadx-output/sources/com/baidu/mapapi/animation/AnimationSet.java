package com.baidu.mapapi.animation;

/* JADX INFO: loaded from: classes.dex */
public class AnimationSet extends com.baidu.mapapi.animation.Animation {
    public AnimationSet() {
        this.bdAnimation = new com.baidu.mapsdkplatform.comapi.a.d();
    }

    public void addAnimation(com.baidu.mapapi.animation.Animation animation) {
        if (animation != null) {
            ((com.baidu.mapsdkplatform.comapi.a.d) this.bdAnimation).a(animation);
        }
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
        this.bdAnimation.b();
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(com.baidu.mapapi.animation.Animation.AnimationListener animationListener) {
        this.bdAnimation.a(animationListener);
    }

    public void setAnimatorSetMode(int i) {
        this.bdAnimation.c(i);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j) {
        this.bdAnimation.a(j);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.bdAnimation.a(interpolator);
    }
}
