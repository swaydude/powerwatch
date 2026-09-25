.class public final Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;
.super Ljava/lang/Object;
.source "CameraReader.kt"

# interfaces
.implements Lcom/google/android/gms/vision/MultiProcessor$Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/vision/MultiProcessor$Factory<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;",
        "Lcom/google/android/gms/vision/MultiProcessor$Factory;",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        "l",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;",
        "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V",
        "getL",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;",
        "create",
        "Lcom/google/android/gms/vision/Tracker;",
        "p0",
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
.field private final l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V
    .locals 1

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    return-void
.end method


# virtual methods
.method public create(Lcom/google/android/gms/vision/barcode/Barcode;)Lcom/google/android/gms/vision/Tracker;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ")",
            "Lcom/google/android/gms/vision/Tracker<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;"
        }
    .end annotation

    .line 15
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    invoke-direct {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V

    check-cast p1, Lcom/google/android/gms/vision/Tracker;

    return-object p1
.end method

.method public bridge synthetic create(Ljava/lang/Object;)Lcom/google/android/gms/vision/Tracker;
    .locals 0

    .line 13
    check-cast p1, Lcom/google/android/gms/vision/barcode/Barcode;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;->create(Lcom/google/android/gms/vision/barcode/Barcode;)Lcom/google/android/gms/vision/Tracker;

    move-result-object p1

    return-object p1
.end method

.method public final getL()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;
    .locals 1

    .line 13
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    return-object v0
.end method
