.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$SblnsUdaHp7_biJeKHHDUG1MUZs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;)Lio/reactivex/SingleSource;

    move-result-object v0

    return-object v0
.end method
