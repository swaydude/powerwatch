.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lcom/polidea/rxandroidble2/RxBleDevice;


# direct methods
.method public synthetic constructor <init>(Lcom/polidea/rxandroidble2/RxBleDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig;->f$0:Lcom/polidea/rxandroidble2/RxBleDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig;->f$0:Lcom/polidea/rxandroidble2/RxBleDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->lambda$OtQyhDgb9OEwufUqYmoykY4DPig(Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p1

    return-object p1
.end method
