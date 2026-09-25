package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzip implements java.lang.Runnable {
    private final java.net.URL zza;
    private final byte[] zzb;
    private final com.google.android.gms.measurement.internal.zziq zzc;
    private final java.lang.String zzd;
    private final java.util.Map<java.lang.String, java.lang.String> zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzin zzf;

    public zzip(com.google.android.gms.measurement.internal.zzin zzinVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, com.google.android.gms.measurement.internal.zziq zziqVar) {
        this.zzf = zzinVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zziqVar);
        this.zza = url;
        this.zzb = null;
        this.zzc = zziqVar;
        this.zzd = str;
        this.zze = null;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnectionZza;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2;
        this.zzf.zzc();
        int responseCode = 0;
        try {
            httpURLConnectionZza = this.zzf.zza(this.zza);
            try {
                java.util.Map<java.lang.String, java.lang.String> map3 = this.zze;
                if (map3 != null) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map3.entrySet()) {
                        httpURLConnectionZza.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                responseCode = httpURLConnectionZza.getResponseCode();
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnectionZza.getHeaderFields();
                try {
                    com.google.android.gms.measurement.internal.zzin zzinVar = this.zzf;
                    byte[] bArrZza = com.google.android.gms.measurement.internal.zzin.zza(httpURLConnectionZza);
                    if (httpURLConnectionZza != null) {
                        httpURLConnectionZza.disconnect();
                    }
                    zzb(responseCode, null, bArrZza, headerFields);
                } catch (java.io.IOException e) {
                    map2 = headerFields;
                    e = e;
                    if (httpURLConnectionZza != null) {
                        httpURLConnectionZza.disconnect();
                    }
                    zzb(responseCode, e, null, map2);
                } catch (java.lang.Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnectionZza != null) {
                        httpURLConnectionZza.disconnect();
                    }
                    zzb(responseCode, null, null, map);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                map2 = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            httpURLConnectionZza = null;
            map2 = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpURLConnectionZza = null;
            map = null;
        }
    }

    private final void zzb(final int i, final java.lang.Exception exc, final byte[] bArr, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.zzf.zzq().zza(new java.lang.Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.zzis
            private final com.google.android.gms.measurement.internal.zzip zza;
            private final int zzb;
            private final java.lang.Exception zzc;
            private final byte[] zzd;
            private final java.util.Map zze;

            {
                this.zza = this;
                this.zzb = i;
                this.zzc = exc;
                this.zzd = bArr;
                this.zze = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    final /* synthetic */ void zza(int i, java.lang.Exception exc, byte[] bArr, java.util.Map map) {
        this.zzc.zza(this.zzd, i, exc, bArr, map);
    }
}
