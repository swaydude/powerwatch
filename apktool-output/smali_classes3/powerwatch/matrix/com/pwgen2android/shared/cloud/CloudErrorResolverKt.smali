.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;
.super Ljava/lang/Object;
.source "CloudErrorResolver.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u000c\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "cloneResponseBody",
        "Lokhttp3/ResponseBody;",
        "rawResponse",
        "retrofitResponse",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final cloneResponseBody(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 67
    :cond_0
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v0

    const-string v1, "responseBody.source().buffer().clone()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v1

    invoke-virtual {p0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v2

    check-cast v0, Lokio/BufferedSource;

    invoke-static {v1, v2, v3, v0}, Lokhttp3/ResponseBody;->create(Lokhttp3/MediaType;JLokio/BufferedSource;)Lokhttp3/ResponseBody;

    move-result-object p0

    return-object p0
.end method

.method public static final retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    instance-of v0, p0, Lretrofit2/HttpException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lretrofit2/HttpException;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    goto/16 :goto_4

    .line 21
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 22
    invoke-virtual {p0}, Lretrofit2/HttpException;->response()Lretrofit2/Response;

    move-result-object v2

    invoke-virtual {v2}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v2

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->cloneResponseBody(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, v1

    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v2}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v2

    :goto_1
    const/4 v3, 0x3

    if-eqz v2, :cond_3

    .line 26
    :try_start_0
    const-class v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;

    invoke-virtual {v0, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;

    if-nez v0, :cond_4

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;

    invoke-direct {v0, v1, v1, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 28
    :catch_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;

    invoke-direct {v0, v1, v1, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    .line 29
    :cond_3
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;

    invoke-direct {v0, v1, v1, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lretrofit2/HttpException;->code()I

    move-result v1

    const/16 v2, 0x190

    if-ne v1, v2, :cond_5

    .line 33
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Bad credentials"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto/16 :goto_3

    :cond_5
    if-ne v1, v2, :cond_6

    .line 34
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Password Migration Required"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto/16 :goto_3

    :cond_6
    if-ne v1, v2, :cond_7

    .line 35
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "User is disabled"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_7
    if-ne v1, v2, :cond_8

    .line 36
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Account already exists"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_8
    if-ne v1, v2, :cond_9

    .line 37
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Provided old password does not match."

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_9
    if-ne v1, v2, :cond_a

    .line 38
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "password: Password contains a whitespace character."

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_a
    const/16 v3, 0x191

    if-ne v1, v3, :cond_b

    .line 39
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_b
    const/16 v3, 0x193

    if-ne v1, v3, :cond_c

    .line 40
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    :cond_c
    if-ne v1, v2, :cond_d

    .line 41
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;->getErrorType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "invalid_grant"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    goto :goto_3

    .line 42
    :cond_d
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    .line 44
    :goto_3
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    .line 45
    invoke-virtual {p0}, Lretrofit2/HttpException;->code()I

    move-result p0

    .line 44
    invoke-direct {v2, p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;-><init>(ILpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;)V

    move-object v1, v2

    :goto_4
    return-object v1
.end method
