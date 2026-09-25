.class public final Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;
.super Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;
.source "FontUpdateExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J&\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0014J\u0018\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0014J\u0018\u0010\'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0014R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006("
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;",
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
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V",
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
.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V
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

    .line 26
    invoke-direct/range {p0 .. p8}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V

    .line 23
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 28
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    const p2, 0x3e4ccccd    # 0.2f

    const p3, 0x3f19999a    # 0.6f

    invoke-direct {p1, p2, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;-><init>(FFF)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-void
.end method

.method private static final createOTAOperation$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$downloadURL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->downloadOperation(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 36
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$_znXg3ukv8vTiP9gLAxNiG5srQA;

    invoke-direct {p4, p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$_znXg3ukv8vTiP9gLAxNiG5srQA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$-ABwGJQLePNq1VSp5szJfFBqjeg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$-ABwGJQLePNq1VSp5szJfFBqjeg;

    .line 42
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$iJKCeKWM26DNK4sxPxnAUrDuQfg;

    invoke-direct {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$iJKCeKWM26DNK4sxPxnAUrDuQfg;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v2

    const-string p1, "defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                }"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->getDeviceCommunicationQueuer()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

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

.method private static final createOTAOperation$lambda-3$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->getFileTransfer()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    move-result-object p0

    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZ)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Font update - File transfer emitting from queue "

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

.method public static synthetic lambda$-ABwGJQLePNq1VSp5szJfFBqjeg(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->createOTAOperation$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$OoMM7JcssnOCRCxkECf9nQYrTJg(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->createOTAOperation$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_znXg3ukv8vTiP9gLAxNiG5srQA(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->createOTAOperation$lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$iJKCeKWM26DNK4sxPxnAUrDuQfg(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->createOTAOperation$lambda-3$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public createOTAOperation(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)Lio/reactivex/Observable;
    .locals 2
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

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {p2}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 33
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;

    invoke-direct {v1, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "just(deviceInfo)\n                .flatMap {\n\n                    downloadOperation(downloadURL)\n                            .flatMap { data ->\n                                val otaOperation = Observable.defer {\n                                    fileTransfer.transferFile(deviceInfo, updateInfoData, data.first, false)\n                                }\n                                deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n                            }\n                            .doOnNext {\n                                println(\"Font update - File transfer emitting from queue ${it.phase}, ${it.phaseProgress}\")\n                            }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-object v0
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
