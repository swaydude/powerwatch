package com.google.android.datatransport;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Event<T> {
    public abstract java.lang.Integer getCode();

    public abstract T getPayload();

    public abstract com.google.android.datatransport.Priority getPriority();

    public static <T> com.google.android.datatransport.Event<T> ofData(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.DEFAULT);
    }

    public static <T> com.google.android.datatransport.Event<T> ofData(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.DEFAULT);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.VERY_LOW);
    }

    public static <T> com.google.android.datatransport.Event<T> ofTelemetry(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.VERY_LOW);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(int i, T t) {
        return new com.google.android.datatransport.AutoValue_Event(java.lang.Integer.valueOf(i), t, com.google.android.datatransport.Priority.HIGHEST);
    }

    public static <T> com.google.android.datatransport.Event<T> ofUrgent(T t) {
        return new com.google.android.datatransport.AutoValue_Event(null, t, com.google.android.datatransport.Priority.HIGHEST);
    }
}
