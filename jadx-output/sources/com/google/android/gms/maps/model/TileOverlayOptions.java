package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class TileOverlayOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.TileOverlayOptions> CREATOR = new com.google.android.gms.maps.model.zzu();
    private float zzcs;
    private boolean zzct;
    private float zzda;
    private com.google.android.gms.internal.maps.zzaf zzei;
    private com.google.android.gms.maps.model.TileProvider zzej;
    private boolean zzek;

    public TileOverlayOptions() {
        this.zzct = true;
        this.zzek = true;
        this.zzda = 0.0f;
    }

    TileOverlayOptions(android.os.IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.zzct = true;
        this.zzek = true;
        this.zzda = 0.0f;
        com.google.android.gms.internal.maps.zzaf zzafVarZzk = com.google.android.gms.internal.maps.zzag.zzk(iBinder);
        this.zzei = zzafVarZzk;
        this.zzej = zzafVarZzk == null ? null : new com.google.android.gms.maps.model.zzs(this);
        this.zzct = z;
        this.zzcs = f;
        this.zzek = z2;
        this.zzda = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzei.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions tileProvider(com.google.android.gms.maps.model.TileProvider tileProvider) {
        this.zzej = tileProvider;
        this.zzei = tileProvider == null ? null : new com.google.android.gms.maps.model.zzt(this, tileProvider);
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions fadeIn(boolean z) {
        this.zzek = z;
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions transparency(float f) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.zzda = f;
        return this;
    }

    public final com.google.android.gms.maps.model.TileProvider getTileProvider() {
        return this.zzej;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final boolean getFadeIn() {
        return this.zzek;
    }

    public final float getTransparency() {
        return this.zzda;
    }
}
