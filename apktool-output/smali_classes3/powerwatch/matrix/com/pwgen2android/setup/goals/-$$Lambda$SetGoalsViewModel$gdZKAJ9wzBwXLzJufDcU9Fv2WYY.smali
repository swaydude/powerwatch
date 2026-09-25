.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->lambda$gdZKAJ9wzBwXLzJufDcU9Fv2WYY(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Boolean;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
