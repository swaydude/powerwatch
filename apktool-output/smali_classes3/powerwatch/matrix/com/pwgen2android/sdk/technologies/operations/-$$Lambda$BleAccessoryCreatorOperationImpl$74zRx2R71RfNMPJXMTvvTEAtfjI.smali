.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

.field public final synthetic f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

.field public final synthetic f$3:Lcom/polidea/rxandroidble2/RxBleDevice;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$3:Lcom/polidea/rxandroidble2/RxBleDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$1:Lcom/polidea/rxandroidble2/RxBleConnection;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;->f$3:Lcom/polidea/rxandroidble2/RxBleDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->lambda$74zRx2R71RfNMPJXMTvvTEAtfjI(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
