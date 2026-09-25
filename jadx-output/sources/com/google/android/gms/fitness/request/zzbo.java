package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbo> CREATOR = new com.google.android.gms.fitness.request.zzbn();
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.fitness.data.DataSource zzia;
    private final com.google.android.gms.internal.fitness.zzcm zzok;

    zzbo(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.DataSource dataSource, android.os.IBinder iBinder) {
        this(dataType, dataSource, com.google.android.gms.internal.fitness.zzcp.zzj(iBinder));
    }

    public zzbo(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        com.google.android.gms.common.internal.Preconditions.checkArgument((dataType == null) != (dataSource == null), "Must specify exactly one of dataType and dataSource.");
        this.zzhz = dataType;
        this.zzia = dataSource;
        this.zzok = zzcmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzhz, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzia, i, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzok;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.google.android.gms.fitness.request.zzbo) {
                com.google.android.gms.fitness.request.zzbo zzboVar = (com.google.android.gms.fitness.request.zzbo) obj;
                if (com.google.android.gms.common.internal.Objects.equal(this.zzia, zzboVar.zzia) && com.google.android.gms.common.internal.Objects.equal(this.zzhz, zzboVar.zzhz)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzia, this.zzhz);
    }
}
