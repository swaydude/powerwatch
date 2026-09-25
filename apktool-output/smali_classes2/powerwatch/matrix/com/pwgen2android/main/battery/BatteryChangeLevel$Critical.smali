.class public final Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;
.super Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
.source "BatteryNotificationPersistence.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Critical"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/high16 v0, 0x40a00000    # 5.0f

    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
