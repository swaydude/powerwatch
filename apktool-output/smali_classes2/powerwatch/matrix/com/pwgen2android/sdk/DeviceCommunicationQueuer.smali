.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;
.super Ljava/lang/Object;
.source "DeviceCommunicationQueuer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0000\u0010\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "",
        "clear",
        "",
        "queue",
        "Lio/reactivex/Observable;",
        "T",
        "operation",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;",
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
.method public abstract clear()V
.end method

.method public abstract queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation
.end method
