package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SplitInstallSessionState {
    public static com.google.android.play.core.splitinstall.SplitInstallSessionState a(android.os.Bundle bundle) {
        return new com.google.android.play.core.splitinstall.b(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(com.baidu.mapapi.SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (android.app.PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public static com.google.android.play.core.splitinstall.SplitInstallSessionState create(int i, int i2, int i3, long j, long j2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (i2 != 8) {
            return new com.google.android.play.core.splitinstall.b(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new java.lang.IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    abstract java.util.List<java.lang.String> a();

    abstract java.util.List<java.lang.String> b();

    public abstract long bytesDownloaded();

    abstract java.util.List<android.content.Intent> c();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int iStatus = status();
        return iStatus == 0 || iStatus == 5 || iStatus == 6 || iStatus == 7;
    }

    public java.util.List<java.lang.String> languages() {
        return b() != null ? new java.util.ArrayList(b()) : new java.util.ArrayList();
    }

    public java.util.List<java.lang.String> moduleNames() {
        return a() != null ? new java.util.ArrayList(a()) : new java.util.ArrayList();
    }

    @java.lang.Deprecated
    public abstract android.app.PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();
}
