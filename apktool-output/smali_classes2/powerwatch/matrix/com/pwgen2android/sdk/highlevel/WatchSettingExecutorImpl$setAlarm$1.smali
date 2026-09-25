.class final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;
.super Lkotlin/jvm/internal/Lambda;
.source "WatchSettingsExecutor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->setAlarm(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)Lio/reactivex/Completable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $alarmData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->$alarmData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 98
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 2

    .line 99
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    move-result-object p1

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl;->getSettingsDataRepository()Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingExecutorImpl$setAlarm$1;->$alarmData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    invoke-virtual {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->saveAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)V

    :cond_1
    return-void
.end method
