.class public final enum Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;
.super Ljava/lang/Enum;
.source "eAmotaCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_FW_DATA:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_FW_HEADER:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_FW_RESET:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_FW_VERIFY:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_MAX:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

.field public static final enum AMOTA_CMD_UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 7
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v1, "AMOTA_CMD_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    .line 8
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v3, "AMOTA_CMD_FW_HEADER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_HEADER:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    .line 9
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v5, "AMOTA_CMD_FW_DATA"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_DATA:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    .line 10
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v7, "AMOTA_CMD_FW_VERIFY"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_VERIFY:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    .line 11
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v9, "AMOTA_CMD_FW_RESET"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_RESET:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    .line 12
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const-string v11, "AMOTA_CMD_MAX"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_MAX:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const/4 v11, 0x6

    new-array v11, v11, [Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 6
    sput-object v11, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    .line 6
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;
    .locals 1

    .line 6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    invoke-virtual {v0}, [Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object v0
.end method
