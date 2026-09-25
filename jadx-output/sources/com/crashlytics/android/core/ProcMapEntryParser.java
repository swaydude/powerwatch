package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
final class ProcMapEntryParser {
    private static final java.util.regex.Pattern MAP_REGEX = java.util.regex.Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    private ProcMapEntryParser() {
    }

    public static com.crashlytics.android.core.ProcMapEntry parse(java.lang.String str) {
        java.util.regex.Matcher matcher = MAP_REGEX.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long jLongValue = java.lang.Long.valueOf(matcher.group(1), 16).longValue();
            return new com.crashlytics.android.core.ProcMapEntry(jLongValue, java.lang.Long.valueOf(matcher.group(2), 16).longValue() - jLongValue, matcher.group(3), matcher.group(4));
        } catch (java.lang.Exception unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Could not parse map entry: " + str);
            return null;
        }
    }
}
