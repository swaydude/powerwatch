.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;
.super Ljava/lang/Object;
.source "MetricsRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00172\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\"H\u0016R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "deviceEventBuilder",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "metricsService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "context",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/content/Context;)V",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "sendingSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;",
        "kotlin.jvm.PlatformType",
        "getCountryCode",
        "Lio/reactivex/Single;",
        "",
        "loadDeviceForLogging",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
        "logDevice",
        "loadUserData",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;",
        "logEvent",
        "",
        "item",
        "logOTAEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;",
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
.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceEventBuilder:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final metricsService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;

.field private final sendingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/content/Context;)V
    .locals 1

    const-string v0, "deviceEventBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceEventBuilder:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;

    .line 40
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 41
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->metricsService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;

    .line 42
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 46
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<LogEvent>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->sendingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 47
    new-instance p2, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p2}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 49
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 80
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg;

    .line 81
    invoke-virtual {p1, p3}, Lio/reactivex/subjects/PublishSubject;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 82
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$MjMqXcbUGFMZzag1q6lVxsvw40c;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$MjMqXcbUGFMZzag1q6lVxsvw40c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 115
    invoke-virtual {p1}, Lio/reactivex/Completable;->retry()Lio/reactivex/Completable;

    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lio/reactivex/Completable;->repeat()Lio/reactivex/Completable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$qh30oSQU2IUzBrwaf3HHUS7q1Gg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$qh30oSQU2IUzBrwaf3HHUS7q1Gg;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$7sTsHy_wSPedsKY12_RkLWqZfgA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$7sTsHy_wSPedsKY12_RkLWqZfgA;

    .line 117
    invoke-virtual {p1, p3, p4}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 80
    invoke-virtual {p2, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadUserData()Lio/reactivex/Single;

    move-result-object v0

    .line 84
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 89
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$dFjJ2kPpYP0uXvQohFkOv15a5I0;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$dFjJ2kPpYP0uXvQohFkOv15a5I0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 111
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fEY_0NEyksdI3MDd6zFfQd7ubkc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fEY_0NEyksdI3MDd6zFfQd7ubkc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-11()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-12(Ljava/lang/Throwable;)V
    .locals 0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final _init_$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V
    .locals 1

    .line 81
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getDeviceEventType()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;->getEventType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Received new metrics event: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private final getCountryCode()Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$tXNarlzG_pYKJgJyzsmeUBxp2tY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$tXNarlzG_pYKJgJyzsmeUBxp2tY;

    .line 53
    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "create<String> {\n//            val tm = contextWeakReference.get()?.getSystemService(TELEPHONY_SERVICE) as TelephonyManager\n//            val countryCodeValue = tm.networkCountryIso ?: \"US\"\n//            it.onSuccess(countryCodeValue)\n            it.onSuccess(TimeZone.getDefault().id)\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final getCountryCode$lambda-0(Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$7sTsHy_wSPedsKY12_RkLWqZfgA(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->_init_$lambda-12(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$DRWoPEtQhZH3mvOVEoEx-ERguYY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadUserData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MjMqXcbUGFMZzag1q6lVxsvw40c(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->_init_$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$SblnsUdaHp7_biJeKHHDUG1MUZs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadDeviceForLogging$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WuViSgV5y2ZqDliY4XBsaQLcKBg(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->_init_$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    return-void
.end method

.method public static synthetic lambda$dFjJ2kPpYP0uXvQohFkOv15a5I0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda-10$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fEY_0NEyksdI3MDd6zFfQd7ubkc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fPCwPg28U62znV_uAaHGcDDo1uo(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda-10$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mTnsw4JYaomGNnu4nxdyOoUNSH0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadUserData$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pR759A8GZ3TpNSR2GT8d8nYhzjc(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadDeviceForLogging$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qh30oSQU2IUzBrwaf3HHUS7q1Gg()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->_init_$lambda-11()V

    return-void
.end method

.method public static synthetic lambda$rLf9vOkJavCSKcl_mxeDgudfw0E(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda-10$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tXNarlzG_pYKJgJyzsmeUBxp2tY(Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->getCountryCode$lambda-0(Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method private static final lambda-10$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getLogDevice()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    move-result-object p1

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->loadDeviceForLogging(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lio/reactivex/Single;

    move-result-object p0

    .line 86
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final lambda-10$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$userData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-10$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$item"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "userData"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    instance-of v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;

    const-string v4, "id"

    if-eqz v2, :cond_0

    .line 92
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getDeviceEventType()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    move-result-object v6

    .line 93
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;->getDeviceId()Ljava/lang/String;

    move-result-object v9

    .line 94
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v10

    .line 95
    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->getFirmwareVersionFrom()Ljava/lang/String;

    move-result-object v11

    .line 96
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->getFirmwareVersionTo()Ljava/lang/String;

    move-result-object v12

    .line 97
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v13

    .line 98
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;->getCountry()Ljava/lang/String;

    move-result-object v14

    .line 99
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;->getEmail()Ljava/lang/String;

    move-result-object v8

    .line 100
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getEventStatus()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    move-result-object v7

    .line 92
    iget-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceEventBuilder:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;

    .line 97
    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v15, 0x0

    const/16 v17, 0x200

    const/16 v18, 0x0

    .line 92
    invoke-static/range {v5 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->createDeviceOTAEvent$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getDeviceEventType()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    move-result-object v2

    .line 103
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;->getDeviceId()Ljava/lang/String;

    move-result-object v5

    .line 104
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v6

    .line 105
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v7

    .line 106
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;->getCountry()Ljava/lang/String;

    move-result-object v8

    .line 107
    invoke-virtual/range {p2 .. p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;->getEmail()Ljava/lang/String;

    move-result-object v9

    .line 108
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->getEventStatus()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    move-result-object v3

    .line 102
    iget-object v1, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceEventBuilder:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;

    .line 105
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v10, 0x0

    const/16 v0, 0x80

    const/4 v12, 0x0

    move-object v4, v9

    move-wide v9, v10

    move v11, v0

    .line 102
    invoke-static/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->createEvent$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private static final lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->metricsService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService$DefaultImpls;->add$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private final loadDeviceForLogging(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
            ">;"
        }
    .end annotation

    .line 70
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "defer<LogDevice> {\n            if (logDevice == null) {\n                if (deviceRepository.isEmpty()) Single.just(LogDevice(\"\", \"\"))\n                else deviceRepository.defaultDevice()\n                        .map { LogDevice(it.bluetoothAddress, it.firmwareVersion) }\n            } else Single.just(logDevice)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final loadDeviceForLogging$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_1

    .line 72
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    const-string p1, ""

    invoke-direct {p0, p1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    goto :goto_0

    .line 73
    :cond_0
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->defaultDevice()Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;

    .line 74
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    goto :goto_0

    .line 75
    :cond_1
    invoke-static {p0}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final loadDeviceForLogging$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final loadUserData()Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 64
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "userAccountRepository.getFirst()\n                .flatMap {user ->\n                    getCountryCode().map { UserData(user.email, it) }\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final loadUserData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->getCountryCode()Lio/reactivex/Single;

    move-result-object p0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final loadUserData$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;
    .locals 1

    const-string v0, "$user"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 38
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V
    .locals 0

    # PATCHED: bypass metrics reporting - return immediately
    return-void
.end method

.method public logOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;)V
    .locals 0

    # PATCHED: bypass metrics reporting - return immediately
    return-void
.end method
