.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function3;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$VEl-poj5v2CbICOIRYL07H9_F3c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;

    invoke-static {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->lambda$VEl-poj5v2CbICOIRYL07H9_F3c(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
