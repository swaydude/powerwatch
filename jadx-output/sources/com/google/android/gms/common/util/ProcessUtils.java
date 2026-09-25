package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {
    private static java.lang.String zzhf;
    private static int zzhg;

    private ProcessUtils() {
    }

    @javax.annotation.Nullable
    public static java.lang.String getMyProcessName() {
        if (zzhf == null) {
            if (zzhg == 0) {
                zzhg = android.os.Process.myPid();
            }
            zzhf = zzd(zzhg);
        }
        return zzhf;
    }

    @javax.annotation.Nullable
    private static java.lang.String zzd(int i) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.BufferedReader bufferedReaderZzk;
        java.lang.String strTrim = null;
        if (i <= 0) {
            return null;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReaderZzk = zzk(sb.toString());
            try {
                strTrim = bufferedReaderZzk.readLine().trim();
                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReaderZzk);
            } catch (java.io.IOException unused) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReaderZzk);
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReaderZzk);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            bufferedReaderZzk = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            bufferedReaderZzk = null;
        }
        return strTrim;
    }

    private static java.io.BufferedReader zzk(java.lang.String str) throws java.io.IOException {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return new java.io.BufferedReader(new java.io.FileReader(str));
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
