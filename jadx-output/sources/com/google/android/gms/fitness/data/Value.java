package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Value extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Value> CREATOR = new com.google.android.gms.fitness.data.zzal();
    private final int format;
    private float value;
    private boolean zzmo;
    private java.lang.String zzmp;
    private java.util.Map<java.lang.String, com.google.android.gms.fitness.data.MapValue> zzmq;
    private int[] zzmr;
    private float[] zzms;
    private byte[] zzmt;

    public Value(int i) {
        this(i, false, 0.0f, null, null, null, null, null);
    }

    Value(int i, boolean z, float f, java.lang.String str, android.os.Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        androidx.collection.ArrayMap arrayMap;
        this.format = i;
        this.zzmo = z;
        this.value = f;
        this.zzmp = str;
        if (bundle == null) {
            arrayMap = null;
        } else {
            bundle.setClassLoader(com.google.android.gms.fitness.data.MapValue.class.getClassLoader());
            arrayMap = new androidx.collection.ArrayMap(bundle.size());
            for (java.lang.String str2 : bundle.keySet()) {
                arrayMap.put(str2, (com.google.android.gms.fitness.data.MapValue) bundle.getParcelable(str2));
            }
        }
        this.zzmq = arrayMap;
        this.zzmr = iArr;
        this.zzms = fArr;
        this.zzmt = bArr;
    }

    @java.lang.Deprecated
    public final void setInt(int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.zzmo = true;
        this.value = java.lang.Float.intBitsToFloat(i);
    }

    @java.lang.Deprecated
    public final void setFloat(float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.zzmo = true;
        this.value = f;
    }

    @java.lang.Deprecated
    public final void setString(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.zzmo = true;
        this.zzmp = str;
    }

    @java.lang.Deprecated
    public final void setKeyValue(java.lang.String str, float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzmo = true;
        if (this.zzmq == null) {
            this.zzmq = new java.util.HashMap();
        }
        this.zzmq.put(str, com.google.android.gms.fitness.data.MapValue.zza(f));
    }

    @java.lang.Deprecated
    public final void clearKey(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        java.util.Map<java.lang.String, com.google.android.gms.fitness.data.MapValue> map = this.zzmq;
        if (map != null) {
            map.remove(str);
        }
    }

    @java.lang.Deprecated
    public final void zza(java.util.Map<java.lang.String, java.lang.Float> map) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 4, "Attempting to set a float map value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzmo = true;
        this.zzmq = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Float> entry : map.entrySet()) {
            this.zzmq.put(entry.getKey(), com.google.android.gms.fitness.data.MapValue.zza(entry.getValue().floatValue()));
        }
    }

    @java.lang.Deprecated
    public final void setActivity(java.lang.String str) {
        setInt(com.google.android.gms.internal.fitness.zzjn.zzp(str));
    }

    public final boolean isSet() {
        return this.zzmo;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int asInt() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 1, "Value is not in int format");
        return java.lang.Float.floatToRawIntBits(this.value);
    }

    public final float asFloat() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 2, "Value is not in float format");
        return this.value;
    }

    public final java.lang.String asString() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 3, "Value is not in string format");
        return this.zzmp;
    }

    public final java.lang.Float getKeyValue(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 4, "Value is not in float map format");
        java.util.Map<java.lang.String, com.google.android.gms.fitness.data.MapValue> map = this.zzmq;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return java.lang.Float.valueOf(this.zzmq.get(str).asFloat());
    }

    public final java.lang.String asActivity() {
        return com.google.android.gms.internal.fitness.zzjn.getName(asInt());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Value)) {
            return false;
        }
        com.google.android.gms.fitness.data.Value value = (com.google.android.gms.fitness.data.Value) obj;
        int i = this.format;
        if (i == value.format && this.zzmo == value.zzmo) {
            switch (i) {
                case 1:
                    if (asInt() == value.asInt()) {
                        return true;
                    }
                    break;
                case 2:
                    return this.value == value.value;
                case 3:
                    return com.google.android.gms.common.internal.Objects.equal(this.zzmp, value.zzmp);
                case 4:
                    return com.google.android.gms.common.internal.Objects.equal(this.zzmq, value.zzmq);
                case 5:
                    return java.util.Arrays.equals(this.zzmr, value.zzmr);
                case 6:
                    return java.util.Arrays.equals(this.zzms, value.zzms);
                case 7:
                    return java.util.Arrays.equals(this.zzmt, value.zzmt);
                default:
                    if (this.value == value.value) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(this.value), this.zzmp, this.zzmq, this.zzmr, this.zzms, this.zzmt);
    }

    public final java.lang.String toString() {
        if (!this.zzmo) {
            return "unset";
        }
        switch (this.format) {
            case 1:
                return java.lang.Integer.toString(asInt());
            case 2:
                return java.lang.Float.toString(this.value);
            case 3:
                return this.zzmp;
            case 4:
                return new java.util.TreeMap(this.zzmq).toString();
            case 5:
                return java.util.Arrays.toString(this.zzmr);
            case 6:
                return java.util.Arrays.toString(this.zzms);
            case 7:
                byte[] bArr = this.zzmt;
                return com.google.android.gms.common.util.HexDumpUtils.dump(bArr, 0, bArr.length, false);
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getFormat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isSet());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.value);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzmp, false);
        if (this.zzmq == null) {
            bundle = null;
        } else {
            bundle = new android.os.Bundle(this.zzmq.size());
            for (java.util.Map.Entry<java.lang.String, com.google.android.gms.fitness.data.MapValue> entry : this.zzmq.entrySet()) {
                bundle.putParcelable(entry.getKey(), entry.getValue());
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 6, this.zzmr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(parcel, 7, this.zzms, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 8, this.zzmt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
