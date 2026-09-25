.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244;

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

    check-cast p1, Lkotlin/Pair;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;->lambda$DUSbh7wO_NCDC2jH6UpksgcN244(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    move-result-object p1

    return-object p1
.end method
