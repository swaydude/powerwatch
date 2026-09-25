.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "TimezoneListener.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;-><init>(Landroid/content/Context;)V
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
        "powerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;

    .line 25
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 29
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->access$getTimeZoneChangeSubject$p(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;)Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 31
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.TIME_SET"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 32
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl$timeZoneReceiver$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;->access$getTimeZoneChangeSubject$p(Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;)Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
