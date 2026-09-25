package com.google.android.gms.common.stats;

/* JADX INFO: loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public abstract int getEventType();

    public abstract long getTimeMillis();

    public abstract long zzu();

    public abstract java.lang.String zzv();

    public java.lang.String toString() {
        long timeMillis = getTimeMillis();
        int eventType = getEventType();
        long jZzu = zzu();
        java.lang.String strZzv = zzv();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzv).length() + 53);
        sb.append(timeMillis);
        sb.append("\t");
        sb.append(eventType);
        sb.append("\t");
        sb.append(jZzu);
        sb.append(strZzv);
        return sb.toString();
    }
}
