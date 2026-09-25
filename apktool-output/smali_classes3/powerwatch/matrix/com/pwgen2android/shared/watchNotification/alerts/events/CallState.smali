.class public final enum Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
.super Ljava/lang/Enum;
.source "CallEvent.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "",
        "(Ljava/lang/String;I)V",
        "IDLE",
        "RINGING",
        "MISSED",
        "ANSWERED",
        "CALL_ENDED",
        "DISMISSED",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum CALL_ENDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum IDLE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

.field public static final enum RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;


# direct methods
.method private static final synthetic $values()[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->IDLE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->CALL_ENDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->IDLE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 9
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "RINGING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 10
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "MISSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->MISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 11
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "ANSWERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->ANSWERED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 12
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "CALL_ENDED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->CALL_ENDED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    .line 13
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    const-string v1, "DISMISSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->DISMISSED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->$values()[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 15
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;
    .locals 2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 15
    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    return-object v0
.end method
