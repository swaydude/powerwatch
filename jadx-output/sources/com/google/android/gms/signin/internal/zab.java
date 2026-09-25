package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zab> CREATOR = new com.google.android.gms.signin.internal.zaa();
    private final int versionCode;
    private int zasv;
    private android.content.Intent zasw;

    zab(int i, int i2, android.content.Intent intent) {
        this.versionCode = i;
        this.zasv = i2;
        this.zasw = intent;
    }

    public zab() {
        this(0, null);
    }

    private zab(int i, android.content.Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        if (this.zasv == 0) {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        return com.google.android.gms.common.api.Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zasv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zasw, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
