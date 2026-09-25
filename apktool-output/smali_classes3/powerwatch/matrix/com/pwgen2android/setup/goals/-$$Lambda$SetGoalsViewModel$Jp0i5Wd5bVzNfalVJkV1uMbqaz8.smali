.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->lambda$Jp0i5Wd5bVzNfalVJkV1uMbqaz8(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p1

    return-object p1
.end method
