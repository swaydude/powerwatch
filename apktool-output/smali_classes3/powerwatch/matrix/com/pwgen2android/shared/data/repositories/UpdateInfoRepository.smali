.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;
.super Ljava/lang/Object;
.source "UpdateInfoRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;",
        "delete",
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
.method public abstract delete()Lio/reactivex/Completable;
.end method
