.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->lambda$uVXtR6y3vvZboY0_PFcuZM6WRXM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;)V

    return-void
.end method
