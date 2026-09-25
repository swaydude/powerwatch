.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;

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

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda$e8t5ki0XMYRSuZ_ATzBqRnKwiNE(Ljava/lang/Boolean;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    return-object p1
.end method
