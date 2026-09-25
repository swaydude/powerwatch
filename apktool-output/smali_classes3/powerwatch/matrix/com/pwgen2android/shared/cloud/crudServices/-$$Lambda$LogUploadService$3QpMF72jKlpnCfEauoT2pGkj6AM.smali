.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;->lambda$3QpMF72jKlpnCfEauoT2pGkj6AM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
