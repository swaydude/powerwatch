.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncExecutor$xVfqs7hz8niixOIs22STc2JilsA;

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

    check-cast p1, Ljava/lang/Integer;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncExecutor;->lambda$xVfqs7hz8niixOIs22STc2JilsA(Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
