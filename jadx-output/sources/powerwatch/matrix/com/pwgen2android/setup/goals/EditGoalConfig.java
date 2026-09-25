package powerwatch.matrix.com.pwgen2android.setup.goals;

/* JADX INFO: compiled from: SingleGoalEditFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;", "Landroid/os/Parcelable;", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "value", "", "unit", "", "(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V", "getType", "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;", "getUnit", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Number;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class EditGoalConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig> CREATOR = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig.Creator();
    private final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType type;
    private final java.lang.String unit;
    private final java.lang.Number value;

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig((powerwatch.matrix.com.pwgen2android.setup.goals.GoalType) parcel.readParcelable(powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig.class.getClassLoader()), (java.lang.Number) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig[i];
        }
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig copy$default(powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType goalType, java.lang.Number number, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            goalType = editGoalConfig.type;
        }
        if ((i & 2) != 0) {
            number = editGoalConfig.value;
        }
        if ((i & 4) != 0) {
            str = editGoalConfig.unit;
        }
        return editGoalConfig.copy(goalType, number, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Number getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getUnit() {
        return this.unit;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig copy(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType type, java.lang.Number value, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        return new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(type, value, unit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = (powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, editGoalConfig.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, editGoalConfig.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.unit, editGoalConfig.unit);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.value.hashCode()) * 31) + this.unit.hashCode();
    }

    public java.lang.String toString() {
        return "EditGoalConfig(type=" + this.type + ", value=" + this.value + ", unit=" + this.unit + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.type, flags);
        parcel.writeSerializable(this.value);
        parcel.writeString(this.unit);
    }

    public EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType type, java.lang.Number value, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.type = type;
        this.value = value;
        this.unit = unit;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.goals.GoalType getType() {
        return this.type;
    }

    public final java.lang.String getUnit() {
        return this.unit;
    }

    public final java.lang.Number getValue() {
        return this.value;
    }
}
