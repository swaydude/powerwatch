.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda$lmbO4oDR0WlH44actS9KGHmPZ2o(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p1

    return p1
.end method
