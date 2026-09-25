.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;
.super Ljava/lang/Object;
.source "StravaApiService.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;)V",
        "headerProvider",
        "Lio/reactivex/Observable;",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "uploadActivity",
        "Lio/reactivex/Completable;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "data",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
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
.field private final headerProvider:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 25
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;->provideToken()Lio/reactivex/Maybe;

    move-result-object p2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$iSWRC3bfj_PD2m_ci2En28i-9Go;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$iSWRC3bfj_PD2m_ci2En28i-9Go;

    .line 26
    invoke-virtual {p2, v0}, Lio/reactivex/Maybe;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Maybe;

    move-result-object p2

    .line 31
    invoke-virtual {p2}, Lio/reactivex/Maybe;->toObservable()Lio/reactivex/Observable;

    move-result-object p2

    const-string v0, "tokenProvider\n            .provideToken()\n            .map {\n                mapOf(\n                        Pair(\"Authorization\", \"Bearer ${it.accessToken}\")\n                )\n            }\n            .toObservable()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->headerProvider:Lio/reactivex/Observable;

    .line 34
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl$1;

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->setHeadersProvider(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final headerProvider$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Ljava/util/Map;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Bearer "

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Authorization"

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$e93cfx897ppycc5NfQdq2gtN-h0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->uploadActivity$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$iSWRC3bfj_PD2m_ci2En28i-9Go(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->headerProvider$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tp108k1PGeUNGX90IVHTLTW47o0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->uploadActivity$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final uploadActivity$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lio/reactivex/ObservableEmitter;)V
    .locals 4

    const-string v0, "$data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    .line 42
    new-instance v1, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    invoke-direct {v1, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 44
    new-instance v1, Lkotlin/Pair;

    const-string v2, "data_type"

    const-string v3, "tcx"

    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 42
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 47
    sget-object v1, Lokhttp3/MultipartBody;->FORM:Lokhttp3/MediaType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;->getData()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p0

    const-string v1, "file"

    const-string v2, "default"

    .line 48
    invoke-static {v1, v2, p0}, Lokhttp3/MultipartBody$Part;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object p0

    .line 49
    new-instance v1, Lkotlin/Triple;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;->getApiEndpoint()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2, v1}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 51
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final uploadActivity$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokhttp3/MultipartBody$Part;

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->postMultiPart(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method


# virtual methods
.method public uploadActivity(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;

    invoke-direct {v0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p1

    .line 52
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<String, Headers, MultipartBody.Part>> {\n\n\n            val queryMap = mapOf(Pair(\"name\", data.name),\n//                    Pair(\"file\", data.data),\n                    Pair(\"data_type\", \"tcx\")\n            )\n\n            val requestBody = RequestBody.create(MultipartBody.FORM, data.data)\n            val multipartBody = MultipartBody.Part.createFormData(\"file\", \"default\", requestBody)\n            it.onNext(Triple(config.apiEndpoint, queryMap, multipartBody))\n\n            it.onComplete()\n        }.flatMapCompletable {\n            httpClient.postMultiPart(it.first, headers = null, queries = it.second, dataPart = it.third)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
