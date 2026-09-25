.class public final enum Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
.super Ljava/lang/Enum;
.source "Protocol.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;",
        "",
        "(Ljava/lang/String;I)V",
        "SETTING",
        "RESPONSE",
        "COMMAND",
        "ACK_MESSAGE",
        "COMMAND_SUCCESS",
        "UNKNOWN",
        "GEN2_FIRMWARE_REQUEST",
        "GEN2_SERIAL_REQUEST",
        "GEN2_SETTINGS_REQUEST",
        "GEN2_FIRMWARE_RESPONSE",
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
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum ACK_MESSAGE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum COMMAND:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum COMMAND_SUCCESS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum GEN2_FIRMWARE_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum GEN2_FIRMWARE_RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum GEN2_SERIAL_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum SETTING:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

.field public static final enum UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;


# direct methods
.method private static final synthetic $values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->SETTING:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->COMMAND:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ACK_MESSAGE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->COMMAND_SUCCESS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SERIAL_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "SETTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->SETTING:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "RESPONSE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "COMMAND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->COMMAND:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "ACK_MESSAGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ACK_MESSAGE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "COMMAND_SUCCESS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->COMMAND_SUCCESS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 34
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "GEN2_FIRMWARE_REQUEST"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 35
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "GEN2_SERIAL_REQUEST"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SERIAL_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "GEN2_SETTINGS_REQUEST"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    const-string v1, "GEN2_FIRMWARE_RESPONSE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->$values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 38
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;
    .locals 2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 38
    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    return-object v0
.end method
