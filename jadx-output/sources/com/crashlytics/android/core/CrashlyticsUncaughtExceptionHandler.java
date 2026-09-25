package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private final com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener;
    private final java.lang.Thread.UncaughtExceptionHandler defaultHandler;
    private final boolean firebaseCrashlyticsClientFlag;
    private final java.util.concurrent.atomic.AtomicBoolean isHandlingException = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider;

    interface CrashListener {
        void onUncaughtException(com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, java.lang.Thread thread, java.lang.Throwable th, boolean z);
    }

    interface SettingsDataProvider {
        io.fabric.sdk.android.services.settings.SettingsData getSettingsData();
    }

    public CrashlyticsUncaughtExceptionHandler(com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener, com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, boolean z, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.crashListener = crashListener;
        this.settingsDataProvider = settingsDataProvider;
        this.firebaseCrashlyticsClientFlag = z;
        this.defaultHandler = uncaughtExceptionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r3v3, types: [io.fabric.sdk.android.Logger] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.fabric.sdk.android.Logger] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        ?? r0 = "Crashlytics completed exception processing. Invoking default exception handler.";
        this.isHandlingException.set(true);
        try {
            try {
                this.crashListener.onUncaughtException(this.settingsDataProvider, thread, th, this.firebaseCrashlyticsClientFlag);
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "An error occurred in the uncaught exception handler", e);
            }
        } finally {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, r0);
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
        }
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }
}
