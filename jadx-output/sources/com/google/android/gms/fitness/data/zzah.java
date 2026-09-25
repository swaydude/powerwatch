package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah {
    private static final double zzme = 10.0d / java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private static final double zzmf = 1000.0d / java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private static final double zzmg = 2000.0d / java.util.concurrent.TimeUnit.HOURS.toNanos(1);
    private static final double zzmh = 100.0d / java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    public static final java.util.Set<java.lang.String> zzmi = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type", "debug_session", "google.android.fitness.SessionV2")));
    private static final com.google.android.gms.fitness.data.zzah zzml = new com.google.android.gms.fitness.data.zzah();
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.google.android.gms.fitness.data.zzaj>> zzmj;
    private final java.util.Map<java.lang.String, com.google.android.gms.fitness.data.zzaj> zzmk;

    private zzah() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("latitude", new com.google.android.gms.fitness.data.zzaj(-90.0d, 90.0d));
        map.put("longitude", new com.google.android.gms.fitness.data.zzaj(-180.0d, 180.0d));
        map.put("accuracy", new com.google.android.gms.fitness.data.zzaj(0.0d, 10000.0d));
        map.put("bpm", new com.google.android.gms.fitness.data.zzaj(0.0d, 1000.0d));
        map.put("altitude", new com.google.android.gms.fitness.data.zzaj(-100000.0d, 100000.0d));
        map.put("percentage", new com.google.android.gms.fitness.data.zzaj(0.0d, 100.0d));
        map.put("confidence", new com.google.android.gms.fitness.data.zzaj(0.0d, 100.0d));
        map.put("duration", new com.google.android.gms.fitness.data.zzaj(0.0d, 9.223372036854776E18d));
        map.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, new com.google.android.gms.fitness.data.zzaj(0.0d, 3.0d));
        map.put("weight", new com.google.android.gms.fitness.data.zzaj(0.0d, 1000.0d));
        map.put("speed", new com.google.android.gms.fitness.data.zzaj(0.0d, 11000.0d));
        this.zzmk = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("com.google.step_count.delta", zza("steps", new com.google.android.gms.fitness.data.zzaj(0.0d, zzme)));
        map2.put("com.google.calories.consumed", zza(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new com.google.android.gms.fitness.data.zzaj(0.0d, zzmf)));
        map2.put("com.google.calories.expended", zza(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new com.google.android.gms.fitness.data.zzaj(0.0d, zzmg)));
        map2.put("com.google.distance.delta", zza("distance", new com.google.android.gms.fitness.data.zzaj(0.0d, zzmh)));
        this.zzmj = java.util.Collections.unmodifiableMap(map2);
    }

    private static <K, V> java.util.Map<K, V> zza(K k, V v) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(k, v);
        return map;
    }

    public final com.google.android.gms.fitness.data.zzaj zzj(java.lang.String str) {
        return this.zzmk.get(str);
    }

    public final com.google.android.gms.fitness.data.zzaj zza(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, com.google.android.gms.fitness.data.zzaj> map = this.zzmj.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public static com.google.android.gms.fitness.data.zzah zzw() {
        return zzml;
    }
}
