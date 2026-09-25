.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->lambda$HWA4jeNU06YH7GiC_Ye-CpGLn38(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
