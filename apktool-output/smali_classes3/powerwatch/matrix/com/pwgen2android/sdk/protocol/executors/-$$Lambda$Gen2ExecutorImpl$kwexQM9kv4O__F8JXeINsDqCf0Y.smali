.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$kwexQM9kv4O__F8JXeINsDqCf0Y(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    move-result-object p1

    return-object p1
.end method
