package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.vision.zzaj> CREATOR = new com.google.android.gms.internal.vision.zzam();
    private final float zzdo;
    public final java.lang.String zzec;
    public final com.google.android.gms.internal.vision.zzw zzei;
    private final com.google.android.gms.internal.vision.zzw zzej;
    public final java.lang.String zzel;
    private final com.google.android.gms.internal.vision.zzag[] zzer;
    private final boolean zzes;

    public zzaj(com.google.android.gms.internal.vision.zzag[] zzagVarArr, com.google.android.gms.internal.vision.zzw zzwVar, com.google.android.gms.internal.vision.zzw zzwVar2, java.lang.String str, float f, java.lang.String str2, boolean z) {
        this.zzer = zzagVarArr;
        this.zzei = zzwVar;
        this.zzej = zzwVar2;
        this.zzel = str;
        this.zzdo = f;
        this.zzec = str2;
        this.zzes = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zzer, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzei, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzej, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzel, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, this.zzdo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzec, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzes);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
