.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;
.super Ljava/lang/Object;
.source "TimezoneListener.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
        "timeZoneChangeSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;",
        "kotlin.jvm.PlatformType",
        "timeZoneReceiver",
        "Landroid/content/BroadcastReceiver;",
        "timeZoneChanged",
        "Lio/reactivex/Observable;",
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
.field private final context:Landroid/content/Context;

.field private final timeZoneChangeSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;",
            ">;"
        }
    .end annotation
.end field

.field private final timeZoneReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->context:Landroid/content/Context;

    .line 21
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<ChangeReason>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->timeZoneChangeSubject:Lio/reactivex/subjects/PublishSubject;

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;)V

    check-cast v0, Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->timeZoneReceiver:Landroid/content/BroadcastReceiver;

    .line 39
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.intent.action.TIMEZONE_CHANGED"

    .line 40
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.intent.action.TIME_SET"

    .line 41
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public static final synthetic access$getTimeZoneChangeSubject$p(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 19
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->timeZoneChangeSubject:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->context:Landroid/content/Context;

    return-object v0
.end method

.method public timeZoneChanged()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->timeZoneChangeSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method
