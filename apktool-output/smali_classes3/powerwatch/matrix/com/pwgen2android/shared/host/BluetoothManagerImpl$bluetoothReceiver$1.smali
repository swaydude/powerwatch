.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "BluetoothManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;-><init>(Landroid/bluetooth/BluetoothAdapter;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;

    .line 37
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/high16 p1, -0x80000000

    const-string v0, "android.bluetooth.adapter.extra.STATE"

    .line 42
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/16 p2, 0xa

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-eq p1, p2, :cond_0

    .line 53
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Bluetooth is enabled, pushing info to application modules"

    invoke-static {p1, p2, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 47
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    goto :goto_0

    .line 50
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Bluetooth is disabled, pushing info to application modules"

    invoke-static {p1, p2, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->warn$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 51
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    .line 55
    :goto_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl$bluetoothReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;->access$getBluetoothStateChangeSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManagerImpl;)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
