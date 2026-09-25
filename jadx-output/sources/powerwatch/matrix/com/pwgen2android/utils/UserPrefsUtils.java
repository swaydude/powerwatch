package powerwatch.matrix.com.pwgen2android.utils;

/* JADX INFO: compiled from: UserPrefsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\bJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000eJ\r\u0010 \u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000eJ\u0016\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010%\u001a\u00020&J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "language", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;", "getLanguage", "()Lio/reactivex/Observable;", "userSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "kotlin.jvm.PlatformType", "defaultUnitValue", "", "convertType", "Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;", "isMetric", "", "getMetricValue", "Lkotlin/Pair;", "", "", "value", "", "type", "getValue", "isMetricsUsed", "user", "isMetricsUsedOrNull", "()Ljava/lang/Boolean;", "isTwelveHourFormatUsed", "maxUnitValue", "minUnitValue", "onCreate", "", "userPrefs", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserPrefsUtils implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.data.models.User> userSubject;

    public UserPrefsUtils(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        this.userAccountRepository = userAccountRepository;
        this.disposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.data.models.User> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<User>()");
        this.userSubject = behaviorSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> getLanguage() {
        io.reactivex.Observable map = this.userSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.m3648_get_language_$lambda1((powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "userSubject.map { user ->\n                languageInfos.findLast {\n                    it.languageKey == user.accountSettings.language\n                } ?: defaultLanguageInfo\n            }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_language_$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.utils.LanguageInfo m3648_get_language_$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> languageInfos = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getLanguageInfos();
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = languageInfos.listIterator(languageInfos.size());
        do {
            if (!listIterator.hasPrevious()) {
                languageInfoPrevious = null;
                break;
            }
            languageInfoPrevious = listIterator.previous();
        } while (!kotlin.jvm.internal.Intrinsics.areEqual(languageInfoPrevious.getLanguageKey(), user.getAccountSettings().getLanguage()));
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = languageInfoPrevious;
        return languageInfo == null ? powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo() : languageInfo;
    }

    public final void onCreate() {
        this.disposable.clear();
        this.disposable.add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.userAccountRepository, false, false, 3, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.m3653onCreate$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$UserPrefsUtils$mA_UunbnD3FCvfF9uvptxOuSKiA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.m3654onCreate$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m3653onCreate$lambda2(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userSubject.onNext(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-3, reason: not valid java name */
    public static final void m3654onCreate$lambda3(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error in user prefs", th, null, 4, null);
    }

    public final kotlin.Pair<java.lang.Float, java.lang.String> getValue(java.lang.Number value, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType type) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User value2 = this.userSubject.getValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.HeightConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.WeightConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.DistanceConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricDistanceUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.CALORIES.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.CaloriesConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.TemperatureConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit);
        }
        if (value2 != null && kotlin.jvm.internal.Intrinsics.areEqual(value2.getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.IMPERIAL.INSTANCE.getType())) {
            return ((powerwatch.matrix.com.pwgen2android.utils.UnitConverter) pair.getFirst()).convertMetricToImperial(value);
        }
        return new kotlin.Pair<>(java.lang.Float.valueOf(value.floatValue()), pair.getSecond());
    }

    public final kotlin.Pair<java.lang.Float, java.lang.String> getMetricValue(java.lang.Number value, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType type) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        powerwatch.matrix.com.pwgen2android.shared.data.models.User value2 = this.userSubject.getValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.HeightConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.WeightConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.DistanceConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricDistanceUnit);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.CALORIES.INSTANCE)) {
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.CaloriesConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = new kotlin.Pair(new powerwatch.matrix.com.pwgen2android.utils.TemperatureConverter(), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit);
        }
        if (value2 != null && kotlin.jvm.internal.Intrinsics.areEqual(value2.getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.IMPERIAL.INSTANCE.getType())) {
            return ((powerwatch.matrix.com.pwgen2android.utils.UnitConverter) pair.getFirst()).convertImperialToMetric(value);
        }
        return new kotlin.Pair<>(java.lang.Float.valueOf(value.floatValue()), pair.getSecond());
    }

    public final boolean isMetricsUsed(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return kotlin.text.StringsKt.equals(user.getAccountSettings().getUnitType(), powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType(), true);
    }

    public final java.lang.Boolean isMetricsUsedOrNull() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User value = this.userSubject.getValue();
        java.lang.String unitType = null;
        if (value != null && (accountSettings = value.getAccountSettings()) != null) {
            unitType = accountSettings.getUnitType();
        }
        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.equals(unitType, powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE.getType(), true));
    }

    public final boolean isTwelveHourFormatUsed(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return user.getAccountSettings().getTimeFormatType() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat();
    }

    public final boolean isTwelveHourFormatUsed() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User value = this.userSubject.getValue();
        java.lang.Integer numValueOf = null;
        if (value != null && (accountSettings = value.getAccountSettings()) != null) {
            numValueOf = java.lang.Integer.valueOf(accountSettings.getTimeFormatType());
        }
        return numValueOf != null && numValueOf.intValue() == powerwatch.matrix.com.pwgen2android.shared.data.models.HourFormat.Twelve.INSTANCE.getFormat();
    }

    public final io.reactivex.Observable<java.lang.Boolean> isMetricsUsed() {
        io.reactivex.Observable map = this.userSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.utils.-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils.m3649isMetricsUsed$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "userSubject.map {\n        isMetricsUsed(it)\n    }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isMetricsUsed$lambda-4, reason: not valid java name */
    public static final java.lang.Boolean m3649isMetricsUsed$lambda4(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Boolean.valueOf(this$0.isMetricsUsed(it));
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> userPrefs() {
        return this.userSubject;
    }

    public final int maxUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType convertType, boolean isMetric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertType, "convertType");
        if (convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT) {
            if (isMetric) {
                return powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax;
            }
            return 330;
        }
        if (!(convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT)) {
            return -1;
        }
        if (isMetric) {
            return powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightMax;
        }
        return 330;
    }

    public final int defaultUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType convertType, boolean isMetric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertType, "convertType");
        if (convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT) {
            return isMetric ? 80 : 70;
        }
        if (!(convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT)) {
            return -1;
        }
        if (isMetric) {
            return powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault;
        }
        return 200;
    }

    public final int minUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType convertType, boolean isMetric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertType, "convertType");
        if (convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT) {
            return isMetric ? 29 : 65;
        }
        if (convertType instanceof powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT) {
            return isMetric ? 100 : 40;
        }
        return -1;
    }
}
