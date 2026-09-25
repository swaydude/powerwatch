package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class z1 {
    private com.bugfender.sdk.z1.a a;

    public interface a {
        long a();

        long b();

        long c();
    }

    public static abstract class b implements com.bugfender.sdk.z1.a {
        protected final android.app.ActivityManager a;
        protected long b;
        protected long c;
        protected android.content.Context d;

        public b(android.content.Context context) {
            this.a = (android.app.ActivityManager) context.getSystemService("activity");
            this.d = context;
        }

        @Override // com.bugfender.sdk.z1.a
        public long a() {
            return this.c;
        }

        @Override // com.bugfender.sdk.z1.a
        public long c() {
            return this.b;
        }

        protected java.lang.Double d() {
            new java.text.DecimalFormat("#.##");
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile("/proc/meminfo", "r");
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
                java.lang.String strGroup = "";
                while (matcher.find()) {
                    strGroup = matcher.group(1);
                }
                randomAccessFile.close();
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(strGroup));
            } catch (java.lang.Exception unused) {
                return java.lang.Double.valueOf(-1.0d);
            }
        }
    }

    public static class c extends com.bugfender.sdk.z1.b {
        public c(android.content.Context context) {
            super(context);
            android.app.ActivityManager activityManager = (android.app.ActivityManager) this.d.getSystemService("activity");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.c = memoryInfo.availMem;
            this.b = memoryInfo.totalMem;
        }

        @Override // com.bugfender.sdk.z1.a
        public long b() {
            return this.b;
        }

        @Override // com.bugfender.sdk.z1.b, com.bugfender.sdk.z1.a
        public long c() {
            return this.b - this.c;
        }
    }

    public static class d extends com.bugfender.sdk.z1.b {
        public d(android.content.Context context) {
            super(context);
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.a.getRunningAppProcesses();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses == null ? java.util.Collections.emptyList() : runningAppProcesses) {
                if (runningAppProcessInfo.uid > 1000) {
                    this.b += (long) this.a.getProcessMemoryInfo(new int[]{runningAppProcessInfo.pid})[0].getTotalPss();
                }
            }
        }

        @Override // com.bugfender.sdk.z1.a
        public long b() {
            return java.lang.Math.round(d().doubleValue());
        }

        @Override // com.bugfender.sdk.z1.b, com.bugfender.sdk.z1.a
        public long c() {
            return this.b;
        }
    }

    public z1(android.content.Context context) {
        this.a = android.os.Build.VERSION.SDK_INT >= 21 ? new com.bugfender.sdk.z1.c(context) : new com.bugfender.sdk.z1.d(context);
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    public long c() {
        return this.a.c();
    }
}
