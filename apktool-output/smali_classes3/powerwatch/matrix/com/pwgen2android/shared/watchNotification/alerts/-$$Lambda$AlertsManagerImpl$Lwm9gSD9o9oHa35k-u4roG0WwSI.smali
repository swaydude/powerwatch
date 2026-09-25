.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;

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

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->lambda$Lwm9gSD9o9oHa35k-u4roG0WwSI(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
