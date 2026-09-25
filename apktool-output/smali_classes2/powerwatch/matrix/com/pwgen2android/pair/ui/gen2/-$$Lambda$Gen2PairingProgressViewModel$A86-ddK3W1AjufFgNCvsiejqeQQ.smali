.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda$A86-ddK3W1AjufFgNCvsiejqeQQ(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
