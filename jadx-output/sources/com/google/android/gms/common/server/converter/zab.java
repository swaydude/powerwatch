package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.zab> CREATOR = new com.google.android.gms.common.server.converter.zaa();
    private final int zali;
    private final com.google.android.gms.common.server.converter.StringToIntConverter zapz;

    zab(int i, com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter) {
        this.zali = i;
        this.zapz = stringToIntConverter;
    }

    private zab(com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter) {
        this.zali = 1;
        this.zapz = stringToIntConverter;
    }

    public static com.google.android.gms.common.server.converter.zab zaa(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof com.google.android.gms.common.server.converter.StringToIntConverter) {
            return new com.google.android.gms.common.server.converter.zab((com.google.android.gms.common.server.converter.StringToIntConverter) fieldConverter);
        }
        throw new java.lang.IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> zacg() {
        com.google.android.gms.common.server.converter.StringToIntConverter stringToIntConverter = this.zapz;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new java.lang.IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zapz, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
