.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-static {v0, v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->lambda$6c7JLNyhexjVcoIBQ13XUDvC5aw(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;

    move-result-object p1

    return-object p1
.end method
