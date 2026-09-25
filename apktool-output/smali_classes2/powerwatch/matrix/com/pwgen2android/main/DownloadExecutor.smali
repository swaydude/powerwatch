.class public Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;
.super Ljava/lang/Object;
.source "DownloadExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u000c2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;",
        "",
        "downloadService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V",
        "power",
        "",
        "getPower",
        "()F",
        "setPower",
        "(F)V",
        "execute",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "",
        "",
        "url",
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
.field private final downloadService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;

.field private power:F


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V
    .locals 1

    const-string v0, "downloadService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->downloadService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->power:F

    return-void
.end method

.method private static final execute$lambda-1(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "$url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 15
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;

    const-string p1, "Download url not valid."

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 17
    :cond_1
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->downloadService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;

    invoke-interface {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;->download(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$mjPA9Om4gV5C-KQlvsedJ-aKKQo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$mjPA9Om4gV5C-KQlvsedJ-aKKQo;

    .line 18
    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final execute$lambda-1$lambda-0([B)Lkotlin/Pair;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lkotlin/Pair;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic lambda$MrdiV72AzryP66vOfk3i6scfRts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->execute$lambda-1(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$mjPA9Om4gV5C-KQlvsedJ-aKKQo([B)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->execute$lambda-1$lambda-0([B)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final execute(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "[B>;>;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n            if (url.isEmpty()) {\n                return@defer Observable.error<Pair<Int, ByteArray>>(OTAError.FileDownload(\"Download url not valid.\"))\n            }\n            return@defer downloadService.download(url)\n                    .map { Pair(100, it) }.toObservable()\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getPower()F
    .locals 1

    .line 9
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->power:F

    return v0
.end method

.method public final setPower(F)V
    .locals 0

    .line 9
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->power:F

    return-void
.end method
