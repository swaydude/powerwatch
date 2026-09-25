.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->lambda$9rP98uG024Jq4tI-CEfUOw8cbVk(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    move-result-object p1

    return-object p1
.end method
