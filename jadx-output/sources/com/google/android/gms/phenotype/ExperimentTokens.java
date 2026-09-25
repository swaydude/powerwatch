package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public class ExperimentTokens extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private static final byte[][] zzn;
    private static final com.google.android.gms.phenotype.ExperimentTokens zzo;
    private final java.lang.String zzp;
    private final byte[] zzq;
    private final byte[][] zzr;
    private final byte[][] zzs;
    private final byte[][] zzt;
    private final byte[][] zzu;
    private final int[] zzv;
    private final byte[][] zzw;
    public static final android.os.Parcelable.Creator<com.google.android.gms.phenotype.ExperimentTokens> CREATOR = new com.google.android.gms.phenotype.zzh();
    private static final com.google.android.gms.phenotype.ExperimentTokens.zza zzx = new com.google.android.gms.phenotype.zzd();
    private static final com.google.android.gms.phenotype.ExperimentTokens.zza zzy = new com.google.android.gms.phenotype.zze();
    private static final com.google.android.gms.phenotype.ExperimentTokens.zza zzz = new com.google.android.gms.phenotype.zzf();
    private static final com.google.android.gms.phenotype.ExperimentTokens.zza zzaa = new com.google.android.gms.phenotype.zzg();

    /* JADX INFO: Access modifiers changed from: private */
    interface zza {
    }

    static {
        byte[][] bArr = new byte[0][];
        zzn = bArr;
        zzo = new com.google.android.gms.phenotype.ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    public ExperimentTokens(java.lang.String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.zzp = str;
        this.zzq = bArr;
        this.zzr = bArr2;
        this.zzs = bArr3;
        this.zzt = bArr4;
        this.zzu = bArr5;
        this.zzv = iArr;
        this.zzw = bArr6;
    }

    private static java.util.List<java.lang.Integer> zza(int[] iArr) {
        if (iArr == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private static java.util.List<java.lang.String> zza(byte[][] bArr) {
        if (bArr == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(android.util.Base64.encodeToString(bArr2, 3));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private static void zza(java.lang.StringBuilder sb, java.lang.String str, byte[][] bArr) {
        java.lang.String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(android.util.Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.phenotype.ExperimentTokens) {
            com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) obj;
            if (com.google.android.gms.phenotype.zzn.equals(this.zzp, experimentTokens.zzp) && java.util.Arrays.equals(this.zzq, experimentTokens.zzq) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzr), zza(experimentTokens.zzr)) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzs), zza(experimentTokens.zzs)) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzt), zza(experimentTokens.zzt)) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzu), zza(experimentTokens.zzu)) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzv), zza(experimentTokens.zzv)) && com.google.android.gms.phenotype.zzn.equals(zza(this.zzw), zza(experimentTokens.zzw))) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentTokens");
        sb.append("(");
        java.lang.String str = this.zzp;
        if (str == null) {
            string = "null";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2);
            sb2.append("'");
            sb2.append(str);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", ");
        byte[] bArr = this.zzq;
        sb.append("direct");
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(android.util.Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        zza(sb, "GAIA", this.zzr);
        sb.append(", ");
        zza(sb, "PSEUDO", this.zzs);
        sb.append(", ");
        zza(sb, "ALWAYS", this.zzt);
        sb.append(", ");
        zza(sb, "OTHER", this.zzu);
        sb.append(", ");
        int[] iArr = this.zzv;
        sb.append("weak");
        sb.append("=");
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        zza(sb, "directs", this.zzw);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 4, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 5, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 6, this.zzt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 8, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 9, this.zzw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
