package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class BinderWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = new com.google.android.gms.common.internal.zza();
    private android.os.IBinder zzcz;

    public BinderWrapper() {
        this.zzcz = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BinderWrapper(android.os.IBinder iBinder) {
        this.zzcz = null;
        this.zzcz = iBinder;
    }

    private BinderWrapper(android.os.Parcel parcel) {
        this.zzcz = null;
        this.zzcz = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzcz);
    }

    /* synthetic */ BinderWrapper(android.os.Parcel parcel, com.google.android.gms.common.internal.zza zzaVar) {
        this(parcel);
    }
}
