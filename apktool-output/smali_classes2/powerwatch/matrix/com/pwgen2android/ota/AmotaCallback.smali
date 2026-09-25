.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;
.super Ljava/lang/Object;
.source "AmotaCallback.java"


# virtual methods
.method public abstract connectingToDevice()V
.end method

.method public abstract otaFailed(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "detail"
        }
    .end annotation
.end method

.method public abstract otaProcessStarted()V
.end method

.method public abstract otaStarted()V
.end method

.method public abstract otaSuccess()V
.end method

.method public abstract progressUpdate(I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "progress"
        }
    .end annotation
.end method

.method public abstract sendFwDataState(Z)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "state"
        }
    .end annotation
.end method

.method public abstract sendVerifyState(Z)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "state"
        }
    .end annotation
.end method
