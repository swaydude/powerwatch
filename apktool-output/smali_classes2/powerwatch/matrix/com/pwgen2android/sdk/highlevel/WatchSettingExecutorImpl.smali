.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;
.super Ljava/lang/Object;
.source "WatchSettingsExecutor.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "settingsDataRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;)V",
        "getCommunicator",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "getDeviceCommunicationQueuer",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "getSettingsDataRepository",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "settingsExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;",
        "resetWatch",
        "Lio/reactivex/Completable;",
        "resetMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;",
        "sendCommand",
        "gen2Command",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
        "vv",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "",
        "setAlarm",
        "alarmData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;",
        "setAlert",
        "alertMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;",
        "setBLEDisconnectionAlert",
        "bleAlertMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;",
        "setBackLightDuration",
        "duration",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;",
        "setBackLightMode",
        "mode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;",
        "setDNDMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;",
        "setGPSUpdateRate",
        "gpsUpdateRate",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;",
        "setHomeScreenMode",
        "homeScreenMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;",
        "setPopupDuration",
        "popupDuration",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;",
        "setRingtone",
        "ringtoneMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;",
        "setTimer",
        "timerData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;",
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
.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field private final settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

.field private final settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 35
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    .line 37
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    invoke-direct {p3, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    return-void
.end method

.method public static synthetic lambda$6aDAafsh_ZQdhgnL4hvs8vFAw_E(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic lambda$AYo7FEHigmZu1HMkAUfVXBcUCCg(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DiJq2Y8RbfXdqyJ49ExkBqRiDjM(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lio/reactivex/MaybeEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lio/reactivex/MaybeEmitter;)V

    return-void
.end method

.method private final sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            "Lkotlin/Unit;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 41
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$DiJq2Y8RbfXdqyJ49ExkBqRiDjM;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$DiJq2Y8RbfXdqyJ49ExkBqRiDjM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;)V

    invoke-static {v0}, Lio/reactivex/Maybe;->create(Lio/reactivex/MaybeOnSubscribe;)Lio/reactivex/Maybe;

    move-result-object v0

    .line 45
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$AYo7FEHigmZu1HMkAUfVXBcUCCg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Maybe;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 47
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$6aDAafsh_ZQdhgnL4hvs8vFAw_E;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$WatchSettingExecutorImpl$6aDAafsh_ZQdhgnL4hvs8vFAw_E;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<String> {\n            val deviceID = communicator.defaultConnectedDevice()?.uid\n            if (deviceID == null) it.onError(Throwable(\"Device not connected\"))\n            else it.onSuccess(deviceID)\n        }.flatMapCompletable {\n            settingsExecutor.sendSettingCommand(it, gen2Command)\n        }.doOnComplete {\n            val deviceID = communicator.defaultConnectedDevice()?.uid\n            if (deviceID != null && vv != null) {\n                val data = settingsDataRepository.loadSettings(deviceID)\n                vv.invoke(data)\n                settingsDataRepository.saveSettings(deviceID, data)\n            }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final sendCommand$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lio/reactivex/MaybeEmitter;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    move-result-object p0

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    .line 43
    new-instance p0, Ljava/lang/Throwable;

    const-string v0, "Device not connected"

    invoke-direct {p0, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lio/reactivex/MaybeEmitter;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 44
    :cond_1
    invoke-interface {p1, p0}, Lio/reactivex/MaybeEmitter;->onSuccess(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static final sendCommand$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Ljava/lang/String;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$gen2Command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    const/4 v0, 0x1

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final sendCommand$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    move-result-object v0

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getSettingsDataRepository()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    move-result-object v1

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->loadSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object v1

    .line 51
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getSettingsDataRepository()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->saveSettings(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
    .locals 1

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-object v0
.end method

.method public final getDeviceCommunicationQueuer()Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    return-object v0
.end method

.method public final getSettingsDataRepository()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    return-object v0
.end method

.method public resetWatch(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "resetMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2ResetCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2ResetCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setAlarm(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "alarmData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2AlarmCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2AlarmCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "alertMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2AlertCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2AlertCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlert$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlert$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setBLEDisconnectionAlert(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "bleAlertMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BLEDisconnectionAlertCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BLEDisconnectionAlertCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBLEDisconnectionAlert$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBLEDisconnectionAlert$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setBackLightDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BackLightDurationCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BackLightDurationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBackLightDuration$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBackLightDuration$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setBackLightMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BackLightCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2BackLightCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBackLightMode$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setBackLightMode$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setDNDMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDGen2Command;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDGen2Command;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setDNDMode$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setDNDMode$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setGPSUpdateRate(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "gpsUpdateRate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2GPSUpdateRateCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2GPSUpdateRateCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setGPSUpdateRate$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setGPSUpdateRate$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setHomeScreenMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "homeScreenMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2HomeScreenCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2HomeScreenCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setHomeScreenMode$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setHomeScreenMode$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setPopupDuration(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "popupDuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2PopupDurationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setPopupDuration$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setPopupDuration$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setRingtone(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "ringtoneMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2RingtoneCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2RingtoneCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setRingtone$1;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setRingtone$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public setTimer(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "timerData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/Gen2TimerCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setTimer$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setTimer$1;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->sendCommand(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
