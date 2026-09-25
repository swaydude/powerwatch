package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: LanguageController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "appContext", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;)V", "getAppLanguage", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "context", "getLanguage", "languageKey", "", "getLanguageByKey", "getLanguageByResourceID", "languageID", "", "getLocales", "", "initSetLanguage", "", "saveAppLanguage", "languageInfo", "updateResources", "locale", "Ljava/util/Locale;", "updateResourcesLegacy", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LanguageControllerImpl implements powerwatch.matrix.com.pwgen2android.utils.LanguageController {
    private static final java.lang.String APP_LANGUAGE = "com.matrix.powerwatch.APP_LANGUAGE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion(null);
    private static final java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> languageInfos = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo[]{new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("en", powerwatch.matrix.com.pwgen2android.R.string.english_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English.INSTANCE.getLocale(), powerwatch.matrix.com.pwgen2android.utils.LanguageControllerKt.defaultLanguageUserManual), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("fr", powerwatch.matrix.com.pwgen2android.R.string.french_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.French.INSTANCE.getLocale(), "gen2_manual_fr.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("de", powerwatch.matrix.com.pwgen2android.R.string.deutch_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.German.INSTANCE.getLocale(), "gen2_manual_de.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("ko", powerwatch.matrix.com.pwgen2android.R.string.korea_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Korean.INSTANCE.getLocale(), "gen2_manual_ko.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("ja", powerwatch.matrix.com.pwgen2android.R.string.japanese_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Japanese.INSTANCE.getLocale(), "gen2_manual_ja.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("it", powerwatch.matrix.com.pwgen2android.R.string.italy_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Italian.INSTANCE.getLocale(), "gen2_manual_it.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("pt", powerwatch.matrix.com.pwgen2android.R.string.portugues_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Portugal.INSTANCE.getLocale(), "gen2_manual_pt.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("es", powerwatch.matrix.com.pwgen2android.R.string.spanish_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Spanish.INSTANCE.getLocale(), "gen2_manual_es.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("zh_CN", powerwatch.matrix.com.pwgen2android.R.string.simplified_chinese_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese.INSTANCE.getLocale(), "gen2_manual_zh_CN.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("zh_TW", powerwatch.matrix.com.pwgen2android.R.string.traditional_chinese_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese.INSTANCE.getLocale(), "gen2_manual_zh_TW.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("ru", powerwatch.matrix.com.pwgen2android.R.string.russian_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Russian.INSTANCE.getLocale(), "gen2_manual_ru.pdf"), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("cs", powerwatch.matrix.com.pwgen2android.R.string.czech_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Czech.INSTANCE.getLocale(), null), new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("pl", powerwatch.matrix.com.pwgen2android.R.string.polish_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Polish.INSTANCE.getLocale(), null)});
    private static final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo defaultLanguageInfo = new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("en", powerwatch.matrix.com.pwgen2android.R.string.english_language, powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English.INSTANCE.getLocale(), powerwatch.matrix.com.pwgen2android.utils.LanguageControllerKt.defaultLanguageUserManual);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m3647_init_$lambda2(java.lang.Throwable th) {
    }

    public LanguageControllerImpl(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, final android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        userPrefsUtils.onCreate();
        userPrefsUtils.getLanguage().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$LanguageControllerImpl$NCKtBXX_VO4mYt2DmpcJjJxTGAk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.m3646_init_$lambda1(this.f$0, appContext, (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$LanguageControllerImpl$6_W_lE1XT6Ni8hGxLl9Q6osl68M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.m3647_init_$lambda2((java.lang.Throwable) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguageByKey(java.lang.String languageKey) {
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> list = languageInfos;
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                languageInfoPrevious = null;
                break;
            }
            languageInfoPrevious = listIterator.previous();
        } while (!kotlin.jvm.internal.Intrinsics.areEqual(languageInfoPrevious.getLanguageKey(), languageKey));
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = languageInfoPrevious;
        return languageInfo == null ? defaultLanguageInfo : languageInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m3646_init_$lambda1(powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl this$0, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.utils.LanguageInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "$appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.saveAppLanguage(it, appContext);
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public void initSetLanguage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo appLanguage = getAppLanguage(context);
        java.util.Locale locale = new java.util.Locale(appLanguage.getLocale().getLanguage(), appLanguage.getLocale().getCountry());
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            updateResources(context, locale);
        }
        updateResourcesLegacy(context, locale);
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> getLocales() {
        return languageInfos;
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguage(java.lang.String languageKey) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageKey, "languageKey");
        java.util.Iterator<T> it = languageInfos.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next).getLanguageKey(), languageKey)) {
                return (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next;
            }
        }
        next = null;
        return (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next;
    }

    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getLanguageByResourceID(int languageID) {
        java.lang.Object next;
        java.util.Iterator<T> it = languageInfos.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next).getLanguageDisplay() == languageID) {
                return (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next;
            }
        }
        next = null;
        return (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) next;
    }

    private final void saveAppLanguage(powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo, android.content.Context context) {
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(APP_LANGUAGE, languageInfo.getLanguageKey()).apply();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    @Override // powerwatch.matrix.com.pwgen2android.utils.LanguageController
    public powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getAppLanguage(android.content.Context context) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String string = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(APP_LANGUAGE, java.util.Locale.getDefault().getLanguage());
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        java.lang.String language = locale.getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "systemLang.language");
        java.lang.Object obj = null;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) language, (java.lang.CharSequence) "zh", false, 2, (java.lang.Object) null) && kotlin.jvm.internal.Intrinsics.areEqual(string, java.util.Locale.getDefault().getLanguage())) {
            java.lang.String country = locale.getCountry();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "systemLang.country");
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) country, (java.lang.CharSequence) "hk", true)) {
                z = false;
            } else {
                java.lang.String country2 = locale.getCountry();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country2, "systemLang.country");
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) country2, (java.lang.CharSequence) "tw", true)) {
                    z = false;
                } else {
                    java.lang.String country3 = locale.getCountry();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country3, "systemLang.country");
                    if (kotlin.text.StringsKt.contains((java.lang.CharSequence) country3, (java.lang.CharSequence) "mo", true)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
            java.lang.String script = locale.getScript();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(script, "systemLang.script");
            boolean z2 = kotlin.text.StringsKt.contains((java.lang.CharSequence) script, (java.lang.CharSequence) "hant", true) ? false : z;
            java.lang.String script2 = locale.getScript();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(script2, "systemLang.script");
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) script2, (java.lang.CharSequence) "hans", true) ? true : z2) {
                for (java.lang.Object obj2 : languageInfos) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj2).getLanguageKey(), "zh_CN")) {
                        obj = obj2;
                        break;
                    }
                }
                powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNull(languageInfo);
                return languageInfo;
            }
            for (java.lang.Object obj3 : languageInfos) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj3).getLanguageKey(), "zh_TW")) {
                    obj = obj3;
                    break;
                }
            }
            powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo2 = (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNull(languageInfo2);
            return languageInfo2;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> list = languageInfos;
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious = listIterator.previous();
            if (kotlin.jvm.internal.Intrinsics.areEqual(languageInfoPrevious.getLanguageKey(), string)) {
                obj = languageInfoPrevious;
                break;
            }
        }
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo3 = (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo) obj;
        return languageInfo3 == null ? new powerwatch.matrix.com.pwgen2android.utils.LanguageInfo("en", powerwatch.matrix.com.pwgen2android.R.string.english_language, new java.util.Locale("en"), powerwatch.matrix.com.pwgen2android.utils.LanguageControllerKt.defaultLanguageUserManual) : languageInfo3;
    }

    private final android.content.Context updateResources(android.content.Context context, java.util.Locale locale) {
        java.util.Locale.setDefault(locale);
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        android.content.Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "context.createConfigurationContext(configuration)");
        return contextCreateConfigurationContext;
    }

    private final android.content.Context updateResourcesLegacy(android.content.Context context, java.util.Locale locale) {
        java.util.Locale.setDefault(locale);
        android.content.res.Resources resources = context.getResources();
        android.content.res.Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }

    /* JADX INFO: compiled from: LanguageController.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;", "", "()V", "APP_LANGUAGE", "", "defaultLanguageInfo", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "getDefaultLanguageInfo", "()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "languageInfos", "", "getLanguageInfos", "()Ljava/util/List;", "LanguageLocale", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: compiled from: LanguageController.kt */
        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "getLocale", "()Ljava/util/Locale;", "Czech", "English", "French", "German", "Italian", "Japanese", "Korean", "Polish", "Portugal", "Russian", "SimplifiedChinese", "Spanish", "TraditionalChinese", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static abstract class LanguageLocale {
            private final java.util.Locale locale;

            public /* synthetic */ LanguageLocale(java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(locale);
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class English extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.English();

                private English() {
                    super(new java.util.Locale("en", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            private LanguageLocale(java.util.Locale locale) {
                this.locale = locale;
            }

            public final java.util.Locale getLocale() {
                return this.locale;
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class French extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.French INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.French();

                private French() {
                    super(new java.util.Locale("fr", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class German extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.German INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.German();

                private German() {
                    super(new java.util.Locale("de", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Japanese extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Japanese INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Japanese();

                private Japanese() {
                    super(new java.util.Locale("ja", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Korean extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Korean INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Korean();

                private Korean() {
                    super(new java.util.Locale("ko", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class SimplifiedChinese extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.SimplifiedChinese();

                /* JADX WARN: Illegal instructions before constructor call */
                private SimplifiedChinese() {
                    java.util.Locale SIMPLIFIED_CHINESE = java.util.Locale.SIMPLIFIED_CHINESE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(SIMPLIFIED_CHINESE, "SIMPLIFIED_CHINESE");
                    super(SIMPLIFIED_CHINESE, null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class TraditionalChinese extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.TraditionalChinese();

                /* JADX WARN: Illegal instructions before constructor call */
                private TraditionalChinese() {
                    java.util.Locale TRADITIONAL_CHINESE = java.util.Locale.TRADITIONAL_CHINESE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TRADITIONAL_CHINESE, "TRADITIONAL_CHINESE");
                    super(TRADITIONAL_CHINESE, null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Italian extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Italian INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Italian();

                private Italian() {
                    super(new java.util.Locale("it", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Spanish extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Spanish INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Spanish();

                private Spanish() {
                    super(new java.util.Locale("es", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Portugal extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Portugal INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Portugal();

                private Portugal() {
                    super(new java.util.Locale("pt", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Russian extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Russian INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Russian();

                private Russian() {
                    super(new java.util.Locale("ru", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Czech extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Czech INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Czech();

                private Czech() {
                    super(new java.util.Locale("cs", java.util.Locale.getDefault().getCountry()), null);
                }
            }

            /* JADX INFO: compiled from: LanguageController.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class Polish extends powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale {
                public static final powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Polish INSTANCE = new powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.Companion.LanguageLocale.Polish();

                private Polish() {
                    super(new java.util.Locale("pl", java.util.Locale.getDefault().getCountry()), null);
                }
            }
        }

        public final java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> getLanguageInfos() {
            return powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.languageInfos;
        }

        public final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo getDefaultLanguageInfo() {
            return powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.defaultLanguageInfo;
        }
    }
}
