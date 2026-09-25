package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public interface SplitInstallManager {
    com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int i);

    com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list);

    com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list);

    com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list);

    com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list);

    java.util.Set<java.lang.String> getInstalledLanguages();

    java.util.Set<java.lang.String> getInstalledModules();

    com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i);

    com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates();

    void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException;

    com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest);

    void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);
}
