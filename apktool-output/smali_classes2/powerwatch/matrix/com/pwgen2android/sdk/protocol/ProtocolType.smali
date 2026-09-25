.class public final enum Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
.super Ljava/lang/Enum;
.source "Protocol.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "",
        "(Ljava/lang/String;I)V",
        "BLE_DTP",
        "BLE_OTA",
        "BLE_DTP_X",
        "GEN2_DTP",
        "GEN2_STANDARD_BASICS",
        "GEN2_HEART_RATE",
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
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum GEN2_HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public static final enum GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;


# direct methods
.method private static final synthetic $values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "BLE_DTP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "BLE_OTA"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "BLE_DTP_X"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 22
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "GEN2_DTP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "GEN2_STANDARD_BASICS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const-string v1, "GEN2_HEART_RATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->$values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 25
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 25
    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method
