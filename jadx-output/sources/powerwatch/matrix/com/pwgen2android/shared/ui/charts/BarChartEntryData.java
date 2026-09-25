package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: BarChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nB/\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\fHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;", "Landroid/os/Parcelable;", "xValue", "", "yValue", "malformed", "", "(FFZ)V", "yValues", "", "(F[FZ)V", "creationType", "", "(IF[FFZ)V", "getCreationType", "()I", "getMalformed", "()Z", "getXValue", "()F", "getYValue", "getYValues", "()[F", "component1", "component2", "component3", "component4", "component5", "copy", "createBarEntry", "Lcom/github/mikephil/charting/data/BarEntry;", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class BarChartEntryData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData.Creator();
    private final int creationType;
    private final boolean malformed;
    private final float xValue;
    private final float yValue;
    private final float[] yValues;

    /* JADX INFO: compiled from: BarChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(parcel.readInt(), parcel.readFloat(), parcel.createFloatArray(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData barChartEntryData, int i, float f, float[] fArr, float f2, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = barChartEntryData.creationType;
        }
        if ((i2 & 2) != 0) {
            f = barChartEntryData.xValue;
        }
        float f3 = f;
        if ((i2 & 4) != 0) {
            fArr = barChartEntryData.yValues;
        }
        float[] fArr2 = fArr;
        if ((i2 & 8) != 0) {
            f2 = barChartEntryData.yValue;
        }
        float f4 = f2;
        if ((i2 & 16) != 0) {
            z = barChartEntryData.malformed;
        }
        return barChartEntryData.copy(i, f3, fArr2, f4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCreationType() {
        return this.creationType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getXValue() {
        return this.xValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float[] getYValues() {
        return this.yValues;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getYValue() {
        return this.yValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMalformed() {
        return this.malformed;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData copy(int creationType, float xValue, float[] yValues, float yValue, boolean malformed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yValues, "yValues");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(creationType, xValue, yValues, yValue, malformed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData barChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) other;
        return this.creationType == barChartEntryData.creationType && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.xValue), (java.lang.Object) java.lang.Float.valueOf(barChartEntryData.xValue)) && kotlin.jvm.internal.Intrinsics.areEqual(this.yValues, barChartEntryData.yValues) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.yValue), (java.lang.Object) java.lang.Float.valueOf(barChartEntryData.yValue)) && this.malformed == barChartEntryData.malformed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iFloatToIntBits = ((((((this.creationType * 31) + java.lang.Float.floatToIntBits(this.xValue)) * 31) + java.util.Arrays.hashCode(this.yValues)) * 31) + java.lang.Float.floatToIntBits(this.yValue)) * 31;
        boolean z = this.malformed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iFloatToIntBits + r1;
    }

    public java.lang.String toString() {
        return "BarChartEntryData(creationType=" + this.creationType + ", xValue=" + this.xValue + ", yValues=" + java.util.Arrays.toString(this.yValues) + ", yValue=" + this.yValue + ", malformed=" + this.malformed + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.creationType);
        parcel.writeFloat(this.xValue);
        parcel.writeFloatArray(this.yValues);
        parcel.writeFloat(this.yValue);
        parcel.writeInt(this.malformed ? 1 : 0);
    }

    public BarChartEntryData(int i, float f, float[] yValues, float f2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yValues, "yValues");
        this.creationType = i;
        this.xValue = f;
        this.yValues = yValues;
        this.yValue = f2;
        this.malformed = z;
    }

    public /* synthetic */ BarChartEntryData(int i, float f, float[] fArr, float f2, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, fArr, f2, (i2 & 16) != 0 ? false : z);
    }

    public final int getCreationType() {
        return this.creationType;
    }

    public final boolean getMalformed() {
        return this.malformed;
    }

    public final float getXValue() {
        return this.xValue;
    }

    public final float getYValue() {
        return this.yValue;
    }

    public final float[] getYValues() {
        return this.yValues;
    }

    public BarChartEntryData(float f, float f2, boolean z) {
        this(0, f, new float[0], f2, z);
    }

    public /* synthetic */ BarChartEntryData(float f, float f2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarChartEntryData(float f, float[] yValues, boolean z) {
        this(1, f, yValues, 0.0f, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yValues, "yValues");
    }

    public /* synthetic */ BarChartEntryData(float f, float[] fArr, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, fArr, (i & 4) != 0 ? false : z);
    }

    public final com.github.mikephil.charting.data.BarEntry createBarEntry() {
        int i = this.creationType;
        if (i == 0) {
            return new com.github.mikephil.charting.data.BarEntry(this.xValue, this.yValue);
        }
        if (i == 1) {
            return new com.github.mikephil.charting.data.BarEntry(this.xValue, this.yValues);
        }
        throw new kotlin.NotImplementedError("An operation is not implemented: Unsupported creation type");
    }
}
