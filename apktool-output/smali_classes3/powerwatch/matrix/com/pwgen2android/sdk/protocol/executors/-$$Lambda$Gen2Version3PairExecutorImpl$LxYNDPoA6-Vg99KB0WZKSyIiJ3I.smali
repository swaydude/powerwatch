.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;->lambda$LxYNDPoA6-Vg99KB0WZKSyIiJ3I(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    return-object p1
.end method
