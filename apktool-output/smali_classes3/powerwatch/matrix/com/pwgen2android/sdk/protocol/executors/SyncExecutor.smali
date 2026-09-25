.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;
.super Ljava/lang/Object;
.source "Executors.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u000f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0096\u0001J3\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J=\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\nH\u0096\u0001J.\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J4\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u001a0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;",
        "dataTransferExecutor",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V",
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
.field private final dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V
    .locals 1

    const-string v0, "dataTransferExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    .line 213
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-void
.end method

.method public static synthetic lambda$7uu-JsNasV3rSk86d4zzxDYW5fM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferDataWithProgress$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$G7xD_V9z14oJkgcKZXtz53W90uE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$JchZZHKWrQCuawZH2lc9IaAVu_w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OKsUgfsMVCThefYpvRjH1KJ3BR0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$XPLh56R1w7ivw9_RbbEE9S7VygI(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$joblcyYRyTWXNLqp35lH18XnBD8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xVfqs7hz8niixOIs22STc2JilsA(Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->transferDataWithProgress$lambda-5(Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final transferData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityLogCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V

    move-object v3, v0

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

.method private static final transferData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getActivityLogs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x120

    if-le v0, v1, :cond_0

    .line 219
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ClearActivityLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ClearActivityLogCommand;-><init>()V

    move-object v4, p0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->sendAndWait$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FIILjava/lang/Object;)Lio/reactivex/Observable;

    .line 221
    :cond_0
    invoke-static {p2}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferData$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RunningLogCommand;-><init>()V

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

.method private static final transferData$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ClearRunningLogCommand;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ClearRunningLogCommand;-><init>()V

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

.method private static final transferData$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 225
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SoffCommand;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SoffCommand;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    const v1, 0x3d23d70a    # 0.04f

    mul-float p2, p2, v1

    invoke-virtual {p0, p1, v0, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final transferDataWithProgress$lambda-5(Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 2

    const-string v0, "progress"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final transferDataWithProgress$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 2

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    new-instance v0, Lkotlin/Pair;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->getKoin()Lorg/koin/core/Koin;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->observeProgress()Lio/reactivex/Observable;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    invoke-interface {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->send(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;

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

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;->sendAndWait(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FI)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public transferData(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;F)Lio/reactivex/Observable;
    .locals 8
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

    .line 215
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->dataTransferExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    const p3, 0x3f4ccccd    # 0.8f

    mul-float v5, p4, p3

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferData$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    .line 216
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$JchZZHKWrQCuawZH2lc9IaAVu_w;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$JchZZHKWrQCuawZH2lc9IaAVu_w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 217
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$joblcyYRyTWXNLqp35lH18XnBD8;

    invoke-direct {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$joblcyYRyTWXNLqp35lH18XnBD8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 223
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$OKsUgfsMVCThefYpvRjH1KJ3BR0;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$OKsUgfsMVCThefYpvRjH1KJ3BR0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 224
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$XPLh56R1w7ivw9_RbbEE9S7VygI;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$XPLh56R1w7ivw9_RbbEE9S7VygI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    .line 225
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$G7xD_V9z14oJkgcKZXtz53W90uE;

    invoke-direct {p3, p0, p1, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$G7xD_V9z14oJkgcKZXtz53W90uE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;Ljava/lang/String;F)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "dataTransferExecutor.transferData(uid, pairingConfig, power = 0.8f * power)\n                .flatMap { sendAndWait(uid, ActivityLogCommand(logger), it, 0.02f * power) }\n                .flatMap {\n                    if (it.activityLogs.size > 288) {\n                        sendAndWait(uid, ClearActivityLogCommand(), it)\n                    }\n                    Observable.just(it)\n                }\n                .flatMap { sendAndWait(uid, RunningLogCommand(), it, 0.02f * power) }\n                .flatMap { sendAndWait(uid, ClearRunningLogCommand(), it, 0.02f * power) }\n                .flatMap { send(uid, SoffCommand(), it, 0.04f * power) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public transferDataWithProgress(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)Lio/reactivex/Observable;
    .locals 8
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

    .line 230
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->observeProgress()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;

    .line 231
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 232
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferData$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;

    .line 234
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 229
    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "merge(\n                observeProgress()\n                        .map { progress -> Pair(progress, null) },\n                transferData(uid, pairingConfig, power = phasePower)\n\n                        .map { data -> Pair(100, data) }\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
