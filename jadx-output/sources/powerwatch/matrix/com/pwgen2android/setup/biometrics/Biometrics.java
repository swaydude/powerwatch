package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;", "", "age", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "Lkotlin/Pair;", "", "weight", "", "gender", "language", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "isMetric", "", "(ILkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;Z)V", "getAge", "()I", "getGender", "()Ljava/lang/String;", "getHeight", "()Lkotlin/Pair;", "()Z", "getLanguage", "()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "getWeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Biometrics {
    private final int age;
    private final java.lang.String gender;
    private final kotlin.Pair<java.lang.Integer, java.lang.String> height;
    private final boolean isMetric;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language;
    private final kotlin.Pair<java.lang.Float, java.lang.String> weight;

    public Biometrics() {
        this(0, null, null, null, null, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics copy$default(powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics, int i, kotlin.Pair pair, kotlin.Pair pair2, java.lang.String str, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = biometrics.age;
        }
        if ((i2 & 2) != 0) {
            pair = biometrics.height;
        }
        kotlin.Pair pair3 = pair;
        if ((i2 & 4) != 0) {
            pair2 = biometrics.weight;
        }
        kotlin.Pair pair4 = pair2;
        if ((i2 & 8) != 0) {
            str = biometrics.gender;
        }
        java.lang.String str2 = str;
        if ((i2 & 16) != 0) {
            languageInfo = biometrics.language;
        }
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo2 = languageInfo;
        if ((i2 & 32) != 0) {
            z = biometrics.isMetric;
        }
        return biometrics.copy(i, pair3, pair4, str2, languageInfo2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.String> component2() {
        return this.height;
    }

    public final kotlin.Pair<java.lang.Float, java.lang.String> component3() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics copy(int age, kotlin.Pair<java.lang.Integer, java.lang.String> height, kotlin.Pair<java.lang.Float, java.lang.String> weight, java.lang.String gender, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language, boolean isMetric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "height");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weight, "weight");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return new powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics(age, height, weight, gender, language, isMetric);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = (powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics) other;
        return this.age == biometrics.age && kotlin.jvm.internal.Intrinsics.areEqual(this.height, biometrics.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.weight, biometrics.weight) && kotlin.jvm.internal.Intrinsics.areEqual(this.gender, biometrics.gender) && kotlin.jvm.internal.Intrinsics.areEqual(this.language, biometrics.language) && this.isMetric == biometrics.isMetric;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.age * 31) + this.height.hashCode()) * 31) + this.weight.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.language.hashCode()) * 31;
        boolean z = this.isMetric;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public java.lang.String toString() {
        return "Biometrics(age=" + this.age + ", height=" + this.height + ", weight=" + this.weight + ", gender=" + this.gender + ", language=" + this.language + ", isMetric=" + this.isMetric + ')';
    }

    public Biometrics(int i, kotlin.Pair<java.lang.Integer, java.lang.String> height, kotlin.Pair<java.lang.Float, java.lang.String> weight, java.lang.String gender, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo language, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "height");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weight, "weight");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        this.age = i;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.language = language;
        this.isMetric = z;
    }

    public /* synthetic */ Biometrics(int i, kotlin.Pair pair, kotlin.Pair pair2, java.lang.String str, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 25 : i, (i2 & 2) != 0 ? new kotlin.Pair(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault), "cm") : pair, (i2 & 4) != 0 ? new kotlin.Pair(java.lang.Float.valueOf(80.0f), "kg") : pair2, (i2 & 8) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription() : str, (i2 & 16) != 0 ? powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo() : languageInfo, (i2 & 32) != 0 ? true : z);
    }

    public final int getAge() {
        return this.age;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.String> getHeight() {
        return this.height;
    }

    public final kotlin.Pair<java.lang.Float, java.lang.String> getWeight() {
        return this.weight;
    }

    public final java.lang.String getGender() {
        return this.gender;
    }

    public final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguage() {
        return this.language;
    }

    public final boolean isMetric() {
        return this.isMetric;
    }
}
