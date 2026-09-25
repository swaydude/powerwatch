.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->lambda$p2Fc2aPxZbxIor01eDnkZpmChkw(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Pair;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
