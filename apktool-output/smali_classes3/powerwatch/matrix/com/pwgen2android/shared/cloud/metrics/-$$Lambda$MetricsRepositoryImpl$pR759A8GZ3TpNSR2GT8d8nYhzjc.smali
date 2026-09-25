.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$pR759A8GZ3TpNSR2GT8d8nYhzjc(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    move-result-object p1

    return-object p1
.end method
