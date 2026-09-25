.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$wG2Pq4Ar8Nvf1bbq_u33WDdPCps(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method
