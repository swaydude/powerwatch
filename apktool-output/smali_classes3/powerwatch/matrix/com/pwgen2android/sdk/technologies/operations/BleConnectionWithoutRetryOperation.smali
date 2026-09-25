.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;
.super Ljava/lang/Object;
.source "BleConnectionWithoutRetryOperation.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation<",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "Lio/reactivex/Observable<",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "Lio/reactivex/Observable;",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "()V",
        "executeOperation",
        "input",
        "accessoryProvider",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final executeOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)V
    .locals 0

    const-string p2, "$accessoryProvider"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$input"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-interface {p1}, Lcom/polidea/rxandroidble2/RxBleDevice;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    const-string p2, "input.macAddress"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->clear(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$2HRz4bi7oLMg0pkviBT7djzwt88(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;->executeOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public executeOperation(Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/RxBleDevice;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/RxBleConnection;",
            ">;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessoryProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 12
    invoke-interface {p1, v0}, Lcom/polidea/rxandroidble2/RxBleDevice;->establishConnection(Z)Lio/reactivex/Observable;

    move-result-object v0

    .line 13
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;

    invoke-direct {v1, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 16
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p2

    check-cast p2, Lio/reactivex/ObservableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "input.establishConnection(false)\n                .doOnError {\n                    accessoryProvider.clear(input.macAddress)\n                }\n                .onErrorResumeNext(Observable.empty())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic executeOperation(Ljava/lang/Object;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Ljava/lang/Object;
    .locals 0

    .line 8
    check-cast p1, Lcom/polidea/rxandroidble2/RxBleDevice;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;->executeOperation(Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
