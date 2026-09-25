.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;->lambda$txCEhrRtcyUcx8hjZy6lrPnhtqk(Lokhttp3/ResponseBody;)[B

    move-result-object p1

    return-object p1
.end method
