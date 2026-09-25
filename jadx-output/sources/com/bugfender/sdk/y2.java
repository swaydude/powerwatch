package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class y2 implements com.bugfender.sdk.x2 {
    private static final java.lang.String d = "bg_device_id";
    private final android.content.Context a;
    private final com.bugfender.sdk.z1 b;
    private final android.content.SharedPreferences c;

    public y2(android.content.Context context, com.bugfender.sdk.z1 z1Var, android.content.SharedPreferences sharedPreferences) {
        com.bugfender.sdk.w1.a(context, "Context must be not null");
        this.c = sharedPreferences;
        this.b = z1Var;
        this.a = context;
    }

    private int a(int i) {
        return i / 100;
    }

    private android.content.pm.PackageInfo t() throws java.lang.Exception {
        return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String a() {
        try {
            return java.lang.String.valueOf(t().versionName);
        } catch (java.lang.Exception unused) {
            return com.bugfender.android.BuildConfig.VERSION_NAME;
        }
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String a(java.lang.String str) {
        java.lang.String string;
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (com.bugfender.sdk.v1.c()) {
            android.content.ContentResolver contentResolver = this.a.getContentResolver();
            com.bugfender.sdk.v1.h();
            string = android.provider.Settings.Global.getString(contentResolver, "device_name");
        } else {
            string = android.provider.Settings.System.getString(this.a.getContentResolver(), "device_name");
        }
        return android.text.TextUtils.isEmpty(string) ? android.os.Build.MANUFACTURER : string;
    }

    @Override // com.bugfender.sdk.x2
    public int b() {
        return this.a.getResources().getConfiguration().orientation;
    }

    @Override // com.bugfender.sdk.x2
    public long c() {
        long blockSize;
        long availableBlocks;
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return availableBlocks * blockSize;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // com.bugfender.sdk.x2
    public float d() {
        int iA;
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                iA = a(50);
            } else {
                iA = a(intExtra);
            }
        } else {
            iA = a(50);
        }
        return iA;
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String e() {
        java.lang.String string = this.c.getString(d, null);
        if (string != null) {
            return string;
        }
        java.lang.String string2 = java.util.UUID.randomUUID().toString();
        android.content.SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.putString(d, string2);
        editorEdit.commit();
        return string2;
    }

    @Override // com.bugfender.sdk.x2
    public long f() {
        return this.b.c();
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String g() {
        return "Android";
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String h() {
        try {
            return java.lang.String.valueOf(t().versionCode);
        } catch (java.lang.Exception unused) {
            return java.lang.String.valueOf(com.bugfender.android.BuildConfig.VERSION_CODE);
        }
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String i() {
        return android.os.Build.MODEL;
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String j() {
        java.lang.String string;
        try {
            string = android.provider.Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (java.lang.Exception unused) {
            string = null;
        }
        return string != null ? string : "";
    }

    @Override // com.bugfender.sdk.x2
    public boolean k() {
        return "true".equals(android.provider.Settings.System.getString(this.a.getContentResolver(), "firebase.test.lab"));
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String l() {
        try {
            return java.util.TimeZone.getDefault().getDisplayName(false, 0);
        } catch (java.lang.Throwable unused) {
            return "GMT+00:00";
        }
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String m() {
        return java.util.Locale.getDefault().getLanguage();
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String n() {
        return this.a.getPackageName();
    }

    @Override // com.bugfender.sdk.x2
    public long o() {
        return this.b.a();
    }

    @Override // com.bugfender.sdk.x2
    public long p() {
        long blockSize;
        long blockCount;
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount();
        }
        return blockCount * blockSize;
    }

    @Override // com.bugfender.sdk.x2
    public java.lang.String q() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.bugfender.sdk.x2
    @java.lang.Deprecated
    public java.lang.String r() {
        try {
            android.content.pm.PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            return packageInfo.versionName + "." + packageInfo.versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.bugfender.android.BuildConfig.VERSION_NAME;
        }
    }

    @Override // com.bugfender.sdk.x2
    public long s() {
        return this.b.b();
    }
}
