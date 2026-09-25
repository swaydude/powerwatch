.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;
.super Ljava/lang/Object;
.source "Gen2AlarmCommand.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\u0008\t\nB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;",
        "",
        "mode",
        "",
        "(B)V",
        "getMode",
        "()B",
        "Companion",
        "EveryDay",
        "EveryWeekDay",
        "EveryWeekend",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;


# instance fields
.field private final mode:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;

    return-void
.end method

.method private constructor <init>(B)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->mode:B

    return-void
.end method

.method public synthetic constructor <init>(BLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final getMode()B
    .locals 1

    .line 14
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->mode:B

    return v0
.end method
