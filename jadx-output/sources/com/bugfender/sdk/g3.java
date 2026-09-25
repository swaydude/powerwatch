package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class g3 {
    public static com.bugfender.sdk.f3 a(android.view.View view, com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        if ((view instanceof android.widget.Button) && !(view instanceof android.widget.CompoundButton)) {
            return new com.bugfender.sdk.p(k1Var, z, z2);
        }
        if (view instanceof android.widget.SeekBar) {
            return new com.bugfender.sdk.e2(k1Var, z, z2);
        }
        if (view instanceof android.widget.EditText) {
            return new com.bugfender.sdk.d0(k1Var, z, z2);
        }
        if (view instanceof android.widget.Spinner) {
            return new com.bugfender.sdk.s2(k1Var, z, z2);
        }
        if (view instanceof android.widget.CompoundButton) {
            return new com.bugfender.sdk.w2(k1Var, z, z2);
        }
        return null;
    }
}
