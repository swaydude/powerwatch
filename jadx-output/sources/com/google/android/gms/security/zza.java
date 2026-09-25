package com.google.android.gms.security;

/* JADX INFO: loaded from: classes.dex */
final class zza extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> {
    private final /* synthetic */ android.content.Context val$context;
    private final /* synthetic */ com.google.android.gms.security.ProviderInstaller.ProviderInstallListener zzix;

    zza(android.content.Context context, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.val$context = context;
        this.zzix = providerInstallListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer doInBackground(java.lang.Void... voidArr) {
        try {
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(this.val$context);
            return 0;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
            return java.lang.Integer.valueOf(e.errorCode);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e2) {
            return java.lang.Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Integer num) {
        java.lang.Integer num2 = num;
        if (num2.intValue() == 0) {
            this.zzix.onProviderInstalled();
        } else {
            this.zzix.onProviderInstallFailed(num2.intValue(), com.google.android.gms.security.ProviderInstaller.zziv.getErrorResolutionIntent(this.val$context, num2.intValue(), "pi"));
        }
    }
}
