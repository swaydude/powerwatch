package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class b implements com.google.android.play.core.appupdate.AppUpdateManager {
    private final com.google.android.play.core.appupdate.c a;
    private final com.google.android.play.core.appupdate.a b;
    private final android.content.Context c;

    b(com.google.android.play.core.appupdate.c cVar, android.content.Context context) {
        this.a = cVar;
        this.b = new com.google.android.play.core.appupdate.a(context);
        this.c = context;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate() {
        return this.a.b(this.c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo() {
        return this.a.a(this.c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener) {
        this.b.a((com.google.android.play.core.listener.StateUpdatedListener) installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, android.app.Activity activity, int i2) throws android.content.IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, i, new com.google.android.play.core.appupdate.d(activity), i2);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws android.content.IntentSender.SendIntentException {
        android.app.PendingIntent pendingIntentD;
        if (!appUpdateInfo.isUpdateTypeAllowed(i)) {
            return false;
        }
        if (i == 0) {
            pendingIntentD = appUpdateInfo.e();
        } else {
            pendingIntentD = i == 1 ? appUpdateInfo.d() : null;
        }
        intentSenderForResultStarter.startIntentSenderForResult(pendingIntentD.getIntentSender(), i2, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener) {
        this.b.b(installStateUpdatedListener);
    }
}
