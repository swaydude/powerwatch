package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
abstract class zze extends com.google.android.gms.common.internal.zzj {
    private int zzt;

    protected zze(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 25);
        this.zzt = java.util.Arrays.hashCode(bArr);
    }

    abstract byte[] getBytes();

    public int hashCode() {
        return this.zzt;
    }

    public boolean equals(java.lang.Object obj) {
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzb;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzi)) {
            try {
                com.google.android.gms.common.internal.zzi zziVar = (com.google.android.gms.common.internal.zzi) obj;
                if (zziVar.zzc() == hashCode() && (iObjectWrapperZzb = zziVar.zzb()) != null) {
                    return java.util.Arrays.equals(getBytes(), (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzb));
                }
                return false;
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(getBytes());
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final int zzc() {
        return hashCode();
    }

    protected static byte[] zza(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
