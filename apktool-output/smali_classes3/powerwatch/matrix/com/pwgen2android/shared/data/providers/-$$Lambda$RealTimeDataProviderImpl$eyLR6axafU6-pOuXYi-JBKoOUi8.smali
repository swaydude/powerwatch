.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$eyLR6axafU6-pOuXYi-JBKoOUi8(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    move-result-object p1

    return-object p1
.end method
