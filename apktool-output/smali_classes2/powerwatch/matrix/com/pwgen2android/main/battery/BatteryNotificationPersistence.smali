.class public final Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;
.super Ljava/lang/Object;
.source "BatteryNotificationPersistence.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0006J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "storeLevelKey",
        "",
        "storeSettingKey",
        "enableBatteryNotification",
        "",
        "enabled",
        "",
        "deviceId",
        "getBatteryLevelChange",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;",
        "isBatteryNotificationEnabled",
        "storeBatteryLevelChange",
        "batteryLevel",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private final storeLevelKey:Ljava/lang/String;

.field private final storeSettingKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->context:Landroid/content/Context;

    const-string p1, "stored_battery_level_change"

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeLevelKey:Ljava/lang/String;

    const-string p1, "stored_setting_key"

    .line 25
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeSettingKey:Ljava/lang/String;

    return-void
.end method

.method public static synthetic storeBatteryLevelChange$default(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Ljava/lang/String;FILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 33
    :cond_0
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeBatteryLevelChange(Ljava/lang/String;F)V

    return-void
.end method


# virtual methods
.method public final enableBatteryNotification(ZLjava/lang/String;)V
    .locals 2

    const-string v0, "deviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeSettingKey:Ljava/lang/String;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public final getBatteryLevelChange(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
    .locals 2

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeLevelKey:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    .line 29
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;->getLevel(F)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    move-result-object p1

    return-object p1
.end method

.method public final isBatteryNotificationEnabled(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeSettingKey:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final storeBatteryLevelChange(Ljava/lang/String;F)V
    .locals 2

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeLevelKey:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
