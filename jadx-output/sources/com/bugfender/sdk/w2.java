package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class w2 extends com.bugfender.sdk.n {
    private android.view.View e;

    private class b implements android.widget.CompoundButton.OnCheckedChangeListener {
        private final android.widget.CompoundButton.OnCheckedChangeListener a;

        private b(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.a = onCheckedChangeListener;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            com.bugfender.sdk.w2.this.a("OnCheckedChanged in CompoundButton (Switch / SwitchCompat) with { id: " + compoundButton.getId() + ", checked: " + z + " }");
            android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    public w2(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        super(k1Var, z, z2);
    }

    @Override // com.bugfender.sdk.n, com.bugfender.sdk.f3
    public void a() {
        ((android.widget.CompoundButton) this.e).setOnCheckedChangeListener(null);
        this.e = null;
        super.a();
    }

    @Override // com.bugfender.sdk.f3
    public <T extends android.view.View> void a(T t) {
        this.e = t;
        ((android.widget.CompoundButton) t).setOnCheckedChangeListener(new com.bugfender.sdk.w2.b(com.bugfender.sdk.c1.a(t)));
    }
}
