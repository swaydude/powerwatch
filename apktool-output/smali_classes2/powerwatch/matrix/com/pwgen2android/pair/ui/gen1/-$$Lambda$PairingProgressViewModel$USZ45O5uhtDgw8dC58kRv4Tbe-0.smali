.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda$USZ45O5uhtDgw8dC58kRv4Tbe-0(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
