package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataType extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_ACTIVITY_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_CALORIES_EXPENDED;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_DISTANCE_DELTA;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEART_POINTS;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEART_RATE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEIGHT_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HYDRATION;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_LOCATION_BOUNDING_BOX;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_MOVE_MINUTES;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_NUTRITION_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_POWER_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_SPEED_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_STEP_COUNT_DELTA;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_WEIGHT_SUMMARY;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataType> CREATOR;
    public static final java.lang.String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.data.DataType TYPE_ACTIVITY_SAMPLES;
    public static final com.google.android.gms.fitness.data.DataType TYPE_ACTIVITY_SEGMENT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_BASAL_METABOLIC_RATE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_BODY_FAT_PERCENTAGE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CALORIES_EXPENDED;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_PEDALING_CADENCE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_WHEEL_REVOLUTION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_WHEEL_RPM;
    public static final com.google.android.gms.fitness.data.DataType TYPE_DISTANCE_CUMULATIVE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_DISTANCE_DELTA;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEART_POINTS;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEART_RATE_BPM;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEIGHT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HYDRATION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_LOCATION_SAMPLE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_LOCATION_TRACK;
    public static final com.google.android.gms.fitness.data.DataType TYPE_MOVE_MINUTES;
    public static final com.google.android.gms.fitness.data.DataType TYPE_NUTRITION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_POWER_SAMPLE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_SPEED;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_CADENCE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_CUMULATIVE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_DELTA;
    public static final com.google.android.gms.fitness.data.DataType TYPE_WEIGHT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_WORKOUT_EXERCISE;
    public static final com.google.android.gms.fitness.data.DataType zzjm;
    public static final com.google.android.gms.fitness.data.DataType zzjn;
    public static final com.google.android.gms.fitness.data.DataType zzjo;
    public static final com.google.android.gms.fitness.data.DataType zzjp;
    public static final com.google.android.gms.fitness.data.DataType zzjq;
    public static final com.google.android.gms.fitness.data.DataType zzjr;
    public static final com.google.android.gms.fitness.data.DataType zzjs;
    public static final com.google.android.gms.fitness.data.DataType zzjt;
    public static final com.google.android.gms.fitness.data.DataType zzju;
    private final java.lang.String name;
    private final java.util.List<com.google.android.gms.fitness.data.Field> zzjv;
    private final java.lang.String zzjw;
    private final java.lang.String zzjx;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static final class zza {
        public static final com.google.android.gms.fitness.data.DataType zzjk = new com.google.android.gms.fitness.data.DataType("com.google.internal.session.v2", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zza.zzlh);
        public static final com.google.android.gms.fitness.data.DataType zzjl = new com.google.android.gms.fitness.data.DataType("com.google.internal.session.v3", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zza.zzli);
    }

    public static java.util.List<com.google.android.gms.fitness.data.DataType> getAggregatesForInput(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.List<com.google.android.gms.fitness.data.DataType> list = com.google.android.gms.fitness.data.zza.zzik.get(dataType);
        return list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
    }

    private DataType(java.lang.String str, com.google.android.gms.fitness.data.Field... fieldArr) {
        this(str, (java.util.List<com.google.android.gms.fitness.data.Field>) java.util.Arrays.asList(fieldArr), (java.lang.String) null, (java.lang.String) null);
    }

    public DataType(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.fitness.data.Field... fieldArr) {
        this(str, (java.util.List<com.google.android.gms.fitness.data.Field>) java.util.Arrays.asList(fieldArr), str2, str3);
    }

    DataType(java.lang.String str, java.util.List<com.google.android.gms.fitness.data.Field> list, java.lang.String str2, java.lang.String str3) {
        this.name = str;
        this.zzjv = java.util.Collections.unmodifiableList(list);
        this.zzjw = str2;
        this.zzjx = str3;
    }

    public static java.lang.String getMimeType(com.google.android.gms.fitness.data.DataType dataType) {
        java.lang.String strValueOf = java.lang.String.valueOf(dataType.getName());
        return strValueOf.length() != 0 ? MIME_TYPE_PREFIX.concat(strValueOf) : new java.lang.String(MIME_TYPE_PREFIX);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<com.google.android.gms.fitness.data.Field> getFields() {
        return this.zzjv;
    }

    public final java.lang.String zzn() {
        return this.zzjw;
    }

    public final java.lang.String zzo() {
        return this.zzjx;
    }

    public final int indexOf(com.google.android.gms.fitness.data.Field field) {
        int iIndexOf = this.zzjv.indexOf(field);
        com.google.android.gms.common.internal.Preconditions.checkArgument(iIndexOf >= 0, "%s not a field of %s", field, this);
        return iIndexOf;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataType)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataType dataType = (com.google.android.gms.fitness.data.DataType) obj;
        return this.name.equals(dataType.name) && this.zzjv.equals(dataType.zzjv);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("DataType{%s%s}", this.name, this.zzjv);
    }

    public final java.lang.String zzp() {
        return this.name.startsWith("com.google.") ? this.name.substring(11) : this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getFields(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzjw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzjx, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        com.google.android.gms.fitness.data.DataType dataType = new com.google.android.gms.fitness.data.DataType("com.google.step_count.delta", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_STEPS);
        TYPE_STEP_COUNT_DELTA = dataType;
        TYPE_STEP_COUNT_CUMULATIVE = new com.google.android.gms.fitness.data.DataType("com.google.step_count.cumulative", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_STEPS);
        TYPE_STEP_COUNT_CADENCE = new com.google.android.gms.fitness.data.DataType("com.google.step_count.cadence", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_RPM);
        zzjm = new com.google.android.gms.fitness.data.DataType("com.google.internal.goal", com.google.android.gms.fitness.data.Field.zzkk);
        zzjn = new com.google.android.gms.fitness.data.DataType("com.google.internal.symptom", com.google.android.gms.fitness.data.Field.zzkl);
        zzjo = new com.google.android.gms.fitness.data.DataType("com.google.stride_model", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zzkm);
        TYPE_ACTIVITY_SEGMENT = new com.google.android.gms.fitness.data.DataType("com.google.activity.segment", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY);
        zzjp = new com.google.android.gms.fitness.data.DataType("com.google.floor_change", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY, com.google.android.gms.fitness.data.Field.FIELD_CONFIDENCE, com.google.android.gms.fitness.data.Field.zzko, com.google.android.gms.fitness.data.Field.zzkr);
        com.google.android.gms.fitness.data.DataType dataType2 = new com.google.android.gms.fitness.data.DataType("com.google.calories.expended", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_CALORIES);
        TYPE_CALORIES_EXPENDED = dataType2;
        TYPE_BASAL_METABOLIC_RATE = new com.google.android.gms.fitness.data.DataType("com.google.calories.bmr", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_CALORIES);
        TYPE_POWER_SAMPLE = new com.google.android.gms.fitness.data.DataType("com.google.power.sample", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_WATTS);
        TYPE_ACTIVITY_SAMPLES = new com.google.android.gms.fitness.data.DataType("com.google.activity.samples", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY_CONFIDENCE);
        zzjq = new com.google.android.gms.fitness.data.DataType("com.google.accelerometer", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zza.zzld, com.google.android.gms.fitness.data.Field.zza.zzle, com.google.android.gms.fitness.data.Field.zza.zzlf);
        zzjr = new com.google.android.gms.fitness.data.DataType("com.google.sensor.events", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zzku, com.google.android.gms.fitness.data.Field.zzkw, com.google.android.gms.fitness.data.Field.zzla);
        TYPE_HEART_RATE_BPM = new com.google.android.gms.fitness.data.DataType("com.google.heart_rate.bpm", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_BPM);
        TYPE_LOCATION_SAMPLE = new com.google.android.gms.fitness.data.DataType("com.google.location.sample", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_ACCURACY, com.google.android.gms.fitness.data.Field.FIELD_ALTITUDE);
        TYPE_LOCATION_TRACK = new com.google.android.gms.fitness.data.DataType("com.google.location.track", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_ACCURACY, com.google.android.gms.fitness.data.Field.FIELD_ALTITUDE);
        com.google.android.gms.fitness.data.DataType dataType3 = new com.google.android.gms.fitness.data.DataType("com.google.distance.delta", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_DISTANCE);
        TYPE_DISTANCE_DELTA = dataType3;
        TYPE_DISTANCE_CUMULATIVE = new com.google.android.gms.fitness.data.DataType("com.google.distance.cumulative", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_DISTANCE);
        TYPE_SPEED = new com.google.android.gms.fitness.data.DataType("com.google.speed", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_SPEED);
        TYPE_CYCLING_WHEEL_REVOLUTION = new com.google.android.gms.fitness.data.DataType("com.google.cycling.wheel_revolution.cumulative", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_REVOLUTIONS);
        TYPE_CYCLING_WHEEL_RPM = new com.google.android.gms.fitness.data.DataType("com.google.cycling.wheel_revolution.rpm", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_RPM);
        TYPE_CYCLING_PEDALING_CUMULATIVE = new com.google.android.gms.fitness.data.DataType("com.google.cycling.pedaling.cumulative", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_REVOLUTIONS);
        TYPE_CYCLING_PEDALING_CADENCE = new com.google.android.gms.fitness.data.DataType("com.google.cycling.pedaling.cadence", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_RPM);
        TYPE_HEIGHT = new com.google.android.gms.fitness.data.DataType("com.google.height", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_HEIGHT);
        TYPE_WEIGHT = new com.google.android.gms.fitness.data.DataType("com.google.weight", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_WEIGHT);
        TYPE_BODY_FAT_PERCENTAGE = new com.google.android.gms.fitness.data.DataType("com.google.body.fat.percentage", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_PERCENTAGE);
        TYPE_NUTRITION = new com.google.android.gms.fitness.data.DataType("com.google.nutrition", com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ, com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_NUTRIENTS, com.google.android.gms.fitness.data.Field.FIELD_MEAL_TYPE, com.google.android.gms.fitness.data.Field.FIELD_FOOD_ITEM);
        com.google.android.gms.fitness.data.DataType dataType4 = new com.google.android.gms.fitness.data.DataType("com.google.hydration", com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ, com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_VOLUME);
        TYPE_HYDRATION = dataType4;
        TYPE_WORKOUT_EXERCISE = new com.google.android.gms.fitness.data.DataType("com.google.activity.exercise", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_EXERCISE, com.google.android.gms.fitness.data.Field.FIELD_REPETITIONS, com.google.android.gms.fitness.data.Field.zzkh, com.google.android.gms.fitness.data.Field.FIELD_RESISTANCE_TYPE, com.google.android.gms.fitness.data.Field.FIELD_RESISTANCE);
        com.google.android.gms.fitness.data.DataType dataType5 = new com.google.android.gms.fitness.data.DataType("com.google.active_minutes", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_DURATION);
        TYPE_MOVE_MINUTES = dataType5;
        AGGREGATE_MOVE_MINUTES = dataType5;
        zzjs = new com.google.android.gms.fitness.data.DataType("com.google.device_on_body", com.google.android.gms.fitness.data.Field.zzlb);
        zzjt = new com.google.android.gms.fitness.data.DataType("com.google.internal.primary_device", com.google.android.gms.fitness.data.Field.zzkn);
        AGGREGATE_ACTIVITY_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.activity.summary", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY, com.google.android.gms.fitness.data.Field.FIELD_DURATION, com.google.android.gms.fitness.data.Field.FIELD_NUM_SEGMENTS);
        zzju = new com.google.android.gms.fitness.data.DataType("com.google.floor_change.summary", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.zzki, com.google.android.gms.fitness.data.Field.zzkj, com.google.android.gms.fitness.data.Field.zzkp, com.google.android.gms.fitness.data.Field.zzkq, com.google.android.gms.fitness.data.Field.zzks, com.google.android.gms.fitness.data.Field.zzkt);
        AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.calories.bmr.summary", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_STEP_COUNT_DELTA = dataType;
        AGGREGATE_DISTANCE_DELTA = dataType3;
        AGGREGATE_CALORIES_EXPENDED = dataType2;
        TYPE_HEART_POINTS = new com.google.android.gms.fitness.data.DataType("com.google.heart_minutes", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_INTENSITY);
        AGGREGATE_HEART_POINTS = new com.google.android.gms.fitness.data.DataType("com.google.heart_minutes.summary", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_INTENSITY, com.google.android.gms.fitness.data.Field.FIELD_DURATION);
        AGGREGATE_HEART_RATE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.heart_rate.summary", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_LOCATION_BOUNDING_BOX = new com.google.android.gms.fitness.data.DataType("com.google.location.bounding_box", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_LOW_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LOW_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_HIGH_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_HIGH_LONGITUDE);
        AGGREGATE_POWER_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.power.summary", com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ, com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_SPEED_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.speed.summary", com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ, com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.body.fat.percentage.summary", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_WEIGHT_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.weight.summary", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_HEIGHT_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.height.summary", com.google.android.gms.common.Scopes.FITNESS_BODY_READ, com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_NUTRITION_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.nutrition.summary", com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ, com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ_WRITE, com.google.android.gms.fitness.data.Field.FIELD_NUTRIENTS, com.google.android.gms.fitness.data.Field.FIELD_MEAL_TYPE);
        AGGREGATE_HYDRATION = dataType4;
        CREATOR = new com.google.android.gms.fitness.data.zzm();
    }
}
