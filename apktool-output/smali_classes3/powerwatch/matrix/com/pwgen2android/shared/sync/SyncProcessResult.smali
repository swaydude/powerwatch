.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;
.super Ljava/lang/Object;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;,
        Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u000b\u000c\rB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;",
        "",
        "progress",
        "",
        "error",
        "",
        "(ILjava/lang/Throwable;)V",
        "getError",
        "()Ljava/lang/Throwable;",
        "getProgress",
        "()I",
        "AGPSProgress",
        "FontUpdateProgress",
        "SyncProgress",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;",
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
.field private final error:Ljava/lang/Throwable;

.field private final progress:I


# direct methods
.method private constructor <init>(ILjava/lang/Throwable;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->progress:I

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->error:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;-><init>(ILjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getError()Ljava/lang/Throwable;
    .locals 1

    .line 98
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getProgress()I
    .locals 1

    .line 98
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->progress:I

    return v0
.end method
