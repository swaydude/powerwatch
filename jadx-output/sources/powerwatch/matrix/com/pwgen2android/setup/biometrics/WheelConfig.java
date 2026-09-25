package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;", "Landroid/os/Parcelable;", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "currentValue", "", "adapter", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;", "maxValue", "", "minValue", "wheelItemCount", "(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;III)V", "getAdapter", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;", "getCurrentValue", "()Ljava/lang/String;", "getMaxValue", "()I", "getMinValue", "getType", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "getWheelItemCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WheelConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig.Creator();
    private final powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter;
    private final java.lang.String currentValue;
    private final int maxValue;
    private final int minValue;
    private final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type;
    private final int wheelItemCount;

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig((powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType) parcel.readParcelable(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig copy$default(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType wheelType, java.lang.String str, powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            wheelType = wheelConfig.type;
        }
        if ((i4 & 2) != 0) {
            str = wheelConfig.currentValue;
        }
        java.lang.String str2 = str;
        if ((i4 & 4) != 0) {
            stringPickerAdapter = wheelConfig.adapter;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter2 = stringPickerAdapter;
        if ((i4 & 8) != 0) {
            i = wheelConfig.maxValue;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = wheelConfig.minValue;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = wheelConfig.wheelItemCount;
        }
        return wheelConfig.copy(wheelType, str2, stringPickerAdapter2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter getAdapter() {
        return this.adapter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWheelItemCount() {
        return this.wheelItemCount;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig copy(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type, java.lang.String currentValue, powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter, int maxValue, int minValue, int wheelItemCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(type, currentValue, adapter, maxValue, minValue, wheelItemCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = (powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, wheelConfig.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentValue, wheelConfig.currentValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.adapter, wheelConfig.adapter) && this.maxValue == wheelConfig.maxValue && this.minValue == wheelConfig.minValue && this.wheelItemCount == wheelConfig.wheelItemCount;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.currentValue.hashCode()) * 31;
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter = this.adapter;
        return ((((((iHashCode + (stringPickerAdapter == null ? 0 : stringPickerAdapter.hashCode())) * 31) + this.maxValue) * 31) + this.minValue) * 31) + this.wheelItemCount;
    }

    public java.lang.String toString() {
        return "WheelConfig(type=" + this.type + ", currentValue=" + this.currentValue + ", adapter=" + this.adapter + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", wheelItemCount=" + this.wheelItemCount + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.type, flags);
        parcel.writeString(this.currentValue);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter = this.adapter;
        if (stringPickerAdapter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stringPickerAdapter.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.maxValue);
        parcel.writeInt(this.minValue);
        parcel.writeInt(this.wheelItemCount);
    }

    public WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type, java.lang.String currentValue, powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        this.type = type;
        this.currentValue = currentValue;
        this.adapter = stringPickerAdapter;
        this.maxValue = i;
        this.minValue = i2;
        this.wheelItemCount = i3;
    }

    public /* synthetic */ WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType wheelType, java.lang.String str, powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter stringPickerAdapter, int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(wheelType, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? null : stringPickerAdapter, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 8 : i3);
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter getAdapter() {
        return this.adapter;
    }

    public final java.lang.String getCurrentValue() {
        return this.currentValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType getType() {
        return this.type;
    }

    public final int getWheelItemCount() {
        return this.wheelItemCount;
    }
}
