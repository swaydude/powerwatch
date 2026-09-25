package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zza extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.vision.face.internal.client.zza> CREATOR = new com.google.android.gms.vision.face.internal.client.zzc();
    public final int type;
    public final android.graphics.PointF[] zzcx;

    public zza(android.graphics.PointF[] pointFArr, int i) {
        this.zzcx = pointFArr;
        this.type = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zzcx, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.type);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
