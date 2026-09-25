package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz {
    public static com.google.android.gms.internal.vision.zzcn<com.google.android.gms.internal.vision.zzba> zzf(android.content.Context context) {
        java.lang.String str = android.os.Build.TYPE;
        java.lang.String str2 = android.os.Build.TAGS;
        java.lang.String str3 = android.os.Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return com.google.android.gms.internal.vision.zzcn.zzbx();
        }
        if (com.google.android.gms.internal.vision.zzan.zzs() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        com.google.android.gms.internal.vision.zzcn<java.io.File> zzcnVarZzg = zzg(context);
        return zzcnVarZzg.isPresent() ? com.google.android.gms.internal.vision.zzcn.zzb(zza(zzcnVarZzg.get())) : com.google.android.gms.internal.vision.zzcn.zzbx();
    }

    private static com.google.android.gms.internal.vision.zzcn<java.io.File> zzg(android.content.Context context) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            android.os.StrictMode.allowThreadDiskWrites();
            try {
                java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                com.google.android.gms.internal.vision.zzcn<java.io.File> zzcnVarZzb = file.exists() ? com.google.android.gms.internal.vision.zzcn.zzb(file) : com.google.android.gms.internal.vision.zzcn.zzbx();
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return zzcnVarZzb;
            } catch (java.lang.RuntimeException e) {
                android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                com.google.android.gms.internal.vision.zzcn<java.io.File> zzcnVarZzbx = com.google.android.gms.internal.vision.zzcn.zzbx();
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return zzcnVarZzbx;
            }
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static com.google.android.gms.internal.vision.zzba zza(java.io.File file) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
            try {
                java.util.HashMap map = new java.util.HashMap();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line != null) {
                        java.lang.String[] strArrSplit = line.split(" ", 3);
                        if (strArrSplit.length != 3) {
                            java.lang.String strValueOf = java.lang.String.valueOf(line);
                            android.util.Log.e("HermeticFileOverrides", strValueOf.length() != 0 ? "Invalid: ".concat(strValueOf) : new java.lang.String("Invalid: "));
                        } else {
                            java.lang.String str = strArrSplit[0];
                            java.lang.String strDecode = android.net.Uri.decode(strArrSplit[1]);
                            java.lang.String strDecode2 = android.net.Uri.decode(strArrSplit[2]);
                            if (!map.containsKey(str)) {
                                map.put(str, new java.util.HashMap());
                            }
                            ((java.util.Map) map.get(str)).put(strDecode, strDecode2);
                        }
                    } else {
                        java.lang.String strValueOf2 = java.lang.String.valueOf(file);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 7);
                        sb.append("Parsed ");
                        sb.append(strValueOf2);
                        android.util.Log.i("HermeticFileOverrides", sb.toString());
                        com.google.android.gms.internal.vision.zzba zzbaVar = new com.google.android.gms.internal.vision.zzba(map);
                        bufferedReader.close();
                        return zzbaVar;
                    }
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.vision.zzds.zza(th, th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
