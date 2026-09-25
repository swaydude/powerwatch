.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;
.super Ljava/lang/Object;
.source "PWLoggerConsoleExtension.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;",
        "loggerOutput",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;",
        "loggerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "destroy",
        "",
        "init",
        "listenFor",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
        "level",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
        "logDebug",
        "log",
        "logError",
        "logInfo",
        "logWTF",
        "logWarn",
        "prepareMessage",
        "",
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

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    .line 16
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    .line 18
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method private static final init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->logDebug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method private static final init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->logInfo(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method private static final init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->logWarn(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method private static final init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->logError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method private static final init$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->logWTF(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$K0XtshuouRBhcXtesDda1nPeofY(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$NzHFj4eM31xzX_JZqRI45nAKi7w(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$Xu4Ma1x707kizzv6KV_h2RlCEgY(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->init$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$eiqs7eiLp2SHQll3GHj6r_YlBG8(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$uA2oz73pfwB-dfao4_0JC1f7Jts(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$wYLOVnbby9Aa6nG1g3I8srGxz8s(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p0

    return p0
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

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    const/4 v1, 0x1

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;->logOutput([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$wYLOVnbby9Aa6nG1g3I8srGxz8s;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$wYLOVnbby9Aa6nG1g3I8srGxz8s;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "loggerOutput.logOutput(level).filter { it.tag != CloudInterceptLogger.CloudTag }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final listenFor$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AC_Cloud"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final logDebug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PWLogger"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final logError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PWLogger"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final logInfo(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PWLogger"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final logWTF(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 65
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PWLogger"

    invoke-static {v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final logWarn(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    .line 61
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PWLogger"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final prepareMessage(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Ljava/lang/String;
    .locals 3

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTimestamp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getLogLevel()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;->getLevelTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "***********************"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "***********************\n"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n**********************************************"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public init()V
    .locals 3

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    # --- OFFLINE PATCH: was `return-void` (console logging disabled in PROD), which made the
    # --- app's pairing/BLE internals invisible in logcat. Now fall through so PWLogger emits
    # --- to logcat in every environment, letting us observe the offline pairing flow.
    goto :cond_0

    .line 22
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 23
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$NzHFj4eM31xzX_JZqRI45nAKi7w;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$NzHFj4eM31xzX_JZqRI45nAKi7w;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 27
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$K0XtshuouRBhcXtesDda1nPeofY;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$K0XtshuouRBhcXtesDda1nPeofY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 31
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$eiqs7eiLp2SHQll3GHj6r_YlBG8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$eiqs7eiLp2SHQll3GHj6r_YlBG8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 35
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$uA2oz73pfwB-dfao4_0JC1f7Jts;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$uA2oz73pfwB-dfao4_0JC1f7Jts;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 39
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;->listenFor(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$Xu4Ma1x707kizzv6KV_h2RlCEgY;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerConsoleExtensionImpl$Xu4Ma1x707kizzv6KV_h2RlCEgY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
