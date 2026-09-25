package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedGraphFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u001b\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\nHÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003J»\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0011HÆ\u0001J\t\u00108\u001a\u000209HÖ\u0001J\u0013\u0010:\u001a\u00020\u00112\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020\u0004HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"¨\u0006D"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "valuesFormat", "", "chartMinimum", "", "candleChartConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;", "lineChartConfig", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;", "maxLineChartData", "minLineChartData", "headerValues", "Lkotlin/Pair;", "useFloatYValues", "", "legendValues", "hrvValues", "hrvValue", "chartMaximum", "hasHrv", "(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;FZ)V", "getCandleChartConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartConfig;", "getChartMaximum", "()F", "getChartMinimum", "getHasHrv", "()Z", "getHeaderValues", "()Ljava/util/List;", "getHrvValue", "()Ljava/lang/String;", "getHrvValues", "getLegendValues", "getLineChartConfig", "getMaxLineChartData", "getMinLineChartData", "getUseFloatYValues", "getValuesFormat", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CombinedChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig.Creator();
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig;
    private final float chartMaximum;
    private final float chartMinimum;
    private final boolean hasHrv;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final java.lang.String hrvValue;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> hrvValues;
    private final java.util.List<java.lang.String> legendValues;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> lineChartConfig;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> maxLineChartData;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> minLineChartData;
    private final boolean useFloatYValues;
    private final java.lang.String valuesFormat;

    /* JADX INFO: compiled from: CombinedGraphFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            java.lang.String string = parcel.readString();
            float f = parcel.readFloat();
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfigCreateFromParcel = powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList2 = arrayList;
            int i3 = parcel.readInt();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            int i5 = parcel.readInt();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList5.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData.CREATOR.createFromParcel(parcel));
            }
            java.util.ArrayList arrayList6 = arrayList5;
            int i7 = parcel.readInt();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList7.add(parcel.readSerializable());
            }
            java.util.ArrayList arrayList8 = arrayList7;
            boolean z = parcel.readInt() != 0;
            java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i9 = parcel.readInt();
            java.util.ArrayList arrayList9 = new java.util.ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList9.add(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData.CREATOR.createFromParcel(parcel));
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(string, f, candleChartConfigCreateFromParcel, arrayList2, arrayList4, arrayList6, arrayList8, z, arrayListCreateStringArrayList, arrayList9, parcel.readString(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig[i];
        }
    }

    public CombinedChartConfig() {
        this(null, 0.0f, null, null, null, null, null, false, null, null, null, 0.0f, false, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getValuesFormat() {
        return this.valuesFormat;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> component10() {
        return this.hrvValues;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final java.lang.String getHrvValue() {
        return this.hrvValue;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getChartMaximum() {
        return this.chartMaximum;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHasHrv() {
        return this.hasHrv;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getChartMinimum() {
        return this.chartMinimum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig getCandleChartConfig() {
        return this.candleChartConfig;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> component4() {
        return this.lineChartConfig;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> component5() {
        return this.maxLineChartData;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> component6() {
        return this.minLineChartData;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component7() {
        return getHeaderValues();
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getUseFloatYValues() {
        return this.useFloatYValues;
    }

    public final java.util.List<java.lang.String> component9() {
        return this.legendValues;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig copy(java.lang.String valuesFormat, float chartMinimum, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> lineChartConfig, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> maxLineChartData, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> minLineChartData, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, boolean useFloatYValues, java.util.List<java.lang.String> legendValues, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> hrvValues, java.lang.String hrvValue, float chartMaximum, boolean hasHrv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valuesFormat, "valuesFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candleChartConfig, "candleChartConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChartConfig, "lineChartConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxLineChartData, "maxLineChartData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLineChartData, "minLineChartData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legendValues, "legendValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrvValues, "hrvValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrvValue, "hrvValue");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(valuesFormat, chartMinimum, candleChartConfig, lineChartConfig, maxLineChartData, minLineChartData, headerValues, useFloatYValues, legendValues, hrvValues, hrvValue, chartMaximum, hasHrv);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig combinedChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.valuesFormat, combinedChartConfig.valuesFormat) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.chartMinimum), (java.lang.Object) java.lang.Float.valueOf(combinedChartConfig.chartMinimum)) && kotlin.jvm.internal.Intrinsics.areEqual(this.candleChartConfig, combinedChartConfig.candleChartConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.lineChartConfig, combinedChartConfig.lineChartConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxLineChartData, combinedChartConfig.maxLineChartData) && kotlin.jvm.internal.Intrinsics.areEqual(this.minLineChartData, combinedChartConfig.minLineChartData) && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), combinedChartConfig.getHeaderValues()) && this.useFloatYValues == combinedChartConfig.useFloatYValues && kotlin.jvm.internal.Intrinsics.areEqual(this.legendValues, combinedChartConfig.legendValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.hrvValues, combinedChartConfig.hrvValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.hrvValue, combinedChartConfig.hrvValue) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.chartMaximum), (java.lang.Object) java.lang.Float.valueOf(combinedChartConfig.chartMaximum)) && this.hasHrv == combinedChartConfig.hasHrv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.valuesFormat.hashCode() * 31) + java.lang.Float.floatToIntBits(this.chartMinimum)) * 31) + this.candleChartConfig.hashCode()) * 31) + this.lineChartConfig.hashCode()) * 31) + this.maxLineChartData.hashCode()) * 31) + this.minLineChartData.hashCode()) * 31) + getHeaderValues().hashCode()) * 31;
        boolean z = this.useFloatYValues;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((iHashCode + r1) * 31) + this.legendValues.hashCode()) * 31) + this.hrvValues.hashCode()) * 31) + this.hrvValue.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.chartMaximum)) * 31;
        boolean z2 = this.hasHrv;
        return iHashCode2 + (z2 ? 1 : z2);
    }

    public java.lang.String toString() {
        return "CombinedChartConfig(valuesFormat=" + this.valuesFormat + ", chartMinimum=" + this.chartMinimum + ", candleChartConfig=" + this.candleChartConfig + ", lineChartConfig=" + this.lineChartConfig + ", maxLineChartData=" + this.maxLineChartData + ", minLineChartData=" + this.minLineChartData + ", headerValues=" + getHeaderValues() + ", useFloatYValues=" + this.useFloatYValues + ", legendValues=" + this.legendValues + ", hrvValues=" + this.hrvValues + ", hrvValue=" + this.hrvValue + ", chartMaximum=" + this.chartMaximum + ", hasHrv=" + this.hasHrv + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.valuesFormat);
        parcel.writeFloat(this.chartMinimum);
        this.candleChartConfig.writeToParcel(parcel, flags);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> list = this.lineChartConfig;
        parcel.writeInt(list.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> list2 = this.maxLineChartData;
        parcel.writeInt(list2.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> list3 = this.minLineChartData;
        parcel.writeInt(list3.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, flags);
        }
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list4 = this.headerValues;
        parcel.writeInt(list4.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeSerializable(it4.next());
        }
        parcel.writeInt(this.useFloatYValues ? 1 : 0);
        parcel.writeStringList(this.legendValues);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> list5 = this.hrvValues;
        parcel.writeInt(list5.size());
        java.util.Iterator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.hrvValue);
        parcel.writeFloat(this.chartMaximum);
        parcel.writeInt(this.hasHrv ? 1 : 0);
    }

    public CombinedChartConfig(java.lang.String valuesFormat, float f, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> lineChartConfig, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> maxLineChartData, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> minLineChartData, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, boolean z, java.util.List<java.lang.String> legendValues, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> hrvValues, java.lang.String hrvValue, float f2, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valuesFormat, "valuesFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candleChartConfig, "candleChartConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineChartConfig, "lineChartConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxLineChartData, "maxLineChartData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLineChartData, "minLineChartData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legendValues, "legendValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrvValues, "hrvValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrvValue, "hrvValue");
        this.valuesFormat = valuesFormat;
        this.chartMinimum = f;
        this.candleChartConfig = candleChartConfig;
        this.lineChartConfig = lineChartConfig;
        this.maxLineChartData = maxLineChartData;
        this.minLineChartData = minLineChartData;
        this.headerValues = headerValues;
        this.useFloatYValues = z;
        this.legendValues = legendValues;
        this.hrvValues = hrvValues;
        this.hrvValue = hrvValue;
        this.chartMaximum = f2;
        this.hasHrv = z2;
    }

    public final java.lang.String getValuesFormat() {
        return this.valuesFormat;
    }

    public final float getChartMinimum() {
        return this.chartMinimum;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CombinedChartConfig(java.lang.String str, float f, powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, boolean z, java.util.List list5, java.util.List list6, java.lang.String str2, float f2, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str3 = (i & 1) != 0 ? "" : str;
        float f3 = (i & 2) != 0 ? 0.0f : f;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig2 = (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(null, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, null, null, 0, 0, null, false, 4093, null) : candleChartConfig;
        this(str3, f3, candleChartConfig2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 64) != 0 ? candleChartConfig2.getHeaderValues() : list4, (i & 128) != 0 ? true : z, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list6, (i & 1024) == 0 ? str2 : "", (i & 2048) == 0 ? f2 : 0.0f, (i & 4096) != 0 ? false : z2);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig getCandleChartConfig() {
        return this.candleChartConfig;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> getLineChartConfig() {
        return this.lineChartConfig;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> getMaxLineChartData() {
        return this.maxLineChartData;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> getMinLineChartData() {
        return this.minLineChartData;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaderValues() {
        return this.headerValues;
    }

    public final boolean getUseFloatYValues() {
        return this.useFloatYValues;
    }

    public final java.util.List<java.lang.String> getLegendValues() {
        return this.legendValues;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> getHrvValues() {
        return this.hrvValues;
    }

    public final java.lang.String getHrvValue() {
        return this.hrvValue;
    }

    public final float getChartMaximum() {
        return this.chartMaximum;
    }

    public final boolean getHasHrv() {
        return this.hasHrv;
    }
}
