.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;
.super Ljava/lang/Object;
.source "SettingsDataRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000cJ\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0007J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "changeSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "kotlin.jvm.PlatformType",
        "gson",
        "Lcom/google/gson/Gson;",
        "listen",
        "Lio/reactivex/Observable;",
        "loadAlarm",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;",
        "loadSettings",
        "deviceID",
        "",
        "saveAlarm",
        "",
        "alarmData",
        "saveSettings",
        "settingsData",
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
.field private final appContext:Landroid/content/Context;

.field private final changeSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            ">;"
        }
    .end annotation
.end field

.field private final gson:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->appContext:Landroid/content/Context;

    .line 20
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->gson:Lcom/google/gson/Gson;

    .line 21
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<SettingsData>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->changeSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method


# virtual methods
.method public final listen()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            ">;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->changeSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final loadAlarm()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;
    .locals 9

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "watch_alarm"

    const/4 v2, 0x0

    .line 56
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 59
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->gson:Lcom/google/gson/Gson;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadAlarm$loadedData$1;

    invoke-direct {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadAlarm$loadedData$1;-><init>()V

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadAlarm$loadedData$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "gson.fromJson(data, object : TypeToken<AlarmSaveData>() {}.type)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    .line 60
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->getDaySelection()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    .line 63
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekend;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    goto :goto_0

    .line 62
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryWeekDay;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    goto :goto_0

    .line 61
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$EveryDay;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    :goto_0
    move-object v7, v1

    .line 66
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->getAlarmControl()I

    move-result v1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    .line 69
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Once;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    goto :goto_1

    .line 68
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$On;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    goto :goto_1

    .line 67
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Off;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    :goto_1
    move-object v8, v1

    .line 71
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    .line 72
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->getHour()B

    move-result v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->getMinute()B

    move-result v5

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;->isAM()Z

    move-result v6

    move-object v3, v1

    .line 71
    invoke-direct/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;-><init>(BBZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    return-object v1

    :cond_4
    return-object v2
.end method

.method public final loadSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 2

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, " - watch_settings"

    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->gson:Lcom/google/gson/Gson;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadSettings$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadSettings$1;-><init>()V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository$loadSettings$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    :cond_0
    return-object v1
.end method

.method public final saveAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)V
    .locals 7

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "alarmData"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->gson:Lcom/google/gson/Gson;

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;

    .line 47
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getHour()B

    move-result v1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getMinute()B

    move-result v2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->isAM()Z

    move-result v3

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getDaySelection()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->getMode()B

    move-result v4

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getAlarmControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->getMode()B

    move-result v5

    move-object v0, v6

    .line 46
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;-><init>(BBZII)V

    invoke-virtual {p1, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 49
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->appContext:Landroid/content/Context;

    invoke-static {p2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    .line 50
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "watch_alarm"

    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 51
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public final saveSettings(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 5

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->appContext:Landroid/content/Context;

    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 37
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, " - watch_settings"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 38
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 40
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->changeSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
