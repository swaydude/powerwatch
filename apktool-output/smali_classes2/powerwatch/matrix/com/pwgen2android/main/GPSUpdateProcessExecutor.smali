.class public final Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;
.super Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;
.source "GPSUpdateProcessExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J&\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001f0\'0\u001e2\u0006\u0010 \u001a\u00020!H\u0014J\u001e\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020#2\u0008\u0008\u0002\u0010-\u001a\u00020+J \u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0014J\u0018\u00104\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0014J\u0018\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u00066"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "downloadExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;",
        "otaExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "fileTransfer",
        "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;",
        "gpsDownloadExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;",
        "context",
        "Landroid/content/Context;",
        "agpsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;)V",
        "phasePowerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;",
        "getPhasePowerConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;",
        "createOTAOperation",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "downloadURL",
        "",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "updateInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "downloadOperation",
        "Lkotlin/Pair;",
        "",
        "isUpdateNeeded",
        "Lio/reactivex/Single;",
        "",
        "deviceInfoToCheck",
        "shouldRefresh",
        "logOTAError",
        "",
        "firmwareVersionFrom",
        "firmwareVersionTo",
        "it",
        "",
        "logOTAStart",
        "logOTASuccess",
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
.field private final agpsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final gpsDownloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;

.field private final phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otaExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileTransfer"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsDownloadExecutor"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p10, "agpsRepository"

    invoke-static {p11, p10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct/range {p0 .. p8}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V

    .line 28
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 31
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->gpsDownloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;

    .line 33
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->agpsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;

    .line 36
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    const p2, 0x3e4ccccd    # 0.2f

    const p3, 0x3f19999a    # 0.6f

    invoke-direct {p1, p2, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;-><init>(FFF)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;

    .line 22
    move-object/from16 v2, p9

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    move-object/from16 v3, p10

    .line 33
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;

    move-object v12, v0

    goto :goto_0

    :cond_0
    move-object/from16 v12, p11

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 22
    invoke-direct/range {v1 .. v12}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;)V

    return-void
.end method

.method private static final createOTAOperation$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    move-object p3, p0

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p3, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadOperation$default(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p3

    .line 52
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$Yl7XASNiZCRdyUOETv4ht22zuEw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$Yl7XASNiZCRdyUOETv4ht22zuEw;

    .line 63
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;

    invoke-direct {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v2

    const-string p1, "defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                            .doOnNext {\n                                                if (it.phase == OtaProcessPhase.COMPLETE) {\n                                                    agpsRepository.storeLastUpdateTimestamp()\n                                                }\n                                            }\n                                }"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->getDeviceCommunicationQueuer()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    move-result-object p0

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;

    move-object v3, p2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-5$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->getFileTransfer()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    move-result-object v0

    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZ)Lio/reactivex/Observable;

    move-result-object p1

    .line 55
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$8nONN-tlwjbU7T5joxuhPqG42fU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$8nONN-tlwjbU7T5joxuhPqG42fU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-5$lambda-3$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 57
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->agpsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;->storeLastUpdateTimestamp()V

    :cond_0
    return-void
.end method

.method private static final createOTAOperation$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS - File transfer emitting from queue "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final downloadOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lkotlin/Pair;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;->getContent()[B

    move-result-object p1

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    .line 42
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    .line 43
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->gpsDownloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;->getPower()F

    move-result v4

    const/16 v2, 0x64

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v9

    .line 41
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic isUpdateNeeded$default(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZILjava/lang/Object;)Lio/reactivex/Single;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 69
    :cond_0
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->isUpdateNeeded(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Z)Lio/reactivex/Single;

    move-result-object p0

    return-object p0
.end method

.method private static final isUpdateNeeded$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Ljava/lang/Boolean;
    .locals 8

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getTime()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 73
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getTime()I

    move-result p0

    int-to-long v4, p0

    const-wide/16 v6, 0x3e8

    mul-long v4, v4, v6

    cmp-long p0, v2, v4

    if-lez p0, :cond_1

    const/4 v1, 0x1

    .line 75
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8nONN-tlwjbU7T5joxuhPqG42fU(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->createOTAOperation$lambda-5$lambda-3$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$DmqpN2SBtlw3mM3h6WFwlY-w0B8(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->createOTAOperation$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YRfpD2xJ6FOhPaWR9aZfhOqWv44(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->downloadOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Yl7XASNiZCRdyUOETv4ht22zuEw(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->createOTAOperation$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$ZhqDOcLoGhMTgtzbzSeoN96NgeQ(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->createOTAOperation$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$aBjVFxSMtCSdrgx23V0yYecJcsg(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->createOTAOperation$lambda-5$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jRdN9SsX0CMqrsfgLZtyvJubwlY(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->isUpdateNeeded$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public createOTAOperation(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "downloadURL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deviceInfo"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "updateInfoData"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-static {p2}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 49
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$ZhqDOcLoGhMTgtzbzSeoN96NgeQ;

    invoke-direct {v0, p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$ZhqDOcLoGhMTgtzbzSeoN96NgeQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "just(deviceInfo)\n                .flatMap {\n\n                    downloadOperation()\n                            .flatMap { data ->\n                                val otaOperation = Observable.defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                            .doOnNext {\n                                                if (it.phase == OtaProcessPhase.COMPLETE) {\n                                                    agpsRepository.storeLastUpdateTimestamp()\n                                                }\n                                            }\n                                }\n                                deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n                            }\n                            .doOnNext {\n                                println(\"AGPS - File transfer emitting from queue ${it.phase}, ${it.phaseProgress}\")\n                            }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected downloadOperation(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "[B",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;>;"
        }
    .end annotation

    const-string v0, "downloadURL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->agpsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository$DefaultImpls;->getOne$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 40
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$YRfpD2xJ6FOhPaWR9aZfhOqWv44;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$YRfpD2xJ6FOhPaWR9aZfhOqWv44;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "agpsRepository.getOne(downloadURL)\n                .map { downloadResult ->\n                    Pair(downloadResult.content, OTAStatus(phaseProgress = 100,\n                            phase = OtaProcessPhase.DOWNLOAD_FINISHED,\n                            phaseWeight = gpsDownloadExecutor.power))\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;
    .locals 1

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-object v0
.end method

.method public final isUpdateNeeded(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Z)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Z)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfoToCheck"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 70
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->readDeviceInfo$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;ILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    :goto_0
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;

    .line 71
    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "if (!shouldRefresh) Single.just(deviceInfoToCheck) else deviceManager.readDeviceInfo(deviceInfoToCheck))\n                .map {\n                    if (it.time == -1) return@map false\n                    val currentTime: Long = System.currentTimeMillis()\n                    val watchTime: Long = it.time * 1000L\n                    currentTime > watchTime\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected logOTAError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "firmwareVersionTo"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected logOTAStart(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "firmwareVersionTo"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected logOTASuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "firmwareVersionTo"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
