.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI;

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

    check-cast p1, Landroid/location/Location;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->lambda$CDWg3QvQ5FgaMCam0TmqssBcCiI(Landroid/location/Location;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
