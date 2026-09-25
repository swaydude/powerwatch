package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Comparable<com.google.android.gms.phenotype.zzi> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.phenotype.zzi> CREATOR = new com.google.android.gms.phenotype.zzk();
    private static final java.util.Comparator<com.google.android.gms.phenotype.zzi> zzai = new com.google.android.gms.phenotype.zzj();
    public final java.lang.String name;
    private final long zzab;
    private final boolean zzac;
    private final double zzad;
    private final java.lang.String zzae;
    private final byte[] zzaf;
    private final int zzag;
    public final int zzah;

    public zzi(java.lang.String str, long j, boolean z, double d, java.lang.String str2, byte[] bArr, int i, int i2) {
        this.name = str;
        this.zzab = j;
        this.zzac = z;
        this.zzad = d;
        this.zzae = str2;
        this.zzaf = bArr;
        this.zzag = i;
        this.zzah = i2;
    }

    private static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.google.android.gms.phenotype.zzi zziVar) {
        com.google.android.gms.phenotype.zzi zziVar2 = zziVar;
        int iCompareTo = this.name.compareTo(zziVar2.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = compare(this.zzag, zziVar2.zzag);
        if (iCompare != 0) {
            return iCompare;
        }
        int i = this.zzag;
        if (i == 1) {
            long j = this.zzab;
            long j2 = zziVar2.zzab;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.zzac;
            if (z == zziVar2.zzac) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return java.lang.Double.compare(this.zzad, zziVar2.zzad);
        }
        if (i == 4) {
            java.lang.String str = this.zzae;
            java.lang.String str2 = zziVar2.zzae;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            int i2 = this.zzag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("Invalid enum value: ");
            sb.append(i2);
            throw new java.lang.AssertionError(sb.toString());
        }
        byte[] bArr = this.zzaf;
        byte[] bArr2 = zziVar2.zzaf;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i3 = 0; i3 < java.lang.Math.min(this.zzaf.length, zziVar2.zzaf.length); i3++) {
            int i4 = this.zzaf[i3] - zziVar2.zzaf[i3];
            if (i4 != 0) {
                return i4;
            }
        }
        return compare(this.zzaf.length, zziVar2.zzaf.length);
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (obj instanceof com.google.android.gms.phenotype.zzi) {
            com.google.android.gms.phenotype.zzi zziVar = (com.google.android.gms.phenotype.zzi) obj;
            if (com.google.android.gms.phenotype.zzn.equals(this.name, zziVar.name) && (i = this.zzag) == zziVar.zzag && this.zzah == zziVar.zzah) {
                if (i != 1) {
                    if (i == 2) {
                        return this.zzac == zziVar.zzac;
                    }
                    if (i == 3) {
                        return this.zzad == zziVar.zzad;
                    }
                    if (i == 4) {
                        return com.google.android.gms.phenotype.zzn.equals(this.zzae, zziVar.zzae);
                    }
                    if (i == 5) {
                        return java.util.Arrays.equals(this.zzaf, zziVar.zzaf);
                    }
                    int i2 = this.zzag;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
                    sb.append("Invalid enum value: ");
                    sb.append(i2);
                    throw new java.lang.AssertionError(sb.toString());
                }
                if (this.zzab == zziVar.zzab) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String strEncodeToString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Flag(");
        sb.append(this.name);
        sb.append(", ");
        int i = this.zzag;
        if (i == 1) {
            sb.append(this.zzab);
        } else if (i == 2) {
            sb.append(this.zzac);
        } else if (i != 3) {
            if (i == 4) {
                sb.append("'");
                strEncodeToString = this.zzae;
            } else {
                if (i != 5) {
                    java.lang.String str = this.name;
                    int i2 = this.zzag;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27);
                    sb2.append("Invalid type: ");
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(i2);
                    throw new java.lang.AssertionError(sb2.toString());
                }
                if (this.zzaf == null) {
                    sb.append("null");
                } else {
                    sb.append("'");
                    strEncodeToString = android.util.Base64.encodeToString(this.zzaf, 3);
                }
            }
            sb.append(strEncodeToString);
            sb.append("'");
        } else {
            sb.append(this.zzad);
        }
        sb.append(", ");
        sb.append(this.zzag);
        sb.append(", ");
        sb.append(this.zzah);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 5, this.zzad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzae, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 7, this.zzaf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzag);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
