package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private final com.google.firebase.FirebaseApp zza;
    private final com.google.firebase.iid.zzao zzb;
    private final com.google.firebase.iid.zzau zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.firebase.platforminfo.UserAgentPublisher zze;
    private final com.google.firebase.heartbeatinfo.HeartBeatInfo zzf;
    private final com.google.firebase.installations.FirebaseInstallationsApi zzg;

    public zzt(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.zzao zzaoVar, java.util.concurrent.Executor executor, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, zzaoVar, executor, new com.google.firebase.iid.zzau(firebaseApp.getApplicationContext(), zzaoVar), userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
    }

    private zzt(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.zzao zzaoVar, java.util.concurrent.Executor executor, com.google.firebase.iid.zzau zzauVar, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this.zza = firebaseApp;
        this.zzb = zzaoVar;
        this.zzc = zzauVar;
        this.zzd = executor;
        this.zze = userAgentPublisher;
        this.zzf = heartBeatInfo;
        this.zzg = firebaseInstallationsApi;
    }

    public final com.google.android.gms.tasks.Task<java.lang.String> zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return zzb(zza(str, str2, str3, new android.os.Bundle()));
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("delete", "1");
        return zza(zzb(zza(str, str2, str3, bundle)));
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> zzc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String strValueOf = java.lang.String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new java.lang.String("/topics/"));
        java.lang.String strValueOf2 = java.lang.String.valueOf(str3);
        return zza(zzb(zza(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new java.lang.String("/topics/"), bundle)));
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> zzd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String strValueOf = java.lang.String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new java.lang.String("/topics/"));
        bundle.putString("delete", "1");
        java.lang.String strValueOf2 = java.lang.String.valueOf(str3);
        return zza(zzb(zza(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new java.lang.String("/topics/"), bundle)));
    }

    private final com.google.android.gms.tasks.Task<android.os.Bundle> zza(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final android.os.Bundle bundle) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zzd.execute(new java.lang.Runnable(this, str, str2, str3, bundle, taskCompletionSource) { // from class: com.google.firebase.iid.zzs
            private final com.google.firebase.iid.zzt zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final java.lang.String zzd;
            private final android.os.Bundle zze;
            private final com.google.android.gms.tasks.TaskCompletionSource zzf;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = str3;
                this.zze = bundle;
                this.zzf = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
            }
        });
        return taskCompletionSource.getTask();
    }

    private final java.lang.String zza() {
        try {
            return android.util.Base64.encodeToString(java.security.MessageDigest.getInstance(io.fabric.sdk.android.services.common.CommonUtils.SHA1_INSTANCE).digest(this.zza.getName().getBytes()), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private final android.os.Bundle zzb(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.zza.getOptions().getApplicationId());
        bundle.putString("gmsv", java.lang.Integer.toString(this.zzb.zze()));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.zzb.zzc());
        bundle.putString("app_ver_name", this.zzb.zzd());
        bundle.putString("firebase-app-name-hash", zza());
        try {
            java.lang.String token = ((com.google.firebase.installations.InstallationTokenResult) com.google.android.gms.tasks.Tasks.await(this.zzg.getToken(false))).getToken();
            if (!android.text.TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                android.util.Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        java.lang.String version = com.google.android.gms.common.internal.LibraryVersion.getInstance().getVersion("firebase-iid");
        if ("UNKNOWN".equals(version)) {
            int i = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            version = sb.toString();
        }
        java.lang.String strValueOf = java.lang.String.valueOf(version);
        bundle.putString("cliv", strValueOf.length() != 0 ? "fiid-".concat(strValueOf) : new java.lang.String("fiid-"));
        com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat heartBeatCode = this.zzf.getHeartBeatCode("fire-iid");
        if (heartBeatCode != com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", java.lang.Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", this.zze.getUserAgent());
        }
        return bundle;
    }

    private static <T> com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.android.gms.tasks.Task<T> task) {
        return task.continueWith(com.google.firebase.iid.zzh.zza(), com.google.firebase.iid.zzv.zza);
    }

    private final com.google.android.gms.tasks.Task<java.lang.String> zzb(com.google.android.gms.tasks.Task<android.os.Bundle> task) {
        return task.continueWith(this.zzd, new com.google.android.gms.tasks.Continuation(this) { // from class: com.google.firebase.iid.zzu
            private final com.google.firebase.iid.zzt zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) throws java.io.IOException {
                android.os.Bundle bundle = (android.os.Bundle) task2.getResult(java.io.IOException.class);
                if (bundle == null) {
                    throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
                }
                java.lang.String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                java.lang.String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                java.lang.String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new java.io.IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new java.io.IOException(string3);
                }
                java.lang.String strValueOf = java.lang.String.valueOf(bundle);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(strValueOf);
                android.util.Log.w("FirebaseInstanceId", sb.toString(), new java.lang.Throwable());
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    final /* synthetic */ void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            zzb(str, str2, str3, bundle);
            taskCompletionSource.setResult(this.zzc.zza(bundle));
        } catch (java.io.IOException e) {
            taskCompletionSource.setException(e);
        }
    }
}
