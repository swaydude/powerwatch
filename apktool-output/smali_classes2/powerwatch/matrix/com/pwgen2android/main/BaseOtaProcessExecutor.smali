.class public abstract Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;
.super Ljava/lang/Object;
.source "OtaProcessExecutorImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\t\u0008&\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J&\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00150$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J$\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,0$2\u0008\u0008\u0002\u0010%\u001a\u00020&H\u0014J\u0008\u0010.\u001a\u00020/H\u0016J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0014J\u0018\u00106\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0014J\u0018\u00107\u001a\u0002012\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H\u0014J\u0016\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00150\u00150\u001dH\u0016J\u0008\u00108\u001a\u000201H\u0016J\u0008\u00109\u001a\u000201H\u0014J(\u0010:\u001a\u0002012\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020/H\u0016J\u0008\u0010=\u001a\u000201H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u00150\u00150\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u0006>"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
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
        "DEFAULT_OTA_STATE",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "getDeviceCommunicationQueuer",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "getFileTransfer",
        "()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;",
        "otaDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "otaOutput",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "kotlin.jvm.PlatformType",
        "phasePowerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;",
        "getPhasePowerConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;",
        "createOTAOperation",
        "Lio/reactivex/Observable;",
        "downloadURL",
        "",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "updateInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "downloadOperation",
        "Lkotlin/Pair;",
        "",
        "isOtaInProgress",
        "",
        "logOTAError",
        "",
        "firmwareVersionFrom",
        "firmwareVersionTo",
        "it",
        "",
        "logOTAStart",
        "logOTASuccess",
        "resetExecutorState",
        "setupPhasePower",
        "startOTA",
        "deviceID",
        "expectVersionUpgrade",
        "stopOTA",
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
.field private final DEFAULT_OTA_STATE:Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

.field private final fileTransfer:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final otaDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

.field private final otaOutput:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation
.end field

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

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 54
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    .line 55
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    .line 56
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 57
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    .line 58
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 59
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    .line 60
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->fileTransfer:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    .line 62
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    move-object p3, p1

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    const/4 p2, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    const/16 p7, 0x1c

    const/4 p8, 0x0

    move-object p1, v0

    invoke-direct/range {p1 .. p8}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->DEFAULT_OTA_STATE:Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    .line 64
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 65
    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    const-string p2, "createDefault(DEFAULT_OTA_STATE)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    .line 66
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    const p2, 0x3d4ccccd    # 0.05f

    const p3, 0x3e19999a    # 0.15f

    const p4, 0x3f4ccccd    # 0.8f

    invoke-direct {p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;-><init>(FFF)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-void
.end method

.method public static synthetic downloadOperation$default(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    .line 84
    :cond_0
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadOperation(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: downloadOperation"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final downloadOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 88
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    .line 89
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->getPower()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v2, v10

    .line 87
    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic lambda$4V3sA_Ak10qTIQhEZsVfZfHbFVE(Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-6(Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$7p-ejOKnHC9JBA4MzOJimBNN5CQ(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$CximnGhyr_PHqfFWhF0CW-hKdhE(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$HH2LMlv1s_ipRVQJEE5mZFSEpvw(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lkotlin/Pair;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Kp-CergAR-Gmz3R88FXnKFXzFm8(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$MJ1meOSsdVIEJAGmR_B-rcXloaw(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    return-void
.end method

.method public static synthetic lambda$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-4(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YyqX1LCUSuN-0dugqSJRXH73YeU(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$aCf5EiqSK7s4clTVGSHj2bTiNQs(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bvA2s0KRGByBW8UcKXbpOe_xgWo(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$dZ3r8gCytzUzv4HiZ51FJjaTTZ8(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$pLXFz8sF8G5eLT6l2PKzRADN6rw(Lkotlin/Pair;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-7(Lkotlin/Pair;Lkotlin/Pair;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tFKQoymbjRS7CrByhy6Z6xDxUNw(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->startOTA$lambda-8(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    return-object p0
.end method

.method private static final startOTA$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getInstalledVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->logOTAStart(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final startOTA$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 10

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getTotalProgress()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x64

    const/4 v7, 0x0

    const/16 v8, 0x17

    const/4 v9, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->copy$default(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private static final startOTA$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getInstalledVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->logOTASuccess(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "AGPS - Setting phase to "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 176
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startOTA$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/Throwable;)V
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getInstalledVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object p1

    const-string v1, "it"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->logOTAError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v0, v8

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v8}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 181
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->DEFAULT_OTA_STATE:Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p1, p0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startOTA$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$downloadURL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    const/4 v2, 0x0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 120
    invoke-virtual {p0, p1, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->createOTAOperation(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 116
    invoke-static {v0, p0}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 124
    :cond_0
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;-><init>()V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startOTA$lambda-4(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    .line 129
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->defaultDevice()Lio/reactivex/Single;

    move-result-object p0

    .line 130
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$dZ3r8gCytzUzv4HiZ51FJjaTTZ8;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$dZ3r8gCytzUzv4HiZ51FJjaTTZ8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    .line 133
    invoke-static {p3}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 135
    :cond_0
    invoke-static {p3}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startOTA$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/CompletableSource;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$updateInfoData"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "device"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object v8

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7ef

    const/16 v16, 0x0

    move-object/from16 v2, p2

    move-wide v3, v4

    move-object v5, v1

    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final startOTA$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final startOTA$lambda-6(Lkotlin/Pair;)V
    .locals 2

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS - received phase from file transfer "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startOTA$lambda-7(Lkotlin/Pair;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 4

    const-string v0, "oldProgressPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newProgressPair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 148
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v2, v3}, Lkotlin/Pair;->copy$default(Lkotlin/Pair;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 150
    :cond_1
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v0

    .line 151
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseWeight()F

    move-result v2

    .line 153
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    const/16 v3, 0x64

    if-ne v0, v3, :cond_2

    int-to-float v0, v0

    mul-float v0, v0, v2

    float-to-int v1, v0

    :cond_2
    add-int/2addr p0, v1

    .line 155
    new-instance v0, Lkotlin/Pair;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final startOTA$lambda-8(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 11

    const-string v0, "updatePhaseProgress"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v0

    .line 159
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseWeight()F

    move-result v1

    .line 162
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/16 v3, 0x64

    if-ge v0, v3, :cond_0

    int-to-float v0, v0

    mul-float v0, v0, v1

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int v7, v2, v0

    .line 166
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v4

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v5

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseWeight()F

    move-result v6

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final startOTA$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public abstract createOTAOperation(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)Lio/reactivex/Observable;
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
.end method

.method protected downloadOperation(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
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

    .line 85
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->execute(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 86
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$HH2LMlv1s_ipRVQJEE5mZFSEpvw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$HH2LMlv1s_ipRVQJEE5mZFSEpvw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "downloadExecutor.execute(downloadURL)\n                .map { downloadResult ->\n                    Pair(downloadResult.second, OTAStatus(phaseProgress = downloadResult.first,\n                            phase = OtaProcessPhase.DOWNLOAD_FINISHED,\n                            phaseWeight = downloadExecutor.power))\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final getDeviceCommunicationQueuer()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;
    .locals 1

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-object v0
.end method

.method protected final getFileTransfer()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->fileTransfer:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 52
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;
    .locals 1

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->phasePowerConfig:Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    return-object v0
.end method

.method public isOtaInProgress()Z
    .locals 2

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    .line 70
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected logOTAError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersionTo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;

    if-eqz v0, :cond_0

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DOWNLOAD_FILE_FAILED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DOWNLOAD_FILE_FAILED;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    :goto_0
    move-object v2, p3

    goto :goto_1

    .line 200
    :cond_0
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;

    if-eqz v0, :cond_1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$FILE_TRANSFER_FAILED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$FILE_TRANSFER_FAILED;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 201
    :cond_1
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;

    if-eqz v0, :cond_2

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_APPEARED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_APPEARED;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 202
    :cond_2
    instance-of v0, p3, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;

    if-eqz v0, :cond_3

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$VERSION_MISMATCH;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$VERSION_MISMATCH;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 203
    :cond_3
    instance-of p3, p3, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;

    if-eqz p3, :cond_4

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$OTA_DEVICE_DISCONNECTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$OTA_DEVICE_DISCONNECTED;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 204
    :cond_4
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;

    invoke-direct {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;-><init>()V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    goto :goto_0

    .line 206
    :goto_1
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    const/4 v3, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v0, v8

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;)V

    return-void
.end method

.method protected logOTAStart(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersionTo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaStart;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaStart;

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v1, v9

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;)V

    return-void
.end method

.method protected logOTASuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "firmwareVersionFrom"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersionTo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$OtaEnd;

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    const/4 v4, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v1, v9

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;)V

    return-void
.end method

.method public bridge synthetic otaOutput()Lio/reactivex/Observable;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public otaOutput()Lio/reactivex/subjects/BehaviorSubject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    return-object v0
.end method

.method public resetExecutorState()V
    .locals 2

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaOutput:Lio/reactivex/subjects/BehaviorSubject;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->DEFAULT_OTA_STATE:Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method protected setupPhasePower()V
    .locals 2

    .line 96
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;->getDownloadExecutorPower()F

    move-result v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->setPower(F)V

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;->getOtaExecutorPower()F

    move-result v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->setPower(F)V

    return-void
.end method

.method public startOTA(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;Z)V
    .locals 9

    const-string v0, "downloadURL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->stopOTA()V

    .line 103
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->setupPhasePower()V

    .line 105
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 108
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1d

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 109
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$MJ1meOSsdVIEJAGmR_B-rcXloaw;

    invoke-direct {v1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$MJ1meOSsdVIEJAGmR_B-rcXloaw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 111
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->connect(Z)Lio/reactivex/Observable;

    move-result-object v1

    const-wide/16 v2, 0x1

    .line 113
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    .line 114
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;

    invoke-direct {v2, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 106
    invoke-static {v0, p1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    .line 127
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;

    invoke-direct {v0, p4, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;-><init>(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$aCf5EiqSK7s4clTVGSHj2bTiNQs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$aCf5EiqSK7s4clTVGSHj2bTiNQs;

    .line 138
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$4V3sA_Ak10qTIQhEZsVfZfHbFVE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$4V3sA_Ak10qTIQhEZsVfZfHbFVE;

    .line 139
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$pLXFz8sF8G5eLT6l2PKzRADN6rw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$pLXFz8sF8G5eLT6l2PKzRADN6rw;

    .line 143
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->scan(Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$tFKQoymbjRS7CrByhy6Z6xDxUNw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$tFKQoymbjRS7CrByhy6Z6xDxUNw;

    .line 157
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$YyqX1LCUSuN-0dugqSJRXH73YeU;

    .line 168
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;

    .line 169
    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 171
    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;

    invoke-direct {p4, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    .line 178
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$7p-ejOKnHC9JBA4MzOJimBNN5CQ;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$7p-ejOKnHC9JBA4MzOJimBNN5CQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    .line 170
    invoke-virtual {p1, p4, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 105
    invoke-virtual {p3, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public stopOTA()V
    .locals 1

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->resetExecutorState()V

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->otaDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method
