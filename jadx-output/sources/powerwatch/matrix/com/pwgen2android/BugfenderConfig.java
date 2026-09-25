package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: compiled from: BugfenderConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "", "()V", "initBugfender", "", "appContext", "Landroid/content/Context;", "setAppBuild", "appBuild", "", "setStravaAndFitStatus", "stravaStatus", "", "googleFitStatus", "setUserEmail", "userEmail", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BugfenderConfig {
    public final void initBugfender(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        com.bugfender.sdk.Bugfender.init(appContext, "doUHqHUAhouAncAdrQHvO2SVw3ZGwg28", false);
        com.bugfender.sdk.Bugfender.enableCrashReporting();
        com.bugfender.sdk.Bugfender.disableReflection(true);
    }

    public final void setAppBuild(java.lang.String appBuild) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBuild, "appBuild");
        com.bugfender.sdk.Bugfender.setDeviceString("app build", appBuild);
    }

    public final void setUserEmail(java.lang.String userEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        com.bugfender.sdk.Bugfender.setDeviceString("user email", userEmail);
    }

    public final void setStravaAndFitStatus(boolean stravaStatus, boolean googleFitStatus) {
        com.bugfender.sdk.Bugfender.setDeviceString("strava", java.lang.String.valueOf(stravaStatus));
        com.bugfender.sdk.Bugfender.setDeviceString("google_fit", java.lang.String.valueOf(googleFitStatus));
    }
}
