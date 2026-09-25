.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;
.super Ljava/util/TimerTask;
.source "MainDashboardViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->triggerAnimation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
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
        "powerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1",
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
.field final synthetic $toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->$toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    .line 307
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$-kPUEyUTu_Q1cbczQllt3bx3-cM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->run$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    return-void
.end method

.method private static final run$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->access$getTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const/4 v2, 0x4

    rem-int/2addr v0, v2

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->access$setTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;I)V

    .line 314
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->access$getTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "timer_issue: value - "

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 315
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->access$getTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)I

    move-result p0

    if-eqz p0, :cond_4

    if-eq p0, v1, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    if-eq p0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0x7f0c000b

    .line 318
    invoke-static {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const p0, 0x7f0c000a

    .line 317
    invoke-static {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    goto :goto_0

    :cond_4
    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const p0, 0x7f0c0009

    .line 316
    invoke-static {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 309
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "timer_issue: running"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 311
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->access$getMainHandler$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;->$toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$triggerAnimation$1$-kPUEyUTu_Q1cbczQllt3bx3-cM;

    invoke-direct {v3, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$triggerAnimation$1$-kPUEyUTu_Q1cbczQllt3bx3-cM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
