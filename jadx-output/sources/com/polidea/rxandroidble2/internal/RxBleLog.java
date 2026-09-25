package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleLog {

    @java.lang.Deprecated
    public static final int DEBUG = 3;

    @java.lang.Deprecated
    public static final int ERROR = 6;

    @java.lang.Deprecated
    public static final int INFO = 4;

    @java.lang.Deprecated
    public static final int NONE = Integer.MAX_VALUE;

    @java.lang.Deprecated
    public static final int VERBOSE = 2;

    @java.lang.Deprecated
    public static final int WARN = 5;
    private static com.polidea.rxandroidble2.LogOptions.Logger logcatLogger;
    private static com.polidea.rxandroidble2.internal.logger.LoggerSetup loggerSetup;
    private static final java.util.regex.Pattern ANONYMOUS_CLASS = java.util.regex.Pattern.compile("\\$\\d+$");
    private static final java.lang.ThreadLocal<java.lang.String> NEXT_TAG = new java.lang.ThreadLocal<>();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        void log(int i, java.lang.String str, java.lang.String str2);
    }

    static {
        com.polidea.rxandroidble2.LogOptions.Logger logger = new com.polidea.rxandroidble2.LogOptions.Logger() { // from class: com.polidea.rxandroidble2.internal.RxBleLog.1
            @Override // com.polidea.rxandroidble2.LogOptions.Logger
            public void log(int i, java.lang.String str, java.lang.String str2) {
                android.util.Log.println(i, str, str2);
            }
        };
        logcatLogger = logger;
        loggerSetup = new com.polidea.rxandroidble2.internal.logger.LoggerSetup(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false, true, logger);
    }

    private RxBleLog() {
    }

    @java.lang.Deprecated
    public static void setLogger(final com.polidea.rxandroidble2.internal.RxBleLog.Logger logger) {
        updateLogOptions(new com.polidea.rxandroidble2.LogOptions.Builder().setLogger(logger == null ? logcatLogger : new com.polidea.rxandroidble2.LogOptions.Logger() { // from class: com.polidea.rxandroidble2.internal.RxBleLog.2
            @Override // com.polidea.rxandroidble2.LogOptions.Logger
            public void log(int i, java.lang.String str, java.lang.String str2) {
                logger.log(i, str, str2);
            }
        }).build());
    }

    @java.lang.Deprecated
    public static void setLogLevel(int i) {
        updateLogOptions(new com.polidea.rxandroidble2.LogOptions.Builder().setLogLevel(java.lang.Integer.valueOf(i)).build());
    }

    public static void updateLogOptions(com.polidea.rxandroidble2.LogOptions logOptions) {
        com.polidea.rxandroidble2.internal.logger.LoggerSetup loggerSetup2 = loggerSetup;
        com.polidea.rxandroidble2.internal.logger.LoggerSetup loggerSetupMerge = loggerSetup2.merge(logOptions);
        d("Received new options (%s) and merged with old setup: %s. New setup: %s", logOptions, loggerSetup2, loggerSetupMerge);
        loggerSetup = loggerSetupMerge;
    }

    private static java.lang.String createTag() {
        java.lang.String strSubstring;
        java.lang.ThreadLocal<java.lang.String> threadLocal = NEXT_TAG;
        java.lang.String str = threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace.length < 5) {
            throw new java.lang.IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        java.lang.String className = stackTrace[4].getClassName();
        java.util.regex.Matcher matcher = ANONYMOUS_CLASS.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        java.lang.String strReplace = className.replace("Impl", "").replace("RxBle", "");
        int iIndexOf = strReplace.indexOf(36);
        if (iIndexOf <= 0) {
            strSubstring = strReplace.substring(strReplace.lastIndexOf(46) + 1);
        } else {
            strSubstring = strReplace.substring(strReplace.lastIndexOf(46) + 1, iIndexOf);
        }
        return "RxBle#" + strSubstring;
    }

    private static java.lang.String formatString(java.lang.String str, java.lang.Object... objArr) {
        return objArr.length == 0 ? str : java.lang.String.format(str, objArr);
    }

    public static void v(java.lang.String str, java.lang.Object... objArr) {
        throwShade(2, null, str, objArr);
    }

    public static void v(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        throwShade(2, th, str, objArr);
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        throwShade(3, null, str, objArr);
    }

    public static void d(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        throwShade(3, th, str, objArr);
    }

    public static void i(java.lang.String str, java.lang.Object... objArr) {
        throwShade(4, null, str, objArr);
    }

    public static void i(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        throwShade(4, th, str, objArr);
    }

    public static void w(java.lang.String str, java.lang.Object... objArr) {
        throwShade(5, null, str, objArr);
    }

    public static void w(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        throwShade(5, th, str, objArr);
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        throwShade(6, null, str, objArr);
    }

    public static void e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        throwShade(6, th, str, objArr);
    }

    private static void throwShade(int i, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (i < loggerSetup.logLevel) {
            return;
        }
        java.lang.String string = formatString(str, objArr);
        if (string == null || string.length() == 0) {
            if (th == null) {
                return;
            } else {
                string = android.util.Log.getStackTraceString(th);
            }
        } else if (th != null) {
            string = string + "\n" + android.util.Log.getStackTraceString(th);
        }
        println(i, createTag(), string);
    }

    private static void println(int i, java.lang.String str, java.lang.String str2) {
        if (str2.length() < 4000) {
            loggerSetup.logger.log(i, str, str2);
            return;
        }
        for (java.lang.String str3 : str2.split("\n")) {
            loggerSetup.logger.log(i, str, str3);
        }
    }

    public static boolean isAtLeast(int i) {
        return loggerSetup.logLevel <= i;
    }

    public static int getMacAddressLogSetting() {
        return loggerSetup.macAddressLogSetting;
    }

    public static int getUuidLogSetting() {
        return loggerSetup.uuidLogSetting;
    }

    public static boolean getShouldLogAttributeValues() {
        return loggerSetup.shouldLogAttributeValues;
    }

    public static boolean getShouldLogScannedPeripherals() {
        return loggerSetup.shouldLogScannedPeripherals;
    }
}
