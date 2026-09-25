.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepPeriodsFormatterViewModelsKt$ImEV7OJH1u0b5H8q67YaqPrsGqQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepPeriodsFormatterViewModelsKt$ImEV7OJH1u0b5H8q67YaqPrsGqQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/-$$Lambda$SleepPeriodsFormatterViewModelsKt$ImEV7OJH1u0b5H8q67YaqPrsGqQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;

    check-cast p1, Ljava/util/List;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepPeriodsFormatterViewModelsKt;->lambda$ImEV7OJH1u0b5H8q67YaqPrsGqQ(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
