package com.baidu.mapapi.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class Animation {
    public com.baidu.mapsdkplatform.comapi.a.c bdAnimation;

    public interface AnimationListener {
        void onAnimationCancel();

        void onAnimationEnd();

        void onAnimationRepeat();

        void onAnimationStart();
    }

    public enum RepeatMode {
        RESTART,
        REVERSE
    }

    protected Animation() {
    }

    public abstract void cancel();

    public abstract void setAnimationListener(com.baidu.mapapi.animation.Animation.AnimationListener animationListener);

    public abstract void setDuration(long j);

    public abstract void setInterpolator(android.view.animation.Interpolator interpolator);
}
