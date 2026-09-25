.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/strava/-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0;->f$0:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->lambda$TomZ35RRToRndSari1h11aMEEj0(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V

    return-void
.end method
