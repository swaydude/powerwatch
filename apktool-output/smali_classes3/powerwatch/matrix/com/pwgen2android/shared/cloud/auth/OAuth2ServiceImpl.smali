.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;
.super Ljava/lang/Object;
.source "AuthService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V",
        "authorize",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "authConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
        "host",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
        "refresh",
        "refreshToken",
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
.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    return-void
.end method

.method private static final authorize$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;
    .locals 9

    const-string v0, "$authConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lkotlin/Pair;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getBasicAuthorizationTokenType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEncodedBasicToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    .line 48
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getGrantType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "grant_type"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 49
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;->getUuid()Ljava/lang/String;

    move-result-object v2

    const-string v3, "host"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 50
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "username"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 51
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "password"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 48
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    .line 52
    iget-object v3, p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getAuthEndpoint()Ljava/lang/String;

    move-result-object v4

    const-class v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-object v6, p1

    invoke-interface/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;

    move-result-object p1

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$PNxjqUbhoXilgrQ41jkRGM_gDgY;

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$PNxjqUbhoXilgrQ41jkRGM_gDgY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 56
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$l6e6409vajA_spICyRmwshFaPhY;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$l6e6409vajA_spICyRmwshFaPhY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final authorize$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Cloud Authorization Failed: HTTP response is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final authorize$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    .locals 15

    const-string v0, "$authConfig"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEmail()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getPassword()Ljava/lang/String;

    move-result-object v12

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v13, 0x7f

    const/4 v14, 0x0

    move-object/from16 v1, p1

    move v2, v0

    invoke-static/range {v1 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic lambda$PNxjqUbhoXilgrQ41jkRGM_gDgY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->authorize$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$V6mD5UrrXLX25LfMjXUYs9K_mXQ(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->authorize$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bCzpVUdVnhVQLAwsQ7grSV30sCs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->refresh$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->refresh$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$l6e6409vajA_spICyRmwshFaPhY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->authorize$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object p0

    return-object p0
.end method

.method private static final refresh$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;
    .locals 9

    const-string v0, "$authConfig"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$refreshToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lkotlin/Pair;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getBasicAuthorizationTokenType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEncodedBasicToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    .line 33
    new-instance v1, Lkotlin/Pair;

    const-string v2, "grant_type"

    const-string v3, "refresh_token"

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    .line 34
    new-instance p1, Lkotlin/Pair;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;->getUuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "host"

    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aput-object p1, v0, v1

    .line 33
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    .line 36
    iget-object v3, p3, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getAuthEndpoint()Ljava/lang/String;

    move-result-object v4

    const-class v8, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-object v6, p2

    invoke-interface/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;

    move-result-object p1

    .line 37
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final refresh$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    .locals 15

    const-string v0, "$authConfig"

    move-object v1, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getEmail()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;->getPassword()Ljava/lang/String;

    move-result-object v12

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v13, 0x7f

    const/4 v14, 0x0

    move-object/from16 v1, p1

    move v2, v0

    invoke-static/range {v1 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public authorize(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "authConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;

    invoke-direct {v0, p1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "defer {\n            val basicAuthHeaders: Headers = mapOf(\n                    Header(\"Authorization\", authConfig.basicAuthorizationTokenType.plus(\" ${authConfig.encodedBasicToken}\")))\n            val queries = mapOf(Pair(\"grant_type\", authConfig.grantType),\n                    Pair(\"host\", host.uuid),\n                    Pair(\"username\", authConfig.email!!),\n                    Pair(\"password\", authConfig.password!!))\n            httpClient.postSingle(authConfig.authEndpoint, headers = basicAuthHeaders, body = host, queries = queries, clazz = PasswordCredentials::class.java)\n                    .doOnError {\n                        error(\"Cloud Authorization Failed: HTTP response is: \", it)\n                    }\n                    .map {\n                        it.copy(email = authConfig.email, password = authConfig.password)\n                    }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 25
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation

    const-string v0, "refreshToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;

    invoke-direct {v0, p2, p1, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "defer {\n            val basicAuthHeaders: Headers = mapOf(\n                    Header(\"Authorization\", authConfig.basicAuthorizationTokenType.plus(\" ${authConfig.encodedBasicToken}\")))\n            val queries = mapOf(Pair(\"grant_type\", \"refresh_token\"), Pair(\"refresh_token\", refreshToken),\n                    Pair(\"host\", host.uuid))\n\n            httpClient.postSingle(authConfig.authEndpoint, headers = basicAuthHeaders, body = host, queries = queries, clazz = PasswordCredentials::class.java)\n                    .map {\n                        it.copy(email = authConfig.email, password = authConfig.password)\n                    }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
