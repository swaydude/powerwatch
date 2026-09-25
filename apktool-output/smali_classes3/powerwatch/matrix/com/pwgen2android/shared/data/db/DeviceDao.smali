.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;
.super Ljava/lang/Object;
.source "DeviceDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0008\u0010\t\u001a\u00020\nH\'J\u0008\u0010\u000b\u001a\u00020\u0004H\'J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00120\u0011H\'J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\r\u001a\u00020\u000eH\'J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0011H\'J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00120\u0011H\'J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0018H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;",
        "",
        "()V",
        "addDevice",
        "",
        "device",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "addDeviceCompletable",
        "Lio/reactivex/Completable;",
        "count",
        "",
        "deleteAll",
        "deleteDevice",
        "serialNumber",
        "",
        "deleteDeviceCompletable",
        "getAllDevices",
        "Lio/reactivex/Single;",
        "",
        "getDevice",
        "Lio/reactivex/Maybe;",
        "getFirst",
        "getNotRegisteredDevices",
        "observeFirst",
        "Lio/reactivex/Observable;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final addDeviceCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method private static final deleteDeviceCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteDevice(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$WugXy_0K45EyccPpCrsdWqOd2j8(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->deleteDeviceCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$yfVIt6TeidUdFSsDp6InGZzbWYk(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;->addDeviceCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method


# virtual methods
.method public abstract addDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
.end method

.method public final addDeviceCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DeviceDao$yfVIt6TeidUdFSsDp6InGZzbWYk;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DeviceDao$yfVIt6TeidUdFSsDp6InGZzbWYk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addDevice(device)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract count()I
.end method

.method public abstract deleteAll()V
.end method

.method public abstract deleteDevice(Ljava/lang/String;)V
.end method

.method public final deleteDeviceCompletable(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DeviceDao$WugXy_0K45EyccPpCrsdWqOd2j8;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DeviceDao$WugXy_0K45EyccPpCrsdWqOd2j8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            deleteDevice(serialNumber)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract getAllDevices()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getDevice(Ljava/lang/String;)Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFirst()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNotRegisteredDevices()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract observeFirst()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end method
