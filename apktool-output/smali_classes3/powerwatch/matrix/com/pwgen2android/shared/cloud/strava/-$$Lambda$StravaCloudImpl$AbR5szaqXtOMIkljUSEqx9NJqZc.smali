.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;->lambda$AbR5szaqXtOMIkljUSEqx9NJqZc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
