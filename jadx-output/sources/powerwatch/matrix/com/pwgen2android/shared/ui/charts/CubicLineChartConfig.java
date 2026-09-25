package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00060\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\u0016HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\u001b\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0006HÆ\u0003J\u001b\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00060\u0006HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J·\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00060\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\t\u00105\u001a\u00020\u0016HÖ\u0001J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0016HÖ\u0001J\t\u0010:\u001a\u00020\fHÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006@"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "limitLines", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;", "maxValue", "", "headerValues", "Lkotlin/Pair;", "", "entries", "Lcom/github/mikephil/charting/data/Entry;", "dataSetsLabels", "xAxisLabels", "yAxisLabels", "performAnimation", "", "daySubtitle", "hourOffset", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;FLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;I)V", "getDataSetsLabels", "()Ljava/util/List;", "getDaySubtitle", "()Ljava/lang/String;", "getEntries", "getHeaderValues", "getHourOffset", "()I", "getLimitLines", "getMaxValue", "()F", "getMode", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "getPerformAnimation", "()Z", "getXAxisLabels", "getYAxisLabels", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CubicLineChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig.Creator();
    private final java.util.List<java.lang.String> dataSetsLabels;
    private final java.lang.String daySubtitle;
    private final java.util.List<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> entries;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final int hourOffset;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines;
    private final float maxValue;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;
    private final boolean performAnimation;
    private final java.util.List<java.lang.String> xAxisLabels;
    private final java.util.List<java.lang.String> yAxisLabels;

    /* JADX INFO: compiled from: CubicLineChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodModeValueOf = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList2 = arrayList;
            float f = parcel.readFloat();
            int i3 = parcel.readInt();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(parcel.readSerializable());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            int i5 = parcel.readInt();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                int i7 = parcel.readInt();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    int i9 = parcel.readInt();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        arrayList7.add(parcel.readParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig.class.getClassLoader()));
                    }
                    arrayList6.add(arrayList7);
                }
                arrayList5.add(arrayList6);
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig(chartPeriodModeValueOf, arrayList2, f, arrayList4, arrayList5, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig[i];
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHourOffset() {
        return this.hourOffset;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> component2() {
        return this.limitLines;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component4() {
        return getHeaderValues();
    }

    public final java.util.List<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> component5() {
        return this.entries;
    }

    public final java.util.List<java.lang.String> component6() {
        return this.dataSetsLabels;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.xAxisLabels;
    }

    public final java.util.List<java.lang.String> component8() {
        return this.yAxisLabels;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig copy(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float maxValue, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, java.util.List<? extends java.util.List<? extends java.util.List<? extends com.github.mikephil.charting.data.Entry>>> entries, java.util.List<java.lang.String> dataSetsLabels, java.util.List<java.lang.String> xAxisLabels, java.util.List<java.lang.String> yAxisLabels, boolean performAnimation, java.lang.String daySubtitle, int hourOffset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSetsLabels, "dataSetsLabels");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yAxisLabels, "yAxisLabels");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig(mode, limitLines, maxValue, headerValues, entries, dataSetsLabels, xAxisLabels, yAxisLabels, performAnimation, daySubtitle, hourOffset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig cubicLineChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig) other;
        return this.mode == cubicLineChartConfig.mode && kotlin.jvm.internal.Intrinsics.areEqual(this.limitLines, cubicLineChartConfig.limitLines) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.maxValue), (java.lang.Object) java.lang.Float.valueOf(cubicLineChartConfig.maxValue)) && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), cubicLineChartConfig.getHeaderValues()) && kotlin.jvm.internal.Intrinsics.areEqual(this.entries, cubicLineChartConfig.entries) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataSetsLabels, cubicLineChartConfig.dataSetsLabels) && kotlin.jvm.internal.Intrinsics.areEqual(this.xAxisLabels, cubicLineChartConfig.xAxisLabels) && kotlin.jvm.internal.Intrinsics.areEqual(this.yAxisLabels, cubicLineChartConfig.yAxisLabels) && this.performAnimation == cubicLineChartConfig.performAnimation && kotlin.jvm.internal.Intrinsics.areEqual(this.daySubtitle, cubicLineChartConfig.daySubtitle) && this.hourOffset == cubicLineChartConfig.hourOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iHashCode = ((((((((((this.mode.hashCode() * 31) + this.limitLines.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.maxValue)) * 31) + getHeaderValues().hashCode()) * 31) + this.entries.hashCode()) * 31) + this.dataSetsLabels.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.xAxisLabels;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.yAxisLabels.hashCode()) * 31;
        boolean z = this.performAnimation;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        java.lang.String str = this.daySubtitle;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.hourOffset;
    }

    public java.lang.String toString() {
        return "CubicLineChartConfig(mode=" + this.mode + ", limitLines=" + this.limitLines + ", maxValue=" + this.maxValue + ", headerValues=" + getHeaderValues() + ", entries=" + this.entries + ", dataSetsLabels=" + this.dataSetsLabels + ", xAxisLabels=" + this.xAxisLabels + ", yAxisLabels=" + this.yAxisLabels + ", performAnimation=" + this.performAnimation + ", daySubtitle=" + ((java.lang.Object) this.daySubtitle) + ", hourOffset=" + this.hourOffset + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.mode.name());
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> list = this.limitLines;
        parcel.writeInt(list.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeFloat(this.maxValue);
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list2 = this.headerValues;
        parcel.writeInt(list2.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        java.util.List<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> list3 = this.entries;
        parcel.writeInt(list3.size());
        for (java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>> list4 : list3) {
            parcel.writeInt(list4.size());
            for (java.util.List<com.github.mikephil.charting.data.Entry> list5 : list4) {
                parcel.writeInt(list5.size());
                java.util.Iterator<com.github.mikephil.charting.data.Entry> it3 = list5.iterator();
                while (it3.hasNext()) {
                    parcel.writeParcelable(it3.next(), flags);
                }
            }
        }
        parcel.writeStringList(this.dataSetsLabels);
        parcel.writeStringList(this.xAxisLabels);
        parcel.writeStringList(this.yAxisLabels);
        parcel.writeInt(this.performAnimation ? 1 : 0);
        parcel.writeString(this.daySubtitle);
        parcel.writeInt(this.hourOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CubicLineChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, float f, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, java.util.List<? extends java.util.List<? extends java.util.List<? extends com.github.mikephil.charting.data.Entry>>> entries, java.util.List<java.lang.String> dataSetsLabels, java.util.List<java.lang.String> list, java.util.List<java.lang.String> yAxisLabels, boolean z, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSetsLabels, "dataSetsLabels");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yAxisLabels, "yAxisLabels");
        this.mode = mode;
        this.limitLines = limitLines;
        this.maxValue = f;
        this.headerValues = headerValues;
        this.entries = entries;
        this.dataSetsLabels = dataSetsLabels;
        this.xAxisLabels = list;
        this.yAxisLabels = yAxisLabels;
        this.performAnimation = z;
        this.daySubtitle = str;
        this.hourOffset = i;
    }

    public /* synthetic */ CubicLineChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode, java.util.List list, float f, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, boolean z, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY : chartPeriodMode, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, f, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, list3, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i2 & 64) != 0 ? null : list5, (i2 & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list6, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? 0 : i);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> getLimitLines() {
        return this.limitLines;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaderValues() {
        return this.headerValues;
    }

    public final java.util.List<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> getEntries() {
        return this.entries;
    }

    public final java.util.List<java.lang.String> getDataSetsLabels() {
        return this.dataSetsLabels;
    }

    public final java.util.List<java.lang.String> getXAxisLabels() {
        return this.xAxisLabels;
    }

    public final java.util.List<java.lang.String> getYAxisLabels() {
        return this.yAxisLabels;
    }

    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }

    public final int getHourOffset() {
        return this.hourOffset;
    }
}
