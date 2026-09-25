.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

.field public final synthetic f$3:Lkotlin/Pair;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$3:Lkotlin/Pair;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$aBjVFxSMtCSdrgx23V0yYecJcsg;->f$3:Lkotlin/Pair;

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->lambda$aBjVFxSMtCSdrgx23V0yYecJcsg(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
