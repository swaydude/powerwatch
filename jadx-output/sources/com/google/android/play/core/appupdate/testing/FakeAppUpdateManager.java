package com.google.android.play.core.appupdate.testing;

/* JADX INFO: loaded from: classes2.dex */
public class FakeAppUpdateManager implements com.google.android.play.core.appupdate.AppUpdateManager {
    private final com.google.android.play.core.appupdate.a a;
    private final android.content.Context b;
    private int c = 0;
    private int d = 0;
    private boolean e = false;
    private int f = 0;
    private int g = -1;
    private long h = 0;
    private long i = 0;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private java.lang.Integer m;
    private java.lang.Integer n;

    public FakeAppUpdateManager(android.content.Context context) {
        this.a = new com.google.android.play.core.appupdate.a(context);
        this.b = context;
    }

    private final int a() {
        if (!this.e) {
            return 1;
        }
        int i = this.c;
        return (i == 0 || i == 4 || i == 5 || i == 6) ? 2 : 3;
    }

    private final boolean a(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i) {
        int i2;
        if (!appUpdateInfo.isUpdateTypeAllowed(i)) {
            return false;
        }
        if (i == 1) {
            this.k = true;
            i2 = 1;
        } else {
            this.j = true;
            i2 = 0;
        }
        this.n = i2;
        return true;
    }

    private final void b() {
        this.a.a(com.google.android.play.core.install.InstallState.a(this.c, 0L, 0L, this.d, this.b.getPackageName()));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate() {
        int i = this.d;
        if (i != 0 && i != 1) {
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.install.InstallException(this.d));
        }
        int i2 = this.c;
        if (i2 != 11) {
            return i2 == 3 ? com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.install.InstallException(-8)) : com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.install.InstallException(-7));
        }
        this.c = 3;
        this.l = true;
        java.lang.Integer num = 0;
        if (num.equals(this.n)) {
            b();
        }
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Object) null);
    }

    public void downloadCompletes() {
        int i = this.c;
        if (i == 2 || i == 1) {
            this.c = 11;
            this.h = 0L;
            this.i = 0L;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
                return;
            }
            java.lang.Integer num2 = 1;
            if (num2.equals(this.n)) {
                completeUpdate();
            }
        }
    }

    public void downloadFails() {
        int i = this.c;
        if (i == 1 || i == 2) {
            this.c = 5;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
            this.n = null;
            this.k = false;
            this.c = 0;
        }
    }

    public void downloadStarts() {
        if (this.c == 1) {
            this.c = 2;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo() {
        android.app.PendingIntent broadcast;
        int i = this.d;
        if (i != 0 && i != 1) {
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.install.InstallException(this.d));
        }
        android.app.PendingIntent broadcast2 = null;
        if (a() != 2) {
            broadcast = null;
        } else {
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 == 1) {
                    java.lang.Integer num = 0;
                    if (num.equals(this.m)) {
                    }
                }
                broadcast = null;
            }
            broadcast = android.app.PendingIntent.getBroadcast(this.b, 0, new android.content.Intent(), 0);
        }
        if (a() == 2) {
            int i3 = this.d;
            if (i3 == 0) {
                broadcast2 = android.app.PendingIntent.getBroadcast(this.b, 0, new android.content.Intent(), 0);
            } else if (i3 == 1) {
                java.lang.Integer num2 = 1;
                if (num2.equals(this.m)) {
                    broadcast2 = android.app.PendingIntent.getBroadcast(this.b, 0, new android.content.Intent(), 0);
                }
            }
        }
        return com.google.android.play.core.tasks.Tasks.a(com.google.android.play.core.appupdate.AppUpdateInfo.a(this.b.getPackageName(), this.f, a(), this.c, this.g, 0L, 0L, broadcast2, broadcast));
    }

    public java.lang.Integer getPartiallyAllowedUpdateType() {
        return this.m;
    }

    public java.lang.Integer getTypeForUpdateInProgress() {
        return this.n;
    }

    public void installCompletes() {
        if (this.c == 3) {
            this.c = 4;
            this.e = false;
            this.f = 0;
            this.g = -1;
            this.h = 0L;
            this.i = 0L;
            this.k = false;
            this.l = false;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
            this.n = null;
            this.c = 0;
        }
    }

    public void installFails() {
        if (this.c == 3) {
            this.c = 5;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
            this.n = null;
            this.l = false;
            this.k = false;
            this.c = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.j;
    }

    public boolean isImmediateFlowVisible() {
        return this.k;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.l;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener) {
        this.a.a((com.google.android.play.core.listener.StateUpdatedListener) installStateUpdatedListener);
    }

    public void setInstallErrorCode(int i) {
        this.d = i;
    }

    public void setPartiallyAllowedUpdateType(java.lang.Integer num) {
        this.m = num;
        this.d = 1;
    }

    public void setUpdateAvailable(int i) {
        this.e = true;
        this.f = i;
    }

    public void setUpdateNotAvailable() {
        this.e = false;
        this.g = -1;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, android.app.Activity activity, int i2) {
        return a(appUpdateInfo, i);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i2) {
        return a(appUpdateInfo, i);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener installStateUpdatedListener) {
        this.a.b(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        if (this.j || this.k) {
            this.j = false;
            this.c = 1;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
        }
    }

    public void userCancelsDownload() {
        int i = this.c;
        if (i == 1 || i == 2) {
            this.c = 6;
            java.lang.Integer num = 0;
            if (num.equals(this.n)) {
                b();
            }
            this.n = null;
            this.k = false;
            this.c = 0;
        }
    }

    public void userRejectsUpdate() {
        if (this.j || this.k) {
            this.j = false;
            this.k = false;
            this.n = null;
            this.c = 0;
        }
    }
}
