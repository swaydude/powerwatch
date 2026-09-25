package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class CommonUtils {
    static final int BYTES_IN_A_GIGABYTE = 1073741824;
    static final int BYTES_IN_A_KILOBYTE = 1024;
    static final int BYTES_IN_A_MEGABYTE = 1048576;
    private static final java.lang.String CLS_SHARED_PREFERENCES_NAME = "com.crashlytics.prefs";
    static final boolean CLS_TRACE_DEFAULT = false;
    static final java.lang.String CLS_TRACE_PREFERENCE_NAME = "com.crashlytics.Trace";
    static final java.lang.String CRASHLYTICS_BUILD_ID = "com.crashlytics.android.build_id";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    static final java.lang.String FABRIC_BUILD_ID = "io.fabric.android.build_id";
    public static final java.lang.String GOOGLE_SDK = "google_sdk";
    private static final java.lang.String LOG_PRIORITY_NAME_ASSERT = "A";
    private static final java.lang.String LOG_PRIORITY_NAME_DEBUG = "D";
    private static final java.lang.String LOG_PRIORITY_NAME_ERROR = "E";
    private static final java.lang.String LOG_PRIORITY_NAME_INFO = "I";
    private static final java.lang.String LOG_PRIORITY_NAME_UNKNOWN = "?";
    private static final java.lang.String LOG_PRIORITY_NAME_VERBOSE = "V";
    private static final java.lang.String LOG_PRIORITY_NAME_WARN = "W";
    public static final java.lang.String SDK = "sdk";
    public static final java.lang.String SHA1_INSTANCE = "SHA-1";
    public static final java.lang.String SHA256_INSTANCE = "SHA-256";
    private static final long UNCALCULATED_TOTAL_RAM = -1;
    static final java.lang.String UNITY_EDITOR_VERSION = "com.google.firebase.crashlytics.unity_version";
    private static java.lang.Boolean clsTrace;
    private static final char[] HEX_VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long totalRamInBytes = -1;
    public static final java.util.Comparator<java.io.File> FILE_MODIFIED_COMPARATOR = new java.util.Comparator<java.io.File>() { // from class: io.fabric.sdk.android.services.common.CommonUtils.1
        @Override // java.util.Comparator
        public int compare(java.io.File file, java.io.File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    };

    @java.lang.Deprecated
    public static boolean isLoggingEnabled(android.content.Context context) {
        return false;
    }

    public static java.lang.String logPriorityToString(int i) {
        switch (i) {
            case 2:
                return LOG_PRIORITY_NAME_VERBOSE;
            case 3:
                return LOG_PRIORITY_NAME_DEBUG;
            case 4:
                return LOG_PRIORITY_NAME_INFO;
            case 5:
                return LOG_PRIORITY_NAME_WARN;
            case 6:
                return LOG_PRIORITY_NAME_ERROR;
            case 7:
                return LOG_PRIORITY_NAME_ASSERT;
            default:
                return LOG_PRIORITY_NAME_UNKNOWN;
        }
    }

    public static android.content.SharedPreferences getSharedPrefs(android.content.Context context) {
        return context.getSharedPreferences(CLS_SHARED_PREFERENCES_NAME, 0);
    }

    public static java.lang.String extractFieldFromSystemFile(java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        java.lang.String str2 = null;
        str2 = null;
        str2 = null;
        java.io.BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file), 1024);
                while (true) {
                    try {
                        try {
                            java.lang.String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            java.lang.String[] strArrSplit = java.util.regex.Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals(str)) {
                                str2 = strArrSplit[1];
                                break;
                            }
                        } catch (java.lang.Exception e) {
                            e = e;
                            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Error parsing " + file, e);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        closeOrLog(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeOrLog(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            closeOrLog(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    public static int getCpuArchitectureInt() {
        return io.fabric.sdk.android.services.common.CommonUtils.Architecture.getValue().ordinal();
    }

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final java.util.Map<java.lang.String, io.fabric.sdk.android.services.common.CommonUtils.Architecture> matcher;

        static {
            io.fabric.sdk.android.services.common.CommonUtils.Architecture architecture = X86_32;
            io.fabric.sdk.android.services.common.CommonUtils.Architecture architecture2 = ARMV6;
            io.fabric.sdk.android.services.common.CommonUtils.Architecture architecture3 = ARMV7;
            io.fabric.sdk.android.services.common.CommonUtils.Architecture architecture4 = ARM64;
            java.util.HashMap map = new java.util.HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", architecture3);
            map.put("armeabi", architecture2);
            map.put("arm64-v8a", architecture4);
            map.put("x86", architecture);
        }

        static io.fabric.sdk.android.services.common.CommonUtils.Architecture getValue() {
            java.lang.String str = android.os.Build.CPU_ABI;
            if (android.text.TextUtils.isEmpty(str)) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            io.fabric.sdk.android.services.common.CommonUtils.Architecture architecture = matcher.get(str.toLowerCase(java.util.Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static synchronized long getTotalRamInBytes() {
        if (totalRamInBytes == -1) {
            long jConvertMemInfoToBytes = 0;
            java.lang.String strExtractFieldFromSystemFile = extractFieldFromSystemFile(new java.io.File("/proc/meminfo"), "MemTotal");
            if (!android.text.TextUtils.isEmpty(strExtractFieldFromSystemFile)) {
                java.lang.String upperCase = strExtractFieldFromSystemFile.toUpperCase(java.util.Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jConvertMemInfoToBytes = convertMemInfoToBytes(upperCase, "KB", 1024);
                    } else if (upperCase.endsWith("MB")) {
                        jConvertMemInfoToBytes = convertMemInfoToBytes(upperCase, "MB", 1048576);
                    } else if (upperCase.endsWith("GB")) {
                        jConvertMemInfoToBytes = convertMemInfoToBytes(upperCase, "GB", 1073741824);
                    } else {
                        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unexpected meminfo format while computing RAM: " + upperCase);
                    }
                } catch (java.lang.NumberFormatException e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Unexpected meminfo format while computing RAM: " + upperCase, e);
                }
            }
            totalRamInBytes = jConvertMemInfoToBytes;
        }
        return totalRamInBytes;
    }

    static long convertMemInfoToBytes(java.lang.String str, java.lang.String str2, int i) {
        return java.lang.Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static android.app.ActivityManager.RunningAppProcessInfo getAppProcessInfo(java.lang.String str, android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static java.lang.String streamToString(java.io.InputStream inputStream) throws java.io.IOException {
        java.util.Scanner scannerUseDelimiter = new java.util.Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static java.lang.String sha1(java.lang.String str) {
        return hash(str, SHA1_INSTANCE);
    }

    public static java.lang.String sha256(java.lang.String str) {
        return hash(str, SHA256_INSTANCE);
    }

    public static java.lang.String sha1(java.io.InputStream inputStream) {
        return hash(inputStream, SHA1_INSTANCE);
    }

    private static java.lang.String hash(java.lang.String str, java.lang.String str2) {
        return hash(str.getBytes(), str2);
    }

    private static java.lang.String hash(java.io.InputStream inputStream, java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    return hexify(messageDigest.digest());
                }
            }
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    private static java.lang.String hash(byte[] bArr, java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    public static java.lang.String createInstanceIdFrom(java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(java.util.Locale.US));
            }
        }
        java.util.Collections.sort(arrayList);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
        }
        java.lang.String string = sb.toString();
        if (string.length() > 0) {
            return sha1(string);
        }
        return null;
    }

    public static long calculateFreeRamInBytes(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(java.lang.String str) {
        android.os.StatFs statFs = new android.os.StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static java.lang.Float getBatteryLevel(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return null;
        }
        return java.lang.Float.valueOf(intentRegisterReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1));
    }

    public static boolean getProximitySensorEnabled(android.content.Context context) {
        return (isEmulator(context) || ((android.hardware.SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static void logControlled(android.content.Context context, java.lang.String str) {
        if (isClsTrace(context)) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, str);
        }
    }

    public static void logControlledError(android.content.Context context, java.lang.String str, java.lang.Throwable th) {
        if (isClsTrace(context)) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, str);
        }
    }

    public static void logControlled(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        if (isClsTrace(context)) {
            io.fabric.sdk.android.Fabric.getLogger().log(i, io.fabric.sdk.android.Fabric.TAG, str2);
        }
    }

    public static boolean isClsTrace(android.content.Context context) {
        if (clsTrace == null) {
            clsTrace = java.lang.Boolean.valueOf(getBooleanResourceValue(context, CLS_TRACE_PREFERENCE_NAME, false));
        }
        return clsTrace.booleanValue();
    }

    public static boolean getBooleanResourceValue(android.content.Context context, java.lang.String str, boolean z) {
        android.content.res.Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, "string");
            if (resourcesIdentifier2 > 0) {
                return java.lang.Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static int getResourcesIdentifier(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static boolean isEmulator(android.content.Context context) {
        return SDK.equals(android.os.Build.PRODUCT) || GOOGLE_SDK.equals(android.os.Build.PRODUCT) || android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean isRooted(android.content.Context context) {
        boolean zIsEmulator = isEmulator(context);
        java.lang.String str = android.os.Build.TAGS;
        if ((zIsEmulator || str == null || !str.contains("test-keys")) && !new java.io.File("/system/app/Superuser.apk").exists()) {
            return !zIsEmulator && new java.io.File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean isDebuggerAttached() {
        return android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger();
    }

    public static int getDeviceState(android.content.Context context) {
        int i = isEmulator(context) ? 1 : 0;
        if (isRooted(context)) {
            i |= 2;
        }
        return isDebuggerAttached() ? i | 4 : i;
    }

    public static int getBatteryVelocity(android.content.Context context, boolean z) {
        java.lang.Float batteryLevel = getBatteryLevel(context);
        if (!z || batteryLevel == null) {
            return 1;
        }
        if (batteryLevel.floatValue() >= 99.0d) {
            return 3;
        }
        return ((double) batteryLevel.floatValue()) < 99.0d ? 2 : 0;
    }

    @java.lang.Deprecated
    public static javax.crypto.Cipher createCipher(int i, java.lang.String str) throws java.security.InvalidKeyException {
        throw new java.security.InvalidKeyException("This method is deprecated");
    }

    public static java.lang.String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & kotlin.UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = HEX_VALUES;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static byte[] dehexify(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean isAppDebuggable(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static java.lang.String getStringsFileValue(android.content.Context context, java.lang.String str) {
        int resourcesIdentifier = getResourcesIdentifier(context, str, "string");
        return resourcesIdentifier > 0 ? context.getString(resourcesIdentifier) : "";
    }

    public static void closeOrLog(java.io.Closeable closeable, java.lang.String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, str, e);
            }
        }
    }

    public static void flushOrLog(java.io.Flushable flushable, java.lang.String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (java.io.IOException e) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, str, e);
            }
        }
    }

    public static boolean isNullOrEmpty(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    public static java.lang.String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return java.lang.String.format(java.util.Locale.US, "%1$10s", java.lang.Integer.valueOf(i)).replace(' ', '0');
        }
        throw new java.lang.IllegalArgumentException("value must be zero or greater");
    }

    public static boolean stringsEqualIncludingNull(java.lang.String str, java.lang.String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static java.lang.String getResourcePackageName(android.content.Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static void copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static java.lang.String getAppIconHashOrNull(android.content.Context context) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(getAppIconResourceId(context));
            try {
                try {
                    java.lang.String strSha1 = sha1(inputStreamOpenRawResource);
                    java.lang.String str = isNullOrEmpty(strSha1) ? null : strSha1;
                    closeOrLog(inputStreamOpenRawResource, "Failed to close icon input stream.");
                    return str;
                } catch (java.lang.Exception e) {
                    e = e;
                    io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Could not calculate hash for app icon:" + e.getMessage());
                    closeOrLog(inputStreamOpenRawResource, "Failed to close icon input stream.");
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeOrLog(inputStreamOpenRawResource, "Failed to close icon input stream.");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            inputStreamOpenRawResource = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
            closeOrLog(inputStreamOpenRawResource, "Failed to close icon input stream.");
            throw th;
        }
    }

    public static int getAppIconResourceId(android.content.Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static java.lang.String resolveBuildId(android.content.Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, FABRIC_BUILD_ID, "string");
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, CRASHLYTICS_BUILD_ID, "string");
        }
        if (resourcesIdentifier == 0) {
            return null;
        }
        java.lang.String string = context.getResources().getString(resourcesIdentifier);
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Build ID is: " + string);
        return string;
    }

    public static java.lang.String resolveUnityEditorVersion(android.content.Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, UNITY_EDITOR_VERSION, "string");
        if (resourcesIdentifier == 0) {
            return null;
        }
        java.lang.String string = context.getResources().getString(resourcesIdentifier);
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unity Editor version is: " + string);
        return string;
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void hideKeyboard(android.content.Context context, android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void openKeyboard(android.content.Context context, android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInputFromInputMethod(view.getWindowToken(), 0);
        }
    }

    public static void finishAffinity(android.content.Context context, int i) {
        if (context instanceof android.app.Activity) {
            finishAffinity((android.app.Activity) context, i);
        }
    }

    public static void finishAffinity(android.app.Activity activity, int i) {
        if (activity == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.setResult(i);
            activity.finish();
        }
    }

    public static boolean canTryConnection(android.content.Context context) {
        if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static void logOrThrowIllegalStateException(java.lang.String str, java.lang.String str2) {
        if (io.fabric.sdk.android.Fabric.isDebuggable()) {
            throw new java.lang.IllegalStateException(str2);
        }
        io.fabric.sdk.android.Fabric.getLogger().w(str, str2);
    }

    public static void logOrThrowIllegalArgumentException(java.lang.String str, java.lang.String str2) {
        if (io.fabric.sdk.android.Fabric.isDebuggable()) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        io.fabric.sdk.android.Fabric.getLogger().w(str, str2);
    }
}
