.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

.field public final synthetic f$1:Lio/reactivex/Observable;

.field public final synthetic f$2:Lio/reactivex/Observable;

.field public final synthetic f$3:Lio/reactivex/Observable;

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$1:Lio/reactivex/Observable;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$2:Lio/reactivex/Observable;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$3:Lio/reactivex/Observable;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$4:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$1:Lio/reactivex/Observable;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$2:Lio/reactivex/Observable;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$3:Lio/reactivex/Observable;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;->f$4:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$ejwoPofvc-3vncyTTmkotyrClP4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
