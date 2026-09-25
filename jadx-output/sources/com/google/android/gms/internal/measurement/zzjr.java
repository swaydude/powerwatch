package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjr implements com.google.android.gms.internal.measurement.zzjs {
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zza;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzb;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzc;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzd;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zze;
    private static final com.google.android.gms.internal.measurement.zzcl<java.lang.Boolean> zzf;

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zze() {
        return zzd.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zzf() {
        return zze.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjs
    public final boolean zzg() {
        return zzf.zzc().booleanValue();
    }

    static {
        com.google.android.gms.internal.measurement.zzcr zzcrVar = new com.google.android.gms.internal.measurement.zzcr(com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.gold.enhanced_ecommerce.format_logs", false);
        zzb = zzcrVar.zza("measurement.gold.enhanced_ecommerce.log_nested_complex_events.dev", false);
        zzc = zzcrVar.zza("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false);
        zzd = zzcrVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.client.dev", false);
        zze = zzcrVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.service", false);
        zzf = zzcrVar.zza("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false);
    }
}
