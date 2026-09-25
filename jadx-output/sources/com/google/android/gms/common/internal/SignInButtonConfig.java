package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class SignInButtonConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.SignInButtonConfig> CREATOR = new com.google.android.gms.common.internal.zao();
    private final int zali;

    @java.lang.Deprecated
    private final com.google.android.gms.common.api.Scope[] zaoc;
    private final int zapr;
    private final int zaps;

    SignInButtonConfig(int i, int i2, int i3, com.google.android.gms.common.api.Scope[] scopeArr) {
        this.zali = i;
        this.zapr = i2;
        this.zaps = i3;
        this.zaoc = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, com.google.android.gms.common.api.Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    public int getButtonSize() {
        return this.zapr;
    }

    public int getColorScheme() {
        return this.zaps;
    }

    @java.lang.Deprecated
    public com.google.android.gms.common.api.Scope[] getScopes() {
        return this.zaoc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getButtonSize());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getColorScheme());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 4, getScopes(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
