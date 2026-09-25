.class public final Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;
.super Ljava/lang/Object;
.source "NotificationManager.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J(\u0010!\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;",
        "connectionNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;",
        "batteryNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;",
        "goalsNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;",
        "(Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;)V",
        "BATTERY_CHANNEL",
        "",
        "GOALS_CHANNEL",
        "PHONE_CONNECT_CHANNEL",
        "batteryNotificationID",
        "",
        "watchConnectionID",
        "dismissBatteryNotification",
        "",
        "context",
        "Landroid/content/Context;",
        "dismissNotification",
        "notificationID",
        "getNotificationIntent",
        "Landroid/app/PendingIntent;",
        "notificationIntent",
        "Landroid/content/Intent;",
        "showBatteryNotification",
        "deviceID",
        "title",
        "message",
        "showConnectionNotification",
        "realtimeDataNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;",
        "showGoalsAchievedMessage",
        "showOTAFailedNotification",
        "showOTAProgressNotification",
        "progress",
        "showOTASuccessNotification",
        "showWatchConnectedMessage",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl$Companion;

.field private static final MAX_PROGRESS:I

.field private static final MIN_PROGRESS:I


# instance fields
.field private final BATTERY_CHANNEL:Ljava/lang/String;

.field private final GOALS_CHANNEL:Ljava/lang/String;

.field private final PHONE_CONNECT_CHANNEL:Ljava/lang/String;

.field private final batteryNotificationID:I

.field private final batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

.field private final connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

.field private final goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

.field private final watchConnectionID:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl$Companion;

    const/16 v0, 0x64

    .line 340
    sput v0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->MAX_PROGRESS:I

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;)V
    .locals 1

    const-string v0, "connectionNotificationPersistence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryNotificationPersistence"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsNotificationPersistence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    .line 51
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    .line 52
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    const/16 p1, 0x4d2

    .line 54
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationID:I

    const/16 p1, 0x8b9

    .line 55
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->watchConnectionID:I

    const-string p1, "goals_notifications"

    .line 57
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->GOALS_CHANNEL:Ljava/lang/String;

    const-string p1, "battery_channel"

    .line 58
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->BATTERY_CHANNEL:Ljava/lang/String;

    const-string p1, "phone_connection_channel"

    .line 59
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->PHONE_CONNECT_CHANNEL:Ljava/lang/String;

    return-void
.end method

.method private final getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    .locals 3

    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_0

    const/high16 v0, 0x2000000

    .line 64
    invoke-static {p1, v1, p2, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "{\n            PendingIntent.getActivity(context, 0, notificationIntent,\n                FLAG_MUTABLE)\n        }"

    .line 63
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-static {p1, v1, p2, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "{\n            PendingIntent.getActivity(context, 0, notificationIntent, 0)\n        }"

    .line 66
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public dismissBatteryNotification(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    .line 257
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/app/NotificationManager;

    .line 258
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationID:I

    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public dismissNotification(Landroid/content/Context;I)V
    .locals 0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->stop(Landroid/content/Context;)V

    return-void
.end method

.method public showBatteryNotification(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->isBatteryNotificationEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 222
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x20000000

    .line 223
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 225
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p1

    const-string v0, "notification"

    .line 228
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/app/NotificationManager;

    .line 230
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    .line 231
    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->BATTERY_CHANNEL:Ljava/lang/String;

    const-string v4, "Battery notification channel"

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x4

    invoke-direct {v1, v2, v5, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 232
    invoke-virtual {v1, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 234
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 236
    new-instance v1, Landroid/app/Notification$Builder;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->BATTERY_CHANNEL:Ljava/lang/String;

    invoke-direct {v1, p2, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 238
    :cond_1
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const p2, 0x7f0c0002

    .line 242
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 243
    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 244
    check-cast p4, Ljava/lang/CharSequence;

    invoke-virtual {p2, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 245
    new-instance p3, Landroid/app/Notification$BigTextStyle;

    invoke-direct {p3}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 246
    invoke-virtual {p3, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p3

    check-cast p3, Landroid/app/Notification$Style;

    .line 245
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 247
    invoke-virtual {p2, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 248
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 249
    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 250
    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationID:I

    invoke-virtual {v0, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public showConnectionNotification(Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance p2, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const v1, 0x7f0b002b

    invoke-direct {p2, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f08019b

    .line 76
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getSteps()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "setText"

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f08022e

    .line 77
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerKt;->getSteps()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f080193

    .line 79
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getCalories()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f080194

    .line 80
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getCalories()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f080195

    .line 82
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getDistance()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f080196

    .line 83
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getDistance()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, v1}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    const v0, 0x7f080197

    .line 85
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;->getHeartRate()Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0, v2, p3}, Landroid/widget/RemoteViews;->setCharSequence(ILjava/lang/String;Ljava/lang/CharSequence;)V

    .line 89
    :goto_0
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {p3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x20000000

    .line 90
    invoke-virtual {p3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 91
    invoke-direct {p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p3

    .line 93
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getDISCONNECT_ACTION()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 96
    new-instance v0, Landroid/app/Notification$Builder;

    .line 97
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-direct {v0, p1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 99
    :cond_1
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_1
    const v2, 0x7f0c0002

    .line 102
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 103
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {v0, p3}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p3

    const-string v0, "phoneNotificationBuilder\n                .setSmallIcon(R.mipmap.app_icon_notif)\n                .setOngoing(true)\n                .setContentIntent(pendingIntent)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_2

    .line 110
    invoke-virtual {p3, p2}, Landroid/app/Notification$Builder;->setCustomContentView(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 111
    new-instance p3, Landroid/app/Notification$DecoratedCustomViewStyle;

    invoke-direct {p3}, Landroid/app/Notification$DecoratedCustomViewStyle;-><init>()V

    check-cast p3, Landroid/app/Notification$Style;

    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object p2

    const-string p3, "notificationBuilder.setCustomContentView(notificationLayout)\n                    .setStyle(Notification.DecoratedCustomViewStyle())"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 115
    :cond_2
    invoke-virtual {p3, p2}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object p2

    const/4 p3, -0x1

    .line 116
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    move-result-object p2

    const-string p3, "notificationBuilder.setContent(notificationLayout)\n                    .setPriority(Notification.PRIORITY_LOW)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    :goto_2
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p3, v1, :cond_3

    .line 120
    new-instance p3, Landroid/app/NotificationChannel;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Notification channel name"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x2

    invoke-direct {p3, v0, v1, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v0, "Notification channel desc"

    .line 121
    invoke-virtual {p3, v0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 122
    invoke-virtual {p3, v0}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    const-string v0, "notification"

    .line 123
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/app/NotificationManager;

    .line 124
    invoke-virtual {v0, p3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 127
    :cond_3
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {p3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 128
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_EXTRA()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 129
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {p2, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->start(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "message"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsNotificationsEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 304
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x20000000

    .line 305
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 307
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p1

    const-string v0, "notification"

    .line 310
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/app/NotificationManager;

    .line 312
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    .line 313
    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->GOALS_CHANNEL:Ljava/lang/String;

    const-string v4, "Goals notifications"

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x4

    invoke-direct {v1, v2, v5, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 314
    invoke-virtual {v1, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 316
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 318
    new-instance v1, Landroid/app/Notification$Builder;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->GOALS_CHANNEL:Ljava/lang/String;

    invoke-direct {v1, p2, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 320
    :cond_1
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const p2, 0x7f0c0002

    .line 324
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 325
    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 326
    check-cast p4, Ljava/lang/CharSequence;

    invoke-virtual {p2, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 327
    new-instance p3, Landroid/app/Notification$BigTextStyle;

    invoke-direct {p3}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 328
    invoke-virtual {p3, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p3

    check-cast p3, Landroid/app/Notification$Style;

    .line 327
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 329
    invoke-virtual {p2, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 330
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 331
    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 332
    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->batteryNotificationID:I

    invoke-virtual {v0, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public showOTAFailedNotification(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000000

    .line 193
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 195
    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 200
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 201
    new-instance v1, Landroid/app/Notification$Builder;

    .line 202
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;

    move-result-object v2

    .line 201
    invoke-direct {v1, p1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 204
    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const v2, 0x7f0c0011

    .line 206
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "PowerWatch"

    .line 207
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "Firmware update failed."

    .line 208
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    .line 209
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 210
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 211
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "phoneNotificationBuilder.setSmallIcon(R.mipmap.icon_cross_red)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"Firmware update failed.\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 213
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_EXTRA()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 214
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->start(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public showOTAProgressNotification(Landroid/content/Context;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000000

    .line 160
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 162
    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 166
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 167
    new-instance v1, Landroid/app/Notification$Builder;

    .line 168
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;

    move-result-object v2

    .line 167
    invoke-direct {v1, p1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const v2, 0x7f0c0002

    .line 173
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "PowerWatch"

    .line 174
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "Your watch is updating..."

    .line 175
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    .line 176
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 177
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 178
    invoke-virtual {v0, v2}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 179
    sget v2, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->MAX_PROGRESS:I

    invoke-virtual {v0, v2, p2, v1}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 180
    invoke-virtual {p2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "phoneNotificationBuilder\n                .setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"Your watch is updating...\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(false)\n                .setOngoing(true)\n                .setProgress(MAX_PROGRESS, progress, false)\n                .build()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_EXTRA()Ljava/lang/String;

    move-result-object v1

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 183
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->start(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public showOTASuccessNotification(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x20000000

    .line 134
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 136
    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 140
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 141
    new-instance v1, Landroid/app/Notification$Builder;

    .line 142
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_CHANNEL_ID()Ljava/lang/String;

    move-result-object v2

    .line 141
    invoke-direct {v1, p1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const v2, 0x7f0700c2

    .line 147
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "PowerWatch"

    .line 148
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "PowerWatch successfully updated."

    .line 149
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    .line 150
    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 151
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "phoneNotificationBuilder\n                .setSmallIcon(R.drawable.paired_success)\n                .setContentTitle(\"PowerWatch\")\n                .setContentText(\"PowerWatch successfully updated.\")\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 154
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getNOTIFICATION_EXTRA()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 155
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->start(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public showWatchConnectedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->connectionNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;->isWatchConnectionNotificationEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 266
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x20000000

    .line 267
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 269
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->getNotificationIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p1

    const-string v0, "notification"

    .line 272
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/app/NotificationManager;

    .line 274
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    .line 275
    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->PHONE_CONNECT_CHANNEL:Ljava/lang/String;

    const-string v4, "Phone connection channel"

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x4

    invoke-direct {v1, v2, v5, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 276
    invoke-virtual {v1, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 277
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 278
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 280
    new-instance v1, Landroid/app/Notification$Builder;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->PHONE_CONNECT_CHANNEL:Ljava/lang/String;

    invoke-direct {v1, p2, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 282
    :cond_1
    new-instance v1, Landroid/app/Notification$Builder;

    invoke-direct {v1, p2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    const p2, 0x7f0c0002

    .line 286
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 287
    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 288
    check-cast p4, Ljava/lang/CharSequence;

    invoke-virtual {p2, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 289
    new-instance p3, Landroid/app/Notification$BigTextStyle;

    invoke-direct {p3}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 290
    invoke-virtual {p3, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p3

    check-cast p3, Landroid/app/Notification$Style;

    .line 289
    invoke-virtual {p2, p3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object p2

    .line 291
    invoke-virtual {p2, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object p1

    const/4 p2, 0x1

    .line 292
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 293
    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object p1

    .line 294
    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "phoneNotificationBuilder.setSmallIcon(R.mipmap.app_icon_notif)\n                .setContentTitle(title)\n                .setContentText(message)\n                .setStyle(Notification.BigTextStyle()\n                        .bigText(message))\n                .setContentIntent(pendingIntent)\n                .setAutoCancel(true)\n                .setOngoing(false)\n                .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerImpl;->watchConnectionID:I

    invoke-virtual {v0, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method
