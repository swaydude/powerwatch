.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->lambda$QxMbFmhtx9sBbY4t6oEUXH90HM8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
