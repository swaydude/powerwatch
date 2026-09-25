.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->lambda$2_R-SdFP_NtJ4NwArSIAkpvqOlo(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
