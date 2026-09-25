package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: BarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0015\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u001b\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\u00ad\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u00109\u001a\u00020\u0016HÖ\u0001J\u0013\u0010:\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0016HÖ\u0001J\t\u0010>\u001a\u00020\u0012HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006D"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "barEntries", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;", "limitLines", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;", "yMinValue", "", "yMaxValue", "yLinesEnabled", "", "multipleColors", "headerValues", "Lkotlin/Pair;", "", "goalThreshold", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;", "barColors", "", "performAnimation", "daySubtitle", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)V", "getBarColors", "()Ljava/util/List;", "getBarEntries", "getDaySubtitle", "()Ljava/lang/String;", "getGoalThreshold", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;", "getHeaderValues", "getLimitLines", "getMode", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "getMultipleColors", "()Z", "getPerformAnimation", "getYLinesEnabled", "getYMaxValue", "()F", "getYMinValue", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class BarChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig.Creator();
    private final java.util.List<java.lang.Integer> barColors;
    private final java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries;
    private final java.lang.String daySubtitle;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;
    private final boolean multipleColors;
    private final boolean performAnimation;
    private final boolean yLinesEnabled;
    private final float yMaxValue;
    private final float yMinValue;

    /* JADX INFO: compiled from: BarChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodModeValueOf = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                int i3 = parcel.readInt();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData.CREATOR.createFromParcel(parcel));
                }
                arrayList.add(arrayList2);
            }
            java.util.ArrayList arrayList3 = arrayList;
            int i5 = parcel.readInt();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList4.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList5 = arrayList4;
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i7 = parcel.readInt();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList6.add(parcel.readSerializable());
            }
            java.util.ArrayList arrayList7 = arrayList6;
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThresholdCreateFromParcel = powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold.CREATOR.createFromParcel(parcel);
            int i9 = parcel.readInt();
            java.util.ArrayList arrayList8 = new java.util.ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList8.add(java.lang.Integer.valueOf(parcel.readInt()));
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(chartPeriodModeValueOf, arrayList3, arrayList5, f, f2, z, z2, arrayList7, goalThresholdCreateFromParcel, arrayList8, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig[i];
        }
    }

    public BarChartConfig() {
        this(null, null, null, 0.0f, 0.0f, false, false, null, null, null, false, null, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<java.lang.Integer> component10() {
        return this.barColors;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }

    public final java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> component2() {
        return this.barEntries;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> component3() {
        return this.limitLines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getYMinValue() {
        return this.yMinValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getYMaxValue() {
        return this.yMaxValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getYLinesEnabled() {
        return this.yLinesEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getMultipleColors() {
        return this.multipleColors;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component8() {
        return getHeaderValues();
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold getGoalThreshold() {
        return this.goalThreshold;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig copy(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<? extends java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float yMinValue, float yMaxValue, boolean yLinesEnabled, boolean multipleColors, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, java.util.List<java.lang.Integer> barColors, boolean performAnimation, java.lang.String daySubtitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barEntries, "barEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalThreshold, "goalThreshold");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barColors, "barColors");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(mode, barEntries, limitLines, yMinValue, yMaxValue, yLinesEnabled, multipleColors, headerValues, goalThreshold, barColors, performAnimation, daySubtitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig) other;
        return this.mode == barChartConfig.mode && kotlin.jvm.internal.Intrinsics.areEqual(this.barEntries, barChartConfig.barEntries) && kotlin.jvm.internal.Intrinsics.areEqual(this.limitLines, barChartConfig.limitLines) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.yMinValue), (java.lang.Object) java.lang.Float.valueOf(barChartConfig.yMinValue)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.yMaxValue), (java.lang.Object) java.lang.Float.valueOf(barChartConfig.yMaxValue)) && this.yLinesEnabled == barChartConfig.yLinesEnabled && this.multipleColors == barChartConfig.multipleColors && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), barChartConfig.getHeaderValues()) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalThreshold, barChartConfig.goalThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.barColors, barChartConfig.barColors) && this.performAnimation == barChartConfig.performAnimation && kotlin.jvm.internal.Intrinsics.areEqual(this.daySubtitle, barChartConfig.daySubtitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((this.mode.hashCode() * 31) + this.barEntries.hashCode()) * 31) + this.limitLines.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.yMinValue)) * 31) + java.lang.Float.floatToIntBits(this.yMaxValue)) * 31;
        boolean z = this.yLinesEnabled;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.multipleColors;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((((((i + r2) * 31) + getHeaderValues().hashCode()) * 31) + this.goalThreshold.hashCode()) * 31) + this.barColors.hashCode()) * 31;
        boolean z3 = this.performAnimation;
        int i2 = (iHashCode2 + (z3 ? 1 : z3)) * 31;
        java.lang.String str = this.daySubtitle;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BarChartConfig(mode=" + this.mode + ", barEntries=" + this.barEntries + ", limitLines=" + this.limitLines + ", yMinValue=" + this.yMinValue + ", yMaxValue=" + this.yMaxValue + ", yLinesEnabled=" + this.yLinesEnabled + ", multipleColors=" + this.multipleColors + ", headerValues=" + getHeaderValues() + ", goalThreshold=" + this.goalThreshold + ", barColors=" + this.barColors + ", performAnimation=" + this.performAnimation + ", daySubtitle=" + ((java.lang.Object) this.daySubtitle) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.mode.name());
        java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> list = this.barEntries;
        parcel.writeInt(list.size());
        for (java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData> list2 : list) {
            parcel.writeInt(list2.size());
            java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData> it = list2.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> list3 = this.limitLines;
        parcel.writeInt(list3.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> it2 = list3.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        parcel.writeFloat(this.yMinValue);
        parcel.writeFloat(this.yMaxValue);
        parcel.writeInt(this.yLinesEnabled ? 1 : 0);
        parcel.writeInt(this.multipleColors ? 1 : 0);
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list4 = this.headerValues;
        parcel.writeInt(list4.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it3 = list4.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
        this.goalThreshold.writeToParcel(parcel, flags);
        java.util.List<java.lang.Integer> list5 = this.barColors;
        parcel.writeInt(list5.size());
        java.util.Iterator<java.lang.Integer> it4 = list5.iterator();
        while (it4.hasNext()) {
            parcel.writeInt(it4.next().intValue());
        }
        parcel.writeInt(this.performAnimation ? 1 : 0);
        parcel.writeString(this.daySubtitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<? extends java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> barEntries, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float f, float f2, boolean z, boolean z2, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, java.util.List<java.lang.Integer> barColors, boolean z3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barEntries, "barEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalThreshold, "goalThreshold");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barColors, "barColors");
        this.mode = mode;
        this.barEntries = barEntries;
        this.limitLines = limitLines;
        this.yMinValue = f;
        this.yMaxValue = f2;
        this.yLinesEnabled = z;
        this.multipleColors = z2;
        this.headerValues = headerValues;
        this.goalThreshold = goalThreshold;
        this.barColors = barColors;
        this.performAnimation = z3;
        this.daySubtitle = str;
    }

    public /* synthetic */ BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode, java.util.List list, java.util.List list2, float f, float f2, boolean z, boolean z2, java.util.List list3, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, java.util.List list4, boolean z3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY : chartPeriodMode, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 8) != 0 ? 0.0f : f, (i & 16) == 0 ? f2 : 0.0f, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 256) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null) : goalThreshold, (i & 512) != 0 ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.green_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}) : list4, (i & 1024) == 0 ? z3 : true, (i & 2048) != 0 ? null : str);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData>> getBarEntries() {
        return this.barEntries;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> getLimitLines() {
        return this.limitLines;
    }

    public final float getYMinValue() {
        return this.yMinValue;
    }

    public final float getYMaxValue() {
        return this.yMaxValue;
    }

    public final boolean getYLinesEnabled() {
        return this.yLinesEnabled;
    }

    public final boolean getMultipleColors() {
        return this.multipleColors;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaderValues() {
        return this.headerValues;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold getGoalThreshold() {
        return this.goalThreshold;
    }

    public final java.util.List<java.lang.Integer> getBarColors() {
        return this.barColors;
    }

    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }
}
