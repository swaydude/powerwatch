package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedBarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u001b\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b0\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "Landroid/os/Parcelable;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;", "valuesFormat", "", "chartMinimum", "", "barConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "headerValues", "", "Lkotlin/Pair;", "useFloatYValues", "", "chartMaximum", "(Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Ljava/util/List;ZF)V", "getBarConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "getChartMaximum", "()F", "getChartMinimum", "getHeaderValues", "()Ljava/util/List;", "getUseFloatYValues", "()Z", "getValuesFormat", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CombinedBarChartConfig implements android.os.Parcelable, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig.Creator();
    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barConfig;
    private final float chartMaximum;
    private final float chartMinimum;
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues;
    private final boolean useFloatYValues;
    private final java.lang.String valuesFormat;

    /* JADX INFO: compiled from: CombinedBarChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            java.lang.String string = parcel.readString();
            float f = parcel.readFloat();
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfigCreateFromParcel = powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(string, f, barChartConfigCreateFromParcel, arrayList, parcel.readInt() != 0, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig[i];
        }
    }

    public CombinedBarChartConfig() {
        this(null, 0.0f, null, null, false, 0.0f, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig combinedBarChartConfig, java.lang.String str, float f, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig, java.util.List list, boolean z, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = combinedBarChartConfig.valuesFormat;
        }
        if ((i & 2) != 0) {
            f = combinedBarChartConfig.chartMinimum;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            barChartConfig = combinedBarChartConfig.barConfig;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig2 = barChartConfig;
        if ((i & 8) != 0) {
            list = combinedBarChartConfig.getHeaderValues();
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            z = combinedBarChartConfig.useFloatYValues;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            f2 = combinedBarChartConfig.chartMaximum;
        }
        return combinedBarChartConfig.copy(str, f3, barChartConfig2, list2, z2, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getValuesFormat() {
        return this.valuesFormat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getChartMinimum() {
        return this.chartMinimum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig getBarConfig() {
        return this.barConfig;
    }

    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> component4() {
        return getHeaderValues();
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUseFloatYValues() {
        return this.useFloatYValues;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getChartMaximum() {
        return this.chartMaximum;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig copy(java.lang.String valuesFormat, float chartMinimum, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barConfig, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, boolean useFloatYValues, float chartMaximum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valuesFormat, "valuesFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barConfig, "barConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(valuesFormat, chartMinimum, barConfig, headerValues, useFloatYValues, chartMaximum);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig combinedBarChartConfig = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.valuesFormat, combinedBarChartConfig.valuesFormat) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.chartMinimum), (java.lang.Object) java.lang.Float.valueOf(combinedBarChartConfig.chartMinimum)) && kotlin.jvm.internal.Intrinsics.areEqual(this.barConfig, combinedBarChartConfig.barConfig) && kotlin.jvm.internal.Intrinsics.areEqual(getHeaderValues(), combinedBarChartConfig.getHeaderValues()) && this.useFloatYValues == combinedBarChartConfig.useFloatYValues && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.chartMaximum), (java.lang.Object) java.lang.Float.valueOf(combinedBarChartConfig.chartMaximum));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.valuesFormat.hashCode() * 31) + java.lang.Float.floatToIntBits(this.chartMinimum)) * 31) + this.barConfig.hashCode()) * 31) + getHeaderValues().hashCode()) * 31;
        boolean z = this.useFloatYValues;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + java.lang.Float.floatToIntBits(this.chartMaximum);
    }

    public java.lang.String toString() {
        return "CombinedBarChartConfig(valuesFormat=" + this.valuesFormat + ", chartMinimum=" + this.chartMinimum + ", barConfig=" + this.barConfig + ", headerValues=" + getHeaderValues() + ", useFloatYValues=" + this.useFloatYValues + ", chartMaximum=" + this.chartMaximum + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.valuesFormat);
        parcel.writeFloat(this.chartMinimum);
        this.barConfig.writeToParcel(parcel, flags);
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list = this.headerValues;
        parcel.writeInt(list.size());
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable(it.next());
        }
        parcel.writeInt(this.useFloatYValues ? 1 : 0);
        parcel.writeFloat(this.chartMaximum);
    }

    public CombinedBarChartConfig(java.lang.String valuesFormat, float f, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barConfig, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> headerValues, boolean z, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valuesFormat, "valuesFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barConfig, "barConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValues, "headerValues");
        this.valuesFormat = valuesFormat;
        this.chartMinimum = f;
        this.barConfig = barConfig;
        this.headerValues = headerValues;
        this.useFloatYValues = z;
        this.chartMaximum = f2;
    }

    public final java.lang.String getValuesFormat() {
        return this.valuesFormat;
    }

    public final float getChartMinimum() {
        return this.chartMinimum;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CombinedBarChartConfig(java.lang.String str, float f, powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig, java.util.List list, boolean z, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str2 = (i & 1) != 0 ? "" : str;
        float f3 = (i & 2) != 0 ? 0.0f : f;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig barChartConfig2 = (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(null, null, null, 0.0f, 0.0f, false, false, null, null, null, false, null, 4095, null) : barChartConfig;
        this(str2, f3, barChartConfig2, (i & 8) != 0 ? barChartConfig2.getHeaderValues() : list, (i & 16) != 0 ? true : z, (i & 32) == 0 ? f2 : 0.0f);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig getBarConfig() {
        return this.barConfig;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHeaderValues() {
        return this.headerValues;
    }

    public final boolean getUseFloatYValues() {
        return this.useFloatYValues;
    }

    public final float getChartMaximum() {
        return this.chartMaximum;
    }
}
