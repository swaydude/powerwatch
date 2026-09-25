.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;
.super Ljava/lang/Object;
.source "AlertsManagerImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a3\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011*\u00011\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010:\u001a\u00020)2\u0008\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0012\u0010<\u001a\u00020)2\u0008\u0010;\u001a\u0004\u0018\u000105H\u0002J\u000e\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"H\u0016J\'\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\"2\u0012\u0010A\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020C0B\"\u00020CH\u0016\u00a2\u0006\u0002\u0010DJ\'\u0010E\u001a\u0008\u0012\u0004\u0012\u0002080\"2\u0012\u0010F\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020G0B\"\u00020GH\u0016\u00a2\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010K\u001a\u0008\u0012\u0004\u0012\u00020)0\"H\u0016J\u000e\u0010L\u001a\u0008\u0012\u0004\u0012\u00020)0\"H\u0016J\'\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\"2\u0012\u0010A\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020C0B\"\u00020CH\u0016\u00a2\u0006\u0002\u0010DJ\'\u0010N\u001a\u0008\u0012\u0004\u0012\u0002080\"2\u0012\u0010F\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020G0B\"\u00020GH\u0016\u00a2\u0006\u0002\u0010HJ\u0012\u0010O\u001a\u00020)2\u0008\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0012\u0010P\u001a\u00020)2\u0008\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010S\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010T\u001a\u0002052\u0006\u0010U\u001a\u00020\u0011H\u0016J\u001c\u0010V\u001a\u00020\u00112\u0008\u0010T\u001a\u0004\u0018\u0001052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010[\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\\\u001a\u00020R2\u0006\u0010]\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010^\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010_\u001a\u00020R2\u0006\u0010T\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0011H\u0002J0\u0010a\u001a\u00020X2\u0006\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010f\u001a\u00020R2\u0006\u0010T\u001a\u0002052\u0006\u0010g\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010%0%0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u001c\u0010,\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010)0)0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010+R\u001c\u0010/\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010)0)0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00102R\u0014\u00103\u001a\u0008\u0012\u0004\u0012\u00020504X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0008\u0012\u0004\u0012\u00020504X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u000108080\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u000108080\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006i"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "notificationTypeController",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;",
        "whiteListResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;",
        "phoneCallResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;)V",
        "activityGoalsNotificationSubject",
        "Lio/reactivex/subjects/ReplaySubject;",
        "",
        "kotlin.jvm.PlatformType",
        "alarmsNotificationSubject",
        "areAlarmsEnabled",
        "getAreAlarmsEnabled",
        "()Z",
        "areCallsEnabled",
        "getAreCallsEnabled",
        "areGoalsEnabled",
        "getAreGoalsEnabled",
        "areMessagesEnabled",
        "getAreMessagesEnabled",
        "callImportantSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
        "callSilentSubject",
        "callsNotificationSubject",
        "Lio/reactivex/Observable;",
        "deviceSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "mNotificationsEnabledGlobally",
        "messagesNotificationSubject",
        "missedCallsCount",
        "",
        "getMissedCallsCount",
        "()I",
        "missedCallsSubject",
        "missedMessageCount",
        "getMissedMessageCount",
        "missedSMSSubject",
        "notificationsReceiver",
        "powerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;",
        "numOfMissedCalls",
        "Ljava/util/HashSet;",
        "",
        "numOfMissedMessages",
        "smsImportantSubject",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
        "smsSilentSubject",
        "decrementNumOfCalls",
        "eventPackageName",
        "decrementNumOfMessages",
        "getActivityGoalsNotification",
        "getAlarmsNotification",
        "getCallsNotification",
        "getCurrentCallNotifications",
        "callState",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;",
        "getCurrentMessagesNotifications",
        "smsState",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;",
        "getMessagesNotification",
        "getNotificationsEnabledGlobally",
        "getNumOfMissedCalls",
        "getNumOfUnreadSMS",
        "getRealtimeCallEvents",
        "getSMSRealtimeEvent",
        "incrementNumOfCalls",
        "incrementNumOfMessages",
        "invalidateNotifications",
        "",
        "isAppNotificationEnabled",
        "appPackageName",
        "defaultValue",
        "isNotificationForAppEnabled",
        "setActivityGoalsNotificationEnabled",
        "Lio/reactivex/Completable;",
        "isEnabled",
        "setAlarmsNotificationEnabled",
        "setCallsNotificationEnabled",
        "setInitialNotificationsStates",
        "device",
        "setMessagesNotificationEnabled",
        "setNotificationForAppEnabled",
        "value",
        "setNotificationTypesEnabled",
        "calls",
        "messages",
        "alarms",
        "activityGoals",
        "setThirdPartAppEnabled",
        "enabled",
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
.field public static final ACTION_NOTIFICATION_LISTENER_SETTINGS:Ljava/lang/String; = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

.field private static final APP_NOTIFICATION_ENABLED:Ljava/lang/String; = "com.matrix.powerwatch.APP_NOTIFICATION_ENABLED"

.field private static final CALLS_COUNT:Ljava/lang/String; = "com.matrix.powerwatch.CALLS_COUNT"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

.field private static final ENABLED_NOTIFICATION_LISTENERS:Ljava/lang/String;

.field private static final GLOBAL_NOTIFICATION_SERVICE_USER_DISABLED:Ljava/lang/String; = "global_notification_setting"

.field private static final MESSAGE_COUNT:Ljava/lang/String; = "com.matrix.powerwatch.MESSAGE_COUNT"

.field private static final MISSED_CALLS_URI:Landroid/net/Uri;

.field private static final MISSED_SMS_URI:Landroid/net/Uri;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final callImportantSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final callSilentSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final callsNotificationSubject:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final deviceSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final mNotificationsEnabledGlobally:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final messagesNotificationSubject:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/ReplaySubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

.field private final notificationsReceiver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;

.field private final numOfMissedCalls:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final numOfMissedMessages:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneCallResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;

.field private final smsImportantSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final smsSilentSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    .line 513
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->TAG:Ljava/lang/String;

    const-string v0, "content://call_log/calls"

    .line 514
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->MISSED_CALLS_URI:Landroid/net/Uri;

    const-string v0, "content://sms/inbox"

    .line 515
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->MISSED_SMS_URI:Landroid/net/Uri;

    const-string v0, "enabled_notification_listeners"

    .line 523
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->ENABLED_NOTIFICATION_LISTENERS:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTypeController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whiteListResolver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneCallResolver"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 35
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    .line 36
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    .line 37
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->phoneCallResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;

    .line 50
    invoke-static {}, Lio/reactivex/subjects/BehaviorSubject;->create()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p4

    const-string p5, "create<Device>()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 52
    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    .line 53
    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    .line 54
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p4

    const-string p5, "create<CallEvent>()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callImportantSubject:Lio/reactivex/subjects/PublishSubject;

    .line 55
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p4

    const-string v0, "create<MessageEvent>()"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsImportantSubject:Lio/reactivex/subjects/PublishSubject;

    .line 56
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p4

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callSilentSubject:Lio/reactivex/subjects/PublishSubject;

    .line 57
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsSilentSubject:Lio/reactivex/subjects/PublishSubject;

    const/4 p4, 0x1

    .line 58
    invoke-static {p4}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p5

    const-string v0, "createWithSize<Int>(1)"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    .line 59
    invoke-static {p4}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    .line 64
    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->listenForChange(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Lio/reactivex/Observable;

    move-result-object p5

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callsNotificationSubject:Lio/reactivex/Observable;

    .line 65
    invoke-static {p4}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p5

    const-string v0, "createWithSize<Boolean>(1)"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    .line 66
    invoke-static {p4}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    .line 68
    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p3, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->listenForChange(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Lio/reactivex/Observable;

    move-result-object p3

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    .line 69
    invoke-static {p4}, Lio/reactivex/subjects/ReplaySubject;->createWithSize(I)Lio/reactivex/subjects/ReplaySubject;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->mNotificationsEnabledGlobally:Lio/reactivex/subjects/ReplaySubject;

    .line 80
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationsReceiver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;

    .line 164
    sget-object p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->TAG:Ljava/lang/String;

    const-string v0, "AlertsManager initialized."

    invoke-static {p5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    new-instance p5, Landroid/content/IntentFilter;

    invoke-direct {p5}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "com.matrix.powerwatch.NOTIFICATION_REMOVED"

    .line 167
    invoke-virtual {p5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.matrix.powerwatch.NOTIFICATION_POSTED"

    .line 168
    invoke-virtual {p5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.matrix.powerwatch.NOTIFICATIONS_ENABLED"

    .line 169
    invoke-virtual {p5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.matrix.powerwatch.MESSAGES"

    .line 170
    invoke-virtual {p5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.matrix.powerwatch.CALLS"

    .line 171
    invoke-virtual {p5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 173
    invoke-static {p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object v0

    check-cast p3, Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, p3, p5}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 175
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 p3, 0x0

    const/4 p5, 0x2

    const/4 v0, 0x0

    invoke-static {p2, p4, p3, p5, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p2

    .line 176
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$42T3S4ewA6xXu_J23kEqvJSJIGI;

    invoke-direct {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$42T3S4ewA6xXu_J23kEqvJSJIGI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 180
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$mCallStateReceiver$1;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$mCallStateReceiver$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    check-cast p2, Landroid/content/BroadcastReceiver;

    .line 233
    new-instance p3, Landroid/content/IntentFilter;

    invoke-direct {p3}, Landroid/content/IntentFilter;-><init>()V

    const-string p4, "android.intent.action.PHONE_STATE"

    .line 234
    invoke-virtual {p3, p4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 37
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;

    invoke-direct {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;-><init>()V

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 33
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 177
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setInitialNotificationsStates(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Landroid/content/Context;)V

    .line 178
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$decrementNumOfCalls(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Ljava/lang/String;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->decrementNumOfCalls(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$decrementNumOfMessages(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Ljava/lang/String;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->decrementNumOfMessages(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getCallImportantSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callImportantSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getCallSilentSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callSilentSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getDeviceSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/BehaviorSubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    return-object p0
.end method

.method public static final synthetic access$getENABLED_NOTIFICATION_LISTENERS$cp()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->ENABLED_NOTIFICATION_LISTENERS:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getMissedCallsCount(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)I
    .locals 0

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedCallsCount()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMissedCallsSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/ReplaySubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    return-object p0
.end method

.method public static final synthetic access$getMissedMessageCount(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)I
    .locals 0

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedMessageCount()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMissedSMSSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/ReplaySubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    return-object p0
.end method

.method public static final synthetic access$getNumOfMissedCalls$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Ljava/util/HashSet;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    return-object p0
.end method

.method public static final synthetic access$getNumOfMissedMessages$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Ljava/util/HashSet;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    return-object p0
.end method

.method public static final synthetic access$getPhoneCallResolver$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->phoneCallResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;

    return-object p0
.end method

.method public static final synthetic access$getSmsImportantSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsImportantSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getSmsSilentSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsSilentSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getWhiteListResolver$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;
    .locals 0

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    return-object p0
.end method

.method public static final synthetic access$incrementNumOfCalls(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Ljava/lang/String;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->incrementNumOfCalls(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$incrementNumOfMessages(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Ljava/lang/String;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->incrementNumOfMessages(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$setInitialNotificationsStates(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Landroid/content/Context;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setInitialNotificationsStates(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Landroid/content/Context;)V

    return-void
.end method

.method private final decrementNumOfCalls(Ljava/lang/String;)I
    .locals 2

    .line 464
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    check-cast v0, Ljava/util/Collection;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableCollection(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 466
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p1

    return p1
.end method

.method private final decrementNumOfMessages(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 449
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 451
    :goto_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p1

    return p1
.end method

.method private static final getCurrentCallNotifications$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "callEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getCurrentCallNotifications$lambda-6(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v0, "booleanSMSEventPair.first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getCurrentCallNotifications$lambda-7(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    return-object p0
.end method

.method private static final getCurrentCallNotifications$lambda-8([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z
    .locals 5

    const-string v0, "$callState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    .line 272
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v4

    if-ne v4, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method private static final getCurrentMessagesNotifications$lambda-10(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v0, "booleanSMSEventPair.first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getCurrentMessagesNotifications$lambda-11(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    return-object p0
.end method

.method private static final getCurrentMessagesNotifications$lambda-12([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z
    .locals 5

    const-string v0, "$smsState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    .line 289
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSmsState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    move-result-object v4

    if-ne v4, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method private static final getCurrentMessagesNotifications$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "smsEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getMissedCallsCount()I
    .locals 1

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    return v0
.end method

.method private final getMissedMessageCount()I
    .locals 1

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    return v0
.end method

.method private static final getNumOfMissedCalls$lambda-17(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "numOdMissedCalls"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areCallsEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getNumOfMissedCalls$lambda-18(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "integerCallEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    const-string v0, "integerCallEventPair.second"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getNumOfMissedCalls$lambda-19(Landroid/util/Pair;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "integerBooleanPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final getNumOfUnreadSMS$lambda-20(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getNumOfUnreadSMS$lambda-21(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "integerMessageEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    const-string v0, "integerMessageEventPair.second"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getNumOfUnreadSMS$lambda-22(Landroid/util/Pair;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "integerBooleanPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final getRealtimeCallEvents$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "callEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getRealtimeCallEvents$lambda-14(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v0, "booleanSMSEventPair.first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getRealtimeCallEvents$lambda-15(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    return-object p0
.end method

.method private static final getRealtimeCallEvents$lambda-16([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z
    .locals 5

    const-string v0, "$callState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    .line 306
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;->getCallState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;

    move-result-object v4

    if-ne v4, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method private static final getSMSRealtimeEvent$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 1

    const-string v0, "smsEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final getSMSRealtimeEvent$lambda-2(Landroid/util/Pair;)Z
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v0, "booleanSMSEventPair.first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final getSMSRealtimeEvent$lambda-3(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;
    .locals 1

    const-string v0, "booleanSMSEventPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    return-object p0
.end method

.method private static final getSMSRealtimeEvent$lambda-4([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z
    .locals 5

    const-string v0, "$smsState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    add-int/lit8 v2, v2, 0x1

    .line 254
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;->getSmsState()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;

    move-result-object v4

    if-ne v4, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method private final incrementNumOfCalls(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 457
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 459
    :goto_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p1

    return p1
.end method

.method private final incrementNumOfMessages(Ljava/lang/String;)I
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 441
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 444
    :goto_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p1

    return p1
.end method

.method private final isNotificationForAppEnabled(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 470
    invoke-static {p2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, "com.matrix.powerwatch.APP_NOTIFICATION_ENABLED"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static synthetic lambda$--tERVaOinS8-BE2NF7ayjI_48o(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentCallNotifications$lambda-7(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$0L28i3nB6qjcma1zB6AGIWRL7vk(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setActivityGoalsNotificationEnabled$lambda-26(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V

    return-void
.end method

.method public static synthetic lambda$3yafTInAPbdBFM1QNjtLQwGf9N0(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getSMSRealtimeEvent$lambda-3(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$42T3S4ewA6xXu_J23kEqvJSJIGI(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$5E-zq145KmMb7cq2g7wpVCKbvxA(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentMessagesNotifications$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$6G-iVidEIJuUccfhbK0d_FcOYQo(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getRealtimeCallEvents$lambda-13(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8vHlpSvQkHyBDk6KaS2DSB8oSOM(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setCallsNotificationEnabled$lambda-23(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    return-void
.end method

.method public static synthetic lambda$AweHaWaP5PYQ4sf6SwDj0Avo4pc(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfUnreadSMS$lambda-21(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$CDT-CVXAzcaaYpFv8vchClQgAFU(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getSMSRealtimeEvent$lambda-2(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$LotaF-_85C0DXSrWfVTbAkXmn38(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfUnreadSMS$lambda-20(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Lwm9gSD9o9oHa35k-u4roG0WwSI(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfMissedCalls$lambda-17(Ljava/lang/Integer;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OPvq8cuLTX6bVYoU0pX_ZhG0u1o([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getSMSRealtimeEvent$lambda-4([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$OSQkOZF7Q6ClyIVLt-p-qF2-GKw(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentCallNotifications$lambda-6(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$OXCT3RBnJ3SrSHsQm8iuGEQ7Rbs([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentCallNotifications$lambda-8([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$W561JzjDs39CjvJwP8AJx8Qhhqc(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setMessagesNotificationEnabled$lambda-24(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    return-void
.end method

.method public static synthetic lambda$_YjO6dVYYZ6n0RViLeBYVcQOQ8Q(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentMessagesNotifications$lambda-10(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$a94oKEr22e9JsNa0A-vvGlv1VxM([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentMessagesNotifications$lambda-12([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$cr2N_G2BtNPF3tqezqqWDr0bTSA(Landroid/util/Pair;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfMissedCalls$lambda-19(Landroid/util/Pair;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$dGMCy0aLPcvgA2_nA5NZ98g2e6k(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setAlarmsNotificationEnabled$lambda-25(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V

    return-void
.end method

.method public static synthetic lambda$ePUgZilne9kxY02iqWUSWbODY_g(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentCallNotifications$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$i-qMZA8SLu3AumXSChla29JeYZ4(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getRealtimeCallEvents$lambda-14(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$nJmRg5EnG-y6qjAEWrMHt5pQA_k(Landroid/util/Pair;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfUnreadSMS$lambda-22(Landroid/util/Pair;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ti-8ncM7jIFA_0oyDR5SVGldIB4(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getCurrentMessagesNotifications$lambda-11(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$unZamR3mbqonm3O1iChY3E4O9WY(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;ZZZZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setNotificationTypesEnabled$lambda-31(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;ZZZZ)V

    return-void
.end method

.method public static synthetic lambda$vRM4tLXSbB7N5RixeNo4YYcvTFQ([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getRealtimeCallEvents$lambda-16([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$vaKfFoH2CNchonBlfKFezZqq_No(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getSMSRealtimeEvent$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;Ljava/lang/Boolean;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$x32AfLmYU3RPpdxVNB9ou0r2AdQ(Landroid/util/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getNumOfMissedCalls$lambda-18(Landroid/util/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$zbV5heF0J6Ke9AcJ6DLfUVu9Wcw(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getRealtimeCallEvents$lambda-15(Landroid/util/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;

    move-result-object p0

    return-object p0
.end method

.method private static final setActivityGoalsNotificationEnabled$lambda-26(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final setAlarmsNotificationEnabled$lambda-25(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final setCallsNotificationEnabled$lambda-23(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 380
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    .line 383
    :cond_0
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedMessageCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 385
    :goto_0
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    return-void
.end method

.method private final setInitialNotificationsStates(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Landroid/content/Context;)V
    .locals 5

    .line 346
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;->isNotificationServiceEnabled(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 347
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    .line 348
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    return-void

    .line 351
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getAreNotificationSupported()Z

    move-result p2

    .line 352
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->mNotificationsEnabledGlobally:Lio/reactivex/subjects/ReplaySubject;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 354
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getAreCallsNotificationEnabled()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-eqz p2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    .line 355
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getAreAlarmsNotificationsEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 357
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getAreMessagesNotificationEnabled()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz p2, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-interface {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    .line 358
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getAreGoalsNotificationEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final setMessagesNotificationEnabled$lambda-24(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 397
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    .line 399
    :cond_0
    iget-object v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedMessageCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 401
    :goto_0
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    return-void
.end method

.method private final setNotificationForAppEnabled(Ljava/lang/String;Landroid/content/Context;Z)V
    .locals 1

    .line 474
    invoke-static {p2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    .line 475
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "com.matrix.powerwatch.APP_NOTIFICATION_ENABLED"

    .line 476
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 477
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private static final setNotificationTypesEnabled$lambda-31(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;ZZZZ)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 497
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedCallsCount()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 498
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {v0, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    .line 501
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->getMissedMessageCount()I

    move-result v1

    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 502
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {p1, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->enableApp(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Z)V

    .line 504
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    .line 505
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/ReplaySubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getActivityGoalsNotification()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 342
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public getAlarmsNotification()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 338
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public getAreAlarmsEnabled()Z
    .locals 1

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->alarmsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/ReplaySubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public getAreCallsEnabled()Z
    .locals 2

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Z

    move-result v0

    return v0
.end method

.method public getAreGoalsEnabled()Z
    .locals 1

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->activityGoalsNotificationSubject:Lio/reactivex/subjects/ReplaySubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/ReplaySubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public getAreMessagesEnabled()Z
    .locals 2

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->notificationTypeController:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;->isAppEnabled(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;)Z

    move-result v0

    return v0
.end method

.method public getCallsNotification()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 330
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callsNotificationSubject:Lio/reactivex/Observable;

    return-object v0
.end method

.method public varargs getCurrentCallNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "callState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callSilentSubject:Lio/reactivex/subjects/PublishSubject;

    .line 264
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$ePUgZilne9kxY02iqWUSWbODY_g;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$ePUgZilne9kxY02iqWUSWbODY_g;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/subjects/PublishSubject;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OSQkOZF7Q6ClyIVLt-p-qF2-GKw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OSQkOZF7Q6ClyIVLt-p-qF2-GKw;

    .line 268
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o;

    .line 269
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 270
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OXCT3RBnJ3SrSHsQm8iuGEQ7Rbs;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OXCT3RBnJ3SrSHsQm8iuGEQ7Rbs;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "callSilentSubject\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<CallEvent, Boolean, Pair<Boolean, CallEvent>> { callEvent, enabled ->\n                            Pair(enabled, callEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { callEvent ->\n                    for (state in callState) {\n                        if (callEvent.callState === state) return@filter true\n                    }\n                    false\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public varargs getCurrentMessagesNotifications([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "smsState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsSilentSubject:Lio/reactivex/subjects/PublishSubject;

    .line 280
    invoke-virtual {v0}, Lio/reactivex/subjects/PublishSubject;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    .line 281
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$_YjO6dVYYZ6n0RViLeBYVcQOQ8Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$_YjO6dVYYZ6n0RViLeBYVcQOQ8Q;

    .line 285
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$ti-8ncM7jIFA_0oyDR5SVGldIB4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$ti-8ncM7jIFA_0oyDR5SVGldIB4;

    .line 286
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 287
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "smsSilentSubject\n                .distinctUntilChanged()\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<MessageEvent, Boolean, Pair<Boolean, MessageEvent>> { smsEvent, enabled ->\n                            Pair(enabled, smsEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { smsEvent ->\n                    for (state in smsState) {\n                        if (smsEvent.smsState === state) return@filter true\n                    }\n                    false\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 33
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getMessagesNotification()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 334
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    return-object v0
.end method

.method public getNotificationsEnabledGlobally()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 368
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->mNotificationsEnabledGlobally:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public getNumOfMissedCalls()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedCallsSubject:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/ObservableSource;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callsNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI;

    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$x32AfLmYU3RPpdxVNB9ou0r2AdQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$x32AfLmYU3RPpdxVNB9ou0r2AdQ;

    .line 316
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$cr2N_G2BtNPF3tqezqqWDr0bTSA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$cr2N_G2BtNPF3tqezqqWDr0bTSA;

    .line 317
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest<Int, Boolean, Pair<Int, Boolean>>(missedCallsSubject, callsNotificationSubject,\n                BiFunction<Int, Boolean, Pair<Int, Boolean>>\n                { numOdMissedCalls, areCallsEnabled -> Pair(numOdMissedCalls, areCallsEnabled) })\n                .filter { integerCallEventPair -> integerCallEventPair.second }\n                .map { integerBooleanPair -> integerBooleanPair.first }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getNumOfUnreadSMS()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->missedSMSSubject:Lio/reactivex/subjects/ReplaySubject;

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 323
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$LotaF-_85C0DXSrWfVTbAkXmn38;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$LotaF-_85C0DXSrWfVTbAkXmn38;

    .line 322
    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$AweHaWaP5PYQ4sf6SwDj0Avo4pc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$AweHaWaP5PYQ4sf6SwDj0Avo4pc;

    .line 325
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$nJmRg5EnG-y6qjAEWrMHt5pQA_k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$nJmRg5EnG-y6qjAEWrMHt5pQA_k;

    .line 326
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest<Int, Boolean, Pair<Int, Boolean>>(missedSMSSubject,\n                messagesNotificationSubject,\n                BiFunction<Int, Boolean, Pair<Int, Boolean>> { first, second -> Pair(first, second) })\n                .filter { integerMessageEventPair -> integerMessageEventPair.second }\n                .map { integerBooleanPair -> integerBooleanPair.first }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public varargs getRealtimeCallEvents([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "callState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callImportantSubject:Lio/reactivex/subjects/PublishSubject;

    .line 298
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->callsNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$6G-iVidEIJuUccfhbK0d_FcOYQo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$6G-iVidEIJuUccfhbK0d_FcOYQo;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/subjects/PublishSubject;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$i-qMZA8SLu3AumXSChla29JeYZ4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$i-qMZA8SLu3AumXSChla29JeYZ4;

    .line 302
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$zbV5heF0J6Ke9AcJ6DLfUVu9Wcw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$zbV5heF0J6Ke9AcJ6DLfUVu9Wcw;

    .line 303
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 304
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "callImportantSubject\n                .withLatestFrom(callsNotificationSubject,\n                        BiFunction<CallEvent, Boolean, Pair<Boolean, CallEvent>> { callEvent, enabled ->\n                            Pair(enabled, callEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { callEvent ->\n                    for (state in callState) {\n                        if (callEvent.callState === state) return@filter true\n                    }\n                    false\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public varargs getSMSRealtimeEvent([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "smsState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->smsImportantSubject:Lio/reactivex/subjects/PublishSubject;

    .line 245
    invoke-virtual {v0}, Lio/reactivex/subjects/PublishSubject;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    .line 246
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->messagesNotificationSubject:Lio/reactivex/Observable;

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vaKfFoH2CNchonBlfKFezZqq_No;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$vaKfFoH2CNchonBlfKFezZqq_No;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$CDT-CVXAzcaaYpFv8vchClQgAFU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$CDT-CVXAzcaaYpFv8vchClQgAFU;

    .line 250
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$3yafTInAPbdBFM1QNjtLQwGf9N0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$3yafTInAPbdBFM1QNjtLQwGf9N0;

    .line 251
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 252
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OPvq8cuLTX6bVYoU0pX_ZhG0u1o;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$OPvq8cuLTX6bVYoU0pX_ZhG0u1o;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "smsImportantSubject\n                .distinctUntilChanged()\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<MessageEvent, Boolean, Pair<Boolean, MessageEvent>> { smsEvent, enabled ->\n                            Pair(enabled, smsEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { smsEvent ->\n                    for (state in smsState) {\n                        if (smsEvent.smsState === state) return@filter true\n                    }\n                    false\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public invalidateNotifications(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedCalls:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 363
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->numOfMissedMessages:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 364
    invoke-static {p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.matrix.powerwatch.CURRENT_NOTIFICATIONS_REQUEST"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

.method public isAppNotificationEnabled(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 0

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "appPackageName"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->isNotificationForAppEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public setActivityGoalsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v2, :cond_0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x5ff

    const/16 v16, 0x0

    move/from16 v13, p1

    .line 420
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    .line 421
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v1

    .line 422
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$0L28i3nB6qjcma1zB6AGIWRL7vk;

    move/from16 v3, p1

    invoke-direct {v2, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$0L28i3nB6qjcma1zB6AGIWRL7vk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "{\n            val updatedDevice = device.copy(activityGoalNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete { activityGoalsNotificationSubject.onNext(isEnabled) }\n        }"

    .line 419
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 423
    :cond_0
    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Device doesn\'t exist"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "error(Throwable(\"Device doesn\'t exist\"))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method

.method public setAlarmsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v2, :cond_0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x3ff

    const/16 v16, 0x0

    move/from16 v14, p1

    .line 410
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    .line 411
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v1

    .line 412
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$dGMCy0aLPcvgA2_nA5NZ98g2e6k;

    move/from16 v3, p1

    invoke-direct {v2, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$dGMCy0aLPcvgA2_nA5NZ98g2e6k;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;Z)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "{\n            val updatedDevice = device.copy(alarmNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete { alarmsNotificationSubject.onNext(isEnabled) }\n        }"

    .line 409
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 413
    :cond_0
    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Device doesn\'t exist"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "error(Throwable(\"Device doesn\'t exist\"))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method

.method public setCallsNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v2, :cond_0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x77f

    const/16 v16, 0x0

    move/from16 v11, p1

    .line 375
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    .line 376
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v1

    .line 377
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$8vHlpSvQkHyBDk6KaS2DSB8oSOM;

    move/from16 v3, p1

    invoke-direct {v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$8vHlpSvQkHyBDk6KaS2DSB8oSOM;-><init>(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "{\n\n            val updatedDevice = device.copy(callNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n                        if (!isEnabled) {\n                            // clear notifications if exists\n                            missedCallsSubject.onNext(0)\n                        } else {\n                            // send current state of call notifications\n                            missedCallsSubject.onNext(missedMessageCount)\n                        }\n                        notificationTypeController.enableApp(NotificationAppType.Calls, isEnabled)\n                    }\n        }"

    .line 373
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 387
    :cond_0
    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Device doesn\'t exist"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "error(Throwable(\"Device doesn\'t exist\"))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method

.method public setMessagesNotificationEnabled(ZLandroid/content/Context;)Lio/reactivex/Completable;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v2, :cond_0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x6ff

    const/16 v16, 0x0

    move/from16 v12, p1

    .line 393
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v1

    .line 394
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v1

    .line 395
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$W561JzjDs39CjvJwP8AJx8Qhhqc;

    move/from16 v3, p1

    invoke-direct {v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$W561JzjDs39CjvJwP8AJx8Qhhqc;-><init>(ZLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "{\n            val updatedDevice = device.copy(messageNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n                        if (!isEnabled) {\n                            missedSMSSubject.onNext(0)\n                        } else {\n                            missedSMSSubject.onNext(missedMessageCount)\n                        }\n                        notificationTypeController.enableApp(NotificationAppType.SMS, isEnabled)\n                    }\n        }"

    .line 392
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 403
    :cond_0
    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "Device doesn\'t exist"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v1

    const-string v2, "error(Throwable(\"Device doesn\'t exist\"))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method

.method public setNotificationTypesEnabled(ZZZZLandroid/content/Context;)Lio/reactivex/Completable;
    .locals 22

    move-object/from16 v6, p0

    const-string v0, "context"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    iget-object v0, v6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz v7, :cond_0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x7f

    const/16 v21, 0x0

    move/from16 v16, p1

    move/from16 v17, p2

    move/from16 v18, p4

    move/from16 v19, p3

    .line 486
    invoke-static/range {v7 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v0

    .line 493
    iget-object v1, v6, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v7

    .line 494
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$unZamR3mbqonm3O1iChY3E4O9WY;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$AlertsManagerImpl$unZamR3mbqonm3O1iChY3E4O9WY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;ZZZZ)V

    invoke-virtual {v7, v8}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "{\n\n            val updatedDevice = device.copy(\n                    callNotification = calls,\n                    messageNotification = messages,\n                    alarmNotification = alarms,\n                    activityGoalNotification = activityGoals\n            )\n\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n\n                        // clear call notifications if exists\n                        missedCallsSubject.onNext(if (calls) missedCallsCount else 0)\n                        notificationTypeController.enableApp(NotificationAppType.Calls, calls)\n\n                        // clear message notifications if exists\n                        missedSMSSubject.onNext(if (messages) missedMessageCount else 0)\n                        notificationTypeController.enableApp(NotificationAppType.SMS, messages)//TODO Provjeriti da li treba messages ovde?\n\n                        alarmsNotificationSubject.onNext(alarms)\n                        activityGoalsNotificationSubject.onNext(activityGoals)\n                    }\n        }"

    .line 484
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 507
    :cond_0
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Device doesn\'t exist"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "error(Throwable(\"Device doesn\'t exist\"))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public setThirdPartAppEnabled(Ljava/lang/String;ZLandroid/content/Context;)V
    .locals 1

    const-string v0, "appPackageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    invoke-direct {p0, p1, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;->setNotificationForAppEnabled(Ljava/lang/String;Landroid/content/Context;Z)V

    return-void
.end method
