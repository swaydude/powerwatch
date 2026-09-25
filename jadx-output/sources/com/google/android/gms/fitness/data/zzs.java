package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs implements android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.data.Goal[] newArray(int i) {
        return new com.google.android.gms.fitness.data.Goal[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.data.Goal createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j = 0;
        com.google.android.gms.fitness.data.Goal.Recurrence recurrence = null;
        com.google.android.gms.fitness.data.Goal.MetricObjective metricObjective = null;
        com.google.android.gms.fitness.data.Goal.DurationObjective durationObjective = null;
        com.google.android.gms.fitness.data.Goal.FrequencyObjective frequencyObjective = null;
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readList(parcel, header, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    recurrence = (com.google.android.gms.fitness.data.Goal.Recurrence) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.fitness.data.Goal.Recurrence.CREATOR);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    metricObjective = (com.google.android.gms.fitness.data.Goal.MetricObjective) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.fitness.data.Goal.MetricObjective.CREATOR);
                    break;
                case 7:
                    durationObjective = (com.google.android.gms.fitness.data.Goal.DurationObjective) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.fitness.data.Goal.DurationObjective.CREATOR);
                    break;
                case 8:
                    frequencyObjective = (com.google.android.gms.fitness.data.Goal.FrequencyObjective) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.fitness.data.Goal.FrequencyObjective.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.fitness.data.Goal(j2, j, arrayList, recurrence, i, metricObjective, durationObjective, frequencyObjective);
    }
}
