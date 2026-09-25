package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl {
    private static final com.google.android.gms.fitness.data.DataType[] zzjy = {com.google.android.gms.fitness.data.DataType.zzjq, com.google.android.gms.fitness.data.DataType.TYPE_WORKOUT_EXERCISE, com.google.android.gms.fitness.data.DataType.TYPE_MOVE_MINUTES, com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SAMPLES, com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT, com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_BODY_FAT_PERCENTAGE, com.google.android.gms.fitness.data.DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_BASAL_METABOLIC_RATE, com.google.android.gms.fitness.data.DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CADENCE, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CUMULATIVE, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_REVOLUTION, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_RPM, com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_CUMULATIVE, com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA, com.google.android.gms.fitness.data.DataType.zzjp, com.google.android.gms.fitness.data.DataType.zzju, com.google.android.gms.fitness.data.DataType.zzjm, com.google.android.gms.fitness.data.DataType.zzjn, com.google.android.gms.fitness.data.DataType.TYPE_HEART_POINTS, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_POINTS, com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_HEIGHT, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEIGHT_SUMMARY, com.google.android.gms.fitness.data.DataType.AGGREGATE_LOCATION_BOUNDING_BOX, com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE, com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_TRACK, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION, com.google.android.gms.fitness.data.DataType.TYPE_NUTRITION, com.google.android.gms.fitness.data.DataType.TYPE_HYDRATION, com.google.android.gms.fitness.data.DataType.AGGREGATE_NUTRITION_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_POWER_SAMPLE, com.google.android.gms.fitness.data.DataType.AGGREGATE_POWER_SUMMARY, com.google.android.gms.fitness.data.DataType.zzjr, com.google.android.gms.fitness.data.DataType.TYPE_SPEED, com.google.android.gms.fitness.data.DataType.AGGREGATE_SPEED_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CADENCE, com.google.android.gms.fitness.data.DataType.zzjo, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CUMULATIVE, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING, com.google.android.gms.fitness.data.DataType.TYPE_WEIGHT, com.google.android.gms.fitness.data.DataType.AGGREGATE_WEIGHT_SUMMARY, com.google.android.gms.fitness.data.DataType.zzjs, com.google.android.gms.fitness.data.DataType.zzjt};
    private static final com.google.android.gms.fitness.data.DataType[] zzjz = {com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING};

    public static com.google.android.gms.fitness.data.DataType zzb(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "com.google.cycling.wheel_revolution.rpm":
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_RPM;
            case "com.google.location.bounding_box":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_LOCATION_BOUNDING_BOX;
            case "com.google.internal.symptom":
                return com.google.android.gms.fitness.data.DataType.zzjn;
            case "com.google.heart_minutes":
                return com.google.android.gms.fitness.data.DataType.TYPE_HEART_POINTS;
            case "com.google.blood_glucose.summary":
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY;
            case "com.google.accelerometer":
                return com.google.android.gms.fitness.data.DataType.zzjq;
            case "com.google.location.sample":
                return com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE;
            case "com.google.menstruation":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION;
            case "com.google.body.temperature.basal.summary":
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY;
            case "com.google.floor_change.summary":
                return com.google.android.gms.fitness.data.DataType.zzju;
            case "com.google.internal.primary_device":
                return com.google.android.gms.fitness.data.DataType.zzjt;
            case "com.google.height.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEIGHT_SUMMARY;
            case "com.google.distance.delta":
                return com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA;
            case "com.google.internal.session.v2":
                return com.google.android.gms.fitness.data.DataType.zza.zzjk;
            case "com.google.internal.session.v3":
                return com.google.android.gms.fitness.data.DataType.zza.zzjl;
            case "com.google.heart_minutes.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_POINTS;
            case "com.google.step_count.delta":
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA;
            case "com.google.height":
                return com.google.android.gms.fitness.data.DataType.TYPE_HEIGHT;
            case "com.google.cycling.pedaling.cumulative":
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CUMULATIVE;
            case "com.google.cycling.pedaling.cadence":
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CADENCE;
            case "com.google.location.track":
                return com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_TRACK;
            case "com.google.heart_rate.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY;
            case "com.google.internal.goal":
                return com.google.android.gms.fitness.data.DataType.zzjm;
            case "com.google.weight":
                return com.google.android.gms.fitness.data.DataType.TYPE_WEIGHT;
            case "com.google.weight.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_WEIGHT_SUMMARY;
            case "com.google.body.temperature":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE;
            case "com.google.blood_glucose":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE;
            case "com.google.power.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_POWER_SUMMARY;
            case "com.google.nutrition.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_NUTRITION_SUMMARY;
            case "com.google.activity.exercise":
                return com.google.android.gms.fitness.data.DataType.TYPE_WORKOUT_EXERCISE;
            case "com.google.heart_rate.bpm":
                return com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM;
            case "com.google.calories.bmr":
                return com.google.android.gms.fitness.data.DataType.TYPE_BASAL_METABOLIC_RATE;
            case "com.google.blood_pressure.summary":
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY;
            case "com.google.activity.samples":
                return com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SAMPLES;
            case "com.google.sensor.events":
                return com.google.android.gms.fitness.data.DataType.zzjr;
            case "com.google.calories.bmr.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
            case "com.google.step_count.cadence":
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CADENCE;
            case "com.google.activity.segment":
                return com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT;
            case "com.google.power.sample":
                return com.google.android.gms.fitness.data.DataType.TYPE_POWER_SAMPLE;
            case "com.google.step_count.cumulative":
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CUMULATIVE;
            case "com.google.body.fat.percentage":
                return com.google.android.gms.fitness.data.DataType.TYPE_BODY_FAT_PERCENTAGE;
            case "com.google.activity.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY;
            case "com.google.speed.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_SPEED_SUMMARY;
            case "com.google.calories.expended":
                return com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED;
            case "com.google.blood_pressure":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE;
            case "com.google.hydration":
                return com.google.android.gms.fitness.data.DataType.TYPE_HYDRATION;
            case "com.google.stride_model":
                return com.google.android.gms.fitness.data.DataType.zzjo;
            case "com.google.device_on_body":
                return com.google.android.gms.fitness.data.DataType.zzjs;
            case "com.google.floor_change":
                return com.google.android.gms.fitness.data.DataType.zzjp;
            case "com.google.body.fat.percentage.summary":
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
            case "com.google.vaginal_spotting":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING;
            case "com.google.oxygen_saturation":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION;
            case "com.google.ovulation_test":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST;
            case "com.google.body.temperature.basal":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BASAL_BODY_TEMPERATURE;
            case "com.google.cycling.wheel_revolution.cumulative":
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_REVOLUTION;
            case "com.google.active_minutes":
                return com.google.android.gms.fitness.data.DataType.TYPE_MOVE_MINUTES;
            case "com.google.nutrition":
                return com.google.android.gms.fitness.data.DataType.TYPE_NUTRITION;
            case "com.google.distance.cumulative":
                return com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_CUMULATIVE;
            case "com.google.cervical_position":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION;
            case "com.google.cervical_mucus":
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS;
            case "com.google.oxygen_saturation.summary":
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY;
            case "com.google.speed":
                return com.google.android.gms.fitness.data.DataType.TYPE_SPEED;
            case "com.google.body.temperature.summary":
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY;
            default:
                return null;
        }
    }
}
