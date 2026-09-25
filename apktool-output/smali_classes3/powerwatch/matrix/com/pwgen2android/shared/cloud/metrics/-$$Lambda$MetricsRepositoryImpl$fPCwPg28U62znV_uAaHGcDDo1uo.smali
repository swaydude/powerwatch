.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$fPCwPg28U62znV_uAaHGcDDo1uo(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
