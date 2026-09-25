.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;

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

    check-cast p1, Landroid/util/Pair;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->lambda$--tERVaOinS8-BE2NF7ayjI_48o(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p1

    return-object p1
.end method
