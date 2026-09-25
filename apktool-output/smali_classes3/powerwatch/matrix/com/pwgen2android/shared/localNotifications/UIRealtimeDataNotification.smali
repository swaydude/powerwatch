.class public final Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;
.super Ljava/lang/Object;
.source "NotificationManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003JI\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;",
        "",
        "steps",
        "",
        "calories",
        "Lkotlin/Pair;",
        "distance",
        "heartRate",
        "(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V",
        "getCalories",
        "()Lkotlin/Pair;",
        "getDistance",
        "getHeartRate",
        "()Ljava/lang/String;",
        "getSteps",
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
.field private final calories:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final distance:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final heartRate:Ljava/lang/String;

.field private final steps:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distance"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->copy(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    return-object v0
.end method

.method public final component3()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distance"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;-><init>(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCalories()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    return-object v0
.end method

.method public final getDistance()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    return-object v0
.end method

.method public final getHeartRate()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    return-object v0
.end method

.method public final getSteps()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UIRealtimeDataNotification(steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->steps:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", calories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->calories:Lkotlin/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->distance:Lkotlin/Pair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->heartRate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
