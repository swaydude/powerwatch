.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA;->f$1:Landroid/content/Context;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->lambda$jd5nmJGnmwcmKyM9jNTVlNyPIjA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Landroid/content/Context;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;

    move-result-object p1

    return-object p1
.end method
