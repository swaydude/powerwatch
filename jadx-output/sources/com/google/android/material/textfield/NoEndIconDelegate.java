package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
class NoEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    NoEndIconDelegate(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
        this.textInputLayout.setEndIconOnClickListener(null);
        this.textInputLayout.setEndIconDrawable((android.graphics.drawable.Drawable) null);
        this.textInputLayout.setEndIconContentDescription((java.lang.CharSequence) null);
    }
}
