package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class WebImage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.images.WebImage> CREATOR = new com.google.android.gms.common.images.zae();
    private final int zali;
    private final android.net.Uri zani;
    private final int zanj;
    private final int zank;

    WebImage(int i, android.net.Uri uri, int i2, int i3) {
        this.zali = i;
        this.zani = uri;
        this.zanj = i2;
        this.zank = i3;
    }

    public WebImage(android.net.Uri uri, int i, int i2) throws java.lang.IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(android.net.Uri uri) throws java.lang.IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(org.json.JSONObject jSONObject) throws java.lang.IllegalArgumentException {
        this(zaa(jSONObject), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, 0), jSONObject.optInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, 0));
    }

    private static android.net.Uri zaa(org.json.JSONObject jSONObject) {
        if (jSONObject.has("url")) {
            try {
                return android.net.Uri.parse(jSONObject.getString("url"));
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    public final android.net.Uri getUrl() {
        return this.zani;
    }

    public final int getWidth() {
        return this.zanj;
    }

    public final int getHeight() {
        return this.zank;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Image %dx%d %s", java.lang.Integer.valueOf(this.zanj), java.lang.Integer.valueOf(this.zank), this.zani.toString());
    }

    public final org.json.JSONObject toJson() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.zani.toString());
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, this.zanj);
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, this.zank);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof com.google.android.gms.common.images.WebImage)) {
            com.google.android.gms.common.images.WebImage webImage = (com.google.android.gms.common.images.WebImage) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zani, webImage.zani) && this.zanj == webImage.zanj && this.zank == webImage.zank) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zani, java.lang.Integer.valueOf(this.zanj), java.lang.Integer.valueOf(this.zank));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getHeight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
