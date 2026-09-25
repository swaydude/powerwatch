package powerwatch.matrix.com.pwgen2android.setup.goals;

/* JADX INFO: compiled from: SingleGoalEditFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "Landroid/os/Parcelable;", "()V", "Calories", "Power", "Sleep", "Steps", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class GoalType implements android.os.Parcelable {
    public /* synthetic */ GoalType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoalType() {
    }

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Steps extends powerwatch.matrix.com.pwgen2android.setup.goals.GoalType {
        public static final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.Creator();

        /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps[i];
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

        private Steps() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Calories extends powerwatch.matrix.com.pwgen2android.setup.goals.GoalType {
        public static final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.Creator();

        /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories[i];
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

        private Calories() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Sleep extends powerwatch.matrix.com.pwgen2android.setup.goals.GoalType {
        public static final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.Creator();

        /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep[i];
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

        private Sleep() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Power extends powerwatch.matrix.com.pwgen2android.setup.goals.GoalType {
        public static final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power();
        public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.Creator();

        /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power> {
            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power[] newArray(int i) {
                return new powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power[i];
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

        private Power() {
            super(null);
        }
    }
}
