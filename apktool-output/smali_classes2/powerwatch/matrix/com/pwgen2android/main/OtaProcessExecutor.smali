.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;
.super Ljava/lang/Object;
.source "OtaProcessExecutorImpl.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0008\u0010\u0007\u001a\u00020\u0008H&J0\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003H&J\u0008\u0010\u0010\u001a\u00020\u0008H&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;",
        "",
        "isOtaInProgress",
        "",
        "otaOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "resetExecutorState",
        "",
        "startOTA",
        "downloadURL",
        "",
        "updateInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "deviceID",
        "expectVersionUpgrade",
        "stopOTA",
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
.method public abstract isOtaInProgress()Z
.end method

.method public abstract otaOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
            ">;"
        }
    .end annotation
.end method

.method public abstract resetExecutorState()V
.end method

.method public abstract startOTA(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;Z)V
.end method

.method public abstract stopOTA()V
.end method
