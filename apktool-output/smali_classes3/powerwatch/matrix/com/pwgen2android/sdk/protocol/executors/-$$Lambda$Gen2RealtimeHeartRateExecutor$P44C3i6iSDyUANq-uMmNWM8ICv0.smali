.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->lambda$P44C3i6iSDyUANq-uMmNWM8ICv0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p1

    return p1
.end method
