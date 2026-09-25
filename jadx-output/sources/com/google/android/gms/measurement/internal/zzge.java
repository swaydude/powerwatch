package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzge {
    private final com.google.android.gms.measurement.internal.zzgf zza;

    public zzge(com.google.android.gms.measurement.internal.zzgf zzgfVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgfVar);
        this.zza = zzgfVar;
    }

    public static boolean zza(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public final void zza(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.measurement.internal.zzgo zzgoVarZza = com.google.android.gms.measurement.internal.zzgo.zza(context, (com.google.android.gms.internal.measurement.zzv) null);
        com.google.android.gms.measurement.internal.zzfk zzfkVarZzr = zzgoVarZza.zzr();
        if (intent == null) {
            zzfkVarZzr.zzi().zza("Receiver called with null intent");
            return;
        }
        zzgoVarZza.zzu();
        java.lang.String action = intent.getAction();
        zzfkVarZzr.zzx().zza("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzfkVarZzr.zzx().zza("Starting wakeful intent.");
            this.zza.doStartService(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zzgoVarZza.zzq().zza(new com.google.android.gms.measurement.internal.zzgd(this, zzgoVarZza, zzfkVarZzr));
            } catch (java.lang.Exception e) {
                zzfkVarZzr.zzi().zza("Install Referrer Reporter encountered a problem", e);
            }
            android.content.BroadcastReceiver.PendingResult pendingResultDoGoAsync = this.zza.doGoAsync();
            java.lang.String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                zzfkVarZzr.zzx().zza("Install referrer extras are null");
                if (pendingResultDoGoAsync != null) {
                    pendingResultDoGoAsync.finish();
                    return;
                }
                return;
            }
            zzfkVarZzr.zzv().zza("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                java.lang.String strValueOf = java.lang.String.valueOf(stringExtra);
                stringExtra = strValueOf.length() != 0 ? "?".concat(strValueOf) : new java.lang.String("?");
            }
            android.os.Bundle bundleZza = zzgoVarZza.zzi().zza(android.net.Uri.parse(stringExtra));
            if (bundleZza == null) {
                zzfkVarZzr.zzx().zza("No campaign defined in install referrer broadcast");
                if (pendingResultDoGoAsync != null) {
                    pendingResultDoGoAsync.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0L) * 1000;
            if (longExtra == 0) {
                zzfkVarZzr.zzi().zza("Install referrer is missing timestamp");
            }
            zzgoVarZza.zzq().zza(new com.google.android.gms.measurement.internal.zzgg(this, zzgoVarZza, longExtra, bundleZza, context, zzfkVarZzr, pendingResultDoGoAsync));
        }
    }
}
