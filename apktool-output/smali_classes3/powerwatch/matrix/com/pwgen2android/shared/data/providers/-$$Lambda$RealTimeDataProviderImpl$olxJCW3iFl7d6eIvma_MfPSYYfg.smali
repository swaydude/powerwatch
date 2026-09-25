.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$olxJCW3iFl7d6eIvma_MfPSYYfg(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    move-result-object p1

    return-object p1
.end method
