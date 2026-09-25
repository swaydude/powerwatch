.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda$iKiXNrZtq-A622WM3_T4bNE5kX4(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)V

    return-void
.end method
