package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSettingsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsRequest> CREATOR = new com.google.android.gms.location.zzag();
    private final java.util.List<com.google.android.gms.location.LocationRequest> zzbg;
    private final boolean zzbh;
    private final boolean zzbi;
    private com.google.android.gms.location.zzae zzbj;

    public static final class Builder {
        private final java.util.ArrayList<com.google.android.gms.location.LocationRequest> zzbk = new java.util.ArrayList<>();
        private boolean zzbh = false;
        private boolean zzbi = false;
        private com.google.android.gms.location.zzae zzbj = null;

        public final com.google.android.gms.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<com.google.android.gms.location.LocationRequest> collection) {
            for (com.google.android.gms.location.LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zzbk.add(locationRequest);
                }
            }
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder addLocationRequest(com.google.android.gms.location.LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zzbk.add(locationRequest);
            }
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest build() {
            return new com.google.android.gms.location.LocationSettingsRequest(this.zzbk, this.zzbh, this.zzbi, null);
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder setAlwaysShow(boolean z) {
            this.zzbh = z;
            return this;
        }

        public final com.google.android.gms.location.LocationSettingsRequest.Builder setNeedBle(boolean z) {
            this.zzbi = z;
            return this;
        }
    }

    LocationSettingsRequest(java.util.List<com.google.android.gms.location.LocationRequest> list, boolean z, boolean z2, com.google.android.gms.location.zzae zzaeVar) {
        this.zzbg = list;
        this.zzbh = z;
        this.zzbi = z2;
        this.zzbj = zzaeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, java.util.Collections.unmodifiableList(this.zzbg), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzbh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzbi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzbj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
