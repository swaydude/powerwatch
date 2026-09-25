.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->lambda$xJZYLH3bnT0hAuA0UTjrRlIPS3U(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
