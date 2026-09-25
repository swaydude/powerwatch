package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zad extends com.google.android.gms.common.images.zab {
    private java.lang.ref.WeakReference<android.widget.ImageView> zanh;

    public zad(android.widget.ImageView imageView, android.net.Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zanh = new java.lang.ref.WeakReference<>(imageView);
    }

    public final int hashCode() {
        return 0;
    }

    public zad(android.widget.ImageView imageView, int i) {
        super(null, i);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zanh = new java.lang.ref.WeakReference<>(imageView);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.images.zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        android.widget.ImageView imageView = this.zanh.get();
        android.widget.ImageView imageView2 = ((com.google.android.gms.common.images.zad) obj).zanh.get();
        return (imageView2 == null || imageView == null || !com.google.android.gms.common.internal.Objects.equal(imageView2, imageView)) ? false : true;
    }

    @Override // com.google.android.gms.common.images.zab
    protected final void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3) {
        android.widget.ImageView imageView = this.zanh.get();
        if (imageView != null) {
            boolean z4 = (z2 || z3) ? false : true;
            if (z4 && (imageView instanceof com.google.android.gms.internal.base.zak)) {
                int iZacf = com.google.android.gms.internal.base.zak.zacf();
                if (this.zanb != 0 && iZacf == this.zanb) {
                    return;
                }
            }
            boolean zZaa = zaa(z, z2);
            if (zZaa) {
                android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.google.android.gms.internal.base.zae) {
                    drawable2 = ((com.google.android.gms.internal.base.zae) drawable2).zacd();
                }
                drawable = new com.google.android.gms.internal.base.zae(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof com.google.android.gms.internal.base.zak) {
                com.google.android.gms.internal.base.zak.zaa(z3 ? this.zamz.uri : null);
                com.google.android.gms.internal.base.zak.zai(z4 ? this.zanb : 0);
            }
            if (zZaa) {
                ((com.google.android.gms.internal.base.zae) drawable).startTransition(250);
            }
        }
    }
}
