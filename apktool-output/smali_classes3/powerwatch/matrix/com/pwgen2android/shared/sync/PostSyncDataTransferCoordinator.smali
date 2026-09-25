.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;
.super Ljava/lang/Object;
.source "PostSyncDataTransferCoordinator.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPostSyncDataTransferCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSyncDataTransferCoordinator.kt\npowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\n2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;",
        "",
        "gpsUpdateProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;",
        "fontUpdateController",
        "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V",
        "createInternalAGPSObs",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;",
        "isAGPSUpdateNeeded",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "syncResult",
        "readAGPSAndRunFontUpdate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "runFontUpdate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
        "runMainProcess",
        "internalResult",
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
.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

.field private final gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V
    .locals 1

    const-string v0, "gpsUpdateProcessExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontUpdateController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    return-void
.end method

.method private final createInternalAGPSObs()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->otaOutput()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$VO1VwN3Ii0Q2VKEch_gffS57Y2Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$VO1VwN3Ii0Q2VKEch_gffS57Y2Q;

    .line 44
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$wrLA559rJiMvKg62nGTLKKVOEIU;

    .line 45
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$airHJUzs8Wv_FWgX7z5JauQCQuw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$airHJUzs8Wv_FWgX7z5JauQCQuw;

    .line 46
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$P_7pMLoVutFTHxUnktiO6OD_4Kw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$P_7pMLoVutFTHxUnktiO6OD_4Kw;

    .line 50
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->takeUntil(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    .line 51
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$yUiCulI74Dtx_7WIVN8uqsyWS78;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$yUiCulI74Dtx_7WIVN8uqsyWS78;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 55
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G_AN69kPC4ecjO6NYNzk2a7n3Ww;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G_AN69kPC4ecjO6NYNzk2a7n3Ww;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 42
    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(\n                gpsUpdateProcessExecutor.otaOutput()\n                        .filter { it.phase != OtaProcessPhase.INITIAL }\n                        .doOnNext { println(\"Main AGPS running : ${it.phaseProgress}, phase: ${it.phase}\") }\n                        .map {\n                            SyncProcessResult.AGPSProgress(it.phaseProgress, true, it.phase == OtaProcessPhase.COMPLETE || it.phase == OtaProcessPhase.ERROR,\n                                    if (it.phase == OtaProcessPhase.ERROR) AgpsTransferError.TransferFailed else null)\n                        }\n                        .takeUntil { it.completed }\n                        .doOnComplete {\n                            println(\"AGPS - Main AGPS completed\")\n                            gpsUpdateProcessExecutor.resetExecutorState()\n                        },\n                Observable.create {\n                    gpsUpdateProcessExecutor.startOTA(expectVersionUpgrade = false)\n                    it.onComplete()\n                }\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final createInternalAGPSObs$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final createInternalAGPSObs$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    .line 45
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

.method private static final createInternalAGPSObs$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;
    .locals 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

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

    .line 48
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    # AGPS cloud download is blocked by design (offline build); the error is
    # reported as a skip and the toast branch in DashboardToastMessageViewModel
    # is disabled, so this path is silent.
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/AgpsTransferError$TransferFailed;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/AgpsTransferError$TransferFailed;

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    :goto_2
    check-cast p0, Ljava/lang/Throwable;

    .line 47
    invoke-direct {v0, v1, v3, v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;-><init>(IZZLjava/lang/Throwable;)V

    return-object v0
.end method

.method private static final createInternalAGPSObs$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result p0

    return p0
.end method

.method private static final createInternalAGPSObs$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "AGPS - Main AGPS completed"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 53
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->resetExecutorState()V

    return-void
.end method

.method private static final createInternalAGPSObs$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lio/reactivex/ObservableEmitter;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor$DefaultImpls;->startOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 57
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final isAGPSUpdateNeeded$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 1

    const-string v0, "$syncResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->setGPSUpdateNeeded(Z)V

    return-object p0
.end method

.method private static final isAGPSUpdateNeeded$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 8

    const-string v0, "$syncResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/AGPSReadError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/AGPSReadError;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Ljava/lang/Throwable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$--lAXrXrbifs-KAUI_ybi3vBgMI(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$0at_O8KW0ICjlFgAfzVtvbRo87Y(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->isAGPSUpdateNeeded$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$62nJmskhPgRbA_-sM-sZaUaWaM0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/MaybeSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runFontUpdate$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/MaybeSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$9j0KjFxs6_cg8ILQqMvD7vy9feM(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->isAGPSUpdateNeeded$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$CbdZSkRLFmTmyKGuWhAw1J0KUBc(Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-14(Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$G160hN243tUv5dYInvMppXpPK6c(Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-13$lambda-11(Ljava/lang/Boolean;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$G3XtH-srQbnf4qfgZnukZ-rdpdo(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runMainProcess$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$G_AN69kPC4ecjO6NYNzk2a7n3Ww(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runFontUpdate$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MrY8P7OVZ7bgArz6t6Z8-ISjl20(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-13$lambda-12(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$P_7pMLoVutFTHxUnktiO6OD_4Kw(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$RjyB6R-bjQixJAcvIMjx3sXmmy8(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$UC4rDPQQ-Brq5KJfCknmYpgSJQg(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$VO1VwN3Ii0Q2VKEch_gffS57Y2Q(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$airHJUzs8Wv_FWgX7z5JauQCQuw(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bonAZ49q5QuC0K-_c5x08Ufy37E(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runFontUpdate$lambda-18(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$wrLA559rJiMvKg62nGTLKKVOEIU(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$yUiCulI74Dtx_7WIVN8uqsyWS78(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    return-void
.end method

.method private final readAGPSAndRunFontUpdate(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation

    .line 64
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3, v1}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$UC4rDPQQ-Brq5KJfCknmYpgSJQg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$UC4rDPQQ-Brq5KJfCknmYpgSJQg;

    .line 65
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 66
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;

    invoke-direct {v1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$RjyB6R-bjQixJAcvIMjx3sXmmy8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$CbdZSkRLFmTmyKGuWhAw1J0KUBc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$CbdZSkRLFmTmyKGuWhAw1J0KUBc;

    .line 76
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 77
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;

    invoke-direct {v1, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$--lAXrXrbifs-KAUI_ybi3vBgMI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "just(deviceInfo).delay(400, TimeUnit.MILLISECONDS)\n                .doOnNext { println(\"Reading AGPS timestamp!!!\") }\n                .flatMap {device ->\n                    deviceCommunicationQueuer.queue(\n                            DeviceCommunicationOperation(\n                                    gpsUpdateProcessExecutor.isUpdateNeeded(device).toObservable()))\n                            .map { Pair<Boolean, Throwable?>(it, null) }\n                            //if error occurred -> wrap it and report as \'false\'\n                            .onErrorResumeNext(Function {\n                                Observable.just(Pair(false, it))\n                            })\n                }\n                .doOnNext { println(\"Reading AGPS timestamp, need update: $it\") }\n                .flatMap {updateNeededWithError ->\n                    //if error occurred -> report error; if update is not needed -> go to font update; otherwise -> return\n                    when {\n                        updateNeededWithError.second != null -> Observable.just(SyncProcessResult.AGPSProgress(100, false, true, updateNeededWithError.second))\n                        !updateNeededWithError.first -> runFontUpdate(deviceCommunicationQueuer, deviceInfo)\n                        else -> Observable.just(SyncProcessResult.AGPSProgress(100, false, true, null))\n                    }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    .line 65
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Reading AGPS timestamp!!!"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    .line 69
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, p2, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->isUpdateNeeded$default(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v2

    const-string p1, "gpsUpdateProcessExecutor.isUpdateNeeded(device).toObservable()"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    .line 68
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    invoke-interface {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G160hN243tUv5dYInvMppXpPK6c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G160hN243tUv5dYInvMppXpPK6c;

    .line 70
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$MrY8P7OVZ7bgArz6t6Z8-ISjl20;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$MrY8P7OVZ7bgArz6t6Z8-ISjl20;

    .line 72
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-13$lambda-11(Ljava/lang/Boolean;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-13$lambda-12(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-14(Lkotlin/Pair;)V
    .locals 1

    const-string v0, "Reading AGPS timestamp, need update: "

    .line 76
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final readAGPSAndRunFontUpdate$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateNeededWithError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x64

    if-eqz v0, :cond_0

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p0, v3, v2, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;-><init>(IZZLjava/lang/Throwable;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "just(SyncProcessResult.AGPSProgress(100, false, true, updateNeededWithError.second))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runFontUpdate(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 82
    :cond_1
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    const/4 p1, 0x0

    invoke-direct {p0, v3, v2, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;-><init>(IZZLjava/lang/Throwable;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "just(SyncProcessResult.AGPSProgress(100, false, true, null))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private final runFontUpdate(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
            ">;"
        }
    .end annotation

    .line 90
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->readDeviceInfo$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v1

    const-string p2, "deviceManager.readDeviceInfo(deviceInfo).toObservable()"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    invoke-interface {p1, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p1

    .line 91
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$62nJmskhPgRbA_-sM-sZaUaWaM0;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$62nJmskhPgRbA_-sM-sZaUaWaM0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 94
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$LWwLb2EoDw9Q7TLtPu4UvC7Yu9Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$bonAZ49q5QuC0K-_c5x08Ufy37E;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$bonAZ49q5QuC0K-_c5x08Ufy37E;

    .line 95
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceCommunicationQueuer.queue(\n                DeviceCommunicationOperation(deviceManager.readDeviceInfo(deviceInfo).toObservable()))\n                .flatMapMaybe { info ->\n                    fontUpdateController.checkForUpdate(info.sectionInfoMap).toMaybe()\n                }\n                .flatMap { fontUpdateController.startUpdate(it) }\n                .onErrorResumeNext(Function {\n                    Observable.just(SyncProcessResult.FontUpdateProgress(100, false, true,\n                    if (it is NoSuchElementException) null else it))\n                })"

    .line 90
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final runFontUpdate$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/MaybeSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getSectionInfoMap()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->checkForUpdate(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toMaybe()Lio/reactivex/Maybe;

    move-result-object p0

    check-cast p0, Lio/reactivex/MaybeSource;

    return-object p0
.end method

.method private static final runFontUpdate$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->fontUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->startUpdate(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final runFontUpdate$lambda-18(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 4

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    .line 97
    instance-of v1, p0, Ljava/util/NoSuchElementException;

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    :cond_0
    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 96
    invoke-direct {v0, v1, v2, v3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;-><init>(IZZLjava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final runMainProcess$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$internalResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 34
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->readAGPSAndRunFontUpdate(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p3}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "just(progress)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public final isAGPSUpdateNeeded(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->gpsUpdateProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->isUpdateNeeded$default(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v2

    const-string v1, "gpsUpdateProcessExecutor.isUpdateNeeded(syncResult.syncConfig.deviceInfo!!).toObservable()"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p1

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$9j0KjFxs6_cg8ILQqMvD7vy9feM;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$9j0KjFxs6_cg8ILQqMvD7vy9feM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$0at_O8KW0ICjlFgAfzVtvbRo87Y;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$0at_O8KW0ICjlFgAfzVtvbRo87Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "deviceCommunicationQueuer.queue(DeviceCommunicationOperation(gpsUpdateProcessExecutor.isUpdateNeeded(syncResult.syncConfig.deviceInfo!!).toObservable()))\n                .map { syncResult.apply { syncConfig.isGPSUpdateNeeded = it } }\n                .onErrorResumeNext(Function {\n                    Observable.just(syncResult.copy(throwable = AGPSReadError(it.message)))\n                })"

    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final runMainProcess(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
            ")",
            "Lio/reactivex/Observable<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
            ">;"
        }
    .end annotation

    const-string v0, "internalResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/AGPSReadError;

    if-eqz v0, :cond_0

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    const/16 v0, 0x64

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;-><init>(IZZLjava/lang/Throwable;)V

    invoke-static {p2}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "just(SyncProcessResult.FontUpdateProgress(100, false, true, internalResult.throwable))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->isGPSUpdateNeeded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->createInternalAGPSObs()Lio/reactivex/Observable;

    move-result-object v0

    .line 32
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;

    invoke-direct {v1, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$PostSyncDataTransferCoordinator$G3XtH-srQbnf4qfgZnukZ-rdpdo;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "createInternalAGPSObs()\n                    .flatMap { progress ->\n                        if (progress.completed && progress.error == null) {\n                            readAGPSAndRunFontUpdate(internalResult.syncConfig.deviceInfo!!, deviceCommunicationQueuer)\n                        } else Observable.just(progress)\n                    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;->getSyncConfig()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PostSyncDataTransferCoordinator;->runFontUpdate(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method
