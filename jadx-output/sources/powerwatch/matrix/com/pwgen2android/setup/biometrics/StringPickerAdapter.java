package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;", "Lcom/super_rabbit/wheel_picker/WheelAdapter;", "Landroid/os/Parcelable;", "pickedData", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;", "unit", "", "(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V", "getPickedData", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;", "getUnit", "()Ljava/lang/String;", "describeContents", "", "getMaxIndex", "getMinIndex", "getPosition", "vale", "getTextWithMaximumLength", "getValue", "position", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StringPickerAdapter implements com.super_rabbit.wheel_picker.WheelAdapter, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter.Creator();
    private final powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData;
    private final java.lang.String unit;

    /* JADX INFO: compiled from: BiometricsViewModel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.super_rabbit.wheel_picker.WheelAdapter
    public int getMinIndex() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        this.pickedData.writeToParcel(parcel, flags);
        parcel.writeString(this.unit);
    }

    public StringPickerAdapter(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pickedData, "pickedData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.pickedData = pickedData;
        this.unit = unit;
    }

    public /* synthetic */ StringPickerAdapter(powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pickedData, (i & 2) != 0 ? "" : str);
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData getPickedData() {
        return this.pickedData;
    }

    public final java.lang.String getUnit() {
        return this.unit;
    }

    @Override // com.super_rabbit.wheel_picker.WheelAdapter
    public java.lang.String getValue(int position) {
        return (position < 0 || position >= this.pickedData.getDisplayedValuesLocalized().length) ? "" : kotlin.jvm.internal.Intrinsics.stringPlus(this.pickedData.getDisplayedValuesLocalized()[position], this.unit);
    }

    @Override // com.super_rabbit.wheel_picker.WheelAdapter
    public int getPosition(java.lang.String vale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vale, "vale");
        if (this.unit.length() > 0) {
            vale = kotlin.text.StringsKt.replace$default(vale, this.unit, "", false, 4, (java.lang.Object) null);
        }
        return kotlin.collections.ArraysKt.indexOf(this.pickedData.getDisplayedValuesLocalized(), vale);
    }

    @Override // com.super_rabbit.wheel_picker.WheelAdapter
    public java.lang.String getTextWithMaximumLength() {
        java.lang.String strStringPlus = "";
        if (this.pickedData.getDisplayedValuesLocalized().length == 0) {
            return "";
        }
        java.lang.String[] displayedValuesLocalized = this.pickedData.getDisplayedValuesLocalized();
        java.util.ArrayList arrayList = new java.util.ArrayList(displayedValuesLocalized.length);
        for (java.lang.String str : displayedValuesLocalized) {
            arrayList.add(java.lang.Integer.valueOf(str.length()));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, num.intValue()).iterator();
        while (it.hasNext()) {
            ((kotlin.collections.IntIterator) it).nextInt();
            strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(strStringPlus, "a");
        }
        return strStringPlus;
    }

    @Override // com.super_rabbit.wheel_picker.WheelAdapter
    public int getMaxIndex() {
        return this.pickedData.getDisplayedValuesLocalized().length - 1;
    }
}
