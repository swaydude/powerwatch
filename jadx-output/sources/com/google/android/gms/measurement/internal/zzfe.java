package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends com.google.android.gms.internal.measurement.zza implements com.google.android.gms.measurement.internal.zzfc {
    zzfe(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzanVar);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(1, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzkz zzkzVar, com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzkzVar);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(2, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(4, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzanVar);
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzb(5, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zzb(com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(6, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(com.google.android.gms.measurement.internal.zzm zzmVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        android.os.Parcel parcelZza = zza(7, parcelA_);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.measurement.internal.zzkz.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final byte[] zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzanVar);
        parcelA_.writeString(str);
        android.os.Parcel parcelZza = zza(9, parcelA_);
        byte[] bArrCreateByteArray = parcelZza.createByteArray();
        parcelZza.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeLong(j);
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        zzb(10, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.lang.String zzc(com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        android.os.Parcel parcelZza = zza(11, parcelA_);
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzv zzvVar, com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzvVar);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(12, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzv zzvVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzvVar);
        zzb(13, parcelA_);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        android.os.Parcel parcelZza = zza(14, parcelA_);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.measurement.internal.zzkz.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        android.os.Parcel parcelZza = zza(15, parcelA_);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.measurement.internal.zzkz.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        android.os.Parcel parcelZza = zza(16, parcelA_);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.measurement.internal.zzv.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        android.os.Parcel parcelZza = zza(17, parcelA_);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(com.google.android.gms.measurement.internal.zzv.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zzd(com.google.android.gms.measurement.internal.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzmVar);
        zzb(18, parcelA_);
    }
}
