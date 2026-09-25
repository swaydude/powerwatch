.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$3:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateExecutor$OoMM7JcssnOCRCxkECf9nQYrTJg;->f$3:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;->lambda$OoMM7JcssnOCRCxkECf9nQYrTJg(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
