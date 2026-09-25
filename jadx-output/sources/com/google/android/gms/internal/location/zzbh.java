package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.location.Geofence {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbh> CREATOR = new com.google.android.gms.internal.location.zzbi();
    private final java.lang.String zzad;
    private final int zzae;
    private final short zzag;
    private final double zzah;
    private final double zzai;
    private final float zzaj;
    private final int zzak;
    private final int zzal;
    private final long zzdo;

    public zzbh(java.lang.String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new java.lang.String("requestId is null or too long: "));
        }
        if (f <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
        this.zzag = s;
        this.zzad = str;
        this.zzah = d;
        this.zzai = d2;
        this.zzaj = f;
        this.zzdo = j;
        this.zzae = i4;
        this.zzak = i2;
        this.zzal = i3;
    }

    public static com.google.android.gms.internal.location.zzbh zza(byte[] bArr) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        com.google.android.gms.internal.location.zzbh zzbhVarCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return zzbhVarCreateFromParcel;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.location.zzbh)) {
            return false;
        }
        com.google.android.gms.internal.location.zzbh zzbhVar = (com.google.android.gms.internal.location.zzbh) obj;
        return this.zzaj == zzbhVar.zzaj && this.zzah == zzbhVar.zzah && this.zzai == zzbhVar.zzai && this.zzag == zzbhVar.zzag;
    }

    @Override // com.google.android.gms.location.Geofence
    public final java.lang.String getRequestId() {
        return this.zzad;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.zzah);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.zzai);
        return (((((((i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.zzaj)) * 31) + this.zzag) * 31) + this.zzae;
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = this.zzag != 1 ? null : "CIRCLE";
        objArr[1] = this.zzad.replaceAll("\\p{C}", "?");
        objArr[2] = java.lang.Integer.valueOf(this.zzae);
        objArr[3] = java.lang.Double.valueOf(this.zzah);
        objArr[4] = java.lang.Double.valueOf(this.zzai);
        objArr[5] = java.lang.Float.valueOf(this.zzaj);
        objArr[6] = java.lang.Integer.valueOf(this.zzak / 1000);
        objArr[7] = java.lang.Integer.valueOf(this.zzal);
        objArr[8] = java.lang.Long.valueOf(this.zzdo);
        return java.lang.String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getRequestId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzdo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(parcel, 3, this.zzag);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 4, this.zzah);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 5, this.zzai);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, this.zzaj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzak);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzal);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
