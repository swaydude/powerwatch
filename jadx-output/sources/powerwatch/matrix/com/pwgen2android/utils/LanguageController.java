package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: LanguageController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "", "getAppLanguage", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "context", "Landroid/content/Context;", "getLanguage", "languageKey", "", "getLanguageByKey", "getLanguageByResourceID", "languageID", "", "getLocales", "", "initSetLanguage", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LanguageController {
    powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getAppLanguage(android.content.Context context);

    powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguage(java.lang.String languageKey);

    powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguageByKey(java.lang.String languageKey);

    powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguageByResourceID(int languageID);

    java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> getLocales();

    void initSetLanguage(android.content.Context context);
}
