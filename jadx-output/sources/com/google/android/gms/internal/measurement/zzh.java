package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    private static final java.lang.reflect.Method zzb = zza();
    private static final java.lang.reflect.Method zzc = zzb();
    private final android.app.job.JobScheduler zza;

    private static java.lang.reflect.Method zza() {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return android.app.job.JobScheduler.class.getDeclaredMethod("scheduleAsPackage", android.app.job.JobInfo.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.NoSuchMethodException unused) {
            if (!android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            android.util.Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    private static java.lang.reflect.Method zzb() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            try {
                return android.os.UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (java.lang.NoSuchMethodException unused) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static int zzc() {
        java.lang.reflect.Method method = zzc;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(null, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    private zzh(android.app.job.JobScheduler jobScheduler) {
        this.zza = jobScheduler;
    }

    private final int zza(android.app.job.JobInfo jobInfo, java.lang.String str, int i, java.lang.String str2) {
        java.lang.reflect.Method method = zzb;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(this.zza, jobInfo, str, java.lang.Integer.valueOf(i), str2)).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                android.util.Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.zza.schedule(jobInfo);
    }

    public static int zza(android.content.Context context, android.app.job.JobInfo jobInfo, java.lang.String str, java.lang.String str2) {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        if (zzb == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new com.google.android.gms.internal.measurement.zzh(jobScheduler).zza(jobInfo, str, zzc(), str2);
    }
}
