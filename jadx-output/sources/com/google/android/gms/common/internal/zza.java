package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
final class zza implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> {
    zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper[] newArray(int i) {
        return new com.google.android.gms.common.internal.BinderWrapper[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.BinderWrapper createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.common.internal.BinderWrapper(parcel, null);
    }
}
