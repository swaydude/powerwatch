.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;
.super Ljava/lang/Object;
.source "DeviceRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/CountRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository<",
        "Ljava/lang/String;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/CountRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008f\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u00020\u00082\u00020\t2\u0008\u0012\u0004\u0012\u00020\u00020\nJ\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH&J\u0008\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeleteRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/CountRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;",
        "defaultDevice",
        "Lio/reactivex/Single;",
        "isEmpty",
        "",
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
.method public abstract defaultDevice()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isEmpty()Z
.end method
