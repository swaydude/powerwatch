package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: compiled from: AppConfigPreferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;", "", "()V", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppConfigPreferences {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion(null);
    private static final java.lang.String PROD_ENABLED = "com.matrix.powerwatch2.PRODUCTION_ENABLED";
    private static final java.lang.String WATCH_MOCK_DATA_ENABLED = "com.matrix.powerwatch2.WATCH_MOCK_DATA_ENABLED";
    private static final java.lang.String PERMISSIONS_SHOWN_FLAG = "com.matrix.powerwatch2.PERMISSION_SHOWN_FLAG";
    private static final java.lang.String PULL_DOWN_TO_SYNC_SHOWN = "com.matrix.powerwatch2.PULL_DOWN_TO_SYNC_SHOWN";

    /* JADX INFO: compiled from: AppConfigPreferences.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;", "", "()V", "PERMISSIONS_SHOWN_FLAG", "", "PROD_ENABLED", "PULL_DOWN_TO_SYNC_SHOWN", "WATCH_MOCK_DATA_ENABLED", "getMockDataEnabled", "", "context", "Landroid/content/Context;", "getPermissionsShownFlag", "getProdEnabledFlag", "getPullDownShown", "setMockDataEnabled", "", "mockData", "setPermissionsShownFlag", "shown", "setProdEnabledFlag", "prodEnabled", "setPullDownShown", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getProdEnabledFlag(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PROD_ENABLED, true);
        }

        public final void setProdEnabledFlag(boolean prodEnabled, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PROD_ENABLED, prodEnabled).apply();
        }

        public final void setMockDataEnabled(boolean mockData, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.WATCH_MOCK_DATA_ENABLED, mockData).apply();
        }

        public final boolean getMockDataEnabled(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.WATCH_MOCK_DATA_ENABLED, false);
        }

        public final boolean getPermissionsShownFlag(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PERMISSIONS_SHOWN_FLAG, false);
        }

        public final void setPermissionsShownFlag(android.content.Context context, boolean shown) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PERMISSIONS_SHOWN_FLAG, shown).apply();
        }

        public final boolean getPullDownShown(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PULL_DOWN_TO_SYNC_SHOWN, false);
        }

        public final void setPullDownShown(boolean shown, android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(powerwatch.matrix.com.pwgen2android.AppConfigPreferences.PULL_DOWN_TO_SYNC_SHOWN, true).apply();
        }
    }
}
