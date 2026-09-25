.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;
.super Ljava/lang/Object;
.source "CrudServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;",
        "httpClient",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V",
        "download",
        "Lio/reactivex/Single;",
        "",
        "downloadUrl",
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

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    return-void
.end method

.method private static final download$lambda-0(Lokhttp3/ResponseBody;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->bytes()[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$txCEhrRtcyUcx8hjZy6lrPnhtqk(Lokhttp3/ResponseBody;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;->download$lambda-0(Lokhttp3/ResponseBody;)[B

    move-result-object p0

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
            "[B>;"
        }
    .end annotation

    const-string v0, "downloadUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;->httpClient:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;->download(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;

    .line 58
    invoke-virtual {p1, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "httpClient.download(downloadUrl)\n                .map { it.bytes() }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
