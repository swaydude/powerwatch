package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerHeaderValues;", "", "avgFromBody", "", "avgFromLight", "pwFromBody", "solarPower", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvgFromBody", "()Ljava/lang/String;", "getAvgFromLight", "getPwFromBody", "getSolarPower", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PowerHeaderValues {
    private final java.lang.String avgFromBody;
    private final java.lang.String avgFromLight;
    private final java.lang.String pwFromBody;
    private final java.lang.String solarPower;

    public PowerHeaderValues() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues powerHeaderValues, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = powerHeaderValues.avgFromBody;
        }
        if ((i & 2) != 0) {
            str2 = powerHeaderValues.avgFromLight;
        }
        if ((i & 4) != 0) {
            str3 = powerHeaderValues.pwFromBody;
        }
        if ((i & 8) != 0) {
            str4 = powerHeaderValues.solarPower;
        }
        return powerHeaderValues.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAvgFromBody() {
        return this.avgFromBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAvgFromLight() {
        return this.avgFromLight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getPwFromBody() {
        return this.pwFromBody;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getSolarPower() {
        return this.solarPower;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues copy(java.lang.String avgFromBody, java.lang.String avgFromLight, java.lang.String pwFromBody, java.lang.String solarPower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgFromBody, "avgFromBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgFromLight, "avgFromLight");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwFromBody, "pwFromBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(solarPower, "solarPower");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues(avgFromBody, avgFromLight, pwFromBody, solarPower);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues powerHeaderValues = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.avgFromBody, powerHeaderValues.avgFromBody) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgFromLight, powerHeaderValues.avgFromLight) && kotlin.jvm.internal.Intrinsics.areEqual(this.pwFromBody, powerHeaderValues.pwFromBody) && kotlin.jvm.internal.Intrinsics.areEqual(this.solarPower, powerHeaderValues.solarPower);
    }

    public int hashCode() {
        return (((((this.avgFromBody.hashCode() * 31) + this.avgFromLight.hashCode()) * 31) + this.pwFromBody.hashCode()) * 31) + this.solarPower.hashCode();
    }

    public java.lang.String toString() {
        return "PowerHeaderValues(avgFromBody=" + this.avgFromBody + ", avgFromLight=" + this.avgFromLight + ", pwFromBody=" + this.pwFromBody + ", solarPower=" + this.solarPower + ')';
    }

    public PowerHeaderValues(java.lang.String avgFromBody, java.lang.String avgFromLight, java.lang.String pwFromBody, java.lang.String solarPower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgFromBody, "avgFromBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgFromLight, "avgFromLight");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwFromBody, "pwFromBody");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(solarPower, "solarPower");
        this.avgFromBody = avgFromBody;
        this.avgFromLight = avgFromLight;
        this.pwFromBody = pwFromBody;
        this.solarPower = solarPower;
    }

    public /* synthetic */ PowerHeaderValues(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str2, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str3, (i & 8) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str4);
    }

    public final java.lang.String getAvgFromBody() {
        return this.avgFromBody;
    }

    public final java.lang.String getAvgFromLight() {
        return this.avgFromLight;
    }

    public final java.lang.String getPwFromBody() {
        return this.pwFromBody;
    }

    public final java.lang.String getSolarPower() {
        return this.solarPower;
    }
}
