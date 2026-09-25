package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzix extends com.google.android.gms.measurement.internal.zze {
    private final com.google.android.gms.measurement.internal.zzjp zza;
    private com.google.android.gms.measurement.internal.zzfc zzb;
    private volatile java.lang.Boolean zzc;
    private final com.google.android.gms.measurement.internal.zzaf zzd;
    private final com.google.android.gms.measurement.internal.zzkl zze;
    private final java.util.List<java.lang.Runnable> zzf;
    private final com.google.android.gms.measurement.internal.zzaf zzg;

    protected zzix(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzf = new java.util.ArrayList();
        this.zze = new com.google.android.gms.measurement.internal.zzkl(zzgoVar.zzm());
        this.zza = new com.google.android.gms.measurement.internal.zzjp(this);
        this.zzd = new com.google.android.gms.measurement.internal.zzja(this, zzgoVar);
        this.zzg = new com.google.android.gms.measurement.internal.zzjh(this, zzgoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final boolean zzab() {
        zzd();
        zzw();
        return this.zzb != null;
    }

    protected final void zzac() {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjk(this, zza(true)));
    }

    final void zza(com.google.android.gms.measurement.internal.zzfc zzfcVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.measurement.internal.zzm zzmVar) {
        int size;
        java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> listZza;
        zzd();
        zzb();
        zzw();
        boolean zZzai = zzai();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!zZzai || (listZza = zzj().zza(100)) == null) {
                size = 0;
            } else {
                arrayList.addAll(listZza);
                size = listZza.size();
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            java.util.ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                java.lang.Object obj = arrayList2.get(i3);
                i3++;
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable2 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzan) {
                    try {
                        zzfcVar.zza((com.google.android.gms.measurement.internal.zzan) abstractSafeParcelable2, zzmVar);
                    } catch (android.os.RemoteException e) {
                        zzr().zzf().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzkz) {
                    try {
                        zzfcVar.zza((com.google.android.gms.measurement.internal.zzkz) abstractSafeParcelable2, zzmVar);
                    } catch (android.os.RemoteException e2) {
                        zzr().zzf().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof com.google.android.gms.measurement.internal.zzv) {
                    try {
                        zzfcVar.zza((com.google.android.gms.measurement.internal.zzv) abstractSafeParcelable2, zzmVar);
                    } catch (android.os.RemoteException e3) {
                        zzr().zzf().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzr().zzf().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    protected final void zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        zzd();
        zzw();
        boolean zZzai = zzai();
        zza(new com.google.android.gms.measurement.internal.zzjj(this, zZzai, zZzai && zzj().zza(zzanVar), zzanVar, zza(true), str));
    }

    protected final void zza(com.google.android.gms.measurement.internal.zzv zzvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
        zzd();
        zzw();
        zzu();
        zza(new com.google.android.gms.measurement.internal.zzjm(this, true, zzj().zza(zzvVar), new com.google.android.gms.measurement.internal.zzv(zzvVar), zza(true), zzvVar));
    }

    protected final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.measurement.internal.zzv>> atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjl(this, atomicReference, str, str2, str3, zza(false)));
    }

    protected final void zza(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str, java.lang.String str2) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjo(this, str, str2, zza(false), zznVar));
    }

    protected final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.measurement.internal.zzkz>> atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjn(this, atomicReference, str, str2, str3, z, zza(false)));
    }

    protected final void zza(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str, java.lang.String str2, boolean z) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjq(this, str, str2, z, zza(false), zznVar));
    }

    protected final void zza(com.google.android.gms.measurement.internal.zzkz zzkzVar) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zziz(this, zzai() && zzj().zza(zzkzVar), zzkzVar, zza(true)));
    }

    protected final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.measurement.internal.zzkz>> atomicReference, boolean z) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjc(this, atomicReference, zza(false), z));
    }

    protected final void zzad() {
        zzd();
        zzb();
        zzw();
        com.google.android.gms.measurement.internal.zzm zzmVarZza = zza(false);
        if (zzai()) {
            zzj().zzab();
        }
        zza(new com.google.android.gms.measurement.internal.zzjb(this, zzmVarZza));
    }

    private final boolean zzai() {
        zzu();
        return true;
    }

    public final void zza(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzje(this, atomicReference, zza(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjd(this, zza(false), zznVar));
    }

    protected final void zzae() {
        zzd();
        zzw();
        com.google.android.gms.measurement.internal.zzm zzmVarZza = zza(true);
        boolean zZza = zzt().zza(com.google.android.gms.measurement.internal.zzap.zzbz);
        if (zZza) {
            zzj().zzac();
        }
        zza(new com.google.android.gms.measurement.internal.zzjg(this, zzmVarZza, zZza));
    }

    protected final void zza(com.google.android.gms.measurement.internal.zzit zzitVar) {
        zzd();
        zzw();
        zza(new com.google.android.gms.measurement.internal.zzjf(this, zzitVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj() {
        zzd();
        this.zze.zza();
        this.zzd.zza(com.google.android.gms.measurement.internal.zzap.zzah.zza(null).longValue());
    }

    final void zzaf() {
        boolean z;
        boolean z2;
        zzd();
        zzw();
        if (zzab()) {
            return;
        }
        boolean z3 = false;
        if (this.zzc == null) {
            zzd();
            zzw();
            java.lang.Boolean boolZzj = zzs().zzj();
            if (boolZzj == null || !boolZzj.booleanValue()) {
                zzu();
                if (zzg().zzag() == 1) {
                    z = true;
                    z2 = true;
                } else {
                    zzr().zzx().zza("Checking service availability");
                    int iZza = zzp().zza(12451000);
                    if (iZza != 0) {
                        if (iZza != 1) {
                            if (iZza == 2) {
                                zzr().zzw().zza("Service container out of date");
                                if (zzp().zzj() >= 17443) {
                                    java.lang.Boolean boolZzj2 = zzs().zzj();
                                    z = boolZzj2 == null || boolZzj2.booleanValue();
                                    z2 = false;
                                }
                            } else if (iZza == 3) {
                                zzr().zzi().zza("Service disabled");
                            } else if (iZza == 9) {
                                zzr().zzi().zza("Service invalid");
                            } else if (iZza == 18) {
                                zzr().zzi().zza("Service updating");
                            } else {
                                zzr().zzi().zza("Unexpected service status", java.lang.Integer.valueOf(iZza));
                            }
                            z2 = false;
                        } else {
                            zzr().zzx().zza("Service missing");
                        }
                        z = false;
                        z2 = true;
                    } else {
                        zzr().zzx().zza("Service available");
                    }
                    z = true;
                    z2 = true;
                }
                if (!z && zzt().zzx()) {
                    zzr().zzf().zza("No way to upload. Consider using the full version of Analytics");
                    z2 = false;
                }
                if (z2) {
                    zzs().zza(z);
                }
            } else {
                z = true;
            }
            this.zzc = java.lang.Boolean.valueOf(z);
        }
        if (this.zzc.booleanValue()) {
            this.zza.zzb();
            return;
        }
        if (zzt().zzx()) {
            return;
        }
        zzu();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = zzn().getPackageManager().queryIntentServices(new android.content.Intent().setClassName(zzn(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
            z3 = true;
        }
        if (z3) {
            android.content.Intent intent = new android.content.Intent("com.google.android.gms.measurement.START");
            android.content.Context contextZzn = zzn();
            zzu();
            intent.setComponent(new android.content.ComponentName(contextZzn, "com.google.android.gms.measurement.AppMeasurementService"));
            this.zza.zza(intent);
            return;
        }
        zzr().zzf().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
    }

    final java.lang.Boolean zzag() {
        return this.zzc;
    }

    protected final void zza(com.google.android.gms.measurement.internal.zzfc zzfcVar) {
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfcVar);
        this.zzb = zzfcVar;
        zzaj();
        zzal();
    }

    public final void zzah() {
        zzd();
        zzw();
        this.zza.zza();
        try {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(zzn(), this.zza);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(android.content.ComponentName componentName) {
        zzd();
        if (this.zzb != null) {
            this.zzb = null;
            zzr().zzx().zza("Disconnected from device MeasurementService", componentName);
            zzd();
            zzaf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak() {
        zzd();
        if (zzab()) {
            zzr().zzx().zza("Inactivity, disconnecting from the service");
            zzah();
        }
    }

    private final void zza(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzd();
        if (zzab()) {
            runnable.run();
        } else {
            if (this.zzf.size() >= 1000) {
                zzr().zzf().zza("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzf.add(runnable);
            this.zzg.zza(60000L);
            zzaf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal() {
        zzd();
        zzr().zzx().zza("Processing queued up service tasks", java.lang.Integer.valueOf(this.zzf.size()));
        java.util.Iterator<java.lang.Runnable> it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (java.lang.Exception e) {
                zzr().zzf().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzc();
    }

    private final com.google.android.gms.measurement.internal.zzm zza(boolean z) {
        zzu();
        return zzg().zza(z ? zzr().zzy() : null);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        zzd();
        zzw();
        if (zzp().zza(12451000) != 0) {
            zzr().zzi().zza("Not bundling data. Service unavailable or out of date");
            zzp().zza(zznVar, new byte[0]);
        } else {
            zza(new com.google.android.gms.measurement.internal.zzji(this, zzanVar, str, zznVar));
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

    static /* synthetic */ com.google.android.gms.measurement.internal.zzfc zza(com.google.android.gms.measurement.internal.zzix zzixVar, com.google.android.gms.measurement.internal.zzfc zzfcVar) {
        zzixVar.zzb = null;
        return null;
    }
}
