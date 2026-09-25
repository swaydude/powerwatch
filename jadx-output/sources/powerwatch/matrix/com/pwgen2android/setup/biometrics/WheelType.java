package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "Landroid/os/Parcelable;", "()V", "Age", "Clock", "Gender", "Height", "Language", "SleepTime", "Weight", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class WheelType implements android.os.Parcelable {
    public /* synthetic */ WheelType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WheelType() {
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Height extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Height() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Weight extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Weight() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Age extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Age() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Gender extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Gender() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Language extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Language() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Clock extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private Clock() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepTime extends powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType {
        public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.Creator();

        /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }

        private SleepTime() {
            super(null);
        }
    }
}
