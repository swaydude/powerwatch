.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;
.super Ljava/lang/Object;
.source "DefaultPhoneWatchDao.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;",
        "",
        "()V",
        "add",
        "",
        "item",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;",
        "addCompletable",
        "Lio/reactivex/Completable;",
        "getFirst",
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

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V

    return-void
.end method

.method public static synthetic lambda$f4oCoC1C70fcqO-r8nW_G-SCHJ4(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;->addCompletable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V

    return-void
.end method


# virtual methods
.method public abstract add(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V
.end method

.method public final addCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DefaultPhoneWatchDao$f4oCoC1C70fcqO-r8nW_G-SCHJ4;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/-$$Lambda$DefaultPhoneWatchDao$f4oCoC1C70fcqO-r8nW_G-SCHJ4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        add(item)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract getFirst()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;
.end method
