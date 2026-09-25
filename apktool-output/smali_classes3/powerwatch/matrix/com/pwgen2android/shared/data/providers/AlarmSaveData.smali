.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;
.super Ljava/lang/Object;
.source "SettingsDataRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;",
        "",
        "hour",
        "",
        "minute",
        "isAM",
        "",
        "daySelection",
        "",
        "alarmControl",
        "(BBZII)V",
        "getAlarmControl",
        "()I",
        "getDaySelection",
        "getHour",
        "()B",
        "()Z",
        "getMinute",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
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
.field private final alarmControl:I

.field private final daySelection:I

.field private final hour:B

.field private final isAM:Z

.field private final minute:B


# direct methods
.method public constructor <init>(BBZII)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    iput-byte p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    .line 85
    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    .line 86
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;BBZIIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-byte p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    :cond_4
    move v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->copy(BBZII)Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    return v0
.end method

.method public final component2()B
    .locals 1

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    return v0
.end method

.method public final copy(BBZII)Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;
    .locals 7

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;-><init>(BBZII)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    iget-byte v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAlarmControl()I
    .locals 1

    .line 86
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    return v0
.end method

.method public final getDaySelection()I
    .locals 1

    .line 85
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    return v0
.end method

.method public final getHour()B
    .locals 1

    .line 84
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    return v0
.end method

.method public final getMinute()B
    .locals 1

    .line 84
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAM()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AlarmSaveData(hour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->hour:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->minute:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isAM="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", daySelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->daySelection:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alarmControl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->alarmControl:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
