.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsLiteCommunicatorImpl$2tIcsoIkPhHddXBPxudtU-Z8brA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;->lambda$2tIcsoIkPhHddXBPxudtU-Z8brA(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicatorImpl;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
