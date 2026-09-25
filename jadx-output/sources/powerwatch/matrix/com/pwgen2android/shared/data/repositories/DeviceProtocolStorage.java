package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: SleepTimeRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getDeviceProtocolVersion", "", "deviceID", "", "saveDeviceProtocolVersion", "", "protocolVersion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceProtocolStorage {
    private final java.lang.ref.WeakReference<android.content.Context> appContextWeakReference;

    public DeviceProtocolStorage(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContextWeakReference = new java.lang.ref.WeakReference<>(appContext);
    }

    public final void saveDeviceProtocolVersion(java.lang.String deviceID, int protocolVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        android.content.Context context = this.appContextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(kotlin.jvm.internal.Intrinsics.stringPlus(deviceID, "_protocol_version"), protocolVersion).commit();
    }

    public final int getDeviceProtocolVersion(java.lang.String deviceID) {
        android.content.Context context = this.appContextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
        if (deviceID == null) {
            deviceID = "";
        }
        return defaultSharedPreferences.getInt(kotlin.jvm.internal.Intrinsics.stringPlus(deviceID, "_protocol_version"), 1);
    }
}
