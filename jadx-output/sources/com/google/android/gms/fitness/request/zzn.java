package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn implements android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataReadRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.request.DataReadRequest[] newArray(int i) {
        return new com.google.android.gms.fitness.request.DataReadRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.request.DataReadRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        java.util.ArrayList arrayListCreateTypedList = null;
        java.util.ArrayList arrayListCreateTypedList2 = null;
        java.util.ArrayList arrayListCreateTypedList3 = null;
        java.util.ArrayList arrayListCreateTypedList4 = null;
        com.google.android.gms.fitness.data.DataSource dataSource = null;
        android.os.IBinder iBinder = null;
        java.util.ArrayList arrayListCreateTypedList5 = null;
        java.util.ArrayList<java.lang.Integer> arrayListCreateIntegerList = null;
        java.util.ArrayList<java.lang.Long> arrayListCreateLongList = null;
        java.util.ArrayList<java.lang.Long> arrayListCreateLongList2 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.fitness.data.DataType.CREATOR);
                    break;
                case 2:
                    arrayListCreateTypedList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.fitness.data.DataSource.CREATOR);
                    break;
                case 3:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    arrayListCreateTypedList3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.fitness.data.DataType.CREATOR);
                    break;
                case 6:
                    arrayListCreateTypedList4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.fitness.data.DataSource.CREATOR);
                    break;
                case 7:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    dataSource = (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.fitness.data.DataSource.CREATOR);
                    break;
                case 10:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 11:
                case 15:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 12:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 16:
                    arrayListCreateTypedList5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.fitness.data.Device.CREATOR);
                    break;
                case 17:
                    arrayListCreateIntegerList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 18:
                    arrayListCreateLongList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongList(parcel, header);
                    break;
                case 19:
                    arrayListCreateLongList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongList(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.fitness.request.DataReadRequest(arrayListCreateTypedList, arrayListCreateTypedList2, j, j2, arrayListCreateTypedList3, arrayListCreateTypedList4, i, j3, dataSource, i2, z, z2, iBinder, arrayListCreateTypedList5, arrayListCreateIntegerList, arrayListCreateLongList, arrayListCreateLongList2);
    }
}
