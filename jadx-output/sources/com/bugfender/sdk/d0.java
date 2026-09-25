package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends com.bugfender.sdk.n implements android.text.TextWatcher {
    private final com.bugfender.sdk.k1 e;
    private final boolean f;
    private final boolean g;
    private android.widget.EditText h;
    private java.util.Timer i;

    private static class b extends java.util.TimerTask {
        private final int a;
        private final java.lang.String b;
        private final com.bugfender.sdk.k1 c;
        private final boolean d;
        private final boolean e;

        private b(int i, java.lang.String str, com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
            this.a = i;
            this.b = str;
            this.c = k1Var;
            this.d = z;
            this.e = z2;
        }

        private void a(java.lang.String str) {
            if (this.d) {
                com.bugfender.sdk.d1.a(com.bugfender.sdk.n.d, str);
            }
            if (this.e) {
                this.c.a(com.bugfender.sdk.n.d, str);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTextChanged in EditText with { id: " + this.a);
            if (this.b != null) {
                sb.append(", text: ");
                sb.append(this.b);
            }
            sb.append(" }");
            a(sb.toString());
        }
    }

    public d0(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        super(k1Var, z, z2);
        this.e = k1Var;
        this.f = z;
        this.g = z2;
    }

    private static boolean a(android.widget.EditText editText) {
        int inputType = editText.getInputType();
        return inputType == 129 || inputType == 145 || (com.bugfender.sdk.v1.a() && inputType == 225) || ((com.bugfender.sdk.v1.a() && inputType == 18) || (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod));
    }

    @Override // com.bugfender.sdk.n, com.bugfender.sdk.f3
    public void a() {
        this.h.addTextChangedListener(null);
        this.h = null;
        java.util.Timer timer = this.i;
        if (timer != null) {
            timer.purge();
            this.i = null;
        }
        super.a();
    }

    @Override // com.bugfender.sdk.f3
    public <T extends android.view.View> void a(T t) {
        android.widget.EditText editText = (android.widget.EditText) t;
        this.h = editText;
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.util.Timer timer = new java.util.Timer();
        this.i = timer;
        timer.schedule(new com.bugfender.sdk.d0.b(this.h.getId(), a(this.h) ? null : editable.toString(), this.e, this.f, this.g), 600L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.util.Timer timer = this.i;
        if (timer != null) {
            timer.cancel();
        }
    }
}
