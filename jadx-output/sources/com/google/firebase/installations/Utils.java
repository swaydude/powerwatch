package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
class Utils {
    private static final java.lang.String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = java.util.concurrent.TimeUnit.HOURS.toSeconds(1);
    private static final java.util.regex.Pattern API_KEY_FORMAT = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");

    Utils() {
    }

    public boolean isAuthTokenExpired(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        return android.text.TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) || persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    public long currentTimeInSecs() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis());
    }

    static boolean isValidAppIdFormat(java.lang.String str) {
        return str.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    static boolean isValidApiKeyFormat(java.lang.String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }
}
