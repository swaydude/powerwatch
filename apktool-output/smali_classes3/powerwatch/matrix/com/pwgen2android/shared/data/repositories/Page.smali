.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;
.super Ljava/lang/Object;
.source "Repository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u000c2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u0015\u0010\u001a\u001a\u00020\u000c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "",
        "limit",
        "",
        "offset",
        "",
        "pageExpireTime",
        "correctedOffset",
        "(IJJI)V",
        "getCorrectedOffset",
        "()I",
        "isToday",
        "",
        "()Z",
        "getLimit",
        "getOffset",
        "()J",
        "getPageExpireTime",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "isPageExpired",
        "cacheStoredTimestamp",
        "(Ljava/lang/Long;)Z",
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
.field private final correctedOffset:I

.field private final limit:I

.field private final offset:J

.field private final pageExpireTime:J


# direct methods
.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJJI)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    iput-wide p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    iput-wide p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    iput p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    return-void
.end method

.method public synthetic constructor <init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/16 p1, 0xa

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    const-wide/32 p4, 0xa4cb80

    :cond_2
    move-wide v2, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    const/4 p6, 0x0

    const/4 p8, 0x0

    goto :goto_0

    :cond_3
    move p8, p6

    :goto_0
    move-object p2, p0

    move p3, p1

    move-wide p4, v0

    move-wide p6, v2

    .line 8
    invoke-direct/range {p2 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJI)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;IJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-wide p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    :cond_2
    move-wide v2, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    :cond_3
    move p8, p6

    move-object p2, p0

    move p3, p1

    move-wide p4, v0

    move-wide p6, v2

    invoke-virtual/range {p2 .. p8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->copy(IJJI)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    return v0
.end method

.method public final copy(IJJI)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;
    .locals 8

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-object v0, v7

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;-><init>(IJJI)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCorrectedOffset()I
    .locals 1

    .line 8
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    return v0
.end method

.method public final getLimit()I
    .locals 1

    .line 8
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    return v0
.end method

.method public final getOffset()J
    .locals 2

    .line 8
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    return-wide v0
.end method

.method public final getPageExpireTime()J
    .locals 2

    .line 8
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isPageExpired(Ljava/lang/Long;)Z
    .locals 4

    if-eqz p1, :cond_1

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final isToday()Z
    .locals 5

    .line 11
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const-wide/16 v2, -0x18

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Page(limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->offset:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pageExpireTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->pageExpireTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", correctedOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->correctedOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
