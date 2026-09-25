package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private android.content.res.ColorStateList mButtonTintList = null;
    private android.graphics.PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final android.widget.CompoundButton mView;

    interface DirectSetButtonDrawableInterface {
        void setButtonDrawable(android.graphics.drawable.Drawable drawable);
    }

    AppCompatCompoundButtonHelper(android.widget.CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.CompoundButton, i, 0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonCompat) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    android.widget.CompoundButton compoundButton = this.mView;
                    compoundButton.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton.getContext(), resourceId2));
                    z = true;
                } catch (android.content.res.Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_android_button) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.CompoundButton_android_button, 0)) != 0) {
                android.widget.CompoundButton compoundButton2 = this.mView;
                compoundButton2.setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTint)) {
                androidx.core.widget.CompoundButtonCompat.setButtonTintList(this.mView, typedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.CompoundButton_buttonTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode)) {
                androidx.core.widget.CompoundButtonCompat.setButtonTintMode(this.mView, androidx.appcompat.widget.DrawableUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    android.content.res.ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    void applyButtonTint() {
        android.graphics.drawable.Drawable buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawableMutate, this.mButtonTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(drawableMutate);
            }
        }
    }

    int getCompoundPaddingLeft(int i) {
        android.graphics.drawable.Drawable buttonDrawable;
        return (android.os.Build.VERSION.SDK_INT >= 17 || (buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this.mView)) == null) ? i : i + buttonDrawable.getIntrinsicWidth();
    }
}
