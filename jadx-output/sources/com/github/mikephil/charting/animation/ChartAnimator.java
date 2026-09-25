package com.github.mikephil.charting.animation;

/* JADX INFO: loaded from: classes.dex */
public class ChartAnimator {
    private android.animation.ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator() {
    }

    public ChartAnimator(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.EasingFunction easingFunction, com.github.mikephil.charting.animation.EasingFunction easingFunction2) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction2);
        objectAnimatorOfFloat.setDuration(i2);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(easingFunction);
        objectAnimatorOfFloat2.setDuration(i);
        if (i > i2) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i, com.github.mikephil.charting.animation.EasingFunction easingFunction) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i, com.github.mikephil.charting.animation.EasingFunction easingFunction) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.Easing.EasingOption easingOption, com.github.mikephil.charting.animation.Easing.EasingOption easingOption2) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(com.github.mikephil.charting.animation.Easing.getEasingFunctionFromOption(easingOption2));
        objectAnimatorOfFloat.setDuration(i2);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(com.github.mikephil.charting.animation.Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat2.setDuration(i);
        if (i > i2) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i, com.github.mikephil.charting.animation.Easing.EasingOption easingOption) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(com.github.mikephil.charting.animation.Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i, com.github.mikephil.charting.animation.Easing.EasingOption easingOption) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(com.github.mikephil.charting.animation.Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateXY(int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i2);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(i);
        if (i > i2) {
            objectAnimatorOfFloat2.addUpdateListener(this.mListener);
        } else {
            objectAnimatorOfFloat.addUpdateListener(this.mListener);
        }
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat.start();
    }

    public void animateX(int i) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public void animateY(int i) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.addUpdateListener(this.mListener);
        objectAnimatorOfFloat.start();
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseY(float f) {
        this.mPhaseY = f;
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public void setPhaseX(float f) {
        this.mPhaseX = f;
    }
}
