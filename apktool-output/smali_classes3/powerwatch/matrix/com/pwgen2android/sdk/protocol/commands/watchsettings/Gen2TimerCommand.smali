.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "Gen2TimerCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "timerData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;)V",
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
.field private final timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;)V
    .locals 1

    const-string v0, "timerData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$TimerCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$TimerCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;->timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 3

    const/4 v0, 0x4

    .line 20
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 21
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 22
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;->timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->getHour()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 23
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;->timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->getMinute()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 24
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;->timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->getSeconds()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 25
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;->timerData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->getTimerControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;->getMode()B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 27
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
