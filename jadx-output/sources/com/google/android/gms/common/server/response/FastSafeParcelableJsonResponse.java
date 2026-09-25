package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse extends com.google.android.gms.common.server.response.FastJsonResponse implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getValueObject(java.lang.String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(java.lang.String str) {
        return false;
    }

    public byte[] toByteArray() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                iHashCode = (iHashCode * 31) + getFieldValue(field).hashCode();
            }
        }
        return iHashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse = (com.google.android.gms.common.server.response.FastJsonResponse) obj;
        for (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                if (!fastJsonResponse.isFieldSet(field) || !getFieldValue(field).equals(fastJsonResponse.getFieldValue(field))) {
                    return false;
                }
            } else if (fastJsonResponse.isFieldSet(field)) {
                return false;
            }
        }
        return true;
    }
}
