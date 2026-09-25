.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function3;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;

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

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    invoke-static {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$xTmHo1O7qmyrHZlxQcblswCtPZU(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    move-result-object p1

    return-object p1
.end method
