.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->lambda$36iyNS0Ww2tyHprrN2kI_M8Qrs8(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p1

    return-object p1
.end method
