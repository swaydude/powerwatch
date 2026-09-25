.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo;

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

    check-cast p1, Ljava/lang/Number;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;->lambda$-aTIMPS2DNBhqTuGQmgaL6rBnxo(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
