package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
class ClearTextEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_DURATION = 100;
    private static final int ANIMATION_SCALE_DURATION = 150;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private final android.text.TextWatcher clearTextEndIconTextWatcher;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener clearTextOnEditTextAttachedListener;
    private android.animation.AnimatorSet iconInAnim;
    private android.animation.ValueAnimator iconOutAnim;

    ClearTextEndIconDelegate(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.clearTextEndIconTextWatcher = new android.text.TextWatcher() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                if (!com.google.android.material.textfield.ClearTextEndIconDelegate.hasText(editable)) {
                    com.google.android.material.textfield.ClearTextEndIconDelegate.this.iconInAnim.cancel();
                    com.google.android.material.textfield.ClearTextEndIconDelegate.this.iconOutAnim.start();
                } else {
                    if (com.google.android.material.textfield.ClearTextEndIconDelegate.this.textInputLayout.isEndIconVisible()) {
                        return;
                    }
                    com.google.android.material.textfield.ClearTextEndIconDelegate.this.iconOutAnim.cancel();
                    com.google.android.material.textfield.ClearTextEndIconDelegate.this.iconInAnim.start();
                }
            }
        };
        this.clearTextOnEditTextAttachedListener = new com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(com.google.android.material.textfield.TextInputLayout textInputLayout2) {
                android.widget.EditText editText = textInputLayout2.getEditText();
                textInputLayout2.setEndIconVisible(com.google.android.material.textfield.ClearTextEndIconDelegate.hasText(editText.getText()));
                textInputLayout2.setEndIconCheckable(false);
                editText.removeTextChangedListener(com.google.android.material.textfield.ClearTextEndIconDelegate.this.clearTextEndIconTextWatcher);
                editText.addTextChangedListener(com.google.android.material.textfield.ClearTextEndIconDelegate.this.clearTextEndIconTextWatcher);
            }
        };
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
        this.textInputLayout.setEndIconDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.context, com.google.android.material.R.drawable.mtrl_ic_cancel));
        this.textInputLayout.setEndIconContentDescription(this.textInputLayout.getResources().getText(com.google.android.material.R.string.clear_text_end_icon_content_description));
        this.textInputLayout.setEndIconOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.textInputLayout.getEditText().setText((java.lang.CharSequence) null);
            }
        });
        this.textInputLayout.addOnEditTextAttachedListener(this.clearTextOnEditTextAttachedListener);
        initAnimators();
    }

    private void initAnimators() {
        android.animation.ValueAnimator scaleAnimator = getScaleAnimator();
        android.animation.ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.iconInAnim.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.textInputLayout.setEndIconVisible(true);
            }
        });
        android.animation.ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.textInputLayout.setEndIconVisible(false);
            }
        });
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endIconView.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    private android.animation.ValueAnimator getScaleAnimator() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(ANIMATION_SCALE_FROM_VALUE, 1.0f);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endIconView.setScaleX(fFloatValue);
                com.google.android.material.textfield.ClearTextEndIconDelegate.this.endIconView.setScaleY(fFloatValue);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasText(android.text.Editable editable) {
        return editable.length() > 0;
    }
}
