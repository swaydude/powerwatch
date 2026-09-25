.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda$wG0eesOTZWCe0M32Gfv7mvSSNok(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
