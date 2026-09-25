package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    public static java.util.Set<com.google.android.gms.common.api.Scope> zza(java.util.Collection<com.google.android.gms.common.api.Scope> collection) {
        com.google.android.gms.common.api.Scope scope;
        java.util.HashSet hashSet = new java.util.HashSet(collection.size());
        for (com.google.android.gms.common.api.Scope scope2 : collection) {
            if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BODY_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BLOOD_PRESSURE_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BLOOD_PRESSURE_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BLOOD_GLUCOSE_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BLOOD_GLUCOSE_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_OXYGEN_SATURATION_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_OXYGEN_SATURATION_READ_WRITE);
            } else if (scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BODY_TEMPERATURE_READ))) {
                scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_BODY_TEMPERATURE_READ_WRITE);
            } else {
                scope = scope2.equals(new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_REPRODUCTIVE_HEALTH_READ)) ? new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.FITNESS_REPRODUCTIVE_HEALTH_READ_WRITE) : scope2;
            }
            if (scope.equals(scope2) || !collection.contains(scope)) {
                hashSet.add(scope2);
            }
        }
        return hashSet;
    }
}
