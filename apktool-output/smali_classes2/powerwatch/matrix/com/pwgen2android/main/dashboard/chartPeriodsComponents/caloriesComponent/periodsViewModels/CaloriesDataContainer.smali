.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;
.super Ljava/lang/Object;
.source "CaloriesPeriodFormatterViewModels.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\r\"\u0004\u0008\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\r\"\u0004\u0008\u0015\u0010\u000f\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;",
        "",
        "calories",
        "",
        "isArtificialData",
        "",
        "valid",
        "malformedContainer",
        "(IZZZ)V",
        "getCalories",
        "()I",
        "setCalories",
        "(I)V",
        "()Z",
        "setArtificialData",
        "(Z)V",
        "malformed",
        "getMalformed",
        "getMalformedContainer",
        "setMalformedContainer",
        "getValid",
        "setValid",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private calories:I

.field private isArtificialData:Z

.field private malformedContainer:Z

.field private valid:Z


# direct methods
.method public constructor <init>(IZZZ)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    .line 29
    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    iput-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x1

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 28
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;IZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->copy(IZZZ)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    return v0
.end method

.method public final copy(IZZZ)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;-><init>(IZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCalories()I
    .locals 1

    .line 28
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    return v0
.end method

.method public final getMalformed()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getMalformedContainer()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    return v0
.end method

.method public final getValid()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public final isArtificialData()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    return v0
.end method

.method public final setArtificialData(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    return-void
.end method

.method public final setCalories(I)V
    .locals 0

    .line 28
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    return-void
.end method

.method public final setMalformedContainer(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    return-void
.end method

.method public final setValid(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaloriesDataContainer(calories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->calories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isArtificialData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->isArtificialData:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", valid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->valid:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", malformedContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDataContainer;->malformedContainer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
