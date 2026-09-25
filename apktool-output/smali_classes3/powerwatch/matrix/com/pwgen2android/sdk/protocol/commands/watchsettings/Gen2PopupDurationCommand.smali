.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2PopupDurationCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "popupDuration",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)V",
        "createPayload",
        "",
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
.field private final popupDuration:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)V
    .locals 1

    const-string v0, "popupDuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$PopupDurationCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$PopupDurationCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;->popupDuration:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 14
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;->popupDuration:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;->getMode()B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    return-object v0
.end method
