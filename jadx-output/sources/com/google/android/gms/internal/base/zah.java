package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zah extends android.graphics.drawable.Drawable.ConstantState {
    int mChangingConfigurations;
    int zaoa;

    zah(com.google.android.gms.internal.base.zah zahVar) {
        if (zahVar != null) {
            this.mChangingConfigurations = zahVar.mChangingConfigurations;
            this.zaoa = zahVar.zaoa;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new com.google.android.gms.internal.base.zae(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }
}
