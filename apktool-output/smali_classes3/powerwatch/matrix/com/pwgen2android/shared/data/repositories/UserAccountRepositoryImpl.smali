.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;
.super Ljava/lang/Object;
.source "UserAccountRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userDao",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;",
        "userAccountCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V",
        "delete",
        "Lio/reactivex/Completable;",
        "item",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "forgotPassword",
        "email",
        "",
        "getFirst",
        "Lio/reactivex/Single;",
        "fromCache",
        "",
        "forceCache",
        "load",
        "Lio/reactivex/Observable;",
        "resendEmail",
        "resetPassword",
        "oldPassword",
        "newPassword",
        "save",
        "toCacheOnly",
        "update",
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


# instance fields
.field private final tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

.field private final userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

.field private final userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 1

    const-string v0, "userDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    .line 24
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    .line 25
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    return-void
.end method

.method private static final delete$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->delete()V

    return-void
.end method

.method private static final getFirst$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->getUser()Lio/reactivex/Maybe;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Maybe;->toSingle()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method public static synthetic lambda$e0M7Ma7La22OKRLmr_hFAr54c9g(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->update$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$npLwLiGLGT52yPvaBFqqi7eQZzM(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->delete$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;)V

    return-void
.end method

.method public static synthetic lambda$pQL01qHAqT97CaMUzPkyT8mS6dg(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->getFirst$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method private static final update$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$item"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/16 v15, 0x5ff

    const/16 v16, 0x0

    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUserCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic delete(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 23
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public delete(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$npLwLiGLGT52yPvaBFqqi7eQZzM;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$npLwLiGLGT52yPvaBFqqi7eQZzM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;)V

    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n            userDao.delete()\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->forgotUserPassword(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

# PW_OFFLINE PATCH v2: fallback User for getFirst() when the Room table is empty
# (fresh install / pre-first-wheel-save). Mirrors LoginCloudServiceImpl.login().
# Lives in a static helper instead of inlining because the constant's 13-register
# range ctor needs v0-v15, which would collide with the live Maybe/Function
# registers in getFirst().
# uid = 0 (v1 emitted uid = 1 here — that was a latent bug): WatchSettingsVM
# consumes getFirst for the watch+app fields (clock/units/language) and the wheel
# save paths copy THAT user, so with uid = 1 the INSERT OR REPLACE landed on a
# uid = 1 row while every UserDao query reads `WHERE uid = 0` — saved values
# could never be read back. All fallback constants now use uid = 0 so every
# write lands on the row the DAO reads. (No pairing/other code consumes
# getFirst's uid: the only in-app caller is WatchSettingsVM.)
.method private static pwDefaultUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    .locals 16

    const-wide/16 v1, 0x0              # uid = 0L (v1-v2) — the row the UserDao queries read
    const/4 v3, 0x1                    # enabled = true
    const-string v4, "Test"            # name
    const-string v5, "test@test.com"   # email
    const-string v6, "test1234"        # password
    const/16 v7, 0x19                  # age = 25
    const/16 v8, 0xb4                  # height = 180
    const v9, 0x42800000               # weight = 80.0f
    const-string v10, "Male"           # gender
    const/4 v11, 0x0                   # shouldSync = false
    const-string v13, "en_US"          # settings.language
    const-string v14, "metric"         # settings.unitType
    const/4 v15, 0x0                   # settings.timeFormatType (0 => 24h default)
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;
    invoke-direct/range {v12 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V

    return-object v0
.end method

.method public getFirst(ZZ)Lio/reactivex/Single;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    # --- OFFLINE PATCH v2: emit the ACTUAL Room user row; fall back to the offline
    # constant User (pwDefaultUser(), uid = 1 — same value v1 emitted) ONLY when the
    # table is empty. v1 always returned the constant, which masked wheel-saved values
    # (clock 12/24h, units, language): update() wrote them to Room (INSERT OR REPLACE)
    # and pushed them to the watch, but this read side never surfaced them, so the app
    # display reverted to defaults ("watch + app settings not saved").
    # userDao.getUser() is a Maybe that completes EMPTY when there is no row (unlike
    # observeUser(), which emits a NULL element), so pwOrDefault's null check cannot
    # cover it: map(pwOrDefault).defaultIfEmpty(constant).toSingle(). The constant is
    # built inside pwDefaultUser() precisely so this method needs only v1 (Maybe) and
    # v2 (Function) — no collision with the 13-register range ctor the constant needs.
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->getUser()Lio/reactivex/Maybe;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl$pwOrDefault;

    invoke-direct {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl$pwOrDefault;-><init>()V

    invoke-virtual {v1, v2}, Lio/reactivex/Maybe;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Maybe;

    move-result-object v1

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->pwDefaultUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Maybe;->defaultIfEmpty(Ljava/lang/Object;)Lio/reactivex/Maybe;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Maybe;->toSingle()Lio/reactivex/Single;

    move-result-object v1

    return-object v1

    if-nez p1, :cond_0

    .line 57
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->getUser()Lio/reactivex/Single;

    move-result-object p1

    .line 58
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$pQL01qHAqT97CaMUzPkyT8mS6dg;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$pQL01qHAqT97CaMUzPkyT8mS6dg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "{\n            userAccountCloudService.getUser()\n                    .onErrorResumeNext { userDao.getUser().toSingle() }\n        }"

    .line 56
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 60
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->getUser()Lio/reactivex/Maybe;

    move-result-object p1

    .line 61
    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "User doesn\'t exist"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p2

    check-cast p2, Lio/reactivex/SingleSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Maybe;->switchIfEmpty(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "{\n            userDao.getUser()\n                    .switchIfEmpty(Single.error(Throwable(\"User doesn\'t exist\")))\n        }"

    .line 59
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->getUser()Lio/reactivex/Maybe;

    move-result-object p1

    .line 64
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->getUser()Lio/reactivex/Single;

    move-result-object p2

    check-cast p2, Lio/reactivex/SingleSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Maybe;->switchIfEmpty(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "{\n            userDao.getUser()\n                    .switchIfEmpty(userAccountCloudService.getUser())\n        }"

    .line 62
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public load(ZZ)Lio/reactivex/Observable;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    # --- OFFLINE PATCH v2: read the ACTUAL Room user row via the vendor's own
    # observeUser() query (WHERE uid = 0 — the same row update() writes from this
    # stream, so wheel-saved clock 12/24h, units, language now reach the UI); fall
    # back to the offline constant ONLY for a NULL emission (empty table, fresh
    # install) via pwOrDefault. That null-fallback half is what v1's crash fix
    # actually needed (userSubject was dry -> lateinit user unset ->
    # UninitializedPropertyAccessException on Save in SingleWheelViewModel); v1's
    # unconditional constant was what masked saved values instead ("watch + app
    # settings not saved"). observeUser() re-emits on row change, so the
    # BehaviorSubject also refreshes in-session after a wheel save.
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->observeUser()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl$pwOrDefault;

    invoke-direct {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl$pwOrDefault;-><init>()V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    return-object v1

    if-nez p1, :cond_0

    .line 70
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->getUser()Lio/reactivex/Single;

    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p1

    .line 72
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->observeUser()Lio/reactivex/Observable;

    move-result-object p2

    check-cast p2, Lio/reactivex/ObservableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "{\n            userAccountCloudService.getUser()\n                    .toObservable()\n                    .onErrorResumeNext(userDao.observeUser())\n        }"

    .line 69
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 74
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->observeUser()Lio/reactivex/Observable;

    move-result-object p1

    .line 75
    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "User doesn\'t exist"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p2

    check-cast p2, Lio/reactivex/ObservableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->switchIfEmpty(Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "{\n            userDao.observeUser()\n                    .switchIfEmpty(Observable.error(Throwable(\"User doesn\'t exist\")))\n        }"

    .line 73
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->observeUser()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public resendEmail(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->resendVerifyEmail(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public resetPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "oldPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newPassword"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->resetUserPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->updatePassword(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p2

    check-cast p2, Lio/reactivex/CompletableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "userAccountCloudService.resetUserPassword(oldPassword, newPassword)\n                .andThen(tokenProvider.updatePassword(newPassword))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic save(Ljava/lang/Object;Z)Lio/reactivex/Completable;
    .locals 0

    .line 23
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Z)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Z)Lio/reactivex/Completable;
    .locals 1

    const-string p2, "item"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->addUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p2

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUserCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {p2, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "userAccountCloudService.addUser(item)\n                .andThen(userDao.addUserCompletable(item))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic update(Ljava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    .line 23
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public update(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userAccountCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;->updateUser(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object v0

    .line 44
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->userDao:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;->addUserCompletable(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 45
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "userAccountCloudService.updateUser(item)\n                .andThen(userDao.addUserCompletable(item))\n                .onErrorResumeNext { userDao.addUserCompletable(item.copy(shouldSync = true)) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
