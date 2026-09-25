.class public Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;
.super Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;
.source "OtaProcessExecutorImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0014J\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "downloadExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;",
        "otaExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;",
        "syncProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;",
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
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V",
        "createOTAOperation",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "downloadURL",
        "",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "updateInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "setupPhasePower",
        "",
        "syncOperation",
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
.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

.field private final syncProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p7

    move-object/from16 v8, p8

    const-string v0, "communicator"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadExecutor"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otaExecutor"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncProcessExecutor"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileTransfer"

    move-object/from16 v7, p9

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 221
    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V

    .line 212
    iput-object v10, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 213
    iput-object v11, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    .line 214
    iput-object v12, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    .line 215
    iput-object v13, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;

    .line 216
    iput-object v14, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 218
    iput-object v15, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    move-object/from16 v0, p8

    .line 219
    iput-object v0, v9, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    return-void
.end method

.method private static final createOTAOperation$lambda-0(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;

    const-string v0, "File Download failed"

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final createOTAOperation$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileDataOTAStatusPair"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$RO8NdxcwP66OzM97Bb8D3jnBqH4;

    invoke-direct {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$RO8NdxcwP66OzM97Bb8D3jnBqH4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v2

    const-string p1, "defer {\n                        val transferFileOperation = fileTransfer.transferFile(deviceInfo, updateInfoData, fileDataOTAStatusPair.first)\n                        Observable.concat(\n                                syncOperation().onErrorResumeNext(Function {\n                                    debug(\"Sync throws error during Sync phase, continue with OTA - ${it.javaClass.simpleName} : ${it.message}\")\n                                    Observable.empty<OTAStatus>()\n                                }),\n                                transferFileOperation)\n                    }"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->getDeviceCommunicationQueuer()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

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

.method private static final createOTAOperation$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$fileDataOTAStatusPair"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->getFileTransfer()Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    move-result-object v1

    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, [B

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$default(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 237
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncOperation()Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 241
    check-cast p1, Lio/reactivex/ObservableSource;

    .line 236
    invoke-static {p0, p1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createOTAOperation$lambda-3$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sync throws error during Sync phase, continue with OTA - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 239
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$0TNKAK2WMn7pUOY4fB4ZefK9uLE(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->createOTAOperation$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$GGFoFLKw5AxahJ3ZjqfQfJNsjGk(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->createOTAOperation$lambda-0(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Pmr8i3qLIuenTU72M1KqBGDoUhc(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Integer;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncOperation$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Integer;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$RO8NdxcwP66OzM97Bb8D3jnBqH4(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->createOTAOperation$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$vmSJ1rwrDIqt2n8I7Eu7AInKMLs(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->createOTAOperation$lambda-3$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final syncOperation$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Integer;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;

    move-object v3, p1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->getPower()F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
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

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->downloadOperation(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;

    .line 228
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 233
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$0TNKAK2WMn7pUOY4fB4ZefK9uLE;

    invoke-direct {v0, p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$0TNKAK2WMn7pUOY4fB4ZefK9uLE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "downloadOperation(downloadURL)\n                .onErrorResumeNext(Function {\n                    Observable.error(OTAError.FileDownload(\"File Download failed\"))\n                })\n                // once we sure that download is done, start with OTA phase\n                // OTA PHASE START\n                .flatMap { fileDataOTAStatusPair ->\n                    val otaOperation: Observable<OTAStatus> = Observable.defer {\n                        val transferFileOperation = fileTransfer.transferFile(deviceInfo, updateInfoData, fileDataOTAStatusPair.first)\n                        Observable.concat(\n                                syncOperation().onErrorResumeNext(Function {\n                                    debug(\"Sync throws error during Sync phase, continue with OTA - ${it.javaClass.simpleName} : ${it.message}\")\n                                    Observable.empty<OTAStatus>()\n                                }),\n                                transferFileOperation)\n                    }\n                    deviceCommunicationQueuer.queue(DeviceCommunicationOperation(otaOperation, OperationType.Blocker))\n\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected setupPhasePower()V
    .locals 2

    .line 256
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->setupPhasePower()V

    .line 257
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->getPhasePowerConfig()Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;->getSyncExecutorPower()F

    move-result v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->setPower(F)V

    return-void
.end method

.method public final syncOperation()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation

    .line 249
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->syncProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->execute()Lio/reactivex/Observable;

    move-result-object v0

    .line 250
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$Pmr8i3qLIuenTU72M1KqBGDoUhc;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$Pmr8i3qLIuenTU72M1KqBGDoUhc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 252
    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "syncProcessExecutor.execute()\n                .map { OTAStatus(it, OtaProcessPhase.SYNC, syncProcessExecutor.power) }\n                // need to filter same progress values\n                .distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
