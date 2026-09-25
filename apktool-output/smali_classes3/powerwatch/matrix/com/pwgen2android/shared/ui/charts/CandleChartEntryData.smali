.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;
.super Ljava/lang/Object;
.source "CandlesFragment.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\t2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006)"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;",
        "Landroid/os/Parcelable;",
        "x",
        "",
        "shadowH",
        "shadowL",
        "open",
        "close",
        "malformed",
        "",
        "(FFFFFZ)V",
        "getClose",
        "()F",
        "getMalformed",
        "()Z",
        "getOpen",
        "getShadowH",
        "getShadowL",
        "getX",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "createCandleEntry",
        "Lcom/github/mikephil/charting/data/CandleEntry;",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final close:F

.field private final malformed:Z

.field private final open:F

.field private final shadowH:F

.field private final shadowL:F

.field private final x:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FFFFFZ)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    iput-boolean p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFFFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    const/4 v6, 0x0

    goto :goto_0

    :cond_0
    move v6, p6

    :goto_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 30
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;-><init>(FFFFFZ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;FFFFFZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->copy(FFFFFZ)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    return v0
.end method

.method public final copy(FFFFFZ)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;
    .locals 8

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;-><init>(FFFFFZ)V

    return-object v7
.end method

.method public final createCandleEntry()Lcom/github/mikephil/charting/data/CandleEntry;
    .locals 7

    .line 33
    new-instance v6, Lcom/github/mikephil/charting/data/CandleEntry;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    iget v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    iget v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/github/mikephil/charting/data/CandleEntry;-><init>(FFFFF)V

    return-object v6
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getClose()F
    .locals 1

    .line 30
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    return v0
.end method

.method public final getMalformed()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    return v0
.end method

.method public final getOpen()F
    .locals 1

    .line 30
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    return v0
.end method

.method public final getShadowH()F
    .locals 1

    .line 30
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    return v0
.end method

.method public final getShadowL()F
    .locals 1

    .line 30
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    return v0
.end method

.method public final getX()F
    .locals 1

    .line 30
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CandleChartEntryData(x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shadowH="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shadowL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", open="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", close="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", malformed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->x:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowH:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->shadowL:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->open:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->close:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;->malformed:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
