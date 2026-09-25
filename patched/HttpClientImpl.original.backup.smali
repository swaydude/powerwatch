.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;
.super Ljava/lang/Object;
.source "HttpClient.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J$\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\u0008\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JT\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\u0008\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rH\u0016JW\u0010!\u001a\u00020 \"\u0004\u0008\u0000\u0010\"2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0008\u0010#\u001a\u0004\u0018\u0001H\"2\u0014\u0008\u0001\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rH\u0016\u00a2\u0006\u0002\u0010$JJ\u0010%\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0008\u0008\u0001\u0010&\u001a\u00020\'H\u0016Jb\u0010(\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\u0008\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010&\u001a\u00020\'2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u0002H\u00190)H\u0016Jo\u0010*\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\u0008\u0000\u0010\"\"\u0004\u0008\u0001\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0008\u0010#\u001a\u0004\u0018\u0001H\"2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u0002H\u00190)H\u0016\u00a2\u0006\u0002\u0010,J:\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e0\u00152\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002J\u0012\u0010.\u001a\u00020\u00132\u0008\u0010/\u001a\u0004\u0018\u00010\nH\u0016J4\u00100\u001a\u00020\u00132\u001c\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e0\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000c\u00101\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "http",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;",
        "baseURL",
        "",
        "gson",
        "Lcom/google/gson/Gson;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;Ljava/lang/String;Lcom/google/gson/Gson;)V",
        "errorHandler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;",
        "headerProvider",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "getHttp",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;",
        "tokenRequest",
        "Lkotlin/Function0;",
        "",
        "download",
        "Lio/reactivex/Single;",
        "Lokhttp3/ResponseBody;",
        "endpoint",
        "downloadJSON",
        "RESPONSE_BODY",
        "type",
        "Ljava/lang/reflect/Type;",
        "get",
        "headers",
        "queries",
        "getCompletable",
        "Lio/reactivex/Completable;",
        "postCompletable",
        "REQUEST_BODY",
        "body",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;",
        "postMultiPart",
        "dataPart",
        "Lokhttp3/MultipartBody$Part;",
        "postMultiPartWithResponse",
        "Ljava/lang/Class;",
        "postSingle",
        "clazz",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;",
        "requestToken",
        "setErrorHandler",
        "apiErrorHandler",
        "setHeadersProvider",
        "appendBaseUrl",
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
.field private final baseURL:Ljava/lang/String;

.field private errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

.field private final gson:Lcom/google/gson/Gson;

.field private headerProvider:Lio/reactivex/Observable;
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

.field private final http:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

.field private tokenRequest:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;Ljava/lang/String;Lcom/google/gson/Gson;)V
    .locals 1

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseURL"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->http:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    .line 74
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->baseURL:Ljava/lang/String;

    .line 75
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method private final appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 225
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->baseURL:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final downloadJSON$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final get$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    new-array p1, p1, [Lkotlin/Pair;

    .line 122
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getContentTypeJSON()Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getAcceptTypeJSON()Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p1, v2

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 121
    invoke-static {p3, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p0

    .line 123
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final get$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 127
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    .line 128
    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    check-cast p1, Lio/reactivex/SingleSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    goto :goto_0

    .line 130
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    :goto_0
    return-object p0
.end method

.method private static final get$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final getCompletable$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    new-array p1, p1, [Lkotlin/Pair;

    .line 197
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getContentTypeJSON()Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getAcceptTypeJSON()Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p1, v2

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 196
    invoke-static {p3, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->getCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p0

    .line 198
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final getCompletable$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 201
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 202
    :cond_0
    invoke-static {p1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method public static synthetic lambda$4IKQ3tZm4tFw7Q1Z76zQEsxCMr4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postSingle$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4rOHCptSraLkmdnrVQGp5LQnF1k(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/util/Map;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4x5ni-bQrrYYOXQtPcazAHKiJzc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postCompletable$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$BNpCg2MQOqsHwGLut1BjWxkex1c(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->get$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Ex4y3Cwgk52THzzRcQnp2mvslqY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postMultiPart$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Fa7AxGx0FnvLVc7BVIc--VSGSoc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postMultiPartWithResponse$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$M6PXm2ZBCD_AxB6HWvcyADR7p4M(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postMultiPart$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Ro4RRHW4D75mExIJxzakA-OndVo(Ljava/util/Map;Lkotlin/Unit;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken$lambda-18$lambda-17(Ljava/util/Map;Lkotlin/Unit;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Snvaj5OAg7_iBA1jLL3JvLIHRLQ(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postSingle$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZEfzZWCqoNbaWMk5DMkThAFhh9g(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken$lambda-18$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$e6TkPP2wnK7WJl08TP_8r4Slwz8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getCompletable$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$hVn-S4RibNV_dc2LPQII0hBB9Ls(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postMultiPartWithResponse$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ioFR4HpXwmcFHvpPjEeL77AwbqE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->get$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$l3Acz2EJhdn4vPx7zbPIV9S1HhI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getCompletable$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lG2UX_eJlTRdkra2tCUTJAuvYic(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postCompletable$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oZ4AYLN9-lskxfFvEUHqCrLD5OM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->get$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$r5bgc_8HsXGCIz6MO2D0pv3xYUs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postSingle$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sRNB4ARaAHxTkjLNNyDEOVguu0U(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->downloadJSON$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$y_p6nhd5qhrFrt-qiqAhFJWb1OA(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->postMultiPartWithResponse$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method private static final postCompletable$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getContentTypeJSON()Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getAcceptTypeJSON()Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p4, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p4

    .line 140
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "gson.toJson(body)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-interface {v0, p1, p4, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->postCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/Completable;

    move-result-object p0

    .line 141
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final postCompletable$lambda-8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 145
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 146
    :cond_0
    invoke-static {p1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final postMultiPart$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataPart"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getMimeType()Lkotlin/Pair;

    move-result-object p1

    invoke-static {p4, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->uploadFile(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Completable;

    move-result-object p0

    .line 184
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final postMultiPart$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 188
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_0

    .line 189
    :cond_0
    invoke-static {p1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_0
    return-object p0
.end method

.method private static final postMultiPartWithResponse$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 166
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    check-cast p1, Lio/reactivex/SingleSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    goto :goto_0

    .line 167
    :cond_0
    invoke-static {p1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    check-cast p1, Lio/reactivex/SingleSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    :goto_0
    return-object p0
.end method

.method private static final postMultiPartWithResponse$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final postMultiPartWithResponse$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataPart"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getMimeType()Lkotlin/Pair;

    move-result-object p1

    invoke-static {p4, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->uploadFileWithResponse(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Single;

    move-result-object p0

    .line 162
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final postSingle$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$queries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object v0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->appendBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    .line 106
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getContentTypeJSON()Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->getAcceptTypeJSON()Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 105
    invoke-static {p4, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p4

    .line 106
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p3, "gson.toJson(body)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-interface {v0, p1, p4, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p0

    .line 107
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final postSingle$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    if-eqz p0, :cond_0

    .line 111
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->handleApiError(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    .line 112
    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    check-cast p1, Lio/reactivex/SingleSource;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/SingleSource;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    goto :goto_0

    .line 114
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    :goto_0
    return-object p0
.end method

.method private static final postSingle$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0, p2, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final requestToken(Ljava/util/Map;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 206
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4rOHCptSraLkmdnrVQGp5LQnF1k;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4rOHCptSraLkmdnrVQGp5LQnF1k;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/util/Map;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "defer {\n            val response = headerProvider!!.firstOrError()\n\n            val request = Single.create<Unit> {\n                tokenRequest?.invoke()\n                it.onSuccess(Unit)\n            }\n\n            if (headers != null) {\n                return@defer Single.just(headers)\n            }\n            Single.zip(response, request, BiFunction<Headers, Unit, Headers> { responseHeaders, _ ->\n                responseHeaders\n            })\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final requestToken$lambda-18(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/util/Map;)Lio/reactivex/SingleSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->headerProvider:Lio/reactivex/Observable;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 209
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$ZEfzZWCqoNbaWMk5DMkThAFhh9g;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$ZEfzZWCqoNbaWMk5DMkThAFhh9g;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-static {v1}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p0

    const-string v1, "create<Unit> {\n                tokenRequest?.invoke()\n                it.onSuccess(Unit)\n            }"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 215
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0

    .line 217
    :cond_0
    check-cast v0, Lio/reactivex/SingleSource;

    check-cast p0, Lio/reactivex/SingleSource;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Ro4RRHW4D75mExIJxzakA-OndVo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Ro4RRHW4D75mExIJxzakA-OndVo;

    invoke-static {v0, p0, p1}, Lio/reactivex/Single;->zip(Lio/reactivex/SingleSource;Lio/reactivex/SingleSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final requestToken$lambda-18$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->tokenRequest:Lkotlin/jvm/functions/Function0;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 211
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final requestToken$lambda-18$lambda-17(Ljava/util/Map;Lkotlin/Unit;)Ljava/util/Map;
    .locals 1

    const-string v0, "responseHeaders"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public download(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->http:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->downloadFile(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    .line 78
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "http.downloadFile(endpoint)\n                .subscribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public downloadJSON(Ljava/lang/String;Ljava/lang/reflect/Type;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->http:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;->downloadJSONFile(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    .line 83
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$sRNB4ARaAHxTkjLNNyDEOVguu0U;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$sRNB4ARaAHxTkjLNNyDEOVguu0U;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 84
    invoke-static {}, Lio/reactivex/schedulers/Schedulers;->io()Lio/reactivex/Scheduler;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "http.downloadJSONFile(endpoint)\n                .map { gson.fromJson<RESPONSE_BODY>(it, type) }\n                .subscribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/reflect/Type;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 120
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$BNpCg2MQOqsHwGLut1BjWxkex1c;

    invoke-direct {v0, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$BNpCg2MQOqsHwGLut1BjWxkex1c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 125
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$ioFR4HpXwmcFHvpPjEeL77AwbqE;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$ioFR4HpXwmcFHvpPjEeL77AwbqE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 132
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$oZ4AYLN9-lskxfFvEUHqCrLD5OM;

    invoke-direct {p2, p0, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$oZ4AYLN9-lskxfFvEUHqCrLD5OM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "requestToken(headers)\n                    .flatMap {\n                        http.get(endpoint.appendBaseUrl(), it\n                                + mapOf(contentTypeJSON, acceptTypeJSON), queries = queries)\n                                .subscribeOn(Schedulers.io())\n                    }\n                    .onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                                    .andThen(Single.error(it))\n\n                        } else Single.error(it)\n                    }\n                    .map {\n                        gson.fromJson<RESPONSE_BODY>(it, type)\n                    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 195
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$e6TkPP2wnK7WJl08TP_8r4Slwz8;

    invoke-direct {v0, p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$e6TkPP2wnK7WJl08TP_8r4Slwz8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 199
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$l3Acz2EJhdn4vPx7zbPIV9S1HhI;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$l3Acz2EJhdn4vPx7zbPIV9S1HhI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "requestToken(headers)\n                    .flatMapCompletable {\n                        http.getCompletable(endpoint.appendBaseUrl(), it\n                                + mapOf(contentTypeJSON, acceptTypeJSON), queries)\n                                .subscribeOn(Schedulers.io())\n                    }.onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                        } else Completable.error(it)\n                    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getHttp()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;
    .locals 1

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->http:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    return-object v0
.end method

.method public postCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .locals 1
    .param p4    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<REQUEST_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;TREQUEST_BODY;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queries"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 138
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;

    invoke-direct {v0, p0, p1, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 143
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4x5ni-bQrrYYOXQtPcazAHKiJzc;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4x5ni-bQrrYYOXQtPcazAHKiJzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "requestToken(headers)\n                    .flatMapCompletable {\n                        http.postCompletable(endpoint.appendBaseUrl(), it + mapOf(contentTypeJSON, acceptTypeJSON),\n                                body = gson.toJson(body), queries = queries)\n                                .subscribeOn(Schedulers.io())\n\n                    }.onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                        } else Completable.error(it)\n                    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public postMultiPart(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Completable;
    .locals 1
    .param p4    # Lokhttp3/MultipartBody$Part;
        .annotation runtime Lretrofit2/http/Part;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lokhttp3/MultipartBody$Part;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 177
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$M6PXm2ZBCD_AxB6HWvcyADR7p4M;

    invoke-direct {v0, p0, p1, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$M6PXm2ZBCD_AxB6HWvcyADR7p4M;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 186
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Ex4y3Cwgk52THzzRcQnp2mvslqY;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Ex4y3Cwgk52THzzRcQnp2mvslqY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "requestToken(headers)\n                .flatMapCompletable {\n//                    val multipartBody = MultipartBody.Builder()\n//                            .setType(MultipartBody.FORM)\n//                            .addPart(RequestBody.create(MultipartBody.FORM, dataParts.get(\"file\")!!))\n//                            .build()\n\n                    http.uploadFile(endpoint.appendBaseUrl(), it + mimeType, queries = queries, dataPart = dataPart)\n                            .subscribeOn(Schedulers.io())\n\n                }.onErrorResumeNext {\n                    if (errorHandler != null) {\n                        errorHandler!!.handleApiError(it)\n                    } else Completable.error(it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public postMultiPartWithResponse(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/lang/Class;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lokhttp3/MultipartBody$Part;",
            "Ljava/lang/Class<",
            "TRESPONSE_BODY;>;)",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation

    const-string p2, "endpoint"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "queries"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "dataPart"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "type"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 153
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 154
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;

    invoke-direct {v0, p0, p1, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 164
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$y_p6nhd5qhrFrt-qiqAhFJWb1OA;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$y_p6nhd5qhrFrt-qiqAhFJWb1OA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 169
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;

    invoke-direct {p2, p0, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "requestToken(null)\n                .flatMap {\n                    //                    val multipartBody = MultipartBody.Builder()\n//                            .setType(MultipartBody.FORM)\n//                            .addPart(RequestBody.create(MultipartBody.FORM, dataParts.get(\"file\")!!))\n//                            .build()\n\n\n                    http.uploadFileWithResponse(endpoint.appendBaseUrl(), it + mimeType, queries = queries, dataPart = dataPart)\n                            .subscribeOn(Schedulers.io())\n\n                }.onErrorResumeNext {\n                    if (errorHandler != null) {\n                        errorHandler!!.handleApiError(it).andThen(Single.error(it))\n                    } else Completable.error(it).andThen(Single.error(it))\n                }\n                .map {\n                    gson.fromJson<RESPONSE_BODY>(it, type)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<REQUEST_BODY:",
            "Ljava/lang/Object;",
            "RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;TREQUEST_BODY;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Class<",
            "TRESPONSE_BODY;>;)",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation

    const-string v0, "endpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queries"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->requestToken(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p2

    .line 103
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Snvaj5OAg7_iBA1jLL3JvLIHRLQ;

    invoke-direct {v0, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Snvaj5OAg7_iBA1jLL3JvLIHRLQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 109
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4IKQ3tZm4tFw7Q1Z76zQEsxCMr4;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$4IKQ3tZm4tFw7Q1Z76zQEsxCMr4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 116
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$r5bgc_8HsXGCIz6MO2D0pv3xYUs;

    invoke-direct {p2, p0, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$r5bgc_8HsXGCIz6MO2D0pv3xYUs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "requestToken(headers)\n                    .flatMap {\n                        http.postSingle(endpoint.appendBaseUrl(),\n                                it\n                                        + mapOf(contentTypeJSON, acceptTypeJSON), queries, gson.toJson(body))\n                                .subscribeOn(Schedulers.io())\n                    }\n                    .onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                                    .andThen(Single.error(it))\n\n                        } else Single.error(it)\n                    }\n                    .map { gson.fromJson(it, clazz) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->errorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    return-void
.end method

.method public setHeadersProvider(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "headerProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->headerProvider:Lio/reactivex/Observable;

    .line 92
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->tokenRequest:Lkotlin/jvm/functions/Function0;

    return-void
.end method
