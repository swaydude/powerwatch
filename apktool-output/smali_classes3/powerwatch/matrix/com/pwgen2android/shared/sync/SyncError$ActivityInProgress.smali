.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;
.super Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActivityInProgress"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;",
        "()V",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "Activity In Progress Sync Error"

    const/4 v1, 0x0

    .line 76
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
