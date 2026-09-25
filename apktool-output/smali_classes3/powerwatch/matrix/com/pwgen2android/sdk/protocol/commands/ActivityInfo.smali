.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\"\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;",
        "",
        "latitudeSum",
        "",
        "longitudeSum",
        "activityDataLogs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
        "(DDLjava/util/List;)V",
        "getActivityDataLogs",
        "()Ljava/util/List;",
        "setActivityDataLogs",
        "(Ljava/util/List;)V",
        "getLatitudeSum",
        "()D",
        "setLatitudeSum",
        "(D)V",
        "getLongitudeSum",
        "setLongitudeSum",
        "component1",
        "component2",
        "component3",
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
.field private activityDataLogs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;"
        }
    .end annotation
.end field

.field private latitudeSum:D

.field private longitudeSum:D


# direct methods
.method public constructor <init>()V
    .locals 8

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;-><init>(DDLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DDLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityDataLogs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    .line 429
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(DDLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const-wide/16 v0, 0x0

    if-eqz p7, :cond_0

    move-wide v2, v0

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-wide v0, p3

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    .line 429
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    move-object p5, p1

    check-cast p5, Ljava/util/List;

    :cond_2
    move-object p6, p5

    move-object p1, p0

    move-wide p2, v2

    move-wide p4, v0

    .line 428
    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;-><init>(DDLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;DDLjava/util/List;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->copy(DDLjava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    return-wide v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    return-object v0
.end method

.method public final copy(DDLjava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;"
        }
    .end annotation

    const-string v0, "activityDataLogs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    move-object v1, v0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;-><init>(DDLjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iget-wide v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getActivityDataLogs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;"
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    return-object v0
.end method

.method public final getLatitudeSum()D
    .locals 2

    .line 428
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    return-wide v0
.end method

.method public final getLongitudeSum()D
    .locals 2

    .line 428
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo-$$ExternalSynthetic0;->m0(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setActivityDataLogs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    return-void
.end method

.method public final setLatitudeSum(D)V
    .locals 0

    .line 428
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    return-void
.end method

.method public final setLongitudeSum(D)V
    .locals 0

    .line 428
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityInfo(latitudeSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->latitudeSum:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitudeSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->longitudeSum:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", activityDataLogs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;->activityDataLogs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
