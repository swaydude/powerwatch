.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;
.super Ljava/lang/Object;
.source "PWLogCollectorExtension.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPWLogCollectorExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWLogCollectorExtension.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n764#3:70\n855#3:71\n2468#3,3:72\n2468#3,3:75\n856#3:78\n*S KotlinDebug\n*F\n+ 1 PWLogCollectorExtension.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl\n*L\n53#1:70\n53#1:71\n55#1:72,3\n57#1:75,3\n53#1:78\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J4\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00120\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0016J\u0008\u0010\u0017\u001a\u00020\u000fH\u0016J\u0008\u0010\u0018\u001a\u00020\u000fH\u0016R(\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;",
        "loggerOutput",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;",
        "loggerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V",
        "collectorSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
        "kotlin.jvm.PlatformType",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "clear",
        "",
        "collectedLogs",
        "Lio/reactivex/Observable;",
        "",
        "logLevels",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
        "tags",
        "",
        "destroy",
        "init",
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
.field private final collectorSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
            ">;>;"
        }
    .end annotation
.end field

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

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    .line 21
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    const-string p2, "createDefault((mutableListOf<PWLog>()))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectorSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 25
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method private static final collectedLogs$lambda-4(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private static final collectedLogs$lambda-8(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 8

    const-string v0, "pwLogs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    check-cast p2, Ljava/lang/Iterable;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 71
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    const/4 v3, 0x1

    if-eqz p0, :cond_9

    if-nez p1, :cond_1

    goto :goto_3

    .line 55
    :cond_1
    move-object v4, p0

    check-cast v4, Ljava/lang/Iterable;

    .line 72
    instance-of v5, v4, Ljava/util/Collection;

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    const/4 v4, 0x1

    goto :goto_1

    .line 73
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    .line 56
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getLogLevel()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_8

    .line 57
    move-object v4, p1

    check-cast v4, Ljava/lang/Iterable;

    .line 75
    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_6

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    const/4 v2, 0x1

    goto :goto_2

    .line 76
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 58
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    const/4 v3, 0x0

    :cond_9
    :goto_3
    if-eqz v3, :cond_0

    .line 55
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :cond_a
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getTag()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AC_Cloud"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectorSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x1b58

    if-ne v1, v2, :cond_0

    .line 36
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    const-string v1, "it"

    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectorSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final init$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$_PyQeJUcxr4HvWanJ_1EK2wpa2w(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->init$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$beb5qV0KVU2tyQTQsLvaXOZrqIk(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$cOI9pF9vR_GJraBOg8G6CoeE69M(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectedLogs$lambda-8(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$hLgJr3pvdfh9OEMFdPqQEmN58ME(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$s4VvDFHvexSz3KS55EBvUHysz0M(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectedLogs$lambda-4(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectorSubject:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public collectedLogs(Ljava/util/List;Ljava/util/List;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
            ">;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->collectorSubject:Lio/reactivex/subjects/BehaviorSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$s4VvDFHvexSz3KS55EBvUHysz0M;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$s4VvDFHvexSz3KS55EBvUHysz0M;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;

    invoke-direct {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$cOI9pF9vR_GJraBOg8G6CoeE69M;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 61
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public init()V
    .locals 4

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 31
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;->loggerOutput:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    const/4 v2, 0x0

    new-array v2, v2, [Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    invoke-interface {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;->logOutput([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$hLgJr3pvdfh9OEMFdPqQEmN58ME;

    .line 32
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    .line 33
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$beb5qV0KVU2tyQTQsLvaXOZrqIk;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$beb5qV0KVU2tyQTQsLvaXOZrqIk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtensionImpl;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$_PyQeJUcxr4HvWanJ_1EK2wpa2w;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLogCollectorExtensionImpl$_PyQeJUcxr4HvWanJ_1EK2wpa2w;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
