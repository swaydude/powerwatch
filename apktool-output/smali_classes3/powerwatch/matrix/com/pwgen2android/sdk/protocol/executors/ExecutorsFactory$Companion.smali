.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;
.super Ljava/lang/Object;
.source "ExecutorsFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;",
        "",
        "()V",
        "createPairExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "version",
        "",
        "createSyncExecutor",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;-><init>()V

    return-void
.end method

.method public static synthetic createPairExecutor$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;->createPairExecutor(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createPairExecutor(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;
    .locals 2

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result p3

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    const/4 p1, 0x1

    if-eq p4, p1, :cond_1

    if-eq p4, v0, :cond_0

    .line 20
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version2PairExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    goto :goto_0

    .line 18
    :cond_1
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    .line 22
    :goto_0
    move-object p2, p1

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    const-string p4, "Created pair executor: "

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 21
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    goto :goto_1

    .line 24
    :cond_2
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GenXDataTransferExecutor;

    invoke-direct {p3, p2, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GenXDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    goto :goto_1

    .line 25
    :cond_3
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;

    invoke-direct {p3, p2, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    :goto_1
    return-object p1

    .line 26
    :cond_4
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Unsupported pair protocol "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final createSyncExecutor(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;
    .locals 3

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationInfoProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getProtocolVersion()S

    move-result p1

    if-eqz p1, :cond_2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_2

    if-eq p1, v1, :cond_1

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    .line 36
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

    invoke-direct {p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

    invoke-direct {p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    goto :goto_0

    .line 34
    :cond_1
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    goto :goto_0

    .line 33
    :cond_2
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    .line 38
    :goto_0
    move-object p2, p1

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    const-string p4, "Created sync executor: "

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    return-object p1

    .line 40
    :cond_3
    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result p4

    if-eqz p4, :cond_4

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;

    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GenXDataTransferExecutor;

    invoke-direct {p4, p2, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GenXDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-direct {p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    goto :goto_1

    .line 41
    :cond_4
    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;

    new-instance p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;

    invoke-direct {p4, p2, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-direct {p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    :goto_1
    return-object p1

    .line 43
    :cond_5
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "An operation is not implemented: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "Unsupported sync executor"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method
