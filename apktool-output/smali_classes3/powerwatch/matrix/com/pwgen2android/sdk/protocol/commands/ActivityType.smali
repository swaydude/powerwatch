.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u000c\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u000c\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;",
        "",
        "type",
        "",
        "(I)V",
        "getType",
        "()I",
        "ACTIVITY_HIIT",
        "ACTIVITY_INDOOR_BIKING",
        "ACTIVITY_INDOOR_JOGGING",
        "ACTIVITY_INDOOR_RUNNING",
        "ACTIVITY_INDOOR_WALKING",
        "BIKING",
        "DRIVING",
        "JOGGING",
        "RUNNING",
        "STATIONARY",
        "UNKNOWN",
        "WALKING",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$STATIONARY;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$WALKING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$RUNNING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$JOGGING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$BIKING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$DRIVING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_WALKING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_RUNNING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_JOGGING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_INDOOR_BIKING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$ACTIVITY_HIIT;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType$UNKNOWN;",
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
.field private final type:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 289
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;->type:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 289
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;->type:I

    return v0
.end method
