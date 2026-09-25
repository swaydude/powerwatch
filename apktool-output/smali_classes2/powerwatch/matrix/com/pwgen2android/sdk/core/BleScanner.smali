.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;
.super Ljava/lang/Object;
.source "BleScanner.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;",
        "",
        "scan",
        "Lio/reactivex/Observable;",
        "Lcom/polidea/rxandroidble2/scan/ScanResult;",
        "bleScannerConfiguration",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
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
.method public abstract scan(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/scan/ScanResult;",
            ">;"
        }
    .end annotation
.end method
