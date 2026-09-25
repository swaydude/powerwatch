.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

.field public final synthetic f$1:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;->f$1:Ljava/util/Calendar;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems;->f$1:Ljava/util/Calendar;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;->lambda$AS4PxM8v-ruVqARsicK71YcWems(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
