package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "", "unitsInfoData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;", "userInfoData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;", "goalInfoData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "languageInfoData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V", "getGoalInfoData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "getLanguageInfoData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;", "getUnitsInfoData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;", "getUserInfoData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PairingConfig {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData languageInfoData;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData languageInfoData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unitsInfoData = pairingConfig.unitsInfoData;
        }
        if ((i & 2) != 0) {
            userInfoData = pairingConfig.userInfoData;
        }
        if ((i & 4) != 0) {
            goalInfoData = pairingConfig.goalInfoData;
        }
        if ((i & 8) != 0) {
            languageInfoData = pairingConfig.languageInfoData;
        }
        return pairingConfig.copy(unitsInfoData, userInfoData, goalInfoData, languageInfoData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData getUnitsInfoData() {
        return this.unitsInfoData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData getUserInfoData() {
        return this.userInfoData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData getGoalInfoData() {
        return this.goalInfoData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData getLanguageInfoData() {
        return this.languageInfoData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData languageInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitsInfoData, "unitsInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoData, "userInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalInfoData, "goalInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageInfoData, "languageInfoData");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig(unitsInfoData, userInfoData, goalInfoData, languageInfoData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig = (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.unitsInfoData, pairingConfig.unitsInfoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInfoData, pairingConfig.userInfoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.goalInfoData, pairingConfig.goalInfoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.languageInfoData, pairingConfig.languageInfoData);
    }

    public int hashCode() {
        return (((((this.unitsInfoData.hashCode() * 31) + this.userInfoData.hashCode()) * 31) + this.goalInfoData.hashCode()) * 31) + this.languageInfoData.hashCode();
    }

    public java.lang.String toString() {
        return "PairingConfig(unitsInfoData=" + this.unitsInfoData + ", userInfoData=" + this.userInfoData + ", goalInfoData=" + this.goalInfoData + ", languageInfoData=" + this.languageInfoData + ')';
    }

    public PairingConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData languageInfoData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitsInfoData, "unitsInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoData, "userInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalInfoData, "goalInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageInfoData, "languageInfoData");
        this.unitsInfoData = unitsInfoData;
        this.userInfoData = userInfoData;
        this.goalInfoData = goalInfoData;
        this.languageInfoData = languageInfoData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData getUnitsInfoData() {
        return this.unitsInfoData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData getUserInfoData() {
        return this.userInfoData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData getGoalInfoData() {
        return this.goalInfoData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData getLanguageInfoData() {
        return this.languageInfoData;
    }
}
