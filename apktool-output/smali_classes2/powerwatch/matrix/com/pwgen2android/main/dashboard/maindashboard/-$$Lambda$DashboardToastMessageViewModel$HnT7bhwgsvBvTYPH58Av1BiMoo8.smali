.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function6;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$DashboardToastMessageViewModel$HnT7bhwgsvBvTYPH58Av1BiMoo8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    move-object v2, p2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-object v3, p3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;

    move-object v4, p4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-object v5, p5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    move-object v6, p6

    check-cast v6, Ljava/lang/Boolean;

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->lambda$HnT7bhwgsvBvTYPH58Av1BiMoo8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;

    move-result-object p1

    return-object p1
.end method
