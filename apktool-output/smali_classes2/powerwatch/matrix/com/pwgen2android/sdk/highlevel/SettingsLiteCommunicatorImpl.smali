.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;
.super Ljava/lang/Object;
.source "SettingsLiteCommunicator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V",
        "settingsExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;",
        "applySetting",
        "Lio/reactivex/Completable;",
        "setting",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;",
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

.field private final settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    return-void
.end method

.method private static final applySetting$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)Lio/reactivex/CompletableSource;
    .locals 14

    const-string v0, "$setting"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;->getDeviceID()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    .line 36
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "No device connected"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 39
    :cond_1
    instance-of v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    .line 40
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;

    .line 41
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v6

    if-ne v5, v6, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 42
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object p0

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    .line 41
    invoke-direct {v4, v5, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;-><init>(ZZ)V

    .line 40
    invoke-direct {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserInformationCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;)V

    .line 43
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    new-array p1, v3, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object v1, p1, v2

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto/16 :goto_3

    .line 45
    :cond_3
    instance-of v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    if-eqz v1, :cond_4

    .line 46
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;

    .line 47
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result v7

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v8

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v9

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v10

    .line 46
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    const/4 v11, 0x0

    const/16 v12, 0x20

    const/4 v13, 0x0

    move-object v5, p0

    invoke-direct/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;-><init>(ZIIFLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendBiometricsCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;)V

    .line 52
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    new-array p1, v3, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object v1, p1, v2

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto/16 :goto_3

    .line 54
    :cond_4
    instance-of v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;

    if-eqz v1, :cond_5

    .line 55
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v4

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v5

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v6

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result p0

    invoke-direct {v1, v4, v5, v6, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;-><init>(IFII)V

    .line 56
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendStepsDistanceGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    .line 57
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;

    invoke-direct {v4, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendCaloriesSleepGoal;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;)V

    .line 58
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    const/4 v1, 0x2

    new-array v1, v1, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object p0, v1, v2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object v4, v1, v3

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto/16 :goto_3

    .line 61
    :cond_5
    instance-of v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;

    if-eqz v1, :cond_6

    .line 62
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;->getLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;-><init>(Ljava/util/Locale;)V

    .line 63
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    new-array p1, v3, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object v1, p1, v2

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto/16 :goto_3

    .line 65
    :cond_6
    instance-of v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;

    if-eqz v1, :cond_8

    .line 66
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;

    .line 68
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v6

    if-ne v5, v6, :cond_7

    const/4 v5, 0x1

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    .line 69
    :goto_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getUnitType()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UnitType$METRIC;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 68
    invoke-direct {v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;-><init>(ZZ)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result v8

    .line 72
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v9

    .line 73
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v10

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 75
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v11

    .line 76
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getSleepTime()I

    move-result v12

    .line 70
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-object v6, v5

    invoke-direct/range {v6 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;-><init>(ZIIFLjava/lang/String;I)V

    .line 77
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getLocale()Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;-><init>(Ljava/util/Locale;)V

    .line 78
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v8

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v9

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object v10

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v10

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result p0

    invoke-direct {v7, v8, v9, v10, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;-><init>(IFII)V

    .line 67
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-direct {p0, v4, v5, v7, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V

    .line 66
    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommandVer3;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V

    .line 80
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->settingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    new-array p1, v3, [Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    aput-object v1, p1, v2

    invoke-virtual {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->sendSettingCommand(Ljava/lang/String;[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_3
    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic lambda$2tIcsoIkPhHddXBPxudtU-Z8brA(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->applySetting$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public applySetting(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "setting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n\n        val deviceID = setting.deviceID ?: communicator.defaultConnectedDevice()?.uid\n        ?: return@defer Completable.error(Throwable(\"No device connected\"))\n\n        when (setting) {\n            is WatchSetting.Units -> {\n                val command = Gen2SendUserInformationCommand(\n                        UnitsInfoData(twelveHourFormat = setting.user.accountSettings.timeFormatType == HourFormat.Twelve.format,\n                                metricsFormat = setting.user.accountSettings.unitType == UnitType.METRIC.type))\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.Biometrics -> {\n                val command = Gen2SendBiometricsCommand(UserInfoData(\n                        age = setting.user.age,\n                        height = setting.user.height,\n                        weight = setting.user.weight,\n                        genderMale = setting.user.gender == Gender.Male.description,\n                        email = setting.user.email))\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.Goals -> {\n                val goalInfoData = GoalInfoData(setting.goals.steps, setting.goals.distance, setting.goals.calories, setting.goals.sleep)\n                val stepsDistanceGoal = Gen2SendStepsDistanceGoal(goalInfoData)\n                val caloriesGoal = Gen2SendCaloriesSleepGoal(goalInfoData)\n                settingsExecutor.sendSettingCommand(deviceID, stepsDistanceGoal, caloriesGoal)\n\n            }\n            is WatchSetting.Language -> {\n                val command = Gen2SendLanguageCommand(setting.locale)\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n            is WatchSetting.SleepTime -> {\n                val command = Gen2SendUserPrefsAndGoalsCommandVer3(\n                        PairingConfig(\n                                unitsInfoData = UnitsInfoData(twelveHourFormat = setting.user.accountSettings.timeFormatType == HourFormat.Twelve.format,\n                                        metricsFormat = setting.user.accountSettings.unitType == UnitType.METRIC.type),\n                                userInfoData = UserInfoData(\n                                        age = setting.user.age,\n                                        height = setting.user.height,\n                                        weight = setting.user.weight,\n                                        genderMale = setting.user.gender == Gender.Male.description,\n                                        email = setting.user.email,\n                                        sleepTimeSelection = setting.sleepTime),\n                                languageInfoData = LanguageInfoData(setting.locale),\n                                goalInfoData = GoalInfoData(setting.goals.steps, setting.goals.distance, setting.goals.calories, setting.goals.sleep))\n                        )\n                settingsExecutor.sendSettingCommand(deviceID, command)\n            }\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
