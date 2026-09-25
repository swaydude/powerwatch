package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;", "", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getLocale", "()Ljava/util/Locale;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LanguageInfoData {
    private final java.util.Locale locale;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData languageInfoData, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = languageInfoData.locale;
        }
        return languageInfoData.copy(locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData copy(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData(locale);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, ((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LanguageInfoData) other).locale);
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public java.lang.String toString() {
        return "LanguageInfoData(locale=" + this.locale + ')';
    }

    public LanguageInfoData(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        this.locale = locale;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }
}
