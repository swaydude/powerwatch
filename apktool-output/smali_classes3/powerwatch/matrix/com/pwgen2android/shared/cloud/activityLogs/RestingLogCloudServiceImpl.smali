.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;
.super Ljava/lang/Object;
.source "LogCloudServices.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;",
        "restingLogService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;)V",
        "saveAllRestingLogs",
        "Lio/reactivex/Completable;",
        "restingLogs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
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
.field private final restingLogService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;)V
    .locals 1

    const-string v0, "restingLogService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;->restingLogService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;

    return-void
.end method


# virtual methods
.method public saveAllRestingLogs(Ljava/util/List;)Lio/reactivex/Completable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "restingLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudServiceImpl;->restingLogService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService$DefaultImpls;->add$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
