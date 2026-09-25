.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda$r6UoTp7GNca2ACYHZU5_pl_i3qc(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    move-result-object p1

    return-object p1
.end method
