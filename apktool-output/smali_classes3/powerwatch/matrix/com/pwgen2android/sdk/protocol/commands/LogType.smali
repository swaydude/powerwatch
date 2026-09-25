.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;
.super Ljava/lang/Object;
.source "Gen2BackgroundLogCommand.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\n\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;",
        "",
        "enumValue",
        "",
        "(I)V",
        "getEnumValue",
        "()I",
        "AwakeBike",
        "AwakeRunning",
        "AwakeStill",
        "AwakeVehicle",
        "AwakeWalking",
        "DevOffWrist",
        "SleepDeep",
        "SleepLight",
        "SleepRestless",
        "StateUnknown",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;",
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


# instance fields
.field private final enumValue:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;->enumValue:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getEnumValue()I
    .locals 1

    .line 14
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;->enumValue:I

    return v0
.end method
