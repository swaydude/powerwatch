package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: FilledLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u001b\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\u0012HÆ\u0003J\u0097\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,HÖ\u0001R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00067"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/FilledLineChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "mode", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "limitLines", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;", "headerValues", "Lkotlin/Pair;", "", "topAreaEntries", "Lcom/github/mikephil/charting/data/Entry;", "bottomAreaEntries", "middleAreaEntries", "xAxisLabels", "daySubtitle", "performAnimation", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getBottomAreaEntries", "()Ljava/util/List;", "getDaySubtitle", "()Ljava/lang/String;", "getHeaderValues", "getLimitLines", "getMiddleAreaEntries", "getMode", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;", "getPerformAnimation", "()Z", "getTopAreaEntries", "getXAxisLabels", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FilledLineChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig.Creator();
    private final java.util.List<com.github.mikephil.charting.data.Entry> bottomAreaEntries;
    private final java.lang.String daySubtitle;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines;
    private final java.util.List<com.github.mikephil.charting.data.Entry> middleAreaEntries;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode;
    private final boolean performAnimation;
    private final java.util.List<com.github.mikephil.charting.data.Entry> topAreaEntries;
    private final java.util.List<java.lang.String> xAxisLabels;

    /* JADX INFO: compiled from: FilledLineChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodModeValueOf = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList2 = arrayList;
            int i3 = parcel.readInt();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(parcel.readSerializable());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            int i5 = parcel.readInt();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList5.add(parcel.readParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig.class.getClassLoader()));
            }
            java.util.ArrayList arrayList6 = arrayList5;
            int i7 = parcel.readInt();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList7.add(parcel.readParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig.class.getClassLoader()));
            }
            java.util.ArrayList arrayList8 = arrayList7;
            int i9 = parcel.readInt();
            java.util.ArrayList arrayList9 = new java.util.ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList9.add(parcel.readParcelable(powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig.class.getClassLoader()));
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig(chartPeriodModeValueOf, arrayList2, arrayList4, arrayList6, arrayList8, arrayList9, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig[i];
        }
    }

    public FilledLineChartConfig() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> component2() {
        return this.limitLines;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component3() {
        return getHeaderValues();
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> component4() {
        return this.topAreaEntries;
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> component5() {
        return this.bottomAreaEntries;
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> component6() {
        return this.middleAreaEntries;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.xAxisLabels;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig copy(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, java.util.List<? extends com.github.mikephil.charting.data.Entry> topAreaEntries, java.util.List<? extends com.github.mikephil.charting.data.Entry> bottomAreaEntries, java.util.List<? extends com.github.mikephil.charting.data.Entry> middleAreaEntries, java.util.List<java.lang.String> xAxisLabels, java.lang.String daySubtitle, boolean performAnimation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topAreaEntries, "topAreaEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomAreaEntries, "bottomAreaEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(middleAreaEntries, "middleAreaEntries");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig(mode, limitLines, headerValues, topAreaEntries, bottomAreaEntries, middleAreaEntries, xAxisLabels, daySubtitle, performAnimation);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig filledLineChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.FilledLineChartConfig) other;
        return this.mode == filledLineChartConfig.mode && kotlin.jvm.internal.Intrinsics.areEqual(this.limitLines, filledLineChartConfig.limitLines) && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), filledLineChartConfig.getHeaderValues()) && kotlin.jvm.internal.Intrinsics.areEqual(this.topAreaEntries, filledLineChartConfig.topAreaEntries) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomAreaEntries, filledLineChartConfig.bottomAreaEntries) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleAreaEntries, filledLineChartConfig.middleAreaEntries) && kotlin.jvm.internal.Intrinsics.areEqual(this.xAxisLabels, filledLineChartConfig.xAxisLabels) && kotlin.jvm.internal.Intrinsics.areEqual(this.daySubtitle, filledLineChartConfig.daySubtitle) && this.performAnimation == filledLineChartConfig.performAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    public int hashCode() {
        int iHashCode = ((((((((((this.mode.hashCode() * 31) + this.limitLines.hashCode()) * 31) + getHeaderValues().hashCode()) * 31) + this.topAreaEntries.hashCode()) * 31) + this.bottomAreaEntries.hashCode()) * 31) + this.middleAreaEntries.hashCode()) * 31;
        java.util.List<java.lang.String> list = this.xAxisLabels;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str = this.daySubtitle;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.performAnimation;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    public java.lang.String toString() {
        return "FilledLineChartConfig(mode=" + this.mode + ", limitLines=" + this.limitLines + ", headerValues=" + getHeaderValues() + ", topAreaEntries=" + this.topAreaEntries + ", bottomAreaEntries=" + this.bottomAreaEntries + ", middleAreaEntries=" + this.middleAreaEntries + ", xAxisLabels=" + this.xAxisLabels + ", daySubtitle=" + ((java.lang.Object) this.daySubtitle) + ", performAnimation=" + this.performAnimation + ')';
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
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list2 = this.headerValues;
        parcel.writeInt(list2.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        java.util.List<com.github.mikephil.charting.data.Entry> list3 = this.topAreaEntries;
        parcel.writeInt(list3.size());
        java.util.Iterator<com.github.mikephil.charting.data.Entry> it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), flags);
        }
        java.util.List<com.github.mikephil.charting.data.Entry> list4 = this.bottomAreaEntries;
        parcel.writeInt(list4.size());
        java.util.Iterator<com.github.mikephil.charting.data.Entry> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeParcelable(it4.next(), flags);
        }
        java.util.List<com.github.mikephil.charting.data.Entry> list5 = this.middleAreaEntries;
        parcel.writeInt(list5.size());
        java.util.Iterator<com.github.mikephil.charting.data.Entry> it5 = list5.iterator();
        while (it5.hasNext()) {
            parcel.writeParcelable(it5.next(), flags);
        }
        parcel.writeStringList(this.xAxisLabels);
        parcel.writeString(this.daySubtitle);
        parcel.writeInt(this.performAnimation ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilledLineChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode mode, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> limitLines, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, java.util.List<? extends com.github.mikephil.charting.data.Entry> topAreaEntries, java.util.List<? extends com.github.mikephil.charting.data.Entry> bottomAreaEntries, java.util.List<? extends com.github.mikephil.charting.data.Entry> middleAreaEntries, java.util.List<java.lang.String> list, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitLines, "limitLines");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topAreaEntries, "topAreaEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomAreaEntries, "bottomAreaEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(middleAreaEntries, "middleAreaEntries");
        this.mode = mode;
        this.limitLines = limitLines;
        this.headerValues = headerValues;
        this.topAreaEntries = topAreaEntries;
        this.bottomAreaEntries = bottomAreaEntries;
        this.middleAreaEntries = middleAreaEntries;
        this.xAxisLabels = list;
        this.daySubtitle = str;
        this.performAnimation = z;
    }

    public /* synthetic */ FilledLineChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY : chartPeriodMode, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i & 64) != 0 ? null : list6, (i & 128) == 0 ? str : null, (i & 256) != 0 ? true : z);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode getMode() {
        return this.mode;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> getLimitLines() {
        return this.limitLines;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaderValues() {
        return this.headerValues;
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> getTopAreaEntries() {
        return this.topAreaEntries;
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> getBottomAreaEntries() {
        return this.bottomAreaEntries;
    }

    public final java.util.List<com.github.mikephil.charting.data.Entry> getMiddleAreaEntries() {
        return this.middleAreaEntries;
    }

    public final java.util.List<java.lang.String> getXAxisLabels() {
        return this.xAxisLabels;
    }

    public final java.lang.String getDaySubtitle() {
        return this.daySubtitle;
    }

    public final boolean getPerformAnimation() {
        return this.performAnimation;
    }
}
