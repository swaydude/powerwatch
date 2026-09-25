.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->lambda$dOhUJXAhE_eiycBG6bqWmxGK8GQ(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)V

    return-void
.end method
