package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: ChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;", "Landroid/os/Parcelable;", "max", "", "middle", "min", "(III)V", "getMax", "()I", "getMiddle", "getMin", "component1", "component2", "component3", "copy", "describeContents", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GoalThreshold implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold.Creator();
    private final int max;
    private final int middle;
    private final int min;

    /* JADX INFO: compiled from: ChartFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold[i];
        }
    }

    public GoalThreshold() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = goalThreshold.max;
        }
        if ((i4 & 2) != 0) {
            i2 = goalThreshold.middle;
        }
        if ((i4 & 4) != 0) {
            i3 = goalThreshold.min;
        }
        return goalThreshold.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMiddle() {
        return this.middle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold copy(int max, int middle, int min) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(max, middle, min);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold) other;
        return this.max == goalThreshold.max && this.middle == goalThreshold.middle && this.min == goalThreshold.min;
    }

    public int hashCode() {
        return (((this.max * 31) + this.middle) * 31) + this.min;
    }

    public java.lang.String toString() {
        return "GoalThreshold(max=" + this.max + ", middle=" + this.middle + ", min=" + this.min + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.max);
        parcel.writeInt(this.middle);
        parcel.writeInt(this.min);
    }

    public GoalThreshold(int i, int i2, int i3) {
        this.max = i;
        this.middle = i2;
        this.min = i3;
    }

    public /* synthetic */ GoalThreshold(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMiddle() {
        return this.middle;
    }

    public final int getMin() {
        return this.min;
    }
}
