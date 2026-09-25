.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->lambda$1VM_h2HCaQdybRhO6-0PGuACfYc(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;

    move-result-object p1

    return-object p1
.end method
