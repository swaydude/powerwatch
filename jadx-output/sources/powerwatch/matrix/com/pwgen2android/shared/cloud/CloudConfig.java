package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0002\u0010)J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\t\u0010S\u001a\u00020\u0011HÆ\u0003J\t\u0010T\u001a\u00020\u0011HÆ\u0003J\t\u0010U\u001a\u00020\u0011HÆ\u0003J\t\u0010V\u001a\u00020\u0011HÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\t\u0010X\u001a\u00020\u0011HÆ\u0003J\t\u0010Y\u001a\u00020\u0011HÆ\u0003J\t\u0010Z\u001a\u00020\u001bHÆ\u0003J\t\u0010[\u001a\u00020\u001dHÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u001fHÆ\u0003J\t\u0010^\u001a\u00020\u001fHÆ\u0003J\t\u0010_\u001a\u00020\u001fHÆ\u0003J\t\u0010`\u001a\u00020#HÆ\u0003J\t\u0010a\u001a\u00020%HÆ\u0003J\t\u0010b\u001a\u00020'HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\rHÆ\u0003J\t\u0010h\u001a\u00020\rHÆ\u0003J\t\u0010i\u001a\u00020\rHÆ\u0003J\t\u0010j\u001a\u00020\u0011HÆ\u0003J\u008d\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u0003HÆ\u0001J\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020pHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010 \u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0011\u0010!\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0011\u0010\u0019\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0011\u0010\u0017\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:¨\u0006r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;", "", "baseURL", "", "httpConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;", "authConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "userAccountConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;", "deviceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;", "walkingHourPeriodConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;", "restingHourPeriodConfig", "sleepHourPeriodConfig", "walkingDayPeriodConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;", "restingDayPeriodConfig", "sleepDayPeriodConfig", "walkingWeekPeriodConfig", "restingWeekPeriodConfig", "sleepWeekPeriodConfig", "walkingMonthPeriodConfig", "restingMonthPeriodConfig", "sleepMonthPeriodConfig", "updateInfoConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;", "goalConfigurationConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;", "walkingLogConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;", "restingLogConfiguration", "sleepLogConfiguration", "userActivityConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;", "metricsConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;", "fontUpdateConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;", "logsUploadEndpoint", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Ljava/lang/String;)V", "getAuthConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "getBaseURL", "()Ljava/lang/String;", "getDeviceConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;", "getFontUpdateConfiguration", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;", "getGoalConfigurationConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;", "getHttpConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;", "getLogsUploadEndpoint", "getMetricsConfiguration", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;", "getRestingDayPeriodConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;", "getRestingHourPeriodConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;", "getRestingLogConfiguration", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;", "getRestingMonthPeriodConfig", "getRestingWeekPeriodConfig", "getSleepDayPeriodConfig", "getSleepHourPeriodConfig", "getSleepLogConfiguration", "getSleepMonthPeriodConfig", "getSleepWeekPeriodConfig", "getUpdateInfoConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;", "getUserAccountConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;", "getUserActivityConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;", "getWalkingDayPeriodConfig", "getWalkingHourPeriodConfig", "getWalkingLogConfiguration", "getWalkingMonthPeriodConfig", "getWalkingWeekPeriodConfig", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CloudConfig {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig;
    private final java.lang.String baseURL;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig goalConfigurationConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig;
    private final java.lang.String logsUploadEndpoint;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration metricsConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingDayPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig restingHourPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig restingLogConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingMonthPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingWeekPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepDayPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig sleepHourPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig sleepLogConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepMonthPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepWeekPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig updateInfoConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingDayPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig walkingHourPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig walkingLogConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingMonthPeriodConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingWeekPeriodConfig;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingDayPeriodConfig() {
        return this.restingDayPeriodConfig;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepDayPeriodConfig() {
        return this.sleepDayPeriodConfig;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingWeekPeriodConfig() {
        return this.walkingWeekPeriodConfig;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingWeekPeriodConfig() {
        return this.restingWeekPeriodConfig;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepWeekPeriodConfig() {
        return this.sleepWeekPeriodConfig;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingMonthPeriodConfig() {
        return this.walkingMonthPeriodConfig;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingMonthPeriodConfig() {
        return this.restingMonthPeriodConfig;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepMonthPeriodConfig() {
        return this.sleepMonthPeriodConfig;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig getUpdateInfoConfig() {
        return this.updateInfoConfig;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig getGoalConfigurationConfig() {
        return this.goalConfigurationConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig getHttpConfig() {
        return this.httpConfig;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getWalkingLogConfiguration() {
        return this.walkingLogConfiguration;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getRestingLogConfiguration() {
        return this.restingLogConfiguration;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getSleepLogConfiguration() {
        return this.sleepLogConfiguration;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig getUserActivityConfig() {
        return this.userActivityConfig;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration getMetricsConfiguration() {
        return this.metricsConfiguration;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration getFontUpdateConfiguration() {
        return this.fontUpdateConfiguration;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final java.lang.String getLogsUploadEndpoint() {
        return this.logsUploadEndpoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config getAuthConfig() {
        return this.authConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig getUserAccountConfig() {
        return this.userAccountConfig;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getWalkingHourPeriodConfig() {
        return this.walkingHourPeriodConfig;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getRestingHourPeriodConfig() {
        return this.restingHourPeriodConfig;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getSleepHourPeriodConfig() {
        return this.sleepHourPeriodConfig;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingDayPeriodConfig() {
        return this.walkingDayPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig copy(java.lang.String baseURL, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig walkingHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig restingHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig sleepHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig updateInfoConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig goalConfigurationConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig walkingLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig restingLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig sleepLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration metricsConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration, java.lang.String logsUploadEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountConfig, "userAccountConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodConfig, "walkingHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodConfig, "restingHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodConfig, "sleepHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodConfig, "walkingDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodConfig, "restingDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodConfig, "sleepDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriodConfig, "walkingWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriodConfig, "restingWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriodConfig, "sleepWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodConfig, "walkingMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodConfig, "restingMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodConfig, "sleepMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoConfig, "updateInfoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationConfig, "goalConfigurationConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogConfiguration, "walkingLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogConfiguration, "restingLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogConfiguration, "sleepLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityConfig, "userActivityConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsConfiguration, "metricsConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateConfiguration, "fontUpdateConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logsUploadEndpoint, "logsUploadEndpoint");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig(baseURL, httpConfig, authConfig, userAccountConfig, deviceConfig, walkingHourPeriodConfig, restingHourPeriodConfig, sleepHourPeriodConfig, walkingDayPeriodConfig, restingDayPeriodConfig, sleepDayPeriodConfig, walkingWeekPeriodConfig, restingWeekPeriodConfig, sleepWeekPeriodConfig, walkingMonthPeriodConfig, restingMonthPeriodConfig, sleepMonthPeriodConfig, updateInfoConfig, goalConfigurationConfig, walkingLogConfiguration, restingLogConfiguration, sleepLogConfiguration, userActivityConfig, metricsConfiguration, fontUpdateConfiguration, logsUploadEndpoint);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig = (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseURL, cloudConfig.baseURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.httpConfig, cloudConfig.httpConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.authConfig, cloudConfig.authConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAccountConfig, cloudConfig.userAccountConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceConfig, cloudConfig.deviceConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingHourPeriodConfig, cloudConfig.walkingHourPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingHourPeriodConfig, cloudConfig.restingHourPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepHourPeriodConfig, cloudConfig.sleepHourPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingDayPeriodConfig, cloudConfig.walkingDayPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingDayPeriodConfig, cloudConfig.restingDayPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepDayPeriodConfig, cloudConfig.sleepDayPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingWeekPeriodConfig, cloudConfig.walkingWeekPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingWeekPeriodConfig, cloudConfig.restingWeekPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepWeekPeriodConfig, cloudConfig.sleepWeekPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingMonthPeriodConfig, cloudConfig.walkingMonthPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingMonthPeriodConfig, cloudConfig.restingMonthPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepMonthPeriodConfig, cloudConfig.sleepMonthPeriodConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateInfoConfig, cloudConfig.updateInfoConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalConfigurationConfig, cloudConfig.goalConfigurationConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingLogConfiguration, cloudConfig.walkingLogConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingLogConfiguration, cloudConfig.restingLogConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepLogConfiguration, cloudConfig.sleepLogConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.userActivityConfig, cloudConfig.userActivityConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.metricsConfiguration, cloudConfig.metricsConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontUpdateConfiguration, cloudConfig.fontUpdateConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.logsUploadEndpoint, cloudConfig.logsUploadEndpoint);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.baseURL.hashCode() * 31) + this.httpConfig.hashCode()) * 31) + this.authConfig.hashCode()) * 31) + this.userAccountConfig.hashCode()) * 31) + this.deviceConfig.hashCode()) * 31) + this.walkingHourPeriodConfig.hashCode()) * 31) + this.restingHourPeriodConfig.hashCode()) * 31) + this.sleepHourPeriodConfig.hashCode()) * 31) + this.walkingDayPeriodConfig.hashCode()) * 31) + this.restingDayPeriodConfig.hashCode()) * 31) + this.sleepDayPeriodConfig.hashCode()) * 31) + this.walkingWeekPeriodConfig.hashCode()) * 31) + this.restingWeekPeriodConfig.hashCode()) * 31) + this.sleepWeekPeriodConfig.hashCode()) * 31) + this.walkingMonthPeriodConfig.hashCode()) * 31) + this.restingMonthPeriodConfig.hashCode()) * 31) + this.sleepMonthPeriodConfig.hashCode()) * 31) + this.updateInfoConfig.hashCode()) * 31) + this.goalConfigurationConfig.hashCode()) * 31) + this.walkingLogConfiguration.hashCode()) * 31) + this.restingLogConfiguration.hashCode()) * 31) + this.sleepLogConfiguration.hashCode()) * 31) + this.userActivityConfig.hashCode()) * 31) + this.metricsConfiguration.hashCode()) * 31) + this.fontUpdateConfiguration.hashCode()) * 31) + this.logsUploadEndpoint.hashCode();
    }

    public java.lang.String toString() {
        return "CloudConfig(baseURL=" + this.baseURL + ", httpConfig=" + this.httpConfig + ", authConfig=" + this.authConfig + ", userAccountConfig=" + this.userAccountConfig + ", deviceConfig=" + this.deviceConfig + ", walkingHourPeriodConfig=" + this.walkingHourPeriodConfig + ", restingHourPeriodConfig=" + this.restingHourPeriodConfig + ", sleepHourPeriodConfig=" + this.sleepHourPeriodConfig + ", walkingDayPeriodConfig=" + this.walkingDayPeriodConfig + ", restingDayPeriodConfig=" + this.restingDayPeriodConfig + ", sleepDayPeriodConfig=" + this.sleepDayPeriodConfig + ", walkingWeekPeriodConfig=" + this.walkingWeekPeriodConfig + ", restingWeekPeriodConfig=" + this.restingWeekPeriodConfig + ", sleepWeekPeriodConfig=" + this.sleepWeekPeriodConfig + ", walkingMonthPeriodConfig=" + this.walkingMonthPeriodConfig + ", restingMonthPeriodConfig=" + this.restingMonthPeriodConfig + ", sleepMonthPeriodConfig=" + this.sleepMonthPeriodConfig + ", updateInfoConfig=" + this.updateInfoConfig + ", goalConfigurationConfig=" + this.goalConfigurationConfig + ", walkingLogConfiguration=" + this.walkingLogConfiguration + ", restingLogConfiguration=" + this.restingLogConfiguration + ", sleepLogConfiguration=" + this.sleepLogConfiguration + ", userActivityConfig=" + this.userActivityConfig + ", metricsConfiguration=" + this.metricsConfiguration + ", fontUpdateConfiguration=" + this.fontUpdateConfiguration + ", logsUploadEndpoint=" + this.logsUploadEndpoint + ')';
    }

    public CloudConfig(java.lang.String baseURL, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig walkingHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig restingHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig sleepHourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepDayPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepWeekPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig walkingMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig restingMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig sleepMonthPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig updateInfoConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig goalConfigurationConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig walkingLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig restingLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig sleepLogConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration metricsConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration, java.lang.String logsUploadEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountConfig, "userAccountConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriodConfig, "walkingHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriodConfig, "restingHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriodConfig, "sleepHourPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodConfig, "walkingDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodConfig, "restingDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodConfig, "sleepDayPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriodConfig, "walkingWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriodConfig, "restingWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriodConfig, "sleepWeekPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodConfig, "walkingMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodConfig, "restingMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodConfig, "sleepMonthPeriodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoConfig, "updateInfoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationConfig, "goalConfigurationConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogConfiguration, "walkingLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogConfiguration, "restingLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogConfiguration, "sleepLogConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityConfig, "userActivityConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsConfiguration, "metricsConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateConfiguration, "fontUpdateConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logsUploadEndpoint, "logsUploadEndpoint");
        this.baseURL = baseURL;
        this.httpConfig = httpConfig;
        this.authConfig = authConfig;
        this.userAccountConfig = userAccountConfig;
        this.deviceConfig = deviceConfig;
        this.walkingHourPeriodConfig = walkingHourPeriodConfig;
        this.restingHourPeriodConfig = restingHourPeriodConfig;
        this.sleepHourPeriodConfig = sleepHourPeriodConfig;
        this.walkingDayPeriodConfig = walkingDayPeriodConfig;
        this.restingDayPeriodConfig = restingDayPeriodConfig;
        this.sleepDayPeriodConfig = sleepDayPeriodConfig;
        this.walkingWeekPeriodConfig = walkingWeekPeriodConfig;
        this.restingWeekPeriodConfig = restingWeekPeriodConfig;
        this.sleepWeekPeriodConfig = sleepWeekPeriodConfig;
        this.walkingMonthPeriodConfig = walkingMonthPeriodConfig;
        this.restingMonthPeriodConfig = restingMonthPeriodConfig;
        this.sleepMonthPeriodConfig = sleepMonthPeriodConfig;
        this.updateInfoConfig = updateInfoConfig;
        this.goalConfigurationConfig = goalConfigurationConfig;
        this.walkingLogConfiguration = walkingLogConfiguration;
        this.restingLogConfiguration = restingLogConfiguration;
        this.sleepLogConfiguration = sleepLogConfiguration;
        this.userActivityConfig = userActivityConfig;
        this.metricsConfiguration = metricsConfiguration;
        this.fontUpdateConfiguration = fontUpdateConfiguration;
        this.logsUploadEndpoint = logsUploadEndpoint;
    }

    public final java.lang.String getBaseURL() {
        return this.baseURL;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig getHttpConfig() {
        return this.httpConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config getAuthConfig() {
        return this.authConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig getUserAccountConfig() {
        return this.userAccountConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig getDeviceConfig() {
        return this.deviceConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getWalkingHourPeriodConfig() {
        return this.walkingHourPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getRestingHourPeriodConfig() {
        return this.restingHourPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig getSleepHourPeriodConfig() {
        return this.sleepHourPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingDayPeriodConfig() {
        return this.walkingDayPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingDayPeriodConfig() {
        return this.restingDayPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepDayPeriodConfig() {
        return this.sleepDayPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingWeekPeriodConfig() {
        return this.walkingWeekPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingWeekPeriodConfig() {
        return this.restingWeekPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepWeekPeriodConfig() {
        return this.sleepWeekPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getWalkingMonthPeriodConfig() {
        return this.walkingMonthPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getRestingMonthPeriodConfig() {
        return this.restingMonthPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig getSleepMonthPeriodConfig() {
        return this.sleepMonthPeriodConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig getUpdateInfoConfig() {
        return this.updateInfoConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig getGoalConfigurationConfig() {
        return this.goalConfigurationConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getWalkingLogConfiguration() {
        return this.walkingLogConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getRestingLogConfiguration() {
        return this.restingLogConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig getSleepLogConfiguration() {
        return this.sleepLogConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig getUserActivityConfig() {
        return this.userActivityConfig;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration getMetricsConfiguration() {
        return this.metricsConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration getFontUpdateConfiguration() {
        return this.fontUpdateConfiguration;
    }

    public final java.lang.String getLogsUploadEndpoint() {
        return this.logsUploadEndpoint;
    }
}
