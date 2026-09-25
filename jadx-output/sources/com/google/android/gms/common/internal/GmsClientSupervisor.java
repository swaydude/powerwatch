package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    private static final java.lang.Object zzdp = new java.lang.Object();
    private static com.google.android.gms.common.internal.GmsClientSupervisor zzdq;

    protected abstract boolean zza(com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    protected abstract void zzb(com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context context) {
        synchronized (zzdp) {
            if (zzdq == null) {
                zzdq = new com.google.android.gms.common.internal.zze(context.getApplicationContext());
            }
        }
        return zzdq;
    }

    protected static final class zza {
        private final android.content.ComponentName mComponentName;
        private final java.lang.String zzdr;
        private final java.lang.String zzds;
        private final int zzdt;

        public zza(java.lang.String str, int i) {
            this.zzdr = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            this.zzds = "com.google.android.gms";
            this.mComponentName = null;
            this.zzdt = 129;
        }

        public zza(java.lang.String str, java.lang.String str2, int i) {
            this.zzdr = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            this.zzds = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            this.mComponentName = null;
            this.zzdt = i;
        }

        public zza(android.content.ComponentName componentName, int i) {
            this.zzdr = null;
            this.zzds = null;
            this.mComponentName = (android.content.ComponentName) com.google.android.gms.common.internal.Preconditions.checkNotNull(componentName);
            this.zzdt = 129;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.zzdr;
            return str == null ? this.mComponentName.flattenToString() : str;
        }

        public final java.lang.String getPackage() {
            return this.zzds;
        }

        public final android.content.ComponentName getComponentName() {
            return this.mComponentName;
        }

        public final int zzq() {
            return this.zzdt;
        }

        public final android.content.Intent zzb(android.content.Context context) {
            if (this.zzdr != null) {
                return new android.content.Intent(this.zzdr).setPackage(this.zzds);
            }
            return new android.content.Intent().setComponent(this.mComponentName);
        }

        public final int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(this.zzdr, this.zzds, this.mComponentName, java.lang.Integer.valueOf(this.zzdt));
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.common.internal.GmsClientSupervisor.zza)) {
                return false;
            }
            com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar = (com.google.android.gms.common.internal.GmsClientSupervisor.zza) obj;
            return com.google.android.gms.common.internal.Objects.equal(this.zzdr, zzaVar.zzdr) && com.google.android.gms.common.internal.Objects.equal(this.zzds, zzaVar.zzds) && com.google.android.gms.common.internal.Objects.equal(this.mComponentName, zzaVar.mComponentName) && this.zzdt == zzaVar.zzdt;
        }
    }

    public boolean bindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        return zza(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(str, 129), serviceConnection, str2);
    }

    public boolean bindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        return zza(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(componentName, 129), serviceConnection, str);
    }

    public void unbindService(java.lang.String str, android.content.ServiceConnection serviceConnection, java.lang.String str2) {
        zzb(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(str, 129), serviceConnection, str2);
    }

    public final void zza(java.lang.String str, java.lang.String str2, int i, android.content.ServiceConnection serviceConnection, java.lang.String str3) {
        zzb(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(str, str2, i), serviceConnection, str3);
    }

    public void unbindService(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        zzb(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(componentName, 129), serviceConnection, str);
    }
}
