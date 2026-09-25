.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lambda$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
