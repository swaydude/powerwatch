.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics$WhenMappings;
.super Ljava/lang/Object;
.source "Protocol.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->values()[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_FIRMWARE_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SERIAL_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->GEN2_SETTINGS_REQUEST:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2ProtocolBasics$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
