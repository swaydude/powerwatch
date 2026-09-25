.class public final Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;
.super Lcom/google/android/gms/vision/Tracker;
.source "CameraReader.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/Tracker<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\r\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;",
        "Lcom/google/android/gms/vision/Tracker;",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        "l",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;",
        "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V",
        "getL",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;",
        "onNewItem",
        "",
        "p0",
        "",
        "p1",
        "onUpdate",
        "Lcom/google/android/gms/vision/Detector$Detections;",
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

    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/vision/Tracker;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    return-void
.end method


# virtual methods
.method public final getL()Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    return-object v0
.end method

.method public onNewItem(ILcom/google/android/gms/vision/barcode/Barcode;)V
    .locals 0

    .line 26
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/vision/Tracker;->onNewItem(ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onNewItem(ILjava/lang/Object;)V
    .locals 0

    .line 24
    check-cast p2, Lcom/google/android/gms/vision/barcode/Barcode;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;->onNewItem(ILcom/google/android/gms/vision/barcode/Barcode;)V

    return-void
.end method

.method public onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Lcom/google/android/gms/vision/barcode/Barcode;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector$Detections<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ")V"
        }
    .end annotation

    .line 31
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/vision/Tracker;->onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Ljava/lang/Object;)V

    .line 32
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;->l:Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;->onResult(Lcom/google/android/gms/vision/barcode/Barcode;)V

    return-void
.end method

.method public bridge synthetic onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Ljava/lang/Object;)V
    .locals 0

    .line 24
    check-cast p2, Lcom/google/android/gms/vision/barcode/Barcode;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/MyTracker;->onUpdate(Lcom/google/android/gms/vision/Detector$Detections;Lcom/google/android/gms/vision/barcode/Barcode;)V

    return-void
.end method
