.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$oHlUOtiRfA1Qv4T8SXAANIRuwjU(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Long;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
