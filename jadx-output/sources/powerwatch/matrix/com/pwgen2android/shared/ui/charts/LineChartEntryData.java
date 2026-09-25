package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CombinedGraphFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LineChartEntryData;", "Landroid/os/Parcelable;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "createLineEntry", "Lcom/github/mikephil/charting/data/Entry;", "describeContents", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LineChartEntryData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData.Creator();
    private final float x;
    private final float y;

    /* JADX INFO: compiled from: CombinedGraphFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData lineChartEntryData, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = lineChartEntryData.x;
        }
        if ((i & 2) != 0) {
            f2 = lineChartEntryData.y;
        }
        return lineChartEntryData.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData copy(float x, float y) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(x, y);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData lineChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.x), (java.lang.Object) java.lang.Float.valueOf(lineChartEntryData.x)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.y), (java.lang.Object) java.lang.Float.valueOf(lineChartEntryData.y));
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.x) * 31) + java.lang.Float.floatToIntBits(this.y);
    }

    public java.lang.String toString() {
        return "LineChartEntryData(x=" + this.x + ", y=" + this.y + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
    }

    public LineChartEntryData(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final com.github.mikephil.charting.data.Entry createLineEntry() {
        return new com.github.mikephil.charting.data.Entry(this.x, this.y);
    }
}
