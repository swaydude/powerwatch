.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;
.super Ljava/util/TimerTask;
.source "TimerSettingsVM.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->onStartButtonClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1",
        "Ljava/util/TimerTask;",
        "run",
        "",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    .line 92
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$LD6Sn-3rO0g_R8fPciJBqlKfHYw(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->run$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V

    return-void
.end method

.method private static final run$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerStateField()Landroidx/databinding/ObservableField;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "timer_flow: triggered "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 96
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimerValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->setTimerValue(I)V

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->access$updateUI(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimer()Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 100
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->getTimer()Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;->setTimer(Ljava/util/Timer;)V

    .line 102
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 103
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingsVM$onStartButtonClicked$1$1$LD6Sn-3rO0g_R8fPciJBqlKfHYw;

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/-$$Lambda$TimerSettingsVM$onStartButtonClicked$1$1$LD6Sn-3rO0g_R8fPciJBqlKfHYw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
