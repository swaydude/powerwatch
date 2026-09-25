package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhp extends com.google.android.gms.measurement.internal.zze {
    protected com.google.android.gms.measurement.internal.zzim zza;
    protected boolean zzb;
    private com.google.android.gms.measurement.internal.zzho zzc;
    private final java.util.Set<com.google.android.gms.measurement.internal.zzhn> zzd;
    private boolean zze;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> zzf;

    protected zzhp(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzd = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzb = true;
        this.zzf = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final void zzab() {
        if (zzn().getApplicationContext() instanceof android.app.Application) {
            ((android.app.Application) zzn().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final java.lang.Boolean zzac() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) zzq().zza(atomicReference, 15000L, "boolean test flag value", new com.google.android.gms.measurement.internal.zzhr(this, atomicReference));
    }

    public final java.lang.String zzad() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) zzq().zza(atomicReference, 15000L, "String test flag value", new com.google.android.gms.measurement.internal.zzib(this, atomicReference));
    }

    public final java.lang.Long zzae() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) zzq().zza(atomicReference, 15000L, "long test flag value", new com.google.android.gms.measurement.internal.zzid(this, atomicReference));
    }

    public final java.lang.Integer zzaf() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) zzq().zza(atomicReference, 15000L, "int test flag value", new com.google.android.gms.measurement.internal.zzig(this, atomicReference));
    }

    public final java.lang.Double zzag() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) zzq().zza(atomicReference, 15000L, "double test flag value", new com.google.android.gms.measurement.internal.zzif(this, atomicReference));
    }

    public final void zza(boolean z) {
        zzw();
        zzb();
        zzq().zza(new com.google.android.gms.measurement.internal.zzii(this, z));
    }

    public final void zzb(boolean z) {
        zzw();
        zzb();
        zzq().zza(new com.google.android.gms.measurement.internal.zzih(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(boolean z) {
        zzd();
        zzb();
        zzw();
        zzr().zzw().zza("Setting app measurement enabled (FE)", java.lang.Boolean.valueOf(z));
        zzs().zzb(z);
        zzam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzam() {
        if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbd)) {
            zzd();
            java.lang.String strZza = zzs().zzn.zza();
            if (strZza != null) {
                if ("unset".equals(strZza)) {
                    zza(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, "_npa", (java.lang.Object) null, zzm().currentTimeMillis());
                } else {
                    zza(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, "_npa", java.lang.Long.valueOf("true".equals(strZza) ? 1L : 0L), zzm().currentTimeMillis());
                }
            }
        }
        if (this.zzx.zzab() && this.zzb) {
            zzr().zzw().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzai();
            if (com.google.android.gms.internal.measurement.zzle.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcr)) {
                zzk().zza.zza();
            }
            if (com.google.android.gms.internal.measurement.zzkh.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcx)) {
                if (this.zzx.zzf().zza.zzc().zzi.zza() > 0) {
                    return;
                }
                this.zzx.zzf().zza();
                return;
            }
            return;
        }
        zzr().zzw().zza("Updating Scion state (FE)");
        zzh().zzac();
    }

    public final void zza(long j) {
        zzb();
        zzq().zza(new com.google.android.gms.measurement.internal.zzik(this, j));
    }

    public final void zzb(long j) {
        zzb();
        zzq().zza(new com.google.android.gms.measurement.internal.zzij(this, j));
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
        zza(str, str2, bundle, false, true, zzm().currentTimeMillis());
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza(str, str2, bundle, true, true, zzm().currentTimeMillis());
    }

    final void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, zzm().currentTimeMillis(), bundle);
    }

    final void zza(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, j, bundle, true, this.zzc == null || com.google.android.gms.measurement.internal.zzla.zze(str2), false, null);
    }

    protected final void zza(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        boolean z4;
        com.google.android.gms.measurement.internal.zzhp zzhpVar;
        java.lang.String str4;
        java.lang.String str5;
        com.google.android.gms.measurement.internal.zzit zzitVar;
        android.os.Bundle bundle2;
        int length;
        boolean z5;
        java.lang.Class<?> cls;
        java.util.List<java.lang.String> listZzah;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzd();
        zzw();
        if (!this.zzx.zzab()) {
            zzr().zzw().zza("Event not sent since app measurement is disabled");
            return;
        }
        if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbl) && (listZzah = zzg().zzah()) != null && !listZzah.contains(str2)) {
            zzr().zzw().zza("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzx.zzt()) {
                    cls = java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zzn().getClassLoader());
                } else {
                    cls = java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", android.content.Context.class).invoke(null, zzn());
                } catch (java.lang.Exception e) {
                    zzr().zzi().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                zzr().zzv().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzca) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), zzm().currentTimeMillis());
        }
        if (z3) {
            zzu();
            if (!"_iap".equals(str2)) {
                com.google.android.gms.measurement.internal.zzla zzlaVarZzi = this.zzx.zzi();
                int i = 2;
                if (zzlaVarZzi.zza(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (!zzlaVarZzi.zza(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzhj.zza, str2)) {
                        i = 13;
                    } else if (zzlaVarZzi.zza(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                        i = 0;
                    }
                }
                if (i != 0) {
                    zzr().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzo().zza(str2));
                    this.zzx.zzi();
                    this.zzx.zzi().zza(i, "_ev", com.google.android.gms.measurement.internal.zzla.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzu();
        com.google.android.gms.measurement.internal.zzit zzitVarZzab = zzi().zzab();
        if (zzitVarZzab != null && !bundle.containsKey("_sc")) {
            zzitVarZzab.zzd = true;
        }
        com.google.android.gms.measurement.internal.zziw.zza(zzitVarZzab, bundle, z && z3);
        boolean zEquals = "am".equals(str);
        boolean zZze = com.google.android.gms.measurement.internal.zzla.zze(str2);
        if (z && this.zzc != null && !zZze && !zEquals) {
            zzr().zzw().zza("Passing event to registered event handler (FE)", zzo().zza(str2), zzo().zza(bundle));
            this.zzc.interceptEvent(str, str2, bundle, j);
            return;
        }
        if (this.zzx.zzah()) {
            int iZzb = zzp().zzb(str2);
            if (iZzb != 0) {
                zzr().zzh().zza("Invalid event name. Event will not be logged (FE)", zzo().zza(str2));
                zzp();
                this.zzx.zzi().zza(str3, iZzb, "_ev", com.google.android.gms.measurement.internal.zzla.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            java.util.List<java.lang.String> listListOf = com.google.android.gms.common.util.CollectionUtils.listOf((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"});
            java.lang.String str6 = str2;
            android.os.Bundle bundleZza = zzp().zza(str3, str2, bundle, listListOf, z3, true);
            com.google.android.gms.measurement.internal.zzit zzitVar2 = (bundleZza != null && bundleZza.containsKey("_sc") && bundleZza.containsKey("_si")) ? new com.google.android.gms.measurement.internal.zzit(bundleZza.getString("_sn"), bundleZza.getString("_sc"), java.lang.Long.valueOf(bundleZza.getLong("_si")).longValue()) : null;
            com.google.android.gms.measurement.internal.zzit zzitVar3 = zzitVar2 == null ? zzitVarZzab : zzitVar2;
            java.lang.String str7 = "_ae";
            if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzba)) {
                zzu();
                if (zzi().zzab() != null && "_ae".equals(str6)) {
                    long jZzb = zzk().zzb.zzb();
                    if (jZzb > 0) {
                        zzp().zza(bundleZza, jZzb);
                    }
                }
            }
            if (com.google.android.gms.internal.measurement.zzka.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcq)) {
                if (!kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str6)) {
                    com.google.android.gms.measurement.internal.zzla zzlaVarZzp = zzp();
                    java.lang.String string = bundleZza.getString("_ffr");
                    java.lang.String strTrim = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(string) ? null : string.trim();
                    if (com.google.android.gms.measurement.internal.zzla.zzc(strTrim, zzlaVarZzp.zzs().zzw.zza())) {
                        zzlaVarZzp.zzr().zzw().zza("Not logging duplicate session_start_with_rollout event");
                        z5 = false;
                    } else {
                        zzlaVarZzp.zzs().zzw.zza(strTrim);
                        z5 = true;
                    }
                    if (!z5) {
                        return;
                    }
                } else if ("_ae".equals(str6)) {
                    java.lang.String strZza = zzp().zzs().zzw.zza();
                    if (!android.text.TextUtils.isEmpty(strZza)) {
                        bundleZza.putString("_ffr", strZza);
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundleZza);
            long jNextLong = zzp().zzh().nextLong();
            if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzau) && zzs().zzq.zza() > 0 && zzs().zza(j) && zzs().zzt.zza()) {
                zzr().zzx().zza("Current session is expired, remove the session number, ID, and engagement time");
                if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzar)) {
                    z4 = true;
                    zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", (java.lang.Object) null, zzm().currentTimeMillis());
                } else {
                    z4 = true;
                }
                if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzas)) {
                    zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", (java.lang.Object) null, zzm().currentTimeMillis());
                }
                if (com.google.android.gms.internal.measurement.zzmv.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbq)) {
                    zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", (java.lang.Object) null, zzm().currentTimeMillis());
                }
            } else {
                jNextLong = jNextLong;
                z4 = true;
            }
            if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzat) && bundleZza.getLong(com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION, 0L) == 1) {
                zzr().zzx().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzhpVar = this;
                zzhpVar.zzx.zze().zza.zza(j, z4);
            } else {
                zzhpVar = this;
            }
            java.lang.String[] strArr = (java.lang.String[]) bundleZza.keySet().toArray(new java.lang.String[bundleZza.size()]);
            java.util.Arrays.sort(strArr);
            if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdd) && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc)) {
                for (java.lang.String str8 : strArr) {
                    zzp();
                    android.os.Bundle[] bundleArrZza = com.google.android.gms.measurement.internal.zzla.zza(bundleZza.get(str8));
                    if (bundleArrZza != null) {
                        bundleZza.putParcelableArray(str8, bundleArrZza);
                    }
                }
                str4 = "_ae";
            } else {
                int length2 = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    java.lang.String str9 = "_eid";
                    if (i2 >= length2) {
                        break;
                    }
                    java.lang.String str10 = strArr[i2];
                    java.lang.Object obj = bundleZza.get(str10);
                    zzp();
                    java.lang.String[] strArr2 = strArr;
                    android.os.Bundle[] bundleArrZza2 = com.google.android.gms.measurement.internal.zzla.zza(obj);
                    int i4 = length2;
                    if (bundleArrZza2 != null) {
                        bundleZza.putInt(str10, bundleArrZza2.length);
                        int i5 = 0;
                        while (i5 < bundleArrZza2.length) {
                            android.os.Bundle bundle3 = bundleArrZza2[i5];
                            com.google.android.gms.measurement.internal.zziw.zza(zzitVar3, bundle3, true);
                            java.lang.String str11 = str9;
                            java.lang.String str12 = str10;
                            android.os.Bundle bundleZza2 = zzp().zza(str3, "_ep", bundle3, listListOf, z3, false);
                            bundleZza2.putString("_en", str6);
                            bundleZza2.putLong(str11, jNextLong);
                            bundleZza2.putString("_gn", str12);
                            bundleZza2.putInt("_ll", bundleArrZza2.length);
                            bundleZza2.putInt("_i", i5);
                            arrayList = arrayList;
                            arrayList.add(bundleZza2);
                            i5++;
                            bundleZza = bundleZza;
                            str9 = str11;
                            str10 = str12;
                            zzitVar3 = zzitVar3;
                            i3 = i3;
                            str7 = str7;
                        }
                        str5 = str7;
                        zzitVar = zzitVar3;
                        bundle2 = bundleZza;
                        length = bundleArrZza2.length + i3;
                    } else {
                        str5 = str7;
                        zzitVar = zzitVar3;
                        bundle2 = bundleZza;
                        length = i3;
                    }
                    i2++;
                    str7 = str5;
                    bundleZza = bundle2;
                    jNextLong = jNextLong;
                    zzitVar3 = zzitVar;
                    length2 = i4;
                    i3 = length;
                    strArr = strArr2;
                }
                int i6 = i3;
                str4 = str7;
                android.os.Bundle bundle4 = bundleZza;
                long j2 = jNextLong;
                if (i6 != 0) {
                    bundle4.putLong("_eid", j2);
                    bundle4.putInt("_epc", i6);
                }
            }
            int i7 = 0;
            while (i7 < arrayList.size()) {
                android.os.Bundle bundleZza3 = (android.os.Bundle) arrayList.get(i7);
                java.lang.String str13 = i7 != 0 ? "_ep" : str6;
                bundleZza3.putString("_o", str);
                if (z2) {
                    bundleZza3 = zzp().zza(bundleZza3);
                }
                android.os.Bundle bundle5 = bundleZza3;
                if (!com.google.android.gms.internal.measurement.zzkt.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcy)) {
                    zzr().zzw().zza("Logging event (FE)", zzo().zza(str6), zzo().zza(bundle5));
                }
                java.lang.String str14 = str4;
                java.lang.String str15 = str6;
                zzh().zza(new com.google.android.gms.measurement.internal.zzan(str13, new com.google.android.gms.measurement.internal.zzam(bundle5), str, j), str3);
                if (!zEquals) {
                    java.util.Iterator<com.google.android.gms.measurement.internal.zzhn> it = zzhpVar.zzd.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new android.os.Bundle(bundle5), j);
                    }
                }
                i7++;
                str4 = str14;
                str6 = str15;
            }
            java.lang.String str16 = str4;
            java.lang.String str17 = str6;
            zzu();
            if (zzi().zzab() == null || !str16.equals(str17)) {
                return;
            }
            zzk().zza(true, true, zzm().elapsedRealtime());
        }
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        zzb(str == null ? io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY : str, str2, j, bundle == null ? new android.os.Bundle() : bundle, z2, !z2 || this.zzc == null || com.google.android.gms.measurement.internal.zzla.zze(str2), !z, null);
    }

    private final void zzb(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        zzq().zza(new com.google.android.gms.measurement.internal.zzhu(this, str, str2, j, com.google.android.gms.measurement.internal.zzla.zzb(bundle), z, z2, z3, str3));
    }

    public final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zza(str, str2, obj, z, zzm().currentTimeMillis());
    }

    public final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z, long j) {
        if (str == null) {
            str = io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY;
        }
        java.lang.String str3 = str;
        int iZzc = 6;
        if (z) {
            iZzc = zzp().zzc(str2);
        } else {
            com.google.android.gms.measurement.internal.zzla zzlaVarZzp = zzp();
            if (zzlaVarZzp.zza("user property", str2)) {
                if (!zzlaVarZzp.zza("user property", com.google.android.gms.measurement.internal.zzhl.zza, str2)) {
                    iZzc = 15;
                } else if (zzlaVarZzp.zza("user property", 24, str2)) {
                    iZzc = 0;
                }
            }
        }
        if (iZzc != 0) {
            zzp();
            this.zzx.zzi().zza(iZzc, "_ev", com.google.android.gms.measurement.internal.zzla.zza(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj != null) {
            int iZzb = zzp().zzb(str2, obj);
            if (iZzb != 0) {
                zzp();
                this.zzx.zzi().zza(iZzb, "_ev", com.google.android.gms.measurement.internal.zzla.zza(str2, 24, true), ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? java.lang.String.valueOf(obj).length() : 0);
                return;
            } else {
                java.lang.Object objZzc = zzp().zzc(str2, obj);
                if (objZzc != null) {
                    zza(str3, str2, j, objZzc);
                    return;
                }
                return;
            }
        }
        zza(str3, str2, j, (java.lang.Object) null);
    }

    private final void zza(java.lang.String str, java.lang.String str2, long j, java.lang.Object obj) {
        zzq().zza(new com.google.android.gms.measurement.internal.zzht(this, str, str2, obj, j));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j) {
        java.lang.String str3;
        java.lang.Object obj2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzb();
        zzw();
        if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbd) && com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof java.lang.String) {
                java.lang.String str4 = (java.lang.String) obj;
                if (!android.text.TextUtils.isEmpty(str4)) {
                    java.lang.Long lValueOf = java.lang.Long.valueOf("false".equals(str4.toLowerCase(java.util.Locale.ENGLISH)) ? 1L : 0L);
                    zzs().zzn.zza(lValueOf.longValue() == 1 ? "true" : "false");
                    obj2 = lValueOf;
                } else if (obj == null) {
                    zzs().zzn.zza("unset");
                    obj2 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                zzs().zzn.zza("unset");
                obj2 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzx.zzab()) {
            zzr().zzx().zza("User property not set since app measurement is disabled");
        } else if (this.zzx.zzah()) {
            zzh().zza(new com.google.android.gms.measurement.internal.zzkz(str3, j, obj2, str));
        }
    }

    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zzc(boolean z) {
        zzb();
        zzw();
        zzr().zzx().zza("Getting user properties (FE)");
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get all user properties from analytics worker thread");
            return java.util.Collections.emptyList();
        }
        if (com.google.android.gms.measurement.internal.zzw.zza()) {
            zzr().zzf().zza("Cannot get all user properties from main thread");
            return java.util.Collections.emptyList();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzx.zzq().zza(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzhw(this, atomicReference, z));
        java.util.List<com.google.android.gms.measurement.internal.zzkz> list = (java.util.List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzr().zzf().zza("Timed out waiting for get user properties, includeInternal", java.lang.Boolean.valueOf(z));
        return java.util.Collections.emptyList();
    }

    public final java.lang.String zzah() {
        zzb();
        return this.zzf.get();
    }

    public final java.lang.String zzc(long j) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot retrieve app instance id from analytics worker thread");
            return null;
        }
        if (com.google.android.gms.measurement.internal.zzw.zza()) {
            zzr().zzf().zza("Cannot retrieve app instance id from main thread");
            return null;
        }
        long jElapsedRealtime = zzm().elapsedRealtime();
        java.lang.String strZze = zze(120000L);
        long jElapsedRealtime2 = zzm().elapsedRealtime() - jElapsedRealtime;
        return (strZze != null || jElapsedRealtime2 >= 120000) ? strZze : zze(120000 - jElapsedRealtime2);
    }

    final void zza(java.lang.String str) {
        this.zzf.set(str);
    }

    private final java.lang.String zze(long j) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (atomicReference) {
            zzq().zza(new com.google.android.gms.measurement.internal.zzhv(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (java.lang.InterruptedException unused) {
                zzr().zzi().zza("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (java.lang.String) atomicReference.get();
    }

    public final void zzd(long j) {
        zza((java.lang.String) null);
        zzq().zza(new com.google.android.gms.measurement.internal.zzhy(this, j));
    }

    public final void zzai() {
        zzd();
        zzb();
        zzw();
        if (this.zzx.zzah()) {
            if (zzt().zza(com.google.android.gms.measurement.internal.zzap.zzby)) {
                com.google.android.gms.measurement.internal.zzx zzxVarZzt = zzt();
                zzxVarZzt.zzu();
                java.lang.Boolean boolZzd = zzxVarZzt.zzd("google_analytics_deferred_deep_link_enabled");
                if (boolZzd != null && boolZzd.booleanValue()) {
                    zzr().zzw().zza("Deferred Deep Link feature enabled.");
                    zzq().zza(new java.lang.Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzhs
                        private final com.google.android.gms.measurement.internal.zzhp zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.android.gms.measurement.internal.zzhp zzhpVar = this.zza;
                            zzhpVar.zzd();
                            if (zzhpVar.zzs().zzu.zza()) {
                                zzhpVar.zzr().zzw().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzhpVar.zzs().zzv.zza();
                            zzhpVar.zzs().zzv.zza(1 + jZza);
                            if (jZza < 5) {
                                zzhpVar.zzx.zzai();
                            } else {
                                zzhpVar.zzr().zzi().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhpVar.zzs().zzu.zza(true);
                            }
                        }
                    });
                }
            }
            zzh().zzae();
            this.zzb = false;
            java.lang.String strZzw = zzs().zzw();
            if (android.text.TextUtils.isEmpty(strZzw)) {
                return;
            }
            zzl().zzaa();
            if (strZzw.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", strZzw);
            zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    public final void zza(com.google.android.gms.measurement.internal.zzho zzhoVar) {
        com.google.android.gms.measurement.internal.zzho zzhoVar2;
        zzd();
        zzb();
        zzw();
        if (zzhoVar != null && zzhoVar != (zzhoVar2 = this.zzc)) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzhoVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zzhoVar;
    }

    public final void zza(com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        zzb();
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhnVar);
        if (this.zzd.add(zzhnVar)) {
            return;
        }
        zzr().zzi().zza("OnEventListener already registered");
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        zzb();
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhnVar);
        if (this.zzd.remove(zzhnVar)) {
            return;
        }
        zzr().zzi().zza("OnEventListener had not been registered");
    }

    public final void zza(android.os.Bundle bundle) {
        zza(bundle, zzm().currentTimeMillis());
    }

    public final void zza(android.os.Bundle bundle, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzb();
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        if (!android.text.TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzr().zzi().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzb(bundle2, j);
    }

    public final void zzb(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zza();
        zzb(new android.os.Bundle(bundle), zzm().currentTimeMillis());
    }

    private final void zzb(android.os.Bundle bundle, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, "app_id", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, "origin", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, "value", java.lang.Object.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString("origin"));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle.get("value"));
        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        java.lang.String string = bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
        java.lang.Object obj = bundle.get("value");
        if (zzp().zzc(string) != 0) {
            zzr().zzf().zza("Invalid conditional user property name", zzo().zzc(string));
            return;
        }
        if (zzp().zzb(string, obj) != 0) {
            zzr().zzf().zza("Invalid conditional user property value", zzo().zzc(string), obj);
            return;
        }
        java.lang.Object objZzc = zzp().zzc(string, obj);
        if (objZzc == null) {
            zzr().zzf().zza("Unable to normalize conditional user property value", zzo().zzc(string), obj);
            return;
        }
        com.google.android.gms.measurement.internal.zzhk.zza(bundle, objZzc);
        long j2 = bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!android.text.TextUtils.isEmpty(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
            zzr().zzf().zza("Invalid conditional user property timeout", zzo().zzc(string), java.lang.Long.valueOf(j2));
            return;
        }
        long j3 = bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        if (j3 > 15552000000L || j3 < 1) {
            zzr().zzf().zza("Invalid conditional user property time to live", zzo().zzc(string), java.lang.Long.valueOf(j3));
        } else {
            zzq().zza(new com.google.android.gms.measurement.internal.zzia(this, bundle));
        }
    }

    public final void zzc(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzb();
        zzb((java.lang.String) null, str, str2, bundle);
    }

    public final void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zza();
        zzb(str, str2, str3, bundle);
    }

    private final void zzb(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        long jCurrentTimeMillis = zzm().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str3 != null) {
            bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzq().zza(new com.google.android.gms.measurement.internal.zzhz(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(android.os.Bundle bundle) {
        zzd();
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString("origin"));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle.get("value"));
        if (!this.zzx.zzab()) {
            zzr().zzx().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        com.google.android.gms.measurement.internal.zzkz zzkzVar = new com.google.android.gms.measurement.internal.zzkz(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), bundle.getString("origin"));
        try {
            com.google.android.gms.measurement.internal.zzan zzanVarZza = zzp().zza(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false);
            zzh().zza(new com.google.android.gms.measurement.internal.zzv(bundle.getString("app_id"), bundle.getString("origin"), zzkzVar, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzp().zza(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzanVarZza, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzp().zza(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), 0L, true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(android.os.Bundle bundle) {
        zzd();
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!this.zzx.zzab()) {
            zzr().zzx().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzh().zza(new com.google.android.gms.measurement.internal.zzv(bundle.getString("app_id"), bundle.getString("origin"), new com.google.android.gms.measurement.internal.zzkz(bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME), 0L, null, null), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzp().zza(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle.getString("origin"), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    public final java.util.ArrayList<android.os.Bundle> zza(java.lang.String str, java.lang.String str2) {
        zzb();
        return zzb((java.lang.String) null, str, str2);
    }

    public final java.util.ArrayList<android.os.Bundle> zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3);
    }

    private final java.util.ArrayList<android.os.Bundle> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get conditional user properties from analytics worker thread");
            return new java.util.ArrayList<>(0);
        }
        if (com.google.android.gms.measurement.internal.zzw.zza()) {
            zzr().zzf().zza("Cannot get conditional user properties from main thread");
            return new java.util.ArrayList<>(0);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzx.zzq().zza(atomicReference, 5000L, "get conditional user properties", new com.google.android.gms.measurement.internal.zzic(this, atomicReference, str, str2, str3));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list == null) {
            zzr().zzf().zza("Timed out waiting for get conditional user properties", str);
            return new java.util.ArrayList<>();
        }
        return com.google.android.gms.measurement.internal.zzla.zzb((java.util.List<com.google.android.gms.measurement.internal.zzv>) list);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> zza(java.lang.String str, java.lang.String str2, boolean z) {
        zzb();
        return zzb((java.lang.String) null, str, str2, z);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3, z);
    }

    private final java.util.Map<java.lang.String, java.lang.Object> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get user properties from analytics worker thread");
            return java.util.Collections.emptyMap();
        }
        if (com.google.android.gms.measurement.internal.zzw.zza()) {
            zzr().zzf().zza("Cannot get user properties from main thread");
            return java.util.Collections.emptyMap();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzx.zzq().zza(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzie(this, atomicReference, str, str2, str3, z));
        java.util.List<com.google.android.gms.measurement.internal.zzkz> list = (java.util.List) atomicReference.get();
        if (list == null) {
            zzr().zzf().zza("Timed out waiting for handle get user properties, includeInternal", java.lang.Boolean.valueOf(z));
            return java.util.Collections.emptyMap();
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(list.size());
        for (com.google.android.gms.measurement.internal.zzkz zzkzVar : list) {
            arrayMap.put(zzkzVar.zza, zzkzVar.zza());
        }
        return arrayMap;
    }

    public final java.lang.String zzaj() {
        com.google.android.gms.measurement.internal.zzit zzitVarZzac = this.zzx.zzv().zzac();
        if (zzitVarZzac != null) {
            return zzitVarZzac.zza;
        }
        return null;
    }

    public final java.lang.String zzak() {
        com.google.android.gms.measurement.internal.zzit zzitVarZzac = this.zzx.zzv().zzac();
        if (zzitVarZzac != null) {
            return zzitVarZzac.zzb;
        }
        return null;
    }

    public final java.lang.String zzal() {
        if (this.zzx.zzo() != null) {
            return this.zzx.zzo();
        }
        try {
            return com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();
        } catch (java.lang.IllegalStateException e) {
            this.zzx.zzr().zzf().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfd zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzix zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zziw zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfg zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkc zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }
}
