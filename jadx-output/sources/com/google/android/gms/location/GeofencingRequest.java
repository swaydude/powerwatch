package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class GeofencingRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.GeofencingRequest> CREATOR = new com.google.android.gms.location.zzq();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final java.lang.String tag;
    private final java.util.List<com.google.android.gms.internal.location.zzbh> zzap;
    private final int zzaq;

    public static final class Builder {
        private final java.util.List<com.google.android.gms.internal.location.zzbh> zzap = new java.util.ArrayList();
        private int zzaq = 5;
        private java.lang.String tag = "";

        public final com.google.android.gms.location.GeofencingRequest.Builder addGeofence(com.google.android.gms.location.Geofence geofence) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(geofence, "geofence can't be null.");
            com.google.android.gms.common.internal.Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbh, "Geofence must be created using Geofence.Builder.");
            this.zzap.add((com.google.android.gms.internal.location.zzbh) geofence);
            return this;
        }

        public final com.google.android.gms.location.GeofencingRequest.Builder addGeofences(java.util.List<com.google.android.gms.location.Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (com.google.android.gms.location.Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public final com.google.android.gms.location.GeofencingRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzap.isEmpty(), "No geofence has been added to this request.");
            return new com.google.android.gms.location.GeofencingRequest(this.zzap, this.zzaq, this.tag);
        }

        public final com.google.android.gms.location.GeofencingRequest.Builder setInitialTrigger(int i) {
            this.zzaq = i & 7;
            return this;
        }
    }

    GeofencingRequest(java.util.List<com.google.android.gms.internal.location.zzbh> list, int i, java.lang.String str) {
        this.zzap = list;
        this.zzaq = i;
        this.tag = str;
    }

    public java.util.List<com.google.android.gms.location.Geofence> getGeofences() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zzap);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzaq;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.zzap);
        int i = this.zzaq;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        java.lang.String strValueOf = java.lang.String.valueOf(this.tag);
        sb.append(strValueOf.length() != 0 ? "tag=".concat(strValueOf) : new java.lang.String("tag="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zzap, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
