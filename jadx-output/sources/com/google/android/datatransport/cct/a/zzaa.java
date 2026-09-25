package com.google.android.datatransport.cct.a;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaa {
    public static final com.google.android.datatransport.cct.a.zzaa zza;
    public static final com.google.android.datatransport.cct.a.zzaa zzb;
    public static final com.google.android.datatransport.cct.a.zzaa zzc;
    public static final com.google.android.datatransport.cct.a.zzaa zzd;
    public static final com.google.android.datatransport.cct.a.zzaa zze;
    public static final com.google.android.datatransport.cct.a.zzaa zzf;
    private static final android.util.SparseArray<com.google.android.datatransport.cct.a.zzaa> zzg;

    static {
        com.google.android.datatransport.cct.a.zzaa zzaaVar = new com.google.android.datatransport.cct.a.zzaa("DEFAULT", 0, 0);
        zza = zzaaVar;
        com.google.android.datatransport.cct.a.zzaa zzaaVar2 = new com.google.android.datatransport.cct.a.zzaa("UNMETERED_ONLY", 1, 1);
        zzb = zzaaVar2;
        com.google.android.datatransport.cct.a.zzaa zzaaVar3 = new com.google.android.datatransport.cct.a.zzaa("UNMETERED_OR_DAILY", 2, 2);
        zzc = zzaaVar3;
        com.google.android.datatransport.cct.a.zzaa zzaaVar4 = new com.google.android.datatransport.cct.a.zzaa("FAST_IF_RADIO_AWAKE", 3, 3);
        zzd = zzaaVar4;
        com.google.android.datatransport.cct.a.zzaa zzaaVar5 = new com.google.android.datatransport.cct.a.zzaa("NEVER", 4, 4);
        zze = zzaaVar5;
        com.google.android.datatransport.cct.a.zzaa zzaaVar6 = new com.google.android.datatransport.cct.a.zzaa("UNRECOGNIZED", 5, -1);
        zzf = zzaaVar6;
        android.util.SparseArray<com.google.android.datatransport.cct.a.zzaa> sparseArray = new android.util.SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, zzaaVar);
        sparseArray.put(1, zzaaVar2);
        sparseArray.put(2, zzaaVar3);
        sparseArray.put(3, zzaaVar4);
        sparseArray.put(4, zzaaVar5);
        sparseArray.put(-1, zzaaVar6);
    }

    private zzaa(java.lang.String str, int i, int i2) {
        super(str, i);
    }
}
