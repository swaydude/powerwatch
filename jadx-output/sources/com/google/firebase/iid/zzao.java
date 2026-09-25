package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzao {
    private final android.content.Context zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private int zzd;
    private int zze = 0;

    public zzao(android.content.Context context) {
        this.zza = context;
    }

    public final boolean zza() {
        return zzb() != 0;
    }

    public final synchronized int zzb() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        android.content.pm.PackageManager packageManager = this.zza.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.zze = 1;
                return 1;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.zze = 2;
            return 2;
        }
        android.util.Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            this.zze = 2;
        } else {
            this.zze = 1;
        }
        return this.zze;
    }

    public static java.lang.String zza(com.google.firebase.FirebaseApp firebaseApp) {
        java.lang.String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        java.lang.String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        java.lang.String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final synchronized java.lang.String zzc() {
        if (this.zzb == null) {
            zzf();
        }
        return this.zzb;
    }

    public final synchronized java.lang.String zzd() {
        if (this.zzc == null) {
            zzf();
        }
        return this.zzc;
    }

    public final synchronized int zze() {
        android.content.pm.PackageInfo packageInfoZza;
        if (this.zzd == 0 && (packageInfoZza = zza("com.google.android.gms")) != null) {
            this.zzd = packageInfoZza.versionCode;
        }
        return this.zzd;
    }

    private final synchronized void zzf() {
        android.content.pm.PackageInfo packageInfoZza = zza(this.zza.getPackageName());
        if (packageInfoZza != null) {
            this.zzb = java.lang.Integer.toString(packageInfoZza.versionCode);
            this.zzc = packageInfoZza.versionName;
        }
    }

    private final android.content.pm.PackageInfo zza(java.lang.String str) {
        try {
            return this.zza.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
