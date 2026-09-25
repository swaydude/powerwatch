.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;
.super Ljava/lang/Object;
.source "ItemExecutorDelegate.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;",
        "",
        "settingsExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;)V",
        "executeItem",
        "Lio/reactivex/Completable;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;",
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
.field private final settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;)V
    .locals 1

    const-string v0, "settingsExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    return-void
.end method

.method private static final executeItem$lambda-0()V
    .locals 1

    .line 103
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentRepeat(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V

    return-void
.end method

.method private static final executeItem$lambda-1()V
    .locals 1

    .line 106
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentRepeat(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V

    return-void
.end method

.method private static final executeItem$lambda-2()V
    .locals 1

    .line 109
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentRepeat(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V

    return-void
.end method

.method private static final executeItem$lambda-3()V
    .locals 1

    .line 117
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentSelectionMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    return-void
.end method

.method private static final executeItem$lambda-4()V
    .locals 1

    .line 120
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentSelectionMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    return-void
.end method

.method private static final executeItem$lambda-5()V
    .locals 1

    .line 123
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentSelectionMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    return-void
.end method

.method public static synthetic lambda$BiER0ealNenP4-sa_J16e16Vvq0()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-0()V

    return-void
.end method

.method public static synthetic lambda$DH3Zx2jx4_4Hrpu3T2NSY4uGM3Y()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-3()V

    return-void
.end method

.method public static synthetic lambda$RjzSQaMv1eUhvP-RmytdkjpaYcQ()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-5()V

    return-void
.end method

.method public static synthetic lambda$cMjLJNgFr8RsS3UOwOM3BQ7Bar4()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-4()V

    return-void
.end method

.method public static synthetic lambda$lxFyO20sVzbb6T6R29NYKmNh6RM()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-1()V

    return-void
.end method

.method public static synthetic lambda$mnJHWRzgC167JQZnLhlRch44I9U()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem$lambda-2()V

    return-void
.end method


# virtual methods
.method public final executeItem(Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;)Lio/reactivex/Completable;
    .locals 6

    const-string v0, "executeItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    move-result-object v0

    .line 21
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "complete()"

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    .line 22
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_2

    if-eq p1, v4, :cond_1

    if-eq p1, v3, :cond_0

    .line 26
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 25
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$AUTO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$AUTO;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setDNDMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 24
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$ON;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$ON;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setDNDMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 23
    :cond_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$OFF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$OFF;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setDNDMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 28
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x3

    if-eqz v1, :cond_8

    .line 29
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_5

    if-eq p1, v5, :cond_4

    .line 34
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 33
    :cond_4
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$WristShake;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$WristShake;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 32
    :cond_5
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$WristTilt;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$WristTilt;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 31
    :cond_6
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$DoubleTap;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$DoubleTap;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 30
    :cond_7
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode$Off;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 37
    :cond_8
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 38
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_b

    if-eq p1, v4, :cond_a

    if-eq p1, v3, :cond_9

    .line 42
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 41
    :cond_9
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed10Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed10Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 40
    :cond_a
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed5Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed5Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 39
    :cond_b
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed2Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed2Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBackLightDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 45
    :cond_c
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 46
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_f

    if-eq p1, v4, :cond_e

    if-eq p1, v3, :cond_d

    .line 50
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 49
    :cond_d
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed15Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed15Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setPopupDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 48
    :cond_e
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed10Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed10Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setPopupDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 47
    :cond_f
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed5Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration$Timed5Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setPopupDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 53
    :cond_10
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 54
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_15

    if-eq p1, v4, :cond_14

    if-eq p1, v3, :cond_13

    if-eq p1, v5, :cond_12

    const/4 v0, 0x4

    if-eq p1, v0, :cond_11

    .line 60
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 59
    :cond_11
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed10Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed10Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 58
    :cond_12
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed5Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed5Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 57
    :cond_13
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed2Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed2Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 56
    :cond_14
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed1Sec;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed1Sec;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 55
    :cond_15
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Auto;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Auto;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 64
    :cond_16
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 65
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_1a

    if-eq p1, v4, :cond_19

    if-eq p1, v3, :cond_18

    if-eq p1, v5, :cond_17

    .line 70
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 69
    :cond_17
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Power;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setHomeScreenMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 68
    :cond_18
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Temperature;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Temperature;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setHomeScreenMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 67
    :cond_19
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$SleepHR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$SleepHR;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setHomeScreenMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 66
    :cond_1a
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$StepsCalories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$StepsCalories;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setHomeScreenMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 74
    :cond_1b
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 75
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_1f

    if-eq p1, v4, :cond_1e

    if-eq p1, v3, :cond_1d

    if-eq p1, v5, :cond_1c

    .line 80
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 79
    :cond_1c
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$VibeAudio;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$VibeAudio;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBLEDisconnectionAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 78
    :cond_1d
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Audio;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Audio;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBLEDisconnectionAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 77
    :cond_1e
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Vibrate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Vibrate;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBLEDisconnectionAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 76
    :cond_1f
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode$Off;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setBLEDisconnectionAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 83
    :cond_20
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    .line 84
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_23

    if-eq p1, v4, :cond_22

    if-eq p1, v3, :cond_21

    .line 88
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 87
    :cond_21
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Triple;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Triple;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setRingtone(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 86
    :cond_22
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Double;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Double;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setRingtone(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 85
    :cond_23
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Single;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Single;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setRingtone(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 91
    :cond_24
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    .line 92
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_27

    if-eq p1, v4, :cond_26

    if-eq p1, v3, :cond_25

    .line 96
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 95
    :cond_25
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$Audio;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$Audio;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 94
    :cond_26
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$Vibrate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$Vibrate;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 93
    :cond_27
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$VibeAudio;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode$VibeAudio;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;

    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)Lio/reactivex/Completable;

    move-result-object p1

    goto/16 :goto_2

    .line 99
    :cond_28
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    .line 100
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_2b

    if-eq p1, v4, :cond_2a

    if-eq p1, v3, :cond_29

    .line 111
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_0

    .line 105
    :cond_29
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$mnJHWRzgC167JQZnLhlRch44I9U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$mnJHWRzgC167JQZnLhlRch44I9U;

    .line 108
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_0

    .line 102
    :cond_2a
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$lxFyO20sVzbb6T6R29NYKmNh6RM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$lxFyO20sVzbb6T6R29NYKmNh6RM;

    .line 105
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_0

    .line 100
    :cond_2b
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$BiER0ealNenP4-sa_J16e16Vvq0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$BiER0ealNenP4-sa_J16e16Vvq0;

    .line 102
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    :goto_0
    const-string v0, "{\n                when (executeItem.id) {\n                    //todo move this to some kind of persistence\n                    0 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryDay\n                    }\n                    1 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryWeekDay\n                    }\n                    2 -> Completable.fromAction {\n                        currentRepeat = DaySelection.EveryWeekend\n                    }\n                    else -> Completable.complete()\n                }\n            }"

    .line 99
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 114
    :cond_2c
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;->getId()I

    move-result p1

    if-eqz p1, :cond_2f

    if-eq p1, v4, :cond_2e

    if-eq p1, v3, :cond_2d

    .line 125
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_1

    .line 119
    :cond_2d
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$RjzSQaMv1eUhvP-RmytdkjpaYcQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$RjzSQaMv1eUhvP-RmytdkjpaYcQ;

    .line 122
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_1

    .line 116
    :cond_2e
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$cMjLJNgFr8RsS3UOwOM3BQ7Bar4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$cMjLJNgFr8RsS3UOwOM3BQ7Bar4;

    .line 119
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    goto :goto_1

    .line 114
    :cond_2f
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$DH3Zx2jx4_4Hrpu3T2NSY4uGM3Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$ItemExecutorDelegate$DH3Zx2jx4_4Hrpu3T2NSY4uGM3Y;

    .line 116
    invoke-static {p1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    :goto_1
    const-string v0, "when (executeItem.id) {\n                //todo move this to some kind of persistence\n                0 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.Off\n                }\n                1 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.On\n                }\n                2 -> Completable.fromAction {\n                    currentSelectionMode = AlarmControl.Once\n                }\n                else -> Completable.complete()\n            }"

    .line 114
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 127
    :cond_30
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$UNKNOWN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$UNKNOWN;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1

    :cond_31
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
