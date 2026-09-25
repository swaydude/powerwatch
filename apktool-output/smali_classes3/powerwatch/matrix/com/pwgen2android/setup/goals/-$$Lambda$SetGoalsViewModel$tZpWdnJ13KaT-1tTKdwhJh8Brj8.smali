.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->lambda$tZpWdnJ13KaT-1tTKdwhJh8Brj8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
