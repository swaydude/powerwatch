package com.baidu.mapapi.animation;

/* JADX INFO: loaded from: classes.dex */
public class AlphaAnimation extends com.baidu.mapapi.animation.Animation {
    public AlphaAnimation(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            throw new java.lang.NullPointerException("BDMapSDKException: the alphas is null");
        }
        this.bdAnimation = new com.baidu.mapsdkplatform.comapi.a.a(fArr);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
        this.bdAnimation.b();
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(com.baidu.mapapi.animation.Animation.AnimationListener animationListener) {
        this.bdAnimation.a(animationListener);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j) {
        this.bdAnimation.a(j);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.bdAnimation.a(interpolator);
    }

    public void setRepeatCount(int i) {
        this.bdAnimation.b(i);
    }

    public void setRepeatMode(com.baidu.mapapi.animation.Animation.RepeatMode repeatMode) {
        com.baidu.mapsdkplatform.comapi.a.c cVar;
        int i;
        if (repeatMode == com.baidu.mapapi.animation.Animation.RepeatMode.RESTART) {
            cVar = this.bdAnimation;
            i = 1;
        } else {
            if (repeatMode != com.baidu.mapapi.animation.Animation.RepeatMode.REVERSE) {
                return;
            }
            cVar = this.bdAnimation;
            i = 2;
        }
        cVar.a(i);
    }
}
