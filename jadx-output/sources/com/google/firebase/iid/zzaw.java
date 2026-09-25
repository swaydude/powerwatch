package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {
    private static com.google.firebase.iid.zzaw zza;
    private java.lang.String zzb = null;
    private java.lang.Boolean zzc = null;
    private java.lang.Boolean zzd = null;
    private final java.util.Queue<android.content.Intent> zze = new java.util.ArrayDeque();

    public static synchronized com.google.firebase.iid.zzaw zza() {
        if (zza == null) {
            zza = new com.google.firebase.iid.zzaw();
        }
        return zza;
    }

    private zzaw() {
    }

    public final android.content.Intent zzb() {
        return this.zze.poll();
    }

    public final int zza(android.content.Context context, android.content.Intent intent) {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Starting service");
        }
        this.zze.offer(intent);
        android.content.Intent intent2 = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return zzb(context, intent2);
    }

    private final int zzb(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentNameStartService;
        java.lang.String strZzc = zzc(context, intent);
        if (strZzc != null) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String strValueOf = java.lang.String.valueOf(strZzc);
                android.util.Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(strValueOf) : new java.lang.String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), strZzc);
        }
        try {
            if (zza(context)) {
                componentNameStartService = com.google.firebase.iid.zzbd.zza(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                android.util.Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            android.util.Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return com.baidu.mapapi.UIMsg.l_ErrorNo.NETWORK_ERROR_404;
        } catch (java.lang.IllegalStateException e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(strValueOf2);
            android.util.Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        } catch (java.lang.SecurityException e2) {
            android.util.Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    private final synchronized java.lang.String zzc(android.content.Context context, android.content.Intent intent) {
        java.lang.String str = this.zzb;
        if (str != null) {
            return str;
        }
        android.content.pm.ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
            android.content.pm.ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
                    java.lang.String strValueOf2 = java.lang.String.valueOf(serviceInfo.name);
                    this.zzb = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
                } else {
                    this.zzb = serviceInfo.name;
                }
                return this.zzb;
            }
            java.lang.String str2 = serviceInfo.packageName;
            java.lang.String str3 = serviceInfo.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 94 + java.lang.String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            android.util.Log.e("FirebaseInstanceId", sb.toString());
            return null;
        }
        android.util.Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    final boolean zza(android.content.Context context) {
        if (this.zzc == null) {
            this.zzc = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzc.booleanValue() && android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzc.booleanValue();
    }

    final boolean zzb(android.content.Context context) {
        if (this.zzd == null) {
            this.zzd = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzc.booleanValue() && android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzd.booleanValue();
    }
}
