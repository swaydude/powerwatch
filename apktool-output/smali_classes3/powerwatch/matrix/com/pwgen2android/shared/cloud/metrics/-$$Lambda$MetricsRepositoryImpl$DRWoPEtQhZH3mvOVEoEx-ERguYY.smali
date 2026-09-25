.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$DRWoPEtQhZH3mvOVEoEx-ERguYY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
