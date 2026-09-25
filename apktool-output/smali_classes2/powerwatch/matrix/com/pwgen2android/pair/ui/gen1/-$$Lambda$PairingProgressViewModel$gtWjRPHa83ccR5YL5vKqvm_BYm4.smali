.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda$gtWjRPHa83ccR5YL5vKqvm_BYm4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method
