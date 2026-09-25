.class public abstract Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;
.super Ljava/lang/Object;
.source "UserActivityViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Google;,
        Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Baidu;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u000c\rB\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0007\"\u0004\u0008\u000b\u0010\t\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;",
        "",
        "hasLocations",
        "",
        "hasHeartRate",
        "(ZZ)V",
        "getHasHeartRate",
        "()Z",
        "setHasHeartRate",
        "(Z)V",
        "getHasLocations",
        "setHasLocations",
        "Baidu",
        "Google",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Google;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Baidu;",
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
.field private hasHeartRate:Z

.field private hasLocations:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasLocations:Z

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasHeartRate:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public final getHasHeartRate()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasHeartRate:Z

    return v0
.end method

.method public final getHasLocations()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasLocations:Z

    return v0
.end method

.method public final setHasHeartRate(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasHeartRate:Z

    return-void
.end method

.method public final setHasLocations(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->hasLocations:Z

    return-void
.end method
