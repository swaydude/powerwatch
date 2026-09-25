package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends androidx.appcompat.widget.AppCompatEditText {
    public TextInputEditText(android.content.Context context) {
        this(context, null);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.editTextStyle);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && android.os.Build.MANUFACTURER.equalsIgnoreCase("Meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private java.lang.CharSequence getHintFromLayout() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }
}
