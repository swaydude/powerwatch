package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: UserAccount.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003Jy\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "", "uid", "", "enabled", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "email", "password", "age", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "weight", "", "gender", "shouldSync", "accountSettings", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V", "getAccountSettings", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;", "getAge", "()I", "getEmail", "()Ljava/lang/String;", "getEnabled", "()Z", "getGender", "getHeight", "getName", "getPassword", "getShouldSync", "getUid", "()J", "getWeight", "()F", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class User {
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings;
    private final int age;
    private final java.lang.String email;
    private final boolean enabled;
    private final java.lang.String gender;
    private final int height;
    private final java.lang.String name;
    private final java.lang.String password;
    private final boolean shouldSync;
    private final long uid;
    private final float weight;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldSync() {
        return this.shouldSync;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings getAccountSettings() {
        return this.accountSettings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.String getGender() {
        return this.gender;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.User copy(long uid, boolean enabled, java.lang.String name, java.lang.String email, java.lang.String password, int age, int height, float weight, java.lang.String gender, boolean shouldSync, powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.User(uid, enabled, name, email, password, age, height, weight, gender, shouldSync, accountSettings);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.User)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = (powerwatch.matrix.com.pwgen2android.shared.data.models.User) other;
        return this.uid == user.uid && this.enabled == user.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.name, user.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, user.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, user.password) && this.age == user.age && this.height == user.height && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.weight), (java.lang.Object) java.lang.Float.valueOf(user.weight)) && kotlin.jvm.internal.Intrinsics.areEqual(this.gender, user.gender) && this.shouldSync == user.shouldSync && kotlin.jvm.internal.Intrinsics.areEqual(this.accountSettings, user.accountSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iM0 = powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.uid) * 31;
        boolean z = this.enabled;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode = (((((iM0 + r1) * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31;
        java.lang.String str = this.password;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.age) * 31) + this.height) * 31) + java.lang.Float.floatToIntBits(this.weight)) * 31) + this.gender.hashCode()) * 31;
        boolean z2 = this.shouldSync;
        return ((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.accountSettings.hashCode();
    }

    public java.lang.String toString() {
        return "User(uid=" + this.uid + ", enabled=" + this.enabled + ", name=" + this.name + ", email=" + this.email + ", password=" + ((java.lang.Object) this.password) + ", age=" + this.age + ", height=" + this.height + ", weight=" + this.weight + ", gender=" + this.gender + ", shouldSync=" + this.shouldSync + ", accountSettings=" + this.accountSettings + ')';
    }

    public User(long j, boolean z, java.lang.String name, java.lang.String email, java.lang.String str, int i, int i2, float f, java.lang.String gender, boolean z2, powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSettings, "accountSettings");
        this.uid = j;
        this.enabled = z;
        this.name = name;
        this.email = email;
        this.password = str;
        this.age = i;
        this.height = i2;
        this.weight = f;
        this.gender = gender;
        this.shouldSync = z2;
        this.accountSettings = accountSettings;
    }

    public final long getUid() {
        return this.uid;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getWeight() {
        return this.weight;
    }

    public /* synthetic */ User(long j, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, float f, java.lang.String str4, boolean z2, powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? false : z, str, str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? 25 : i, (i3 & 64) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault : i2, (i3 & 128) != 0 ? 80.0f : f, (i3 & 256) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription() : str4, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings(powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo().getLanguageKey(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType(), powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat()) : userAccountSettings);
    }

    public final java.lang.String getGender() {
        return this.gender;
    }

    public final boolean getShouldSync() {
        return this.shouldSync;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings getAccountSettings() {
        return this.accountSettings;
    }
}
