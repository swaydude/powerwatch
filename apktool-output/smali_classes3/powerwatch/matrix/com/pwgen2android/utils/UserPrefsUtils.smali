.class public final Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;
.super Ljava/lang/Object;
.source "UserPrefsUtils.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0008J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000eJ\r\u0010 \u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000eJ\u0016\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010%\u001a\u00020&J\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0008R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;)V",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "language",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "getLanguage",
        "()Lio/reactivex/Observable;",
        "userSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "kotlin.jvm.PlatformType",
        "defaultUnitValue",
        "",
        "convertType",
        "Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;",
        "isMetric",
        "",
        "getMetricValue",
        "Lkotlin/Pair;",
        "",
        "",
        "value",
        "",
        "type",
        "getValue",
        "isMetricsUsed",
        "user",
        "isMetricsUsedOrNull",
        "()Ljava/lang/Boolean;",
        "isTwelveHourFormatUsed",
        "maxUnitValue",
        "minUnitValue",
        "onCreate",
        "",
        "userPrefs",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;)V
    .locals 1

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 139
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 141
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    const-string v0, "create<User>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-void
.end method

.method private static final _get_language_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 4

    const-string v0, "user"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getLanguageInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 147
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 146
    :goto_0
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    if-nez v1, :cond_2

    .line 148
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getDefaultLanguageInfo()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method private static final isMetricsUsed$lambda-4(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$UYGITP34DCg6504oOpdc-bNxQKM(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed$lambda-4(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mA_UunbnD3FCvfF9uvptxOuSKiA(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->onCreate$lambda-3(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$oM2zmoipHCry81pmHtY-x5I-fvI(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->_get_language_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$unLphIhH0WP78-4ENCBHqifkDhQ(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->onCreate$lambda-2(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method private static final onCreate$lambda-2(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreate$lambda-3(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error in user prefs"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final defaultUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I
    .locals 1

    const-string v0, "convertType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/16 p1, 0x50

    goto :goto_0

    :cond_0
    const/16 p1, 0x46

    goto :goto_0

    .line 245
    :cond_1
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    const/16 p1, 0xb4

    goto :goto_0

    :cond_2
    const/16 p1, 0xc8

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 136
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguage()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
            ">;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$oM2zmoipHCry81pmHtY-x5I-fvI;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "userSubject.map { user ->\n                languageInfos.findLast {\n                    it.languageKey == user.accountSettings.language\n                } ?: defaultLanguageInfo\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            "Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 187
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/HeightConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/HeightConverter;-><init>()V

    const-string v2, " cm"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 188
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/WeightConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/WeightConverter;-><init>()V

    const-string v2, " kg"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 189
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/DistanceConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/DistanceConverter;-><init>()V

    const-string v2, " km"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 190
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, " kcal"

    if-eqz v1, :cond_3

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/CaloriesConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/CaloriesConverter;-><init>()V

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 191
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/TemperatureConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/TemperatureConverter;-><init>()V

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_4

    .line 193
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 194
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;->convertImperialToMetric(Ljava/lang/Number;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    .line 196
    :cond_4
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 191
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            "Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 171
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/HeightConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/HeightConverter;-><init>()V

    const-string v2, " cm"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 172
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/WeightConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/WeightConverter;-><init>()V

    const-string v2, " kg"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 173
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/DistanceConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/DistanceConverter;-><init>()V

    const-string v2, " km"

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 174
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, " kcal"

    if-eqz v1, :cond_3

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/CaloriesConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/CaloriesConverter;-><init>()V

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 175
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$TEMPERATURE;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lkotlin/Pair;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/TemperatureConverter;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/TemperatureConverter;-><init>()V

    invoke-direct {p2, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_4

    .line 177
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$IMPERIAL;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 178
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UnitConverter;->convertMetricToImperial(Ljava/lang/Number;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    .line 180
    :cond_4
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 175
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final isMetricsUsed()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 220
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "userSubject.map {\n        isMetricsUsed(it)\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->getType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final isMetricsUsedOrNull()Ljava/lang/Boolean;
    .locals 3

    .line 205
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object v1

    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->getType()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final isTwelveHourFormatUsed()Z
    .locals 2

    .line 216
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v0

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public final isTwelveHourFormatUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result p1

    .line 210
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final maxUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I
    .locals 2

    const-string v0, "convertType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    const/16 v1, 0x14a

    if-eqz v0, :cond_0

    if-eqz p2, :cond_2

    const/16 v1, 0x96

    goto :goto_0

    .line 231
    :cond_0
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_2

    const/16 v1, 0x10e

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :cond_2
    :goto_0
    return v1
.end method

.method public final minUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I
    .locals 1

    const-string v0, "convertType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/16 p1, 0x1d

    goto :goto_0

    :cond_0
    const/16 p1, 0x41

    goto :goto_0

    .line 259
    :cond_1
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    const/16 p1, 0x64

    goto :goto_0

    :cond_2
    const/16 p1, 0x28

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final onCreate()V
    .locals 5

    .line 153
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 154
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v1, v2, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 156
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$unLphIhH0WP78-4ENCBHqifkDhQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V

    .line 160
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$mA_UunbnD3FCvfF9uvptxOuSKiA;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$mA_UunbnD3FCvfF9uvptxOuSKiA;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V

    .line 155
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final userPrefs()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    .line 224
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
