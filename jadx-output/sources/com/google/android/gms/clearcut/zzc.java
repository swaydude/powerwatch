package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.clearcut.zzc> CREATOR = new com.google.android.gms.clearcut.zzd();
    private final boolean zzad;
    private final long zzae;
    private final long zzaf;

    public zzc(boolean z, long j, long j2) {
        this.zzad = z;
        this.zzae = j;
        this.zzaf = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.clearcut.zzc) {
            com.google.android.gms.clearcut.zzc zzcVar = (com.google.android.gms.clearcut.zzc) obj;
            if (this.zzad == zzcVar.zzad && this.zzae == zzcVar.zzae && this.zzaf == zzcVar.zzaf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zzad), java.lang.Long.valueOf(this.zzae), java.lang.Long.valueOf(this.zzaf));
    }

    public final java.lang.String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.zzad + ",collectForDebugStartTimeMillis: " + this.zzae + ",collectForDebugExpiryTimeMillis: " + this.zzaf + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zzad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzaf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
