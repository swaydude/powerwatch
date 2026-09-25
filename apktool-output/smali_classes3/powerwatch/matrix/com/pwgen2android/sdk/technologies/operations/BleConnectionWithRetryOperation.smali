.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;
.super Ljava/lang/Object;
.source "BleConnectionWithRetryOperation.kt"

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
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "Lio/reactivex/Observable;",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "connectionPreference",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;)V",
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


# instance fields
.field private final connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;)V
    .locals 1

    const-string v0, "connectionPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    return-void
.end method


# virtual methods
.method public executeOperation(Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/Observable;
    .locals 1
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

    .line 37
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->isAutoConnectEnabled()Z

    move-result p2

    invoke-interface {p1, p2}, Lcom/polidea/rxandroidble2/RxBleDevice;->establishConnection(Z)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "input.establishConnection(connectionPreference.isAutoConnectEnabled())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic executeOperation(Ljava/lang/Object;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Ljava/lang/Object;
    .locals 0

    .line 34
    check-cast p1, Lcom/polidea/rxandroidble2/RxBleDevice;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;->executeOperation(Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
