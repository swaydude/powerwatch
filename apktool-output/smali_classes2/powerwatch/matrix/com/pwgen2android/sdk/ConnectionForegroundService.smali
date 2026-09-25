.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;
.super Landroid/app/Service;
.source "ConnectionForegroundService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConnectionForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionForegroundService.kt\npowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n*L\n1#1,116:1\n25#2,3:117\n*S KotlinDebug\n*F\n+ 1 ConnectionForegroundService.kt\npowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService\n*L\n20#1:117,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0017J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;",
        "Landroid/app/Service;",
        "()V",
        "center",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;",
        "getCenter",
        "()Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;",
        "center$delegate",
        "Lkotlin/Lazy;",
        "onBind",
        "Landroid/os/IBinder;",
        "intent",
        "Landroid/content/Intent;",
        "onCreate",
        "",
        "onDestroy",
        "onStartCommand",
        "",
        "flags",
        "startId",
        "Companion",
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


# static fields
.field private static final CONNECT_NOTIFICATION_ID:I

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

.field private static final DISCONNECT_ACTION:Ljava/lang/String;

.field private static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

.field private static final NOTIFICATION_EXTRA:Ljava/lang/String;

.field private static isServiceRunning:Z


# instance fields
.field private final center$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    const-string v0, "PowerWatch Connection Notification"

    .line 82
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    const-string v0, "com.matrix.powerwatch.NOTIFICATION_EXTRA"

    .line 83
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_EXTRA:Ljava/lang/String;

    const/16 v0, 0x28e

    .line 84
    sput v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->CONNECT_NOTIFICATION_ID:I

    const-string v0, "com.matrix.powerwatch.DISCONNECT_WATCH"

    .line 85
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->DISCONNECT_ACTION:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 18
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 20
    move-object v0, p0

    check-cast v0, Landroid/content/ComponentCallbacks;

    const/4 v1, 0x0

    .line 117
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 118
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 119
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$special$$inlined$inject$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$special$$inlined$inject$default$1;-><init>(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 20
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->center$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getCONNECT_NOTIFICATION_ID$cp()I
    .locals 1

    .line 18
    sget v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->CONNECT_NOTIFICATION_ID:I

    return v0
.end method

.method public static final synthetic access$getDISCONNECT_ACTION$cp()Ljava/lang/String;
    .locals 1

    .line 18
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->DISCONNECT_ACTION:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getNOTIFICATION_CHANNEL_ID$cp()Ljava/lang/String;
    .locals 1

    .line 18
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getNOTIFICATION_EXTRA$cp()Ljava/lang/String;
    .locals 1

    .line 18
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_EXTRA:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$isServiceRunning$cp()Z
    .locals 1

    .line 18
    sget-boolean v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->isServiceRunning:Z

    return v0
.end method


# virtual methods
.method public final getCenter()Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->center$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 6

    .line 22
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 24
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->getCenter()Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate()V

    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 28
    new-instance v0, Landroid/app/Notification$Builder;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    .line 29
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    .line 28
    invoke-direct {v0, v2, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 34
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v2

    const/4 v3, 0x1

    .line 35
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    const-string v4, "GROUP"

    .line 36
    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v2

    .line 37
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 42
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_1

    .line 43
    new-instance v1, Landroid/app/NotificationChannel;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_CHANNEL_ID:Ljava/lang/String;

    const-string v4, "Notification channel name"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    invoke-direct {v1, v2, v4, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v2, "Notification channel desc"

    .line 44
    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 45
    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    const-string v2, "notification"

    .line 46
    invoke-virtual {p0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v2, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, Landroid/app/NotificationManager;

    .line 47
    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 50
    :cond_1
    sget v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->CONNECT_NOTIFICATION_ID:I

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->startForeground(ILandroid/app/Notification;)V

    .line 51
    sput-boolean v3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->isServiceRunning:Z

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 73
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x0

    .line 74
    sput-boolean v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->isServiceRunning:Z

    .line 75
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->getCenter()Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onDestroy()V

    const/4 v0, 0x1

    .line 76
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->stopForeground(Z)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const/4 p2, 0x2

    if-nez p1, :cond_0

    return p2

    .line 56
    :cond_0
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->DISCONNECT_ACTION:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->stopSelf()V

    .line 62
    :cond_1
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->NOTIFICATION_EXTRA:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/Notification;

    .line 63
    sget p3, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->CONNECT_NOTIFICATION_ID:I

    invoke-virtual {p0, p3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->startForeground(ILandroid/app/Notification;)V

    return p2
.end method
