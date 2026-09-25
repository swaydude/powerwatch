.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;
.super Ljava/lang/Object;
.source "Gen2TimerCommand.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;",
        "",
        "hour",
        "",
        "minute",
        "seconds",
        "timerControl",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;",
        "(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)V",
        "getHour",
        "()B",
        "getMinute",
        "getSeconds",
        "getTimerControl",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final hour:B

.field private final minute:B

.field private final seconds:B

.field private final timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;


# direct methods
.method public constructor <init>(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)V
    .locals 1

    const-string v0, "timerControl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    iput-byte p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    iput-byte p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-byte p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-byte p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->copy(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    return v0
.end method

.method public final component2()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    return v0
.end method

.method public final component3()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    return v0
.end method

.method public final component4()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    return-object v0
.end method

.method public final copy(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;
    .locals 1

    const-string v0, "timerControl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;-><init>(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHour()B
    .locals 1

    .line 9
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    return v0
.end method

.method public final getMinute()B
    .locals 1

    .line 9
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    return v0
.end method

.method public final getSeconds()B
    .locals 1

    .line 9
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    return v0
.end method

.method public final getTimerControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TimerData(hour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->hour:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->minute:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", seconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->seconds:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timerControl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;->timerControl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
