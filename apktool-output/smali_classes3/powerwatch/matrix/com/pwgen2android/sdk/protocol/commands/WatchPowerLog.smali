.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\n\"\u0004\u0008\u000e\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\n\"\u0004\u0008\u0010\u0010\u000cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\n\"\u0004\u0008\u0012\u0010\u000cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\n\"\u0004\u0008\u0014\u0010\u000c\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;",
        "",
        "caseTemp",
        "",
        "skinTemp",
        "thermalGen",
        "solarGen",
        "powerConsumed",
        "(IIIII)V",
        "getCaseTemp",
        "()I",
        "setCaseTemp",
        "(I)V",
        "getPowerConsumed",
        "setPowerConsumed",
        "getSkinTemp",
        "setSkinTemp",
        "getSolarGen",
        "setSolarGen",
        "getThermalGen",
        "setThermalGen",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private caseTemp:I

.field private powerConsumed:I

.field private skinTemp:I

.field private solarGen:I

.field private thermalGen:I


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    .line 87
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    .line 88
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    const/4 p7, 0x0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p6, 0x0

    goto :goto_4

    :cond_4
    move p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v2

    move p5, v3

    .line 86
    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;IIIIIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->copy(IIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    return v0
.end method

.method public final copy(IIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;
    .locals 7

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;-><init>(IIIII)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCaseTemp()I
    .locals 1

    .line 86
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    return v0
.end method

.method public final getPowerConsumed()I
    .locals 1

    .line 88
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    return v0
.end method

.method public final getSkinTemp()I
    .locals 1

    .line 86
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    return v0
.end method

.method public final getSolarGen()I
    .locals 1

    .line 87
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    return v0
.end method

.method public final getThermalGen()I
    .locals 1

    .line 87
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCaseTemp(I)V
    .locals 0

    .line 86
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    return-void
.end method

.method public final setPowerConsumed(I)V
    .locals 0

    .line 88
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    return-void
.end method

.method public final setSkinTemp(I)V
    .locals 0

    .line 86
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    return-void
.end method

.method public final setSolarGen(I)V
    .locals 0

    .line 87
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    return-void
.end method

.method public final setThermalGen(I)V
    .locals 0

    .line 87
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchPowerLog(caseTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->caseTemp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", skinTemp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->skinTemp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", thermalGen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->thermalGen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", solarGen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->solarGen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", powerConsumed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;->powerConsumed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
