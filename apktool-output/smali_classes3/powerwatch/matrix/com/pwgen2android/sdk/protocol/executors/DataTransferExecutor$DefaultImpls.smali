.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;
.super Ljava/lang/Object;
.source "Executors.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getKoin(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;)Lorg/koin/core/Koin;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic send$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 15

    if-nez p6, :cond_2

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e

    const/4 v12, 0x0

    move-object v4, v13

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fb

    const/4 v14, 0x0

    move-object v1, v0

    move-object v13, v14

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p3

    :goto_0
    and-int/lit8 v1, p5, 0x8

    if-eqz v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    goto :goto_1

    :cond_1
    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v1, p4

    :goto_1
    invoke-interface {p0, v3, v4, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: send"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 21

    if-nez p7, :cond_3

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e

    const/4 v12, 0x0

    move-object v4, v13

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fb

    const/4 v14, 0x0

    move-object v1, v0

    move-object v13, v14

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    goto :goto_0

    :cond_0
    move-object/from16 v18, p3

    :goto_0
    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v19, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    move/from16 v19, p4

    :goto_1
    and-int/lit8 v0, p6, 0x10

    if-eqz v0, :cond_2

    const/16 v0, 0x8

    const/16 v20, 0x8

    goto :goto_2

    :cond_2
    move/from16 v20, p5

    :goto_2
    move-object/from16 v15, p0

    move-object/from16 v16, p1

    move-object/from16 v17, p2

    invoke-interface/range {v15 .. v20}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->sendAndWait(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FI)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: sendAndWait"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic transferData$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 15

    if-nez p6, :cond_2

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e

    const/4 v12, 0x0

    move-object v4, v13

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1fb

    const/4 v14, 0x0

    move-object v1, v0

    move-object v13, v14

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p3

    :goto_0
    and-int/lit8 v1, p5, 0x8

    if-eqz v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    goto :goto_1

    :cond_1
    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v1, p4

    :goto_1
    invoke-interface {p0, v3, v4, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->transferData(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: transferData"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic transferDataWithProgress$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    .line 40
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->transferDataWithProgress(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: transferDataWithProgress"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
