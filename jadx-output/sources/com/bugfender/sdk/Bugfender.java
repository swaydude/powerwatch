package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class Bugfender {
    private static final java.lang.String TAG = "Bugfender";
    private static java.lang.String apiUrl = null;
    private static java.lang.String baseUrl = null;
    private static boolean debug = false;
    private static java.lang.String deviceName = null;
    private static boolean isCheckBugfenderInitializerLogPrinted = false;
    private static boolean isUIEventLoggingEnabled = false;
    private static com.bugfender.sdk.i1 logcatManager;
    private static com.bugfender.sdk.k1 loggerManager;
    private static com.bugfender.sdk.m1 mainThread;

    /* JADX INFO: renamed from: com.bugfender.sdk.Bugfender$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bugfender$sdk$LogLevel;

        static {
            int[] iArr = new int[com.bugfender.sdk.LogLevel.values().length];
            $SwitchMap$com$bugfender$sdk$LogLevel = iArr;
            try {
                iArr[com.bugfender.sdk.LogLevel.Trace.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bugfender$sdk$LogLevel[com.bugfender.sdk.LogLevel.Debug.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bugfender$sdk$LogLevel[com.bugfender.sdk.LogLevel.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bugfender$sdk$LogLevel[com.bugfender.sdk.LogLevel.Warning.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bugfender$sdk$LogLevel[com.bugfender.sdk.LogLevel.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bugfender$sdk$LogLevel[com.bugfender.sdk.LogLevel.Fatal.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.a(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.a(str, str2);
            }
        }
    }

    public static void disableReflection(boolean z) {
        if (isBugfenderInitialized()) {
            loggerManager.a(z);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.b(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.b(str, str2);
            }
        }
    }

    public static void enableCrashReporting() {
        if (isBugfenderInitialized()) {
            loggerManager.b();
        }
    }

    public static void enableLogcatLogging() {
        enableLogcatLogging(null);
    }

    public static void enableLogcatLogging(com.bugfender.sdk.logcat.LogcatInterceptor logcatInterceptor) {
        if (isBugfenderInitialized()) {
            if (logcatInterceptor == null) {
                logcatInterceptor = new com.bugfender.sdk.logcat.DefaultLogcatInterceptor();
            }
            logcatManager.a(logcatInterceptor);
        }
    }

    public static void enableUIEventLogging(android.app.Application application) {
        if (!isBugfenderInitialized() || isUIEventLoggingEnabled) {
            return;
        }
        isUIEventLoggingEnabled = true;
        application.registerActivityLifecycleCallbacks(new com.bugfender.sdk.b(loggerManager, mainThread, shouldPrintLogcatLog(), shouldSendBugfenderLog()));
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.b(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.c(str, str2);
            }
        }
    }

    public static void forceSendOnce() {
        if (isBugfenderInitialized()) {
            loggerManager.p();
            if (debug) {
                com.bugfender.sdk.d1.c(TAG, "Synchronizing all the logs and issues");
            }
        }
    }

    public static java.net.URL getDeviceUrl() {
        if (isBugfenderInitialized()) {
            return loggerManager.s();
        }
        return null;
    }

    private static java.lang.String getProcessName(android.content.Context context) {
        int iMyPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static java.net.URL getSessionUrl() {
        if (isBugfenderInitialized()) {
            return loggerManager.w();
        }
        return null;
    }

    public static android.content.Intent getUserFeedbackActivityIntent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return getUserFeedbackActivityIntent(context, str, str2, str3, str4, str5, null);
    }

    public static android.content.Intent getUserFeedbackActivityIntent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.bugfender.sdk.ui.FeedbackStyle feedbackStyle) {
        return com.bugfender.sdk.ui.FeedbackActivity.getIntent(context, str, str2, str3, str4, str5, feedbackStyle);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.c(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.d(str, str2);
            }
        }
    }

    public static synchronized void init(android.content.Context context, java.lang.String str, boolean z) {
        if (context != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                if (logcatManager == null) {
                    try {
                        context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        if (isMainProcess(context)) {
                            debug = z;
                            com.bugfender.sdk.j0 j0Var = new com.bugfender.sdk.j0();
                            com.bugfender.sdk.i0 i0Var = new com.bugfender.sdk.i0();
                            com.bugfender.sdk.g1 g1VarB = j0Var.b();
                            com.bugfender.sdk.f1 f1VarA = j0Var.a(g1VarB);
                            com.bugfender.sdk.n2 n2VarE = j0Var.e();
                            com.bugfender.sdk.l2 l2VarA = j0Var.a(n2VarE);
                            com.bugfender.sdk.x0 x0VarA = j0Var.a();
                            com.bugfender.sdk.v0 v0VarA = j0Var.a(x0VarA);
                            com.bugfender.sdk.c0 c0VarD = j0Var.d();
                            com.bugfender.sdk.r1 r1VarA = j0Var.a(context, g1VarB, f1VarA, n2VarE, l2VarA, x0VarA, v0VarA, c0VarD);
                            com.bugfender.sdk.q2 q2VarA = i0Var.a(apiUrl, java.lang.String.valueOf(com.bugfender.android.BuildConfig.VERSION_CODE), str);
                            apiUrl = null;
                            com.bugfender.sdk.k1 k1Var = new com.bugfender.sdk.k1(str, r1VarA, c0VarD, new com.bugfender.sdk.o1(q2VarA), j0Var.a(context), j0Var.c(context), j0Var.a(context, j0Var.b(context), j0Var.d(context)), j0Var.a(str, baseUrl), deviceName);
                            loggerManager = k1Var;
                            baseUrl = null;
                            k1Var.a(com.bugfender.sdk.k1.A);
                            logcatManager = new com.bugfender.sdk.j1(context.getPackageName(), loggerManager, java.util.concurrent.Executors.newSingleThreadExecutor());
                            mainThread = j0Var.c();
                        }
                    } catch (java.lang.SecurityException unused) {
                    }
                }
                return;
            }
        }
        com.bugfender.sdk.d1.d(TAG, "WARNING: The Bugfender sdk is not initialized. The context or application token provided is null.");
    }

    private static boolean isBugfenderInitialized() {
        if (loggerManager != null) {
            return true;
        }
        if (isCheckBugfenderInitializerLogPrinted) {
            return false;
        }
        isCheckBugfenderInitializerLogPrinted = true;
        com.bugfender.sdk.d1.d(TAG, "WARNING: Bugfender SDK is not initialized. You should call first to the method Bugfender.init()");
        return false;
    }

    private static boolean isMainProcess(android.content.Context context) {
        java.lang.String processName = getProcessName(context);
        if (processName == null) {
            com.bugfender.sdk.d1.d(TAG, "WARNING: Bugfender SDK couldn't be initialized.");
        }
        return processName != null && context.getPackageName().equals(processName);
    }

    private static boolean isRelease() {
        return !debug;
    }

    private static boolean isValidUrl(java.lang.String str) {
        try {
            new java.net.URL(str);
            return true;
        } catch (java.net.MalformedURLException unused) {
            return false;
        }
    }

    public static void log(int i, java.lang.String str, java.lang.String str2, com.bugfender.sdk.LogLevel logLevel, java.lang.String str3, java.lang.String str4) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                switch (com.bugfender.sdk.Bugfender.AnonymousClass1.$SwitchMap$com$bugfender$sdk$LogLevel[logLevel.ordinal()]) {
                    case 1:
                    case 2:
                        com.bugfender.sdk.d1.a(str3, str4);
                        break;
                    case 3:
                        com.bugfender.sdk.d1.c(str3, str4);
                        break;
                    case 4:
                        com.bugfender.sdk.d1.d(str3, str4);
                        break;
                    case 5:
                    case 6:
                        com.bugfender.sdk.d1.b(str3, str4);
                        break;
                }
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.a(i, str, str2, com.bugfender.sdk.e1.c.a(logLevel), str3, str4);
            }
        }
    }

    public static void overrideDeviceName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.bugfender.sdk.d1.d(TAG, "WARNING: deviceName can not be empty or null. Bugfender.overrideDeviceName() is ignored");
            return;
        }
        deviceName = str;
        if (isBugfenderInitialized()) {
            com.bugfender.sdk.d1.d(TAG, "WARNING: Bugfender.overrideDeviceName() must be called before the method Bugfender.init(), ignoring this call");
        }
    }

    public static void removeDeviceKey(java.lang.String str) {
        if (isBugfenderInitialized()) {
            loggerManager.b(str);
        }
    }

    public static java.net.URL sendCrash(java.lang.String str, java.lang.String str2) {
        if (!isBugfenderInitialized()) {
            return null;
        }
        java.net.URL urlE = loggerManager.e(str, str2);
        loggerManager.p();
        if (debug) {
            com.bugfender.sdk.d1.b(TAG, "Reported crash with Title: " + str + " and Message: " + str2);
        }
        return urlE;
    }

    public static java.net.URL sendIssue(java.lang.String str, java.lang.String str2) {
        if (!isBugfenderInitialized()) {
            return null;
        }
        java.net.URL urlG = loggerManager.g(str, str2);
        loggerManager.p();
        if (debug) {
            com.bugfender.sdk.d1.b(TAG, "Reported issue with Title: " + str + " and Message: " + str2);
        }
        return urlG;
    }

    public static java.net.URL sendUserFeedback(java.lang.String str, java.lang.String str2) {
        if (!isBugfenderInitialized()) {
            return null;
        }
        java.net.URL urlI = loggerManager.i(str, str2);
        loggerManager.p();
        if (debug) {
            com.bugfender.sdk.d1.b(TAG, "Reported feedback with Title: " + str + " and Message: " + str2);
        }
        return urlI;
    }

    public static void setApiUrl(java.lang.String str) {
        if (isBugfenderInitialized()) {
            com.bugfender.sdk.d1.d(TAG, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()");
        } else if (isValidUrl(str)) {
            apiUrl = str;
        } else {
            com.bugfender.sdk.d1.b(TAG, "The custom URL you have passed is malformed. Using default one.");
        }
    }

    public static void setBaseUrl(java.lang.String str) {
        if (isBugfenderInitialized()) {
            com.bugfender.sdk.d1.d(TAG, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()");
        } else if (isValidUrl(str)) {
            baseUrl = str;
        } else {
            com.bugfender.sdk.d1.b(TAG, "The custom URL you have passed is malformed. Using default one.");
        }
    }

    public static void setDeviceBoolean(java.lang.String str, boolean z) {
        if (isBugfenderInitialized()) {
            loggerManager.a(new com.bugfender.sdk.z0(str, java.lang.Boolean.valueOf(z)));
        }
    }

    public static void setDeviceFloat(java.lang.String str, java.lang.Float f) {
        if (isBugfenderInitialized()) {
            loggerManager.a(new com.bugfender.sdk.z0(str, f));
        }
    }

    public static void setDeviceInteger(java.lang.String str, java.lang.Integer num) {
        if (isBugfenderInitialized()) {
            loggerManager.a(new com.bugfender.sdk.z0(str, num));
        }
    }

    public static void setDeviceString(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            loggerManager.a(new com.bugfender.sdk.z0(str, str2));
        }
    }

    public static void setForceEnabled(boolean z) {
        if (isBugfenderInitialized()) {
            isBugfenderInitialized();
            loggerManager.b(z);
            if (debug) {
                com.bugfender.sdk.d1.c(TAG, "Force enable: " + z);
            }
        }
    }

    public static void setMaximumLocalStorageSize(long j) {
        if (isBugfenderInitialized()) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("The maximum size should be a positive number");
            }
            loggerManager.a(j);
        }
    }

    private static boolean shouldPrintLogcatLog() {
        return !isRelease();
    }

    private static boolean shouldSendBugfenderLog() {
        return true;
    }

    public static void t(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.a(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.j(str, str2);
            }
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (isBugfenderInitialized()) {
            if (shouldPrintLogcatLog()) {
                com.bugfender.sdk.d1.d(str, str2 == null ? "" : str2);
            }
            if (shouldSendBugfenderLog()) {
                loggerManager.k(str, str2);
            }
        }
    }
}
