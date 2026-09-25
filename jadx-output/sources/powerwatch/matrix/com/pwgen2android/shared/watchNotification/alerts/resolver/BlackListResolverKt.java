package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: BlackListResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"pwPackage", "", "appNameLookup", "context", "Landroid/content/Context;", "packageName", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BlackListResolverKt {
    public static final java.lang.String pwPackage = "powerwatch.matrix.com.pwgen2android";

    public static final java.lang.String appNameLookup(android.content.Context context, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(packageName, 0)");
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("AppsHelper", kotlin.jvm.internal.Intrinsics.stringPlus("Could not resolve name ", packageName), e);
            return (java.lang.String) null;
        }
    }
}
