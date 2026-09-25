.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

.field public final synthetic f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->lambda$Pt8ovEh5X9y6kG7VWuxqXOYi0TI(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    move-result-object p1

    return-object p1
.end method
