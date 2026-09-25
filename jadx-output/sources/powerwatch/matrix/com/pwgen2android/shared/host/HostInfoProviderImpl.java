package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: HostInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "context", "Landroid/content/Context;", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V", "googleFitPermission", "Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;", "notificationServicePermission", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;", "phoneUUID", "", "stravaPermission", "Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;", "hostInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "fillAdditionalInfo", "", "loadAppPermissions", "", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HostInfoProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.host.GoogleFitPermission googleFitPermission;
    private final powerwatch.matrix.com.pwgen2android.shared.host.NotificationServicePermission notificationServicePermission;
    private final java.lang.String phoneUUID;
    private final powerwatch.matrix.com.pwgen2android.shared.host.StravaPermission stravaPermission;

    public HostInfoProviderImpl(android.content.Context context, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        this.googleFitPermission = new powerwatch.matrix.com.pwgen2android.shared.host.GoogleFitPermission(googleFitController);
        this.stravaPermission = new powerwatch.matrix.com.pwgen2android.shared.host.StravaPermission(stravaController);
        this.notificationServicePermission = new powerwatch.matrix.com.pwgen2android.shared.host.NotificationServicePermission(context);
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(context.contentResolver, Settings.Secure.ANDROID_ID)");
        byte[] bytes = string.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        java.lang.String string2 = java.util.UUID.nameUUIDFromBytes(bytes).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "nameUUIDFromBytes((Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID))\n            .toByteArray())\n            .toString()");
        java.lang.String upperCase = string2.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        this.phoneUUID = upperCase;
    }

    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.host.AppPermission> loadAppPermissions() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission[]{this.googleFitPermission.getCurrentPermissionState(), this.stravaPermission.getCurrentPermissionState(), this.notificationServicePermission.getCurrentPermissionState()});
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider
    public powerwatch.matrix.com.pwgen2android.shared.host.Host hostInfo(boolean fillAdditionalInfo) {
        return new powerwatch.matrix.com.pwgen2android.shared.host.Host(this.phoneUUID, null, null, null, null, null, fillAdditionalInfo ? loadAppPermissions() : null, 62, null);
    }
}
