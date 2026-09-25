package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zab {
    final com.google.android.gms.common.images.zaa zamz;
    protected int zanb;
    private int zana = 0;
    private boolean zanc = false;
    private boolean zand = true;
    private boolean zane = false;
    private boolean zanf = true;

    public zab(android.net.Uri uri, int i) {
        this.zanb = 0;
        this.zamz = new com.google.android.gms.common.images.zaa(uri);
        this.zanb = i;
    }

    protected abstract void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3);

    final void zaa(android.content.Context context, android.graphics.Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(bitmap);
        zaa(new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    final void zaa(android.content.Context context, com.google.android.gms.internal.base.zaj zajVar) {
        if (this.zanf) {
            zaa(null, false, true, false);
        }
    }

    final void zaa(android.content.Context context, com.google.android.gms.internal.base.zaj zajVar, boolean z) {
        int i = this.zanb;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    protected final boolean zaa(boolean z, boolean z2) {
        return (!this.zand || z2 || z) ? false : true;
    }
}
