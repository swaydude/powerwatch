package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class IconRequest {
    public final java.lang.String hash;
    public final int height;
    public final int iconResourceId;
    public final int width;

    public IconRequest(java.lang.String str, int i, int i2, int i3) {
        this.hash = str;
        this.iconResourceId = i;
        this.width = i2;
        this.height = i3;
    }

    public static io.fabric.sdk.android.services.settings.IconRequest build(android.content.Context context, java.lang.String str) {
        if (str != null) {
            try {
                int appIconResourceId = io.fabric.sdk.android.services.common.CommonUtils.getAppIconResourceId(context);
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "App icon resource ID is " + appIconResourceId);
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeResource(context.getResources(), appIconResourceId, options);
                return new io.fabric.sdk.android.services.settings.IconRequest(str, appIconResourceId, options.outWidth, options.outHeight);
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to load icon", e);
            }
        }
        return null;
    }
}
