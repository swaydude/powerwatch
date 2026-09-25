package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CandlesFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0015HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u001b\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J¥\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000eHÆ\u0001J\t\u00109\u001a\u00020\u0015HÖ\u0001J\u0013\u0010:\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0015HÖ\u0001J\t\u0010>\u001a\u00020\u0011HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006D"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "entries", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;", "limitLines", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;", "yMinValue", "", "yMaxValue", "multipleColors", "", "headerValues", "Lkotlin/Pair;", "", "goalThreshold", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;", "increasingColor", "", "decreasingColor", "colors", "performAnimation", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;IILjava/util/List;Z)V", "getColors", "()Ljava/util/List;", "getDecreasingColor", "()I", "getEntries", "getGoalThreshold", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;", "getHeaderValues", "getIncreasingColor", "getLimitLines", "getMode", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "getMultipleColors", "()Z", "getPerformAnimation", "getYMaxValue", "()F", "getYMinValue", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CandleChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig.Creator();
    private final java.util.List<java.lang.Integer> colors;
    private final int decreasingColor;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final int increasingColor;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;
    private final boolean multipleColors;
    private final boolean performAnimation;
    private final float yMaxValue;
    private final float yMinValue;

    /* JADX INFO: compiled from: CandlesFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodModeValueOf = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList2 = arrayList;
            int i3 = parcel.readInt();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            int i5 = parcel.readInt();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList5.add(parcel.readSerializable());
            }
            java.util.ArrayList arrayList6 = arrayList5;
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThresholdCreateFromParcel = powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold.CREATOR.createFromParcel(parcel);
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList7.add(java.lang.Integer.valueOf(parcel.readInt()));
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(chartPeriodModeValueOf, arrayList2, arrayList4, f, f2, z, arrayList6, goalThresholdCreateFromParcel, i7, i8, arrayList7, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig[i];
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDecreasingColor() {
        return this.decreasingColor;
    }

    public final java.util.List<java.lang.Integer> component11() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> component2() {
        return this.entries;
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
    public final boolean getMultipleColors() {
        return this.multipleColors;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component7() {
        return getHeaderValues();
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold getGoalThreshold() {
        return this.goalThreshold;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIncreasingColor() {
        return this.increasingColor;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig copy(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float yMinValue, float yMaxValue, boolean multipleColors, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, int increasingColor, int decreasingColor, java.util.List<java.lang.Integer> colors, boolean performAnimation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalThreshold, "goalThreshold");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "colors");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(mode, entries, limitLines, yMinValue, yMaxValue, multipleColors, headerValues, goalThreshold, increasingColor, decreasingColor, colors, performAnimation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig) other;
        return this.mode == candleChartConfig.mode && kotlin.jvm.internal.Intrinsics.areEqual(this.entries, candleChartConfig.entries) && kotlin.jvm.internal.Intrinsics.areEqual(this.limitLines, candleChartConfig.limitLines) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.yMinValue), (java.lang.Object) java.lang.Float.valueOf(candleChartConfig.yMinValue)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.yMaxValue), (java.lang.Object) java.lang.Float.valueOf(candleChartConfig.yMaxValue)) && this.multipleColors == candleChartConfig.multipleColors && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), candleChartConfig.getHeaderValues()) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalThreshold, candleChartConfig.goalThreshold) && this.increasingColor == candleChartConfig.increasingColor && this.decreasingColor == candleChartConfig.decreasingColor && kotlin.jvm.internal.Intrinsics.areEqual(this.colors, candleChartConfig.colors) && this.performAnimation == candleChartConfig.performAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((this.mode.hashCode() * 31) + this.entries.hashCode()) * 31) + this.limitLines.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.yMinValue)) * 31) + java.lang.Float.floatToIntBits(this.yMaxValue)) * 31;
        boolean z = this.multipleColors;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((iHashCode + r1) * 31) + getHeaderValues().hashCode()) * 31) + this.goalThreshold.hashCode()) * 31) + this.increasingColor) * 31) + this.decreasingColor) * 31) + this.colors.hashCode()) * 31;
        boolean z2 = this.performAnimation;
        return iHashCode2 + (z2 ? 1 : z2);
    }

    public java.lang.String toString() {
        return "CandleChartConfig(mode=" + this.mode + ", entries=" + this.entries + ", limitLines=" + this.limitLines + ", yMinValue=" + this.yMinValue + ", yMaxValue=" + this.yMaxValue + ", multipleColors=" + this.multipleColors + ", headerValues=" + getHeaderValues() + ", goalThreshold=" + this.goalThreshold + ", increasingColor=" + this.increasingColor + ", decreasingColor=" + this.decreasingColor + ", colors=" + this.colors + ", performAnimation=" + this.performAnimation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.mode.name());
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> list = this.entries;
        parcel.writeInt(list.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> list2 = this.limitLines;
        parcel.writeInt(list2.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        parcel.writeFloat(this.yMinValue);
        parcel.writeFloat(this.yMaxValue);
        parcel.writeInt(this.multipleColors ? 1 : 0);
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list3 = this.headerValues;
        parcel.writeInt(list3.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
        this.goalThreshold.writeToParcel(parcel, flags);
        parcel.writeInt(this.increasingColor);
        parcel.writeInt(this.decreasingColor);
        java.util.List<java.lang.Integer> list4 = this.colors;
        parcel.writeInt(list4.size());
        java.util.Iterator<java.lang.Integer> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeInt(it4.next().intValue());
        }
        parcel.writeInt(this.performAnimation ? 1 : 0);
    }

    public CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> entries, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float f, float f2, boolean z, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, int i, int i2, java.util.List<java.lang.Integer> colors, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalThreshold, "goalThreshold");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "colors");
        this.mode = mode;
        this.entries = entries;
        this.limitLines = limitLines;
        this.yMinValue = f;
        this.yMaxValue = f2;
        this.multipleColors = z;
        this.headerValues = headerValues;
        this.goalThreshold = goalThreshold;
        this.increasingColor = i;
        this.decreasingColor = i2;
        this.colors = colors;
        this.performAnimation = z2;
    }

    public /* synthetic */ CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode, java.util.List list, java.util.List list2, float f, float f2, boolean z, java.util.List list3, powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, int i, int i2, java.util.List list4, boolean z2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY : chartPeriodMode, list, (i3 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0.0f : f2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i3 & 128) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null) : goalThreshold, (i3 & 256) != 0 ? powerwatch.matrix.com.pwgen2android.R.color.red_chart : i, (i3 & 512) != 0 ? powerwatch.matrix.com.pwgen2android.R.color.red_chart : i2, (i3 & 1024) != 0 ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.green_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}) : list4, (i3 & 2048) != 0 ? true : z2);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> getEntries() {
        return this.entries;
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

    public final int getIncreasingColor() {
        return this.increasingColor;
    }

    public final int getDecreasingColor() {
        return this.decreasingColor;
    }

    public final java.util.List<java.lang.Integer> getColors() {
        return this.colors;
    }

    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }
}
