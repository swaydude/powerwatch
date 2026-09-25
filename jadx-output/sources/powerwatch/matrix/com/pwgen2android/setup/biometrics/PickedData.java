package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\fJL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;", "Landroid/os/Parcelable;", "value", "", "displayedValues", "", "max", "", "min", "displayedValuesLocalized", "(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;)V", "getDisplayedValues", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDisplayedValuesLocalized", "getMax", "()I", "getMin", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;", "describeContents", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PickedData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData.Creator();
    private final java.lang.String[] displayedValues;
    private final java.lang.String[] displayedValuesLocalized;
    private final int max;
    private final int min;
    private final java.lang.String value;

    /* JADX INFO: compiled from: BiometricsViewModel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.readInt(), parcel.createStringArray());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData[i];
        }
    }

    public PickedData() {
        this(null, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData copy$default(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData, java.lang.String str, java.lang.String[] strArr, int i, int i2, java.lang.String[] strArr2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = pickedData.value;
        }
        if ((i3 & 2) != 0) {
            strArr = pickedData.displayedValues;
        }
        java.lang.String[] strArr3 = strArr;
        if ((i3 & 4) != 0) {
            i = pickedData.max;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = pickedData.min;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            strArr2 = pickedData.displayedValuesLocalized;
        }
        return pickedData.copy(str, strArr3, i4, i5, strArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String[] getDisplayedValues() {
        return this.displayedValues;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String[] getDisplayedValuesLocalized() {
        return this.displayedValuesLocalized;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData copy(java.lang.String value, java.lang.String[] displayedValues, int max, int min, java.lang.String[] displayedValuesLocalized) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayedValues, "displayedValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayedValuesLocalized, "displayedValuesLocalized");
        return new powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData(value, displayedValues, max, min, displayedValuesLocalized);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = (powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, pickedData.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayedValues, pickedData.displayedValues) && this.max == pickedData.max && this.min == pickedData.min && kotlin.jvm.internal.Intrinsics.areEqual(this.displayedValuesLocalized, pickedData.displayedValuesLocalized);
    }

    public int hashCode() {
        return (((((((this.value.hashCode() * 31) + java.util.Arrays.hashCode(this.displayedValues)) * 31) + this.max) * 31) + this.min) * 31) + java.util.Arrays.hashCode(this.displayedValuesLocalized);
    }

    public java.lang.String toString() {
        return "PickedData(value=" + this.value + ", displayedValues=" + java.util.Arrays.toString(this.displayedValues) + ", max=" + this.max + ", min=" + this.min + ", displayedValuesLocalized=" + java.util.Arrays.toString(this.displayedValuesLocalized) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.value);
        parcel.writeStringArray(this.displayedValues);
        parcel.writeInt(this.max);
        parcel.writeInt(this.min);
        parcel.writeStringArray(this.displayedValuesLocalized);
    }

    public PickedData(java.lang.String value, java.lang.String[] displayedValues, int i, int i2, java.lang.String[] displayedValuesLocalized) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayedValues, "displayedValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayedValuesLocalized, "displayedValuesLocalized");
        this.value = value;
        this.displayedValues = displayedValues;
        this.max = i;
        this.min = i2;
        this.displayedValuesLocalized = displayedValuesLocalized;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PickedData(java.lang.String str, java.lang.String[] strArr, int i, int i2, java.lang.String[] strArr2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        str = (i3 & 1) != 0 ? "0" : str;
        java.lang.String[] strArr3 = (i3 & 2) != 0 ? new java.lang.String[0] : strArr;
        this(str, strArr3, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? strArr3 : strArr2);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String[] getDisplayedValues() {
        return this.displayedValues;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final java.lang.String[] getDisplayedValuesLocalized() {
        return this.displayedValuesLocalized;
    }
}
