.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;
.super Ljava/lang/Object;
.source "RealtimeDataParser.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsWalk;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsRun;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCalories;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesBRM;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u000c\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u000c\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;",
        "",
        "value",
        "",
        "(B)V",
        "getValue",
        "()B",
        "BatteryPercentage",
        "TotalCalories",
        "TotalCurrentCaloriesActive",
        "TotalCurrentCaloriesBRM",
        "TotalCurrentStepsRun",
        "TotalCurrentStepsWalk",
        "TotalDistance",
        "TotalSkinTemp",
        "TotalSleep",
        "TotalSolarPower",
        "TotalSteps",
        "TotalThermalPower",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSteps;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsWalk;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentStepsRun;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCalories;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesBRM;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalCurrentCaloriesActive;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSleep;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalDistance;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSolarPower;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalThermalPower;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$TotalSkinTemp;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable$BatteryPercentage;",
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
.field private final value:B


# direct methods
.method private constructor <init>(B)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;->value:B

    return-void
.end method

.method public synthetic constructor <init>(BLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    .line 83
    iget-byte v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/HSMTable;->value:B

    return v0
.end method
