.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lkotlin/Pair;


# direct methods
.method public synthetic constructor <init>(Lkotlin/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts;->f$0:Lkotlin/Pair;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts;->f$0:Lkotlin/Pair;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda$cslOkVeXjZo8Kojm3M4mLUcK3Ts(Lkotlin/Pair;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
