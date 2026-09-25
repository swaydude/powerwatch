.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;
.super Ljava/lang/Object;
.source "Cloud.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u001e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;",
        "authService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;",
        "cloudConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V",
        "authErrorEmitter",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "authRequiredError",
        "Lio/reactivex/Observable;",
        "getAuthRequiredError",
        "()Lio/reactivex/Observable;",
        "handleApiError",
        "Lio/reactivex/Completable;",
        "error",
        "handleAuthError",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "passwordCredentials",
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
.field private final authErrorEmitter:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private final authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

.field private final cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

.field private final hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

.field private final tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 1

    const-string v0, "authService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostInfoProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    .line 100
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    .line 101
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    .line 102
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    .line 106
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Throwable>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->authErrorEmitter:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private static final handleApiError$lambda-4(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 149
    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object v0

    .line 150
    :goto_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->get()Lio/reactivex/Observable;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 153
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg;-><init>(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_1

    .line 165
    :cond_1
    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_1
    return-object p0
.end method

.method private static final handleApiError$lambda-4$lambda-3(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "$error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 157
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->hasExpired()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 160
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->setShouldTryLogin(Z)V

    .line 161
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final handleAuthError$lambda-2(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/SingleSource;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "$error"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$passwordCredentials"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    invoke-static/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_2

    .line 111
    instance-of v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_1

    :cond_1
    move-object v2, v4

    .line 113
    :cond_2
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getEmail()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getPassword()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 114
    iget-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 115
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getEmail()Ljava/lang/String;

    move-result-object v14

    .line 116
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getPassword()Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x7f

    const/16 v17, 0x0

    .line 114
    invoke-static/range {v6 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    move-result-object v3

    .line 118
    iget-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->authService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v6, v7, v8, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider$DefaultImpls;->hostInfo$default(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v4

    invoke-interface {v5, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;->authorize(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;)Lio/reactivex/Single;

    move-result-object v3

    .line 119
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA;

    invoke-direct {v4, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V

    invoke-virtual {v3, v4}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v3

    goto :goto_2

    .line 122
    :cond_3
    invoke-static/range {p0 .. p0}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object v3

    .line 124
    :goto_2
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;

    invoke-direct {v4, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v4}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v1

    const-string v3, "if (passwordCredentials.email != null && passwordCredentials.password != null) {\n                        val config = cloudConfig.authConfig.copy(\n                                email = passwordCredentials.email,\n                                password = passwordCredentials.password\n                        )\n                        authService.authorize(authConfig = config, host = hostInfoProvider.hostInfo())\n                                .flatMap { tokenProvider.add(it).toSingleDefault(it) }\n\n                    } else {\n                        Single.error(error)\n                    }\n                            .doOnError {\n                                if (it == CloudErrorType.InvalidGrant || it.retrofitResponse()?.cloudErrorType != null) {\n                                    // cannot recover, push login authRequiredError event\n                                    authErrorEmitter.onNext(error)\n                                }\n                            }"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    .line 134
    :cond_4
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    .line 138
    :cond_5
    invoke-static/range {p0 .. p0}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object v1

    const-string v0, "{\n                    Single.error(error)\n                }"

    .line 137
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    check-cast v1, Lio/reactivex/SingleSource;

    return-object v1
.end method

.method private static final handleAuthError$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final handleAuthError$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_2

    .line 127
    :cond_1
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->authErrorEmitter:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static synthetic lambda$CRL4jC6A7zB89B63RFrEiEymaWE(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->handleApiError$lambda-4(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MGhIb9cA1-CeBvYlXIpoDv2lsdA(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->handleAuthError$lambda-2(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$N4KT4gZKq29j5B29HXBk5zY2wZg(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->handleApiError$lambda-4$lambda-3(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$V2Rhv58RNgxE2enpHZXWg5uk-CA(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->handleAuthError$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$uLA_hMNZQv4JtoH-0OyoICSUUVE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->handleAuthError$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getAuthRequiredError()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->authErrorEmitter:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$CRL4jC6A7zB89B63RFrEiEymaWE;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$CRL4jC6A7zB89B63RFrEiEymaWE;-><init>(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n            val cloudResponse = error.retrofitResponse()\n\n            return@defer when (cloudResponse?.cloudErrorType) {\n                CloudErrorType.Unauthorized -> {\n                    tokenProvider.get()\n                            .firstOrError()\n                            .flatMapCompletable {\n                                if (it.element == null) return@flatMapCompletable Completable.error(\n                                        error\n                                )\n                                if (it.element.hasExpired()) {\n                                    return@flatMapCompletable Completable.error(error)\n                                }\n                                it.element.shouldTryLogin = true\n                                return@flatMapCompletable tokenProvider.add(it.element)\n                            }\n                }\n                else -> {\n                    Completable.error(error)\n                }\n\n            }\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public handleAuthError(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordCredentials"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;

    invoke-direct {v0, p1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;-><init>(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "defer {\n            val cloudErrorType = error.retrofitResponse()?.cloudErrorType\n                    ?: error as? CloudErrorType\n            val tryLogin =\n                    if (passwordCredentials.email != null && passwordCredentials.password != null) {\n                        val config = cloudConfig.authConfig.copy(\n                                email = passwordCredentials.email,\n                                password = passwordCredentials.password\n                        )\n                        authService.authorize(authConfig = config, host = hostInfoProvider.hostInfo())\n                                .flatMap { tokenProvider.add(it).toSingleDefault(it) }\n\n                    } else {\n                        Single.error(error)\n                    }\n                            .doOnError {\n                                if (it == CloudErrorType.InvalidGrant || it.retrofitResponse()?.cloudErrorType != null) {\n                                    // cannot recover, push login authRequiredError event\n                                    authErrorEmitter.onNext(error)\n                                }\n                            }\n             when (cloudErrorType) {\n                CloudErrorType.InvalidGrant -> {\n                    tryLogin\n                }\n                CloudErrorType.Unauthorized -> {\n                    tryLogin\n                }\n                else -> {\n                    Single.error(error)\n                }\n            }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
