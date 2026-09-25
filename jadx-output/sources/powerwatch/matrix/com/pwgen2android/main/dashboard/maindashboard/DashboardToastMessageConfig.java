package powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard;

/* JADX INFO: compiled from: DashboardToastMessageViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0013JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;", "", "text", "", "buttonText", "updateInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "device", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "type", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;", "durationSec", "", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)V", "getButtonText", "()Ljava/lang/String;", "getDevice", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "getDurationSec", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "getType", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;", "getUpdateInfo", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;Ljava/lang/Integer;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DashboardToastMessageConfig {
    private final java.lang.String buttonText;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device;
    private final java.lang.Integer durationSec;
    private final java.lang.String text;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType type;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig dashboardToastMessageConfig, java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType dashboardToastType, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dashboardToastMessageConfig.text;
        }
        if ((i & 2) != 0) {
            str2 = dashboardToastMessageConfig.buttonText;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            updateInfo = dashboardToastMessageConfig.updateInfo;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo2 = updateInfo;
        if ((i & 8) != 0) {
            device = dashboardToastMessageConfig.device;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device2 = device;
        if ((i & 16) != 0) {
            dashboardToastType = dashboardToastMessageConfig.type;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType dashboardToastType2 = dashboardToastType;
        if ((i & 32) != 0) {
            num = dashboardToastMessageConfig.durationSec;
        }
        return dashboardToastMessageConfig.copy(str, str3, updateInfo2, device2, dashboardToastType2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.Device getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.Integer getDurationSec() {
        return this.durationSec;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig copy(java.lang.String text, java.lang.String buttonText, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType type, java.lang.Integer durationSec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig(text, buttonText, updateInfo, device, type, durationSec);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig dashboardToastMessageConfig = (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastMessageConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, dashboardToastMessageConfig.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, dashboardToastMessageConfig.buttonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateInfo, dashboardToastMessageConfig.updateInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, dashboardToastMessageConfig.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, dashboardToastMessageConfig.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.durationSec, dashboardToastMessageConfig.durationSec);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.text.hashCode() * 31) + this.buttonText.hashCode()) * 31) + this.updateInfo.hashCode()) * 31) + this.device.hashCode()) * 31) + this.type.hashCode()) * 31;
        java.lang.Integer num = this.durationSec;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "DashboardToastMessageConfig(text=" + this.text + ", buttonText=" + this.buttonText + ", updateInfo=" + this.updateInfo + ", device=" + this.device + ", type=" + this.type + ", durationSec=" + this.durationSec + ')';
    }

    public DashboardToastMessageConfig(java.lang.String text, java.lang.String buttonText, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType type, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.text = text;
        this.buttonText = buttonText;
        this.updateInfo = updateInfo;
        this.device = device;
        this.type = type;
        this.durationSec = num;
    }

    public /* synthetic */ DashboardToastMessageConfig(java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo updateInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType dashboardToastType, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, updateInfo, device, dashboardToastType, (i & 32) != 0 ? null : num);
    }

    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.Device getDevice() {
        return this.device;
    }

    public final java.lang.Integer getDurationSec() {
        return this.durationSec;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.DashboardToastType getType() {
        return this.type;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }
}
