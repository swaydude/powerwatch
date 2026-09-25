package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;", "", "language", "", "unitType", "timeFormatType", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getLanguage", "()Ljava/lang/String;", "getTimeFormatType", "()I", "getUnitType", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserAccountSettings {
    private final java.lang.String language;
    private final int timeFormatType;
    private final java.lang.String unitType;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = userAccountSettings.language;
        }
        if ((i2 & 2) != 0) {
            str2 = userAccountSettings.unitType;
        }
        if ((i2 & 4) != 0) {
            i = userAccountSettings.timeFormatType;
        }
        return userAccountSettings.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getUnitType() {
        return this.unitType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeFormatType() {
        return this.timeFormatType;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings copy(java.lang.String language, java.lang.String unitType, int timeFormatType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitType, "unitType");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings(language, unitType, timeFormatType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings = (powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.language, userAccountSettings.language) && kotlin.jvm.internal.Intrinsics.areEqual(this.unitType, userAccountSettings.unitType) && this.timeFormatType == userAccountSettings.timeFormatType;
    }

    public int hashCode() {
        return (((this.language.hashCode() * 31) + this.unitType.hashCode()) * 31) + this.timeFormatType;
    }

    public java.lang.String toString() {
        return "UserAccountSettings(language=" + this.language + ", unitType=" + this.unitType + ", timeFormatType=" + this.timeFormatType + ')';
    }

    public UserAccountSettings(java.lang.String language, java.lang.String unitType, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitType, "unitType");
        this.language = language;
        this.unitType = unitType;
        this.timeFormatType = i;
    }

    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final java.lang.String getUnitType() {
        return this.unitType;
    }

    public final int getTimeFormatType() {
        return this.timeFormatType;
    }
}
