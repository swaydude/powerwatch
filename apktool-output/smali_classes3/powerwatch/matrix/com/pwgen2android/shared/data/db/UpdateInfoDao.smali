.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;
.super Ljava/lang/Object;
.source "UpdateInfoDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0008\u0010\t\u001a\u00020\u0004H\'J\u0008\u0010\n\u001a\u00020\u0004H\'J\u0008\u0010\u000b\u001a\u00020\u0008H\u0007J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\rH\'J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000fH\'\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;",
        "",
        "()V",
        "add",
        "",
        "item",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
        "addCompletable",
        "Lio/reactivex/Completable;",
        "delete",
        "deleteAll",
        "deleteCompletable",
        "get",
        "Lio/reactivex/Maybe;",
        "observeUpdateInfo",
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

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V

    return-void
.end method

.method private static final deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->delete()V

    return-void
.end method

.method public static synthetic lambda$U4zmhhBcvzqst5fw_mVkAWlfyR0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->deleteCompletable$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V

    return-void
.end method

.method public static synthetic lambda$XTYwcrFsufTBhpFakoQVbK-WqsA(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;->addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V

    return-void
.end method


# virtual methods
.method public abstract add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V
.end method

.method public final addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UpdateInfoDao$XTYwcrFsufTBhpFakoQVbK-WqsA;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UpdateInfoDao$XTYwcrFsufTBhpFakoQVbK-WqsA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            add(item)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract delete()V
.end method

.method public abstract deleteAll()V
.end method

.method public final deleteCompletable()Lio/reactivex/Completable;
    .locals 2

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UpdateInfoDao$U4zmhhBcvzqst5fw_mVkAWlfyR0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UpdateInfoDao$U4zmhhBcvzqst5fw_mVkAWlfyR0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            delete()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public abstract get()Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract observeUpdateInfo()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;",
            ">;"
        }
    .end annotation
.end method
