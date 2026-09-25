.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;
.super Ljava/lang/Object;
.source "BugfenderLoggerExtenstion.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtension;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtension;",
        "loggerOutput",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;",
        "loggerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "init",
        "",
        "listenFor",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
        "level",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
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
.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

.field private final loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V
    .locals 1

    const-string v0, "loggerOutput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loggerConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    .line 15
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    .line 17
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method private static final init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/Bugfender;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/Bugfender;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/Bugfender;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final init$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/Bugfender;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final init$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/Bugfender;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$a5gJpez-nSv5IcFmYQWwfuAt3us(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->init$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$h4liNCtCesdd9G25S_dN_rJINjM(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$jqeHEp6yAiV5CJ5Aq2vPRxN6Rs0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$kZ8DDGQvbZmA3hdzwOctkoSRR4I(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->init$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$xJADfxGHBcwUk8E3MORNPJj4bfo(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$xvoT60D0NdjYwesRROu_08XTygQ(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method private final listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    const/4 v1, 0x1

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;->logOutput([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$h4liNCtCesdd9G25S_dN_rJINjM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$h4liNCtCesdd9G25S_dN_rJINjM;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "loggerOutput.logOutput(level).filter { it.tag != INTERNAL_TAG }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final listenFor$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->getINTERNAL_TAG()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public init()V
    .locals 5

    .line 24
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x6

    new-array v2, v1, [Ljava/lang/Object;

    .line 25
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    const-string v4, "1.5.6"

    aput-object v4, v2, v3

    const/16 v3, 0xc5

    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 28
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 29
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const/4 v4, 0x4

    aput-object v3, v2, v4

    .line 30
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const/4 v4, 0x5

    aput-object v3, v2, v4

    .line 24
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Manufacturer: %s, Android: %s (%s); %s,OS: %s, %s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.lang.String.format(locale, format, *args)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "DEVICE_INFO"

    .line 32
    invoke-static {v1, v0}, Lcom/bugfender/sdk/Bugfender;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 34
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$xJADfxGHBcwUk8E3MORNPJj4bfo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$xJADfxGHBcwUk8E3MORNPJj4bfo;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 38
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$jqeHEp6yAiV5CJ5Aq2vPRxN6Rs0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$jqeHEp6yAiV5CJ5Aq2vPRxN6Rs0;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 42
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$xvoT60D0NdjYwesRROu_08XTygQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$xvoT60D0NdjYwesRROu_08XTygQ;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 46
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$kZ8DDGQvbZmA3hdzwOctkoSRR4I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$kZ8DDGQvbZmA3hdzwOctkoSRR4I;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 50
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$a5gJpez-nSv5IcFmYQWwfuAt3us;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$BugfenderLoggerExtensionImpl$a5gJpez-nSv5IcFmYQWwfuAt3us;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
