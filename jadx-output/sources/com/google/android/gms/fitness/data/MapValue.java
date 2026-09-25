package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class MapValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.MapValue> CREATOR = new com.google.android.gms.fitness.data.zzx();
    private final int format;
    private final float value;

    public MapValue(int i, float f) {
        this.format = i;
        this.value = f;
    }

    public static com.google.android.gms.fitness.data.MapValue zza(float f) {
        return new com.google.android.gms.fitness.data.MapValue(2, f);
    }

    public final float asFloat() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.format == 2, "Value is not in float format");
        return this.value;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.MapValue)) {
            return false;
        }
        com.google.android.gms.fitness.data.MapValue mapValue = (com.google.android.gms.fitness.data.MapValue) obj;
        int i = this.format;
        if (i == mapValue.format) {
            if (i != 2) {
                return this.value == mapValue.value;
            }
            if (asFloat() == mapValue.asFloat()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public java.lang.String toString() {
        return this.format != 2 ? "unknown" : java.lang.Float.toString(asFloat());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.format);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.value);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
