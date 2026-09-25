.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    check-cast p1, Lcom/polidea/rxandroidble2/RxBleDeviceServices;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->lambda$B6lryC0leN7woRt5Ny5_Nfa7jZ8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleDeviceServices;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
