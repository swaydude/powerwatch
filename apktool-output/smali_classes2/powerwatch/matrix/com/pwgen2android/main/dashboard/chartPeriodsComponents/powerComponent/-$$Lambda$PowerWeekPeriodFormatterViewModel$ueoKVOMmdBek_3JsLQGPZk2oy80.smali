.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80;

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

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;->lambda$ueoKVOMmdBek_3JsLQGPZk2oy80(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
