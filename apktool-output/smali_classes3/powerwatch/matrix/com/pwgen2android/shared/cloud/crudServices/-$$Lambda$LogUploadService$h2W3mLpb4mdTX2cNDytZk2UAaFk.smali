.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:[B

.field public final synthetic f$2:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$1:[B

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$2:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$1:[B

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk;->f$2:Ljava/util/Map;

    check-cast p1, [B

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->lambda$h2W3mLpb4mdTX2cNDytZk2UAaFk(Ljava/lang/String;[BLjava/util/Map;[B)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
