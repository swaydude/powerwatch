.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$o1db-CZiAg6_NlMIpsL7yF0U71k(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p1

    return p1
.end method
