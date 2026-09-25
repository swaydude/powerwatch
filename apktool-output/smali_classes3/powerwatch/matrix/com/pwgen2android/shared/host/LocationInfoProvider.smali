.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;
.super Ljava/lang/Object;
.source "LocationInfoProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00080\u0007H&J\u001c\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00080\u0007H&J\u0012\u0010\u000c\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0008\u0010\u0013\u001a\u00020\u0014H&R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0005\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "",
        "isProviderEnabled",
        "Lio/reactivex/Observable;",
        "",
        "()Lio/reactivex/Observable;",
        "getLastKnownLocation",
        "Lio/reactivex/Single;",
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "getLastStoredLocation",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "isLocationValid",
        "gpsPosition",
        "showDialog",
        "",
        "activityContext",
        "Landroid/content/Context;",
        "showDialogForLocation",
        "updateLocationInternal",
        "Lio/reactivex/Completable;",
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
.method public abstract getLastKnownLocation()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Landroid/location/Location;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getLastStoredLocation()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract isLocationValid(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)Z
.end method

.method public abstract isProviderEnabled()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract showDialog(Landroid/content/Context;)V
.end method

.method public abstract showDialogForLocation(Landroid/content/Context;)V
.end method

.method public abstract updateLocationInternal()Lio/reactivex/Completable;
.end method
