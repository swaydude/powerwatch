.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;
.super Ljava/lang/Object;
.source "LogUploadService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J2\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "configuration",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;)V",
        "uploadFile",
        "Lio/reactivex/Single;",
        "binaryStream",
        "",
        "filename",
        "",
        "queryMap",
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
.field private final configuration:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;

.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->configuration:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;

    return-void
.end method

.method public static synthetic lambda$3QpMF72jKlpnCfEauoT2pGkj6AM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->uploadFile$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$h2W3mLpb4mdTX2cNDytZk2UAaFk(Ljava/lang/String;[BLjava/util/Map;[B)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->uploadFile$lambda-0(Ljava/lang/String;[BLjava/util/Map;[B)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final uploadFile$lambda-0(Ljava/lang/String;[BLjava/util/Map;[B)Lkotlin/Pair;
    .locals 1

    const-string v0, "$filename"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$binaryStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queryMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object p3, Lokhttp3/MultipartBody;->FORM:Lokhttp3/MediaType;

    invoke-static {p3, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    move-result-object p1

    const-string p3, "file"

    .line 18
    invoke-static {p3, p0, p1}, Lokhttp3/MultipartBody$Part;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object p0

    .line 22
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, p2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final uploadFile$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->configuration:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;->getUploadFileURL()Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/Map;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    const-string p1, "it.second"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Lokhttp3/MultipartBody$Part;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;

    const/4 v3, 0x0

    .line 25
    invoke-interface/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->postMultiPartWithResponse(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/lang/Class;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method


# virtual methods
.method public uploadFile([BLjava/lang/String;Ljava/util/Map;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "binaryStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 17
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;

    invoke-direct {v1, p2, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;-><init>(Ljava/lang/String;[BLjava/util/Map;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 24
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "just(binaryStream)\n                .map {\n                    val multipartBody = MultipartBody.Part.createFormData(\n                            \"file\", filename,\n                            RequestBody.create(MultipartBody.FORM, binaryStream)\n                    )\n                    Pair(queryMap, multipartBody)\n                    //val multiPart = Pair(\"Content-Type\", \"multipart/form-data\")\n                }.flatMap {\n                    httpClient.postMultiPartWithResponse(configuration.uploadFileURL, headers = null,\n                            queries = it.first, dataPart = it.second, type = LogUploadResponse::class.java)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
