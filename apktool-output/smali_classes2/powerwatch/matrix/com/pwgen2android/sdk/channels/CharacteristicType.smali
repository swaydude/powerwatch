.class public final enum Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;
.super Ljava/lang/Enum;
.source "CommunicationChannel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
        "",
        "(Ljava/lang/String;I)V",
        "FIRMWARE",
        "SERIAL",
        "HEART_RATE",
        "SETTINGS_INFO",
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
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

.field public static final enum FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

.field public static final enum HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

.field public static final enum SERIAL:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

.field public static final enum SETTINGS_INFO:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;


# direct methods
.method private static final synthetic $values()[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SERIAL:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SETTINGS_INFO:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 13
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const-string v1, "FIRMWARE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->FIRMWARE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const-string v1, "SERIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SERIAL:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const-string v1, "HEART_RATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    const-string v1, "SETTINGS_INFO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->SETTINGS_INFO:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->$values()[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 14
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;
    .locals 2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 14
    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;

    return-object v0
.end method
