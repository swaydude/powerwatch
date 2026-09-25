package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels;

/* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodValues;", "", "activeCalories", "", "bmrCalories", "avgActiveCalories", "avgBmrCalories", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveCalories", "()Ljava/lang/String;", "getAvgActiveCalories", "getAvgBmrCalories", "getBmrCalories", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CaloriesPeriodValues {
    private final java.lang.String activeCalories;
    private final java.lang.String avgActiveCalories;
    private final java.lang.String avgBmrCalories;
    private final java.lang.String bmrCalories;

    public CaloriesPeriodValues() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues caloriesPeriodValues, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = caloriesPeriodValues.activeCalories;
        }
        if ((i & 2) != 0) {
            str2 = caloriesPeriodValues.bmrCalories;
        }
        if ((i & 4) != 0) {
            str3 = caloriesPeriodValues.avgActiveCalories;
        }
        if ((i & 8) != 0) {
            str4 = caloriesPeriodValues.avgBmrCalories;
        }
        return caloriesPeriodValues.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getActiveCalories() {
        return this.activeCalories;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getBmrCalories() {
        return this.bmrCalories;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getAvgActiveCalories() {
        return this.avgActiveCalories;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getAvgBmrCalories() {
        return this.avgBmrCalories;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues copy(java.lang.String activeCalories, java.lang.String bmrCalories, java.lang.String avgActiveCalories, java.lang.String avgBmrCalories) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeCalories, "activeCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bmrCalories, "bmrCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgActiveCalories, "avgActiveCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgBmrCalories, "avgBmrCalories");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues(activeCalories, bmrCalories, avgActiveCalories, avgBmrCalories);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues caloriesPeriodValues = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodValues) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activeCalories, caloriesPeriodValues.activeCalories) && kotlin.jvm.internal.Intrinsics.areEqual(this.bmrCalories, caloriesPeriodValues.bmrCalories) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgActiveCalories, caloriesPeriodValues.avgActiveCalories) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgBmrCalories, caloriesPeriodValues.avgBmrCalories);
    }

    public int hashCode() {
        return (((((this.activeCalories.hashCode() * 31) + this.bmrCalories.hashCode()) * 31) + this.avgActiveCalories.hashCode()) * 31) + this.avgBmrCalories.hashCode();
    }

    public java.lang.String toString() {
        return "CaloriesPeriodValues(activeCalories=" + this.activeCalories + ", bmrCalories=" + this.bmrCalories + ", avgActiveCalories=" + this.avgActiveCalories + ", avgBmrCalories=" + this.avgBmrCalories + ')';
    }

    public CaloriesPeriodValues(java.lang.String activeCalories, java.lang.String bmrCalories, java.lang.String avgActiveCalories, java.lang.String avgBmrCalories) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeCalories, "activeCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bmrCalories, "bmrCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgActiveCalories, "avgActiveCalories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgBmrCalories, "avgBmrCalories");
        this.activeCalories = activeCalories;
        this.bmrCalories = bmrCalories;
        this.avgActiveCalories = avgActiveCalories;
        this.avgBmrCalories = avgBmrCalories;
    }

    public /* synthetic */ CaloriesPeriodValues(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str2, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str3, (i & 8) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str4);
    }

    public final java.lang.String getActiveCalories() {
        return this.activeCalories;
    }

    public final java.lang.String getBmrCalories() {
        return this.bmrCalories;
    }

    public final java.lang.String getAvgActiveCalories() {
        return this.avgActiveCalories;
    }

    public final java.lang.String getAvgBmrCalories() {
        return this.avgBmrCalories;
    }
}
