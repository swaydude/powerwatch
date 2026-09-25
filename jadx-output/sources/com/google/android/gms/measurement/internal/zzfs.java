package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfs implements java.lang.Runnable {
    private final java.net.URL zza;
    private final byte[] zzb;
    private final com.google.android.gms.measurement.internal.zzfq zzc;
    private final java.lang.String zzd;
    private final java.util.Map<java.lang.String, java.lang.String> zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfo zzf;

    public zzfs(com.google.android.gms.measurement.internal.zzfo zzfoVar, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, com.google.android.gms.measurement.internal.zzfq zzfqVar) {
        this.zzf = zzfoVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfqVar);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzfqVar;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.measurement.internal.zzfp.<init>(java.lang.String, com.google.android.gms.measurement.internal.zzfq, int, java.lang.Throwable, byte[], java.util.Map, com.google.android.gms.measurement.internal.zzfn):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfs.run():void");
    }
}
