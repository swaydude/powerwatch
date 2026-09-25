.class public Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;
.super Ljava/lang/Object;
.source "Executors.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0008H\u0096\u0001J\u000f\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J3\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J=\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000bH\u0096\u0001J.\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J7\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0014H\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "dataTransferExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V",
        "getKoin",
        "Lorg/koin/core/Koin;",
        "observeProgress",
        "Lio/reactivex/Observable;",
        "",
        "send",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
        "uid",
        "",
        "command",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
        "dataInfo",
        "power",
        "",
        "sendAndWait",
        "timeout",
        "transferData",
        "pairingConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "transferDataWithProgress",
        "Lkotlin/Pair;",
        "phasePower",
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
.field private final dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dataTransferExecutor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    .line 139
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->setProtocolType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 136
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    .line 134
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V

    return-void
.end method

.method public static synthetic lambda$3JkTcEKh6j_nA3hfiwbYjrQn1g4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8Q779PUTTOT4M_Q2NM_C7PDc03I(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$IC3z3TYXk5he-9Wl8HJ3XvfL3Bs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JHHjLrjpxHABt3Wz8ATBpyUybTo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$PdCpIrD3OQgo4ZtSDIXlkdO2_HU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$UywBmFG_uWZEMp8bSVSGZcQPvNY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$V29OLGXwHMzvu6b8rkKylEAvswY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WBhH9ApHiB9pnWv3GmQy3lRVH_M(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_dhtvclMDm97gWoq-9-h6Wxt2KE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$hP-oO2EmOxYFWeShqnS2nM26XbQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$piT5tRJWhCjK-GbYRkidRPd9Oi8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$raPhkwh9VSZ0R5uZtsaEqn6a5Qs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tJURL3YInmk8Tert-fpuld3bCIg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->transferData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUTCWithTimezone;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUTCWithTimezone;-><init>()V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/GetWrittenDataRequest;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/GetWrittenDataRequest;-><init>()V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3dcccccd    # 0.1f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ReadGoalsCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ReadGoalsCommand;-><init>()V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3df5c28f    # 0.12f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WritePairCodeCommand;

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WritePairCodeCommand;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3ca3d70a    # 0.02f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteSaveDataCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteSaveDataCommand;-><init>()V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3ca3d70a    # 0.02f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteHourFormat;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;->getTwelveHourFormat()Z

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteHourFormat;-><init>(Z)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUnitsFormat;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;->getMetricsFormat()Z

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUnitsFormat;-><init>(Z)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUserInfoData;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteUserInfoData;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ReadUserInfoData;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ReadUserInfoData;-><init>()V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3dcccccd    # 0.1f

    mul-float v5, p2, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteStepsGoalCommand;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getStepsGoal()I

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteStepsGoalCommand;-><init>(I)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteCaloriesGoalCommand;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getCaloriesGoal()I

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteCaloriesGoalCommand;-><init>(I)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3d4ccccd    # 0.05f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteDistanceGoalCommand;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getDistanceGoal()F

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteDistanceGoalCommand;-><init>(F)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3ca3d70a    # 0.02f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteSleepGoalCommand;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getSleepGoal()I

    move-result p2

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WriteSleepGoalCommand;-><init>(I)V

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p0, 0x3ca3d70a    # 0.02f

    mul-float v5, p3, p0

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, p4

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->getKoin()Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public observeProgress()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->observeProgress()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "command"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    invoke-virtual {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public sendAndWait(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FI)Lio/reactivex/Observable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "FI)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "command"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->sendAndWait(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FI)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public transferData(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;

    invoke-direct {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchInfoRequest;-><init>()V

    move-object v3, p3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const p3, 0x3dcccccd    # 0.1f

    mul-float v5, p4, p3

    const/4 v4, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p3

    .line 144
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$JHHjLrjpxHABt3Wz8ATBpyUybTo;

    invoke-direct {v0, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$JHHjLrjpxHABt3Wz8ATBpyUybTo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 145
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$UywBmFG_uWZEMp8bSVSGZcQPvNY;

    invoke-direct {v0, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$UywBmFG_uWZEMp8bSVSGZcQPvNY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 146
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$3JkTcEKh6j_nA3hfiwbYjrQn1g4;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$3JkTcEKh6j_nA3hfiwbYjrQn1g4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 147
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$WBhH9ApHiB9pnWv3GmQy3lRVH_M;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$WBhH9ApHiB9pnWv3GmQy3lRVH_M;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 148
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$IC3z3TYXk5he-9Wl8HJ3XvfL3Bs;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$IC3z3TYXk5he-9Wl8HJ3XvfL3Bs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 149
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$V29OLGXwHMzvu6b8rkKylEAvswY;

    invoke-direct {v0, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$V29OLGXwHMzvu6b8rkKylEAvswY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 151
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$_dhtvclMDm97gWoq-9-h6Wxt2KE;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$_dhtvclMDm97gWoq-9-h6Wxt2KE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 152
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$8Q779PUTTOT4M_Q2NM_C7PDc03I;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$8Q779PUTTOT4M_Q2NM_C7PDc03I;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 153
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$hP-oO2EmOxYFWeShqnS2nM26XbQ;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$hP-oO2EmOxYFWeShqnS2nM26XbQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p3

    .line 154
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;

    invoke-direct {v0, p0, p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 155
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$raPhkwh9VSZ0R5uZtsaEqn6a5Qs;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$raPhkwh9VSZ0R5uZtsaEqn6a5Qs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 157
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$piT5tRJWhCjK-GbYRkidRPd9Oi8;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$piT5tRJWhCjK-GbYRkidRPd9Oi8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 158
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$tJURL3YInmk8Tert-fpuld3bCIg;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$tJURL3YInmk8Tert-fpuld3bCIg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "sendAndWait(uid, WatchInfoRequest(), power = 0.1f * power, timeout = 15)\n                .flatMap { sendAndWait(uid, WriteUTCWithTimezone(), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, GetWrittenDataRequest(), it, 0.1f * power) }\n                .flatMap { sendAndWait(uid, WriteHourFormat(pairingConfig.unitsInfoData.twelveHourFormat), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, WriteUnitsFormat(pairingConfig.unitsInfoData.metricsFormat), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, WriteUserInfoData(pairingConfig.userInfoData), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, ReadUserInfoData(), it, 0.1f * power) }\n\n                .flatMap { sendAndWait(uid, WriteStepsGoalCommand(pairingConfig.goalInfoData.stepsGoal), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, WriteCaloriesGoalCommand(pairingConfig.goalInfoData.caloriesGoal), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, WriteDistanceGoalCommand(pairingConfig.goalInfoData.distanceGoal), it, 0.02f * power) }\n                .flatMap { sendAndWait(uid, WriteSleepGoalCommand(pairingConfig.goalInfoData.sleepGoal), it, 0.02f * power) }\n                .flatMap { sendAndWait(uid, ReadGoalsCommand(), it, 0.12f * power) }\n\n                .flatMap { sendAndWait(uid, WritePairCodeCommand(), it, 0.02f * power) }\n                .flatMap { sendAndWait(uid, WriteSaveDataCommand(), it, 0.02f * power) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public transferDataWithProgress(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
            "F)",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;",
            ">;>;"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    invoke-virtual {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->transferDataWithProgress(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
