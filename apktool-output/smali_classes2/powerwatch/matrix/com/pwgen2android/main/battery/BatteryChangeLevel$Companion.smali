.class public final Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;
.super Ljava/lang/Object;
.source "BatteryNotificationPersistence.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;",
        "",
        "()V",
        "getLevel",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;",
        "level",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLevel(F)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
    .locals 1

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;->getThreshold()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;->getThreshold()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_1

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    goto :goto_0

    .line 18
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Normal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Normal;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    :goto_0
    return-object p1
.end method
