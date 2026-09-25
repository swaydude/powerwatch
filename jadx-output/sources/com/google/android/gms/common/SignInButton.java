package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int mColor;
    private int mSize;
    private android.view.View zaau;
    private android.view.View.OnClickListener zaav;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(android.content.Context context) {
        this(context, null);
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zaav = null;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.mSize = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.mColor = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.mSize, this.mColor);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSize(int i) {
        setStyle(i, this.mColor);
    }

    public final void setColorScheme(int i) {
        setStyle(this.mSize, i);
    }

    @java.lang.Deprecated
    public final void setScopes(com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(this.mSize, this.mColor);
    }

    public final void setStyle(int i, int i2) {
        this.mSize = i;
        this.mColor = i2;
        android.content.Context context = getContext();
        android.view.View view = this.zaau;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zaau = com.google.android.gms.common.internal.SignInButtonCreator.createView(context, this.mSize, this.mColor);
        } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException unused) {
            android.util.Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.mSize;
            int i4 = this.mColor;
            com.google.android.gms.common.internal.SignInButtonImpl signInButtonImpl = new com.google.android.gms.common.internal.SignInButtonImpl(context);
            signInButtonImpl.configure(context.getResources(), i3, i4);
            this.zaau = signInButtonImpl;
        }
        addView(this.zaau);
        this.zaau.setEnabled(isEnabled());
        this.zaau.setOnClickListener(this);
    }

    @java.lang.Deprecated
    public final void setStyle(int i, int i2, com.google.android.gms.common.api.Scope[] scopeArr) {
        setStyle(i, i2);
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.zaav = onClickListener;
        android.view.View view = this.zaau;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zaau.setEnabled(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.zaav;
        if (onClickListener == null || view != this.zaau) {
            return;
        }
        onClickListener.onClick(this);
    }
}
