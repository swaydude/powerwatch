package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;", "", "genderMale", "", "age", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "weight", "", "email", "", "sleepTimeSelection", "(ZIIFLjava/lang/String;I)V", "getAge", "()I", "getEmail", "()Ljava/lang/String;", "getGenderMale", "()Z", "getHeight", "getSleepTimeSelection", "setSleepTimeSelection", "(I)V", "getWeight", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserInfoData {
    private final int age;
    private final java.lang.String email;
    private final boolean genderMale;
    private final int height;
    private int sleepTimeSelection;
    private final float weight;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData, boolean z, int i, int i2, float f, java.lang.String str, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            z = userInfoData.genderMale;
        }
        if ((i4 & 2) != 0) {
            i = userInfoData.age;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = userInfoData.height;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            f = userInfoData.weight;
        }
        float f2 = f;
        if ((i4 & 16) != 0) {
            str = userInfoData.email;
        }
        java.lang.String str2 = str;
        if ((i4 & 32) != 0) {
            i3 = userInfoData.sleepTimeSelection;
        }
        return userInfoData.copy(z, i5, i6, f2, str2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getGenderMale() {
        return this.genderMale;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSleepTimeSelection() {
        return this.sleepTimeSelection;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData copy(boolean genderMale, int age, int height, float weight, java.lang.String email, int sleepTimeSelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData(genderMale, age, height, weight, email, sleepTimeSelection);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData userInfoData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UserInfoData) other;
        return this.genderMale == userInfoData.genderMale && this.age == userInfoData.age && this.height == userInfoData.height && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.weight), (java.lang.Object) java.lang.Float.valueOf(userInfoData.weight)) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, userInfoData.email) && this.sleepTimeSelection == userInfoData.sleepTimeSelection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.genderMale;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((r0 * 31) + this.age) * 31) + this.height) * 31) + java.lang.Float.floatToIntBits(this.weight)) * 31) + this.email.hashCode()) * 31) + this.sleepTimeSelection;
    }

    public java.lang.String toString() {
        return "UserInfoData(genderMale=" + this.genderMale + ", age=" + this.age + ", height=" + this.height + ", weight=" + this.weight + ", email=" + this.email + ", sleepTimeSelection=" + this.sleepTimeSelection + ')';
    }

    public UserInfoData(boolean z, int i, int i2, float f, java.lang.String email, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        this.genderMale = z;
        this.age = i;
        this.height = i2;
        this.weight = f;
        this.email = email;
        this.sleepTimeSelection = i3;
    }

    public /* synthetic */ UserInfoData(boolean z, int i, int i2, float f, java.lang.String str, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, i2, f, str, (i4 & 32) != 0 ? 0 : i3);
    }

    public final int getAge() {
        return this.age;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final boolean getGenderMale() {
        return this.genderMale;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getSleepTimeSelection() {
        return this.sleepTimeSelection;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setSleepTimeSelection(int i) {
        this.sleepTimeSelection = i;
    }
}
