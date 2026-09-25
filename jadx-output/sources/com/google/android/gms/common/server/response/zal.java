package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zal> CREATOR = new com.google.android.gms.common.server.response.zak();
    private final int versionCode;
    final java.lang.String zarm;
    final com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> zarn;

    zal(int i, java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field) {
        this.versionCode = i;
        this.zarm = str;
        this.zarn = field;
    }

    zal(java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field) {
        this.versionCode = 1;
        this.zarm = str;
        this.zarn = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zarm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zarn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
