.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;
.super Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FontUpdateProgress"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "progress",
        "",
        "started",
        "",
        "completed",
        "error",
        "",
        "(IZZLjava/lang/Throwable;)V",
        "getCompleted",
        "()Z",
        "getStarted",
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
.field private final completed:Z

.field private final started:Z


# direct methods
.method public constructor <init>(IZZLjava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-direct {p0, p1, p4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;-><init>(ILjava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->started:Z

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->completed:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 101
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;-><init>(IZZLjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getCompleted()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->completed:Z

    return v0
.end method

.method public final getStarted()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->started:Z

    return v0
.end method
