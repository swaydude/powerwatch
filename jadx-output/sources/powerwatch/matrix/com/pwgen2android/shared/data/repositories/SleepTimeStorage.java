package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: SleepTimeRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getSleepTime", "", "saveSleepTime", "", "time", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepTimeStorage {
    private final java.lang.ref.WeakReference<android.content.Context> appContextWeakReference;

    public SleepTimeStorage(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        java.lang.ref.WeakReference<android.content.Context> weakReference = new java.lang.ref.WeakReference<>(appContext);
        this.appContextWeakReference = weakReference;
        android.content.Context context = weakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        int i = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt("_sleep_time", -1);
        if (i != -1) {
            saveSleepTime(24 - i);
        }
    }

    public final int getSleepTime() {
        android.content.Context context = this.appContextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt("sleep_time_setting", 21);
    }

    public final void saveSleepTime(int time) {
        android.content.Context context = this.appContextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("sleep_time_setting", time).commit();
    }
}
