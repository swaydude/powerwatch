.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;


# direct methods
.method public synthetic constructor <init>(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$b2rx5uaztrizl0ph1frb2q7ci1Q(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method
