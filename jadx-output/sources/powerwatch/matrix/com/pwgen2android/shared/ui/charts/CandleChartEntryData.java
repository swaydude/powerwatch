package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CandlesFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;", "Landroid/os/Parcelable;", "x", "", "shadowH", "shadowL", "open", "close", "malformed", "", "(FFFFFZ)V", "getClose", "()F", "getMalformed", "()Z", "getOpen", "getShadowH", "getShadowL", "getX", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "createCandleEntry", "Lcom/github/mikephil/charting/data/CandleEntry;", "describeContents", "", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CandleChartEntryData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData.Creator();
    private final float close;
    private final boolean malformed;
    private final float open;
    private final float shadowH;
    private final float shadowL;
    private final float x;

    /* JADX INFO: compiled from: CandlesFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData candleChartEntryData, float f, float f2, float f3, float f4, float f5, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = candleChartEntryData.x;
        }
        if ((i & 2) != 0) {
            f2 = candleChartEntryData.shadowH;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = candleChartEntryData.shadowL;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = candleChartEntryData.open;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            f5 = candleChartEntryData.close;
        }
        float f9 = f5;
        if ((i & 32) != 0) {
            z = candleChartEntryData.malformed;
        }
        return candleChartEntryData.copy(f, f6, f7, f8, f9, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getShadowH() {
        return this.shadowH;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getShadowL() {
        return this.shadowL;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMalformed() {
        return this.malformed;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData copy(float x, float shadowH, float shadowL, float open, float close, boolean malformed) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData(x, shadowH, shadowL, open, close, malformed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData candleChartEntryData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.x), (java.lang.Object) java.lang.Float.valueOf(candleChartEntryData.x)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.shadowH), (java.lang.Object) java.lang.Float.valueOf(candleChartEntryData.shadowH)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.shadowL), (java.lang.Object) java.lang.Float.valueOf(candleChartEntryData.shadowL)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.open), (java.lang.Object) java.lang.Float.valueOf(candleChartEntryData.open)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.close), (java.lang.Object) java.lang.Float.valueOf(candleChartEntryData.close)) && this.malformed == candleChartEntryData.malformed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iFloatToIntBits = ((((((((java.lang.Float.floatToIntBits(this.x) * 31) + java.lang.Float.floatToIntBits(this.shadowH)) * 31) + java.lang.Float.floatToIntBits(this.shadowL)) * 31) + java.lang.Float.floatToIntBits(this.open)) * 31) + java.lang.Float.floatToIntBits(this.close)) * 31;
        boolean z = this.malformed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iFloatToIntBits + r1;
    }

    public java.lang.String toString() {
        return "CandleChartEntryData(x=" + this.x + ", shadowH=" + this.shadowH + ", shadowL=" + this.shadowL + ", open=" + this.open + ", close=" + this.close + ", malformed=" + this.malformed + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.shadowH);
        parcel.writeFloat(this.shadowL);
        parcel.writeFloat(this.open);
        parcel.writeFloat(this.close);
        parcel.writeInt(this.malformed ? 1 : 0);
    }

    public CandleChartEntryData(float f, float f2, float f3, float f4, float f5, boolean z) {
        this.x = f;
        this.shadowH = f2;
        this.shadowL = f3;
        this.open = f4;
        this.close = f5;
        this.malformed = z;
    }

    public /* synthetic */ CandleChartEntryData(float f, float f2, float f3, float f4, float f5, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, (i & 32) != 0 ? false : z);
    }

    public final float getClose() {
        return this.close;
    }

    public final boolean getMalformed() {
        return this.malformed;
    }

    public final float getOpen() {
        return this.open;
    }

    public final float getShadowH() {
        return this.shadowH;
    }

    public final float getShadowL() {
        return this.shadowL;
    }

    public final float getX() {
        return this.x;
    }

    public final com.github.mikephil.charting.data.CandleEntry createCandleEntry() {
        return new com.github.mikephil.charting.data.CandleEntry(this.x, this.shadowH, this.shadowL, this.open, this.close);
    }
}
