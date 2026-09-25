.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lambda$skgDTm9d3xWygPVah3IIZr5BpVk(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    return-object p1
.end method
