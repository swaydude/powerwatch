.class public final Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;
.super Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;
.source "GPSUpdateProcessExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/GPSDownloadExecutor;",
        "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;",
        "downloadService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V",
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


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V
    .locals 1

    const-string v0, "downloadService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V

    return-void
.end method
