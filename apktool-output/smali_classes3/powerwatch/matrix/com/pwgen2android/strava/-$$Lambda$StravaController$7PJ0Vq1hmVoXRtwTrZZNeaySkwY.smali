.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda$7PJ0Vq1hmVoXRtwTrZZNeaySkwY(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
