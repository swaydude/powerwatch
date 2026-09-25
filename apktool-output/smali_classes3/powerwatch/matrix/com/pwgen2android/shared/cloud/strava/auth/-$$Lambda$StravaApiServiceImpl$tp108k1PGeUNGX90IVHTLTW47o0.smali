.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;

    check-cast p1, Lkotlin/Triple;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->lambda$tp108k1PGeUNGX90IVHTLTW47o0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
