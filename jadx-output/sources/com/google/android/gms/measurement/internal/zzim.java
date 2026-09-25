package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzim implements android.app.Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zza;

    private zzim(com.google.android.gms.measurement.internal.zzhp zzhpVar) {
        this.zza = zzhpVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        try {
            try {
                this.zza.zzr().zzx().zza("onActivityCreated");
                android.content.Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                android.net.Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    this.zza.zzp();
                    java.lang.String str = com.google.android.gms.measurement.internal.zzla.zza(intent) ? "gs" : kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    java.lang.String queryParameter = data.getQueryParameter("referrer");
                    boolean z = bundle == null;
                    if (com.google.android.gms.internal.measurement.zzlr.zzb() && com.google.android.gms.measurement.internal.zzap.zzcd.zza(null).booleanValue()) {
                        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzil(this, z, data, str, queryParameter));
                    } else {
                        zza(z, data, str, queryParameter);
                    }
                }
            } catch (java.lang.Exception e) {
                this.zza.zzr().zzf().zza("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.zza.zzi().zza(activity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(boolean z, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundleZza;
        android.os.Bundle bundleZza2;
        try {
            if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzca) || this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcc) || this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcb)) {
                com.google.android.gms.measurement.internal.zzla zzlaVarZzp = this.zza.zzp();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium")) {
                        zzlaVarZzp.zzr().zzw().zza("Activity created with data 'referrer' without required params");
                    } else {
                        java.lang.String strValueOf = java.lang.String.valueOf(str2);
                        bundleZza = zzlaVarZzp.zza(android.net.Uri.parse(strValueOf.length() != 0 ? "https://google.com/search?".concat(strValueOf) : new java.lang.String("https://google.com/search?")));
                        if (bundleZza != null) {
                            bundleZza.putString("_cis", "referrer");
                        }
                    }
                }
                bundleZza = null;
            } else {
                bundleZza = null;
            }
            boolean z2 = false;
            if (z) {
                bundleZza2 = this.zza.zzp().zza(uri);
                if (bundleZza2 != null) {
                    bundleZza2.putString("_cis", "intent");
                    if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzca) && !bundleZza2.containsKey("gclid") && bundleZza != null && bundleZza.containsKey("gclid")) {
                        bundleZza2.putString("_cer", java.lang.String.format("gclid=%s", bundleZza.getString("gclid")));
                    }
                    this.zza.zza(str, "_cmp", bundleZza2);
                }
            } else {
                bundleZza2 = null;
            }
            if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcc) && !this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcb) && bundleZza != null && bundleZza.containsKey("gclid") && (bundleZza2 == null || !bundleZza2.containsKey("gclid"))) {
                this.zza.zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", (java.lang.Object) bundleZza.getString("gclid"), true);
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            this.zza.zzr().zzw().zza("Activity created with referrer", str2);
            if (this.zza.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcb)) {
                if (bundleZza != null) {
                    this.zza.zza(str, "_cmp", bundleZza);
                } else {
                    this.zza.zzr().zzw().zza("Referrer does not contain valid parameters", str2);
                }
                this.zza.zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", (java.lang.Object) null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z2 = true;
            }
            if (!z2) {
                this.zza.zzr().zzw().zza("Activity created with data 'referrer' without required params");
            } else {
                if (android.text.TextUtils.isEmpty(str2)) {
                    return;
                }
                this.zza.zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", (java.lang.Object) str2, true);
            }
        } catch (java.lang.Exception e) {
            this.zza.zzr().zzf().zza("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.zza.zzi().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.zza.zzi().zzb(activity);
        com.google.android.gms.measurement.internal.zzkc zzkcVarZzk = this.zza.zzk();
        zzkcVarZzk.zzq().zza(new com.google.android.gms.measurement.internal.zzke(zzkcVarZzk, zzkcVarZzk.zzm().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (com.google.android.gms.internal.measurement.zzle.zzb() && com.google.android.gms.measurement.internal.zzap.zzax.zza(null).booleanValue()) {
            this.zza.zzk().zzab();
            this.zza.zzi().zza(activity);
        } else {
            this.zza.zzi().zza(activity);
            this.zza.zzk().zzab();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.zza.zzi().zzb(activity, bundle);
    }

    /* synthetic */ zzim(com.google.android.gms.measurement.internal.zzhp zzhpVar, com.google.android.gms.measurement.internal.zzhr zzhrVar) {
        this(zzhpVar);
    }
}
