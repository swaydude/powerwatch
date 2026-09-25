.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;
.super Ljava/lang/Object;
.source "SentAlertsCache.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\t2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;",
        "",
        "time",
        "",
        "alertId",
        "",
        "title",
        "",
        "isMessage",
        "",
        "(JILjava/lang/String;Z)V",
        "getAlertId",
        "()I",
        "()Z",
        "getTime",
        "()J",
        "getTitle",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final alertId:I

.field private final isMessage:Z

.field private final time:J

.field private final title:Ljava/lang/String;


# direct methods
.method public constructor <init>(JILjava/lang/String;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    iput-boolean p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    return-void
.end method

.method public synthetic constructor <init>(JILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, p5

    :goto_0
    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;-><init>(JILjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;JILjava/lang/String;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-boolean p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    :cond_3
    move v5, p5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->copy(JILjava/lang/String;Z)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    return v0
.end method

.method public final copy(JILjava/lang/String;Z)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;
    .locals 7

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    move-object v1, v0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;-><init>(JILjava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAlertId()I
    .locals 1

    .line 12
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    .line 12
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isMessage()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AlertCacheInfo(time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", alertId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->alertId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
