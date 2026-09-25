package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zae extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private int mAlpha;
    private int mFrom;
    private boolean zand;
    private int zanl;
    private long zanm;
    private int zann;
    private int zano;
    private int zanp;
    private boolean zanq;
    private com.google.android.gms.internal.base.zah zanr;
    private android.graphics.drawable.Drawable zans;
    private android.graphics.drawable.Drawable zant;
    private boolean zanu;
    private boolean zanv;
    private boolean zanw;
    private int zanx;

    public zae(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this(null);
        drawable = drawable == null ? com.google.android.gms.internal.base.zaf.zany : drawable;
        this.zans = drawable;
        drawable.setCallback(this);
        com.google.android.gms.internal.base.zah zahVar = this.zanr;
        zahVar.zaoa = drawable.getChangingConfigurations() | zahVar.zaoa;
        drawable2 = drawable2 == null ? com.google.android.gms.internal.base.zaf.zany : drawable2;
        this.zant = drawable2;
        drawable2.setCallback(this);
        com.google.android.gms.internal.base.zah zahVar2 = this.zanr;
        zahVar2.zaoa = drawable2.getChangingConfigurations() | zahVar2.zaoa;
    }

    zae(com.google.android.gms.internal.base.zah zahVar) {
        this.zanl = 0;
        this.zano = 255;
        this.mAlpha = 0;
        this.zand = true;
        this.zanr = new com.google.android.gms.internal.base.zah(zahVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.zanr.mChangingConfigurations | this.zanr.zaoa;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.mAlpha == this.zano) {
            this.mAlpha = i;
        }
        this.zano = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.zans.setColorFilter(colorFilter);
        this.zant.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return java.lang.Math.max(this.zans.getIntrinsicWidth(), this.zant.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return java.lang.Math.max(this.zans.getIntrinsicHeight(), this.zant.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        this.zans.setBounds(rect);
        this.zant.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.zanr.mChangingConfigurations = getChangingConfigurations();
        return this.zanr;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zanw) {
            this.zanx = android.graphics.drawable.Drawable.resolveOpacity(this.zans.getOpacity(), this.zant.getOpacity());
            this.zanw = true;
        }
        return this.zanx;
    }

    private final boolean canConstantState() {
        if (!this.zanu) {
            this.zanv = (this.zans.getConstantState() == null || this.zant.getConstantState() == null) ? false : true;
            this.zanu = true;
        }
        return this.zanv;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        if (!this.zanq && super.mutate() == this) {
            if (!canConstantState()) {
                throw new java.lang.IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zans.mutate();
            this.zant.mutate();
            this.zanq = true;
        }
        return this;
    }

    public final android.graphics.drawable.Drawable zacd() {
        return this.zant;
    }

    public final void startTransition(int i) {
        this.mFrom = 0;
        this.zann = this.zano;
        this.mAlpha = 0;
        this.zanp = 250;
        this.zanl = 1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int i = this.zanl;
        boolean z = false;
        if (i == 1) {
            this.zanm = android.os.SystemClock.uptimeMillis();
            this.zanl = 2;
        } else if (i == 2 && this.zanm >= 0) {
            float fUptimeMillis = (android.os.SystemClock.uptimeMillis() - this.zanm) / this.zanp;
            boolean z2 = fUptimeMillis >= 1.0f;
            if (z2) {
                this.zanl = 0;
            }
            this.mAlpha = (int) ((this.zann * java.lang.Math.min(fUptimeMillis, 1.0f)) + 0.0f);
            z = z2;
        } else {
            z = true;
        }
        int i2 = this.mAlpha;
        boolean z3 = this.zand;
        android.graphics.drawable.Drawable drawable = this.zans;
        android.graphics.drawable.Drawable drawable2 = this.zant;
        if (z) {
            if (!z3 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.zano;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.zano - i2);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.zano);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zano);
        }
        invalidateSelf();
    }
}
