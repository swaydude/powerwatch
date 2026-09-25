package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class ClearcutLogger {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.clearcut.zzj, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.clearcut.zzj> CLIENT_KEY;
    private static final com.google.android.gms.phenotype.ExperimentTokens[] zze;
    private static final java.lang.String[] zzf;
    private static final byte[][] zzg;
    private final java.lang.String packageName;
    private final android.content.Context zzh;
    private final int zzi;
    private java.lang.String zzj;
    private int zzk;
    private java.lang.String zzl;
    private java.lang.String zzm;
    private final boolean zzn;
    private com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzo;
    private final com.google.android.gms.clearcut.zzb zzp;
    private final com.google.android.gms.common.util.Clock zzq;
    private com.google.android.gms.clearcut.ClearcutLogger.zzc zzr;
    private final com.google.android.gms.clearcut.ClearcutLogger.zza zzs;

    public class LogEventBuilder {
        private final com.google.android.gms.internal.clearcut.zzha zzaa;
        private boolean zzab;
        private java.lang.String zzj;
        private int zzk;
        private java.lang.String zzl;
        private java.lang.String zzm;
        private com.google.android.gms.internal.clearcut.zzge.zzv.zzb zzo;
        private final com.google.android.gms.clearcut.ClearcutLogger.zzb zzt;
        private java.util.ArrayList<java.lang.Integer> zzu;
        private java.util.ArrayList<java.lang.String> zzv;
        private java.util.ArrayList<java.lang.Integer> zzw;
        private java.util.ArrayList<com.google.android.gms.phenotype.ExperimentTokens> zzx;
        private java.util.ArrayList<byte[]> zzy;
        private boolean zzz;

        private LogEventBuilder(com.google.android.gms.clearcut.ClearcutLogger clearcutLogger, byte[] bArr) {
            this(bArr, (com.google.android.gms.clearcut.ClearcutLogger.zzb) null);
        }

        private LogEventBuilder(byte[] bArr, com.google.android.gms.clearcut.ClearcutLogger.zzb zzbVar) {
            this.zzk = com.google.android.gms.clearcut.ClearcutLogger.this.zzk;
            this.zzj = com.google.android.gms.clearcut.ClearcutLogger.this.zzj;
            this.zzl = com.google.android.gms.clearcut.ClearcutLogger.this.zzl;
            this.zzm = null;
            this.zzo = com.google.android.gms.clearcut.ClearcutLogger.this.zzo;
            this.zzu = null;
            this.zzv = null;
            this.zzw = null;
            this.zzx = null;
            this.zzy = null;
            this.zzz = true;
            com.google.android.gms.internal.clearcut.zzha zzhaVar = new com.google.android.gms.internal.clearcut.zzha();
            this.zzaa = zzhaVar;
            this.zzab = false;
            this.zzl = com.google.android.gms.clearcut.ClearcutLogger.this.zzl;
            this.zzm = null;
            zzhaVar.zzbkc = com.google.android.gms.internal.clearcut.zzaa.zze(com.google.android.gms.clearcut.ClearcutLogger.this.zzh);
            zzhaVar.zzbjf = com.google.android.gms.clearcut.ClearcutLogger.this.zzq.currentTimeMillis();
            zzhaVar.zzbjg = com.google.android.gms.clearcut.ClearcutLogger.this.zzq.elapsedRealtime();
            com.google.android.gms.clearcut.ClearcutLogger.zzc unused = com.google.android.gms.clearcut.ClearcutLogger.this.zzr;
            zzhaVar.zzbju = java.util.TimeZone.getDefault().getOffset(zzhaVar.zzbjf) / 1000;
            if (bArr != null) {
                zzhaVar.zzbjp = bArr;
            }
            this.zzt = null;
        }

        /* synthetic */ LogEventBuilder(com.google.android.gms.clearcut.ClearcutLogger clearcutLogger, byte[] bArr, com.google.android.gms.clearcut.zza zzaVar) {
            this(clearcutLogger, bArr);
        }

        public void log() {
            if (this.zzab) {
                throw new java.lang.IllegalStateException("do not reuse LogEventBuilder");
            }
            this.zzab = true;
            com.google.android.gms.clearcut.zze zzeVar = new com.google.android.gms.clearcut.zze(new com.google.android.gms.internal.clearcut.zzr(com.google.android.gms.clearcut.ClearcutLogger.this.packageName, com.google.android.gms.clearcut.ClearcutLogger.this.zzi, this.zzk, this.zzj, this.zzl, this.zzm, com.google.android.gms.clearcut.ClearcutLogger.this.zzn, this.zzo), this.zzaa, null, null, com.google.android.gms.clearcut.ClearcutLogger.zzb((java.util.ArrayList) null), null, com.google.android.gms.clearcut.ClearcutLogger.zzb((java.util.ArrayList) null), null, null, this.zzz);
            if (com.google.android.gms.clearcut.ClearcutLogger.this.zzs.zza(zzeVar)) {
                com.google.android.gms.clearcut.ClearcutLogger.this.zzp.zzb(zzeVar);
            } else {
                com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, (com.google.android.gms.common.api.GoogleApiClient) null);
            }
        }

        public com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder setEventCode(int i) {
            this.zzaa.zzbji = i;
            return this;
        }
    }

    public interface zza {
        boolean zza(com.google.android.gms.clearcut.zze zzeVar);
    }

    public interface zzb {
        byte[] zza();
    }

    public static class zzc {
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.clearcut.zzj> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.clearcut.zza zzaVar = new com.google.android.gms.clearcut.zza();
        CLIENT_BUILDER = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("ClearcutLogger.API", zzaVar, clientKey);
        zze = new com.google.android.gms.phenotype.ExperimentTokens[0];
        zzf = new java.lang.String[0];
        zzg = new byte[0][];
    }

    private ClearcutLogger(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.google.android.gms.clearcut.zzb zzbVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.clearcut.ClearcutLogger.zzc zzcVar, com.google.android.gms.clearcut.ClearcutLogger.zza zzaVar) {
        this.zzk = -1;
        this.zzo = com.google.android.gms.internal.clearcut.zzge.zzv.zzb.DEFAULT;
        this.zzh = context;
        this.packageName = context.getPackageName();
        this.zzi = zza(context);
        this.zzk = -1;
        this.zzj = str;
        this.zzl = str2;
        this.zzm = null;
        this.zzn = z;
        this.zzp = zzbVar;
        this.zzq = clock;
        this.zzr = new com.google.android.gms.clearcut.ClearcutLogger.zzc();
        this.zzo = com.google.android.gms.internal.clearcut.zzge.zzv.zzb.DEFAULT;
        this.zzs = zzaVar;
        if (z) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str2 == null, "can't be anonymous with an upload account");
        }
    }

    public ClearcutLogger(android.content.Context context, java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
        this(context, -1, str, str2, null, false, com.google.android.gms.internal.clearcut.zze.zzb(context), com.google.android.gms.common.util.DefaultClock.getInstance(), null, new com.google.android.gms.internal.clearcut.zzp(context));
    }

    public static com.google.android.gms.clearcut.ClearcutLogger anonymousLogger(android.content.Context context, java.lang.String str) {
        return new com.google.android.gms.clearcut.ClearcutLogger(context, -1, str, null, null, true, com.google.android.gms.internal.clearcut.zze.zzb(context), com.google.android.gms.common.util.DefaultClock.getInstance(), null, new com.google.android.gms.internal.clearcut.zzp(context));
    }

    private static int zza(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.wtf("ClearcutLogger", "This can't happen.", e);
            return 0;
        }
    }

    private static int[] zza(java.util.ArrayList<java.lang.Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        java.util.ArrayList<java.lang.Integer> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            java.lang.Integer num = arrayList2.get(i);
            i++;
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    static /* synthetic */ int[] zzb(java.util.ArrayList arrayList) {
        return zza((java.util.ArrayList<java.lang.Integer>) null);
    }

    public final com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder newEvent(@javax.annotation.Nullable byte[] bArr) {
        return new com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder(this, bArr, (com.google.android.gms.clearcut.zza) null);
    }
}
