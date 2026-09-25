.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;
.super Ljava/lang/Object;
.source "ItemExecutorDelegate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "currentRepeat",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;",
        "getCurrentRepeat",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;",
        "setCurrentRepeat",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V",
        "currentSelectionMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;",
        "getCurrentSelectionMode",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;",
        "setCurrentSelectionMode",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static currentRepeat:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

.field private static currentSelectionMode:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 132
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentRepeat:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    .line 133
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentSelectionMode:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    return-void
.end method

.method public static final getCurrentRepeat()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;
    .locals 1

    .line 132
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentRepeat:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    return-object v0
.end method

.method public static final getCurrentSelectionMode()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;
    .locals 1

    .line 133
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentSelectionMode:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    return-object v0
.end method

.method public static final setCurrentRepeat(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    sput-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentRepeat:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    return-void
.end method

.method public static final setCurrentSelectionMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    sput-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->currentSelectionMode:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    return-void
.end method
