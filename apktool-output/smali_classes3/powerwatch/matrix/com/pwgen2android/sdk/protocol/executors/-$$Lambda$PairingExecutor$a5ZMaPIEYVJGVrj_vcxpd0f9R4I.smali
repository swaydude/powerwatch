.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I;

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

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;->lambda$a5ZMaPIEYVJGVrj_vcxpd0f9R4I(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
