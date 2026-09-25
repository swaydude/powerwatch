package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class MapStyleOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.MapStyleOptions> CREATOR = new com.google.android.gms.maps.model.zzg();
    private static final java.lang.String TAG = "MapStyleOptions";
    private java.lang.String zzdl;

    public MapStyleOptions(java.lang.String str) {
        this.zzdl = str;
    }

    public static com.google.android.gms.maps.model.MapStyleOptions loadRawResourceStyle(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        try {
            return new com.google.android.gms.maps.model.MapStyleOptions(new java.lang.String(com.google.android.gms.common.util.IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
        } catch (java.io.IOException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(strValueOf);
            throw new android.content.res.Resources.NotFoundException(sb.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzdl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
