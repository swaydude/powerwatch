package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.clearcut.zze> CREATOR = new com.google.android.gms.clearcut.zzf();
    public final com.google.android.gms.internal.clearcut.zzha zzaa;
    public com.google.android.gms.internal.clearcut.zzr zzag;
    public byte[] zzah;
    private int[] zzai;
    private java.lang.String[] zzaj;
    private int[] zzak;
    private byte[][] zzal;
    private com.google.android.gms.phenotype.ExperimentTokens[] zzam;
    public final com.google.android.gms.clearcut.ClearcutLogger.zzb zzan;
    public final com.google.android.gms.clearcut.ClearcutLogger.zzb zzt;
    private boolean zzz;

    public zze(com.google.android.gms.internal.clearcut.zzr zzrVar, com.google.android.gms.internal.clearcut.zzha zzhaVar, com.google.android.gms.clearcut.ClearcutLogger.zzb zzbVar, com.google.android.gms.clearcut.ClearcutLogger.zzb zzbVar2, int[] iArr, java.lang.String[] strArr, int[] iArr2, byte[][] bArr, com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr, boolean z) {
        this.zzag = zzrVar;
        this.zzaa = zzhaVar;
        this.zzt = zzbVar;
        this.zzan = null;
        this.zzai = iArr;
        this.zzaj = null;
        this.zzak = iArr2;
        this.zzal = null;
        this.zzam = null;
        this.zzz = z;
    }

    zze(com.google.android.gms.internal.clearcut.zzr zzrVar, byte[] bArr, int[] iArr, java.lang.String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr) {
        this.zzag = zzrVar;
        this.zzah = bArr;
        this.zzai = iArr;
        this.zzaj = strArr;
        this.zzaa = null;
        this.zzt = null;
        this.zzan = null;
        this.zzak = iArr2;
        this.zzal = bArr2;
        this.zzam = experimentTokensArr;
        this.zzz = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.clearcut.zze) {
            com.google.android.gms.clearcut.zze zzeVar = (com.google.android.gms.clearcut.zze) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzag, zzeVar.zzag) && java.util.Arrays.equals(this.zzah, zzeVar.zzah) && java.util.Arrays.equals(this.zzai, zzeVar.zzai) && java.util.Arrays.equals(this.zzaj, zzeVar.zzaj) && com.google.android.gms.common.internal.Objects.equal(this.zzaa, zzeVar.zzaa) && com.google.android.gms.common.internal.Objects.equal(this.zzt, zzeVar.zzt) && com.google.android.gms.common.internal.Objects.equal(this.zzan, zzeVar.zzan) && java.util.Arrays.equals(this.zzak, zzeVar.zzak) && java.util.Arrays.deepEquals(this.zzal, zzeVar.zzal) && java.util.Arrays.equals(this.zzam, zzeVar.zzam) && this.zzz == zzeVar.zzz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzag, this.zzah, this.zzai, this.zzaj, this.zzaa, this.zzt, this.zzan, this.zzak, this.zzal, this.zzam, java.lang.Boolean.valueOf(this.zzz));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEventParcelable[");
        sb.append(this.zzag);
        sb.append(", LogEventBytes: ");
        sb.append(this.zzah == null ? null : new java.lang.String(this.zzah));
        sb.append(", TestCodes: ");
        sb.append(java.util.Arrays.toString(this.zzai));
        sb.append(", MendelPackages: ");
        sb.append(java.util.Arrays.toString(this.zzaj));
        sb.append(", LogEvent: ");
        sb.append(this.zzaa);
        sb.append(", ExtensionProducer: ");
        sb.append(this.zzt);
        sb.append(", VeProducer: ");
        sb.append(this.zzan);
        sb.append(", ExperimentIDs: ");
        sb.append(java.util.Arrays.toString(this.zzak));
        sb.append(", ExperimentTokens: ");
        sb.append(java.util.Arrays.toString(this.zzal));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(java.util.Arrays.toString(this.zzam));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.zzz);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzag, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzah, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 4, this.zzai, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 5, this.zzaj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 6, this.zzak, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzal, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 9, this.zzam, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
