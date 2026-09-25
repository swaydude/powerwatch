package com.baidu.mapapi.animation;

/* JADX INFO: loaded from: classes.dex */
public class SingleScaleAnimation extends com.baidu.mapapi.animation.Animation {

    public enum ScaleType {
        SCALE_X,
        SCALE_Y
    }

    public SingleScaleAnimation(com.baidu.mapapi.animation.SingleScaleAnimation.ScaleType scaleType, float... fArr) {
        com.baidu.mapsdkplatform.comapi.a.j jVar;
        if (fArr == null || fArr.length == 0) {
            throw new java.lang.NullPointerException("BDMapSDKException: the scales is null");
        }
        if (scaleType == com.baidu.mapapi.animation.SingleScaleAnimation.ScaleType.SCALE_X) {
            jVar = new com.baidu.mapsdkplatform.comapi.a.j(1, fArr);
        } else if (scaleType != com.baidu.mapapi.animation.SingleScaleAnimation.ScaleType.SCALE_Y) {
            return;
        } else {
            jVar = new com.baidu.mapsdkplatform.comapi.a.j(2, fArr);
        }
        this.bdAnimation = jVar;
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
