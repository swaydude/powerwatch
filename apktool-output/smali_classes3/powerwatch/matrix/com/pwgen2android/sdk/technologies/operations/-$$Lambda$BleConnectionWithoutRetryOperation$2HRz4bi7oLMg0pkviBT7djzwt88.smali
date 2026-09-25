.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

.field public final synthetic f$1:Lcom/polidea/rxandroidble2/RxBleDevice;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;->f$1:Lcom/polidea/rxandroidble2/RxBleDevice;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;->f$1:Lcom/polidea/rxandroidble2/RxBleDevice;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;->lambda$2HRz4bi7oLMg0pkviBT7djzwt88(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)V

    return-void
.end method
