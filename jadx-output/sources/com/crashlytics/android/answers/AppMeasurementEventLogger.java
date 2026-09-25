package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementEventLogger implements com.crashlytics.android.answers.EventLogger {
    private static final java.lang.String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    private static final java.lang.String GET_INSTANCE_METHOD = "getInstance";
    private static final java.lang.String LOG_METHOD = "logEventInternal";
    private final java.lang.Object logEventInstance;
    private final java.lang.reflect.Method logEventMethod;

    public static com.crashlytics.android.answers.EventLogger getEventLogger(android.content.Context context) {
        java.lang.Object appMeasurementEventLogger;
        java.lang.reflect.Method logEventMethod;
        java.lang.Class cls = getClass(context);
        if (cls == null || (appMeasurementEventLogger = getInstance(context, cls)) == null || (logEventMethod = getLogEventMethod(context, cls)) == null) {
            return null;
        }
        return new com.crashlytics.android.answers.AppMeasurementEventLogger(appMeasurementEventLogger, logEventMethod);
    }

    private static java.lang.Class getClass(android.content.Context context) {
        try {
            return context.getClassLoader().loadClass(ANALYTIC_CLASS);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.Object getInstance(android.content.Context context, java.lang.Class cls) {
        try {
            return cls.getDeclaredMethod(GET_INSTANCE_METHOD, android.content.Context.class).invoke(cls, context);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method getLogEventMethod(android.content.Context context, java.lang.Class cls) {
        try {
            return cls.getDeclaredMethod(LOG_METHOD, java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public AppMeasurementEventLogger(java.lang.Object obj, java.lang.reflect.Method method) {
        this.logEventInstance = obj;
        this.logEventMethod = method;
    }

    @Override // com.crashlytics.android.answers.EventLogger
    public void logEvent(java.lang.String str, android.os.Bundle bundle) {
        logEvent("fab", str, bundle);
    }

    @Override // com.crashlytics.android.answers.EventLogger
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        try {
            this.logEventMethod.invoke(this.logEventInstance, str, str2, bundle);
        } catch (java.lang.Exception unused) {
        }
    }
}
