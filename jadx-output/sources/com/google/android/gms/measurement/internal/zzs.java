package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzs {
    private com.google.android.gms.internal.measurement.zzbr.zzc zza;
    private java.lang.Long zzb;
    private long zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzn zzd;

    private zzs(com.google.android.gms.measurement.internal.zzn zznVar) {
        this.zzd = zznVar;
    }

    final com.google.android.gms.internal.measurement.zzbr.zzc zza(java.lang.String str, com.google.android.gms.internal.measurement.zzbr.zzc zzcVar) {
        java.lang.String strZzc = zzcVar.zzc();
        java.util.List<com.google.android.gms.internal.measurement.zzbr.zze> listZza = zzcVar.zza();
        java.lang.Long l = (java.lang.Long) this.zzd.zzg().zzb(zzcVar, "_eid");
        boolean z = l != null;
        if (z && strZzc.equals("_ep")) {
            java.lang.String str2 = (java.lang.String) this.zzd.zzg().zzb(zzcVar, "_en");
            if (android.text.TextUtils.isEmpty(str2)) {
                if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zzd.zzt().zzd(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                    this.zzd.zzr().zzg().zza("Extra parameter without an event name. eventId", l);
                } else {
                    this.zzd.zzr().zzf().zza("Extra parameter without an event name. eventId", l);
                }
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> pairZza = this.zzd.zzi().zza(str, l);
                if (pairZza == null || pairZza.first == null) {
                    if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zzd.zzt().zzd(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                        this.zzd.zzr().zzg().zza("Extra parameter without existing main event. eventName, eventId", str2, l);
                    } else {
                        this.zzd.zzr().zzf().zza("Extra parameter without existing main event. eventName, eventId", str2, l);
                    }
                    return null;
                }
                this.zza = (com.google.android.gms.internal.measurement.zzbr.zzc) pairZza.first;
                this.zzc = ((java.lang.Long) pairZza.second).longValue();
                this.zzb = (java.lang.Long) this.zzd.zzg().zzb(this.zza, "_eid");
            }
            long j = this.zzc - 1;
            this.zzc = j;
            if (j <= 0) {
                com.google.android.gms.measurement.internal.zzac zzacVarZzi = this.zzd.zzi();
                zzacVarZzi.zzd();
                zzacVarZzi.zzr().zzx().zza("Clearing complex main event info. appId", str);
                try {
                    zzacVarZzi.c_().execSQL("delete from main_event_params where app_id=?", new java.lang.String[]{str});
                } catch (android.database.sqlite.SQLiteException e) {
                    zzacVarZzi.zzr().zzf().zza("Error clearing complex main event", e);
                }
            } else {
                this.zzd.zzi().zza(str, l, this.zzc, this.zza);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.measurement.zzbr.zze zzeVar : this.zza.zza()) {
                this.zzd.zzg();
                if (com.google.android.gms.measurement.internal.zzkw.zza(zzcVar, zzeVar.zzb()) == null) {
                    arrayList.add(zzeVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(listZza);
                listZza = arrayList;
            } else if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zzd.zzt().zzd(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zzd.zzr().zzg().zza("No unique parameters in main event. eventName", str2);
            } else {
                this.zzd.zzr().zzi().zza("No unique parameters in main event. eventName", str2);
            }
            strZzc = str2;
        } else if (z) {
            this.zzb = l;
            this.zza = zzcVar;
            java.lang.Object objZzb = this.zzd.zzg().zzb(zzcVar, "_epc");
            long jLongValue = ((java.lang.Long) (objZzb != null ? objZzb : 0L)).longValue();
            this.zzc = jLongValue;
            if (jLongValue > 0) {
                this.zzd.zzi().zza(str, l, this.zzc, zzcVar);
            } else if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zzd.zzt().zzd(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zzd.zzr().zzg().zza("Complex event with zero extra param count. eventName", strZzc);
            } else {
                this.zzd.zzr().zzi().zza("Complex event with zero extra param count. eventName", strZzc);
            }
        }
        return (com.google.android.gms.internal.measurement.zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzcVar.zzbm().zza(strZzc).zzc().zza(listZza).zzu());
    }

    /* synthetic */ zzs(com.google.android.gms.measurement.internal.zzn zznVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this(zznVar);
    }
}
