.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$7uu-JsNasV3rSk86d4zzxDYW5fM;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->lambda$7uu-JsNasV3rSk86d4zzxDYW5fM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
