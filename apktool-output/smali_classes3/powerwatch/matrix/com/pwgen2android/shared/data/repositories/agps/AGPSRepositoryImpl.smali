.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;
.super Ljava/lang/Object;
.source "AGPSRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;",
        "downloadExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;",
        "appContext",
        "Landroid/content/Context;",
        "agpsRepositoryCache",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;",
        "(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V",
        "getOne",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
        "id",
        "",
        "fromCache",
        "",
        "isWatchUpdateNeeded",
        "save",
        "Lio/reactivex/Single;",
        "entity",
        "storeLastUpdateTimestamp",
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
.field private final agpsRepositoryCache:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

.field private final appContext:Landroid/content/Context;

.field private final downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V
    .locals 1

    const-string v0, "downloadExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agpsRepositoryCache"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    .line 77
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->appContext:Landroid/content/Context;

    .line 78
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->agpsRepositoryCache:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 78
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    invoke-direct {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;-><init>(Landroid/content/Context;)V

    .line 76
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V

    return-void
.end method

.method private static final getOne$lambda-0(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;
    .locals 2

    const-string v0, "downloadResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    const-string v1, "gpsAssistantFile.bin"

    invoke-direct {v0, p0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static synthetic lambda$VwFZ82i819DsOcuvbVzQUpzZIgI(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->getOne$lambda-0(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;
    .locals 0

    .line 76
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ">;"
        }
    .end annotation

    const-string p2, "id"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->downloadExecutor:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    const-string p2, "https://s3.us-west-1.amazonaws.com/powerwatch-gps/gpsAssistantFile.bin"

    .line 82
    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->execute(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;

    .line 83
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "downloadExecutor\n                        .execute(\"https://s3.us-west-1.amazonaws.com/powerwatch-gps/gpsAssistantFile.bin\")\n                        .map { downloadResult ->\n                            GPSFile(downloadResult.second, \"gpsAssistantFile.bin\")\n                        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isWatchUpdateNeeded()Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->agpsRepositoryCache:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->isWatchUpdateNeeded()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic save(Ljava/lang/Object;)Lio/reactivex/Single;
    .locals 0

    .line 76
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ">;"
        }
    .end annotation

    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->agpsRepositoryCache:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public storeLastUpdateTimestamp()V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->agpsRepositoryCache:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->storeLastUpdateTimestamp()V

    return-void
.end method
