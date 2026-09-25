.class public final Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;
.super Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;
.source "OTAExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016J\u0008\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1",
        "Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;",
        "connectingToDevice",
        "",
        "otaFailed",
        "detail",
        "",
        "otaProcessStarted",
        "otaStarted",
        "otaSuccess",
        "progressUpdate",
        "progress",
        "",
        "sendFwDataState",
        "state",
        "",
        "sendVerifyState",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    .line 30
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;-><init>()V

    return-void
.end method


# virtual methods
.method public connectingToDevice()V
    .locals 0

    return-void
.end method

.method public otaFailed(Ljava/lang/String;)V
    .locals 7

    const-string v0, "detail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$releaseResources(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onError(Ljava/lang/Throwable;)V

    .line 46
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<OTAProgressData>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$setOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lio/reactivex/subjects/PublishSubject;)V

    return-void
.end method

.method public otaProcessStarted()V
    .locals 4

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$STARTED;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public otaStarted()V
    .locals 4

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$STARTED;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public otaSuccess()V
    .locals 5

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "OTA Success"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    const/16 v2, 0x64

    int-to-float v2, v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->getPhasePower()F

    move-result v3

    mul-float v3, v3, v2

    float-to-int v3, v3

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$SUCCESS;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    invoke-direct {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->getPhasePower()F

    move-result v3

    mul-float v2, v2, v3

    float-to-int v2, v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$FINISHED;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    invoke-direct {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getService$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->dispose()V

    return-void
.end method

.method public progressUpdate(I)V
    .locals 3

    .line 50
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;->progressUpdate(I)V

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->access$getOtaProgress$p(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;

    int-to-float p1, p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;->getPhasePower()F

    move-result v2

    mul-float p1, p1, v2

    float-to-int p1, p1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$TRANSFER;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase$TRANSFER;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;

    invoke-direct {v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public sendFwDataState(Z)V
    .locals 0

    return-void
.end method

.method public sendVerifyState(Z)V
    .locals 0

    return-void
.end method
