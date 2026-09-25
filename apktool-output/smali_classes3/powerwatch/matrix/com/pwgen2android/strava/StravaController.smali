.class public final Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;
.super Ljava/lang/Object;
.source "StravaController.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStravaController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaController.kt\npowerwatch/matrix/com/pwgen2android/strava/StravaController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1547#2:196\n1618#2,3:197\n764#2:200\n855#2,2:201\n3318#2,10:203\n1798#2,4:213\n1895#2,14:217\n1547#2:231\n1618#2,3:232\n1547#2:235\n1618#2,3:236\n*S KotlinDebug\n*F\n+ 1 StravaController.kt\npowerwatch/matrix/com/pwgen2android/strava/StravaController\n*L\n131#1:196\n131#1:197,3\n138#1:200\n138#1:201,2\n138#1:203,10\n143#1:213,4\n150#1:217,14\n151#1:231\n151#1:232,3\n173#1:235\n173#1:236,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u000bJ\u0010\u0010\'\u001a\u00020\u000b2\u0008\u0010(\u001a\u0004\u0018\u00010)J\u0012\u0010*\u001a\u0004\u0018\u00010%2\u0008\u0010(\u001a\u0004\u0018\u00010)J\u0006\u0010+\u001a\u00020!J\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000b0-J\u0014\u0010.\u001a\u00020!2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001c\u00100\u001a\u0008\u0012\u0004\u0012\u0002010-2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u001c\u00102\u001a\u0008\u0012\u0004\u0012\u0002010-2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001f \u000c*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "appContext",
        "Landroid/content/Context;",
        "stravaCloud",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;)V",
        "authScope",
        "",
        "authSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "clientID",
        "clientSecret",
        "code",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "readScope",
        "scheduler",
        "Lio/reactivex/Scheduler;",
        "scopeKey",
        "stravaLinkHost",
        "stravaLinkScheme",
        "tcxWriter",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;",
        "writer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;",
        "writingSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "authorize",
        "",
        "activityContext",
        "getAccessAndRefreshToken",
        "authInfo",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;",
        "hasAuthorize",
        "isValidIntent",
        "intent",
        "Landroid/content/Intent;",
        "parseIntent",
        "revoke",
        "subscribeToAuthorize",
        "Lio/reactivex/Observable;",
        "writeSessionList",
        "sessionList",
        "writeToGPXFormat",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
        "writeToTCXFormat",
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
.field private final authScope:Ljava/lang/String;

.field private final authSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final clientID:Ljava/lang/String;

.field private final clientSecret:Ljava/lang/String;

.field private final code:Ljava/lang/String;

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final readScope:Ljava/lang/String;

.field private final scheduler:Lio/reactivex/Scheduler;

.field private final scopeKey:Ljava/lang/String;

.field private final stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

.field private final stravaLinkHost:Ljava/lang/String;

.field private final stravaLinkScheme:Ljava/lang/String;

.field private final tcxWriter:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;

.field private final writer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;

.field private final writingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;)V
    .locals 4

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaCloud"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->tcxWriter:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;

    const v0, 0x7f0f01a2

    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "appContext.getString(R.string.strava_link_host)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaLinkHost:Ljava/lang/String;

    const v0, 0x7f0f01a3

    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "appContext.getString(R.string.strava_link_scheme)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaLinkScheme:Ljava/lang/String;

    const v0, 0x7f0f0074

    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "appContext.getString(R.string.client_id)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientID:Ljava/lang/String;

    const v0, 0x7f0f0075

    .line 37
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "appContext.getString(R.string.client_secret)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientSecret:Ljava/lang/String;

    const-string p1, "activity:write"

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authScope:Ljava/lang/String;

    const-string p1, "read"

    .line 39
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->readScope:Ljava/lang/String;

    const-string p1, "scope"

    .line 41
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->scopeKey:Ljava/lang/String;

    const-string p1, "code"

    .line 42
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->code:Ljava/lang/String;

    .line 44
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    const/4 v0, 0x0

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "createDefault(false)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 46
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v1

    const-string v2, "create<List<UserActivitySession>>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 47
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-static {v2}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object v2

    const-string v3, "from(Executors.newSingleThreadExecutor())"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->scheduler:Lio/reactivex/Scheduler;

    .line 50
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->hasToken()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 53
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$mjViwjeUVGnlf31tMukJmobZY5w;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$mjViwjeUVGnlf31tMukJmobZY5w;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {v1, p2}, Lio/reactivex/subjects/PublishSubject;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p2

    .line 65
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$SdTBR-jxECRpQ-C12cK7rs1zKE8;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$SdTBR-jxECRpQ-C12cK7rs1zKE8;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p2

    .line 66
    invoke-virtual {p2, v2}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p2

    .line 67
    invoke-virtual {p2}, Lio/reactivex/Completable;->repeat()Lio/reactivex/Completable;

    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lio/reactivex/Completable;->retry()Lio/reactivex/Completable;

    move-result-object p2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$AV8gZzBXIuq5fFKuDQ0VnF5M5d4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$AV8gZzBXIuq5fFKuDQ0VnF5M5d4;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$QGun7feqIA9QPJyo68op511R2ic;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$QGun7feqIA9QPJyo68op511R2ic;

    .line 69
    invoke-virtual {p2, v0, v1}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->hasToken()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToTCXFormat(Ljava/util/List;)Lio/reactivex/Observable;

    move-result-object p1

    .line 56
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 60
    :cond_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$sk3f_M5cqTBxCBUpVGd2eQSQTSU;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$sk3f_M5cqTBxCBUpVGd2eQSQTSU;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final _init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Error in Strava activity processing: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-4()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-5(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final getAccessAndRefreshToken$lambda-6(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Auth success : "

    .line 107
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 108
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final getAccessAndRefreshToken$lambda-7(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static synthetic lambda$7PJ0Vq1hmVoXRtwTrZZNeaySkwY(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AV8gZzBXIuq5fFKuDQ0VnF5M5d4()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->_init_$lambda-4()V

    return-void
.end method

.method public static synthetic lambda$EMESRixU8wL4kjIPGgBCGOvW7qk(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->revoke$lambda-8(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    return-void
.end method

.method public static synthetic lambda$GRwMoyxg--fZSPlAm0NKiK7nOm4(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToTCXFormat$lambda-17(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V

    return-void
.end method

.method public static synthetic lambda$QGun7feqIA9QPJyo68op511R2ic(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->_init_$lambda-5(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$RwiuBVmMa58KhdAws81N-6Eytxk(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->getAccessAndRefreshToken$lambda-7(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$SdTBR-jxECRpQ-C12cK7rs1zKE8(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->_init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$TomZ35RRToRndSari1h11aMEEj0(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->getAccessAndRefreshToken$lambda-6(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V

    return-void
.end method

.method public static synthetic lambda$ej2p704HLr7hg8TJWKkCKLtEOkg(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToGPXFormat$lambda-20(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$iKiXNrZtq-A622WM3_T4bNE5kX4(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToGPXFormat$lambda-21(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V

    return-void
.end method

.method public static synthetic lambda$mjViwjeUVGnlf31tMukJmobZY5w(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->_init_$lambda-2(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$n2kjZVQFb2X2CaM3BOJaPCMcdsM(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToTCXFormat$lambda-18(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$r6UoTp7GNca2ACYHZU5_pl_i3qc(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writeToTCXFormat$lambda-16(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rFWyHneauqIC-2Dja4-2R37-Xds(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->revoke$lambda-9(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sk3f_M5cqTBxCBUpVGd2eQSQTSU(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    return-void
.end method

.method private static final lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->uploadActivity(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Strava is not enabled, token missing"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final revoke$lambda-8(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->hasToken()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 119
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Revoke success"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final revoke$lambda-9(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->hasToken()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final writeToGPXFormat(Ljava/util/List;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
            ">;"
        }
    .end annotation

    .line 167
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 169
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$ej2p704HLr7hg8TJWKkCKLtEOkg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$ej2p704HLr7hg8TJWKkCKLtEOkg;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 184
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "fromIterable(sessionList)\n//                .filter { it.gpsPositions.isNotEmpty() }//TODO Add support for only heart rates too\n                .map {\n                    val activityName = it.name\n                    val points = it.gpsPositions\n                            .zip(it.heartRates)\n                            .map { positionHeartPair ->\n                                val position = positionHeartPair.first\n                                val heartRate = positionHeartPair.second\n                                GPXPoint(position.latitude, position.longitude, heartRate.value, position.timestamp)\n                            }\n\n                    val gpxData = GPXData(points)\n                    val gpxDataString = writer.writeGPX(gpxData)\n\n                    UploadData(it.name, \"\", gpxDataString, \"default\")\n                }\n                .doOnNext {\n                    debug(\"===========Strava format=============\", this)\n                    debug(it.data)\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final writeToGPXFormat$lambda-20(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    .line 171
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 172
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 235
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 236
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 237
    check-cast v2, Lkotlin/Pair;

    .line 174
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 175
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 176
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v9

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v10

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;-><init>(DDIJ)V

    invoke-interface {v1, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 238
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 179
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;-><init>(Ljava/util/List;)V

    .line 180
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;->writeGPX(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;)Ljava/lang/String;

    move-result-object p0

    .line 182
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    const-string v2, "default"

    invoke-direct {v0, p1, v1, p0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final writeToGPXFormat$lambda-21(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "===========Strava format============="

    invoke-static {v0, v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    .line 186
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;->getData()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v1, 0x2

    invoke-static {v0, p0, p1, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final writeToTCXFormat(Ljava/util/List;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
            ">;"
        }
    .end annotation

    .line 127
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 128
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 160
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$GRwMoyxg--fZSPlAm0NKiK7nOm4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$GRwMoyxg--fZSPlAm0NKiK7nOm4;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 163
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$n2kjZVQFb2X2CaM3BOJaPCMcdsM;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$n2kjZVQFb2X2CaM3BOJaPCMcdsM;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "fromIterable(sessionList)\n                .map {\n                    val points = it.gpsPositions\n                            .zip(it.heartRates)\n                            .map {positionHeartPair ->\n                                val position = positionHeartPair.first\n                                val heartRate = positionHeartPair.second\n                                TCXPoint(position.latitude, position.longitude, heartRate.value, position.timestamp)\n                            }\n\n                    //collect all distances between dots\n                    val distances = it.gpsPositions.filter { it.latitude != 0.0 && it.longitude != 0.0 }.zipWithNext { first, second ->\n                        first.toLocation().distanceTo(second.toLocation())\n                    }\n\n                    //set distance from start to each point, max to total distance of activity\n                    distances.foldIndexed(0f) { index, result, tempDistance ->\n                        points.getOrNull(index)?.distanceFromStart = if (result > it.distance) it.distance else result\n                        result + tempDistance\n                    }\n\n                    points.last().distanceFromStart = it.distance\n\n                    val maxHeartRate = it.heartRates.maxByOrNull { heartRate -> heartRate.value }?.value ?: 0\n                    val avgHeartRate = it.heartRates.map { heartRate -> heartRate.value }.average().toInt()\n\n                    val tcxData = TCXActivity(points, it.distance, getTCXType(it.activityType),\n                            it.startTime, it.endTime, it.activeCalories, it.bmrCalories,\n                            avgHeartRate, maxHeartRate)\n                    val gpxDataString = tcxWriter.write(tcxData)\n\n                    UploadData(it.name, \"\", gpxDataString, \"default\")\n                }\n                .doOnNext {\n                    debug(\"Strava upload data created\", this)\n                }\n                .doOnError { error(\"Error in Strava format creation: ${it.javaClass.simpleName}\", it) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final writeToTCXFormat$lambda-16(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;
    .locals 33

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 130
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->zip(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 196
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 197
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 198
    check-cast v5, Lkotlin/Pair;

    .line 132
    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 133
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 134
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v12

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v13

    const/4 v5, 0x0

    const/16 v16, 0x10

    const/16 v17, 0x0

    move-object v7, v15

    move-object v6, v15

    move v15, v5

    invoke-direct/range {v7 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;-><init>(DDIJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    :cond_0
    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 138
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 200
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 201
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 138
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v9

    const-wide/16 v11, 0x0

    const/4 v13, 0x1

    cmpg-double v14, v9, v11

    if-nez v14, :cond_2

    const/4 v9, 0x1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    if-nez v9, :cond_4

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v8

    cmpg-double v10, v8, v11

    if-nez v10, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    if-nez v8, :cond_4

    const/4 v7, 0x1

    :cond_4
    if-eqz v7, :cond_1

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 202
    :cond_5
    check-cast v5, Ljava/util/List;

    .line 200
    check-cast v5, Ljava/lang/Iterable;

    .line 203
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 204
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_5

    .line 205
    :cond_6
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .line 206
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 207
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    .line 208
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 209
    move-object v9, v8

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 139
    invoke-static {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v6

    invoke-static {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toLocation(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Landroid/location/Location;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v6, v8

    goto :goto_4

    :cond_7
    move-object v3, v5

    .line 143
    :goto_5
    check-cast v3, Ljava/lang/Iterable;

    const/4 v5, 0x0

    .line 215
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v6, 0x1

    if-gez v6, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_8
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    .line 144
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v10

    cmpl-float v10, v5, v10

    if-lez v10, :cond_a

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v10

    goto :goto_7

    :cond_a
    move v10, v5

    :goto_7
    invoke-virtual {v6, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->setDistanceFromStart(F)V

    :goto_8
    add-float/2addr v5, v8

    move v6, v9

    goto :goto_6

    .line 148
    :cond_b
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v5

    invoke-virtual {v3, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;->setDistanceFromStart(F)V

    .line 150
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 217
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 218
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_c

    const/4 v3, 0x0

    goto :goto_a

    .line 219
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 220
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_d

    :goto_9
    move-object v3, v5

    goto :goto_a

    .line 221
    :cond_d
    move-object v6, v5

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 150
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v6

    .line 223
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 224
    move-object v9, v8

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 150
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v9

    if-ge v6, v9, :cond_f

    move-object v5, v8

    move v6, v9

    .line 229
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_9

    .line 150
    :goto_a
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    if-nez v3, :cond_10

    const/16 v29, 0x0

    goto :goto_b

    :cond_10
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v3

    move/from16 v29, v3

    .line 151
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 231
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 232
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 233
    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 151
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 234
    :cond_11
    check-cast v5, Ljava/util/List;

    .line 231
    check-cast v5, Ljava/lang/Iterable;

    .line 151
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->averageOfInt(Ljava/lang/Iterable;)D

    move-result-wide v3

    double-to-int v3, v3

    .line 153
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v20

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v5

    invoke-static {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriterKt;->getTCXType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)Ljava/lang/String;

    move-result-object v21

    .line 154
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v22

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v24

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActiveCalories()I

    move-result v26

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getBmrCalories()I

    move-result v27

    const/16 v30, 0x0

    const/16 v31, 0x200

    const/16 v32, 0x0

    move-object/from16 v18, v4

    move-object/from16 v19, v1

    move/from16 v28, v3

    .line 153
    invoke-direct/range {v18 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;-><init>(Ljava/util/List;FLjava/lang/String;JJIIIIFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 156
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->tcxWriter:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;->write(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;)Ljava/lang/String;

    move-result-object v0

    .line 158
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    const-string v4, "default"

    invoke-direct {v1, v2, v3, v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final writeToTCXFormat$lambda-17(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Strava upload data created"

    invoke-static {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final writeToTCXFormat$lambda-18(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Error in Strava format creation: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final authorize(Landroid/content/Context;)V
    .locals 3

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https://www.strava.com/oauth/mobile/authorize"

    .line 74
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaLinkScheme:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaLinkHost:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "redirect_uri"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 77
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientID:Ljava/lang/String;

    const-string v2, "client_id"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->code:Ljava/lang/String;

    const-string v2, "response_type"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "approval_prompt"

    const-string v2, "auto"

    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 80
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->scopeKey:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authScope:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 83
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 84
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final getAccessAndRefreshToken(Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;)V
    .locals 9

    const-string v0, "authInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientID:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->login(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;

    move-result-object p1

    .line 106
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    .line 109
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$RwiuBVmMa58KhdAws81N-6Eytxk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$RwiuBVmMa58KhdAws81N-6Eytxk;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    .line 106
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 27
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final hasAuthorize()Z
    .locals 1

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->hasToken()Z

    move-result v0

    return v0
.end method

.method public final isValidIntent(Landroid/content/Intent;)Z
    .locals 0

    .line 96
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->parseIntent(Landroid/content/Intent;)Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;->getCode()Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final parseIntent(Landroid/content/Intent;)Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    move-object v1, v0

    goto :goto_1

    .line 89
    :cond_1
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->code:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 90
    :cond_2
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->scopeKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    :goto_2
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;

    invoke-direct {p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final revoke()V
    .locals 9

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->stravaCloud:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientID:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->clientSecret:Ljava/lang/String;

    const-string v4, ""

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;->logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Completable;

    move-result-object v0

    .line 117
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$EMESRixU8wL4kjIPGgBCGOvW7qk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$EMESRixU8wL4kjIPGgBCGOvW7qk;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    .line 120
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$rFWyHneauqIC-2Dja4-2R37-Xds;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$rFWyHneauqIC-2Dja4-2R37-Xds;-><init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V

    .line 117
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method public final subscribeToAuthorize()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->authSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final writeSessionList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sessionList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->writingSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
