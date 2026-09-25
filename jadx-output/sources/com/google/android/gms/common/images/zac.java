package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zac extends com.google.android.gms.common.images.zab {
    private java.lang.ref.WeakReference<com.google.android.gms.common.images.ImageManager.OnImageLoadedListener> zang;

    public zac(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(onImageLoadedListener);
        this.zang = new java.lang.ref.WeakReference<>(onImageLoadedListener);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zamz);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.images.zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.common.images.zac zacVar = (com.google.android.gms.common.images.zac) obj;
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener = this.zang.get();
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener2 = zacVar.zang.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && com.google.android.gms.common.internal.Objects.equal(onImageLoadedListener2, onImageLoadedListener) && com.google.android.gms.common.internal.Objects.equal(zacVar.zamz, this.zamz);
    }

    @Override // com.google.android.gms.common.images.zab
    protected final void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3) {
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z2 || (onImageLoadedListener = this.zang.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.zamz.uri, drawable, z3);
    }
}
