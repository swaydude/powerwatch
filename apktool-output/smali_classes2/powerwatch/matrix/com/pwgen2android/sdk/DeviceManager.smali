.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;
.super Ljava/lang/Object;
.source "DeviceManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0008H&J\u0008\u0010\u0010\u001a\u00020\u000cH&J\u0008\u0010\u0011\u001a\u00020\u000cH&J\"\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00132\u0006\u0010\u0014\u001a\u00020\u00082\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "",
        "monitoringEvents",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;",
        "getMonitoringEvents",
        "()Lio/reactivex/Observable;",
        "connect",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "forceRefresh",
        "",
        "connectTo",
        "",
        "id",
        "",
        "defaultDevice",
        "destroy",
        "init",
        "readDeviceInfo",
        "Lio/reactivex/Single;",
        "deviceInfo",
        "device",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
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
.method public abstract connect(Z)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract connectTo(Ljava/lang/String;)V
.end method

.method public abstract defaultDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
.end method

.method public abstract destroy()V
.end method

.method public abstract getMonitoringEvents()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract init()V
.end method

.method public abstract readDeviceInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method
