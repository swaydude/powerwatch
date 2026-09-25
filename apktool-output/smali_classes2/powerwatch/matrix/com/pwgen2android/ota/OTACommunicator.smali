.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;
.super Ljava/lang/Object;
.source "OTACommunicator.java"


# virtual methods
.method public abstract receivedData()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation
.end method

.method public abstract sendMessage(Ljava/lang/String;[B)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "deviceId",
            "data"
        }
    .end annotation
.end method
