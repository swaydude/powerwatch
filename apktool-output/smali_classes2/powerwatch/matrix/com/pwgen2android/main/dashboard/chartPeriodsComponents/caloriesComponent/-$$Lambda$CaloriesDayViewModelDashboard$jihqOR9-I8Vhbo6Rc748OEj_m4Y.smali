.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/CaloriesDayViewModelDashboard;->lambda$jihqOR9-I8Vhbo6Rc748OEj_m4Y(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
