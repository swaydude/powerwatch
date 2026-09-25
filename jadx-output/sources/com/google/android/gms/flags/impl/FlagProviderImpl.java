package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public class FlagProviderImpl extends com.google.android.gms.flags.zzd {
    private boolean zzu = false;
    private android.content.SharedPreferences zzv;

    @Override // com.google.android.gms.flags.zzc
    public void init(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (this.zzu) {
            return;
        }
        try {
            this.zzv = com.google.android.gms.flags.impl.zzj.zza(context.createPackageContext("com.google.android.gms", 0));
            this.zzu = true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new java.lang.String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }

    @Override // com.google.android.gms.flags.zzc
    public boolean getBooleanFlagValue(java.lang.String str, boolean z, int i) {
        return !this.zzu ? z : com.google.android.gms.flags.impl.zzb.zza(this.zzv, str, java.lang.Boolean.valueOf(z)).booleanValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public int getIntFlagValue(java.lang.String str, int i, int i2) {
        return !this.zzu ? i : com.google.android.gms.flags.impl.zzd.zza(this.zzv, str, java.lang.Integer.valueOf(i)).intValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public long getLongFlagValue(java.lang.String str, long j, int i) {
        return !this.zzu ? j : com.google.android.gms.flags.impl.zzf.zza(this.zzv, str, java.lang.Long.valueOf(j)).longValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public java.lang.String getStringFlagValue(java.lang.String str, java.lang.String str2, int i) {
        return !this.zzu ? str2 : com.google.android.gms.flags.impl.zzh.zza(this.zzv, str, str2);
    }
}
