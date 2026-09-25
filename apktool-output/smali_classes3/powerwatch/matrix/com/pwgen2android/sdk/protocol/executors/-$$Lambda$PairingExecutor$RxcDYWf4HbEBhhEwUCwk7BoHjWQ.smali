.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ;

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

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;->lambda$RxcDYWf4HbEBhhEwUCwk7BoHjWQ(Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
