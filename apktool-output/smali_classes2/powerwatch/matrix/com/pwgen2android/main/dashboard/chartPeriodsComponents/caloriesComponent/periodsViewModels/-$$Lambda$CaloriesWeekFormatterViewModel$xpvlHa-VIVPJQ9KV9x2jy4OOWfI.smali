.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesWeekFormatterViewModel;->lambda$xpvlHa-VIVPJQ9KV9x2jy4OOWfI(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
