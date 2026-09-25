.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$H30gkb1Jmn0RfbJczjEHuIhlgVA(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V

    return-void
.end method
