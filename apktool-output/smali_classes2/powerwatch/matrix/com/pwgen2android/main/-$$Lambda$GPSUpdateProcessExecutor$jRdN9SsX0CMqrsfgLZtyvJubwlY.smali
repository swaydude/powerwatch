.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$jRdN9SsX0CMqrsfgLZtyvJubwlY;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->lambda$jRdN9SsX0CMqrsfgLZtyvJubwlY(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
