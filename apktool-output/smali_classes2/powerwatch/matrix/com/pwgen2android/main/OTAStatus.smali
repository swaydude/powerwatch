.class public final Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
.super Ljava/lang/Object;
.source "OtaProcessExecutorImpl.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;",
        "",
        "phaseProgress",
        "",
        "phase",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;",
        "phaseWeight",
        "",
        "totalProgress",
        "otaError",
        "",
        "(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)V",
        "getOtaError",
        "()Ljava/lang/Throwable;",
        "getPhase",
        "()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;",
        "getPhaseProgress",
        "()I",
        "getPhaseWeight",
        "()F",
        "getTotalProgress",
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
.field private final otaError:Ljava/lang/Throwable;

.field private final phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

.field private final phaseProgress:I

.field private final phaseWeight:F

.field private final totalProgress:I


# direct methods
.method public constructor <init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "phase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_1

    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move v5, p4

    :goto_2
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_3

    const/4 p5, 0x0

    :cond_3
    move-object v6, p5

    move-object v1, p0

    move-object v3, p2

    .line 35
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move-object p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->copy(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    return v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    return v0
.end method

.method public final component5()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final copy(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;
    .locals 7

    const-string v0, "phase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;-><init>(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getOtaError()Ljava/lang/Throwable;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    return-object v0
.end method

.method public final getPhaseProgress()I
    .locals 1

    .line 35
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    return v0
.end method

.method public final getPhaseWeight()F
    .locals 1

    .line 35
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    return v0
.end method

.method public final getTotalProgress()I
    .locals 1

    .line 35
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OTAStatus(phaseProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseProgress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", phase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phase:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", phaseWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->phaseWeight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", totalProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->totalProgress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", otaError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->otaError:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
