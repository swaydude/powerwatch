package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {
    static final java.util.Map<com.google.android.gms.fitness.data.DataType, java.util.List<com.google.android.gms.fitness.data.DataType>> zzik;

    static {
        java.util.HashMap map = new java.util.HashMap();
        zzik = map;
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_MOVE_MINUTES, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_MOVE_MINUTES));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_HEART_POINTS, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_POINTS));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_BASAL_METABOLIC_RATE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_BODY_FAT_PERCENTAGE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_CALORIES_EXPENDED));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_DISTANCE_DELTA));
        map.put(com.google.android.gms.fitness.data.DataType.zzjp, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.zzju));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_LOCATION_BOUNDING_BOX));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_NUTRITION, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_NUTRITION_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_HYDRATION, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_HYDRATION));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_POWER_SAMPLE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_POWER_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_SPEED, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_SPEED_SUMMARY));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_STEP_COUNT_DELTA));
        map.put(com.google.android.gms.fitness.data.DataType.TYPE_WEIGHT, java.util.Collections.singletonList(com.google.android.gms.fitness.data.DataType.AGGREGATE_WEIGHT_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST));
        map.put(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING, java.util.Collections.singletonList(com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING));
    }
}
