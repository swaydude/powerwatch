.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;
.super Ljava/lang/Object;
.source "TokenStorage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0008J\u0006\u0010\r\u001a\u00020\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \t*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "",
        "tokenStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;)V",
        "tokenSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "kotlin.jvm.PlatformType",
        "add",
        "Lio/reactivex/Completable;",
        "passwordCredentials",
        "deleteToken",
        "get",
        "Lio/reactivex/Observable;",
        "hasToken",
        "",
        "updatePassword",
        "password",
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


# instance fields
.field private final tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

.field private final tokenSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;)V
    .locals 2

    const-string v0, "tokenStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    .line 37
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "create<Optional<PasswordCredentials>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 40
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;->get()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object p1

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final add$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 6

    const-string v0, "$passwordCredentials"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getExpiresIn()J

    move-result-wide v2

    const/16 v4, 0x3e8

    int-to-long v4, v4

    mul-long v2, v2, v4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->setTokenValidUntil(J)V

    .line 57
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    invoke-interface {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V

    .line 58
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final deleteToken$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;->delete()V

    .line 65
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$EQqMhoShQoZiATlJizVKK_cNAWc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->deleteToken$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    return-void
.end method

.method public static synthetic lambda$H__MWJYbydr_7HqBT6Weyb1YZIE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->updatePassword$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$f5XM1pChjlgXzAufjiT5GtUkSOs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    return-void
.end method

.method private static final updatePassword$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$password"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;->get()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/16 v14, 0xff

    const/4 v15, 0x0

    move-object/from16 v13, p1

    .line 48
    invoke-static/range {v2 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object v1

    .line 49
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenStorage:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V

    .line 50
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "passwordCredentials"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        passwordCredentials.tokenValidUntil = System.currentTimeMillis() + passwordCredentials.expiresIn * 1000\n        tokenStorage.add(passwordCredentials)\n        tokenSubject.onNext(Optional(passwordCredentials))\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final deleteToken()Lio/reactivex/Completable;
    .locals 2

    .line 63
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$EQqMhoShQoZiATlJizVKK_cNAWc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$EQqMhoShQoZiATlJizVKK_cNAWc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            tokenStorage.delete()\n            tokenSubject.onNext(Optional(null))\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final get()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;>;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final hasToken()Z
    .locals 1

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->tokenSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final updatePassword(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "password"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$H__MWJYbydr_7HqBT6Weyb1YZIE;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$H__MWJYbydr_7HqBT6Weyb1YZIE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "fromAction {\n        val passCred = tokenStorage.get()\n        passCred?.let {\n            val updated = it.copy(password = password)\n            tokenStorage.add(updated)\n            tokenSubject.onNext(Optional(updated))\n        }\n\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
