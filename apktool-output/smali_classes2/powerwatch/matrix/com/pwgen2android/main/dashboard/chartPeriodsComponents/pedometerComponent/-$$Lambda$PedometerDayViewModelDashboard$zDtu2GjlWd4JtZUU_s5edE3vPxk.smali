.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/-$$Lambda$PedometerDayViewModelDashboard$zDtu2GjlWd4JtZUU_s5edE3vPxk;

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

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/PedometerDayViewModelDashboard;->lambda$zDtu2GjlWd4JtZUU_s5edE3vPxk(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
