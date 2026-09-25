.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;
.super Ljava/lang/Object;
.source "ConnectionForegroundService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0008X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0008X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0014\u0010\r\u001a\u00020\u0008X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;",
        "",
        "()V",
        "CONNECT_NOTIFICATION_ID",
        "",
        "getCONNECT_NOTIFICATION_ID",
        "()I",
        "DISCONNECT_ACTION",
        "",
        "getDISCONNECT_ACTION",
        "()Ljava/lang/String;",
        "NOTIFICATION_CHANNEL_ID",
        "getNOTIFICATION_CHANNEL_ID",
        "NOTIFICATION_EXTRA",
        "getNOTIFICATION_EXTRA",
        "isServiceRunning",
        "",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "stop",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;-><init>()V

    return-void
.end method

.method public static synthetic lambda$EbuCmSaBSCDOUYqA-8ckW7c5KVc(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->stop$lambda-0(Landroid/content/Context;)V

    return-void
.end method

.method private static final stop$lambda-0(Landroid/content/Context;)V
    .locals 2

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$isServiceRunning$cp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 109
    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final getCONNECT_NOTIFICATION_ID()I
    .locals 1

    .line 84
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$getCONNECT_NOTIFICATION_ID$cp()I

    move-result v0

    return v0
.end method

.method public final getDISCONNECT_ACTION()Ljava/lang/String;
    .locals 1

    .line 85
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$getDISCONNECT_ACTION$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;
    .locals 1

    .line 82
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$getNOTIFICATION_CHANNEL_ID$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNOTIFICATION_EXTRA()Ljava/lang/String;
    .locals 1

    .line 83
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$getNOTIFICATION_EXTRA$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final start(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 92
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->access$isServiceRunning$cp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_EXTRA()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/app/Notification;

    const-string v0, "notification"

    .line 94
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/app/NotificationManager;

    .line 95
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getCONNECT_NOTIFICATION_ID()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void

    .line 98
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 99
    invoke-virtual {p1, p2}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method public final stop(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$ConnectionForegroundService$Companion$EbuCmSaBSCDOUYqA-8ckW7c5KVc;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$ConnectionForegroundService$Companion$EbuCmSaBSCDOUYqA-8ckW7c5KVc;-><init>(Landroid/content/Context;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
