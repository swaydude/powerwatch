.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;
.super Ljava/lang/Object;
.source "AlertEvent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\u001a4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0003\"\u0004\u0008\u0008\u0010\u0005\u00a8\u0006\u001e"
    }
    d2 = {
        "incomingCallString",
        "",
        "getIncomingCallString",
        "()Ljava/lang/String;",
        "setIncomingCallString",
        "(Ljava/lang/String;)V",
        "missedCallString",
        "getMissedCallString",
        "setMissedCallString",
        "adjustNotificationText",
        "Lkotlin/Pair;",
        "oldTitle",
        "oldText",
        "callState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "context",
        "Landroid/content/Context;",
        "createCallNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "statusBarNotification",
        "Landroid/service/notification/StatusBarNotification;",
        "createMessageNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
        "messageState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
        "getAppNameFromPkgName",
        "packageName",
        "getNotificationTimestamp",
        "",
        "notification",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static incomingCallString:Ljava/lang/String; = "Incoming call"

.field private static missedCallString:Ljava/lang/String; = "Missed call"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static final adjustNotificationText(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-ne p2, p3, :cond_0

    const-string p3, "Incoming Call"

    goto :goto_0

    :cond_0
    const-string p3, "Missed Call"

    .line 74
    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;->RINGING:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    if-ne p2, v0, :cond_1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->incomingCallString:Ljava/lang/String;

    goto :goto_1

    :cond_1
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->missedCallString:Ljava/lang/String;

    :goto_1
    const/4 v0, 0x1

    .line 76
    invoke-static {p0, p3, v0}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-static {p0, p2, v0}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_3

    :cond_2
    move-object p0, p1

    .line 83
    :cond_3
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, p0, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static final createCallNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 15

    move-object/from16 v4, p1

    move-object/from16 v0, p2

    const-string v1, "statusBarNotification"

    move-object v2, p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callState"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v1

    iget-object v1, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v3, "android.title"

    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    check-cast v1, Ljava/lang/CharSequence;

    .line 45
    :cond_0
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NotificationExtensionsKt;->extractAnyTextOrEmpty(Landroid/service/notification/StatusBarNotification;)Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->adjustNotificationText(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Landroid/content/Context;)Lkotlin/Pair;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 52
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 55
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v5

    .line 56
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    move-result-wide v6

    .line 57
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->getNotificationTimestamp(Landroid/service/notification/StatusBarNotification;)J

    move-result-wide v8

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 54
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    const/4 v11, 0x0

    const/16 v12, 0x100

    const/4 v13, 0x0

    const-string v2, ""

    move-object v0, v14

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    invoke-virtual {v14}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->hashCode()I

    move-result v0

    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->setId(I)V

    return-object v14
.end method

.method public static final createMessageNotification(Landroid/service/notification/StatusBarNotification;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;
    .locals 12

    const-string v0, "statusBarNotification"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object p2

    iget-object p2, p2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v0, "android.title"

    .line 97
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, ""

    check-cast p2, Ljava/lang/CharSequence;

    .line 104
    :cond_0
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NotificationExtensionsKt;->extractAnyTextOrEmpty(Landroid/service/notification/StatusBarNotification;)Ljava/lang/String;

    move-result-object v0

    .line 106
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v11

    .line 107
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    move-result-wide v6

    .line 108
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->getNotificationTimestamp(Landroid/service/notification/StatusBarNotification;)J

    move-result-wide v8

    .line 110
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v10

    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 113
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 106
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    const-string v3, ""

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;JJLjava/lang/String;I)V

    .line 114
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->hashCode()I

    move-result p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->setId(I)V

    return-object p0
.end method

.method public static final getAppNameFromPkgName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 v0, 0x80

    .line 126
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    const-string v0, "packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 129
    invoke-virtual {p0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const-string p0, ""

    :goto_0
    return-object p0
.end method

.method public static final getIncomingCallString()Ljava/lang/String;
    .locals 1

    .line 25
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->incomingCallString:Ljava/lang/String;

    return-object v0
.end method

.method public static final getMissedCallString()Ljava/lang/String;
    .locals 1

    .line 26
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->missedCallString:Ljava/lang/String;

    return-object v0
.end method

.method private static final getNotificationTimestamp(Landroid/service/notification/StatusBarNotification;)J
    .locals 5

    .line 119
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v0

    iget-wide v0, v0, Landroid/app/Notification;->when:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getPostTime()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object p0

    iget-wide v0, p0, Landroid/app/Notification;->when:J

    :goto_0
    return-wide v0
.end method

.method public static final setIncomingCallString(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sput-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->incomingCallString:Ljava/lang/String;

    return-void
.end method

.method public static final setMissedCallString(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sput-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->missedCallString:Ljava/lang/String;

    return-void
.end method
