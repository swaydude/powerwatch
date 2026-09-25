package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: LanguageController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "", "languageKey", "", "languageDisplay", "", "locale", "Ljava/util/Locale;", "userManual", "(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V", "getLanguageDisplay", "()I", "getLanguageKey", "()Ljava/lang/String;", "getLocale", "()Ljava/util/Locale;", "getUserManual", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LanguageInfo {
    private final int languageDisplay;
    private final java.lang.String languageKey;
    private final java.util.Locale locale;
    private final java.lang.String userManual;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.utils.LanguageInfo copy$default(powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo, java.lang.String str, int i, java.util.Locale locale, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = languageInfo.languageKey;
        }
        if ((i2 & 2) != 0) {
            i = languageInfo.languageDisplay;
        }
        if ((i2 & 4) != 0) {
            locale = languageInfo.locale;
        }
        if ((i2 & 8) != 0) {
            str2 = languageInfo.userManual;
        }
        return languageInfo.copy(str, i, locale, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getLanguageKey() {
        return this.languageKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLanguageDisplay() {
        return this.languageDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getUserManual() {
        return this.userManual;
    }

    public final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo copy(java.lang.String languageKey, int languageDisplay, java.util.Locale locale, java.lang.String userManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        return new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo(languageKey, languageDisplay, locale, userManual);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.utils.LanguageInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.languageKey, languageInfo.languageKey) && this.languageDisplay == languageInfo.languageDisplay && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, languageInfo.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.userManual, languageInfo.userManual);
    }

    public int hashCode() {
        int iHashCode = ((((this.languageKey.hashCode() * 31) + this.languageDisplay) * 31) + this.locale.hashCode()) * 31;
        java.lang.String str = this.userManual;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "LanguageInfo(languageKey=" + this.languageKey + ", languageDisplay=" + this.languageDisplay + ", locale=" + this.locale + ", userManual=" + ((java.lang.Object) this.userManual) + ')';
    }

    public LanguageInfo(java.lang.String languageKey, int i, java.util.Locale locale, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        this.languageKey = languageKey;
        this.languageDisplay = i;
        this.locale = locale;
        this.userManual = str;
    }

    public final int getLanguageDisplay() {
        return this.languageDisplay;
    }

    public final java.lang.String getLanguageKey() {
        return this.languageKey;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.lang.String getUserManual() {
        return this.userManual;
    }
}
