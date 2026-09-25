package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zam> CREATOR = new com.google.android.gms.common.server.response.zan();
    final java.lang.String className;
    private final int versionCode;
    final java.util.ArrayList<com.google.android.gms.common.server.response.zal> zaro;

    zam(int i, java.lang.String str, java.util.ArrayList<com.google.android.gms.common.server.response.zal> arrayList) {
        this.versionCode = i;
        this.className = str;
        this.zaro = arrayList;
    }

    zam(java.lang.String str, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map) {
        java.util.ArrayList<com.google.android.gms.common.server.response.zal> arrayList;
        this.versionCode = 1;
        this.className = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList<>();
            for (java.lang.String str2 : map.keySet()) {
                arrayList.add(new com.google.android.gms.common.server.response.zal(str2, map.get(str2)));
            }
        }
        this.zaro = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.className, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zaro, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
