.class public final Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;
.super Ljava/lang/Object;
.source "FontUpdateController.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFontUpdateController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontUpdateController.kt\npowerwatch/matrix/com/pwgen2android/main/FontUpdateController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n764#2:84\n855#2,2:85\n1547#2:87\n1618#2,3:88\n*S KotlinDebug\n*F\n+ 1 FontUpdateController.kt\npowerwatch/matrix/com/pwgen2android/main/FontUpdateController\n*L\n33#1:84\n33#1:85,2\n57#1:87\n57#1:88,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bJ\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "fontUpdateService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;",
        "fontUpdateExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;)V",
        "checkForUpdate",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
        "sectionsInfo",
        "",
        "",
        "",
        "createUpdateObservableForPackage",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
        "updateInfo",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;",
        "getUpdateInfo",
        "startUpdate",
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
.field private final fontUpdateExecutor:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

.field private final fontUpdateService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;)V
    .locals 1

    const-string v0, "fontUpdateService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontUpdateExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateExecutor:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    return-void
.end method

.method private static final checkForUpdate$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Font update info received from cloud"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final checkForUpdate$lambda-2(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;
    .locals 12

    const-string v0, "$sectionsInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;->getComponents()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 85
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;

    .line 34
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 35
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlin.Long"

    invoke-static {v4, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;->getTimestamp()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-gez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    .line 34
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_2
    move-object v9, v1

    check-cast v9, Ljava/util/List;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v4, p1

    .line 37
    invoke-static/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;JJLjava/util/List;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    move-result-object p0

    return-object p0
.end method

.method private final createUpdateObservableForPackage(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateExecutor:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->otaOutput()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$jIaXx1oxeWCJ81LgTEWUSvy4WTg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$jIaXx1oxeWCJ81LgTEWUSvy4WTg;

    .line 66
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$zDC1qhNA3f4CF4bbuOHKpaXWNLo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$zDC1qhNA3f4CF4bbuOHKpaXWNLo;

    .line 67
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$ho8banqcMzvWC_jnV28R0u4IynA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$ho8banqcMzvWC_jnV28R0u4IynA;

    .line 68
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$7u153K22eZYormyD7KlH6B36wY4;

    .line 73
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    .line 74
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$wGOtBRRPErT_0AQ3eIDz1YuEOZ0;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$wGOtBRRPErT_0AQ3eIDz1YuEOZ0;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 78
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$d3570L0heI1_SLwmV7os6fn4KR4;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$d3570L0heI1_SLwmV7os6fn4KR4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 64
    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "merge(\n                fontUpdateExecutor.otaOutput()\n                        .filter { it.phase != OtaProcessPhase.INITIAL }\n                        .doOnNext { println(\"Main AGPS running : ${it.phaseProgress}, phase: ${it.phase}\") }\n                        .map {\n                            //TODO Include new types or simplify to data transfer result\n                            SyncProcessResult.FontUpdateProgress(it.phaseProgress, true, it.phase == OtaProcessPhase.COMPLETE || it.phase == OtaProcessPhase.ERROR,\n                                    if (it.phase == OtaProcessPhase.ERROR) AgpsTransferError.TransferFailed else null)\n                        }\n                        .takeUntil { it.completed }\n                        .doOnComplete {\n                            println(\"AGPS - Main AGPS completed\")\n                            fontUpdateExecutor.resetExecutorState()\n                        },\n                Observable.create {\n                    fontUpdateExecutor.startOTA(downloadURL = updateInfo.downloadURL, expectVersionUpgrade = false)\n                    it.onComplete()\n                })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final createUpdateObservableForPackage$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result p0

    return p0
.end method

.method private static final createUpdateObservableForPackage$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "AGPS - Main AGPS completed"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 76
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateExecutor:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->resetExecutorState()V

    return-void
.end method

.method private static final createUpdateObservableForPackage$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;Lio/reactivex/ObservableEmitter;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateExecutor:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;->getDownloadURL()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor$DefaultImpls;->startOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 80
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final createUpdateObservableForPackage$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final createUpdateObservableForPackage$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Main AGPS running : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", phase: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final createUpdateObservableForPackage$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;
    .locals 5

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v2

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 71
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/AgpsTransferError$TransferFailed;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/AgpsTransferError$TransferFailed;

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    check-cast p0, Ljava/lang/Throwable;

    .line 70
    invoke-direct {v0, v1, v3, v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;-><init>(IZZLjava/lang/Throwable;)V

    return-object v0
.end method

.method public static synthetic lambda$7u153K22eZYormyD7KlH6B36wY4(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$X8oyLIls_-gSreZObG_11FuVhfM(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->startUpdate$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$d3570L0heI1_SLwmV7os6fn4KR4(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$ho8banqcMzvWC_jnV28R0u4IynA(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jIaXx1oxeWCJ81LgTEWUSvy4WTg(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$pRqJBa5U4YoNsbDr_rPe0H9vYgY(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->startUpdate$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V

    return-void
.end method

.method public static synthetic lambda$shpQLoNaXZONJLbqowOlNFk6I18(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->startUpdate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$un8xV04SwqM8DLDAW9dzhtdGBo8(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->checkForUpdate$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V

    return-void
.end method

.method public static synthetic lambda$v93GuJNrzbguG4P6UzrhuEaDTQ4(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->checkForUpdate$lambda-2(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$wGOtBRRPErT_0AQ3eIDz1YuEOZ0(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    return-void
.end method

.method public static synthetic lambda$zDC1qhNA3f4CF4bbuOHKpaXWNLo(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method private static final startUpdate$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontUpdateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->startUpdate(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startUpdate$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;->getComponents()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Starting font update with components: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final startUpdate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontUpdateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;->getComponents()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    const/16 v2, 0x64

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v7, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;-><init>(IZZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;->getComponents()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 88
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 89
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;

    .line 57
    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->createUpdateObservableForPackage(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 87
    check-cast v0, Ljava/lang/Iterable;

    .line 56
    invoke-static {v0}, Lio/reactivex/Observable;->concat(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_1
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public final checkForUpdate(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "sectionsInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->getUpdateInfo()Lio/reactivex/Single;

    move-result-object v0

    .line 29
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 30
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "getUpdateInfo()\n                .doOnSuccess { debug(\"Font update info received from cloud\") }\n                .map { info ->\n\n                    //filter out components that matches the watch AND that are outdated\n                    val trimmedComponents = info.components.filter { component ->\n                        sectionsInfo[component.type] != null &&\n                                (sectionsInfo[component.type] as Long) < component.timestamp\n                    }\n                    info.copy(components = trimmedComponents)\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 18
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdateInfo()Lio/reactivex/Single;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->fontUpdateService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService$DefaultImpls;->get$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    return-object v0
.end method

.method public final startUpdate(Ljava/util/Map;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
            ">;"
        }
    .end annotation

    const-string v0, "sectionsInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->checkForUpdate(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p1

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$X8oyLIls_-gSreZObG_11FuVhfM;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$X8oyLIls_-gSreZObG_11FuVhfM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->flatMapObservable(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "checkForUpdate(sectionsInfo)\n                .flatMapObservable { fontUpdateInfo ->\n                    startUpdate(fontUpdateInfo)\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final startUpdate(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
            ">;"
        }
    .end annotation

    const-string v0, "updateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 52
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$pRqJBa5U4YoNsbDr_rPe0H9vYgY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$pRqJBa5U4YoNsbDr_rPe0H9vYgY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$shpQLoNaXZONJLbqowOlNFk6I18;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$shpQLoNaXZONJLbqowOlNFk6I18;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "just(updateInfo)\n                .doOnNext { debug(\"Starting font update with components: ${it.components.size}\") }\n                .flatMap { fontUpdateInfo ->\n                    if (fontUpdateInfo.components.isEmpty()) Observable.just(SyncProcessResult.FontUpdateProgress(completed = true, progress = 100))\n                    else {\n                        Observable.concat(\n                                fontUpdateInfo.components.map { createUpdateObservableForPackage(it) }\n                        )\n                    }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
