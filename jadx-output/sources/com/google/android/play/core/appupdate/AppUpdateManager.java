package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
public interface AppUpdateManager {
    com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate();

    com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo();

    void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener);

    boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, android.app.Activity activity, int i2) throws android.content.IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws android.content.IntentSender.SendIntentException;

    void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener);
}
