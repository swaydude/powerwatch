package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzi implements android.os.Parcelable.Creator<com.google.firebase.iid.zzj> {
    zzi() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.firebase.iid.zzj[] newArray(int i) {
        return new com.google.firebase.iid.zzj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.firebase.iid.zzj createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            return new com.google.firebase.iid.zzj(strongBinder);
        }
        return null;
    }
}
