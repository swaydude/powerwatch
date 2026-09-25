package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_GLUCOSE_ISO151972003 = 8;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_GLUCOSE_ISO151972013 = 9;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_AAMI = 3;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_A_A = 4;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_A_B = 5;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_B_A = 6;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_B_B = 7;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_ESH2002 = 1;

    @java.lang.Deprecated
    public static final int DATA_QUALITY_BLOOD_PRESSURE_ESH2010 = 2;
    public static final java.lang.String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final java.lang.String name;
    private final int type;
    private final com.google.android.gms.fitness.data.DataType zzhz;
    private final com.google.android.gms.fitness.data.Device zzjf;
    private final com.google.android.gms.fitness.data.zzc zzjg;
    private final java.lang.String zzjh;
    private final int[] zzji;
    private final java.lang.String zzjj;
    private static final int[] zzje = new int[0];
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataSource> CREATOR = new com.google.android.gms.fitness.data.zzk();

    public DataSource(com.google.android.gms.fitness.data.DataType dataType, java.lang.String str, int i, com.google.android.gms.fitness.data.Device device, com.google.android.gms.fitness.data.zzc zzcVar, java.lang.String str2, int[] iArr) {
        this.zzhz = dataType;
        this.type = i;
        this.name = str;
        this.zzjf = device;
        this.zzjg = zzcVar;
        this.zzjh = str2;
        this.zzjj = zzm();
        this.zzji = iArr == null ? zzje : iArr;
    }

    public static java.lang.String zzd(int i) {
        switch (i) {
            case 1:
                return "blood_pressure_esh2002";
            case 2:
                return "blood_pressure_esh2010";
            case 3:
                return "blood_pressure_aami";
            case 4:
                return "blood_pressure_bhs_a_a";
            case 5:
                return "blood_pressure_bhs_a_b";
            case 6:
                return "blood_pressure_bhs_b_a";
            case 7:
                return "blood_pressure_bhs_b_b";
            case 8:
                return "blood_glucose_iso151972003";
            case 9:
                return "blood_glucose_iso151972013";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static final class Builder {
        private java.lang.String name;
        private com.google.android.gms.fitness.data.DataType zzhz;
        private com.google.android.gms.fitness.data.Device zzjf;
        private com.google.android.gms.fitness.data.zzc zzjg;
        private int[] zzji;
        private int type = -1;
        private java.lang.String zzjh = "";

        public final com.google.android.gms.fitness.data.DataSource.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            this.zzhz = dataType;
            return this;
        }

        public final com.google.android.gms.fitness.data.DataSource.Builder setType(int i) {
            this.type = i;
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.fitness.data.DataSource.Builder setName(java.lang.String str) {
            this.name = str;
            return this;
        }

        public final com.google.android.gms.fitness.data.DataSource.Builder setDevice(com.google.android.gms.fitness.data.Device device) {
            this.zzjf = device;
            return this;
        }

        public final com.google.android.gms.fitness.data.DataSource.Builder setAppPackageName(java.lang.String str) {
            this.zzjg = com.google.android.gms.fitness.data.zzc.zza(str);
            return this;
        }

        public final com.google.android.gms.fitness.data.DataSource.Builder setAppPackageName(android.content.Context context) {
            return setAppPackageName(context.getPackageName());
        }

        public final com.google.android.gms.fitness.data.DataSource.Builder setStreamName(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str != null, "Must specify a valid stream name");
            this.zzjh = str;
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.fitness.data.DataSource.Builder setDataQualityStandards(int... iArr) {
            this.zzji = iArr;
            return this;
        }

        public final com.google.android.gms.fitness.data.DataSource build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzhz != null, "Must set data type");
            com.google.android.gms.common.internal.Preconditions.checkState(this.type >= 0, "Must set data source type");
            return new com.google.android.gms.fitness.data.DataSource(this);
        }
    }

    private DataSource(com.google.android.gms.fitness.data.DataSource.Builder builder) {
        this.zzhz = builder.zzhz;
        this.type = builder.type;
        this.name = builder.name;
        this.zzjf = builder.zzjf;
        this.zzjg = builder.zzjg;
        this.zzjh = builder.zzjh;
        this.zzjj = zzm();
        this.zzji = builder.zzji;
    }

    public static com.google.android.gms.fitness.data.DataSource extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_SOURCE, CREATOR);
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzhz;
    }

    public int getType() {
        return this.type;
    }

    @java.lang.Deprecated
    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getAppPackageName() {
        com.google.android.gms.fitness.data.zzc zzcVar = this.zzjg;
        if (zzcVar == null) {
            return null;
        }
        return zzcVar.getPackageName();
    }

    public final com.google.android.gms.fitness.data.zzc zzl() {
        return this.zzjg;
    }

    public com.google.android.gms.fitness.data.Device getDevice() {
        return this.zzjf;
    }

    public java.lang.String getStreamName() {
        return this.zzjh;
    }

    @java.lang.Deprecated
    public int[] getDataQualityStandards() {
        return this.zzji;
    }

    public java.lang.String getStreamIdentifier() {
        return this.zzjj;
    }

    private final java.lang.String zzm() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getTypeString());
        sb.append(":");
        sb.append(this.zzhz.getName());
        if (this.zzjg != null) {
            sb.append(":");
            sb.append(this.zzjg.getPackageName());
        }
        if (this.zzjf != null) {
            sb.append(":");
            sb.append(this.zzjf.getStreamIdentifier());
        }
        if (this.zzjh != null) {
            sb.append(":");
            sb.append(this.zzjh);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.fitness.data.DataSource) {
            return this.zzjj.equals(((com.google.android.gms.fitness.data.DataSource) obj).zzjj);
        }
        return false;
    }

    public int hashCode() {
        return this.zzjj.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSource{");
        sb.append(getTypeString());
        if (this.name != null) {
            sb.append(":");
            sb.append(this.name);
        }
        if (this.zzjg != null) {
            sb.append(":");
            sb.append(this.zzjg);
        }
        if (this.zzjf != null) {
            sb.append(":");
            sb.append(this.zzjf);
        }
        if (this.zzjh != null) {
            sb.append(":");
            sb.append(this.zzjh);
        }
        sb.append(":");
        sb.append(this.zzhz);
        sb.append("}");
        return sb.toString();
    }

    public final java.lang.String toDebugString() {
        java.lang.String str;
        java.lang.String strConcat;
        java.lang.String string;
        int i = this.type;
        if (i != 0) {
            str = i != 1 ? "?" : "d";
        } else {
            str = "r";
        }
        java.lang.String strZzp = this.zzhz.zzp();
        com.google.android.gms.fitness.data.zzc zzcVar = this.zzjg;
        java.lang.String strConcat2 = "";
        if (zzcVar == null) {
            strConcat = "";
        } else if (zzcVar.equals(com.google.android.gms.fitness.data.zzc.zzil)) {
            strConcat = ":gms";
        } else {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzjg.getPackageName());
            strConcat = strValueOf.length() != 0 ? ":".concat(strValueOf) : new java.lang.String(":");
        }
        com.google.android.gms.fitness.data.Device device = this.zzjf;
        if (device != null) {
            java.lang.String model = device.getModel();
            java.lang.String uid = this.zzjf.getUid();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(model).length() + 2 + java.lang.String.valueOf(uid).length());
            sb.append(":");
            sb.append(model);
            sb.append(":");
            sb.append(uid);
            string = sb.toString();
        } else {
            string = "";
        }
        java.lang.String str2 = this.zzjh;
        if (str2 != null) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(str2);
            strConcat2 = strValueOf2.length() != 0 ? ":".concat(strValueOf2) : new java.lang.String(":");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(strZzp).length() + java.lang.String.valueOf(strConcat).length() + java.lang.String.valueOf(string).length() + java.lang.String.valueOf(strConcat2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(strZzp);
        sb2.append(strConcat);
        sb2.append(string);
        sb2.append(strConcat2);
        return sb2.toString();
    }

    private final java.lang.String getTypeString() {
        return this.type != 0 ? "derived" : "raw";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getDevice(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzjg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getStreamName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 8, getDataQualityStandards(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
