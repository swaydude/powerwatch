.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;
.super Ljava/lang/Object;
.source "UserDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0008\u0010\t\u001a\u00020\u0004H\'J\u0008\u0010\n\u001a\u00020\u0004H\'J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\'J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000eH\'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "",
        "()V",
        "addUser",
        "",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "addUserCompletable",
        "Lio/reactivex/Completable;",
        "delete",
        "deleteAll",
        "getUser",
        "Lio/reactivex/Maybe;",
        "observeUser",
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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final addUserCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$AI86tPcR4JxnnIlDXSx15LNhDQ0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUserCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method


# virtual methods
.method public abstract addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
.end method

.method public final addUserCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            addUser(user)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract delete()V
.end method

.method public abstract deleteAll()V
.end method

.method public abstract getUser()Lio/reactivex/Maybe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end method

.method public abstract observeUser()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation
.end method

.method public abstract user()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
.end method
