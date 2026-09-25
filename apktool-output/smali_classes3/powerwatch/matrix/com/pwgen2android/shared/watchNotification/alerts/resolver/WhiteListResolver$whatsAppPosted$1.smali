.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;
.super Ljava/lang/Object;
.source "WhiteListResolver.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;",
        "resolveAlert",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;",
        "statusBarNotification",
        "Landroid/service/notification/StatusBarNotification;",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public resolveAlert(Landroid/service/notification/StatusBarNotification;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;
    .locals 5

    const-string v0, "statusBarNotification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    .line 216
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v0

    const-string v2, "silent_notifications_3"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    .line 222
    :cond_0
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    iget-object v0, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v2, "android.title"

    .line 223
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    check-cast v0, Ljava/lang/CharSequence;

    .line 225
    :cond_1
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WhatsApp"

    .line 226
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v1

    .line 229
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getCALL_NOTIFICATION_CATEGORY()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v3

    iget-object v3, v3, Landroid/app/Notification;->category:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-static {v0, v3, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v0

    const-string v3, "call_notification_group"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 231
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->access$getApplicationContext$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->createCallNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    goto :goto_0

    .line 232
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;->getCALL_NOTIFICATION_CATEGORY()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v3

    iget-object v3, v3, Landroid/app/Notification;->category:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    if-nez v2, :cond_4

    return-object v1

    .line 234
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;->RECEIVED:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver$whatsAppPosted$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;->access$getApplicationContext$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->createMessageNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    goto :goto_0

    .line 236
    :cond_5
    move-object p1, v1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;

    :goto_0
    return-object p1
.end method
