package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: ChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;", "Landroid/os/Parcelable;", "value", "", "text", "", "(FLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "()F", "component1", "component2", "copy", "describeContents", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LimitLineData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData.Creator();
    private final java.lang.String text;
    private final float value;

    /* JADX INFO: compiled from: ChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData limitLineData, float f, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = limitLineData.value;
        }
        if ((i & 2) != 0) {
            str = limitLineData.text;
        }
        return limitLineData.copy(f, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData copy(float value, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(value, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData limitLineData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.value), (java.lang.Object) java.lang.Float.valueOf(limitLineData.value)) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, limitLineData.text);
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.value) * 31) + this.text.hashCode();
    }

    public java.lang.String toString() {
        return "LimitLineData(value=" + this.value + ", text=" + this.text + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.value);
        parcel.writeString(this.text);
    }

    public LimitLineData(float f, java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.value = f;
        this.text = text;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final float getValue() {
        return this.value;
    }
}
