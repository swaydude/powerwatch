.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;
.super Ljava/lang/Object;
.source "BleAccessoryCreatorOperation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH&\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;",
        "",
        "executeOperation",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "bleConnection",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "protocolCreator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
        "bleDevice",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
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


# virtual methods
.method public abstract executeOperation(Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/RxBleConnection;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
            "Lcom/polidea/rxandroidble2/RxBleDevice;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation
.end method
