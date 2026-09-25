package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepHeaderValues;", "", "wentToBed", "", "avgDuration", "wokeUp", "duration", "restless", "avgRestless", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvgDuration", "()Ljava/lang/String;", "getAvgRestless", "getDuration", "getRestless", "getWentToBed", "getWokeUp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SleepHeaderValues {
    private final java.lang.String avgDuration;
    private final java.lang.String avgRestless;
    private final java.lang.String duration;
    private final java.lang.String restless;
    private final java.lang.String wentToBed;
    private final java.lang.String wokeUp;

    public SleepHeaderValues() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues sleepHeaderValues, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sleepHeaderValues.wentToBed;
        }
        if ((i & 2) != 0) {
            str2 = sleepHeaderValues.avgDuration;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = sleepHeaderValues.wokeUp;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = sleepHeaderValues.duration;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = sleepHeaderValues.restless;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = sleepHeaderValues.avgRestless;
        }
        return sleepHeaderValues.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getWentToBed() {
        return this.wentToBed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAvgDuration() {
        return this.avgDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getWokeUp() {
        return this.wokeUp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getRestless() {
        return this.restless;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getAvgRestless() {
        return this.avgRestless;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues copy(java.lang.String wentToBed, java.lang.String avgDuration, java.lang.String wokeUp, java.lang.String duration, java.lang.String restless, java.lang.String avgRestless) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues(wentToBed, avgDuration, wokeUp, duration, restless, avgRestless);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues sleepHeaderValues = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.wentToBed, sleepHeaderValues.wentToBed) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgDuration, sleepHeaderValues.avgDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.wokeUp, sleepHeaderValues.wokeUp) && kotlin.jvm.internal.Intrinsics.areEqual(this.duration, sleepHeaderValues.duration) && kotlin.jvm.internal.Intrinsics.areEqual(this.restless, sleepHeaderValues.restless) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgRestless, sleepHeaderValues.avgRestless);
    }

    public int hashCode() {
        java.lang.String str = this.wentToBed;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.avgDuration;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.wokeUp;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.duration;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.restless;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.avgRestless;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SleepHeaderValues(wentToBed=" + ((java.lang.Object) this.wentToBed) + ", avgDuration=" + ((java.lang.Object) this.avgDuration) + ", wokeUp=" + ((java.lang.Object) this.wokeUp) + ", duration=" + ((java.lang.Object) this.duration) + ", restless=" + ((java.lang.Object) this.restless) + ", avgRestless=" + ((java.lang.Object) this.avgRestless) + ')';
    }

    public SleepHeaderValues(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.wentToBed = str;
        this.avgDuration = str2;
        this.wokeUp = str3;
        this.duration = str4;
        this.restless = str5;
        this.avgRestless = str6;
    }

    public /* synthetic */ SleepHeaderValues(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final java.lang.String getWentToBed() {
        return this.wentToBed;
    }

    public final java.lang.String getAvgDuration() {
        return this.avgDuration;
    }

    public final java.lang.String getWokeUp() {
        return this.wokeUp;
    }

    public final java.lang.String getDuration() {
        return this.duration;
    }

    public final java.lang.String getRestless() {
        return this.restless;
    }

    public final java.lang.String getAvgRestless() {
        return this.avgRestless;
    }
}
