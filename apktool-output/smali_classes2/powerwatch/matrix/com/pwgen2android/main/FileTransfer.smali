.class public final Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;
.super Ljava/lang/Object;
.source "FileTransfer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileTransfer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransfer.kt\npowerwatch/matrix/com/pwgen2android/main/FileTransfer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1741#2,3:84\n*S KotlinDebug\n*F\n+ 1 FileTransfer.kt\npowerwatch/matrix/com/pwgen2android/main/FileTransfer\n*L\n56#1:84,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J.\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;",
        "",
        "otaExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V",
        "transferFile",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "updateInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "data",
        "",
        "expectVersionUpgrade",
        "",
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

.field private final otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V
    .locals 1

    const-string v0, "otaExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    .line 16
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 17
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    return-void
.end method

.method public static synthetic lambda$BsguT4oXw8OiZ53bb2Ukl8d0xLk(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-8$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$GcIfuwOnM4o_-Y2f9IVRpd04F-A(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QXfUigi9C2_o_jEIHy4VijN7TJ8(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$SK8VtjXjwH7AlhMy01-ubY_gMFY(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YKCFgkrJfQwNoYnEa1YLlykDqgc(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$Z3-qrIc6iZTHlfLJta2G2-F7Hyo(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)V

    return-void
.end method

.method public static synthetic lambda$Zc9zR6pvBmn-a7CdjEjgu9IL6-U(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$np6tWe3HoNy1xumyz7zmG_cPL9I(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-8$lambda-4(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$trBbnKZqOryvk5yNl3bh_kEr55Y(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic transferFile$default(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    .line 19
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->transferFile(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZ)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final transferFile$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$FINISHED;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final transferFile$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)V
    .locals 2

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS - File transfer sending phase "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhaseProgress()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final transferFile$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    move-result-object v1

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$SUCCESS;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 28
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhaseProgress()I

    move-result v3

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    move-object v4, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->getPower()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;->getPhaseProgress()I

    move-result v11

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;

    move-object v12, v2

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->getPower()F

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x18

    const/16 v17, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v17}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v1
.end method

.method private static final transferFile$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;
    .locals 10

    const-string v0, "$updateInfoData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-static {p3}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(it)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhaseProgress()I

    move-result v1

    const/16 v2, 0x64

    if-ne v1, v2, :cond_2

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p3

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getPid()I

    move-result p3

    const/4 v0, 0x4

    const-string v1, "just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))"

    if-ne p3, v0, :cond_1

    if-nez p1, :cond_0

    .line 41
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    const/16 v3, 0x64

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->getPower()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 44
    :cond_0
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1

    .line 46
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$BsguT4oXw8OiZ53bb2Ukl8d0xLk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$BsguT4oXw8OiZ53bb2Ukl8d0xLk;

    .line 47
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v2, 0x9

    .line 48
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v2, v3, p3}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$np6tWe3HoNy1xumyz7zmG_cPL9I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$np6tWe3HoNy1xumyz7zmG_cPL9I;

    .line 49
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$Zc9zR6pvBmn-a7CdjEjgu9IL6-U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$Zc9zR6pvBmn-a7CdjEjgu9IL6-U;

    .line 52
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 60
    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object p1

    .line 61
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;

    invoke-direct {p3, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string p0, "deviceManager.connect()\n                                    // here we need to filter replay value\n                                    .skip(1)\n                                    .filter { it.isConnected }\n                                    .timeout(9, TimeUnit.MINUTES)\n                                    .onErrorResumeNext (Function {\n                                        Observable.error<DeviceInfo>(OTAError.DeviceNotAppeared())\n                                    })\n                                    .filter { device ->\n                                        // TODO what if filter returns false??\n                                        // TODO check if we need device uid comparing\n                                        //  device.uid == deviceID &&\n                                        device.connectionInfos.any { connection ->\n                                            connection.protocolType == ProtocolType.GEN2_STANDARD_BASICS\n                                        }\n                                    }\n                                    .take(1)\n                                    .flatMap { device ->\n                                        var comparingReturnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                                        // fw version is read after each connect, we can use that info to compare versions\n                                        val readVersion = device.extendedDeviceInfo.firmwareVersion\n                                        val updateVersion = updateInfoData.version\n                                        if (readVersion != updateVersion) { //expectVersionUpgrade is not needed here since AGPS will have early exit above\n                                            comparingReturnObs = Observable.error<OTAStatus>(OTAError.VersionMismatch())\n                                        }\n                                        comparingReturnObs\n\n                                    }"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 74
    :cond_1
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    const/16 v3, 0x64

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->getPower()F

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    :cond_2
    :goto_0
    check-cast v0, Lio/reactivex/ObservableSource;

    return-object v0
.end method

.method private static final transferFile$lambda-8$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p0

    return p0
.end method

.method private static final transferFile$lambda-8$lambda-4(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;-><init>()V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final transferFile$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 4

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 84
    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    .line 85
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 57
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    :goto_1
    return v1
.end method

.method private static final transferFile$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$updateInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->getPower()F

    move-result v4

    const/16 v2, 0x64

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-string v0, "just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getExtendedDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p2

    .line 65
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object p1

    .line 66
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 67
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;-><init>()V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "error<OTAStatus>(OTAError.VersionMismatch())"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    :cond_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferFile$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS - Sending on file transfer exit "

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


# virtual methods
.method public final transferFile(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;[BZ)Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
            "[BZ)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->executeOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BFILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$YKCFgkrJfQwNoYnEa1YLlykDqgc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$YKCFgkrJfQwNoYnEa1YLlykDqgc;

    .line 21
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->takeWhile(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$Z3-qrIc6iZTHlfLJta2G2-F7Hyo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$Z3-qrIc6iZTHlfLJta2G2-F7Hyo;

    .line 22
    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 25
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    .line 33
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;

    invoke-direct {p3, p2, p4, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$trBbnKZqOryvk5yNl3bh_kEr55Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$trBbnKZqOryvk5yNl3bh_kEr55Y;

    .line 79
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "otaExecutor.executeOTA(deviceInfo, communicator, data)\n                .takeWhile { it.phase != OtaPhase.FINISHED}\n                .doOnNext {\n                    println(\"AGPS - File transfer sending phase ${it.phase}, ${it.phaseProgress}\")\n                }\n                .map {\n                    //case when AGPS is transferred\n                    if (it.phase == OtaPhase.SUCCESS) {\n                        OTAStatus(it.phaseProgress, OtaProcessPhase.COMPLETE, otaExecutor.power)\n                    }\n                    else OTAStatus(it.phaseProgress, OtaProcessPhase.FILE_TRANSFER, otaExecutor.power)\n                }\n                .distinctUntilChanged()\n                .flatMap {\n                    var returnObs: Observable<OTAStatus> = Observable.just(it)\n\n                    if (it.phaseProgress == 100 && it.phase == OtaProcessPhase.COMPLETE) {\n                        // if it is gen2 device, perform send reset command and perform version checking\n                        if (updateInfoData.pid == 4) {\n                            //case when AGPS is transferred\n                            if (!expectVersionUpgrade) {\n                                returnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                            }\n                            // waiting for reconnect event\n                            else returnObs = deviceManager.connect()\n                                    // here we need to filter replay value\n                                    .skip(1)\n                                    .filter { it.isConnected }\n                                    .timeout(9, TimeUnit.MINUTES)\n                                    .onErrorResumeNext (Function {\n                                        Observable.error<DeviceInfo>(OTAError.DeviceNotAppeared())\n                                    })\n                                    .filter { device ->\n                                        // TODO what if filter returns false??\n                                        // TODO check if we need device uid comparing\n                                        //  device.uid == deviceID &&\n                                        device.connectionInfos.any { connection ->\n                                            connection.protocolType == ProtocolType.GEN2_STANDARD_BASICS\n                                        }\n                                    }\n                                    .take(1)\n                                    .flatMap { device ->\n                                        var comparingReturnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                                        // fw version is read after each connect, we can use that info to compare versions\n                                        val readVersion = device.extendedDeviceInfo.firmwareVersion\n                                        val updateVersion = updateInfoData.version\n                                        if (readVersion != updateVersion) { //expectVersionUpgrade is not needed here since AGPS will have early exit above\n                                            comparingReturnObs = Observable.error<OTAStatus>(OTAError.VersionMismatch())\n                                        }\n                                        comparingReturnObs\n\n                                    }\n                        } else {\n                            // if it is not Gen2 device, just send completed event\n                            returnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                        }\n                    }\n                    returnObs\n                }\n                .doOnNext {\n                    println(\"AGPS - Sending on file transfer exit ${it.phase}, ${it.phaseProgress}\")\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
