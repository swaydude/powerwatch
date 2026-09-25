.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

.field public final synthetic f$1:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;->f$1:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;->f$1:Ljava/lang/Throwable;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$NFSuBBruxsYgKXGEXxoYzS5uvas(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method
