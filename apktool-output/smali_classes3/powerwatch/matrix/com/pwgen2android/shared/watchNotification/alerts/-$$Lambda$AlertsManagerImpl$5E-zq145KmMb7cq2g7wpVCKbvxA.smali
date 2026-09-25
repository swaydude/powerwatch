.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->lambda$5E-zq145KmMb7cq2g7wpVCKbvxA(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
