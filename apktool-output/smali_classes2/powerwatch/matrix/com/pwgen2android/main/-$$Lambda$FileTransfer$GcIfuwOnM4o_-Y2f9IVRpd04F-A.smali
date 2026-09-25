.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->lambda$GcIfuwOnM4o_-Y2f9IVRpd04F-A(Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
