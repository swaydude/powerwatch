package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Field extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final java.lang.String NUTRIENT_CALCIUM = "calcium";
    public static final java.lang.String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final java.lang.String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final java.lang.String NUTRIENT_IRON = "iron";
    public static final java.lang.String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final java.lang.String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final java.lang.String NUTRIENT_POTASSIUM = "potassium";
    public static final java.lang.String NUTRIENT_PROTEIN = "protein";
    public static final java.lang.String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final java.lang.String NUTRIENT_SODIUM = "sodium";
    public static final java.lang.String NUTRIENT_SUGAR = "sugar";
    public static final java.lang.String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final java.lang.String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final java.lang.String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final java.lang.String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
    public static final java.lang.String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final java.lang.String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN = 0;
    private final int format;
    private final java.lang.String name;
    private final java.lang.Boolean zzlc;
    public static final com.google.android.gms.fitness.data.Field FIELD_ACTIVITY = zzc("activity");
    public static final com.google.android.gms.fitness.data.Field FIELD_CONFIDENCE = zze("confidence");

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.data.Field FIELD_ACTIVITY_CONFIDENCE = zzg("activity_confidence");
    public static final com.google.android.gms.fitness.data.Field FIELD_STEPS = zzc("steps");
    public static final com.google.android.gms.fitness.data.Field FIELD_STEP_LENGTH = zze("step_length");
    public static final com.google.android.gms.fitness.data.Field FIELD_DURATION = zzc("duration");
    public static final com.google.android.gms.fitness.data.Field zzkh = zzd("duration");
    public static final com.google.android.gms.fitness.data.Field zzki = zzg("activity_duration.ascending");
    public static final com.google.android.gms.fitness.data.Field zzkj = zzg("activity_duration.descending");
    public static final com.google.android.gms.fitness.data.Field FIELD_BPM = zze("bpm");
    public static final com.google.android.gms.fitness.data.Field FIELD_LATITUDE = zze("latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_LONGITUDE = zze("longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_ACCURACY = zze("accuracy");
    public static final com.google.android.gms.fitness.data.Field FIELD_ALTITUDE = zzf("altitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_DISTANCE = zze("distance");
    public static final com.google.android.gms.fitness.data.Field FIELD_HEIGHT = zze(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY);
    public static final com.google.android.gms.fitness.data.Field FIELD_WEIGHT = zze("weight");
    public static final com.google.android.gms.fitness.data.Field FIELD_CIRCUMFERENCE = zze("circumference");
    public static final com.google.android.gms.fitness.data.Field FIELD_PERCENTAGE = zze("percentage");
    public static final com.google.android.gms.fitness.data.Field FIELD_SPEED = zze("speed");
    public static final com.google.android.gms.fitness.data.Field FIELD_RPM = zze("rpm");
    public static final com.google.android.gms.fitness.data.Field zzkk = zzh("google.android.fitness.GoalV2");
    public static final com.google.android.gms.fitness.data.Field zzkl = zzh("symptom");
    public static final com.google.android.gms.fitness.data.Field zzkm = zzh("google.android.fitness.StrideModel");
    public static final com.google.android.gms.fitness.data.Field zzkn = zzh("google.android.fitness.Device");
    public static final com.google.android.gms.fitness.data.Field FIELD_REVOLUTIONS = zzc("revolutions");
    public static final java.lang.String NUTRIENT_CALORIES = "calories";
    public static final com.google.android.gms.fitness.data.Field FIELD_CALORIES = zze(NUTRIENT_CALORIES);
    public static final com.google.android.gms.fitness.data.Field FIELD_WATTS = zze("watts");
    public static final com.google.android.gms.fitness.data.Field FIELD_VOLUME = zze("volume");
    public static final com.google.android.gms.fitness.data.Field FIELD_MEAL_TYPE = zzd("meal_type");
    public static final com.google.android.gms.fitness.data.Field FIELD_FOOD_ITEM = new com.google.android.gms.fitness.data.Field("food_item", 3, true);
    public static final com.google.android.gms.fitness.data.Field FIELD_NUTRIENTS = zzg("nutrients");
    public static final com.google.android.gms.fitness.data.Field zzko = zze("elevation.change");
    public static final com.google.android.gms.fitness.data.Field zzkp = zzg("elevation.gain");
    public static final com.google.android.gms.fitness.data.Field zzkq = zzg("elevation.loss");
    public static final com.google.android.gms.fitness.data.Field zzkr = zze("floors");
    public static final com.google.android.gms.fitness.data.Field zzks = zzg("floor.gain");
    public static final com.google.android.gms.fitness.data.Field zzkt = zzg("floor.loss");
    public static final com.google.android.gms.fitness.data.Field FIELD_EXERCISE = new com.google.android.gms.fitness.data.Field("exercise", 3);
    public static final com.google.android.gms.fitness.data.Field FIELD_REPETITIONS = zzd("repetitions");
    public static final com.google.android.gms.fitness.data.Field FIELD_RESISTANCE = zzf("resistance");
    public static final com.google.android.gms.fitness.data.Field FIELD_RESISTANCE_TYPE = zzd("resistance_type");
    public static final com.google.android.gms.fitness.data.Field FIELD_NUM_SEGMENTS = zzc("num_segments");
    public static final com.google.android.gms.fitness.data.Field FIELD_AVERAGE = zze("average");
    public static final com.google.android.gms.fitness.data.Field FIELD_MAX = zze("max");
    public static final com.google.android.gms.fitness.data.Field FIELD_MIN = zze("min");
    public static final com.google.android.gms.fitness.data.Field FIELD_LOW_LATITUDE = zze("low_latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_LOW_LONGITUDE = zze("low_longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_HIGH_LATITUDE = zze("high_latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_HIGH_LONGITUDE = zze("high_longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_OCCURRENCES = zzc("occurrences");
    public static final com.google.android.gms.fitness.data.Field zzku = zzc("sensor_type");
    private static final com.google.android.gms.fitness.data.Field zzkv = zzc("sensor_types");
    public static final com.google.android.gms.fitness.data.Field zzkw = new com.google.android.gms.fitness.data.Field("timestamps", 5);
    private static final com.google.android.gms.fitness.data.Field zzkx = zzc("sample_period");
    private static final com.google.android.gms.fitness.data.Field zzky = zzc("num_samples");
    private static final com.google.android.gms.fitness.data.Field zzkz = zzc("num_dimensions");
    public static final com.google.android.gms.fitness.data.Field zzla = new com.google.android.gms.fitness.data.Field("sensor_values", 6);
    public static final com.google.android.gms.fitness.data.Field FIELD_INTENSITY = zze("intensity");
    public static final com.google.android.gms.fitness.data.Field zzlb = zze("probability");
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Field> CREATOR = new com.google.android.gms.fitness.data.zzq();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class zza {
        public static final com.google.android.gms.fitness.data.Field zzld = com.google.android.gms.fitness.data.Field.zze("x");
        public static final com.google.android.gms.fitness.data.Field zzle = com.google.android.gms.fitness.data.Field.zze("y");
        public static final com.google.android.gms.fitness.data.Field zzlf = com.google.android.gms.fitness.data.Field.zze("z");
        public static final com.google.android.gms.fitness.data.Field zzlg = com.google.android.gms.fitness.data.Field.zzi("debug_session");
        public static final com.google.android.gms.fitness.data.Field zzlh = com.google.android.gms.fitness.data.Field.zzi("google.android.fitness.SessionV2");
        public static final com.google.android.gms.fitness.data.Field zzli = com.google.android.gms.fitness.data.Field.zzh("google.android.fitness.DataPointSession");
    }

    public static com.google.android.gms.fitness.data.Field zza(java.lang.String str, int i) {
        str.hashCode();
        switch (str) {
            case "accuracy":
                return FIELD_ACCURACY;
            case "debug_session":
                return com.google.android.gms.fitness.data.Field.zza.zzlg;
            case "body_temperature_measurement_location":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
            case "duration":
                return FIELD_DURATION;
            case "blood_glucose_level":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_GLUCOSE_LEVEL;
            case "symptom":
                return zzkl;
            case "activity":
                return FIELD_ACTIVITY;
            case "cervical_dilation":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_CERVICAL_DILATION;
            case "floor.gain":
                return zzks;
            case "floor.loss":
                return zzkt;
            case "num_segments":
                return FIELD_NUM_SEGMENTS;
            case "elevation.change":
                return zzko;
            case "oxygen_saturation":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION;
            case "latitude":
                return FIELD_LATITUDE;
            case "num_dimensions":
                return zzkz;
            case "probability":
                return zzlb;
            case "floors":
                return zzkr;
            case "supplemental_oxygen_flow_rate_average":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE;
            case "height":
                return FIELD_HEIGHT;
            case "blood_pressure_measurement_location":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
            case "num_samples":
                return zzky;
            case "food_item":
                return FIELD_FOOD_ITEM;
            case "percentage":
                return FIELD_PERCENTAGE;
            case "cervical_position":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_CERVICAL_POSITION;
            case "volume":
                return FIELD_VOLUME;
            case "blood_pressure_systolic":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC;
            case "weight":
                return FIELD_WEIGHT;
            case "average":
                return FIELD_AVERAGE;
            case "high_longitude":
                return FIELD_HIGH_LONGITUDE;
            case "low_longitude":
                return FIELD_LOW_LONGITUDE;
            case "sensor_values":
                return zzla;
            case "high_latitude":
                return FIELD_HIGH_LATITUDE;
            case "step_length":
                return FIELD_STEP_LENGTH;
            case "meal_type":
                return FIELD_MEAL_TYPE;
            case "circumference":
                return FIELD_CIRCUMFERENCE;
            case "nutrients":
                return FIELD_NUTRIENTS;
            case "oxygen_saturation_measurement_method":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD;
            case "calories":
                return FIELD_CALORIES;
            case "resistance_type":
                return FIELD_RESISTANCE_TYPE;
            case "ovulation_test_result":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OVULATION_TEST_RESULT;
            case "x":
                return com.google.android.gms.fitness.data.Field.zza.zzld;
            case "y":
                return com.google.android.gms.fitness.data.Field.zza.zzle;
            case "z":
                return com.google.android.gms.fitness.data.Field.zza.zzlf;
            case "bpm":
                return FIELD_BPM;
            case "max":
                return FIELD_MAX;
            case "min":
                return FIELD_MIN;
            case "rpm":
                return FIELD_RPM;
            case "temporal_relation_to_sleep":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP;
            case "speed":
                return FIELD_SPEED;
            case "steps":
                return FIELD_STEPS;
            case "watts":
                return FIELD_WATTS;
            case "sensor_types":
                return zzkv;
            case "longitude":
                return FIELD_LONGITUDE;
            case "low_latitude":
                return FIELD_LOW_LATITUDE;
            case "blood_pressure_diastolic_average":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE;
            case "blood_glucose_specimen_source":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE;
            case "activity_duration.descending":
                return zzkj;
            case "distance":
                return FIELD_DISTANCE;
            case "google.android.fitness.SessionV2":
                return com.google.android.gms.fitness.data.Field.zza.zzlh;
            case "cervical_mucus_texture":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_CERVICAL_MUCUS_TEXTURE;
            case "google.android.fitness.Device":
                return zzkn;
            case "activity_duration.ascending":
                return zzki;
            case "blood_pressure_systolic_max":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX;
            case "blood_pressure_systolic_min":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN;
            case "intensity":
                return FIELD_INTENSITY;
            case "google.android.fitness.GoalV2":
                return zzkk;
            case "cervical_mucus_amount":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_CERVICAL_MUCUS_AMOUNT;
            case "oxygen_saturation_average":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION_AVERAGE;
            case "google.android.fitness.StrideModel":
                return zzkm;
            case "occurrences":
                return FIELD_OCCURRENCES;
            case "revolutions":
                return FIELD_REVOLUTIONS;
            case "oxygen_saturation_system":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM;
            case "confidence":
                return FIELD_CONFIDENCE;
            case "temporal_relation_to_meal":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL;
            case "body_temperature":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BODY_TEMPERATURE;
            case "repetitions":
                return FIELD_REPETITIONS;
            case "activity_confidence":
                return FIELD_ACTIVITY_CONFIDENCE;
            case "sample_period":
                return zzkx;
            case "blood_pressure_diastolic":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC;
            case "oxygen_saturation_max":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION_MAX;
            case "oxygen_saturation_min":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_SATURATION_MIN;
            case "blood_pressure_diastolic_max":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX;
            case "blood_pressure_diastolic_min":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN;
            case "sensor_type":
                return zzku;
            case "timestamps":
                return zzkw;
            case "elevation.gain":
                return zzkp;
            case "elevation.loss":
                return zzkq;
            case "resistance":
                return FIELD_RESISTANCE;
            case "oxygen_therapy_administration_mode":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE;
            case "menstrual_flow":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_MENSTRUAL_FLOW;
            case "supplemental_oxygen_flow_rate_max":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX;
            case "supplemental_oxygen_flow_rate_min":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN;
            case "body_position":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BODY_POSITION;
            case "blood_pressure_systolic_average":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE;
            case "altitude":
                return FIELD_ALTITUDE;
            case "exercise":
                return FIELD_EXERCISE;
            case "cervical_firmness":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_CERVICAL_FIRMNESS;
            case "supplemental_oxygen_flow_rate":
                return com.google.android.gms.fitness.data.HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE;
            default:
                return new com.google.android.gms.fitness.data.Field(str, i, null);
        }
    }

    private static com.google.android.gms.fitness.data.Field zzc(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 1);
    }

    public static com.google.android.gms.fitness.data.Field zzd(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 1, true);
    }

    public static com.google.android.gms.fitness.data.Field zze(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 2);
    }

    private static com.google.android.gms.fitness.data.Field zzf(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 2, true);
    }

    private static com.google.android.gms.fitness.data.Field zzg(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 4);
    }

    public static com.google.android.gms.fitness.data.Field zzh(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 7);
    }

    public static com.google.android.gms.fitness.data.Field zzi(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 7, true);
    }

    private Field(java.lang.String str, int i) {
        this(str, i, null);
    }

    Field(java.lang.String str, int i, java.lang.Boolean bool) {
        this.name = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.format = i;
        this.zzlc = bool;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final int getFormat() {
        return this.format;
    }

    public final java.lang.Boolean isOptional() {
        return this.zzlc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Field)) {
            return false;
        }
        com.google.android.gms.fitness.data.Field field = (com.google.android.gms.fitness.data.Field) obj;
        return this.name.equals(field.name) && this.format == field.format;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.name;
        objArr[1] = this.format == 1 ? "i" : "f";
        return java.lang.String.format("%s(%s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getFormat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 3, isOptional(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
