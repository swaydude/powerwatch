.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->lambda$lA958QMTVtM-4l7xuoavUWet_e8(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
