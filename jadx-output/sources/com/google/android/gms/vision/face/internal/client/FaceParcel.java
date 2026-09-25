package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class FaceParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.vision.face.internal.client.FaceParcel> CREATOR = new com.google.android.gms.vision.face.internal.client.zzd();
    public final float centerX;
    public final float centerY;
    public final float height;
    public final int id;
    private final int versionCode;
    public final float width;
    public final float zzce;
    public final float zzcf;
    public final float zzcg;
    public final float zzch;
    public final float zzcz;
    public final float zzda;
    public final float zzdb;
    public final com.google.android.gms.vision.face.internal.client.LandmarkParcel[] zzdc;
    public final com.google.android.gms.vision.face.internal.client.zza[] zzdd;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, com.google.android.gms.vision.face.internal.client.LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, com.google.android.gms.vision.face.internal.client.zza[] zzaVarArr, float f11) {
        this.versionCode = i;
        this.id = i2;
        this.centerX = f;
        this.centerY = f2;
        this.width = f3;
        this.height = f4;
        this.zzcz = f5;
        this.zzda = f6;
        this.zzdb = f7;
        this.zzdc = landmarkParcelArr;
        this.zzce = f8;
        this.zzcf = f9;
        this.zzcg = f10;
        this.zzdd = zzaVarArr;
        this.zzch = f11;
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, com.google.android.gms.vision.face.internal.client.LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new com.google.android.gms.vision.face.internal.client.zza[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.id);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.centerX);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, this.centerY);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, this.width);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, this.height);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, this.zzcz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 8, this.zzda);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 9, this.zzdc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 10, this.zzce);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, this.zzcf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 12, this.zzcg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 13, this.zzdd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 14, this.zzdb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, this.zzch);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
