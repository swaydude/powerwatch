package com.google.android.gms.measurement.module;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class Analytics {
    public static final java.lang.String CRASH_ORIGIN = "crash";
    public static final java.lang.String FCM_ORIGIN = "fcm";
    public static final java.lang.String FIAM_ORIGIN = "fiam";
    private static volatile com.google.android.gms.measurement.module.Analytics zza;
    private final com.google.android.gms.measurement.internal.zzgo zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static final class Event extends com.google.android.gms.measurement.internal.zzhj {
        public static final java.lang.String AD_REWARD = "_ar";
        public static final java.lang.String APP_EXCEPTION = "_ae";

        private Event() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static final class Param extends com.google.android.gms.measurement.internal.zzhm {
        public static final java.lang.String FATAL = "fatal";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";

        private Param() {
        }
    }

    public static com.google.android.gms.measurement.module.Analytics getInstance(android.content.Context context) {
        if (zza == null) {
            synchronized (com.google.android.gms.measurement.module.Analytics.class) {
                if (zza == null) {
                    zza = new com.google.android.gms.measurement.module.Analytics(com.google.android.gms.measurement.internal.zzgo.zza(context, (com.google.android.gms.internal.measurement.zzv) null));
                }
            }
        }
        return zza;
    }

    private Analytics(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgoVar);
        this.zzb = zzgoVar;
    }
}
