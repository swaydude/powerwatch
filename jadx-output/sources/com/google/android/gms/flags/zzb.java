package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    private boolean zzj = false;
    private com.google.android.gms.flags.zzc zzk = null;

    public final void initialize(android.content.Context context) {
        synchronized (this) {
            if (this.zzj) {
                return;
            }
            try {
                com.google.android.gms.flags.zzc zzcVarAsInterface = com.google.android.gms.flags.zzd.asInterface(com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.zzk = zzcVarAsInterface;
                zzcVarAsInterface.init(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
                this.zzj = true;
            } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                android.util.Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }

    public final <T> T zzb(com.google.android.gms.flags.Flag<T> flag) {
        synchronized (this) {
            if (!this.zzj) {
                return flag.zzb();
            }
            return flag.zza(this.zzk);
        }
    }
}
