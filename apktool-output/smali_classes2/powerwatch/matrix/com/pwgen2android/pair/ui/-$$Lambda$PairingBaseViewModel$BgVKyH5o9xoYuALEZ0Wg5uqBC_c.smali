.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/-$$Lambda$PairingBaseViewModel$BgVKyH5o9xoYuALEZ0Wg5uqBC_c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/-$$Lambda$PairingBaseViewModel$BgVKyH5o9xoYuALEZ0Wg5uqBC_c;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/-$$Lambda$PairingBaseViewModel$BgVKyH5o9xoYuALEZ0Wg5uqBC_c;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;->lambda$BgVKyH5o9xoYuALEZ0Wg5uqBC_c(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-result-object p1

    return-object p1
.end method
