.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->lambda$py3e_SsB56Qtzj1cO4UMDCQxM84(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
